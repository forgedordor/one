package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edqe extends edqh {
    private final ekgb a;

    public edqe(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.edqh, defpackage.edra
    public final ekgb a() {
        return this.a;
    }

    @Override // defpackage.edra
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edra) {
            edra edraVar = (edra) obj;
            if (edraVar.b() == 3 && ekjz.h(this.a, edraVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content{allPhotos=" + this.a.toString() + "}";
    }
}
