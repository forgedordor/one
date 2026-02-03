package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anys implements anpj {
    public static final eksp a = eksp.c("BugleRecipients");
    public final cqtq b;
    public final awhr c;
    public final awhr d;
    public final alqm e;
    public final int f;
    private final eosc g;
    private final eosc h;

    public anys(cqtp cqtpVar, eosc eoscVar, eosc eoscVar2, awlc awlcVar, awhr awhrVar, awhr awhrVar2, alqm alqmVar, int i) {
        this.b = cqtpVar.a(new anyo(awlcVar, new anyr(this)));
        this.g = eoscVar;
        this.h = eoscVar2;
        this.c = awhrVar;
        this.d = awhrVar2;
        this.e = alqmVar;
        this.f = i;
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        if (!this.e.e().isEmpty()) {
            return this.b.a(new cqtk() { // from class: anyk
                @Override // defpackage.cqtk
                public final eiju a(Object obj) {
                    eksp ekspVar = anys.a;
                    return anpiVar.a();
                }
            }, "ProviderRcsCapabilitiesSupplier::register", "ProviderRcsCapabilitiesSupplier::callback", "ProviderRcsCapabilitiesSupplier::unregister");
        }
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.H, d());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "subscribeToChanges", 136, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities will NEVER change: No RCS Identifier.");
        return cquc.d;
    }

    @Override // defpackage.anpj
    public final eiju b() {
        eiju eijuVarH;
        if (this.e.e().isEmpty()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.H, d());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 86, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Disabled: No RCS Identifier.");
            return eijx.e(anzd.a(awhp.e()));
        }
        if (this.f == 1) {
            eksl ekslVar2 = (eksl) a.h();
            ekslVar2.X(cqnc.H, d());
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 95, "ProviderRcsCapabilitiesSupplier.java")).q("Retrieving RCS Capabilities from Network.");
            eijuVarH = eijx.h(new eooy() { // from class: anyl
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    anys anysVar = this.a;
                    return anysVar.c.c(anysVar.e);
                }
            }, this.h);
        } else {
            eksl ekslVar3 = (eksl) a.h();
            ekslVar3.X(cqnc.H, d());
            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 103, "ProviderRcsCapabilitiesSupplier.java")).q("Retrieving RCS Capabilities from Storage.");
            eijuVarH = eijx.h(new eooy() { // from class: anym
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    anys anysVar = this.a;
                    return anysVar.d.c(anysVar.e);
                }
            }, this.h);
        }
        return eijuVarH.h(new ejvr() { // from class: anyn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                awhp awhpVar = (awhp) obj;
                eksl ekslVar4 = (eksl) anys.a.h();
                anys anysVar = this.a;
                ekslVar4.X(cqnc.H, anysVar.d());
                ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 114, "ProviderRcsCapabilitiesSupplier.java")).t(anysVar.f == 1 ? "Network RCS Capabilities retrieved: %s." : "Storage RCS Capabilities retrieved: %s.", awhpVar);
                return anzd.a(awhpVar);
            }
        }, this.g);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final String d() {
        return cqcv.c(this.e).toString();
    }
}
