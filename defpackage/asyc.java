package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asyc implements asxy {
    public static final eksp a = eksp.c("BugleRcsCapabilities");
    public final asxy b;
    private final asxy c;
    private final eosc d;

    public asyc(asxy asxyVar, asxy asxyVar2, eosc eoscVar) {
        this.c = asxyVar;
        this.b = asxyVar2;
        this.d = eoscVar;
    }

    @Override // defpackage.asxy
    public final eiju a(final Iterable iterable) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getBatchCapabilities", 63, "RcsCapabilitiesProviderExceptionHandler.java")).r("RcsCapabilitiesProviderExceptionHandler: start downstreamProvider.getBatchCapabilities for %d chatEndpoints", ekis.b(iterable));
        return this.c.a(iterable).f(assm.class, new eooz() { // from class: asyb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ((eksl) ((eksl) ((eksl) asyc.a.j()).g((assm) obj)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getBatchCapabilities", 72, "RcsCapabilitiesProviderExceptionHandler.java")).q("Capabilities failed with an exception from the downstream provider.");
                return this.a.b.a(iterable);
            }
        }, this.d);
    }

    @Override // defpackage.asxy
    public final eiju b(final aubq aubqVar) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getCapabilities", 44, "RcsCapabilitiesProviderExceptionHandler.java")).t("RcsCapabilitiesProviderExceptionHandler: start downstreamProvider.getCapabilities for chatEndpoint %s", cqcv.b(aubqVar.d));
        return this.c.b(aubqVar).f(assm.class, new eooz() { // from class: asya
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ((eksl) ((eksl) ((eksl) asyc.a.j()).g((assm) obj)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getCapabilities", 53, "RcsCapabilitiesProviderExceptionHandler.java")).q("Capabilities failed with an exception from the downstream provider.");
                return this.a.b.b(aubqVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }
}
