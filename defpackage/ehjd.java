package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjd implements eyif {
    public static ehlj a(final eheg ehegVar, final ebbw ebbwVar, ejwi ejwiVar) {
        ehegVar.getClass();
        return new ehlj() { // from class: ehiz
            @Override // defpackage.ehlj
            public final ListenableFuture a() {
                if (!ehjc.a(ebbwVar)) {
                    return eorv.a;
                }
                ListenableFuture listenableFutureE = ehegVar.e();
                egoc.c(listenableFutureE, "Failed to obtain initial snapshot", new Object[0]);
                return listenableFutureE;
            }
        };
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
