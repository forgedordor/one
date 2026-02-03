package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atju extends atjv {
    private final atbq a;

    public atju(atbq atbqVar) {
        this.a = atbqVar;
    }

    @Override // defpackage.atjx
    public final int b() {
        return 2;
    }

    @Override // defpackage.atjv, defpackage.atjx
    public final atbq c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atjx) {
            atjx atjxVar = (atjx) obj;
            if (atjxVar.b() == 2 && this.a.equals(atjxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FileInformationOrFileTransferFailure{fileTransferFailure=" + this.a.toString() + "}";
    }
}
