package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class qrx implements qrz {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof qrx) && this.a == ((qrx) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "RawRes(resId=" + this.a + ")";
    }
}
