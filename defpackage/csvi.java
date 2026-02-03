package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csvi extends cswi {
    private final csup a;
    private final ekgp b;
    private final ekgp c;

    public csvi(csup csupVar, ekgp ekgpVar, ekgp ekgpVar2) {
        if (csupVar == null) {
            throw new NullPointerException("Null storedData");
        }
        this.a = csupVar;
        this.b = ekgpVar;
        this.c = ekgpVar2;
    }

    @Override // defpackage.cswi
    public final csup a() {
        return this.a;
    }

    @Override // defpackage.cswi
    public final ekgp b() {
        return this.b;
    }

    @Override // defpackage.cswi
    public final ekgp c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cswi) {
            cswi cswiVar = (cswi) obj;
            if (this.a.equals(cswiVar.a()) && ekmi.m(this.b, cswiVar.b()) && ekmi.m(this.c, cswiVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "VerifiedSmsDataWithDecryptedKeyPairs{storedData=" + this.a.toString() + ", activeKeyPairs=" + ekmi.g(this.b) + ", evictedKeyPairs=" + ekmi.g(this.c) + "}";
    }
}
