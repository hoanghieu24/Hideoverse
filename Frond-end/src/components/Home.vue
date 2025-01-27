<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <body>
	<!-- ==========================================
                    Header
    =========================================== -->
    <header class="header">
      <a href="#" class="logo">HOD<span>Building.</span></a>
      <i class="bx bx-menu" id="menu-icon" @click="toggleMenu"></i>
      <nav class="navbar" v-bind:class="{ 'active': isMenuActive }">
        <a href="#home" class="active">Home</a>
        <a href="#about">About</a>
        <a href="#services">Services</a>
        <a href="#portfolio">Portfolio</a>
        <a @click="goToAdminAdd">Contact</a>
        <a @click="goToAdmin">Login</a>
      </nav>
    </header>
    

	<!-- ==========================================
                  Home Section
    =========================================== -->
	<section class="home" id="home">
		<div class="home-content" >
			<h3 style="font-size: 36px;">Chào Mừng bạn </h3>
			<h1 style="font-size: 36px;">HODbuilding</h1>
			<h3 style="font-size: 36px;">Chúng tôi có  <span class="multiple-text"></span></h3>
		</div>

		<div class="home-img">
			<img src="https://www.colliers.com/-/media/images/colliers/asia/regional-image-library/1536x1040-hero-researchnews/generic1536x1040pxkl.ashx?bid=0a1129f133ff4180be8f1e1ccb78c8f5"
				alt="">
		</div>
	</section>

	<!-- ==========================================
                  About Section
    =========================================== -->
	<section class="about" id="about">
		<div class="about-img">
			<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0rvvQPoDCe7xPQDhUEGJ-DKV85gLs0C3nPw&s"
				alt="about" />
		</div>

		<div class="about-content">
			<h2 class="heading">About <span>My Web Building</span></h2>
			<p>
				Chào mừng bạn đến với trang web của chúng tôi! Chúng tôi là một nền tảng trực tuyến chuyên cung cấp dịch
				vụ mua bán nhà ở, với mục tiêu mang đến cho bạn những trải nghiệm tốt nhất trong hành trình tìm kiếm
				ngôi nhà mơ ước.

				Trang web của chúng tôi được thiết kế với giao diện thân thiện, dễ sử dụng, cho phép bạn tìm kiếm và
				duyệt qua các bất động sản một cách nhanh chóng và thuận tiện. Chúng tôi cung cấp thông tin chi tiết về
				từng căn nhà, bao gồm vị trí, diện tích, giá cả và các tiện ích đi kèm, giúp bạn có cái nhìn tổng quan
				và dễ dàng đưa ra quyết định.


			</p>
			<a href="#" class="btn">Read More</a>
		</div>
	</section>

	<!-- ==========================================
                  Services Section
    =========================================== -->
	<section class="services" id="services">
		<h2 class="heading">Our <span>Services</span></h2>

		<div class="services-container">
			<div class="services-box">
				<svg xmlns="http://www.w3.org/2000/svg" width="110" height="110" viewBox="0 0 48 48"><g fill="none"><path fill="url(#fluentColorBuilding480)" d="M9.25 44C8.56 44 8 43.44 8 42.75V8.25A4.25 4.25 0 0 1 12.25 4h15.5A4.25 4.25 0 0 1 32 8.25V19h3.75A4.25 4.25 0 0 1 40 23.25v19.5c0 .69-.56 1.25-1.25 1.25z"/><path fill="url(#fluentColorBuilding481)" d="M34 37.25V44H24l-1-4l1-5h7.75A2.25 2.25 0 0 1 34 37.25"/><path fill="url(#fluentColorBuilding482)" d="M14 37.25V44h10v-9h-7.75A2.25 2.25 0 0 0 14 37.25"/><path fill="url(#fluentColorBuilding483)" d="M18 14a2 2 0 1 1-4 0a2 2 0 0 1 4 0m-2 9a2 2 0 1 0 0-4a2 2 0 0 0 0 4m2 5a2 2 0 1 1-4 0a2 2 0 0 1 4 0m6-12a2 2 0 1 0 0-4a2 2 0 0 0 0 4m2 5a2 2 0 1 1-4 0a2 2 0 0 1 4 0m-2 9a2 2 0 1 0 0-4a2 2 0 0 0 0 4m10-2a2 2 0 1 1-4 0a2 2 0 0 1 4 0"/><defs><linearGradient id="fluentColorBuilding480" x1="8" x2="46.163" y1="5.25" y2="44.336" gradientUnits="userSpaceOnUse"><stop stop-color="#29c3ff"/><stop offset="1" stop-color="#2764e7"/></linearGradient><linearGradient id="fluentColorBuilding481" x1="24.375" x2="31.769" y1="33.571" y2="41.887" gradientUnits="userSpaceOnUse"><stop stop-color="#0067bf"/><stop offset="1" stop-color="#003580"/></linearGradient><linearGradient id="fluentColorBuilding482" x1="14.357" x2="21.258" y1="36.875" y2="44.045" gradientUnits="userSpaceOnUse"><stop stop-color="#0067bf"/><stop offset="1" stop-color="#003580"/></linearGradient><linearGradient id="fluentColorBuilding483" x1="20" x2="26" y1="10" y2="34" gradientUnits="userSpaceOnUse"><stop stop-color="#fdfdfd"/><stop offset="1" stop-color="#b3e0ff"/></linearGradient></defs></g></svg>
				<h3 style="color: rgb(66, 66, 197);">Nguyên Căn</h3>
				<p>
					Chào mừng bạn đến với căn nhà nguyên căn tuyệt vời của chúng tôi! Đây không chỉ là một ngôi nhà; đó là một không gian sống hoàn hảo cho gia đình bạn.
				</p>
				<a href="#" class="btn">Read More</a>
			</div>

			<div class="services-box">
				<svg xmlns="http://www.w3.org/2000/svg" width="110" height="110" viewBox="0 0 15 15"><path fill="currentColor" d="M7.724.053a.5.5 0 0 0-.448 0l-6 3l.448.894L7.5 1.06l5.776 2.888l.448-.894zM14 6h1V5H0v1h1v8H0v1h4V8h5v7h6v-1h-1z"/><path fill="currentColor" d="M8 15V9H5v6z"/></svg>
				<h3>Tầng trệt</h3>
				<p>
					Chào mừng bạn đến với tầng trệt của căn nhà nguyên căn tuyệt đẹp của chúng tôi! Đây là không gian lý tưởng cho cuộc sống hàng ngày của gia đình bạn, kết hợp giữa tiện nghi hiện đại và cảm giác ấm cúng.
				</p>
				<a href="#" class="btn">Read More</a>
			</div>

			<div class="services-box">
				<svg xmlns="http://www.w3.org/2000/svg" width="110" height="110" viewBox="0 0 24 24"><path fill="currentColor" d="M13 6.25a1 1 0 1 1-2 0a1 1 0 0 1 2 0m.032-3.925a1.75 1.75 0 0 0-2.064 0L3.547 7.74c-.978.713-.473 2.26.736 2.26H4.5v5.8A2.75 2.75 0 0 0 3 18.25v1.5c0 .413.336.75.75.75h16.5a.75.75 0 0 0 .75-.75v-1.5a2.75 2.75 0 0 0-1.5-2.45V10h.217c1.21 0 1.713-1.547.736-2.26zm-1.18 1.211a.25.25 0 0 1 .295 0L18.95 8.5H5.05zM18 10v5.5h-2V10zm-3.5 0v5.5h-1.75V10zm-3.25 0v5.5H9.5V10zm-5.5 7h12.5c.69 0 1.25.56 1.25 1.25V19h-15v-.75c0-.69.56-1.25 1.25-1.25M6 15.5V10h2v5.5z"/></svg>
				<h3>Nội Thất</h3>
				<p>
					Chào mừng bạn đến với căn nhà nguyên căn của chúng tôi! Nội thất của căn nhà được thiết kế tỉ mỉ, kết hợp giữa tính tiện dụng và phong cách hiện đại, tạo nên không gian sống hoàn hảo cho gia đình bạn.
				</p>

				<a href="#" class="btn">Read More</a>
			</div>
		</div>
	</section>

	<!-- ==========================================
                  Portfolio Section
    =========================================== -->
	<section class="portfolio" id="portfolio">
		<h2 class="heading">Một số <span>Căn nhà </span> Nổi bật </h2>

		<div class="portfolio-container">
			<div class="portfolio-box">
				<img src="https://static-images.vnncdn.net/files/publish/2022/9/27/nha-2-tang-933.jpg" alt="portfolio" />
				<div class="portfolio-layer">
					<h4>2 Tầng</h4>
					<p>
						Một mẫu nhà 2 tầng đẹp ở nông thôn. 

					</p>
					<a href="https://vietnamnet.vn/6-mau-nha-2-tang-nong-thon-500-trieu-2061851.html"><i class="bx bx-link-external"></i></a>
				</div>
			</div>

			<div class="portfolio-box">
				<img src="https://static-images.vnncdn.net/files/publish/2022/9/27/nha-2-tang-936.jpg" alt="portfolio" />
				<div class="portfolio-layer">
					<h4>Nhà 2 tầng mái Thái </h4>
					<p>
						Nhà 2 tầng mái Thái có kiến trúc đơn giản, dễ thi công. 
					</p>
					<a href="https://vietnamnet.vn/6-mau-nha-2-tang-nong-thon-500-trieu-2061851.html"><i class="bx bx-link-external"></i></a>
				</div>
			</div>

			<div class="portfolio-box">
				<img src="https://static-images.vnncdn.net/files/publish/2022/9/27/nha-2-tang-937.jpg" alt="portfolio" />
				<div class="portfolio-layer">
					<h4>Phần gác lửng</h4>
					<p>
						Phần gác lửng giúp tăng diện tích sử dụng. 
					</p>
					<a href="https://vietnamnet.vn/6-mau-nha-2-tang-nong-thon-500-trieu-2061851.html"><i class="bx bx-link-external"></i></a>
				</div>
			</div>

			<div class="portfolio-box">
				<img src="https://static-images.vnncdn.net/files/publish/2022/9/27/nha-2-tang-938.jpg" alt="portfolio" />
				<div class="portfolio-layer">
					<h4>Nhà 2 tầng 1 tum</h4>
				
					<a href="https://vietnamnet.vn/6-mau-nha-2-tang-nong-thon-500-trieu-2061851.html"><i class="bx bx-link-external"></i></a>
				</div>
			</div>

			<div class="portfolio-box">
				<img src="https://static-images.vnncdn.net/files/publish/2022/9/27/nha-2-tang-chu-l-939.jpg" alt="portfolio" />
				<div class="portfolio-layer">
					<h4>Mẫu nhà 2 tầng hình chữ L</h4>
					<p>
						Nhà 2 tầng chữ L với ban công rộng. 
					</p>
					<a href="https://vietnamnet.vn/6-mau-nha-2-tang-nong-thon-500-trieu-2061851.html"><i class="bx bx-link-external"></i></a>
				</div>
			</div>

			<div class="portfolio-box">
				<img src="https://static-images.vnncdn.net/files/publish/2022/9/27/nha-2-tang-hien-dai-940.jpg" alt="portfolio" />
				<div class="portfolio-layer">
					<h4>Nhà 2 tầng kiểu hiện đại, mái bằng</h4>
					<p>
						Nhà 2 tầng với màu sắc trung tính. 
					</p>
					<a href="https://vietnamnet.vn/6-mau-nha-2-tang-nong-thon-500-trieu-2061851.html"><i class="bx bx-link-external"></i></a>
				</div>
			</div>
		</div>
	</section>

	<!-- ==========================================
                  Contact Section
    =========================================== -->
	<section class="contact" id="contact">
		<h2 class="heading">Contact <span>Me</span></h2>

		<form action="#">
			<div class="input-box">
				<input type="text" placeholder="Full Name" />
				<input type="email" placeholder="Email Address" />
			</div>

			<div class="input-box">
				<input type="number" placeholder="Mobile Number" />
				<input type="text" placeholder="Email Subject" />
			</div>
			<textarea name="" id="" cols="30" rows="10" placeholder="Your Message"></textarea>
			<input type="submit" value="Send Message" class="btn" />
		</form>
	</section>
    <!-- Đăng nhập  -->
<!-- Form Đăng Nhập -->
<div class="login-container" id="login-container">
    <h2 style="text-align: center;">Đăng Nhập</h2>
    <form action="/login" method="POST">
        <div class="input-group">
            <label for="login-username">Tài Khoản</label>
            <input type="text" id="login-username" name="username" placeholder="Nhập tài khoản" required>
        </div>
        <div class="input-group">
            <label for="login-password">Mật Khẩu</label>
            <input type="password" id="login-password" name="password" placeholder="Nhập mật khẩu" required>
        </div>
        <div class="button-group">
            <button type="submit">Đăng Nhập</button>
        </div>
        <div class="link">
            <a href="#">Quên mật khẩu?</a>
            <a href="#" style="margin-left: 150px;" onclick="signup()">Đăng ký ?</a>
        </div>
    </form>
</div>

<!-- Form Đăng Ký -->
<div class="login-container" id="signup-container">
    <h2 style="text-align: center;" >Đăng Ký</h2>
    <form action="/signup" method="POST">
        <div class="input-group">
            <label for="signup-username">Tài Khoản</label>
            <input type="text" id="signup-username" name="username" placeholder="Nhập tài khoản" required>
        </div>
        <div class="input-group">
            <label for="signup-password">Mật Khẩu</label>
            <input type="password" id="signup-password" name="password" placeholder="Nhập mật khẩu" required>
        </div>
        <div class="button-group">
            <button type="submit">Đăng Ký</button>
        </div>
        <div class="link">
            <a href="#">Quên mật khẩu?</a>
            <a href="admin.html" style="margin-left: 150px;" onclick="login()">Đăng nhập ?</a>
        </div>
    </form>
</div>


	<!-- ==========================================
                    Footer
    =========================================== -->
	<footer class="footer">
		<div class="footer-text">
			<p>HODbuilding &copy; 2024 by Hiếu , Oanh , Đỉnh | Building .</p>
		</div>

		<div class="footer-iconTop">
			<a href="#home"><i class="bx bx-up-arrow-alt"></i></a>
		</div>
	</footer>

</body>
</template>

<script>
export default {
  data() {
    return {
      isMenuActive: false
    };
  },
  methods: {
    toggleMenu() {
      this.isMenuActive = !this.isMenuActive;
    },
    goToAdmin() {
      window.location.href = '/admin';  
    },
	goToAdminAdd(){
		window.location.href = '/admin/addMusic';  
	}
  }
};
</script>

<style >

@import '../assets/styles.css'; 
</style>
