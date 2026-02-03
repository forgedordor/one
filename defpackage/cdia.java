package defpackage;

import android.app.AlarmManager;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdia {
    public static final eksp a = eksp.c("Bugle");
    public final eosc b;
    public final eosc c;
    public final cogw d;
    public final aijs e;
    public final Map f;
    public final cdgy g;
    public final Object h = new Object();
    public Optional i = Optional.empty();
    public Optional j = Optional.empty();
    public final byeq k;

    public cdia(eosc eoscVar, eosc eoscVar2, byeq byeqVar, cogw cogwVar, Map map, aijs aijsVar, cdgy cdgyVar) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.k = byeqVar;
        this.d = cogwVar;
        this.f = new HashMap(map);
        this.e = aijsVar;
        this.g = cdgyVar;
    }

    static final boolean d(final MessageIdType messageIdType, final bvdo bvdoVar) {
        bpml bpmlVarA = bpmq.a();
        bpmlVarA.A("flaggedMessageExists");
        bpmlVarA.k(new bpmo((bpmp) new Function() { // from class: cdhf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpmp bpmpVar = (bpmp) obj;
                eksp ekspVar = cdia.a;
                bpmpVar.b(messageIdType);
                bpmpVar.d(bvdoVar);
                return bpmpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bpmp())));
        return bpmlVarA.b().U();
    }

    public final eiju a() {
        bpml bpmlVarA = bpmq.a();
        bpmlVarA.A("processAllFlaggedAndComputeNextTimer");
        return bpmlVarA.b().x().i(new eooz() { // from class: cdhm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cdia cdiaVar = this.a;
                Map map = cdiaVar.f;
                final ekgb ekgbVar = (ekgb) obj;
                eiju eijuVarE = eijx.e(null);
                for (final bvdo bvdoVar : map.keySet()) {
                    final cdgy cdgyVar = cdiaVar.g;
                    Stream streamFilter = Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: cdgx
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            bple bpleVar = (bple) obj2;
                            return bpleVar.n() == bvdoVar && cdgyVar.c(bpleVar);
                        }
                    });
                    int i = ekgb.d;
                    final ekgb ekgbVar2 = (ekgb) streamFilter.collect(ekcv.a);
                    eijuVarE = eijuVarE.i(new eooz() { // from class: cdhz
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ((cdhb) cdiaVar.f.get(bvdoVar)).b(ekgbVar2);
                        }
                    }, cdiaVar.c);
                }
                return eijuVarE.h(new ejvr() { // from class: cdhd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Stream stream = Collection.EL.stream(ekgbVar);
                        final cdia cdiaVar2 = cdiaVar;
                        Stream streamFilter2 = stream.filter(new Predicate() { // from class: cdhs
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo538negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj3) {
                                return !cdiaVar2.g.c((bple) obj3);
                            }
                        });
                        final cdgy cdgyVar2 = cdiaVar2.g;
                        streamFilter2.min(Comparator.CC.comparingLong(new ToLongFunction() { // from class: cdht
                            @Override // java.util.function.ToLongFunction
                            public final long applyAsLong(Object obj3) {
                                return cdgyVar2.a((bple) obj3);
                            }
                        })).ifPresent(new Consumer() { // from class: cdhu
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj3) {
                                cdia cdiaVar3 = cdiaVar2;
                                Instant instantB = cdiaVar3.g.b((bple) obj3);
                                synchronized (cdiaVar3.h) {
                                    if (cdiaVar3.i.isPresent() && instantB.compareTo((Instant) cdiaVar3.i.get()) >= 0) {
                                        if (((Instant) cdiaVar3.i.get()).isAfter(cdiaVar3.d.f())) {
                                            return;
                                        }
                                    }
                                    aijs aijsVar = cdiaVar3.e;
                                    instantB.getClass();
                                    Object systemService = aijsVar.a.getSystemService("alarm");
                                    systemService.getClass();
                                    aijsVar.b = (AlarmManager) systemService;
                                    aijt aijtVar = (aijt) aiju.a.createBuilder();
                                    aijtVar.getClass();
                                    aijtVar.copyOnWrite();
                                    aiju aijuVar = (aiju) aijtVar.instance;
                                    aijuVar.b |= 2;
                                    aijuVar.d = "com.google.android.apps.messaging.shared.flaggedmessages.MessageFlaggerTask";
                                    String string = UUID.randomUUID().toString();
                                    string.getClass();
                                    aijtVar.copyOnWrite();
                                    aiju aijuVar2 = (aiju) aijtVar.instance;
                                    aijuVar2.b |= 1;
                                    aijuVar2.c = string;
                                    evsn evsnVarBuild = aijtVar.build();
                                    evsnVarBuild.getClass();
                                    aiju aijuVar3 = (aiju) evsnVarBuild;
                                    AlarmManager alarmManager = aijsVar.b;
                                    if (alarmManager == null) {
                                        fdbq.c("alarmManager");
                                        alarmManager = null;
                                    }
                                    aijo aijoVar = new aijo(alarmManager);
                                    AlarmManager alarmManager2 = null;
                                    AlarmManager alarmManager3 = aijsVar.b;
                                    if (alarmManager3 == null) {
                                        fdbq.c("alarmManager");
                                    } else {
                                        alarmManager2 = alarmManager3;
                                    }
                                    aijsVar.b(instantB, aijuVar3, true, aijoVar, new aijp(alarmManager2));
                                    cdiaVar3.j = Optional.of(aijuVar3);
                                    cdiaVar3.i = Optional.of(instantB);
                                    ((eksl) ((eksl) cdia.a.h()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "setAlarmTimer", 229, "MessageFlagger.java")).s("MessageFlagger processing scheduled for %d seconds later.", Duration.between(instantB, cdiaVar3.d.f()).toSeconds());
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return null;
                    }
                }, cdiaVar.c);
            }
        }, this.c);
    }

    public final eiju b(final ekgb ekgbVar, final bvdo bvdoVar) {
        return ekgbVar.isEmpty() ? eijx.e(null) : eijx.g(new Callable() { // from class: cdhw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = cdia.a;
                String[] strArr = bpmq.a;
                bpmg bpmgVar = new bpmg();
                bpmgVar.f("unflagMessages");
                final ekgb ekgbVar2 = ekgbVar;
                final bvdo bvdoVar2 = bvdoVar;
                bpmgVar.a(new Function() { // from class: cdhv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bpmp bpmpVar = (bpmp) obj;
                        eksp ekspVar2 = cdia.a;
                        bpmpVar.c(ekgbVar2);
                        bpmpVar.d(bvdoVar2);
                        return bpmpVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return Boolean.valueOf(bpmgVar.d() > 0);
            }
        }, this.b).i(new eooz() { // from class: cdhx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(null);
                }
                cdia cdiaVar = this.a;
                cdiaVar.c();
                return cdiaVar.a();
            }
        }, this.c);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final void c() {
        synchronized (this.h) {
            if (this.i.isPresent()) {
                if (!this.j.isPresent()) {
                    ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "clearAlarmTimer", 242, "MessageFlagger.java")).q("Cannot delete reminder. Alarm token is null");
                    return;
                }
                this.e.a((aiju) this.j.get());
                this.j = Optional.empty();
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "clearAlarmTimer", 245, "MessageFlagger.java")).s("MessageFlagger cancelling alert scheduled for, %d seconds later.", Duration.between(this.i.get(), this.d.f()).toSeconds());
                this.i = Optional.empty();
            }
        }
    }
}
