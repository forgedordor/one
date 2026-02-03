package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class copd extends coqa {
    private final cbcw a;
    private final copy b;

    public copd(cbcw cbcwVar, copy copyVar) {
        if (cbcwVar == null) {
            throw new NullPointerException("Null workQueueResult");
        }
        this.a = cbcwVar;
        if (copyVar == null) {
            throw new NullPointerException("Null fileDownloadUris");
        }
        this.b = copyVar;
    }

    @Override // defpackage.coqa
    public final cbcw a() {
        return this.a;
    }

    @Override // defpackage.coqa
    public final copy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof coqa) {
            coqa coqaVar = (coqa) obj;
            if (this.a.equals(coqaVar.a()) && this.b.equals(coqaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        copy copyVar = this.b;
        return "WorkQueueResultAndFileDownloadUris{workQueueResult=" + this.a.toString() + ", fileDownloadUris=" + copyVar.toString() + "}";
    }
}
