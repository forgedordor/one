package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class qrt implements qrz {
    public final String a;

    public final boolean equals(Object obj) {
        return (obj instanceof qrt) && fdbq.f(this.a, ((qrt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Asset(assetName=" + this.a + ")";
    }
}
