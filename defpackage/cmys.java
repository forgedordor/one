package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmys implements eqcb {
    private final aubq a;
    private final cmyr b;
    private final ahks c;

    public cmys(aubq aubqVar, ahks ahksVar) {
        aubqVar.getClass();
        ahksVar.getClass();
        this.a = aubqVar;
        this.c = ahksVar;
        ahkn ahknVar = ahksVar.a.a;
        this.b = new cmyr(aubqVar, (eosc) ahknVar.y.b(), (eosc) ahknVar.p.b(), (cejj) ahknVar.a.tJ.b(), new cmyu(), ahknVar.a.xR);
    }

    @Override // defpackage.eqcb
    public final ListenableFuture a() {
        final cmyr cmyrVar = this.b;
        eieu eieuVarK = eiiy.k("TachygramAuthTokenProvider#getAuthToken");
        try {
            eiju eijuVarI = cmyrVar.a.e(cmyrVar.d.d, 15).i(new eooz() { // from class: cmyo
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return ((cejg) obj).l();
                }
            }, ((asep) cmyrVar.e.b()).a() ? cmyrVar.c : cmyrVar.b);
            ejvr ejvrVar = new ejvr() { // from class: cmyp
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((ezns) obj).b;
                }
            };
            eosc eoscVar = cmyrVar.c;
            eiju eijuVarF = eijuVarI.h(ejvrVar, eoscVar).f(fbtf.class, new eooz() { // from class: cmyq
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    fbtf fbtfVar = (fbtf) obj;
                    fbtfVar.getClass();
                    Status status = fbtfVar.a;
                    status.getClass();
                    return eijx.d(new eqco(eqfj.a(status, fbtfVar.b), fbtfVar));
                }
            }, eoscVar);
            eieuVarK.b(eijuVarF);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eqcb
    public final Object b(fcxy fcxyVar) {
        return fdxs.c(a(), fcxyVar);
    }
}
