package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchc extends dcgu {
    public final css e;
    private final dchp g;

    public dchc(dchu dchuVar, dchp dchpVar) {
        super(dchuVar, dcdt.a);
        this.e = new css();
        this.g = dchpVar;
        this.f.b(this);
    }

    @Override // defpackage.dcgu
    protected final void e(ConnectionResult connectionResult, int i) {
        this.g.e(connectionResult, i);
    }

    @Override // defpackage.dcgu
    protected final void f() {
        this.g.f();
    }

    @Override // defpackage.dcht
    public final void h() {
        k();
    }

    @Override // defpackage.dcht
    public final void i() {
        this.a = true;
        k();
    }

    @Override // defpackage.dcht
    public final void j() {
        this.a = false;
        Object obj = dchp.c;
        dchp dchpVar = this.g;
        synchronized (obj) {
            if (dchpVar.m == this) {
                dchpVar.m = null;
                dchpVar.n.clear();
            }
        }
    }

    public final void k() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.g(this);
    }
}
