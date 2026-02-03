package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdkw extends fdjq {
    private long a;
    public fcuq b;
    private boolean c;

    private static final long hF(boolean z) {
        return z ? 4294967296L : 1L;
    }

    @Override // defpackage.fdjq
    public final fdjq i(int i) {
        fdys.a(1);
        return this;
    }

    public void l() {
        throw null;
    }

    public long m() {
        throw null;
    }

    public final void n(boolean z) {
        long jHF = this.a - hF(z);
        this.a = jHF;
        if (jHF > 0) {
            return;
        }
        boolean z2 = fdkb.a;
        if (this.c) {
            l();
        }
    }

    public final void o(fdkn fdknVar) {
        fcuq fcuqVar = this.b;
        if (fcuqVar == null) {
            fcuqVar = new fcuq();
            this.b = fcuqVar;
        }
        fcuqVar.addLast(fdknVar);
    }

    public final void p(boolean z) {
        this.a += hF(z);
        if (z) {
            return;
        }
        this.c = true;
    }

    public final boolean q() {
        return this.a >= hF(true);
    }

    public final boolean r() {
        fcuq fcuqVar = this.b;
        if (fcuqVar != null) {
            return fcuqVar.isEmpty();
        }
        return true;
    }

    public final boolean s() {
        fdkn fdknVar;
        fcuq fcuqVar = this.b;
        if (fcuqVar == null || (fdknVar = (fdkn) fcuqVar.g()) == null) {
            return false;
        }
        fdknVar.run();
        return true;
    }
}
