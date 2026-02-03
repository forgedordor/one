package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ron {
    public static final rew a = new rew("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", rec.c, rew.a);
    public static final rew b = new rew("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, rew.a);
    public static final rew c;
    public static final rew d;
    public static final rom e;
    private static final Queue h;
    public final rig f;
    public final List g;
    private final rii i;
    private final DisplayMetrics j;
    private final rox k = rox.a();

    static {
        rok rokVar = rok.b;
        c = new rew("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, rew.a);
        d = new rew("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, rew.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new rol();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = rvk.a;
        h = new ArrayDeque(0);
    }

    public ron(List list, DisplayMetrics displayMetrics, rii riiVar, rig rigVar) {
        this.g = list;
        rvi.f(displayMetrics);
        this.j = displayMetrics;
        rvi.f(riiVar);
        this.i = riiVar;
        rvi.f(rigVar);
        this.f = rigVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap d(defpackage.rpb r9, android.graphics.BitmapFactory.Options r10, defpackage.rom r11, defpackage.rii r12) {
        /*
            java.lang.String r0 = "Downsampler"
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            boolean r2 = r10.inJustDecodeBounds
            if (r2 != 0) goto Le
            r11.b()
            r9.d()
        Le:
            int r2 = r10.outWidth
            int r3 = r10.outHeight
            java.lang.String r4 = r10.outMimeType
            java.util.concurrent.locks.Lock r5 = defpackage.rpm.c
            r5.lock()
            android.graphics.Bitmap r9 = r9.b(r10)     // Catch: java.lang.IllegalArgumentException -> L1e java.lang.Throwable -> L70
            goto L68
        L1e:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = g(r10)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", outHeight: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", outMimeType: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", inBitmap: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L70
            r6.<init>(r1, r5)     // Catch: java.lang.Throwable -> L70
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L58
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r6)     // Catch: java.lang.Throwable -> L70
        L58:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6f
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            r12.d(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            android.graphics.Bitmap r9 = d(r9, r10, r11, r12)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
        L68:
            java.util.concurrent.locks.Lock r10 = defpackage.rpm.c
            r10.unlock()
            return r9
        L6e:
            throw r6     // Catch: java.lang.Throwable -> L70
        L6f:
            throw r6     // Catch: java.lang.Throwable -> L70
        L70:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = defpackage.rpm.c
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ron.d(rpb, android.graphics.BitmapFactory$Options, rom, rii):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        Queue queue = h;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options != null) {
            return options;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        i(options2);
        return options2;
    }

    private static String f(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String str = " (" + bitmap.getAllocationByteCount() + ")";
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str;
    }

    private static String g(BitmapFactory.Options options) {
        return f(options.inBitmap);
    }

    private static void h(BitmapFactory.Options options) {
        i(options);
        Queue queue = h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean j(int i) {
        return i == 90 || i == 270;
    }

    private static boolean k(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] l(rpb rpbVar, BitmapFactory.Options options, rom romVar, rii riiVar) {
        options.inJustDecodeBounds = true;
        d(rpbVar, options, romVar, riiVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x034e A[Catch: all -> 0x04ff, TryCatch #4 {all -> 0x04ff, blocks: (B:95:0x02ee, B:97:0x02fa, B:113:0x0342, B:128:0x03d5, B:131:0x03e0, B:133:0x03e6, B:134:0x03e8, B:136:0x03f0, B:138:0x03f6, B:140:0x03fc, B:142:0x0402, B:144:0x040c, B:146:0x0415, B:145:0x0411, B:147:0x041d, B:148:0x0428, B:150:0x043a, B:118:0x034e, B:120:0x0354, B:121:0x035c, B:123:0x0384, B:98:0x0304, B:101:0x030a, B:103:0x0314, B:109:0x0332, B:111:0x033a, B:108:0x0330, B:112:0x033e, B:105:0x0318, B:107:0x031f), top: B:181:0x02ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0354 A[Catch: all -> 0x04ff, TryCatch #4 {all -> 0x04ff, blocks: (B:95:0x02ee, B:97:0x02fa, B:113:0x0342, B:128:0x03d5, B:131:0x03e0, B:133:0x03e6, B:134:0x03e8, B:136:0x03f0, B:138:0x03f6, B:140:0x03fc, B:142:0x0402, B:144:0x040c, B:146:0x0415, B:145:0x0411, B:147:0x041d, B:148:0x0428, B:150:0x043a, B:118:0x034e, B:120:0x0354, B:121:0x035c, B:123:0x0384, B:98:0x0304, B:101:0x030a, B:103:0x0314, B:109:0x0332, B:111:0x033a, B:108:0x0330, B:112:0x033e, B:105:0x0318, B:107:0x031f), top: B:181:0x02ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0384 A[Catch: all -> 0x04ff, TryCatch #4 {all -> 0x04ff, blocks: (B:95:0x02ee, B:97:0x02fa, B:113:0x0342, B:128:0x03d5, B:131:0x03e0, B:133:0x03e6, B:134:0x03e8, B:136:0x03f0, B:138:0x03f6, B:140:0x03fc, B:142:0x0402, B:144:0x040c, B:146:0x0415, B:145:0x0411, B:147:0x041d, B:148:0x0428, B:150:0x043a, B:118:0x034e, B:120:0x0354, B:121:0x035c, B:123:0x0384, B:98:0x0304, B:101:0x030a, B:103:0x0314, B:109:0x0332, B:111:0x033a, B:108:0x0330, B:112:0x033e, B:105:0x0318, B:107:0x031f), top: B:181:0x02ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03e0 A[Catch: all -> 0x04ff, TryCatch #4 {all -> 0x04ff, blocks: (B:95:0x02ee, B:97:0x02fa, B:113:0x0342, B:128:0x03d5, B:131:0x03e0, B:133:0x03e6, B:134:0x03e8, B:136:0x03f0, B:138:0x03f6, B:140:0x03fc, B:142:0x0402, B:144:0x040c, B:146:0x0415, B:145:0x0411, B:147:0x041d, B:148:0x0428, B:150:0x043a, B:118:0x034e, B:120:0x0354, B:121:0x035c, B:123:0x0384, B:98:0x0304, B:101:0x030a, B:103:0x0314, B:109:0x0332, B:111:0x033a, B:108:0x0330, B:112:0x033e, B:105:0x0318, B:107:0x031f), top: B:181:0x02ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03f0 A[Catch: all -> 0x04ff, TryCatch #4 {all -> 0x04ff, blocks: (B:95:0x02ee, B:97:0x02fa, B:113:0x0342, B:128:0x03d5, B:131:0x03e0, B:133:0x03e6, B:134:0x03e8, B:136:0x03f0, B:138:0x03f6, B:140:0x03fc, B:142:0x0402, B:144:0x040c, B:146:0x0415, B:145:0x0411, B:147:0x041d, B:148:0x0428, B:150:0x043a, B:118:0x034e, B:120:0x0354, B:121:0x035c, B:123:0x0384, B:98:0x0304, B:101:0x030a, B:103:0x0314, B:109:0x0332, B:111:0x033a, B:108:0x0330, B:112:0x033e, B:105:0x0318, B:107:0x031f), top: B:181:0x02ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043a A[Catch: all -> 0x04ff, TRY_LEAVE, TryCatch #4 {all -> 0x04ff, blocks: (B:95:0x02ee, B:97:0x02fa, B:113:0x0342, B:128:0x03d5, B:131:0x03e0, B:133:0x03e6, B:134:0x03e8, B:136:0x03f0, B:138:0x03f6, B:140:0x03fc, B:142:0x0402, B:144:0x040c, B:146:0x0415, B:145:0x0411, B:147:0x041d, B:148:0x0428, B:150:0x043a, B:118:0x034e, B:120:0x0354, B:121:0x035c, B:123:0x0384, B:98:0x0304, B:101:0x030a, B:103:0x0314, B:109:0x0332, B:111:0x033a, B:108:0x0330, B:112:0x033e, B:105:0x0318, B:107:0x031f), top: B:181:0x02ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04cd A[Catch: all -> 0x04eb, TryCatch #3 {all -> 0x04eb, blocks: (B:152:0x0459, B:155:0x04cd, B:157:0x04e2, B:162:0x04f0), top: B:179:0x0459 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[Catch: all -> 0x0505, TryCatch #2 {all -> 0x0505, blocks: (B:8:0x006c, B:15:0x0097, B:16:0x009d, B:22:0x00b1, B:24:0x00bb, B:29:0x00c6, B:34:0x00d1), top: B:177:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6 A[Catch: all -> 0x0505, TryCatch #2 {all -> 0x0505, blocks: (B:8:0x006c, B:15:0x0097, B:16:0x009d, B:22:0x00b1, B:24:0x00bb, B:29:0x00c6, B:34:0x00d1), top: B:177:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02bb A[Catch: all -> 0x0501, TryCatch #0 {all -> 0x0501, blocks: (B:40:0x00f1, B:47:0x0107, B:49:0x0111, B:51:0x0138, B:53:0x0141, B:55:0x014b, B:57:0x0152, B:58:0x0153, B:60:0x0159, B:62:0x0173, B:79:0x01bb, B:81:0x01e7, B:84:0x01f3, B:86:0x01f9, B:83:0x01ec, B:63:0x0176, B:65:0x017a, B:68:0x017f, B:70:0x0185, B:71:0x0192, B:73:0x0196, B:76:0x019b, B:77:0x01a0, B:78:0x01ab, B:52:0x013d, B:89:0x0277, B:90:0x02ba, B:91:0x02bb, B:93:0x02c6), top: B:174:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c6 A[Catch: all -> 0x0501, TRY_LEAVE, TryCatch #0 {all -> 0x0501, blocks: (B:40:0x00f1, B:47:0x0107, B:49:0x0111, B:51:0x0138, B:53:0x0141, B:55:0x014b, B:57:0x0152, B:58:0x0153, B:60:0x0159, B:62:0x0173, B:79:0x01bb, B:81:0x01e7, B:84:0x01f3, B:86:0x01f9, B:83:0x01ec, B:63:0x0176, B:65:0x017a, B:68:0x017f, B:70:0x0185, B:71:0x0192, B:73:0x0196, B:76:0x019b, B:77:0x01a0, B:78:0x01ab, B:52:0x013d, B:89:0x0277, B:90:0x02ba, B:91:0x02bb, B:93:0x02c6), top: B:174:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fa A[Catch: all -> 0x04ff, TryCatch #4 {all -> 0x04ff, blocks: (B:95:0x02ee, B:97:0x02fa, B:113:0x0342, B:128:0x03d5, B:131:0x03e0, B:133:0x03e6, B:134:0x03e8, B:136:0x03f0, B:138:0x03f6, B:140:0x03fc, B:142:0x0402, B:144:0x040c, B:146:0x0415, B:145:0x0411, B:147:0x041d, B:148:0x0428, B:150:0x043a, B:118:0x034e, B:120:0x0354, B:121:0x035c, B:123:0x0384, B:98:0x0304, B:101:0x030a, B:103:0x0314, B:109:0x0332, B:111:0x033a, B:108:0x0330, B:112:0x033e, B:105:0x0318, B:107:0x031f), top: B:181:0x02ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0304 A[Catch: all -> 0x04ff, TRY_LEAVE, TryCatch #4 {all -> 0x04ff, blocks: (B:95:0x02ee, B:97:0x02fa, B:113:0x0342, B:128:0x03d5, B:131:0x03e0, B:133:0x03e6, B:134:0x03e8, B:136:0x03f0, B:138:0x03f6, B:140:0x03fc, B:142:0x0402, B:144:0x040c, B:146:0x0415, B:145:0x0411, B:147:0x041d, B:148:0x0428, B:150:0x043a, B:118:0x034e, B:120:0x0354, B:121:0x035c, B:123:0x0384, B:98:0x0304, B:101:0x030a, B:103:0x0314, B:109:0x0332, B:111:0x033a, B:108:0x0330, B:112:0x033e, B:105:0x0318, B:107:0x031f), top: B:181:0x02ee, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rhy a(defpackage.rpb r41, int r42, int r43, defpackage.rex r44, defpackage.rom r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ron.a(rpb, int, int, rex, rom):rhy");
    }
}
