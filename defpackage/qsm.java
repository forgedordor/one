package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsm {
    public static final qrs a(hox hoxVar) {
        return (qrs) hoxVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(android.content.Context r13, defpackage.qrz r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsm.b(android.content.Context, qrz, java.lang.String, java.lang.String, java.lang.String, java.lang.String, fcxy):java.lang.Object");
    }

    public static final String c(String str) {
        if (str == null || fdgn.H(str)) {
            return null;
        }
        return (str.length() <= 0 || !fdfv.d(str.charAt(fdgn.u(str)), '/', false)) ? str.concat("/") : str;
    }

    public static final qrs d(qrz qrzVar, hml hmlVar) {
        qrz qrzVar2;
        hmlVar.v(-1248473602);
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj = hmk.a;
        if (objF == obj) {
            objF = new qsk(null);
            hmlVar.y(objF);
        }
        fdau fdauVar = (fdau) objF;
        hmlVar.o();
        Context context = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
        hmlVar.v(5004770);
        boolean zD = hmlVar.D(qrzVar);
        Object objF2 = hmlVar.f();
        if (zD || objF2 == obj) {
            Object hplVar = new hpl(new qrs(), hsi.a);
            hmlVar.y(hplVar);
            objF2 = hplVar;
        }
        hox hoxVar = (hox) objF2;
        hmlVar.o();
        hmlVar.v(-1633490746);
        boolean zD2 = hmlVar.D(qrzVar) | hmlVar.D("__LottieInternalDefaultCacheKey__");
        Object objF3 = hmlVar.f();
        if (zD2 || objF3 == obj) {
            objF3 = e(context, qrzVar, "__LottieInternalDefaultCacheKey__", true);
            hmlVar.y(objF3);
        }
        hmlVar.o();
        hmlVar.v(-1224400529);
        boolean zD3 = hmlVar.D(hoxVar) | hmlVar.F(fdauVar) | hmlVar.F(context) | hmlVar.F(qrzVar) | hmlVar.D(null) | hmlVar.D("fonts/") | hmlVar.D(".ttf") | hmlVar.D("__LottieInternalDefaultCacheKey__");
        Object objF4 = hmlVar.f();
        if (zD3 || objF4 == obj) {
            qrzVar2 = qrzVar;
            Object qslVar = new qsl(fdauVar, context, qrzVar2, hoxVar, null);
            hmlVar.y(qslVar);
            objF4 = qslVar;
        } else {
            qrzVar2 = qrzVar;
        }
        hmlVar.o();
        hob.f(qrzVar2, "__LottieInternalDefaultCacheKey__", (fdat) objF4, hmlVar);
        qrs qrsVarA = a(hoxVar);
        hmlVar.o();
        return qrsVarA;
    }

    private static final qoo e(Context context, qrz qrzVar, final String str, boolean z) {
        if (qrzVar instanceof qrx) {
            return fdbq.f(str, "__LottieInternalDefaultCacheKey__") ? qnu.j(context, ((qrx) qrzVar).a) : qnu.k(context, ((qrx) qrzVar).a, str);
        }
        if (qrzVar instanceof qry) {
            if (fdbq.f(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            throw null;
        }
        if (qrzVar instanceof qrv) {
            if (z) {
                return null;
            }
            throw null;
        }
        if (qrzVar instanceof qrt) {
            return fdbq.f(str, "__LottieInternalDefaultCacheKey__") ? qnu.h(context, ((qrt) qrzVar).a) : qnu.i(context, ((qrt) qrzVar).a, str);
        }
        if (qrzVar instanceof qrw) {
            if (fdbq.f(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((qrw) qrzVar).a.hashCode());
            }
            final String str2 = ((qrw) qrzVar).a;
            Map map = qnu.a;
            return qnu.g(str, new Callable() { // from class: qnp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Map map2 = qnu.a;
                    fffv fffvVar = new fffv(fffk.b(new ByteArrayInputStream(str2.getBytes())));
                    String[] strArr = qwn.a;
                    return qnu.d(new qwo(fffvVar), str);
                }
            });
        }
        if (!(qrzVar instanceof qru)) {
            throw new fctg();
        }
        context.getContentResolver();
        throw null;
    }
}
