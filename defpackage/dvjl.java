package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjl implements Callable {
    private final String a;
    private final File b;

    public dvjl(Context context, String str) {
        this.a = str;
        this.b = context.getCacheDir();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bitmap call() throws IOException {
        try {
            dvhn.a();
            String str = Long.toString(System.currentTimeMillis(), 16) + Long.toString(System.nanoTime(), 16) + ".jpg";
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.a).openConnection();
            fbec fbecVar = fbec.a;
            httpURLConnection.setConnectTimeout((int) fbecVar.get().a());
            httpURLConnection.setReadTimeout((int) fbecVar.get().b());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            File fileCreateTempFile = File.createTempFile(str, ".jpg", this.b);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileCreateTempFile));
            byte[] bArr = new byte[256];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i < 0) {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                    int i2 = options.outWidth;
                    int i3 = options.outHeight;
                    long jC = fbecVar.get().c();
                    float f = i2;
                    float f2 = jC;
                    int iMax = (int) Math.max(f / f2, i3 / f2);
                    fileInputStream.close();
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = iMax;
                    options2.inJustDecodeBounds = false;
                    FileInputStream fileInputStream2 = new FileInputStream(fileCreateTempFile);
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                    fileInputStream2.close();
                    fileCreateTempFile.delete();
                    return bitmapDecodeStream;
                }
                bufferedOutputStream.write(bArr, 0, i);
            }
        } catch (FileNotFoundException e) {
            dvhv.d("DownloadUtils", "ImageUrl path is no longer valid: ".concat(String.valueOf(this.a)), e);
            throw new RuntimeException(e);
        } catch (MalformedURLException e2) {
            dvhv.d("DownloadUtils", "ImageUrl path is not valid: ".concat(String.valueOf(this.a)), e2);
            throw new RuntimeException(e2);
        } catch (Exception e3) {
            dvhv.d("DownloadUtils", "Exception encountered trying to fetch image.", e3);
            return null;
        }
    }
}
