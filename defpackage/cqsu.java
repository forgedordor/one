package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqsu {
    public static final /* synthetic */ int g = 0;
    private final Context k;
    private final eygg l;
    private final cpeo m;
    private static final ekrg h = ekrg.c("com/google/android/apps/messaging/shared/util/image/ImageUtils");
    private static final byte[] i = "GIF87a".getBytes(Charset.forName("US-ASCII"));
    private static final byte[] j = "GIF89a".getBytes(Charset.forName("US-ASCII"));
    static final cczi a = cdag.f(cdag.b, "ditto_image_gif_size_limit", 5242880);
    static final cczi b = cdag.e(cdag.b, "ditto_image_jpeg_width_limit", 600);
    static final cczi c = cdag.e(cdag.b, "ditto_image_jpeg_height_limit", 600);
    static final cczi d = cdag.f(cdag.b, "ditto_image_static_size_limit", 153600);
    static final cczi e = cdag.e(cdag.b, "ditto_image_png_height_limit", 600);
    static final cczi f = cdag.e(cdag.b, "ditto_image_png_width_limit", 600);

    public cqsu(Context context, cpeo cpeoVar, eygg eyggVar) {
        this.k = context;
        this.m = cpeoVar;
        this.l = eyggVar;
    }

    public static Bitmap c(Bitmap bitmap) {
        return bitmap.copy(bitmap.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmap.getConfig(), false);
    }

    public static Bitmap e(Bitmap bitmap, int i2, int i3) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f2 = i3;
        float f3 = i2;
        float fMax = Math.max(f3 / width, f2 / height);
        float f4 = width * fMax;
        float f5 = fMax * height;
        float f6 = (f3 - f4) / 2.0f;
        float f7 = (f2 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, bitmap.getConfig());
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return bitmapCreateBitmap;
    }

    public static Drawable h(Context context, int i2, int i3) {
        Drawable drawable = context.getDrawable(i2);
        drawable.getClass();
        return i(context, drawable, i3);
    }

    public static Drawable i(Context context, Drawable drawable, int i2) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        Drawable drawableMutate = constantState != null ? constantState.newDrawable(context.getResources()).mutate() : null;
        if (drawableMutate != null || (drawableMutate = drawable.mutate()) != null) {
            drawable = drawableMutate;
        }
        drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        return drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(java.io.InputStream r4) throws java.io.IOException {
        /*
            r0 = 0
            if (r4 == 0) goto L2b
            r1 = 6
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            int r3 = r4.read(r2, r0, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            if (r3 != r1) goto L1f
            byte[] r1 = defpackage.cqsu.i     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            boolean r1 = java.util.Arrays.equals(r2, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            r3 = 1
            if (r1 != 0) goto L1d
            byte[] r1 = defpackage.cqsu.j     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            boolean r1 = java.util.Arrays.equals(r2, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            if (r1 == 0) goto L28
        L1d:
            r0 = r3
            goto L28
        L1f:
            r4.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L23:
            r0 = move-exception
            r4.close()     // Catch: java.io.IOException -> L27
        L27:
            throw r0
        L28:
            r4.close()     // Catch: java.io.IOException -> L2b
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqsu.k(java.io.InputStream):boolean");
    }

    public static void q(Bitmap bitmap, Canvas canvas, RectF rectF, RectF rectF2, boolean z, int i2, boolean z2) {
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (z) {
            paint.setColor(i2);
            if (z2) {
                canvas.drawCircle(rectF2.centerX(), rectF2.centerX(), rectF2.width() / 2.0f, paint);
            } else {
                canvas.drawColor(i2);
            }
        }
        paint.setShader(bitmapShader);
        if (z2) {
            canvas.drawCircle(rectF2.centerX(), rectF2.centerX(), rectF2.width() / 2.0f, paint);
        } else {
            canvas.drawBitmap(bitmap, matrix, paint);
        }
        paint.setShader(null);
    }

    private static boolean r(String str) {
        return le.o(str) || le.k(str);
    }

    public final int a(InputStream inputStream) throws IOException {
        int iC = 0;
        if (inputStream == null) {
            return 0;
        }
        try {
            try {
                iC = new lru(inputStream).c("Orientation", 0);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    ekrw ekrwVarI = h.i();
                    ekrwVarI.X(eksq.a, "BugleImage");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e2)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", (char) 314, "ImageUtils.java")).q("getOrientation error closing input stream");
                }
            } catch (IOException | ArrayIndexOutOfBoundsException | NegativeArraySizeException | NullPointerException unused) {
                ekrw ekrwVarE = h.e();
                ekrwVarE.X(eksq.a, "BugleImage");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", 309, "ImageUtils.java")).q("ImageUtils: Failed to get image orientation, returning undefined.");
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    ekrw ekrwVarI2 = h.i();
                    ekrwVarI2.X(eksq.a, "BugleImage");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e3)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", (char) 314, "ImageUtils.java")).q("getOrientation error closing input stream");
                }
            }
            return iC;
        } finally {
        }
    }

    public final int b(Uri uri, String str) {
        if (str == null) {
            return 0;
        }
        try {
            if (r(str)) {
                return a(this.k.getContentResolver().openInputStream(uri));
            }
            return 0;
        } catch (FileNotFoundException e2) {
            ekrw ekrwVarI = h.i();
            ekrwVarI.X(eksq.a, "BugleImage");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarI).g(e2);
            ekrdVar.X(cqnc.ab, uri);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", 289, "ImageUtils.java")).q("getOrientation couldn't open uri.");
            return 0;
        }
    }

    public final Bitmap d(Uri uri, int i2, int i3) {
        cqwg cqwgVar = new cqwg(this.k);
        try {
            cqwgVar.c(uri);
            Bitmap bitmapA = cqwgVar.a(0L);
            if (bitmapA == null) {
                bitmapA = null;
            } else {
                int width = bitmapA.getWidth();
                int height = bitmapA.getHeight();
                if (i3 <= 0) {
                    i3 = 250;
                }
                if (i2 <= 0) {
                    i2 = 250;
                }
                if (width > i2 || height > i3) {
                    int iMin = Math.min(width, i2);
                    int iMin2 = Math.min(height, i3);
                    float width2 = bitmapA.getWidth();
                    float height2 = bitmapA.getHeight();
                    float fMax = Math.max(iMin / width2, iMin2 / height2);
                    float f2 = width2 * fMax;
                    float f3 = fMax * height2;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) f2, (int) f3, bitmapA.getConfig());
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapA, (Rect) null, new RectF(0.0f, 0.0f, f2, f3), (Paint) null);
                    if (bitmapCreateBitmap != null) {
                        bitmapA.recycle();
                        bitmapA = bitmapCreateBitmap;
                    }
                }
            }
            return bitmapA;
        } finally {
            cqwgVar.b();
        }
    }

    public final Rect f(byte[] bArr) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            return new Rect(0, 0, options.outWidth, options.outHeight);
        } catch (OutOfMemoryError e2) {
            ekrw ekrwVarJ = h.j();
            ekrwVarJ.X(eksq.a, "BugleImage");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "decodeImageBounds", (char) 649, "ImageUtils.java")).q("Failed to decode image bounds.");
            return new Rect(0, 0, -1, -1);
        }
    }

    public final Rect g(Uri uri, String str) {
        if (uri == null) {
            cqaz.c("Couldn't open input stream for null uri");
        } else {
            try {
                InputStream inputStreamOpenInputStream = this.k.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (str != null && r(str) && b(uri, str) >= 5) {
                            return new Rect(0, 0, options.outHeight, options.outWidth);
                        }
                        Rect rect = new Rect(0, 0, options.outWidth, options.outHeight);
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                        }
                        return rect;
                    } finally {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            } catch (FileNotFoundException | SecurityException e2) {
                ekrw ekrwVarI = h.i();
                ekrwVarI.X(eksq.a, "BugleImage");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarI).g(e2);
                ekrdVar.X(cqnc.ab, uri);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "decodeImageBounds", 686, "ImageUtils.java")).q("Couldn't open input stream.");
            }
        }
        return new Rect(0, 0, -1, -1);
    }

    public final cqss j(String str, Uri uri, Uri uri2) {
        if (!l(str, uri)) {
            return le.o(str) ? new cqss(new cqst(((Integer) b.e()).intValue(), ((Integer) c.e()).intValue(), ((Long) d.e()).longValue()), uri, Bitmap.CompressFormat.JPEG) : new cqss(new cqst(((Integer) f.e()).intValue(), ((Integer) e.e()).intValue(), ((Long) d.e()).longValue()), uri, Bitmap.CompressFormat.PNG);
        }
        cqst cqstVar = new cqst(-1, -1, ((Long) a.e()).longValue());
        if (uri2 == null || !cqmz.o(uri2)) {
            uri2 = null;
        }
        return new cqss(cqstVar, uri2, null);
    }

    public final boolean l(String str, Uri uri) {
        if (le.j(str)) {
            return true;
        }
        if (!le.m(str) || uri == null) {
            return false;
        }
        try {
            return k(this.k.getContentResolver().openInputStream(uri));
        } catch (Exception e2) {
            ekrw ekrwVarJ = h.j();
            ekrwVarJ.X(eksq.a, "BugleImage");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "isGif", (char) 332, "ImageUtils.java")).q("Could not open GIF input stream.");
            return false;
        }
    }

    public final byte[] m(Bitmap bitmap, int i2) {
        return n(bitmap, Bitmap.CompressFormat.JPEG, i2);
    }

    final byte[] n(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i2) {
        if (bitmap == null) {
            return null;
        }
        int i3 = 0;
        while (true) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(compressFormat, i2, byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (OutOfMemoryError e2) {
                ekrg ekrgVar = h;
                ekrw ekrwVarJ = ekrgVar.j();
                ekrz ekrzVar = eksq.a;
                ekrwVarJ.X(ekrzVar, "BugleImage");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "bitmapToBytes", 164, "ImageUtils.java")).q("OutOfMemory converting bitmap to bytes.");
                i3++;
                if (i3 > 1) {
                    ekrw ekrwVarJ2 = ekrgVar.j();
                    ekrwVarJ2.X(ekrzVar, "BugleImage");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "bitmapToBytes", 169, "ImageUtils.java")).q("Failed to convert bitmap to bytes. Out of Memory.");
                    throw e2;
                }
                this.m.a(15, 1);
            }
        }
    }

    public final byte[] o(int i2, int i3, int i4, int i5, long j2, Uri uri, String str) {
        cqsr cqsrVar = (cqsr) this.l.b();
        byte[] bArrB = l(str, uri) ? ((cqsp) cqsrVar.d.b()).b(uri, i2, i3, j2) : ((cqsx) cqsrVar.c.b()).b(uri, i4, i5, j2);
        if (bArrB == null) {
            ekrw ekrwVarJ = cqsr.a.j();
            ekrwVarJ.X(eksq.a, "BugleResizing");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/image/ImageResizer", "resize", 71, "ImageResizer.java")).M("Cannot resize image. type: %s, originalWidth: %d, originalHeight: %d, widthLimit: %d, heightLimit: %d, byteLimit: %d, uri: %s.", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j2), cqcy.a(uri));
            return bArrB;
        }
        ekrw ekrwVarH = cqsr.a.h();
        ekrwVarH.X(eksq.a, "BugleResizing");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/image/ImageResizer", "resize", 83, "ImageResizer.java")).N("Resized image. type: %s, originalWidth: %d, originalHeight: %d, widthLimit: %d, heightLimit: %d, byteLimit: %d, bytesLength: %d, uri: %s.", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j2), Integer.valueOf(bArrB.length), cqcy.a(uri));
        return bArrB;
    }

    public final byte[] p(String str, Uri uri, Uri uri2, int i2, int i3) {
        byte[] bArrN;
        cqss cqssVarJ = j(str, uri, uri2);
        cqst cqstVar = cqssVarJ.a;
        Uri uri3 = cqssVarJ.b;
        if (uri3 == null) {
            return null;
        }
        cqsr cqsrVar = (cqsr) this.l.b();
        int i4 = cqstVar.a;
        int i5 = cqstVar.b;
        long j2 = cqstVar.c;
        Bitmap.CompressFormat compressFormat = cqssVarJ.c;
        if (l(str, uri3)) {
            bArrN = ((cqsp) cqsrVar.d.b()).b(uri3, i2, i3, j2);
        } else {
            compressFormat.getClass();
            bArrN = n(((cqsx) cqsrVar.c.b()).a(uri3, i4, i5), compressFormat, ((Integer) cqsr.b.e()).intValue());
        }
        if (bArrN == null) {
            ekrw ekrwVarJ = cqsr.a.j();
            ekrwVarJ.X(eksq.a, "BugleResizing");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/image/ImageResizer", "scale", 131, "ImageResizer.java")).M("Cannot scale image. type: %s, originalWidth: %d, originalHeight: %d, widthLimit: %d, heightLimit: %d, byteLimit: %d, uri: %s.", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j2), cqcy.a(uri3));
            return bArrN;
        }
        ekrw ekrwVarH = cqsr.a.h();
        ekrwVarH.X(eksq.a, "BugleResizing");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/image/ImageResizer", "scale", 143, "ImageResizer.java")).N("Scaled image. type: %s, originalWidth: %d, originalHeight: %d, widthLimit: %d, heightLimit: %d, byteLimit: %d, bytesLength: %d, uri: %s.", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j2), Integer.valueOf(bArrN.length), cqcy.a(uri3));
        return bArrN;
    }
}
