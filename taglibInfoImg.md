# infoImg #

<p>
<span>从FreeCMS 1.</span><span>5</span><span> 开始支持</span><span></span>
</p>
<p>
<span>根据信息id查询图片集。</span><span></span>
</p>
<table>
<tbody>
<tr>
<td>
<p>
<span>参数</span><span></span>
</p>
</td>
<td>
<p>
<span>说明</span><span></span>
</p>
</td>
</tr>
<tr>
<td>
<p>
<span>infoid</span><span></span>
</p>
</td>
<td>
<p>
<span>信息</span><span>id</span><span></span>
</p>
</td>
</tr>
</tbody>
</table>
<p>
<span></span>
</p>
<table>
<tbody>
<tr>
<td>
<p>
<span>返回值</span><span></span>
</p>
</td>
<td>
<p>
<span>说明</span><span></span>
</p>
</td>
</tr>
<tr>
<td>
<p>
<span>infoImgList</span><span></span>
</p>
</td>
<td>
<p>
<span>信息图片集对象列表</span><span></span>
</p>
</td>
</tr>
</tbody>
</table>
<p>
<span>示例1</span><span></span>
</p>
```
　　<@infoImg infoid='${currInfo.id!""}' ;infoImgList>
　　	<#list infoImgList as infoImg>
　　	<img src="${infoImg.img}" alt="${infoImg.title}" title="${infoImg.title}" width="920">
　　	</#list>
　　</@infoImg>
```
<p>

</p>