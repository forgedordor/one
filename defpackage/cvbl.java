package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvbl implements ehaw {
    final /* synthetic */ cvbm a;

    public cvbl(cvbm cvbmVar) {
        this.a = cvbmVar;
    }

    @Override // defpackage.ehaw
    public final /* synthetic */ egyk a() {
        return cvbm.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        cvbm cvbmVar = this.a;
        return !cvbmVar.d.get() ? eijx.e(Optional.empty()) : eiju.g(((ecjh) cvbmVar.e.b()).a()).h(new ejvr() { // from class: cvbk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Optional.ofNullable((cvbc) obj);
            }
        }, eoqg.a);
    }
}
