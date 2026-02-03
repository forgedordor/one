package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zny {
    public final boolean a;
    public final oux b;

    public zny(boolean z, oux ouxVar) {
        ouxVar.getClass();
        this.a = z;
        this.b = ouxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zny)) {
            return false;
        }
        zny znyVar = (zny) obj;
        return this.a == znyVar.a && fdbq.f(this.b, znyVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Pages(fromNewPagingSource=" + this.a + ", pagingData=" + this.b + ")";
    }
}
