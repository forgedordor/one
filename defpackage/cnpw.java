package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpw implements cdfg {
    private static final cqce a = cqce.g("Bugle", "LastWipeoutService");
    private final cmfo b;
    private final eosc c;
    private final cogw d;

    public cnpw(cmfo cmfoVar, eosc eoscVar, cogw cogwVar) {
        this.b = cmfoVar;
        this.c = eoscVar;
        this.d = cogwVar;
    }

    public final cnpr a() {
        try {
            return (cnpr) this.b.l();
        } catch (evtj e) {
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("Couldn't load LastWipeout from store");
            cqbdVarB.s(e);
            return cnpr.a;
        }
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        eiju eijuVarH = this.b.h();
        eooz eoozVar = new eooz() { // from class: cnpu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cnpr cnprVar = (cnpr) obj;
                ekgi ekgiVar = new ekgi();
                evvp evvpVar = cnprVar.c;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                cnpw cnpwVar = this.a;
                ekgiVar.i("TelephonyRecreatedIntentTimestamp", cnpwVar.e(evvpVar));
                evvp evvpVar2 = cnprVar.c;
                if (evvpVar2 == null) {
                    evvpVar2 = evvp.a;
                }
                ekgiVar.i("TelephonyRecreatedReverseSyncTimestamp", cnpwVar.e(evvpVar2));
                return eijx.e(ekgiVar.c());
            }
        };
        eosc eoscVar = this.c;
        return eijuVarH.i(eoozVar, eoscVar).h(new ejvr() { // from class: cnpt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cdfd.a((Map) obj);
            }
        }, eoscVar);
    }

    public final String e(evvp evvpVar) {
        if (evvpVar == null || evvpVar.b == 0) {
            return "NEVER";
        }
        long days = TimeUnit.SECONDS.toDays(this.d.f().getEpochSecond() - evvpVar.b);
        return (days < 0 || days >= 3) ? (days < 3 || days >= 8) ? days >= 7 ? "MORE_THAN_SEVEN" : "NEVER" : "3_TO_7" : Long.toString(days);
    }

    public final void f(evvp evvpVar) {
        g(Optional.empty(), Optional.of(evvpVar));
    }

    public final void g(Optional optional, Optional optional2) {
        Object obj;
        Object obj2;
        final cnpq cnpqVar = (cnpq) cnpr.a.createBuilder();
        cnpr cnprVarA = a();
        if (optional.isPresent()) {
            obj = optional.get();
        } else {
            obj = cnprVarA.c;
            if (obj == null) {
                obj = evvp.a;
            }
        }
        cnpqVar.copyOnWrite();
        cnpr cnprVar = (cnpr) cnpqVar.instance;
        obj.getClass();
        cnprVar.c = (evvp) obj;
        cnprVar.b |= 1;
        if (optional2.isPresent()) {
            obj2 = optional2.get();
        } else {
            obj2 = cnprVarA.d;
            if (obj2 == null) {
                obj2 = evvp.a;
            }
        }
        cnpqVar.copyOnWrite();
        cnpr cnprVar2 = (cnpr) cnpqVar.instance;
        obj2.getClass();
        cnprVar2.d = (evvp) obj2;
        cnprVar2.b |= 2;
    }
}
