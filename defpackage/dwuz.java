package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwuz extends dwwb {
    public final String a;
    public final dwvz b;

    public dwuz(String str, dwvz dwvzVar) {
        this.a = str;
        this.b = dwvzVar;
    }

    @Override // defpackage.dwwb
    public final dwvz a() {
        return this.b;
    }

    @Override // defpackage.dwwb
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwwb) {
            dwwb dwwbVar = (dwwb) obj;
            if (this.a.equals(dwwbVar.b()) && this.b.equals(dwwbVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "StandaloneCard{jsonSource=" + this.a + ", stackCard=" + String.valueOf(this.b) + "}";
    }
}
