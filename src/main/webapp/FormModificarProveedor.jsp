<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

		<div
			class="mt-10 sm:mx-auto sm:w-full sm:max-w-sm  block w-full rounded-md bg-white px-8 py-6 text-base outline-1 -outline-offset-1 outline-gray-300">
			<h2
				class=" text-center text-2xl/9 font-bold tracking-tight text-gray-900 mb-5">Actualizar
				proveedor</h2>
			<form class="space-y-6" action="ControladorProveedor" method="POST">


				<!-- recuperamos los valores que vienen del controlador   -->
				<%
					String idproveedorcl2 = request.getAttribute("idproveedorcl2").toString();

					String emailproveecl2 = (request.getAttribute("emailproveecl2") != null)
							? request.getAttribute("emailproveecl2").toString() : "";
					String feingproveecl2 = (request.getAttribute("feingproveecl2") != null)
							? request.getAttribute("feingproveecl2").toString() : "";
					String nomproveecl2 = (request.getAttribute("nomproveecl2") != null)
							? request.getAttribute("nomproveecl2").toString() : "";
					String rsocialproveecl2 = (request.getAttribute("rsocialproveecl2") != null)
							? request.getAttribute("rsocialproveecl2").toString() : "";
					String rucproveecl2 = (request.getAttribute("rucproveecl2") != null)
							? request.getAttribute("rucproveecl2").toString() : "";
				%>
				<input type="hidden" name="idproveedorcl2"
					value="<%=idproveedorcl2%>">

				<div>
					<label for="nomproveecl2"
						class="block text-sm/6 font-medium text-gray-900">Nombre</label>
					<div class="mt-2">
						<input type="text" name="nomproveecl2" id="nomproveecl2"
							value="<%=nomproveecl2%>" autocomplete="nomproveecl2" required
							class="block w-full rounded-md bg-white px-3 py-1.5 text-base text-gray-900 outline-1 -outline-offset-1 outline-gray-300 placeholder:text-gray-400 focus:outline-2 focus:-outline-offset-2 focus:outline-blue-500 sm:text-sm/6">
					</div>
				</div>

				<div>
					<label for="rsocialproveecl2"
						class="block text-sm/6 font-medium text-gray-900">Razón
						social</label>
					<div class="mt-2">
						<input type="text" name="rsocialproveecl2" id="rsocialproveecl2"
							value="<%=rsocialproveecl2%>" autocomplete="rsocialproveecl2"
							required
							class="block w-full rounded-md bg-white px-3 py-1.5 text-base text-gray-900 outline-1 -outline-offset-1 outline-gray-300 placeholder:text-gray-400 focus:outline-2 focus:-outline-offset-2 focus:outline-blue-500 sm:text-sm/6">
					</div>
				</div>


				<div>
					<label for="rucproveecl2"
						class="block text-sm/6 font-medium text-gray-900">RUC</label>
					<div class="mt-2">
						<input type="number" name="rucproveecl2" id="rucproveecl2"
							value="<%=rucproveecl2%>" autocomplete="rucproveecl2" required
							class="block w-full rounded-md bg-white px-3 py-1.5 text-base text-gray-900 outline-1 -outline-offset-1 outline-gray-300 placeholder:text-gray-400 focus:outline-2 focus:-outline-offset-2 focus:outline-blue-500 sm:text-sm/6">
					</div>
				</div>


				<div>
					<label for="emailproveecl2"
						class="block text-sm/6 font-medium text-gray-900">Email</label>
					<div class="mt-2">
						<input type="email" name="emailproveecl2" id="emailproveecl2"
							value="<%=emailproveecl2%>" autocomplete="emailproveecl2"
							required
							class="block w-full rounded-md bg-white px-3 py-1.5 text-base text-gray-900 outline-1 -outline-offset-1 outline-gray-300 placeholder:text-gray-400 focus:outline-2 focus:-outline-offset-2 focus:outline-blue-500 sm:text-sm/6">
					</div>
				</div>


				<div>
					<label for="feingproveecl2"
						class="block text-sm/6 font-medium text-gray-900">Fecha de
						ingreso</label>
					<div class="mt-2">
						<input type="date" name="feingproveecl2" id="feingproveecl2"
							value="<%=feingproveecl2%>" autocomplete="feingproveecl2"
							required
							class="block w-full rounded-md bg-white px-3 py-1.5 text-base text-gray-900 outline-1 -outline-offset-1 outline-gray-300 placeholder:text-gray-400 focus:outline-2 focus:-outline-offset-2 focus:outline-blue-500 sm:text-sm/6">
					</div>
				</div>


				<div>
					<button type="submit" value="actualizar"
						class="flex w-full justify-center rounded-md bg-blue-500 px-3 py-1.5 text-sm/6 font-semibold text-white shadow-xs hover:bg-sky-500 focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-blue-500">Actualizar</button>
				</div>
			</form>

		</div>
	</div>
</body>
</html>