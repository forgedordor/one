package defpackage;

import android.os.CancellationSignal;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxub extends SearchQuery {
    private final List a;
    private final bxwq b;
    private final CancellationSignal c;

    public bxub(List list, bxwq bxwqVar, CancellationSignal cancellationSignal) {
        this.a = list;
        this.b = bxwqVar;
        this.c = cancellationSignal;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery
    public final CancellationSignal a() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery
    public final bxwq b() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery
    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        bxwq bxwqVar;
        CancellationSignal cancellationSignal;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchQuery) {
            SearchQuery searchQuery = (SearchQuery) obj;
            if (this.a.equals(searchQuery.c()) && ((bxwqVar = this.b) != null ? bxwqVar.equals(searchQuery.b()) : searchQuery.b() == null) && ((cancellationSignal = this.c) != null ? cancellationSignal.equals(searchQuery.a()) : searchQuery.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        bxwq bxwqVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bxwqVar == null ? 0 : bxwqVar.hashCode())) * 1000003;
        CancellationSignal cancellationSignal = this.c;
        return iHashCode2 ^ (cancellationSignal != null ? cancellationSignal.hashCode() : 0);
    }

    public final String toString() {
        CancellationSignal cancellationSignal = this.c;
        bxwq bxwqVar = this.b;
        return "SearchQuery{searchFilters=" + this.a.toString() + ", limits=" + String.valueOf(bxwqVar) + ", cancellationSignal=" + String.valueOf(cancellationSignal) + "}";
    }
}
