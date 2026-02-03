package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efyf implements efyq {
    private final egcd a;

    public efyf(egcd egcdVar) {
        this.a = egcdVar;
    }

    @Override // defpackage.efyq
    public final ListenableFuture a(efwo efwoVar, efyr efyrVar) {
        ListenableFuture listenableFutureH = this.a.h(efwoVar);
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: efyc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new efyh();
            }
        });
        eoqg eoqgVar = eoqg.a;
        return eooq.f(eooh.f(listenableFutureH, IllegalArgumentException.class, ejvrVarA, eoqgVar), eiid.a(new ejvr() { // from class: efyd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return egbd.d();
                }
                throw new efyh();
            }
        }), eoqgVar);
    }
}
