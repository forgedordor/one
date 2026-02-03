package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alfp extends alny {
    public final ephf a;
    public final int b;
    private final String c;

    public alfp(ephf ephfVar, int i, String str) {
        if (ephfVar == null) {
            throw new NullPointerException("Null phoneNumber");
        }
        this.a = ephfVar;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.alny
    public final ephf a() {
        return this.a;
    }

    @Override // defpackage.alny
    public final String b() {
        return this.c;
    }

    @Override // defpackage.alny
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alny) {
            alny alnyVar = (alny) obj;
            if (this.a.equals(alnyVar.a()) && this.b == alnyVar.c()) {
                alnyVar.f();
                alnyVar.e();
                alnyVar.d();
                String str = this.c;
                if (str != null ? str.equals(alnyVar.b()) : alnyVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.c;
        return (((((((((iHashCode * 1000003) ^ this.b) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NumberAndValidity{phoneNumber=" + this.a.toString() + ", validity=" + ephh.a(this.b) + ", isPhoneWord=false, isDigitShortCode=false, isAlphaShortCode=false, parseRegion=" + this.c + "}";
    }

    @Override // defpackage.alny
    public final void d() {
    }

    @Override // defpackage.alny
    public final void e() {
    }

    @Override // defpackage.alny
    public final void f() {
    }
}
