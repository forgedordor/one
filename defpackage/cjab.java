package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjab {
    public static final cqce a = cqce.g("BugleRcs", "MessagingServiceGenericMethod");
    public final cjaa b;
    private final Context c;
    private final eosc d;
    private final cjfe e;

    public cjab(Context context, eosc eoscVar, cjaa cjaaVar, cjfe cjfeVar) {
        this.c = context;
        this.d = eoscVar;
        this.b = cjaaVar;
        this.e = cjfeVar;
    }

    public final eiju a(final Object obj) {
        cjaa cjaaVar = this.b;
        Intent intentA = cjaaVar.a(obj);
        Context context = this.c;
        intentA.setClass(context, MessagingServiceResponseReceiver.class);
        PendingIntent pendingIntentE = ebsn.e(context, Objects.hashCode(obj), intentA, crag.a | 1073741824, 1);
        pendingIntentE.getClass();
        Object objK = cjaaVar.k(obj, pendingIntentE);
        final evqs evqsVarF = cjaaVar.f(obj);
        eiju eijuVarD = cjaaVar.d(objK);
        ejvr ejvrVar = new ejvr() { // from class: cizu
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return this.a.b.i(obj2, evqsVarF);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarD.h(ejvrVar, eoscVar).e(effg.class, new ejvr() { // from class: cizv
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                aubl aublVar;
                effg effgVar = (effg) obj2;
                cqbd cqbdVarE = cjab.a.e();
                cqbdVarE.I("Call to Messaging service failed");
                cjaa cjaaVar2 = this.a.b;
                cqbdVarE.A("methodName", cjaaVar2.m());
                cqbdVarE.I(cjaaVar2.l(obj));
                cqbdVarE.s(effgVar);
                if (effgVar.getCause() instanceof efar) {
                    aubg aubgVar = (aubg) aubl.a.createBuilder();
                    aubk aubkVar = aubk.FAILED_TRANSIENTLY;
                    aubgVar.copyOnWrite();
                    aubl aublVar2 = (aubl) aubgVar.instance;
                    aublVar2.c = aubkVar.f;
                    aublVar2.b |= 1;
                    aubi aubiVar = aubi.NOT_CONNECTED;
                    aubgVar.copyOnWrite();
                    aubl aublVar3 = (aubl) aubgVar.instance;
                    aublVar3.d = aubiVar.v;
                    aublVar3.b |= 2;
                    aublVar = (aubl) aubgVar.build();
                } else {
                    aubg aubgVar2 = (aubg) aubl.a.createBuilder();
                    aubk aubkVar2 = aubk.FAILED_PERMANENTLY;
                    aubgVar2.copyOnWrite();
                    aubl aublVar4 = (aubl) aubgVar2.instance;
                    aublVar4.c = aubkVar2.f;
                    aublVar4.b |= 1;
                    aublVar = (aubl) aubgVar2.build();
                }
                return cjaaVar2.h(aublVar, evqsVarF);
            }
        }, eoscVar).e(TimeoutException.class, new ejvr() { // from class: cizw
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cqbd cqbdVarE = cjab.a.e();
                cqbdVarE.I("Time out connecting to Messaging service");
                cjaa cjaaVar2 = this.a.b;
                cqbdVarE.A("methodName", cjaaVar2.m());
                cqbdVarE.I(cjaaVar2.l(obj));
                cqbdVarE.s((TimeoutException) obj2);
                aubg aubgVar = (aubg) aubl.a.createBuilder();
                aubk aubkVar = aubk.FAILED_TRANSIENTLY;
                aubgVar.copyOnWrite();
                aubl aublVar = (aubl) aubgVar.instance;
                aublVar.c = aubkVar.f;
                aublVar.b |= 1;
                aubi aubiVar = aubi.NOT_CONNECTED;
                aubgVar.copyOnWrite();
                aubl aublVar2 = (aubl) aubgVar.instance;
                aublVar2.d = aubiVar.v;
                aublVar2.b |= 2;
                return cjaaVar2.h((aubl) aubgVar.build(), evqsVarF);
            }
        }, eoscVar);
    }

    public final eiju b(Intent intent) {
        eiju eijuVarI;
        cjaa cjaaVar = this.b;
        aubl aublVarB = cjaaVar.b(intent);
        final Object objJ = cjaaVar.j(aublVarB, intent, cjaaVar.e(intent));
        Optional optionalG = cjaaVar.g(intent);
        if (optionalG.isEmpty()) {
            eijuVarI = cjaaVar.c(objJ);
        } else {
            eiju eijuVarA = this.e.a(aublVarB, (String) optionalG.get());
            ejvr ejvrVar = new ejvr() { // from class: cizy
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    aubl aublVar = (aubl) obj;
                    aubk aubkVar = aubk.OK;
                    aubk aubkVarB = aubk.b(aublVar.c);
                    if (aubkVarB == null) {
                        aubkVarB = aubk.UNKNOWN_STATUS;
                    }
                    cjab cjabVar = this.a;
                    if (aubkVar.equals(aubkVarB)) {
                        cqbd cqbdVarA = cjab.a.a();
                        cqbdVarA.I("Emitted GroupEvent processing succeeded");
                        cqbdVarA.A("method", cjabVar.b.m());
                        cqbdVarA.r();
                        return aublVar;
                    }
                    cqbd cqbdVarB = cjab.a.b();
                    cqbdVarB.I("Emitted GroupEvent processing failed");
                    cqbdVarB.A("method", cjabVar.b.m());
                    cqbdVarB.r();
                    return aublVar;
                }
            };
            eosc eoscVar = this.d;
            eijuVarI = eijuVarA.h(ejvrVar, eoscVar).i(new eooz() { // from class: cizz
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.b.c(objJ);
                }
            }, eoscVar);
        }
        return eijuVarI.h(new ejvr() { // from class: cizx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aubk aubkVar = aubk.OK;
                aubk aubkVarB = aubk.b(((aubl) obj).c);
                if (aubkVarB == null) {
                    aubkVarB = aubk.UNKNOWN_STATUS;
                }
                cjab cjabVar = this.a;
                if (aubkVar.equals(aubkVarB)) {
                    cqbd cqbdVarC = cjab.a.c();
                    cqbdVarC.I("Intent delivered to Incoming Chat API");
                    cqbdVarC.A("method", cjabVar.b.m());
                    cqbdVarC.r();
                    return null;
                }
                cqbd cqbdVarB = cjab.a.b();
                cqbdVarB.I("Failed to process intent");
                cqbdVarB.A("method", cjabVar.b.m());
                cqbdVarB.r();
                return null;
            }
        }, this.d);
    }
}
