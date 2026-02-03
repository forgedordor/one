package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzt implements vzu {
    private final waa a;

    public vzt(waa waaVar) {
        this.a = waaVar;
    }

    @Override // defpackage.vzu
    public final waa a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzt) && fdbq.f(this.a, ((vzt) obj).a);
    }

    public final int hashCode() {
        waa waaVar = this.a;
        if (waaVar == null) {
            return 0;
        }
        return waaVar.hashCode();
    }

    public final String toString() {
        return "ONE_TO_ONE_SMS(textCounterData=" + this.a + ")";
    }

    public vzt() {
        this(null);
    }
}
