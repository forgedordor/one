package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eauj extends eavj {
    public final List a;
    public final deem b;

    public eauj(List list, deem deemVar) {
        this.a = list;
        this.b = deemVar;
    }

    @Override // defpackage.eavj, defpackage.eanv
    public final deem a() {
        return this.b;
    }

    @Override // defpackage.eavj
    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        deem deemVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavj) {
            eavj eavjVar = (eavj) obj;
            if (this.a.equals(eavjVar.b()) && ((deemVar = this.b) != null ? deemVar.equals(eavjVar.a()) : eavjVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        deem deemVar = this.b;
        return (iHashCode * 1000003) ^ (deemVar == null ? 0 : deemVar.hashCode());
    }

    public final String toString() {
        deem deemVar = this.b;
        return "FindCurrentPlaceRequest{placeFields=" + this.a.toString() + ", cancellationToken=" + String.valueOf(deemVar) + "}";
    }
}
