package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kaz {
    private final kbh a;
    private final Object b = null;

    public kaz(kbh kbhVar) {
        this.a = kbhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaz)) {
            return false;
        }
        kaz kazVar = (kaz) obj;
        if (!fdbq.f(this.a, kazVar.a)) {
            return false;
        }
        Object obj2 = kazVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
