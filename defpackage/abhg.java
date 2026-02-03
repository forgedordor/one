package defpackage;

import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.android.gms.duokit.SetupDuoRequest;
import com.google.android.gms.duokit.StartCallRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhg implements abpm {
    public static final cqce a = cqce.g("Bugle", "StartDuoCallHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    private final fcsu f;

    public abhg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, fcsu fcsuVar4) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = eoscVar;
        this.f = fcsuVar4;
    }

    @Override // defpackage.abpm
    public final eiju a(final eppi eppiVar, final eppj eppjVar) {
        a.p("Received Duo start call request");
        String str = (eppiVar.b == 111 ? (eppx) eppiVar.c : eppx.a).b;
        try {
            fcsu fcsuVar = this.f;
            if (((ephj) fcsuVar.b()).j(((ephj) fcsuVar.b()).n(str, ""))) {
                eiju eijuVarG = eiju.g(drgi.a(((dcsx) this.b.b()).f()));
                eooz eoozVar = new eooz() { // from class: abhe
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        int i = ((GetApiAvailabilityResponse) obj).a;
                        final eppj eppjVar2 = eppjVar;
                        eppi eppiVar2 = eppiVar;
                        abhg abhgVar = this.a;
                        if (i == 1 || i == 2) {
                            ((ains) abhgVar.d.b()).c("Bugle.Satellite.DuoKit.SetupDuo.Count");
                            return eiju.g(drgi.a(((dcsx) abhgVar.b.b()).c(new SetupDuoRequest()))).h(new ejvr() { // from class: abhd
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    eppj eppjVar3 = eppjVar2;
                                    exmt exmtVar = exmt.OK;
                                    eppjVar3.copyOnWrite();
                                    eppl epplVar = (eppl) eppjVar3.instance;
                                    eppl epplVar2 = eppl.a;
                                    epplVar.e = exmtVar.a();
                                    evrl evrlVar = evrl.a;
                                    eppjVar3.copyOnWrite();
                                    eppl epplVar3 = (eppl) eppjVar3.instance;
                                    evrlVar.getClass();
                                    epplVar3.c = evrlVar;
                                    epplVar3.b = 111;
                                    return eppjVar3.build();
                                }
                            }, abhgVar.e);
                        }
                        if (i == 3) {
                            ((ains) abhgVar.d.b()).c("Bugle.Satellite.DuoKit.StartDuoCall.Count");
                            DuoId duoId = new DuoId();
                            duoId.b = (eppiVar2.b == 111 ? (eppx) eppiVar2.c : eppx.a).b;
                            dcss.a(duoId);
                            StartCallRequest startCallRequest = new StartCallRequest();
                            startCallRequest.a = duoId;
                            startCallRequest.d = csyh.a.d;
                            return eiju.g(drgi.a(((dcsx) abhgVar.b.b()).d(startCallRequest))).h(new ejvr() { // from class: abhc
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    eppj eppjVar3 = eppjVar2;
                                    exmt exmtVar = exmt.OK;
                                    eppjVar3.copyOnWrite();
                                    eppl epplVar = (eppl) eppjVar3.instance;
                                    eppl epplVar2 = eppl.a;
                                    epplVar.e = exmtVar.a();
                                    evrl evrlVar = evrl.a;
                                    eppjVar3.copyOnWrite();
                                    eppl epplVar3 = (eppl) eppjVar3.instance;
                                    evrlVar.getClass();
                                    epplVar3.c = evrlVar;
                                    epplVar3.b = 111;
                                    return eppjVar3.build();
                                }
                            }, abhgVar.e);
                        }
                        abhg.a.r("Get DuoKit API availability returned unknown");
                        abdl abdlVar = (abdl) abhgVar.c.b();
                        String str2 = eppiVar2.d;
                        int iB = epph.b(epph.c(eppiVar2.b));
                        exmt exmtVar = exmt.UNKNOWN;
                        abdlVar.n(str2, 8, iB, exmtVar, 5);
                        eppjVar2.copyOnWrite();
                        eppl epplVar = (eppl) eppjVar2.instance;
                        eppl epplVar2 = eppl.a;
                        epplVar.e = exmtVar.a();
                        eppjVar2.copyOnWrite();
                        ((eppl) eppjVar2.instance).f = "DuoKit api availability is unknown";
                        evrl evrlVar = evrl.a;
                        eppjVar2.copyOnWrite();
                        eppl epplVar3 = (eppl) eppjVar2.instance;
                        evrlVar.getClass();
                        epplVar3.c = evrlVar;
                        epplVar3.b = 111;
                        return eijx.e(eppjVar2.build());
                    }
                };
                eosc eoscVar = this.e;
                return eijuVarG.i(eoozVar, eoscVar).f(Exception.class, new eooz() { // from class: abhf
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        abhg.a.r("Duo start call failed");
                        abdl abdlVar = (abdl) this.a.c.b();
                        eppi eppiVar2 = eppiVar;
                        abdlVar.n(eppiVar2.d, 8, epph.b(epph.c(eppiVar2.b)), exmt.UNAVAILABLE, 6);
                        eppj eppjVar2 = eppjVar;
                        exmt exmtVar = exmt.INTERNAL;
                        eppjVar2.copyOnWrite();
                        eppl epplVar = (eppl) eppjVar2.instance;
                        eppl epplVar2 = eppl.a;
                        epplVar.e = exmtVar.a();
                        String str2 = (String) Optional.ofNullable(((Exception) obj).getMessage()).orElse("Unknown Error");
                        eppjVar2.copyOnWrite();
                        eppl epplVar3 = (eppl) eppjVar2.instance;
                        str2.getClass();
                        epplVar3.f = str2;
                        evrl evrlVar = evrl.a;
                        eppjVar2.copyOnWrite();
                        eppl epplVar4 = (eppl) eppjVar2.instance;
                        evrlVar.getClass();
                        epplVar4.c = evrlVar;
                        epplVar4.b = 111;
                        return eijx.e(eppjVar2.build());
                    }
                }, eoscVar);
            }
        } catch (ephe unused) {
        }
        abdl abdlVar = (abdl) this.c.b();
        String str2 = eppiVar.d;
        int iB = epph.b(epph.c(eppiVar.b));
        exmt exmtVar = exmt.INVALID_ARGUMENT;
        abdlVar.n(str2, 8, iB, exmtVar, 7);
        eppjVar.copyOnWrite();
        eppl epplVar = (eppl) eppjVar.instance;
        eppl epplVar2 = eppl.a;
        epplVar.e = exmtVar.a();
        eppjVar.copyOnWrite();
        ((eppl) eppjVar.instance).f = "StartDuoCall E164 number is invalid";
        evrl evrlVar = evrl.a;
        eppjVar.copyOnWrite();
        eppl epplVar3 = (eppl) eppjVar.instance;
        evrlVar.getClass();
        epplVar3.c = evrlVar;
        epplVar3.b = 111;
        return eijx.e(eppjVar.build());
    }
}
