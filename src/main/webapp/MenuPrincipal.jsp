<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="model.TblProveedorcl2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://unpkg.com/@tailwindcss/browser@4"></script>
</head>

<body>
	<div class="flex min-h-full flex-col justify-center px-6 py-12 lg:px-8">
		<div class="sm:mx-auto sm:w-full sm:max-w-sm">
			<img class="mx-auto h-50 w-auto"
				src="https://yeeply.com/wp-content/uploads/2024/04/erp-planificacion-recursos-empresariales-produccion-industrial-productividad-mejora-empresa_100456-8252.jpeg"
				alt="Your Company">
			<h1 class="text-[#0088fe] text-3xl/9 text-center font-bold">Solution
				Perú S.A.C</h1>
		</div>

		<div class="bg-gray-100 mt-20">

			<div class="text-center">
				<a
					class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded"
					href="ControladorProveedor?accion=Registrar">Registrar
					proveedor</a>
			</div>

			<div class="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
				<div class="mx-auto max-w-2xl py-16 sm:py-24 lg:max-w-none lg:py-10">
					<table class="text-left w-full border-collapse">
						<!--Border collapse doesn't work on this site yet but it's available in newer tailwind versions -->
						<thead>
							<tr>
								<th
									class="py-4 px-6 bg-grey-lightest font-bold uppercase text-sm text-grey-dark border-b border-grey-light">Codigo</th>
								<th
									class="py-4 px-6 bg-grey-lightest font-bold uppercase text-sm text-grey-dark border-b border-grey-light">Nombre</th>
								<th
									class="py-4 px-6 bg-grey-lightest font-bold uppercase text-sm text-grey-dark border-b border-grey-light">RUC</th>
								<th
									class="py-4 px-6 bg-grey-lightest font-bold uppercase text-sm text-grey-dark border-b border-grey-light">Raz.
									social</th>
								<th
									class="py-4 px-6 bg-grey-lightest font-bold uppercase text-sm text-grey-dark border-b border-grey-light">Email</th>
								<th
									class="py-4 px-6 bg-grey-lightest font-bold uppercase text-sm text-grey-dark border-b border-grey-light">Fecha
									ingreso</th>
								<th
									class="py-4 px-6 bg-grey-lightest font-bold uppercase text-sm text-grey-dark border-b border-grey-light"></th>
								<th
									class="py-4 px-6 bg-grey-lightest font-bold uppercase text-sm text-grey-dark border-b border-grey-light"></th>
							</tr>
						</thead>
						<tbody>

							<%
								List<TblProveedorcl2> listadoproductos = (List<TblProveedorcl2>) request.getAttribute("listado");
								//aplicamos una condicion...
								if (listadoproductos != null) {
									//aplicamos un bucle for..
									for (TblProveedorcl2 prod : listadoproductos) {
							%>

							<tr class="hover:bg-grey-lighter">
								<td class="py-4 px-6 border-b border-grey-light"><%=prod.getIdproveedorcl2()%></td>
								<td class="py-4 px-6 border-b border-grey-light"><%=prod.getNomproveecl2()%></td>
								<td class="py-4 px-6 border-b border-grey-light"><%=prod.getRucproveecl2()%></td>
								<td class="py-4 px-6 border-b border-grey-light"><%=prod.getRsocialproveecl2()%></td>
								<td class="py-4 px-6 border-b border-grey-light"><%=prod.getEmailproveecl2()%></td>
								<td class="py-4 px-6 border-b border-grey-light"><%=prod.getFeingproveecl2()%></td>

								<td class="py-4 px-6 border-b border-grey-light"><a
									class="bg-yellow-500 hover:bg-yellow-700 text-white font-bold py-2 px-4 rounded"
									href="ControladorProveedor?accion=Modificar&cod=<%=prod.getIdproveedorcl2()%>"
									style="text-decoration: none">Actualizar</a></td>

								<td class="py-4 px-6 border-b border-grey-light"><a
									class="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded"
									href="ControladorProveedor?accion=Eliminar&cod=<%=prod.getIdproveedorcl2()%>"
									style="text-decoration: none">Eliminar</a></td>
							</tr>

							<%
								} //fin del bucle for...
							%>
							<%
								} //fin de la condicion....
							%>


						</tbody>
					</table>
				</div>
			</div>

		</div>


		<!-- --------------------------------- -->


	</div>


</body>
</html>