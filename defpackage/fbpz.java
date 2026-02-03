package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpz extends fbqg {
    private final fbqc a;

    public fbpz(fbqc fbqcVar) {
        fbqcVar.getClass();
        this.a = fbqcVar;
    }

    @Override // defpackage.fbqg
    public final fbqc a(fbqd fbqdVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fbpz) {
            return this.a.equals(((fbpz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.a.toString() + ")";
    }
}
