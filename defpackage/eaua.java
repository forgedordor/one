package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaua extends eava {
    public final String a;
    public final List b;
    public final deem c;

    public eaua(String str, List list, deem deemVar) {
        this.a = str;
        this.b = list;
        this.c = deemVar;
    }

    @Override // defpackage.eava, defpackage.eanv
    public final deem a() {
        return this.c;
    }

    @Override // defpackage.eava
    public final String b() {
        return this.a;
    }

    @Override // defpackage.eava
    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eava) {
            eava eavaVar = (eava) obj;
            if (this.a.equals(eavaVar.b()) && this.b.equals(eavaVar.c())) {
                eavaVar.e();
                deem deemVar = this.c;
                if (deemVar != null ? deemVar.equals(eavaVar.a()) : eavaVar.a() == null) {
                    eavaVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        deem deemVar = this.c;
        return ((iHashCode * (-721379959)) ^ (deemVar == null ? 0 : deemVar.hashCode())) * 1000003;
    }

    public final String toString() {
        deem deemVar = this.c;
        return "FetchPlaceRequest{placeId=" + this.a + ", placeFields=" + this.b.toString() + ", sessionToken=null, cancellationToken=" + String.valueOf(deemVar) + ", regionCode=null}";
    }

    @Override // defpackage.eava
    public final void d() {
    }

    @Override // defpackage.eava
    public final void e() {
    }
}
