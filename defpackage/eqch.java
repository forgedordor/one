package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqch extends eqcn {
    private final String a;
    private final String b;
    private final ekgp c;

    public eqch(String str, String str2, ekgp ekgpVar) {
        this.a = str;
        this.b = str2;
        this.c = ekgpVar;
    }

    @Override // defpackage.eqcn
    public final ekgp a() {
        return this.c;
    }

    @Override // defpackage.eqcn
    public final String b() {
        return this.b;
    }

    @Override // defpackage.eqcn
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eqcn) {
            eqcn eqcnVar = (eqcn) obj;
            if (this.a.equals(eqcnVar.c()) && this.b.equals(eqcnVar.b()) && ekmi.m(this.c, eqcnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
