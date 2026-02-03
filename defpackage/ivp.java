package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivp implements iyo {
    private final String a;
    private final izs b = new izs(new ivm());
    private final ivj c = new ivj(new ivo());
    private final izs d = new izs(new ivn());
    private final ivj e = new ivj(new ivl());

    public ivp(String str) {
        this.a = str;
    }

    @Override // defpackage.iyo
    public final ivj a() {
        return this.e;
    }

    @Override // defpackage.iyo
    public final ivj b() {
        return this.c;
    }

    @Override // defpackage.iyo
    public final izs e() {
        return this.b;
    }

    @Override // defpackage.iyo
    public final izs f() {
        return this.d;
    }

    public final String toString() {
        return this.a;
    }
}
