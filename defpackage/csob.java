package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csob {
    public final boolean a;
    public final csdn b;
    private final boolean c;

    public csob(boolean z, csdn csdnVar, boolean z2) {
        this.a = z;
        this.b = csdnVar;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csob)) {
            return false;
        }
        csob csobVar = (csob) obj;
        return this.a == csobVar.a && fdbq.f(this.b, csobVar.b) && this.c == csobVar.c;
    }

    public final int hashCode() {
        return (((csoa.a(this.a) * 31) + this.b.hashCode()) * 31) + csoa.a(this.c);
    }

    public final String toString() {
        return "SpamBlockState(isSpam=" + this.a + ", classificationSources=" + this.b + ", isBlocked=" + this.c + ")";
    }
}
