package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvbj implements ehaw {
    final /* synthetic */ cvbm a;

    public cvbj(cvbm cvbmVar) {
        this.a = cvbmVar;
    }

    @Override // defpackage.ehaw
    public final /* synthetic */ egyk a() {
        return cvbm.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        return eiju.g(((ecjh) this.a.e.b()).a()).h(new ejvr() { // from class: cvbi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Optional.ofNullable((cvbc) obj);
            }
        }, eoqg.a);
    }
}
