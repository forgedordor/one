package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwop extends dwsk {
    private final String a;
    private final ekgb b;

    public dwop(String str, ekgb ekgbVar) {
        this.a = str;
        this.b = ekgbVar;
    }

    @Override // defpackage.dwsk
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dwsk
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwsk) {
            dwsk dwskVar = (dwsk) obj;
            if (this.a.equals(dwskVar.b()) && ekjz.h(this.b, dwskVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "UrlAction{url=" + this.a + ", replacements=" + this.b.toString() + "}";
    }
}
