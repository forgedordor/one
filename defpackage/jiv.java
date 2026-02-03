package defpackage;

import android.content.res.Resources;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jiv {
    public static final jcr a(jcr jcrVar, fdap fdapVar) {
        for (jcr jcrVarS = jcrVar.s(); jcrVarS != null; jcrVarS = jcrVarS.s()) {
            if (((Boolean) fdapVar.invoke(jcrVarS)).booleanValue()) {
                return jcrVarS;
            }
        }
        return null;
    }

    public static final juo b(jsl jslVar) {
        jsc jscVar = jslVar.c;
        juo juoVar = (juo) jsd.a(jscVar, jte.E);
        List list = (List) jsd.a(jscVar, jte.A);
        return juoVar == null ? list != null ? (juo) fcva.P(list) : null : juoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(defpackage.jsl r7, android.content.res.Resources r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jiv.c(jsl, android.content.res.Resources):java.lang.String");
    }

    public static final boolean d(jsl jslVar) {
        return !jslVar.f().f(jte.i);
    }

    public static final boolean e(jsl jslVar) {
        jsc jscVar = jslVar.c;
        jue jueVar = (jue) jsd.a(jscVar, jte.I);
        jrw jrwVar = (jrw) jsd.a(jscVar, jte.x);
        Boolean bool = (Boolean) jsd.a(jscVar, jte.H);
        boolean z = jueVar != null;
        if (bool != null) {
            bool.booleanValue();
            if (jrwVar == null || !jrw.a(jrwVar.a, 4)) {
                return true;
            }
        }
        return z;
    }

    public static final boolean f(jsl jslVar) {
        return jslVar.b.s == kji.b;
    }

    public static final boolean g(jsl jslVar, Resources resources) {
        jsc jscVar = jslVar.c;
        List list = (List) jsd.a(jscVar, jte.a);
        boolean z = ((list != null ? (String) fcva.P(list) : null) == null && b(jslVar) == null && c(jslVar, resources) == null && !e(jslVar)) ? false : true;
        if (jsp.a(jslVar)) {
            return false;
        }
        if (jscVar.b) {
            return true;
        }
        return jslVar.k() && z;
    }
}
