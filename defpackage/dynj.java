package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dynj extends dynk {
    private final String a;
    private final String b;
    private final String c;

    public dynj(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.dynk
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dynk
    public final String b() {
        return this.c;
    }

    @Override // defpackage.dynk
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dynk) {
            dynk dynkVar = (dynk) obj;
            dynkVar.j();
            String str = this.a;
            if (str != null ? str.equals(dynkVar.c()) : dynkVar.c() == null) {
                if (this.b.equals(dynkVar.a())) {
                    dynkVar.e();
                    dynkVar.d();
                    dynkVar.f();
                    dynkVar.h();
                    dynkVar.g();
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(dynkVar.b()) : dynkVar.b() == null) {
                        dynkVar.i();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 375623332) * 1000003) ^ this.b.hashCode();
        String str2 = this.c;
        return (((((((iHashCode * 583896283) ^ 1237) * 1000003) ^ 1) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ 1;
    }

    public final String toString() {
        return "DeviceOwner{isMetadataAvailable=true, displayName=" + this.a + ", accountName=" + this.b + ", givenName=null, familyName=null, isG1User=false, isDasherUser=UNKNOWN, obfuscatedGaiaId=null, avatarUrl=" + this.c + ", isUnicornUser=UNKNOWN}";
    }

    @Override // defpackage.dynk
    public final void d() {
    }

    @Override // defpackage.dynk
    public final void e() {
    }

    @Override // defpackage.dynk
    public final void f() {
    }

    @Override // defpackage.dynk
    public final void g() {
    }

    @Override // defpackage.dynk
    public final void h() {
    }

    @Override // defpackage.dynk
    public final void i() {
    }

    @Override // defpackage.dynk
    public final void j() {
    }
}
