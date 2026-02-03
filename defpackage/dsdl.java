package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsdl implements dsdf {
    public static final eksp a = eksp.c("GnpSdk");
    public final eygg b;
    public final String c;
    public final eygg d;
    public final eosc e;
    public final eygg f;
    private final fcsu g;

    public dsdl(eygg eyggVar, String str, fcsu fcsuVar, eygg eyggVar2, eosc eoscVar, eygg eyggVar3) {
        this.b = eyggVar;
        this.c = str;
        this.g = fcsuVar;
        this.d = eyggVar2;
        this.e = eoscVar;
        this.f = eyggVar3;
    }

    @Override // defpackage.dsdf
    public final ListenableFuture a(final etkl etklVar) {
        final fcsu fcsuVar = this.g;
        fcsuVar.getClass();
        Callable callableL = eiid.l(new Callable() { // from class: dsdi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Boolean) fcsuVar.b();
            }
        });
        eosc eoscVar = this.e;
        final ListenableFuture listenableFutureSubmit = eoscVar.submit(callableL);
        return eooq.g(eooq.g(eoqt.t(listenableFutureSubmit), eiid.d(new eooz() { // from class: dsdg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    ((eksl) ((eksl) dsdl.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/events/impl/EventsHelperImpl", "reportClearCutEvent", 86, "EventsHelperImpl.java")).q("GrowthKit is disabled by Phenotype flag.");
                    return eorv.a;
                }
                etkl etklVar2 = etklVar;
                final dsdl dsdlVar = this.a;
                ListenableFuture listenableFutureE = ((dskf) dsdlVar.d.b()).e(etklVar2);
                dxlc.b(listenableFutureE, new ejwy() { // from class: dsdj
                    @Override // defpackage.ejwy
                    public final void a(Object obj2) {
                        dsdl dsdlVar2 = dsdlVar;
                        ((dxtx) dsdlVar2.f.b()).i(dsdlVar2.c, "OK");
                    }
                }, new ejwy() { // from class: dsdk
                    @Override // defpackage.ejwy
                    public final void a(Object obj2) {
                        ((eksl) ((eksl) ((eksl) dsdl.a.j()).g((Throwable) obj2)).h("com/google/android/libraries/internal/growth/growthkit/internal/events/impl/EventsHelperImpl", "addClearcutEventToStore", 163, "EventsHelperImpl.java")).q("Failed to log clearcut event.");
                        dsdl dsdlVar2 = dsdlVar;
                        ((dxtx) dsdlVar2.f.b()).i(dsdlVar2.c, "ERROR");
                    }
                }, dsdlVar.e);
                return listenableFutureE;
            }
        }), eoscVar), eiid.d(new eooz() { // from class: dsdh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) eork.q(listenableFutureSubmit)).booleanValue()) {
                    return eork.i(false);
                }
                return ((dsff) this.a.b.b()).a(etklVar);
            }
        }), eoscVar);
    }
}
