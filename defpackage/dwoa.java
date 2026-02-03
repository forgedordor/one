package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoa extends dwri {
    public final ekgb a;
    public final int b;
    public final ejwi c;

    public dwoa(ekgb ekgbVar, int i, ejwi ejwiVar) {
        this.a = ekgbVar;
        this.b = i;
        this.c = ejwiVar;
    }

    @Override // defpackage.dwri
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dwri
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dwri
    public final ekgb c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwri) {
            dwri dwriVar = (dwri) obj;
            if (ekjz.h(this.a, dwriVar.c()) && this.b == dwriVar.a() && this.c.equals(dwriVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        return "RichCardButtons{buttons=" + String.valueOf(this.a) + ", orientation=" + this.b + ", horizontalAlignment=" + String.valueOf(ejwiVar) + "}";
    }
}
