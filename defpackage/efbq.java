package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbq extends efdf {
    private final String b;
    private final String c;
    private final ekgp d;

    public efbq(String str, String str2, ekgp ekgpVar) {
        this.b = str;
        this.c = str2;
        this.d = ekgpVar;
    }

    @Override // defpackage.efdf
    public final ekgp a() {
        return this.d;
    }

    @Override // defpackage.efdf
    public final String b() {
        return this.c;
    }

    @Override // defpackage.efdf
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efdf) {
            efdf efdfVar = (efdf) obj;
            if (this.b.equals(efdfVar.c()) && this.c.equals(efdfVar.b()) && ekmi.m(this.d, efdfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
