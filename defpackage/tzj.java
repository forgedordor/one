package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzj implements cfoy {
    public static final cqce a = cqce.f("BugleCms", tzj.class);
    public final Map b;
    public final cpup c;
    public final aurx d;
    public final autx e;
    public final eosc f;
    private final eosc g;

    public tzj(Map map, cpup cpupVar, aurx aurxVar, autx autxVar, eosc eoscVar, eosc eoscVar2) {
        this.b = map;
        this.c = cpupVar;
        this.d = aurxVar;
        this.e = autxVar;
        this.g = eoscVar;
        this.f = eoscVar2;
        for (eqmn eqmnVar : ((ekgp) map).keySet()) {
            cqbd cqbdVarD = a.d();
            cqbdVarD.I("Registered EventHandler for ");
            cqbdVarD.I(eqmnVar);
            cqbdVarD.r();
        }
    }

    @Override // defpackage.cfoy
    public final eiju a(final ezjj ezjjVar) {
        ezji ezjiVarB = ezji.b(ezjjVar.d);
        if (ezjiVarB == null) {
            ezjiVarB = ezji.UNRECOGNIZED;
        }
        if (ezjiVarB.equals(ezji.CMS_NOTIFICATION)) {
            return this.d.k().i(new eooz() { // from class: tzg
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    boolean zG;
                    final tzj tzjVar = this.a;
                    aumq aumqVar = (aumq) obj;
                    if (cpyl.a()) {
                        aurw aurwVar = tzjVar.d.m;
                        zG = aurw.g(aumqVar);
                    } else {
                        zG = aumqVar.e;
                    }
                    ezjj ezjjVar2 = ezjjVar;
                    if (!zG) {
                        cqbd cqbdVarE = tzj.a.e();
                        cqbdVarE.I("Ignoring CMS notification, CMS feature disabled on device.");
                        ezji ezjiVarB2 = ezji.b(ezjjVar2.d);
                        if (ezjiVarB2 == null) {
                            ezjiVarB2 = ezji.UNRECOGNIZED;
                        }
                        cqbdVarE.A("messageType", ezjiVarB2.name());
                        cqbdVarE.A("messageId", ezjjVar2.c);
                        cqbdVarE.r();
                        return eijx.e(true);
                    }
                    if (!tzjVar.e.k(aumqVar)) {
                        cqbd cqbdVarE2 = tzj.a.e();
                        cqbdVarE2.I("Ignoring CMS notification, device has not yet restored keys.");
                        ezji ezjiVarB3 = ezji.b(ezjjVar2.d);
                        if (ezjiVarB3 == null) {
                            ezjiVarB3 = ezji.UNRECOGNIZED;
                        }
                        cqbdVarE2.A("messageType", ezjiVarB3.name());
                        cqbdVarE2.A("messageId", ezjjVar2.c);
                        cqbdVarE2.r();
                        return eijx.e(true);
                    }
                    try {
                        eqmt eqmtVar = (eqmt) evsn.parseFrom(eqmt.a, ezjjVar2.e, evrr.a());
                        cqce cqceVar = tzj.a;
                        cqbd cqbdVarD = cqceVar.d();
                        cqbdVarD.I("Processing");
                        ezji ezjiVarB4 = ezji.b(ezjjVar2.d);
                        if (ezjiVarB4 == null) {
                            ezjiVarB4 = ezji.UNRECOGNIZED;
                        }
                        cqbdVarD.A("messageType", ezjiVarB4.name());
                        cqbdVarD.A("messageId", ezjjVar2.c);
                        cqbdVarD.y("eventCount", eqmtVar.b.size());
                        cqbdVarD.r();
                        if (eqmtVar.b.size() > 1) {
                            cqbd cqbdVarE3 = cqceVar.e();
                            cqbdVarE3.I("More than 1 event found in MessageStoreNotification");
                            cqbdVarE3.y("eventCount", eqmtVar.b.size());
                            cqbdVarE3.r();
                        }
                        Stream map = Collection.EL.stream(eqmtVar.b).map(new Function() { // from class: tzd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                eqmo eqmoVar = (eqmo) obj2;
                                if (!eqmoVar.d.equals("ANDROID_MESSAGES")) {
                                    cqbd cqbdVarC = tzj.a.c();
                                    cqbdVarC.I("Ignoring CMS event");
                                    cqbdVarC.A("applicationId", eqmoVar.d);
                                    cqbdVarC.r();
                                    return eijx.e(null);
                                }
                                final tzj tzjVar2 = tzjVar;
                                fcsu fcsuVar = (fcsu) tzjVar2.b.get(eqmn.a(eqmoVar.b));
                                if (fcsuVar != null) {
                                    return eiju.g(((ual) fcsuVar.b()).a(eqmoVar)).f(cpyy.class, new eooz() { // from class: tzh
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj3) {
                                            final cpyy cpyyVar = (cpyy) obj3;
                                            int i = cpyyVar.a;
                                            tzj tzjVar3 = tzjVar2;
                                            return tzjVar3.c.a(i).i(new eooz() { // from class: tzf
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj4) {
                                                    return ((Boolean) obj4).booleanValue() ? eijx.e(null) : eijx.d(cpyyVar);
                                                }
                                            }, tzjVar3.f);
                                        }
                                    }, tzjVar2.f);
                                }
                                cqbd cqbdVarD2 = tzj.a.d();
                                cqbdVarD2.I("No handler registered");
                                cqbdVarD2.A("CMS eventType", eqmn.a(eqmoVar.b));
                                cqbdVarD2.r();
                                return eijx.e(null);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = ekgb.d;
                        return eijx.l((Iterable) map.collect(ekcv.a)).a(new Callable() { // from class: tze
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, tzjVar.f).h(new ejvr() { // from class: tzi
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return true;
                            }
                        }, eoqg.a);
                    } catch (evtj e) {
                        cqbd cqbdVarE4 = tzj.a.e();
                        cqbdVarE4.I("Exception parsing tachyon notification");
                        ezji ezjiVarB5 = ezji.b(ezjjVar2.d);
                        if (ezjiVarB5 == null) {
                            ezjiVarB5 = ezji.UNRECOGNIZED;
                        }
                        cqbdVarE4.A("messageType", ezjiVarB5.name());
                        cqbdVarE4.A("messageId", ezjjVar2.c);
                        cqbdVarE4.s(e);
                        return eijx.e(true);
                    }
                }
            }, this.g);
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Incorrect message type forwarded to handler. Expected CMS_NOTIFICATION.");
        ezji ezjiVarB2 = ezji.b(ezjjVar.d);
        if (ezjiVarB2 == null) {
            ezjiVarB2 = ezji.UNRECOGNIZED;
        }
        cqbdVarE.A("messageType", ezjiVarB2.name());
        cqbdVarE.A("messageId", ezjjVar.c);
        cqbdVarE.r();
        return eijx.e(true);
    }
}
