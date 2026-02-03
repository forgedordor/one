package defpackage;

import java.util.Iterator;
import java.util.Set;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqc implements eyif {
    public static esqd a(Object obj, Set set) {
        esqd esqdVarA = ((esqe) obj).a(true);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            esqdVarA.a.addRequestFinishedListener((RequestFinishedInfo.Listener) it.next());
        }
        esqdVarA.getClass();
        return esqdVarA;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
