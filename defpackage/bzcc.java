package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcc implements bzca {
    public final String a;
    public final boolean b;

    public bzcc(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.bzca
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzcc)) {
            return false;
        }
        bzcc bzccVar = (bzcc) obj;
        return fdbq.f(this.a, bzccVar.a) && this.b == bzccVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "InsertionResult(cmsId=" + this.a + ", didAlreadyExist=" + this.b + ")";
    }
}
