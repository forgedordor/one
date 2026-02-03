package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edhc extends edhk {
    private final edmp a;
    private final edmj b;

    public edhc(edmp edmpVar, edmj edmjVar) {
        this.a = edmpVar;
        this.b = edmjVar;
    }

    @Override // defpackage.edhk
    public final edmj a() {
        return this.b;
    }

    @Override // defpackage.edhk
    public final edmp b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edhk) {
            edhk edhkVar = (edhk) obj;
            if (this.a.equals(edhkVar.b()) && this.b.equals(edhkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        edmj edmjVar = this.b;
        return "ProfileModelProvider{profileStateRepository=" + this.a.toString() + ", mdiPhotoRepository=" + edmjVar.toString() + "}";
    }
}
