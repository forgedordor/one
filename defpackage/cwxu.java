package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwxu implements agzt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversationlist/popups/enterprisearchival/ArchivalPopupPresenter");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fr h;
    private agzy i;
    private cwxl j;

    public cwxu(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.g = fcsuVar6;
        this.h = eaVar.I();
    }

    @Override // defpackage.agzt
    public final eiju b() {
        Object objB = this.f.b();
        objB.getClass();
        return auvw.c((fdjx) objB, fcyi.a, fdjz.a, new cwxt(this, null));
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.i = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        Object objB = this.f.b();
        objB.getClass();
        auvw.m((fdjx) objB, null, new cwxs(this, null), 3);
        cwxl cwxlVar = this.j;
        if (cwxlVar != null && cwxlVar.aF()) {
            cwxlVar.hh();
        }
        this.j = null;
        agzy agzyVar = this.i;
        if (agzyVar != null) {
            agzyVar.b();
        }
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (this.j == null) {
            cwxl cwxlVar = (cwxl) this.h.h("bottomSheetFragmentTag");
            this.j = cwxlVar;
            if (cwxlVar == null) {
                efwo efwoVar = (efwo) this.g.b();
                cwxl cwxlVar2 = new cwxl();
                eyhj.e(cwxlVar2);
                ehok.b(cwxlVar2, efwoVar);
                this.j = cwxlVar2;
            }
        }
        cwxl cwxlVar3 = this.j;
        cwxlVar3.getClass();
        if (!cwxlVar3.aF()) {
            cwxlVar3.t(this.h, "bottomSheetFragmentTag");
        }
        cwxlVar3.H().c = this;
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 20;
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
