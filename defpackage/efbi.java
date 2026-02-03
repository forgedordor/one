package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbi extends efbk {
    private final efer a;

    public efbi(efer eferVar) {
        this.a = eferVar;
    }

    @Override // defpackage.efes
    public final int b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efes) {
            efes efesVar = (efes) obj;
            if (efesVar.b() == 5 && this.a.equals(efesVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.efbk, defpackage.efes
    public final efer f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{locationInformation=" + this.a.toString() + "}";
    }
}
