package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebwi implements ebvg {
    private final ebwd a;

    public ebwi(ebwd ebwdVar) {
        this.a = ebwdVar;
    }

    @Override // defpackage.ebvg
    public final void a(String str, boolean z) {
        ListenableFuture listenableFuture;
        ebwd ebwdVar = this.a;
        if (!z) {
            if (ebwdVar.f.contains(str)) {
                return;
            }
            ebwdVar.l(str);
            return;
        }
        Map map = ebwdVar.h;
        if (map.containsKey(str)) {
            listenableFuture = (ListenableFuture) map.get(str);
        } else {
            ListenableFuture listenableFutureC = ebwdVar.a.c(str);
            map.put(str, listenableFutureC);
            listenableFuture = listenableFutureC;
        }
        eork.r(listenableFuture, new ebvw(ebwdVar), ebvf.a);
    }

    @Override // defpackage.ebvg
    public final void b() {
    }
}
