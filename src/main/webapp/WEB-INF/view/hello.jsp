<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Warehouse App</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <!-- Bootstrap -->
    <link href="http://localhost:8080/WebShop/css//bootstrap.css" rel="stylesheet">
    <link href="http://localhost:8080/WebShop/css//bootstrap-responsive.css" rel="stylesheet">
    <link href="http://localhost:8080/WebShop/css//style-for-text.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="http://localhost:8080/WebShop/js/bootstrap.js"></script>
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
    <link rel="stylesheet" href="/resources/demos/style.css" />
    <script>
        $(function() {
            $("#datepicker").datepicker({
                changeMonth: true,
                changeYear: true,
                dateFormat: "yy-mm-dd"
            });
        });
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="navbar nav-header">
                <div class="navbar-inner">
                    <div class="container-fluid">
                        <a data-target="navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a> <a href="#" class="brand"><img src=""/></a>
                        <div class="nav-collapse collapse navbar-responsive-collapse">
                            <ul class="nav">
                                <li class="active">
                                    <a href="helloPage.htm">ааЛаАаВаНаАб</a>
                                </li>
                                <li class="dropdown">
                                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">аЃбаЕб<strong class="caret"></strong></a>
                                    <ul class="dropdown-menu">
                                        <li class="nav-header">
                                            аЃбаЕб аПаОбббаПаЛаЕаНаИаЙ баОаВаАбаОаВ аНаА баКаЛаАаДб
                                        </li>
                                        <li>
                                            <a href="incoming.htm">ааОаКбаМаЕаНб ТЋабаИбаОаДТЛ</a>
                                        </li>
                                        <li class="divider">
                                        </li>
                                        <li class="nav-header">
                                            аЃбаЕб баЕаАаЛаИаЗаАбаИаИ баОаВаАбаОаВ баО баКаЛаАаДаА
                                        </li>
                                        <li>
                                            <a href="expense.htm">ааОаКбаМаЕаНб ТЋа аАббаОаДТЛ</a>
                                        </li>
                                        <li class="divider">
                                        </li>
                                        <li class="nav-header">
                                            аббаЕб аПаО аОббаАбаКаАаМ аНаА баКаЛаАаДаАб
                                        </li>
                                        <li>
                                            <a href="remainder.htm">а аВаИаДаЕ аКбаОбб-баАаБаЛаИбб</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="">
                                    <a href="shipper.htm">ааОббаАаВбаИаКаАаМ</a>
                                </li>
                                <li class="">
                                    <a href="customer.htm">ааОаКбаПаАбаЕаЛбаМ</a>
                                </li>
                            </ul>
                            <form class="navbar-form pull-right" >
                                <input type="text" class="span8"/>
                                <button type="submit" class="btn btn-success">ааОаИбаК</button>
                            </form>
                        </div>

                    </div>
                </div>

            </div>
        </div>
    </div>
    <div class="row-fluid">


    </div>
</div>
<div class="container">
    <div class="well well-large">
        <h3 class="help-block">аЂаЕббаОаВаОаЕ аЗаАаДаАаНаИаЕ:</h3>
        <blockquote>
            <em>абаПаОаЛбаЗбб Java аИ аЁаЃаа Oracle, баОаЗаДаАбб web-аПбаИаЛаОаЖаЕаНаИаЕ аОаБаЕбаПаЕбаИаВаАббаЕаЕ баЛаЕаДбббаИаЙ ббаНаКбаИаОаНаАаЛ:</em>
        </blockquote>
        <ol class="">
            <li>аЃбаЕб аПаОбббаПаЛаЕаНаИаЙ баОаВаАбаОаВ аНаА баКаЛаАаДб. ааОаКбаМаЕаНб ТЋабаИбаОаДТЛ.</li>
            <ul>
                <li>а аЕаКаВаИаЗаИбб баАаПаКаИ: ааАбаА, ааОббаАаВбаИаК, аЁаКаЛаАаД (аНаА аКаОбаОббаЙ аПбаИбаОаДбаЕббб баОаВаАб).</li>
                <li>а аЕаКаВаИаЗаИбб бббаОаК: аЂаОаВаАб, ааОаЛаИбаЕббаВаО, аІаЕаНаА, аЁбаМаМаА (баАббаЕбаНаАб)</li>
            </ul>

            <li>аЃбаЕб баЕаАаЛаИаЗаАбаИаИ баОаВаАбаОаВ баО баКаЛаАаДаА. ааОаКбаМаЕаНб ТЋа аАббаОаДТЛ. </li>
            <ul>
                <li>а аЕаКаВаИаЗаИбб баАаПаКаИ: ааАбаА, ааОаКбаПаАбаЕаЛб, аЁаКаЛаАаД (б аКаОбаОбаОаГаО аПбаОаДаАаЕббб баОаВаАб).</li>
                <li>а аЕаКаВаИаЗаИбб бббаОаК: аЂаОаВаАб, ааОаЛаИбаЕббаВаО, аІаЕаНаА (баАббаЕбаНаАб), аЁбаМаМаА (баАббаЕбаНаАб)</li>
                <li class="text-error">ааааа!: аІаЕаНаА баПаИбаАаНаИб аДаОаЛаЖаНаА баАбббаИббаВаАбббб аПбаИ баОббаАаНаЕаНаИаИ аДаОаКбаМаЕаНбаА аПаО аМаЕбаОаДб ббаЕаДаНаЕаВаЗаВаЕбаЕаНаНаОаЙ (аІаЕаНаА = ааБбаАб ббаМаМаА аОббаАбаКаА аНаА баКаЛаАаДаЕ / ааБбаЕаЕ аКаОаЛаИбаЕббаВаО аНаА баКаЛаАаДаЕ)</li>
            </ul>

            <li>аббаЕб аПаО аОббаАбаКаАаМ аНаА баКаЛаАаДаАб аВ аВаИаДаЕ аКбаОбб-баАаБаЛаИбб</li>
            <table class="table table-bordered" border="3">
                <thead>
                <tr>
                    <th></th>
                    <th>аЁаКаЛаАаД1</th>
                    <th>аЁаКаЛаАаД2</th>
                    <th>аЁаКаЛаАаД3</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th>ааАбаАаНаДаАб</th>
                    <td>100,00 аГбаН<br>
                        50 бб.
                    </td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <th>ааЛаОаКаНаОб</th>
                    <td></td>
                    <td></td>
                    <td>500,00 аГбаН<br>
                        20 бб.
                    </td>
                </tr>
                <tr>
                    <th>...</th>
                    <td>...</td>
                    <td>...</td>
                    <td>...</td>
                </tr>
                <tr>
                    <th>аЏаБаЛаОаКаО</th>
                    <td>120,00 аГбаН<br>
                        30 аКаГ
                    </td>
                    <td>200,00 аГбаН<br>
                        30 аКаГ
                    </td>
                    <td></td>
                </tr>
                </tbody>
            </table>

        </ol>
    </div>
</div>