package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dtar {
    private final dswb a;
    private final dsvh b;
    private final dn c;

    public dtar(dswb dswbVar, dsvh dsvhVar, dn dnVar) {
        this.a = dswbVar;
        this.b = dsvhVar;
        this.c = dnVar;
    }

    private final iv d() {
        dn dnVar = this.c;
        dtat.d(dnVar);
        return (iv) dnVar.d;
    }

    @Deprecated
    public final dsuy a(int i, int i2) {
        return this.a.b(d().b(i), i2);
    }

    @Deprecated
    public final dsuy b(int i) {
        return this.a.b(dtat.b(this.c), i);
    }

    public final void c(int i) {
        this.b.a(dsvg.e(), d().b(i));
    }
}
