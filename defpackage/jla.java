package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jla extends icr implements jqi {
    public ViewGroup a;

    public jla(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.jqi
    public final Object e(ivy ivyVar, fdae fdaeVar, fcxy fcxyVar) {
        long jA = ivz.a(ivyVar);
        Object objInvoke = fdaeVar.invoke();
        ihu ihuVarF = objInvoke != null ? ((ihu) objInvoke).f(jA) : null;
        if (ihuVarF != null) {
            this.a.requestRectangleOnScreen(ikh.a(ihuVarF), false);
        }
        return fctx.a;
    }
}
