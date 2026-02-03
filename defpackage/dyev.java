package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyev extends dygp {
    public final dyhk a;
    public final dygj b;
    public final ejwi c;
    public final dygm d;

    public dyev(dyhk dyhkVar, dygj dygjVar, ejwi ejwiVar, dygm dygmVar) {
        this.a = dyhkVar;
        this.b = dygjVar;
        this.c = ejwiVar;
        this.d = dygmVar;
    }

    @Override // defpackage.dygp
    public final dygj a() {
        return this.b;
    }

    @Override // defpackage.dygp
    public final dygm b() {
        return this.d;
    }

    @Override // defpackage.dygp
    public final dyhk c() {
        return this.a;
    }

    @Override // defpackage.dygp
    public final ejwi d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dygp) {
            dygp dygpVar = (dygp) obj;
            if (this.a.equals(dygpVar.c()) && this.b.equals(dygpVar.a()) && this.c.equals(dygpVar.d()) && this.d.equals(dygpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dygm dygmVar = this.d;
        ejwi ejwiVar = this.c;
        dygj dygjVar = this.b;
        return "TextualCardInitialData{cardIcon=" + this.a.toString() + ", titleData=" + dygjVar.toString() + ", highlightId=" + String.valueOf(ejwiVar) + ", visualElementsInfo=" + dygmVar.toString() + "}";
    }
}
