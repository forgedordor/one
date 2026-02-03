package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iud implements iul {
    private final String a;
    private final iyo b;
    private final iyo c;
    private final izs d = new izs();
    private final ivj e = new ivj();
    private final izs f = new izs();
    private final ivj g = new ivj();

    public iud(String str) {
        this.a = str;
        this.b = new iyp(str.concat(" source"));
        this.c = new iyp(str.concat(" target"));
    }

    @Override // defpackage.iyo
    public final ivj a() {
        return this.g;
    }

    @Override // defpackage.iyo
    public final ivj b() {
        return this.e;
    }

    @Override // defpackage.iul
    public final iyo c() {
        return this.b;
    }

    @Override // defpackage.iul
    public final iyo d() {
        return this.c;
    }

    @Override // defpackage.iyo
    public final izs e() {
        return this.d;
    }

    @Override // defpackage.iyo
    public final izs f() {
        return this.f;
    }

    public final String toString() {
        return this.a;
    }
}
