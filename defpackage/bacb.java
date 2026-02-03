package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bacb {
    private static final ArrayList e;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    private final fcsu f;
    private final fcsu g;
    private boolean h;
    private boolean i;
    private boolean j;
    private baca k;
    private static final cqce c = cqce.g("Bugle", "CequintCallerIdManager");
    static final cczv a = cdag.q(166321560, "enable_cequint_permission_check_pre_observer");
    private static final Uri d = Uri.parse("content://com.cequint.ecid/external/lookup/sms");

    static {
        ArrayList arrayList = new ArrayList(5);
        e = arrayList;
        arrayList.add(0, new byte[]{26, 12, -8, -115, 91, -30, 106, -19, 80, -123, -2, -120, -96, -98, -20, 37, 30, -54, 22, -105, 80, -38, 33, -52, 24, -55, -104, -81, 38, -51, 6, 113});
        arrayList.add(1, new byte[]{-54, 47, -82, -12, 9, -17, 76, 121, -8, 76, -40, -105, -65, 26, 21, 15, -16, 94, 84, 116, -74, 74, -54, -51, 5, 126, 30, -104, -58, 31, 92, 69});
        arrayList.add(2, new byte[]{-26, 122, 14, -80, 118, 78, -61, 40, -73, -63, 27, 27, -48, -124, 40, -90, 22, -39, -13, -21, -80, 32, -89, -40, -33, 20, 114, -127, 76, 19, -13, -55});
        arrayList.add(3, new byte[]{26, -70, -94, -124, 12, 97, -106, 9, -111, 94, -111, -107, 61, 41, 60, -112, -20, -76, -119, 29, -64, -79, 35, 88, -104, -21, -26, -44, 9, -27, -114, -99});
        arrayList.add(4, new byte[]{39, -7, 109, -70, -73, 123, 49, -10, -107, 62, 76, -46, -62, -34, -2, 21, -11, -41, -57, -113, 7, 61, -41, 22, 32, 24, -17, 71, 107, 9, 124, 52});
    }

    public bacb(fcsu fcsuVar, fcsu fcsuVar2) {
        this.f = fcsuVar;
        this.g = fcsuVar2;
    }

    private static String c(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        String string = cursor.getString(i);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r10 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r10 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r10 == 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r10 == 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        r3.p("This is SprintPackage Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        r3.p("This is Sprint Support Package Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        r3.p("This is VZWPackage Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        r3.p("This is 2048-signed Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        r3.p("This is 1024-signed Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
    
        defpackage.bacb.c.o("Device does not have the algorithm to hash the signatures.", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        r0 = defpackage.bacb.c.b();
        r0.I("Couldn't find package info");
        r0.A("packageName", r2);
        r0.s(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d(android.content.Context r13) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bacb.d(android.content.Context):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[Catch: SecurityException -> 0x030b, SYNTHETIC, TRY_LEAVE, TryCatch #2 {SecurityException -> 0x030b, blocks: (B:39:0x010c, B:46:0x0144, B:76:0x0229, B:114:0x02ea, B:129:0x030a, B:128:0x0307, B:125:0x0302), top: B:142:0x010c, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.baca a(android.content.Context r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bacb.a(android.content.Context, java.lang.String):baca");
    }

    public final synchronized boolean b(Context context) {
        if (!this.i) {
            this.i = true;
            this.j = d(context);
        }
        return this.j;
    }
}
