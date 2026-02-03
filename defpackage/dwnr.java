package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnr extends dwrb {
    private final dwra a;
    private final String b;
    private final dwqy c;

    public dwnr(dwra dwraVar, String str, dwqy dwqyVar) {
        this.a = dwraVar;
        this.b = str;
        this.c = dwqyVar;
    }

    @Override // defpackage.dwrb
    public final dwqy a() {
        return this.c;
    }

    @Override // defpackage.dwrb
    public final dwra b() {
        return this.a;
    }

    @Override // defpackage.dwrb
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwrb) {
            dwrb dwrbVar = (dwrb) obj;
            if (this.a.equals(dwrbVar.b()) && this.b.equals(dwrbVar.c()) && this.c.equals(dwrbVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dwqy dwqyVar = this.c;
        return "MessageDecoration{renderCriteria=" + this.a.toString() + ", decorationId=" + this.b + ", content=" + dwqyVar.toString() + "}";
    }
}
