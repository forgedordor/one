package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cndr {
    public static final eksp a = eksp.c("BugleTachygram");
    private static final ekgb h = ekgb.s(aubk.OK, aubk.FAILED_PERMANENTLY);
    public final asrc b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final aubq f;
    public final fcsu g;

    public cndr(asrc asrcVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, ezol ezolVar) {
        this.b = asrcVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = eoscVar;
        this.g = fcsuVar3;
        this.f = (aubq) new cnbb().fH().fM(ezolVar);
        ejwl.m(!r1.equals(aubq.a), "SelfChatEndpoint missing");
    }

    public static ekgb c(Iterable iterable) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ejvj ejvjVarFH = new cnbb().fH();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ezol ezolVar = (ezol) it.next();
            felm felmVarB = felm.b(ezolVar.b);
            if (felmVarB == null) {
                felmVarB = felm.UNRECOGNIZED;
            }
            ejwl.m(!felmVarB.equals(felm.GROUP_ID), "A ChatEndpoint participant of a group should not be of type GROUP_ID.");
            ekfwVar.h((aubq) ejvjVarFH.fM(ezolVar));
        }
        return ekfwVar.g();
    }

    public static void d(aubl aublVar, String str) {
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        ejwl.n(h.contains(aubkVarB), "IncomingChatApi returned an unexpected status: %s", aubkVarB.f);
        aubk aubkVar = aubk.FAILED_PERMANENTLY;
        aubk aubkVarB2 = aubk.b(aublVar.c);
        if (aubkVarB2 == null) {
            aubkVarB2 = aubk.UNKNOWN_STATUS;
        }
        if (aubkVar.equals(aubkVarB2)) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupHandlerChapiAdapter", "checkIncomingChatApiStatus", 396, "TachygramGroupHandlerChapiAdapter.java")).t("Chat API failed to process GroupEvent for %s", str);
        }
    }

    public final audb a(String str, Optional optional, final Instant instant) {
        final audb audbVar = (audb) audc.c.createBuilder();
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        str.getClass();
        audcVar.d |= 1;
        audcVar.e = str;
        optional.ifPresent(new Consumer() { // from class: cncw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = cndr.a;
                aufa aufaVar = (aufa) aufb.a.createBuilder();
                aubq aubqVar = (aubq) new cnbb().fH().fM((ezol) obj);
                aufaVar.copyOnWrite();
                aufb aufbVar = (aufb) aufaVar.instance;
                aubqVar.getClass();
                aufbVar.c = aubqVar;
                aufbVar.b |= 1;
                evvp evvpVarB = evwz.b(instant);
                aufaVar.copyOnWrite();
                aufb aufbVar2 = (aufb) aufaVar.instance;
                evvpVarB.getClass();
                aufbVar2.d = evvpVarB;
                aufbVar2.b |= 2;
                aufb aufbVar3 = (aufb) aufaVar.build();
                audb audbVar2 = audbVar;
                audbVar2.copyOnWrite();
                audc audcVar2 = (audc) audbVar2.instance;
                evsy evsyVar = audc.a;
                aufbVar3.getClass();
                audcVar2.r = aufbVar3;
                audcVar2.d |= 1024;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        audbVar.copyOnWrite();
        audc audcVar2 = (audc) audbVar.instance;
        aubq aubqVar = this.f;
        aubqVar.getClass();
        audcVar2.t = aubqVar;
        audcVar2.d |= 4096;
        return audbVar;
    }

    public final eiju b(audc audcVar, final String str) {
        return this.b.c(audcVar).h(new ejvr() { // from class: cndj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cndr.d((aubl) obj, str);
                return null;
            }
        }, this.e);
    }
}
