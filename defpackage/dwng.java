package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwng extends dwqa {
    public final dwqs a;
    public final String b;

    public dwng(dwqs dwqsVar, String str) {
        this.a = dwqsVar;
        this.b = str;
    }

    @Override // defpackage.dwqa
    public final dwqs a() {
        return this.a;
    }

    @Override // defpackage.dwqa
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqa) {
            dwqa dwqaVar = (dwqa) obj;
            if (this.a.equals(dwqaVar.a()) && this.b.equals(dwqaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CustomizedWebView{webViewHeader=" + this.a.toString() + ", url=" + this.b + "}";
    }
}
