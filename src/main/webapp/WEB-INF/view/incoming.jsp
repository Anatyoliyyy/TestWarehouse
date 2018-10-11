<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="well well-large">
        <h4 class="help-block" >ааОаКбаМаЕаНб ТЋабаИбаОаДТЛ</h4>
    </div>
</div>

<div class="container">
    <div class="well well-large">
        <div>
            <form action="incoming.htm" method="post">
                <div>
                    <strong>ааАбаА:  </strong><input type="text" name="date" id="datepicker" style="width: 85px"
                                                       placeholder="ааАбаА" required/>

                    <strong>ааОббаАаВбаИаК:  </strong>
                    <select name="shipper" style="width: 125px" required>
                        <option></option>
                        <c:forEach items="${shipper}" var="shipper">
                            <option><c:out value="${shipper.shipper}"/></option>
                        </c:forEach>
                    </select>

                    <strong>аЁаКаЛаАаД:  </strong>
                    <select name="warehouse" style="width: 125px" required>
                        <option></option>
                        <c:forEach items="${warehouse}" var="warehouse">
                            <option><c:out value="${warehouse.warehouse}"/></option>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <input class="btn btn-inverse btn-small" type="submit" value="абаОбаМаОббаЕбб ТЋабаИбаОаДТЛ"/>
                </div>
            </form>
        </div>

        <div>
            <table class="table table-bordered" border="3" width="2" cellspacing="2" cellpadding="2" >
                <thead>
                <tr>
                    <th>аЂаОаВаАб</th>
                    <th>ааОаЛаИбаЕббаВаО</th>
                    <th>аІаЕаНаА аЗаА бб.</th>
                    <th>аЁбаМаМаА(баАббаЕбаНаАб)</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${incoming}" var="incoming">
                    <tr>
                        <td><c:out value="${incoming.product}"/></td>
                        <td><c:out value="${incoming.amount}"/></td>
                        <td><c:out value="${incoming.price}"/> аГбаН.</td>
                        <td><c:out value="${incoming.amountToBePaid}"/> аГбаН.</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>

    </div>
</div>