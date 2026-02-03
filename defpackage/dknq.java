package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknq implements dknr {
    public final Float a;
    public final fdae b;
    public final boolean c;
    public final dknp d;

    public dknq(Float f, fdae fdaeVar, boolean z, dknp dknpVar) {
        this.a = f;
        this.b = fdaeVar;
        this.c = z;
        this.d = dknpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dknq)) {
            return false;
        }
        dknq dknqVar = (dknq) obj;
        return fdbq.f(this.a, dknqVar.a) && fdbq.f(this.b, dknqVar.b) && this.c == dknqVar.c && fdbq.f(this.d, dknqVar.d);
    }

    public final int hashCode() {
        Float f = this.a;
        return ((((((f == null ? 0 : f.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Transferring(progressPercentage=" + this.a + ", onCancelButtonClicked=" + this.b + ", isPreprocessing=" + this.c + ", flags=" + this.d + ")";
    }

    public /* synthetic */ dknq(Float f, fdae fdaeVar) {
        this(f, fdaeVar, false, new dknp((byte[]) null));
    }
}
