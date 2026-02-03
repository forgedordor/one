package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmw {
    public static final Uri a(Context context, Uri uri, String str) {
        return (bxlf.j(uri, context) || cqmz.s(uri)) ? bxli.b(context, uri, null, str, 0L) : uri;
    }

    public static final String b(ajlt ajltVar) {
        amvr amvrVarG = ajltVar.g();
        if (amvrVarG instanceof amwi) {
            return ((amwi) amvrVarG).d();
        }
        return null;
    }

    public static final String c(ajlt ajltVar) {
        amvr amvrVarG = ajltVar.g();
        if (amvrVarG instanceof amwf) {
            return ((amwf) amvrVarG).c();
        }
        if (amvrVarG instanceof amwh) {
            return ((amwg) fcva.N(((amwh) amvrVarG).a())).a();
        }
        if (amvrVarG instanceof amwa) {
            return ((amwa) amvrVarG).m();
        }
        return null;
    }

    public static final boolean d(ajlt ajltVar) {
        ajltVar.getClass();
        String strC = c(ajltVar);
        boolean z = (strC == null || fdgn.H(strC)) ? false : true;
        String strB = b(ajltVar);
        return z || (strB != null && !fdgn.H(strB)) || (ajltVar.g() instanceof amsv) || (ajltVar.g() instanceof amwa);
    }

    public static final boolean e(amvr amvrVar) {
        if (amvrVar instanceof amwf) {
            return true;
        }
        return amvrVar instanceof amvp ? f((amvp) amvrVar) : amvrVar instanceof amsv;
    }

    public static final boolean f(amvp amvpVar) {
        return le.u(amvpVar.b());
    }
}
