package example.zxing;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import net.glxn.qrgen.android.QRCode;

public class QRGenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrgen);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Bitmap myBitmap = QRCode.from("http://a.app.qq.com/o/simple.jsp?pkgname=com.mic.crowdfunding&artden_promo_id=123")
                .withSize(1000, 1000)
                .withHint(EncodeHintType.MARGIN, 0)
                .bitmap();

        imageView.setImageBitmap(myBitmap);

    }


}
