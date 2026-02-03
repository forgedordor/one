package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czrp implements agzt {
    public final ea a;
    public final czqr b;
    private final fcsu c;
    private final fdjx d;
    private final fcsu e;
    private final fcsu f;
    private agzy g;

    public czrp(ea eaVar, fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2, fcsu fcsuVar3, agzy agzyVar) {
        fdjxVar.getClass();
        agzyVar.getClass();
        this.a = eaVar;
        this.c = fcsuVar;
        this.d = fdjxVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = agzyVar;
        this.b = ((czqs) fcsuVar2.b()).a(emfe.PROVISIONING_UI_TYPE_LEGAL_FYI, 5);
    }

    @Override // defpackage.agzt
    public final eiju b() {
        czrg czrgVar = (czrg) this.c.b();
        return auvw.c(czrgVar.c, fcyi.a, fdjz.a, new czrf(czrgVar, null));
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.g = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        ((cjya) this.f.b()).d(emfc.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_DISMISSED);
        this.g.b();
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (z) {
            return true;
        }
        ((cjya) this.f.b()).e(emfc.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SEEN, emfe.PROVISIONING_UI_TYPE_LEGAL_FYI);
        auvw.k(this.d, null, null, new czro(this, null), 3);
        String str = true != ((crqv) ((czrg) this.c.b()).d.b()).q("fast_track_prompt_dismissed", false) ? "NEW_USERS_UI" : "DECLINED_TOS_UI";
        czri czriVar = new czri();
        eyhj.e(czriVar);
        ehog.b(czriVar, str);
        czriVar.t(this.a.I(), "RcsDefaultOnBottomSheetFragmentPeer");
        czriVar.H().f = this;
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 15;
    }

    @Override // defpackage.agzt
    public final void g() {
        d();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }
}
