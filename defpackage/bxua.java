package defpackage;

import android.os.CancellationSignal;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxua extends bxwo {
    public bxwq a;
    public CancellationSignal b;
    private List c;

    @Override // defpackage.bxwo
    public final SearchQuery a() {
        List list = this.c;
        if (list != null) {
            return new bxub(list, this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: searchFilters");
    }

    @Override // defpackage.bxwo
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null searchFilters");
        }
        this.c = list;
    }
}
