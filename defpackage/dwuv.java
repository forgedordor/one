package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwuv extends dwvr {
    public final dwvu a;
    private final String b;
    private final evqs c;
    private final int d;
    private final int e;
    private final String f;

    public dwuv(dwvu dwvuVar, String str, evqs evqsVar, int i, int i2, String str2) {
        this.a = dwvuVar;
        this.b = str;
        this.c = evqsVar;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    @Override // defpackage.dwvr
    public final int a() {
        return this.e;
    }

    @Override // defpackage.dwvr
    public final int b() {
        return this.d;
    }

    @Override // defpackage.dwvr
    public final dwvu c() {
        return this.a;
    }

    @Override // defpackage.dwvr
    public final evqs d() {
        return this.c;
    }

    @Override // defpackage.dwvr
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwvr) {
            dwvr dwvrVar = (dwvr) obj;
            if (this.a.equals(dwvrVar.c()) && ((str = this.b) != null ? str.equals(dwvrVar.e()) : dwvrVar.e() == null) && this.c.equals(dwvrVar.d()) && this.d == dwvrVar.b() && this.e == dwvrVar.a() && this.f.equals(dwvrVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwvr
    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        evqs evqsVar = this.c;
        return "MediaElement{mediaSource=" + String.valueOf(this.a) + ", localURI=" + this.b + ", thumbnail=" + String.valueOf(evqsVar) + ", width=" + this.d + ", height=" + this.e + ", mediaDescription=" + this.f + "}";
    }
}
