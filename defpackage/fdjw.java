package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdjw extends fcxs {
    public static final fdjv a = new fdjv();
    public final String b;

    public fdjw(String str) {
        super(a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdjw) && fdbq.f(this.b, ((fdjw) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.b + ")";
    }
}
