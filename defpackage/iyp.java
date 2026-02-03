package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iyp implements iyo {
    private final String a;
    private final izs b = new izs();
    private final ivj c = new ivj();
    private final izs d = new izs();
    private final ivj e = new ivj();

    public iyp(String str) {
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
        return "RectRulers(" + this.a + ')';
    }
}
