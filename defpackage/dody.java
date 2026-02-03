package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dody implements doeb {
    private final int a;
    private final boolean b;

    public dody(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.doeb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.doeb
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dody)) {
            return false;
        }
        dody dodyVar = (dody) obj;
        return this.a == dodyVar.a && this.b == dodyVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "Basic(errorMessageStringResource=" + this.a + ", isRetryable=" + this.b + ")";
    }
}
