package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class cema implements cemb {
    public final cfwu a;
    public final cedm b;
    public final cezv c;
    public final cejj d;
    public final Object e = new Object();
    public final Map f = new HashMap();
    public final ains g;
    public final eygg h;
    public final cenj i;
    private final eosc j;
    private final Optional k;
    private final Optional l;
    private final aipo m;
    private final cepq n;

    public cema(eosc eoscVar, Optional optional, cezv cezvVar, cfwu cfwuVar, cedm cedmVar, cejj cejjVar, ains ainsVar, Optional optional2, eygg eyggVar, cenj cenjVar, aipo aipoVar, cepq cepqVar) {
        this.j = eoscVar;
        this.c = cezvVar;
        this.k = optional;
        this.a = cfwuVar;
        this.m = aipoVar;
        this.n = cepqVar;
        this.b = cedmVar;
        this.d = cejjVar;
        this.g = ainsVar;
        this.l = optional2;
        this.h = eyggVar;
        this.i = cenjVar;
    }

    @Override // defpackage.cemb
    public final eiju a(cfrj cfrjVar) {
        return b(cfrjVar, cepz.d());
    }

    public final eiju b(final cfrj cfrjVar, cepz cepzVar) {
        eiju eijuVarW;
        ceoc ceocVar = (ceoc) cepzVar;
        String str = ((ceob) ceocVar.b).a;
        ainv ainvVarB = str == null ? aioo.a : this.m.b(str);
        cepq cepqVar = this.n;
        cepp ceppVar = ceocVar.a;
        cfrh cfrhVarB = cfrjVar.b();
        int iOrdinal = cfrhVarB.a().ordinal();
        if (iOrdinal == 0) {
            throw new UnsupportedOperationException("UNREGISTERED support not implemented");
        }
        if (iOrdinal == 1) {
            eijuVarW = this.b.w();
        } else {
            if (iOrdinal != 2) {
                throw new UnsupportedOperationException("unknown registration type ".concat(cfrhVarB.toString()));
            }
            eijuVarW = this.d.a((cfre) cfrhVarB).i(new eooz() { // from class: cels
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return ((cejg) obj).w();
                }
            }, eoqg.a);
        }
        eiju eijuVarA = cepqVar.a(ceppVar, c(cfrjVar, eijuVarW));
        eooz eoozVar = new eooz() { // from class: celw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eiju eijuVarM;
                Throwable th = (Throwable) obj;
                if (cems.a(th) != Status.Code.UNAUTHENTICATED) {
                    return eijx.d(th);
                }
                cfrj cfrjVar2 = cfrjVar;
                cema cemaVar = this.a;
                cqca.c("BugleNetwork", "Handle UNAUTHENTICATED error by immediately refresh registration.");
                cfrh cfrhVarB2 = cfrjVar2.b();
                int iOrdinal2 = cfrhVarB2.a().ordinal();
                if (iOrdinal2 == 0) {
                    throw new UnsupportedOperationException("UNREGISTERED support not implemented");
                }
                if (iOrdinal2 == 1) {
                    eijuVarM = cemaVar.b.m(cedo.FORCE_REFRESH);
                } else {
                    if (iOrdinal2 != 2) {
                        throw new UnsupportedOperationException("unknown registration type ".concat(cfrhVarB2.toString()));
                    }
                    eijuVarM = cemaVar.d.a((cfre) cfrhVarB2).i(new eooz() { // from class: cely
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ((cejg) obj2).m(cedo.FORCE_REFRESH);
                        }
                    }, eoqg.a);
                }
                return cemaVar.c(cfrjVar2, eijuVarM);
            }
        };
        eosc eoscVar = this.j;
        eiju eijuVarI = eijuVarA.f(Throwable.class, eoozVar, eoscVar).i(new eooz() { // from class: celx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cfrj cfrjVar2 = cfrjVar;
                ListenableFuture listenableFutureE = cfrjVar2.e((evuh) obj);
                cfrjVar2.j();
                return listenableFutureE;
            }
        }, eoqg.a);
        eika.l(eijuVarI, new celz(this, ainvVarB, cepzVar, cfrjVar), eoscVar);
        return eijuVarI;
    }

    public final eiju c(final cfrj cfrjVar, eiju eijuVar) {
        final String str = cfrjVar.b().a() == cfrg.PHONE_NUMBER ? "RCS" : "Bugle";
        eooz eoozVar = new eooz() { // from class: celu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezpo ezpoVarA = this.a.i.a(str);
                evqs evqsVar = ((ezns) obj).b;
                ezpoVarA.copyOnWrite();
                ezpp ezppVar = (ezpp) ezpoVarA.instance;
                ezpp ezppVar2 = ezpp.a;
                evqsVar.getClass();
                ezppVar.f = evqsVar;
                return cfrjVar.c((ezpp) ezpoVarA.build());
            }
        };
        eosc eoscVar = this.j;
        return eijuVar.i(eoozVar, eoscVar).i(new eooz() { // from class: celv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cema cemaVar = this.a;
                cfrj cfrjVar2 = cfrjVar;
                evuh evuhVar = (evuh) obj;
                if (evuhVar != null) {
                    cemaVar.g.g("Bugle.Network.Rpc.Request.Size.Bytes", evuhVar.getSerializedSize());
                    cfrjVar2.i();
                }
                return cfrjVar2.d(cemaVar.c, evuhVar);
            }
        }, eoscVar);
    }

    @Override // defpackage.cfwt
    public final eiju d() {
        if (!this.l.isPresent()) {
            cqca.n("BugleNetwork", "DittoForegroundService is not supported in this device");
            return eijx.d(new UnsupportedOperationException("DittoForegroundService is not available in this device"));
        }
        cqca.l("BugleNetwork", "Retrying RPC and showing notification");
        Optional optional = this.k;
        return (optional.isPresent() ? ((cfzf) optional.get()).d() : eijx.e(null)).i(new eooz() { // from class: celt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((bvit) this.a.h.b()).d();
            }
        }, eoqg.a);
    }
}
