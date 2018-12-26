<#include "/macro/html-lichkin-simple.ftl"/>

<@html js=(serverDatas.chartType!="quantity"&&serverDatas.chartType!="amount"&&serverDatas.chartType!="rate");section>
    <#if section="javascript-links">
		<#if webDebug==true>
    		<@lichkin@jsTag url="/res/js/report/chart/i18n/${locale}" />
		</#if>
    	<@lichkin@jsTag url="/res/js/report/chart/i18n/${locale}-${serverDatas.chartType}-${serverDatas.module}" />
		<@lichkin@jsTag url="/webjars/echarts/echarts" />
    </#if>
	<#if section="body-content">
        <div class="title-back"><img src="${ctx}/res/img/back.png" /></div>
		<div class="title">
			<div class="title-text"></div>
		</div>
        <div class="tabs tabs4">
          <div class="tab-button" id="tabButton_day"></div>
          <div class="tab-button" id="tabButton_week"></div>
          <div class="tab-button" id="tabButton_month"></div>
          <div class="tab-button" id="tabButton_year"></div>
          <div style="clear:both;"></div>
        </div>
        <div class="tab-content fixed" id="tabContent">
          <div id="chart" style="margin-left: 5%;"></div>
        </div>
	</#if>
	<#if section="javascript-contents-before-self-link">
LK.initTitle(serverDatas.moduleName == serverDatas.subModuleName ? [serverDatas.moduleName, ' -> ', serverDatas.sourceName] : [serverDatas.moduleName, ' -> ', serverDatas.sourceName, ' -> ', serverDatas.subModuleName], {}, true);

var $chart = $('#chart');
$chart.height((document.documentElement.clientHeight - 78) * 0.9);
$chart.width(document.documentElement.clientWidth * 0.9);

var chart = echarts.init($chart[0]);

var activeTab = function(key, serverDatas) {
  $('.tab-button').removeClass('focus');
  $('#tabButton_' + key).addClass('focus');

  LK.ajax({
    url : '/GetReportChartData',
    data : {
      module : serverDatas.module,
      subModule : serverDatas.subModule,
      chartType : serverDatas.chartType,
      summaryType : key,
      sourceId : serverDatas.sourceId
    },
    success : function(responseDatas) {
      myChart.setOption(changeChartOption(serverDatas, responseDatas, initChartOption()));
    }
  });
};

$('.tab-button').each(function() {
  var key = $(this).attr('id').split('_')[1];
  $(this).html($.LKGetI18N(key)).click(function() {
    activeTab(key, serverDatas);
  });
});

		<#if serverDatas.chartType=="quantity" || serverDatas.chartType=="amount">
// 初始化图表参数
var initChartOption = function() {
  return {
    tooltip : {
      trigger : 'axis'
    },
    grid : {
      left : '18%'
    },
    legend : {
      data : [
        $.LKGetI18N('yAxisName')
      ]
    },
    xAxis : [
      {
        type : 'category',
        axisLabel : {
          interval : 0,
          rotate : "45"
        },
        data : []
      }
    ],
    yAxis : [
      {
        type : 'value',
        name : $.LKGetI18N('yAxisName'),
        min : 0,
        axisLabel : {
          formatter : '{value}' + $.LKGetI18N('yAxisLabel')
        }
      }
    ],
    series : [
      {
        name : $.LKGetI18N('yAxisName'),
        type : 'line',
        label : {
          normal : {
            show : true
          }
        },
        data : []
      }
    ]
  };
};

// 重置图表参数
var changeChartOption = function (serverDatas, responseDatas, option) {
  var xAxisData = [];
  var series0 = [];
  $(responseDatas).each(function() {
    xAxisData.push(this.summaryDate);
    series0.push(this.occupancyRate);
  });

  option.xAxis[0].data = xAxisData;
  option.series[0].data = series0;
  return option;
};
		<#elseif serverDatas.chartType=="rate">
// 初始化图表参数
var initChartOption = function() {
  var colors = [
      '#5793f3', '#d14a61'
  ];
  return {
    color : colors,
    tooltip : {
      trigger : 'axis'
    },
    grid : {
      left : '18%',
      right : '12%'
    },
    legend : {
      data : [
          $.LKGetI18N('yAxisName1'), $.LKGetI18N('yAxisName2')
      ]
    },
    xAxis : [
      {
        type : 'category',
        axisLabel : {
          interval : 0,
          rotate : "45"
        },
        data : []
      }
    ],
    yAxis : [
        {
          type : 'value',
          name : $.LKGetI18N('yAxisName1'),
          min : 0,
          position : 'left',
          axisLine : {
            lineStyle : {
              color : colors[0]
            }
          }
        }, {
          type : 'value',
          name : $.LKGetI18N('yAxisName2'),
          min : 0,
          position : 'right',
          axisLine : {
            lineStyle : {
              color : colors[1]
            }
          },
          axisLabel : {
            formatter : '{value}' + $.LKGetI18N('yAxisLabel2')
          }
        }
    ],
    series : [
        {
          name : $.LKGetI18N('yAxisName1'),
          type : 'bar',
          label : {
            normal : {
              show : true
            }
          },
          data : []
        }, {
          name : $.LKGetI18N('yAxisName2'),
          type : 'line',
          yAxisIndex : 1,
          label : {
            normal : {
              show : true,
              position : 'top'
            }
          },
          data : []
        }
    ]
  };
};

// 重置图表参数
var changeChartOption = function (serverDatas, responseDatas, option) {
  var xAxisData = [];
  var series0 = [];
  var series1 = [];
  $(responseDatas).each(function() {
    xAxisData.push(this.summaryDate);
    series0.push(this.quantity);
    series1.push(this.occupancyRate);
  });

  option.xAxis[0].data = xAxisData;
  option.series[0].data = series0;
  option.series[1].data = series1;
  return option;
};
		</#if>
	</#if>
	<#if section="javascript-contents-after-links">
// 初始化图表控件
chart.setOption(initChartOption());
// 激活日图表
activeTab('day', serverDatas);
	</#if>
</@html>
