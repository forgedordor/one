package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlpq implements dlps {
    public final dlow a;
    private final boolean b;
    private final float c;

    public dlpq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlpq)) {
            return false;
        }
        dlpq dlpqVar = (dlpq) obj;
        return this.b == dlpqVar.b && Float.compare(this.c, dlpqVar.c) == 0 && fdbq.f(this.a, dlpqVar.a);
    }

    public final int hashCode() {
        return ((((true != this.b ? 1237 : 1231) * 31) + Float.floatToIntBits(this.c)) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "LoadingInProgress(visible=" + this.b + ", loadingProgress=" + this.c + ", flags=" + this.a + ")";
    }

    public dlpq(boolean z, float f, dlow dlowVar) {
        this.b = z;
        this.c = f;
        this.a = dlowVar;
    }

    public /* synthetic */ dlpq(byte[] bArr) {
        this(true, 0.0f, new dlow(null));
    }
}
