package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drae extends drai {
    private final ewut a;
    private final ekgb b;
    private final ekgb c;

    public drae(ewut ewutVar, ekgb ekgbVar, ekgb ekgbVar2) {
        if (ewutVar == null) {
            throw new NullPointerException("Null corpus");
        }
        this.a = ewutVar;
        if (ekgbVar == null) {
            throw new NullPointerException("Null elementsToUpdate");
        }
        this.b = ekgbVar;
        if (ekgbVar2 == null) {
            throw new NullPointerException("Null elementsToDelete");
        }
        this.c = ekgbVar2;
    }

    @Override // defpackage.drai
    public final ekgb a() {
        return this.c;
    }

    @Override // defpackage.drai
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.drai
    public final ewut c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drai) {
            drai draiVar = (drai) obj;
            if (this.a.equals(draiVar.c()) && ekjz.h(this.b, draiVar.b()) && ekjz.h(this.c, draiVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.c;
        ekgb ekgbVar2 = this.b;
        return "CorpusUploadMutation{corpus=" + this.a.toString() + ", elementsToUpdate=" + ekgbVar2.toString() + ", elementsToDelete=" + ekgbVar.toString() + "}";
    }
}
