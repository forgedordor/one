package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwol extends dwse {
    private final int a;
    private final String b;
    private final ejwi c;
    private final dwjr d;
    private final String e;

    public dwol(int i, String str, ejwi ejwiVar, dwjr dwjrVar, String str2) {
        this.a = i;
        this.b = str;
        this.c = ejwiVar;
        this.d = dwjrVar;
        this.e = str2;
    }

    @Override // defpackage.dwse
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dwse
    public final dwjr b() {
        return this.d;
    }

    @Override // defpackage.dwse
    public final ejwi c() {
        return this.c;
    }

    @Override // defpackage.dwse
    public final String d() {
        return this.e;
    }

    @Override // defpackage.dwse
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwse) {
            dwse dwseVar = (dwse) obj;
            if (this.a == dwseVar.a() && this.b.equals(dwseVar.e()) && this.c.equals(dwseVar.c()) && this.d.equals(dwseVar.b()) && this.e.equals(dwseVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        dwjr dwjrVar = this.d;
        return "Suggestion{id=" + this.a + ", text=" + this.b + ", lighterIcon=" + String.valueOf(this.c) + ", action=" + String.valueOf(dwjrVar) + ", secondaryText=" + this.e + "}";
    }
}
