package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbg extends efbk {
    private final efdp a;

    public efbg(efdp efdpVar) {
        this.a = efdpVar;
    }

    @Override // defpackage.efes
    public final int b() {
        return 4;
    }

    @Override // defpackage.efbk, defpackage.efes
    public final efdp d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efes) {
            efes efesVar = (efes) obj;
            if (efesVar.b() == 4 && this.a.equals(efesVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{fileTransferInformation=" + this.a.toString() + "}";
    }
}
