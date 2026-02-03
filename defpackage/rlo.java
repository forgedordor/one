package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlo {
    public final rvf a;

    public rlo() {
        this(250L);
    }

    public final Object a(Object obj, int i, int i2) {
        rvf rvfVar = this.a;
        rln rlnVarA = rln.a(obj, i, i2);
        Object objH = rvfVar.h(rlnVarA);
        rlnVarA.b();
        return objH;
    }

    public final void b(Object obj, int i, int i2, Object obj2) {
        this.a.i(rln.a(obj, i, i2), obj2);
    }

    public rlo(long j) {
        this.a = new rlm(j);
    }
}
