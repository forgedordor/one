package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvx {
    public final fdvc a;
    public final Map b;
    public final fdvc c;
    public final hox d;
    public final List e;
    private final fdjx f;
    private final boolean g = true;

    public xvx(fdjx fdjxVar, fdvc fdvcVar, Map map, fdvc fdvcVar2, hox hoxVar, List list) {
        this.f = fdjxVar;
        this.a = fdvcVar;
        this.b = map;
        this.c = fdvcVar2;
        this.d = hoxVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvx)) {
            return false;
        }
        xvx xvxVar = (xvx) obj;
        if (!fdbq.f(this.f, xvxVar.f) || !fdbq.f(this.a, xvxVar.a) || !fdbq.f(this.b, xvxVar.b)) {
            return false;
        }
        boolean z = xvxVar.g;
        return fdbq.f(this.c, xvxVar.c) && fdbq.f(this.d, xvxVar.d) && fdbq.f(this.e, xvxVar.e);
    }

    public final int hashCode() {
        return (((((((((((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + 1231) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "FixedPager(coroutineScope=" + this.f + ", currentMessageId=" + this.a + ", mediaViewerUiDataMap=" + this.b + ", dynamicallyOffsetPages=true, footerUiDataFlow=" + this.c + ", pagingState=" + this.d + ", attachmentRendererUiDataList=" + this.e + ")";
    }
}
