package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbe extends efbk {
    private final efdc a;

    public efbe(efdc efdcVar) {
        this.a = efdcVar;
    }

    @Override // defpackage.efbk, defpackage.efes
    public final efdc a() {
        return this.a;
    }

    @Override // defpackage.efes
    public final int b() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efes) {
            efes efesVar = (efes) obj;
            if (efesVar.b() == 6 && this.a.equals(efesVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{basicTextMessage=" + this.a.toString() + "}";
    }
}
