package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajn {
    public final int a;
    public final int b;
    public final pzs c;
    public final int d;
    private final boolean e;

    public cajn(int i, boolean z, int i2, pzs pzsVar, int i3) {
        this.a = i;
        this.e = z;
        this.b = i2;
        this.c = pzsVar;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cajn)) {
            return false;
        }
        cajn cajnVar = (cajn) obj;
        return this.a == cajnVar.a && this.e == cajnVar.e && this.b == cajnVar.b && fdbq.f(this.c, cajnVar.c) && this.d == cajnVar.d;
    }

    public final int hashCode() {
        boolean z = this.e;
        return (((((((this.a * 31) + (true != z ? 1237 : 1231)) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "CmsRestoreContext(cmsFeatureId=" + this.a + ", isBackupKeyFromFolsom=" + this.e + ", priorAttemptCount=" + this.b + ", workData=" + this.c + ", accountId=" + this.d + ")";
    }
}
