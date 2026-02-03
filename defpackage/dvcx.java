package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvcx extends dvcw {
    public final String a;
    public final String b;

    public dvcx(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dvcw
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dvcw
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvcw) {
            dvcw dvcwVar = (dvcw) obj;
            if (this.a.equals(dvcwVar.b())) {
                dvcwVar.c();
                dvcwVar.e();
                if (this.b.equals(dvcwVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 583896283) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ApplicationId{packageName=" + this.a + ", attributionTag=null, moduleName=null, instanceId=" + this.b + "}";
    }

    @Override // defpackage.dvcw
    public final void c() {
    }

    @Override // defpackage.dvcw
    public final void e() {
    }
}
