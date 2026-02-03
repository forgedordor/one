package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdqr implements efze, efzf {
    public final egkc a;
    public final egbf b;
    public final eosc c;

    public cdqr(egkc egkcVar, egbf egbfVar, eosc eoscVar) {
        this.a = egkcVar;
        this.b = egbfVar;
        this.c = eoscVar;
    }

    @Override // defpackage.efze, defpackage.efzc
    public final ListenableFuture a(final efzi efziVar) {
        return eiju.g(this.a.a(efziVar)).i(new eooz() { // from class: cdqp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final efwo efwoVar = (efwo) obj;
                if (efwoVar == null) {
                    return eijx.e(null);
                }
                final efzi efziVar2 = efziVar;
                cdqr cdqrVar = this.a;
                return eiju.g(cdqrVar.b.c(efwoVar)).h(eiid.a(new ejvr() { // from class: cdqq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        if (((egbe) obj2).b().k.equals("pseudonymous")) {
                            return null;
                        }
                        efwo efwoVar2 = efwoVar;
                        ((egal) efziVar2).a.putExtra("use_default_account_selector", true);
                        return efwoVar2;
                    }
                }), cdqrVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        return this.a.b(efwoVar);
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }
}
