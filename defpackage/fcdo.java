package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fcdo extends fbru {
    public final fbru a;

    public fcdo(fbru fbruVar) {
        this.a = fbruVar;
    }

    @Override // defpackage.fbru
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.fbru
    public void b() {
        throw null;
    }

    @Override // defpackage.fbru
    public final void d() {
        this.a.d();
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", this.a);
        return ejwfVarB.toString();
    }
}
