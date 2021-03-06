<!DOCTYPE html>
<%@page import="MODEL.InformationdDisplayByKhoaModel"%>
<%@page import="DAO.InformationdDisplayByKhoaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="JDBCConnector.CONNDRIVER"%>
<%@page import="java.sql.Connection"%>
<%@page import="MODEL.GiangVienModel"%>
<%@page import="MODEL.KhoaModel"%>
<%@page import="java.util.List"%>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Dashboard</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.html">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</div>
				<div class="sidebar-brand-text mx-3">
					SB Admin <sup>2</sup>
				</div>
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!-- Nav Item - Dashboard -->
			<li class="nav-item active"><a class="nav-link"
				href="index.html"> <i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span></a>
			</li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Interface</div>

			<!-- Nav Item - Pages Collapse Menu -->


			<li class="nav-item"><a class="nav-link"
				href="informationdDisplay"> <i class="fas fa-fw fa-table"></i> <span>Khoa</span></a></li>

			<!-- Nav Item - Utilities Collapse Menu -->
			<li class="nav-item"><a class="nav-link" href="giangvien"> <i
					class="fas fa-fw fa-table"></i> <span>Gi???ng Vi??n</span></a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Addons</div>

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link" href="sinhvien"> <i
					class="fas fa-fw fa-table"></i> <span>Sinh Vi??n</span></a></li>

			<!-- Nav Item - Charts -->
			<li class="nav-item"><a class="nav-link" href="detai"> <i
					class="fas fa-fw fa-table"></i> <span>????? t??i</span></a></li>

			<!-- Nav Item - Tables -->
			<li class="nav-item"><a class="nav-link" href="huongdan"> <i
					class="fas fa-fw fa-table"></i> <span>H?????ng D???n</span></a></li>

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>

					<!-- Topbar Search -->
					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
						<div class="input-group">
							<input type="text" class="form-control bg-light border-0 small"
								placeholder="Search for..." aria-label="Search"
								aria-describedby="basic-addon2">
							<div class="input-group-append">
								<button class="btn btn-primary" type="button">
									<i class="fas fa-search fa-sm"></i>
								</button>
							</div>
						</div>
					</form>

					<!-- Topbar Navbar -->
					<ul class="navbar-nav ml-auto">

						<!-- Nav Item - Search Dropdown (Visible Only XS) -->
						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>

						<!-- Nav Item - Alerts -->
						<li class="nav-item dropdown no-arrow mx-1"><a
							class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <!-- Counter - Alerts -->
								<span class="badge badge-danger badge-counter">3+</span>
						</a> <!-- Dropdown - Alerts -->
							<div
								class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="alertsDropdown">
								<h6 class="dropdown-header">Alerts Center</h6>
								<a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-primary">
											<i class="fas fa-file-alt text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-gray-500">December 12, 2019</div>
										<span class="font-weight-bold">A new monthly report is
											ready to download!</span>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-success">
											<i class="fas fa-donate text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-gray-500">December 7, 2019</div>
										$290.29 has been deposited into your account!
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-warning">
											<i class="fas fa-exclamation-triangle text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-gray-500">December 2, 2019</div>
										Spending Alert: We've noticed unusually high spending for your
										account.
									</div>
								</a> <a class="dropdown-item text-center small text-gray-500"
									href="#">Show All Alerts</a>
							</div></li>

						<!-- Nav Item - Messages -->
						<li class="nav-item dropdown no-arrow mx-1"><a
							class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i>
								<!-- Counter - Messages --> <span
								class="badge badge-danger badge-counter">7</span>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="messagesDropdown">
								<h6 class="dropdown-header">Message Center</h6>
								<a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle" src="img/undraw_profile_1.svg"
											alt="...">
										<div class="status-indicator bg-success"></div>
									</div>
									<div class="font-weight-bold">
										<div class="text-truncate">Hi there! I am wondering if
											you can help me with a problem I've been having.</div>
										<div class="small text-gray-500">Emily Fowler ?? 58m</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle" src="img/undraw_profile_2.svg"
											alt="...">
										<div class="status-indicator"></div>
									</div>
									<div>
										<div class="text-truncate">I have the photos that you
											ordered last month, how would you like them sent to you?</div>
										<div class="small text-gray-500">Jae Chun ?? 1d</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle" src="img/undraw_profile_3.svg"
											alt="...">
										<div class="status-indicator bg-warning"></div>
									</div>
									<div>
										<div class="text-truncate">Last month's report looks
											great, I am very happy with the progress so far, keep up the
											good work!</div>
										<div class="small text-gray-500">Morgan Alvarez ?? 2d</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="...">
										<div class="status-indicator bg-success"></div>
									</div>
									<div>
										<div class="text-truncate">Am I a good boy? The reason I
											ask is because someone told me that people say this to all
											dogs, even if they aren't good...</div>
										<div class="small text-gray-500">Chicken the Dog ?? 2w</div>
									</div>
								</a> <a class="dropdown-item text-center small text-gray-500"
									href="#">Read More Messages</a>
							</div></li>

						<div class="topbar-divider d-none d-sm-block"></div>
						<%

						%>
						<!-- Nav Item - User Information -->
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small"> <%

 %>
							</span> <img class="img-profile rounded-circle"
								src="img/undraw_profile.svg">
						</a> <!-- Dropdown - User Information -->
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="userDropdown">
								<a class="dropdown-item" href="#"> <i
									class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
									Settings
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
									Activity Log
								</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#" data-toggle="modal"
									data-target="#logoutModal"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
									Logout
								</a>
							</div></li>

					</ul>

				</nav>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<div
						class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
						<a href="#"
							class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
							class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>
					</div>
					<!-- Content Row ------------------------------------------------------------------------------------------------------->
					<div id="accordion">
						<div class="card">
							<div class="card-header" id="id">
								<h5 class="mb-0">
									<div class="card">
										<div class="accordion" id="accordionExample">
											<%
											List<KhoaModel> list = (List<KhoaModel>) request.getAttribute("LIST_INFO");
											for (KhoaModel info : list) {
											%>
											<div class="card">
												<div class="card-header"
													id="headingOne<%=info.getMakhoa()%>">
													<h2 class="mb-0">
														<button class="btn btn-link" type="button"
															data-toggle="collapse"
															data-target="#collapseOne<%=info.getMakhoa()%>"
															aria-expanded="true"
															aria-controls="collapseOne<%=info.getMakhoa()%>">
															<%=info.getTenkhoa()%>
														</button>
													</h2>
												</div>

												<div id="collapseOne<%=info.getMakhoa()%>" class="collapse"
													aria-labelledby="headingOne<%=info.getMakhoa()%>"
													data-parent="#accordionExample">
													<div class="card-body">
														<%=info.getTenkhoa()%>
														<%
														Connection conn = new CONNDRIVER().getConnec();
														PreparedStatement ps = null;
														ResultSet rs = null;
														String query = "Select distinct gv.Magv, gv.Hotengv, gv.Luong, gv.Makhoa from tblkhoa k join tblgiangvien gv on gv.Makhoa = k.Makhoa where k.Makhoa="
																+ info.getMakhoa();
														ps = conn.prepareStatement(query);
														rs = ps.executeQuery();
														%>
														<div class="card-body">
															<table class="table">
																<thead>
																	<tr>
																		<th scope="col">M?? GV</th>
																		<th scope="col">T??n Gi???ng Vi??n</th>
																		<th scope="col">L????ng</th>
																		<th scope="col">Chuy???n Gi???ng Vi??n</th>
																		<th><a class="col-xl-4 col-md-6 mb-4"
																			href="addsv">																				
																				<div class="h4 mb-0 font-weight-bold text-gray-600">Th??m
																						Gi???ng Vi??n</div>
																		</a></th>

																	</tr>
																</thead>
																<tbody>
																	<%
																	while (rs.next()) {
																	%>
																	<tr>
																		<th scope="row"><%=rs.getLong(1)%></th>
																		<td><%=rs.getString(2)%></td>
																		<td><%=rs.getDouble(3)%></td>
																		<td>
																			<button type="button" class="btn btn-primary"
																				data-toggle="modal" data-target="#exampleModal"
																				onclick="fillvaluegvbykhoa('<%=rs.getLong(1)%>','<%=rs.getString(2)%>', '<%=rs.getDouble(3)%>', '<%=rs.getLong(4)%>')">
																				Chuy???n</button>
																		</td>
																	</tr>
																	<%
																	}
																	%>
																</tbody>
															</table>
															<br />
														</div>
														<%
														query = "Select distinct sv.Masv, sv.Hotensv, sv.Namsinh, sv.Quequan, sv.Makhoa from tblkhoa k join tblsinhvien sv on sv.Makhoa = k.Makhoa where k.Makhoa="
																+ info.getMakhoa();
														ps = conn.prepareStatement(query);
														rs = ps.executeQuery();
														%>
														<div class="card-body">
															<table class="table">
																<thead>
																	<tr>
																		<th scope="col">M?? SV</th>
																		<th scope="col">H??? T??n SV</th>
																		<th scope="col">N??m Sinh</th>
																		<th scope="col">Qu?? Qu??n</th>
																		<th scope="col">Chuy???n Sinh Vi??n</th>
																		<th><a class="col-xl-4 col-md-6 mb-4"
																			href="addgv">																				
																				<div class="h4 mb-0 font-weight-bold text-gray-600">Th??m
																						Gi???ng Vi??n</div>
																		</a></th>
																	</tr>
																</thead>
																<tbody>
																	<%
																	while (rs.next()) {
																	%>
																	<tr>
																		<th scope="row"><%=rs.getLong(1)%></th>
																		<td><%=rs.getString(2)%></td>
																		<td><%=rs.getDate(3)%></td>
																		<td><%=rs.getString(4)%></td>
																		<td>
																		<td>
																			<button type="button" class="btn btn-primary"
																				data-toggle="modal" data-target="#a"
																				onclick="fillvaluesvbykhoa('<%=rs.getLong(1)%>','<%=rs.getString(2)%>','<%=rs.getDate(3)%>','<%=rs.getString(4)%>','<%=rs.getLong(5)%>')">
																				Chuy???n</button>
																		</td>
																		</td>
																	</tr>
																	<%
																	}
																	%>
																</tbody>
															</table>
															<br />
														</div>
													</div>
												</div>
												<%
												}
												%>
											</div>
										</div>
									</div>

								</h5>

							</div>



						</div>
						<!-- Content Row -->


						<!-- /.Modal Sinh Vien -->
						<div class="modal fade" id="exampleModal" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<form class="modal-content" action="informationdDisplay"
									method="post">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Chuy???n
											Gi???ng Vi??n Sang Khoa Kh??c</h5>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>

									<input value="" type="text" class="form-control"
										aria-describedby="emailHelp" name="magv" id="modalmagv"
										hidden="" readonly="">
									<div class="modal-body">H??? T??n Gi???ng Vi??n</div>
									<input value="" type="text" class="form-control"
										aria-describedby="emailHelp" name="tensv" id="modaltengv">
									<input value="" type="text" class="form-control"
										aria-describedby="emailHelp" name="tensv" id="modalluong"
										hidden="">
									<div class="modal-body">Chuy???n Sang Khoa</div>
									<select class="form-select form-select-lg mb-3"
										id="modalmakhoa" name="makhoa"
										aria-label=".form-select-lg example">
										<%
										List<KhoaModel> k = (List<KhoaModel>) request.getAttribute("LIST_INFO");
										for (KhoaModel hd1 : k) {
										%>
										<option value="<%=hd1.getMakhoa()%>"><%=hd1.getTenkhoa()%></option>
										<%
										}
										%>
									</select>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-dismiss="modal">????ng</button>
										<button type="submit" class="btn btn-primary">L??u</button>
									</div>
								</form>
							</div>
						</div>

						<div class="modal fade" id="a" tabindex="-1" role="dialog"
							aria-labelledby="exampleModalLabel" aria-hidden="true">
							<div class="modal-dialog" role="document">
								<form class="modal-content" action="informationdDisplay"
									method="post">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Chuy???n
											Sinh Vi??n Sang Khoa Kh??c</h5>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>

									<input value="" type="text" class="form-control"
										aria-describedby="emailHelp" name="masv" id="modalmasv"
										hidden="">
									<div class="modal-body">H??? T??n</div>
									<input value="" type="text" class="form-control"
										aria-describedby="emailHelp" name="tensv" id="modalhotensv">
									<input value="" type="text" class="form-control"
										aria-describedby="emailHelp" name="tensv" id="modalnamsinh"
										hidden=""> <input value="" type="text"
										class="form-control" aria-describedby="emailHelp" name="tensv"
										id="modalquequan" hidden="">
									<div class="modal-body">Chuy???n Sang Khoa</div>
									<select class="form-select form-select-lg mb-3"
										id="modalmakhoa2" name="makhoa"
										aria-label=".form-select-lg example">
										<%
										for (KhoaModel hd1 : k) {
										%>
										<option value="<%=hd1.getMakhoa()%>"><%=hd1.getTenkhoa()%></option>
										<%
										}
										%>
									</select>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-dismiss="modal">????ng</button>
										<button type="submit" class="btn btn-primary">L??u</button>
									</div>
								</form>
							</div>
						</div>

					</div>

				</div>
				<!-- End of Content Wrapper -->

			</div>
			<!-- End of Page Wrapper -->

			<!-- Scroll to Top Button-->
			<a class="scroll-to-top rounded" href="#page-top"> <i
				class="fas fa-angle-up"></i>
			</a>

			<!-- Logout Modal-->
			<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Ready to
								Leave?</h5>
							<button class="close" type="button" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">??</span>
							</button>
						</div>
						<div class="modal-body">Select "Logout" below if you are
							ready to end your current session.</div>
						<div class="modal-footer">
							<button class="btn btn-secondary" type="button"
								data-dismiss="modal">Cancel</button>
							<a class="btn btn-primary" href="login.html">Logout</a>
						</div>
					</div>
				</div>
			</div>

			<!-- Bootstrap core JavaScript-->
			<script src="vendor/jquery/jquery.min.js"></script>
			<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

			<!-- Core plugin JavaScript-->
			<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

			<!-- Custom scripts for all pages-->
			<script src="js/sb-admin-2.min.js"></script>

			<!-- Page level plugins -->
			<script src="vendor/chart.js/Chart.min.js"></script>

			<!-- Page level custom scripts -->
			<script src="js/demo/chart-area-demo.js"></script>
			<script src="js/demo/chart-pie-demo.js"></script>
			<script type="text/javascript" src="js/custom.js"></script>
</body>

</html>