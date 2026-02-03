package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwux extends dwvz {
    public final ekgb a;
    public final ejwi b;

    public dwux(ekgb ekgbVar, ejwi ejwiVar) {
        this.a = ekgbVar;
        this.b = ejwiVar;
    }

    @Override // defpackage.dwvz
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dwvz
    public final ekgb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwvz) {
            dwvz dwvzVar = (dwvz) obj;
            if (ekjz.h(this.a, dwvzVar.b()) && this.b.equals(dwvzVar.a())) {
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
        return "StackCard{components=" + String.valueOf(this.a) + ", preferredMaxWidth=" + String.valueOf(ejwiVar) + "}";
    }
}
