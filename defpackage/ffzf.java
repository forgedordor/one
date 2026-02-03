package defpackage;

import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzf implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ffzg ffzgVar = (ffzg) obj;
        ffzg ffzgVar2 = (ffzg) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(ffzgVar.a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(ffzgVar2.a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(ffzgVar.a.getVersion(), ffzgVar2.a.getVersion());
    }
}
