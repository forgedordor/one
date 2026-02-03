package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class actn {
    public static actk l() {
        acte acteVar = new acte();
        acteVar.b(true);
        return acteVar;
    }

    public static actn m() {
        actk actkVarL = l();
        acte acteVar = (acte) actkVarL;
        acteVar.a = "stub_banner_name";
        actkVarL.c(0);
        acteVar.b = null;
        acteVar.c = null;
        actkVarL.e("");
        acteVar.d = null;
        acteVar.e = new actm() { // from class: acti
            @Override // defpackage.actm
            public final void a(egpr egprVar, View view) {
            }
        };
        acteVar.f = null;
        actkVarL.d(new actj());
        return actkVarL.a();
    }

    public abstract int a();

    public abstract actl b();

    public abstract actm c();

    public abstract actm d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract String i();

    public abstract boolean j();

    public abstract void k();
}
