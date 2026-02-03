package defpackage;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvcb {
    private final G3AttributionInfo a;
    private final ekhx b;

    public dvcb(G3AttributionInfo g3AttributionInfo, ekhx ekhxVar) {
        this.a = g3AttributionInfo;
        this.b = ekhxVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvcb) {
            dvcb dvcbVar = (dvcb) obj;
            if (Objects.equals(this.a, dvcbVar.a) && Objects.equals(this.b, dvcbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        ekhx ekhxVar = this.b;
        return "{attributionInfo: " + String.valueOf(this.a) + ", parentTypes: " + String.valueOf(ekhxVar) + "}";
    }
}
