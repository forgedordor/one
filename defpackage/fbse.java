package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbse implements fbsf {
    private final Object a;
    private final Object b;

    public fbse(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.fbsf
    public final int a() {
        return 1;
    }

    @Override // defpackage.fbsf
    public final fbsf b(Object obj, Object obj2, int i, int i2) {
        Object obj3 = this.a;
        int iHashCode = obj3.hashCode();
        return iHashCode != i ? fbsd.d(new fbse(obj, obj2), i, this, iHashCode, i2) : obj3 == obj ? new fbse(obj, obj2) : new fbsc(new Object[]{obj3, obj}, new Object[]{this.b, obj2});
    }

    @Override // defpackage.fbsf
    public final Object c(Object obj, int i, int i2) {
        if (this.a == obj) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        return String.format("Leaf(key=%s value=%s)", this.a, this.b);
    }
}
