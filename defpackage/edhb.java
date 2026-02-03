package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edhb extends edhg {
    private final ejwi a;
    private final edlf b;
    private final edln c;
    private final edlv d;
    private final edlj e;
    private final edlb f;

    public edhb(ejwi ejwiVar, edlf edlfVar, edln edlnVar, edlv edlvVar, edlj edljVar, edlb edlbVar) {
        this.a = ejwiVar;
        this.b = edlfVar;
        this.c = edlnVar;
        this.d = edlvVar;
        this.e = edljVar;
        this.f = edlbVar;
    }

    @Override // defpackage.edhg
    public final edlb a() {
        return this.f;
    }

    @Override // defpackage.edhg
    public final edlf b() {
        return this.b;
    }

    @Override // defpackage.edhg
    public final edlj c() {
        return this.e;
    }

    @Override // defpackage.edhg
    public final edln e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edhg) {
            edhg edhgVar = (edhg) obj;
            if (this.a.equals(edhgVar.k()) && this.b.equals(edhgVar.b()) && this.c.equals(edhgVar.e()) && this.d.equals(edhgVar.f()) && this.e.equals(edhgVar.c()) && this.f.equals(edhgVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edhg
    public final edlv f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // defpackage.edhg
    public final ejwi k() {
        return this.a;
    }

    public final String toString() {
        edlb edlbVar = this.f;
        edlj edljVar = this.e;
        edlv edlvVar = this.d;
        edln edlnVar = this.c;
        edlf edlfVar = this.b;
        return "ModelProvider{artCollectionsRepository=" + this.a.toString() + ", clusterPhotosRepository=" + edlfVar.toString() + ", meClusterPhotosRepository=" + edlnVar.toString() + ", suggestedPhotosRepository=" + edlvVar.toString() + ", clustersRepository=" + edljVar.toString() + ", devicePhotosFetcher=" + edlbVar.toString() + "}";
    }
}
