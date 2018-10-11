<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="well well-large">
        <div>
            <form action="addCustomerInfo.htm" method="post">
                <div>
                    <strong>ааАбаА:  </strong><input type="text" name="date" id="datepicker"
                                                       style="width: 85px" placeholder="ааАбаА" required />

                    <strong>ааОаКбаПаАбаЕаЛб:  </strong>
                    <select name="customer" style="width: 125px" required>
                        <option></option>
                        <c:forEach items="${customer}" var="customer">
                            <option><c:out value="${customer.customer}"/></option>
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
                        <c:set var="count" value="1" scope="page" />
                        <c:forEach begin="1" end="${rowAmount}" step="1">
                            <tr>
                                <td>
                                    <input type="text" name="product${count}" placeholder="абаОаДбаКб" required />
                                </td>
                                <td>
                                    <input type="text" name="amount${count}" placeholder="ааОаЛ-аВаО" required pattern="^[ 0-9]+$" />
                                </td>
                                <td>
                                    <input type="text" name="price${count}" placeholder="аІаЕаНаА" required pattern="\d+(\.\d{2})?" />
                                </td>
                                <td>
                                    <input type="text" name="amountToBePaid${count}" placeholder="абаОаГ" required pattern="\d+(\.\d{2})?"/>
                                </td>
                            </tr>
                            <c:set var="count" value="${count + 1}" scope="page"  />

                        </c:forEach>
                        </tbody>
                    </table>

                </div>

                <input class="btn btn-success" type="submit" name="" value="аЁаДаЕаЛаАбб аПаОаКбаПаКб" />
            </form>
        </div>
        <form action="customer.htm" method="post">
            <input class="btn btn-success" type="submit" name="" value="ааОаБаАаВаИбб бббаОаКб" />
            <input type="hidden" name="addRow"  value="${rowAmount+1}">
            <input type="hidden" name="total"  value="${count}">
        </form>
    </div>
</div>