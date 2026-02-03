package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdks implements egyi {
    final /* synthetic */ efwo a;
    final /* synthetic */ cdku b;

    public cdks(cdku cdkuVar, efwo efwoVar) {
        this.a = efwoVar;
        this.b = cdkuVar;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        eieu eieuVarK = eiiy.k("GaiaSettingsDataService#getGaiaAuthCheck#loadData");
        try {
            eopy eopyVar = new eopy(eork.i((egyh) this.b.i.get()));
            eieuVarK.a(eopyVar);
            eieuVarK.close();
            return eopyVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("GaiaSettingsDataService#getGaiaAuthCheck#fetchAndStoreData");
        try {
            if (abxb.a()) {
                cdku cdkuVar = this.b;
                fcsu fcsuVar = cdkuVar.g;
                if (((Optional) fcsuVar.b()).isEmpty()) {
                    cdku cdkuVar2 = this.b;
                    eijuVarE = eijx.e((egyh) cdkuVar2.i.getAndSet(egyh.a(new cdix(), ((cogw) cdkuVar2.h.b()).f())));
                } else {
                    eijuVarE = ((cdiq) ((Optional) fcsuVar.b()).get()).a(this.a).h(new ejvr() { // from class: cdkr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            cdku cdkuVar3 = this.a.b;
                            return (egyh) cdkuVar3.i.getAndSet(egyh.a((cdjb) obj, ((cogw) cdkuVar3.h.b()).f()));
                        }
                    }, cdkuVar.d);
                }
            } else {
                cdku cdkuVar22 = this.b;
                eijuVarE = eijx.e((egyh) cdkuVar22.i.getAndSet(egyh.a(new cdix(), ((cogw) cdkuVar22.h.b()).f())));
            }
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final /* synthetic */ Object c() {
        return cdku.b;
    }
}
