package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egir {
    private final egcd a;

    public egir(egcd egcdVar) {
        this.a = egcdVar;
    }

    public final ListenableFuture a(int i) {
        if (i == -1) {
            return eork.h(new egdj());
        }
        egcd egcdVar = this.a;
        final efwo efwoVarB = efwo.b(i);
        return eooq.f(egcdVar.h(efwoVarB), eiid.a(new ejvr() { // from class: egiq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return efwoVarB;
                }
                throw new egdj("Stored account is disabled. Avoid this situation with an AccountDisabledInterceptor as described in go/tiktok-account/storage.md#storing-account-data-in-singleton-storage");
            }
        }), eoqg.a);
    }
}
