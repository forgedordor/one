package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrm extends qrn {
    private final String a;
    private final String b;
    private final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    public qrm() {
        String str = null;
        this(str, str, 7);
    }

    @Override // defpackage.qrn
    public final float a(qnm qnmVar) {
        String str = this.b;
        if (str == null) {
            return 1.0f;
        }
        qsw qswVarC = qnmVar.c(str);
        return fddu.e((qswVarC != null ? qswVarC.b + 0.0f : 0.0f) / qnmVar.k, 0.0f, 1.0f);
    }

    @Override // defpackage.qrn
    public final float b(qnm qnmVar) {
        String str = this.a;
        if (str == null) {
            return 0.0f;
        }
        qsw qswVarC = qnmVar.c(str);
        return fddu.e((qswVarC != null ? qswVarC.b : 0.0f) / qnmVar.k, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrm)) {
            return false;
        }
        qrm qrmVar = (qrm) obj;
        if (!fdbq.f(this.a, qrmVar.a) || !fdbq.f(this.b, qrmVar.b)) {
            return false;
        }
        boolean z = qrmVar.c;
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + 1231;
    }

    public final String toString() {
        return "Markers(min=" + this.a + ", max=" + this.b + ", maxInclusive=true)";
    }

    public /* synthetic */ qrm(String str, String str2, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : str2;
        this.c = true;
    }
}
