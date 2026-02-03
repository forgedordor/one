package defpackage;

import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhb implements abpm {
    public static final cqce a = cqce.g("Bugle", "GetDuoKitApiAvailabilityHandler");
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;
    private final eosc e;

    public abhb(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar) {
        this.d = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.e = eoscVar;
    }

    @Override // defpackage.abpm
    public final eiju a(final eppi eppiVar, final eppj eppjVar) {
        a.p("Received Get DuoKit API availability request");
        eiju eijuVarG = eiju.g(drgi.a(((dcsx) this.d.b()).f()));
        ejvr ejvrVar = new ejvr() { // from class: abgz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                GetApiAvailabilityResponse getApiAvailabilityResponse = (GetApiAvailabilityResponse) obj;
                int i = getApiAvailabilityResponse.a;
                abhb.a.p(a.g(i, "DuoKit API availability response: "));
                int i2 = i != 1 ? i != 2 ? i != 3 ? 1 : 4 : 3 : 2;
                eppj eppjVar2 = eppjVar;
                abhb abhbVar = this.a;
                ((ains) abhbVar.c.b()).e("Bugle.Satellite.DuoKit.ApiAvailability.State", i2);
                int i3 = getApiAvailabilityResponse.a;
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    exmt exmtVar = exmt.OK;
                    eppjVar2.copyOnWrite();
                    eppl epplVar = (eppl) eppjVar2.instance;
                    eppl epplVar2 = eppl.a;
                    epplVar.e = exmtVar.a();
                    epom epomVar = (epom) epoo.a.createBuilder();
                    epomVar.copyOnWrite();
                    ((epoo) epomVar.instance).b = epon.a(4);
                    epoo epooVar = (epoo) epomVar.build();
                    eppjVar2.copyOnWrite();
                    eppl epplVar3 = (eppl) eppjVar2.instance;
                    epooVar.getClass();
                    epplVar3.c = epooVar;
                    epplVar3.b = 110;
                    return eppjVar2.build();
                }
                eppi eppiVar2 = eppiVar;
                abdl abdlVar = (abdl) abhbVar.b.b();
                String str = eppiVar2.d;
                int iB = epph.b(epph.c(eppiVar2.b));
                exmt exmtVar2 = exmt.UNAVAILABLE;
                abdlVar.n(str, 8, iB, exmtVar2, 3);
                eppjVar2.copyOnWrite();
                eppl epplVar4 = (eppl) eppjVar2.instance;
                eppl epplVar5 = eppl.a;
                epplVar4.e = exmtVar2.a();
                epom epomVar2 = (epom) epoo.a.createBuilder();
                epomVar2.copyOnWrite();
                ((epoo) epomVar2.instance).b = epon.a(3);
                epoo epooVar2 = (epoo) epomVar2.build();
                eppjVar2.copyOnWrite();
                eppl epplVar6 = (eppl) eppjVar2.instance;
                epooVar2.getClass();
                epplVar6.c = epooVar2;
                epplVar6.b = 110;
                return eppjVar2.build();
            }
        };
        eosc eoscVar = this.e;
        return eijuVarG.h(ejvrVar, eoscVar).f(Exception.class, new eooz() { // from class: abha
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                abhb.a.n("Get DuoKit API availability failed");
                abdl abdlVar = (abdl) this.a.b.b();
                eppi eppiVar2 = eppiVar;
                String str = eppiVar2.d;
                int iB = epph.b(epph.c(eppiVar2.b));
                exmt exmtVar = exmt.INTERNAL;
                abdlVar.n(str, 8, iB, exmtVar, 4);
                eppj eppjVar2 = eppjVar;
                eppjVar2.copyOnWrite();
                eppl epplVar = (eppl) eppjVar2.instance;
                eppl epplVar2 = eppl.a;
                epplVar.e = exmtVar.a();
                String str2 = (String) Optional.ofNullable(((Exception) obj).getMessage()).orElse("Unknown Error");
                eppjVar2.copyOnWrite();
                eppl epplVar3 = (eppl) eppjVar2.instance;
                str2.getClass();
                epplVar3.f = str2;
                epom epomVar = (epom) epoo.a.createBuilder();
                epomVar.copyOnWrite();
                ((epoo) epomVar.instance).b = epon.a(3);
                epoo epooVar = (epoo) epomVar.build();
                eppjVar2.copyOnWrite();
                eppl epplVar4 = (eppl) eppjVar2.instance;
                epooVar.getClass();
                epplVar4.c = epooVar;
                epplVar4.b = 110;
                return eijx.e(eppjVar2.build());
            }
        }, eoscVar);
    }
}
