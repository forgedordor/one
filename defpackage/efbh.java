package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbh extends efbk {
    private final efem a;

    public efbh(efem efemVar) {
        this.a = efemVar;
    }

    @Override // defpackage.efes
    public final int b() {
        return 2;
    }

    @Override // defpackage.efbk, defpackage.efes
    public final efem e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efes) {
            efes efesVar = (efes) obj;
            if (efesVar.b() == 2 && this.a.equals(efesVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{isComposing=" + this.a.toString() + "}";
    }
}
