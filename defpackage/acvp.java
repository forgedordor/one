package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvp implements agzt {
    public final Optional a;
    private final ea b;
    private final fcsu c;
    private final fdjx d;
    private final fcsu e;
    private agzy f;

    public acvp(ea eaVar, fcsu fcsuVar, fdjx fdjxVar, Optional optional, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        this.b = eaVar;
        this.c = fcsuVar;
        this.d = fdjxVar;
        this.a = optional;
        this.e = fcsuVar2;
    }

    private final void h() {
        auvw.c(this.d, fcyi.a, fdjz.a, new acvn(this, null));
    }

    @Override // defpackage.agzt
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new acvo(this, null));
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        h();
        agzy agzyVar = this.f;
        if (agzyVar == null) {
            fdbq.c("host");
            agzyVar = null;
        }
        agzyVar.b();
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (z) {
            return false;
        }
        ((ains) this.e.b()).e("Bugle.HomeScreen.PopupHost.Show", 18);
        eksp ekspVar = acvm.a;
        Object objB = this.c.b();
        objB.getClass();
        acvj acvjVar = new acvj();
        eyhj.e(acvjVar);
        ehok.b(acvjVar, (efwo) objB);
        acvjVar.t(this.b.I(), "GroupUpgradeBottomSheetFragmentPeer");
        acvjVar.H().d = this;
        h();
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 19;
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
