package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edqf extends edqh {
    private final ekgb a;

    public edqf(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.edra
    public final int b() {
        return 2;
    }

    @Override // defpackage.edqh, defpackage.edra
    public final ekgb c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edra) {
            edra edraVar = (edra) obj;
            if (edraVar.b() == 2 && ekjz.h(this.a, edraVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content{clusters=" + this.a.toString() + "}";
    }
}
