package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwn {
    public final Object a;
    public final Object b;

    public hwn(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final hwn a(Object obj) {
        return new hwn(this.a, obj);
    }

    public final boolean b() {
        return this.b != hwr.a;
    }

    public final boolean c() {
        return this.a != hwr.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hwn() {
        hwr hwrVar = hwr.a;
        this(hwrVar, hwrVar);
    }
}
