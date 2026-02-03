package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvku implements eora {
    final /* synthetic */ dwje a;
    final /* synthetic */ long b;
    final /* synthetic */ dvkv c;

    public dvku(dvkv dvkvVar, dwje dwjeVar, long j) {
        this.a = dwjeVar;
        this.b = j;
        this.c = dvkvVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dvkv dvkvVar = this.c;
        dwaq dwaqVar = (dwaq) obj;
        final dwje dwjeVar = this.a;
        dvkvVar.e(dwjeVar);
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.g(10105);
        dwib dwibVar = new dwib();
        dwibVar.b = ejwi.j(Integer.valueOf(dwaqVar.a()));
        dvhn.a();
        dwibVar.c = ejwi.j(Long.valueOf(System.currentTimeMillis() - this.b));
        dwhpVarR.b(dwibVar.a());
        dvkvVar.e.b(dwhpVarR.a());
        if (dwaqVar.b()) {
            cdps cdpsVar = dvkvVar.i;
            if (((Boolean) cdpsVar.c.b()).booleanValue()) {
                cdpt.a.m("Lighter bootstrap succeeded, trigger full sync");
                final cdrv cdrvVar = (cdrv) cdpsVar.d;
                final eooy eooyVar = new eooy() { // from class: cdru
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final cdrv cdrvVar2 = cdrvVar;
                        eiju eijuVarA = cdrvVar2.a();
                        eooz eoozVar = new eooz() { // from class: cdrq
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                cdre cdreVar = (cdre) cdrvVar2.c.b();
                                cdrv.a.longValue();
                                return cdreVar.c(0L);
                            }
                        };
                        eosc eoscVar = cdrvVar2.f;
                        eiju eijuVarI = eijuVarA.i(eoozVar, eoscVar);
                        final dwje dwjeVar2 = dwjeVar;
                        return eijuVarI.i(new eooz() { // from class: cdrt
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final dwje dwjeVar3 = dwjeVar2;
                                final ejwi ejwiVarB = dwjeVar3.c().b();
                                boolean zG = ejwiVarB.g();
                                final cdrv cdrvVar3 = cdrvVar2;
                                if (zG) {
                                    return ((cdre) cdrvVar3.c.b()).b().h(new ejvr() { // from class: cdrs
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            cdrv cdrvVar4 = cdrvVar3;
                                            if (((Long) obj3).longValue() >= ((dvpn) ((dvhb) cdrvVar4.d.b()).f()).b.b(dwjeVar3).d()) {
                                                cdrvVar4.b.m("Bugle synced with Lighter, no need to sync.");
                                                return null;
                                            }
                                            ejwi ejwiVar = ejwiVarB;
                                            cdro cdroVar = cdrvVar4.g;
                                            cdrm cdrmVar = (cdrm) cdrn.a.createBuilder();
                                            String str = (String) ejwiVar.c();
                                            cdrmVar.copyOnWrite();
                                            cdrn cdrnVar = (cdrn) cdrmVar.instance;
                                            cdrnVar.b |= 1;
                                            cdrnVar.c = str;
                                            long epochMilli = ((cogw) cdrvVar4.h.b()).f().toEpochMilli();
                                            cdrmVar.copyOnWrite();
                                            cdrn cdrnVar2 = (cdrn) cdrmVar.instance;
                                            cdrnVar2.b |= 2;
                                            cdrnVar2.d = epochMilli;
                                            cdrn cdrnVar3 = (cdrn) cdrmVar.build();
                                            caxr caxrVar = new caxr();
                                            caxrVar.d = "incremental_sync_cancelation_tag";
                                            ((cazj) cdroVar.a.b()).a(cbcu.g("lighter_incremental_sync", cdrnVar3, caxrVar.a()));
                                            return null;
                                        }
                                    }, cdrvVar3.e);
                                }
                                cdrvVar3.b.r("AccountContext doesn't have gaia email");
                                return eijx.e(null);
                            }
                        }, eoscVar);
                    }
                };
                ((cdre) cdrvVar.c.b()).a().i(new eooz() { // from class: cdrr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return !((Boolean) obj2).booleanValue() ? eijx.e(null) : eijx.h(eooyVar, cdrvVar.f);
                    }
                }, cdrvVar.f);
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.c.e(this.a);
    }
}
