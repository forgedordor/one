package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbd extends dsbj {
    private final int a;
    private final etns b;

    public dsbd(int i, etns etnsVar) {
        this.a = i;
        this.b = etnsVar;
    }

    @Override // defpackage.dsbj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dsbj
    public final etns b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsbj) {
            dsbj dsbjVar = (dsbj) obj;
            if (this.a == dsbjVar.a() && this.b.equals(dsbjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PromoDisplayContext{screenOrientation=" + this.a + ", theme=" + this.b.toString() + "}";
    }
}
