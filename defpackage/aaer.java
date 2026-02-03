package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaer implements divg {
    public final String a;
    public final String b;
    public final fdae c;
    private final boolean d = true;

    public aaer(String str, String str2, fdae fdaeVar) {
        this.a = str;
        this.b = str2;
        this.c = fdaeVar;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        fdaeVar.getClass();
        return new aaer(this.a, this.b, fdaeVar);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.c;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaer)) {
            return false;
        }
        aaer aaerVar = (aaer) obj;
        if (!fdbq.f(this.a, aaerVar.a) || !fdbq.f(this.b, aaerVar.b)) {
            return false;
        }
        boolean z = aaerVar.d;
        return fdbq.f(this.c, aaerVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CustomBottomSheetUiData(title=" + this.a + ", body=" + this.b + ", includeScrim=true, onDismiss=" + this.c + ")";
    }
}
