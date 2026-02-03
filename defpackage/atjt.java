package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atjt extends atjv {
    private final aucj a;

    public atjt(aucj aucjVar) {
        this.a = aucjVar;
    }

    @Override // defpackage.atjv, defpackage.atjx
    public final aucj a() {
        return this.a;
    }

    @Override // defpackage.atjx
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atjx) {
            atjx atjxVar = (atjx) obj;
            if (atjxVar.b() == 1 && this.a.equals(atjxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FileInformationOrFileTransferFailure{fileInformation=" + this.a.toString() + "}";
    }
}
