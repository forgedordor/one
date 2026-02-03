package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edqg extends edqh {
    private final ekgb a;

    public edqg(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.edra
    public final int b() {
        return 1;
    }

    @Override // defpackage.edqh, defpackage.edra
    public final ekgb d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edra) {
            edra edraVar = (edra) obj;
            if (edraVar.b() == 1 && ekjz.h(this.a, edraVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content{mePhotos=" + this.a.toString() + "}";
    }
}
