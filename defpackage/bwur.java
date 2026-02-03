package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwur {
    public final E2eeInfo a;
    public final Map b;
    public final aoer c;

    public bwur(E2eeInfo e2eeInfo, Map map, aoer aoerVar) {
        e2eeInfo.getClass();
        this.a = e2eeInfo;
        this.b = map;
        this.c = aoerVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwur)) {
            return false;
        }
        bwur bwurVar = (bwur) obj;
        return fdbq.f(this.a, bwurVar.a) && fdbq.f(this.b, bwurVar.b) && fdbq.f(this.c, bwurVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aoer aoerVar = this.c;
        return (iHashCode * 31) + (aoerVar == null ? 0 : aoerVar.hashCode());
    }

    public final String toString() {
        return "DetailsPageE2eeInfoResult(selfE2eeInfo=" + this.a + ", e2eeInfoMap=" + this.b + ", selfIdentity=" + this.c + ")";
    }
}
