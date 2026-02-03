package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrl extends qrn {
    private final String a = "rest";

    @Override // defpackage.qrn
    public final float a(qnm qnmVar) {
        qsw qswVarC = qnmVar.c(this.a);
        if (qswVarC == null) {
            return 1.0f;
        }
        return fddu.e((qswVarC.b + qswVarC.c) / qnmVar.k, 0.0f, 1.0f);
    }

    @Override // defpackage.qrn
    public final float b(qnm qnmVar) {
        qsw qswVarC = qnmVar.c(this.a);
        return fddu.e((qswVarC != null ? qswVarC.b : 0.0f) / qnmVar.k, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrl) && fdbq.f(this.a, ((qrl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Marker(marker=" + this.a + ")";
    }
}
