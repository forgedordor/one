package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsc {
    public static Bitmap a(bbm bbmVar) {
        int iA = bbmVar.a();
        if (iA == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bbmVar.c(), bbmVar.b(), Bitmap.Config.ARGB_8888);
            bbmVar.f()[0].c().rewind();
            ImageProcessingUtil.a(bitmapCreateBitmap, bbmVar.f()[0].c(), bbmVar.f()[0].b());
            return bitmapCreateBitmap;
        }
        if (iA == 35) {
            int i = ImageProcessingUtil.a;
            if (bbmVar.a() != 35) {
                throw new IllegalArgumentException("Input image format must be YUV_420_888");
            }
            int iC = bbmVar.c();
            int iB = bbmVar.b();
            int iB2 = bbmVar.f()[0].b();
            int iB3 = bbmVar.f()[1].b();
            int iB4 = bbmVar.f()[2].b();
            int iA2 = bbmVar.f()[0].a();
            int iA3 = bbmVar.f()[1].a();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bbmVar.c(), bbmVar.b(), Bitmap.Config.ARGB_8888);
            if (ImageProcessingUtil.nativeConvertAndroid420ToBitmap(bbmVar.f()[0].c(), iB2, bbmVar.f()[1].c(), iB3, bbmVar.f()[2].c(), iB4, iA2, iA3, bitmapCreateBitmap2, bitmapCreateBitmap2.getRowBytes(), iC, iB) == 0) {
                return bitmapCreateBitmap2;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        if (iA != 256 && iA != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + bbmVar.a() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!d(bbmVar.a())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + bbmVar.a());
        }
        ByteBuffer byteBufferC = bbmVar.f()[0].c();
        int iCapacity = byteBufferC.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Rational b(int i, Rational rational) {
        if (i != 90 && i != 270) {
            return new Rational(rational.getNumerator(), rational.getDenominator());
        }
        if (rational == null) {
            return null;
        }
        return new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean c(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean d(int i) {
        return i == 256 || i == 4101;
    }

    public static boolean e(int i) {
        return i == 32;
    }
}
