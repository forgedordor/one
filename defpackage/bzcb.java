package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcb implements bzca {
    public final String a;
    public final boolean b;

    public bzcb(String str, boolean z) {
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
        if (!(obj instanceof bzcb)) {
            return false;
        }
        bzcb bzcbVar = (bzcb) obj;
        return fdbq.f(this.a, bzcbVar.a) && this.b == bzcbVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "DeletionResult(cmsId=" + this.a + ", wasAlreadyAbsent=" + this.b + ")";
    }
}
