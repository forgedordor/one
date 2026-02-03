package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvc extends dxvd {
    public final int a;
    public final int b;
    private final String c;

    public dxvc(String str, int i, int i2) {
        this.c = str;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dxvd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dxvd
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dxvd
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxvd) {
            dxvd dxvdVar = (dxvd) obj;
            if (this.c.equals(dxvdVar.c())) {
                dxvdVar.d();
                if (this.a == dxvdVar.b() && this.b == dxvdVar.a()) {
                    dxvdVar.f();
                    dxvdVar.e();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * (-721379959)) ^ this.a) * 1000003) ^ this.b) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "GnpMedia{url=" + this.c + ", accountName=null, width=" + this.a + ", height=" + this.b + ", shouldAuthenticateFifeUrls=false, shouldApplyFifeOptions=false}";
    }

    @Override // defpackage.dxvd
    public final void d() {
    }

    @Override // defpackage.dxvd
    public final void e() {
    }

    @Override // defpackage.dxvd
    public final void f() {
    }
}
