package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eawn extends eawo {
    public final String a;
    public final int b;

    public eawn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.eawo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eawo
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eawo) {
            eawo eawoVar = (eawo) obj;
            if (this.a.equals(eawoVar.b()) && this.b == eawoVar.a()) {
                eawoVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ 1;
    }

    public final String toString() {
        return "ClientProfile{packageName=" + this.a + ", versionCode=" + this.b + ", requestSource=PROGRAMMATIC_API}";
    }

    @Override // defpackage.eawo
    public final void c() {
    }
}
