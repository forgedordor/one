package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eglz extends egmi {
    public final dyuo a;
    private final ejwi b;

    public eglz(dyuo dyuoVar, ejwi ejwiVar) {
        this.a = dyuoVar;
        this.b = ejwiVar;
    }

    @Override // defpackage.egmi
    public final dyuo a() {
        return this.a;
    }

    @Override // defpackage.egmi
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egmi) {
            egmi egmiVar = (egmi) obj;
            if (this.a.equals(egmiVar.a()) && this.b.equals(egmiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "Options{features=" + this.a.toString() + ", topViewCreator=Optional.absent()}";
    }
}
