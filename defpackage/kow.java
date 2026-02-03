package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kow extends kpu {
    public final Object a;
    public final koz b;
    public final koy c;
    public final koz d;
    public final koy e;

    public kow(Object obj) {
        this.a = obj;
        this.b = new koz(obj, -2, this);
        this.c = new koy(obj, 0, this);
        this.d = new koz(obj, -1, this);
        this.e = new koy(obj, 1, this);
    }

    @Override // defpackage.kpu
    public final Object a() {
        return this.a;
    }
}
