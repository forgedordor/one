package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwnm extends dwqh {
    private final String a;
    private final dwjr b;
    private final ejwi c;

    public dwnm(String str, dwjr dwjrVar, ejwi ejwiVar) {
        this.a = str;
        this.b = dwjrVar;
        this.c = ejwiVar;
    }

    @Override // defpackage.dwqh
    public final dwjr a() {
        return this.b;
    }

    @Override // defpackage.dwqh
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dwqh
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqh) {
            dwqh dwqhVar = (dwqh) obj;
            if (this.a.equals(dwqhVar.c()) && this.b.equals(dwqhVar.a()) && this.c.equals(dwqhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        return "LighterMenuItem{menuName=" + this.a + ", action=" + this.b.toString() + ", icon=" + String.valueOf(ejwiVar) + "}";
    }
}
