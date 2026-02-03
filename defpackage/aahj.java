package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahj {
    public final String a;
    public final djrr b;
    public final boolean c;
    public final boolean d;
    public final fdae e;

    public aahj(String str, djrr djrrVar, boolean z, boolean z2, fdae fdaeVar) {
        fdaeVar.getClass();
        this.a = str;
        this.b = djrrVar;
        this.c = z;
        this.d = z2;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aahj)) {
            return false;
        }
        aahj aahjVar = (aahj) obj;
        return fdbq.f(this.a, aahjVar.a) && this.b == aahjVar.b && this.c == aahjVar.c && this.d == aahjVar.d && fdbq.f(this.e, aahjVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        djrr djrrVar = this.b;
        return ((((((iHashCode + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31) + aahi.a(this.c)) * 31) + aahi.a(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "BackBehaviorUiData(title=" + this.a + ", icon=" + this.b + ", overrideSystemBack=" + this.c + ", canExecute=" + this.d + ", execute=" + this.e + ")";
    }

    public /* synthetic */ aahj(String str, djrr djrrVar, fdae fdaeVar) {
        this(str, djrrVar, true, true, fdaeVar);
    }
}
