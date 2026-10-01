<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
 
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
 <div class="container">
	<h3>Report  Application</h3>
	<frm:form action="/ "  modelAttribute="search" method="get">
		
	<table>
		<tr>
			<td>plan Name:</td>
			<td>
				<frm:select path="planName">
					<frm:option value="">--select--</frm:option>
					<frm:options items="${names}"/>
				</frm:select>
			</td>
			
			<td class="ps-5">plan status:</td>
						<td>
							<frm:select path="planStatus">
								<frm:option value="">--select--</frm:option>
								<frm:options items="${status}"/>
							</frm:select>
						</td>
		</tr>
		<tr>
			<td>gender:</td>
			<td><frm:select path="gender">
				<frm:option value="">select</frm:option>
				<frm:option value="Male">Male</frm:option>
				
				<frm:option value="FeMale">FeMale</frm:option>
				</frm:select>
			</td>
		</tr>
		<tr>
			<td>start date:</td>
			<td><frm:input  path="startDate"  type="date" data-date-format="mm/dd/yyyy"/></td>
			<td class="ps-5">end date:</td>
			<td><frm:input  path="endDate"  type="date" data-date-format="mm/dd/yyyy"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Search"/></td>
		</tr>
	</table>
	</frm:form>
 </div>
	
	 </body>
</html>