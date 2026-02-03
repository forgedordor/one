package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbf extends efbk {
    private final efdd a;

    public efbf(efdd efddVar) {
        this.a = efddVar;
    }

    @Override // defpackage.efes
    public final int b() {
        return 1;
    }

    @Override // defpackage.efbk, defpackage.efes
    public final efdd c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efes) {
            efes efesVar = (efes) obj;
            if (efesVar.b() == 1 && this.a.equals(efesVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{chat=" + this.a.toString() + "}";
    }
}
