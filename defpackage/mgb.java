package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgb {
    public static final String a = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + Build.VERSION.SDK_INT;
    public static final byte[] b = new byte[0];
    public static final long[] c = new long[0];
    public static final int[] d;
    private static final Pattern e;
    private static HashMap f;
    private static final String[] g;
    private static final String[] h;
    private static final int[] i;
    private static final int[] j;

    static {
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        e = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        g = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        h = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        i = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        j = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        d = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, BasePaymentResult.ERROR_REQUEST_TIMEOUT, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, BasePaymentResult.ERROR_REQUEST_FAILED, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(int i2) {
        return i2 & 4294967295L;
    }

    public static long B(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static Drawable C(Context context, Resources resources, int i2) {
        return resources.getDrawable(i2, context.getTheme());
    }

    public static AudioFormat D(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static Handler E() {
        Looper looperMyLooper = Looper.myLooper();
        mee.g(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    public static Handler F() {
        return new Handler(G(), null);
    }

    public static Looper G() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static mau H(int i2, int i3, int i4) {
        mat matVar = new mat();
        matVar.c("audio/raw");
        matVar.E = i3;
        matVar.F = i4;
        matVar.G = i2;
        return new mau(matVar);
    }

    public static String I(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String J(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String K(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static String L(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long jAbs = Math.abs(j2) + 500;
        sb.setLength(0);
        String str = j2 < 0 ? "-" : "";
        long j3 = jAbs / 1000;
        long j4 = j3 / 3600;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 % 60;
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j6)).toString();
    }

    public static String M(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            mff.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String N(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return ConversationSuggestion.SUGGESTION_PROPERTY_TEXT;
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String O(int i2) {
        return Integer.toString(i2, 36);
    }

    public static String P(Context context, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                String strJ = J(elec.b(inputStreamOpen));
                T(inputStreamOpen);
                return strJ;
            } catch (Throwable th2) {
                th = th2;
                T(inputStreamOpen);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
    }

    public static String Q(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strC = ejuf.c(str);
        int i2 = 0;
        String str2 = ai(strC, "-")[0];
        if (f == null) {
            f = as();
        }
        String str3 = (String) f.get(str2);
        if (str3 != null) {
            strC = str3.concat(String.valueOf(strC.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = h;
                int length = strArr.length;
                if (i2 >= 18) {
                    break;
                }
                if (strC.startsWith(strArr[i2])) {
                    return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(strC.substring(strArr[i2].length())));
                }
                i2 += 2;
            }
        }
        return strC;
    }

    public static ExecutorService R(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: mfz
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str2 = mgb.a;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService S(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: mga
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str2 = mgb.a;
                return new Thread(runnable, str);
            }
        });
    }

    public static void T(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean U(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r4.J(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean V(defpackage.mfr r3, defpackage.mfr r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.b()
            int r2 = r3.a()
            if (r0 >= r2) goto L1a
            int r0 = r3.a()
            int r0 = r0 + r0
            r4.D(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.a
            int r2 = r3.b
            int r3 = r3.a()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L2d:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r4.b()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L44
            r4.J(r3)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            r1 = 1
            goto L65
        L44:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 != 0) goto L65
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L51
            goto L65
        L51:
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r3 != r0) goto L2d
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r0 = r0 + r0
            r4.D(r0)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            goto L2d
        L60:
            r3 = move-exception
            r5.reset()
            throw r3
        L65:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgb.V(mfr, mfr, java.util.zip.Inflater):boolean");
    }

    public static boolean W(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean X(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -1487656890: goto L46;
                case -1487464693: goto L3c;
                case -1487464690: goto L32;
                case -1487394660: goto L28;
                case -1487018032: goto L1e;
                case -879272239: goto L14;
                case -879258763: goto La;
                default: goto L9;
            }
        L9:
            goto L50
        La:
            java.lang.String r0 = "image/png"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L50
            r3 = r1
            goto L51
        L14:
            java.lang.String r0 = "image/bmp"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L50
            r3 = 2
            goto L51
        L1e:
            java.lang.String r0 = "image/webp"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L50
            r3 = 3
            goto L51
        L28:
            java.lang.String r0 = "image/jpeg"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L50
            r3 = r2
            goto L51
        L32:
            java.lang.String r0 = "image/heif"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L50
            r3 = 4
            goto L51
        L3c:
            java.lang.String r0 = "image/heic"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L50
            r3 = 5
            goto L51
        L46:
            java.lang.String r0 = "image/avif"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L50
            r3 = 6
            goto L51
        L50:
            r3 = -1
        L51:
            switch(r3) {
                case 0: goto L5d;
                case 1: goto L5d;
                case 2: goto L5d;
                case 3: goto L5d;
                case 4: goto L5d;
                case 5: goto L5d;
                case 6: goto L55;
                default: goto L54;
            }
        L54:
            return r1
        L55:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r3 < r0) goto L5c
            return r2
        L5c:
            return r1
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgb.X(java.lang.String):boolean");
    }

    public static boolean Y(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static boolean Z(Context context) {
        if (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 30 && (ejuf.e(Build.MODEL, "moto g(20)") || ejuf.e(Build.MODEL, "rmx3231"))) {
            return true;
        }
        return Build.VERSION.SDK_INT == 34 && ejuf.e(Build.MODEL, "sm-x200");
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static boolean aa(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean ab() {
        String strC = ejuf.c(Build.DEVICE);
        return strC.contains("emulator") || strC.contains("emu64a") || strC.contains("emu64x") || strC.contains("generic");
    }

    public static boolean ac(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean ad(mfr mfrVar, mfr mfrVar2, Inflater inflater) {
        return mfrVar.a() > 0 && mfrVar.d() == 120 && V(mfrVar, mfrVar2, inflater);
    }

    public static boolean ae(mcg mcgVar, boolean z) {
        if (mcgVar == null || !mcgVar.W() || mcgVar.t() == 1 || mcgVar.t() == 4) {
            return true;
        }
        return (!z || mcgVar.u() == 0 || mcgVar.u() == 4) ? false : true;
    }

    public static byte[] af(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static Object[] ag(Object[] objArr, int i2) {
        mee.a(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static String[] ah(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] ai(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] aj(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : ah(str.trim(), "(\\s*,\\s*)");
    }

    public static int ak(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i2 = iBinarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            iBinarySearch = i2;
        }
        return !z ? i2 : iBinarySearch;
    }

    public static int al(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static void am(mcg mcgVar, boolean z) {
        if (ae(mcgVar, z)) {
            aq(mcgVar);
        } else {
            ap(mcgVar);
        }
    }

    public static void an(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void ao(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jE = eolp.e(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = eolp.e(jArr[i2], jE, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jE2 = eolp.e(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = eolp.h(jArr[i2], jE2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = eolp.e(1000000L, eolp.e(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = ar(j4, 1000000L, j3, roundingMode);
                } else {
                    jArr[i3] = eolp.h(1000000L, eolp.e(j4, j2, RoundingMode.UNNECESSARY));
                }
                j3 = j2;
            } else {
                j3 = j2;
            }
            i3++;
            j2 = j3;
        }
    }

    public static void ap(mcg mcgVar) {
        if (mcgVar.m(1)) {
            mcgVar.d();
        }
    }

    public static void aq(mcg mcgVar) {
        int iT = mcgVar.t();
        if (iT == 1) {
            if (mcgVar.m(2)) {
                mcgVar.O();
            }
        } else if (iT == 4 && mcgVar.m(4)) {
            mcgVar.h();
        }
        if (mcgVar.m(1)) {
            mcgVar.e();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long ar(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgb.ar(long, long, long, java.math.RoundingMode):long");
    }

    private static HashMap as() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = g.length;
        HashMap map = new HashMap(length + 88);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = g;
            int length3 = strArr.length;
            if (i2 >= 88) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int b(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static int c(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int d(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int e(int i2, int i3) {
        return (char) (j[i2 ^ (i3 >> 12)] ^ ((char) (i3 << 4)));
    }

    public static int f(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = i[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int g(int i2) {
        if (i2 == 20) {
            return 30;
        }
        if (i2 == 22) {
            return 31;
        }
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i2) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Alert.DURATION_SHOW_INDEFINITELY;
                }
        }
    }

    public static int h(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 == 10) {
            i3 = 737532;
        } else {
            if (i2 == 12) {
                return 743676;
            }
            if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i3 = 67108860;
            i4 = 0;
        }
        return Build.VERSION.SDK_INT >= 32 ? i3 : i4;
    }

    public static int i(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static int j(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int k(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int l(String str) throws NumberFormatException {
        String[] strArrAh;
        int length;
        int i2 = 0;
        if (str == null || (length = (strArrAh = ah(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrAh[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrAh[length + (-2)]);
        try {
            mee.f(str2);
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static int m(Context context) {
        return Z(context) ? 1 : 5;
    }

    public static int n(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int o(int i2, int i3) {
        return j(i2) * i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int p(Uri uri, String str) {
        char c2 = 65535;
        if (str != null) {
            switch (str.hashCode()) {
                case -979127466:
                    if (str.equals("application/x-mpegURL")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -156749520:
                    if (str.equals("application/vnd.ms-sstr+xml")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 64194685:
                    if (str.equals("application/dash+xml")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1154777587:
                    if (str.equals("application/x-rtsp")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                return 2;
            }
            if (c2 != 2) {
                return c2 != 3 ? 4 : 3;
            }
            return 1;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (ejuf.e("rtsp", scheme) || ejuf.e("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String strC = ejuf.c(lastPathSegment.substring(iLastIndexOf + 1));
            switch (strC.hashCode()) {
                case 104579:
                    if (strC.equals("ism")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 108321:
                    if (strC.equals("mpd")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3242057:
                    if (strC.equals("isml")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3299913:
                    if (strC.equals("m3u8")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            int i2 = c2 != 0 ? c2 != 1 ? (c2 == 2 || c2 == 3) ? 1 : 4 : 2 : 0;
            if (i2 != 4) {
                return i2;
            }
        }
        Pattern pattern = e;
        String path = uri.getPath();
        mee.f(path);
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        if (strGroup.contains("format=mpd-time-csf")) {
            return 0;
        }
        return !strGroup.contains("format=m3u8-aapl") ? 1 : 2;
    }

    public static int q(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static int r(long j2, long j3) {
        long jH = eolp.h(j2, 100L);
        return eonc.a((jH == Long.MAX_VALUE || jH == Long.MIN_VALUE) ? j2 / (j3 / 100) : jH / j3);
    }

    public static long s(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long t(long j2, int i2) {
        return z(j2, i2, 1000000L, RoundingMode.UP);
    }

    public static long u(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long v(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static long w(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long x(long j2, int i2) {
        return z(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long y(long j2, long j3, long j4) {
        return z(j2, j3, j4, RoundingMode.DOWN);
    }

    public static long z(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? ar(j2, j3, j4, roundingMode) : eolp.h(j3, eolp.e(j2, j4, RoundingMode.UNNECESSARY)) : eolp.e(j3, eolp.e(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : eolp.h(j2, eolp.e(j3, j4, RoundingMode.UNNECESSARY)) : eolp.e(j2, eolp.e(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
    }
}
