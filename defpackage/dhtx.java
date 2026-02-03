package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhtx extends dhph {
    public final boolean a;

    public dhtx(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhtx) && this.a == ((dhtx) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }
}
