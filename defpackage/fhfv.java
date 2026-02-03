package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhfv {
    public final String a;
    public final boolean b;

    public fhfv() {
        this("", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhfv)) {
            return false;
        }
        fhfv fhfvVar = (fhfv) obj;
        return fdbq.f(this.a, fhfvVar.a) && this.b == fhfvVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "EntryPointUiData(accountName=" + this.a + ", hideEntryForBoundAccount=" + this.b + ")";
    }

    public fhfv(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
