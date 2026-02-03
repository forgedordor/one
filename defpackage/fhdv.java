package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdv<T> {
    public final fezh a;
    public final Object b;

    public fhdv(fezh fezhVar, Object obj) {
        this.a = fezhVar;
        this.b = obj;
    }

    public static fhdv b(Object obj, fezh fezhVar) {
        if (fezhVar.a()) {
            return new fhdv(fezhVar, obj);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final int a() {
        return this.a.d;
    }

    public final boolean c() {
        return this.a.a();
    }

    public final String toString() {
        return this.a.toString();
    }
}
