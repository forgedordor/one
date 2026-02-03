package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsk {
    public boolean a;
    public final eqsi b;
    public final eqsg c;
    public final eqst d;
    public eqsl e;
    public eqsm f;

    public eqsk(eqsg eqsgVar) {
        this.b = eqsi.a;
        this.e = null;
        this.f = null;
        this.c = eqsgVar;
        this.d = null;
    }

    public final void a() {
        eqsm eqsmVar = this.f;
        if (eqsmVar != null) {
            eqsmVar.b();
        }
        this.a = true;
    }

    public final void b(int i) {
        this.e = new eqsl(i);
    }

    public eqsk(eqst eqstVar) {
        this.b = eqsi.a;
        this.e = null;
        this.f = null;
        this.c = null;
        this.d = eqstVar;
    }
}
