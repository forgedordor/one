package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbj extends efbk {
    private final effa a;

    public efbj(effa effaVar) {
        this.a = effaVar;
    }

    @Override // defpackage.efes
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efes) {
            efes efesVar = (efes) obj;
            if (efesVar.b() == 3 && this.a.equals(efesVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.efbk, defpackage.efes
    public final effa g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{messageReceipt=" + this.a.toString() + "}";
    }
}
