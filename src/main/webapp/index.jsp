<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
				class=" text-center text-2xl/9 font-bold tracking-tight text-gray-900 mb-5">Acceda
				a su cuenta</h2>
			<form class="space-y-6" method="post" action="ControladorLogeo">
				<div>
					<label for="usuario"
						class="block text-sm/6 font-medium text-gray-900">Usuario</label>
					<div class="mt-2">
						<input type="text" name="usuario" id="usuario" autocomplete="usuario"
							required
							class="block w-full rounded-md bg-white px-3 py-1.5 text-base text-gray-900 outline-1 -outline-offset-1 outline-gray-300 placeholder:text-gray-400 focus:outline-2 focus:-outline-offset-2 focus:outline-blue-500 sm:text-sm/6">
					</div>
				</div>

				<div>
					<div class="flex items-center justify-between">
						<label for="password"
							class="block text-sm/6 font-medium text-gray-900">Contraseña</label>
						<div class="text-sm">
							<a href="#"
								class="font-semibold text-blue-500 hover:text-sky-500">¿Olvido
								su contraseña?</a>
						</div>
					</div>
					<div class="mt-2">
						<input type="password" name="password" id="password"
							autocomplete="current-password" required
							class="block w-full rounded-md bg-white px-3 py-1.5 text-base text-gray-900 outline-1 -outline-offset-1 outline-gray-300 placeholder:text-gray-400 focus:outline-2 focus:-outline-offset-2 focus:outline-blue-500 sm:text-sm/6">
					</div>
				</div>

				<div>
					<button type="submit"
						class="flex w-full justify-center rounded-md bg-blue-500 px-3 py-1.5 text-sm/6 font-semibold text-white shadow-xs hover:bg-sky-500 focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-blue-500">Iniciar
						sesión</button>
				</div>
			</form>

			<p class="mt-10 text-center text-sm/6 text-gray-500">
				¿No tienes una cuenta? <a href="#"
					class="font-semibold text-blue-500 hover:text-sky-500">Regístrate</a>
			</p>
		</div>
	</div>
</body>
</html>
