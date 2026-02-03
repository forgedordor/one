package defpackage;

import java.util.Iterator;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqb implements eyif {
    public static CronetEngine a(Object obj, Set set) {
        ExperimentalCronetEngine experimentalCronetEngine = ((esqe) obj).a(false).a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            experimentalCronetEngine.addRequestFinishedListener((RequestFinishedInfo.Listener) it.next());
        }
        experimentalCronetEngine.getClass();
        return experimentalCronetEngine;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
