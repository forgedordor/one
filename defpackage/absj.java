package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absj implements agzt {
    private final fcsu a;
    private agzy b;

    public absj(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        fcsu fcsuVar = this.a;
        if (((Optional) fcsuVar.b()).isPresent()) {
            eiju eijuVarA = ((abdk) ((Optional) fcsuVar.b()).get()).a();
            eijuVarA.getClass();
            return eijuVarA;
        }
        eiju eijuVarE = eijx.e(false);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.b = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        agzy agzyVar = this.b;
        if (agzyVar != null) {
            agzyVar.b();
        }
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        ((abdk) ((Optional) this.a.b()).get()).i();
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 17;
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
