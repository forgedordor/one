package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwon extends dwsg {
    public final String a;
    private final String b;
    private final ekgb c;
    private final int d;
    private final String e;

    public dwon(String str, String str2, ekgb ekgbVar, int i, String str3) {
        this.b = str;
        this.a = str2;
        this.c = ekgbVar;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.dwsg
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dwsg
    public final ekgb b() {
        return this.c;
    }

    @Override // defpackage.dwsg
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dwsg
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dwsg
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwsg) {
            dwsg dwsgVar = (dwsg) obj;
            if (this.b.equals(dwsgVar.d()) && this.a.equals(dwsgVar.e()) && ekjz.h(this.c, dwsgVar.b()) && this.d == dwsgVar.a() && this.e.equals(dwsgVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "SuggestionList{id=" + this.b + ", messageId=" + this.a + ", suggestions=" + String.valueOf(this.c) + ", renderStyle=" + this.d + ", hintText=" + this.e + "}";
    }
}
