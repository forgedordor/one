package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwor extends dwsj {
    private final String a;
    private final int b;

    public dwor(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.dwsj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dwsj
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwsj) {
            dwsj dwsjVar = (dwsj) obj;
            if (this.a.equals(dwsjVar.b()) && this.b == dwsjVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "UrlContentReplacement{pattern=" + this.a + ", substitute=" + this.b + "}";
    }
}
