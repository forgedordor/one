package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmt {
    public static final cqce a = cqce.g("BugleRcs", "MessagingServiceGenericMethod");
    public final cjms b;
    private final eosc c;
    private final cjfe d;

    public cjmt(eosc eoscVar, cjms cjmsVar, cjfe cjfeVar) {
        this.c = eoscVar;
        this.b = cjmsVar;
        this.d = cjfeVar;
    }

    public final eiju a(final Object obj) {
        cjms cjmsVar = this.b;
        eiju eijuVarC = cjmsVar.c(cjmsVar.f(obj));
        ejvr ejvrVar = new ejvr() { // from class: cjmp
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return this.a.b.g(obj);
            }
        };
        eosc eoscVar = this.c;
        return eijuVarC.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: cjmq
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cqbd cqbdVarE = cjmt.a.e();
                cqbdVarE.I("Call to Messaging service failed");
                cjms cjmsVar2 = this.a.b;
                cqbdVarE.A("methodName", cjmsVar2.i());
                Object obj3 = obj;
                cqbdVarE.I(cjmsVar2.h(obj3));
                cqbdVarE.s((Throwable) obj2);
                return cjmsVar2.j(obj3);
            }
        }, eoscVar);
    }

    public final eiju b(Object obj) {
        eiju eijuVarI;
        cjms cjmsVar = this.b;
        aubl aublVarA = cjmsVar.a(obj);
        final Object objE = cjmsVar.e(obj);
        Optional optionalD = cjmsVar.d(obj);
        if (optionalD.isEmpty()) {
            eijuVarI = cjmsVar.b(objE);
        } else {
            eiju eijuVarA = this.d.a(aublVarA, (String) optionalD.get());
            ejvr ejvrVar = new ejvr() { // from class: cjmn
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    aubl aublVar = (aubl) obj2;
                    aubk aubkVar = aubk.OK;
                    aubk aubkVarB = aubk.b(aublVar.c);
                    if (aubkVarB == null) {
                        aubkVarB = aubk.UNKNOWN_STATUS;
                    }
                    cjmt cjmtVar = this.a;
                    if (aubkVar.equals(aubkVarB)) {
                        cqbd cqbdVarA = cjmt.a.a();
                        cqbdVarA.I("Emitted GroupEvent processing succeeded");
                        cqbdVarA.A("method", cjmtVar.b.i());
                        cqbdVarA.r();
                        return aublVar;
                    }
                    cqbd cqbdVarB = cjmt.a.b();
                    cqbdVarB.I("Emitted GroupEvent processing failed");
                    cqbdVarB.A("method", cjmtVar.b.i());
                    cqbdVarB.r();
                    return aublVar;
                }
            };
            eosc eoscVar = this.c;
            eijuVarI = eijuVarA.h(ejvrVar, eoscVar).i(new eooz() { // from class: cjmo
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    return this.a.b.b(objE);
                }
            }, eoscVar);
        }
        return eijuVarI.h(new ejvr() { // from class: cjmr
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                aubl aublVar = (aubl) obj2;
                aubk aubkVar = aubk.OK;
                aubk aubkVarB = aubk.b(aublVar.c);
                if (aubkVarB == null) {
                    aubkVarB = aubk.UNKNOWN_STATUS;
                }
                cjmt cjmtVar = this.a;
                if (aubkVar.equals(aubkVarB)) {
                    cqbd cqbdVarC = cjmt.a.c();
                    cqbdVarC.I("Response notification delivered to Incoming Chat API");
                    cqbdVarC.A("method", cjmtVar.b.i());
                    cqbdVarC.r();
                    return aublVar;
                }
                cqbd cqbdVarB = cjmt.a.b();
                cqbdVarB.I("Failed to process response notification");
                cqbdVarB.A("method", cjmtVar.b.i());
                cqbdVarB.r();
                return aublVar;
            }
        }, this.c);
    }
}
