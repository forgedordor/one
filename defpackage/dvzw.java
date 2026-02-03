package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzw extends dwat {
    public final dwpo a;
    public final ejwi b;

    public dvzw(dwpo dwpoVar, ejwi ejwiVar) {
        this.a = dwpoVar;
        this.b = ejwiVar;
    }

    @Override // defpackage.dwat
    public final dwpo a() {
        return this.a;
    }

    @Override // defpackage.dwat
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwat) {
            dwat dwatVar = (dwat) obj;
            if (this.a.equals(dwatVar.a()) && this.b.equals(dwatVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "CreateGroup{conversation=" + this.a.toString() + ", groupInfo=" + ejwiVar.toString() + "}";
    }
}
