package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class egst {
    public static ListenableFuture a(egsu egsuVar, String str, pzz pzzVar, qav qavVar) {
        return egsuVar.g(str, pzzVar, Collections.singletonList(qavVar));
    }

    public static ListenableFuture b(ListenableFuture listenableFuture) {
        return eika.j(listenableFuture, new ejvr() { // from class: egss
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }
}
