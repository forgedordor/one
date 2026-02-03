package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csfn implements csfp {
    public final String a;
    public final ekgb b;
    public final ekgb c;

    public csfn(String str, ekgb ekgbVar, ekgb ekgbVar2) {
        this.a = str;
        this.b = ekgbVar;
        this.c = ekgbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csfn)) {
            return false;
        }
        csfn csfnVar = (csfn) obj;
        return fdbq.f(this.a, csfnVar.a) && fdbq.f(this.b, csfnVar.b) && fdbq.f(this.c, csfnVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LoadedTemplates(version=" + this.a + ", rcsTemplates=" + this.b + ", xmsTemplates=" + this.c + ")";
    }
}
