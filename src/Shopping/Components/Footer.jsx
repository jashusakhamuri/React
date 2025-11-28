import React from "react";

const Footer = () => {
  return (
    <div className="FooterSection">
      <div className="FooterContent">
        <div className="Contact">
          <h2>Contact Us</h2>
          <p>📞 +91 98765 43210</p>
          <p>✉️ support@jaswanthstore.com</p>
        </div>

        <div className="Social">
          <h2>Follow Us</h2>
          <p>🌐 Facebook</p>
          <p>📸 Instagram</p>
          <p>🐦 Twitter</p>
        </div>

        <div className="Info">
          <h2>Information</h2>
          <p>ℹ️ About Us</p>
          <p>📜 Terms & Conditions</p>
          <p>🔒 Privacy Policy</p>
        </div>
      </div>

      <div className="CopyRight">
        <p>© 2025 Jaswanth Store. All rights reserved.</p>
      </div>
    </div>
  );
};

export default Footer;
