package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlh {
    public static final String a = qas.d("NetworkRequestCompat");
    public final Object b;

    public qlh() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlh) && fdbq.f(this.b, ((qlh) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }

    public qlh(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ qlh(byte[] bArr) {
        this((Object) null);
    }
}
