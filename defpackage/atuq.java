package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atuq extends atus {
    private final coid a;

    public atuq(coid coidVar) {
        coidVar.getClass();
        this.a = coidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof atuq) && this.a == ((atuq) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(fileTransferFailureReason=" + this.a + ")";
    }
}
