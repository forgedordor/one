package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaes {
    public final aaer a;
    public final djrr b;
    public final String c;
    public final String d;
    public final fdae e;

    public aaes(aaer aaerVar, djrr djrrVar, String str, String str2, fdae fdaeVar) {
        djrrVar.getClass();
        this.a = aaerVar;
        this.b = djrrVar;
        this.c = str;
        this.d = str2;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaes)) {
            return false;
        }
        aaes aaesVar = (aaes) obj;
        return fdbq.f(this.a, aaesVar.a) && this.b == aaesVar.b && fdbq.f(this.c, aaesVar.c) && fdbq.f(this.d, aaesVar.d) && fdbq.f(this.e, aaesVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "SpatulaApprovalBottomSheetUiData(customBottomSheetUiData=" + this.a + ", icon=" + this.b + ", continueButtonText=" + this.c + ", backButtonText=" + this.d + ", onContinue=" + this.e + ")";
    }
}
