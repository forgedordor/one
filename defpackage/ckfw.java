package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckfw implements cdhb, bayh {
    static final cczi a = cdag.k(cdag.b, "rcs_not_delivered_tracker_timeout_seconds", TimeUnit.MINUTES.toSeconds(60));
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsNotDeliveredMessageTracker");
    public final cogw c;
    public final cdik d;
    public final cgbn e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final eosc j;
    public final fcsu k;
    public final aquo l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final arwe s;
    private final arwd t;

    public ckfw(cogw cogwVar, cdik cdikVar, cgbn cgbnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, eosc eoscVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, aquo aquoVar, arwe arweVar, arwd arwdVar) {
        this.c = cogwVar;
        this.d = cdikVar;
        this.e = cgbnVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.m = fcsuVar3;
        this.n = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.o = fcsuVar7;
        this.j = eoscVar;
        this.k = fcsuVar8;
        this.p = fcsuVar9;
        this.q = fcsuVar10;
        this.r = fcsuVar11;
        this.l = aquoVar;
        this.s = arweVar;
        this.t = arwdVar;
    }

    public static boolean g(int i) {
        return i == 3;
    }

    private final boolean h(MessageCoreData messageCoreData) {
        return ((!this.s.a() && !this.t.a()) || messageCoreData.cB() || ((anpp) this.i.b()).d()) ? false : true;
    }

    @Override // defpackage.bayh
    public final void a(MessageCoreData messageCoreData) {
        ejwl.l(!ecem.g());
        eieu eieuVarC = c();
        try {
            if (messageCoreData.cX()) {
                fcsu fcsuVar = this.f;
                bojh bojhVarR = ((bakt) fcsuVar.b()).r(messageCoreData.A());
                if (bojhVarR != null && bojhVarR.k() == 0 && !bojhVarR.an() && ((chwq) this.m.b()).A(bojhVarR.C())) {
                    aquo aquoVar = this.l;
                    if (aquoVar.a() || h(messageCoreData)) {
                        this.d.c(messageCoreData.C(), this.c.f(), bvdo.RCS_NOT_DELIVERED, (aquoVar.a() && ((bakt) fcsuVar.b()).ac(messageCoreData.A())) ? Duration.ofSeconds(((Long) this.r.b()).longValue()) : h(messageCoreData) ? Duration.ofSeconds(((Long) this.o.b()).longValue()) : Duration.ZERO);
                    } else {
                        this.d.b(messageCoreData.C(), this.c.f(), bvdo.RCS_NOT_DELIVERED);
                    }
                }
            }
            eieuVarC.close();
        } catch (Throwable th) {
            try {
                eieuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cdhb
    public final eiju b(final ekgb ekgbVar) {
        return eijx.h(new eooy() { // from class: ckfu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ekfw ekfwVar2 = new ekfw();
                ekfw ekfwVar3 = new ekfw();
                ekgb ekgbVar2 = ekgbVar;
                int size = ekgbVar2.size();
                int i2 = 0;
                while (true) {
                    final ckfw ckfwVar = this.a;
                    if (i2 >= size) {
                        ckfwVar.f(ekfwVar3.g());
                        ekgb ekgbVarG = ekfwVar2.g();
                        final ekgb ekgbVarG2 = ekfwVar.g();
                        return eijx.a(((anpp) ckfwVar.i.b()).c(ekgbVarG, eljx.DELIVERY_MESSAGE_TIMEOUT)).i(new eooz() { // from class: ckfv
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                List list = (List) obj;
                                final ekhx ekhxVar = (ekhx) Collection.EL.stream(list).filter(new Predicate() { // from class: ckfp
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
                                        ekrg ekrgVar = ckfw.b;
                                        return !ckfw.g(((anpq) obj2).b());
                                    }
                                }).map(new Function() { // from class: ckfq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((anpq) obj2).a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(ekcv.b);
                                Stream streamFilter = Collection.EL.stream(ekgbVarG2).filter(new Predicate() { // from class: ckfr
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
                                        ekrg ekrgVar = ckfw.b;
                                        return ekhxVar.contains(((bple) obj2).m());
                                    }
                                });
                                int i3 = ekgb.d;
                                Collector collector = ekcv.a;
                                ekgb ekgbVar3 = (ekgb) streamFilter.collect(collector);
                                ekgb ekgbVar4 = (ekgb) Collection.EL.stream(list).filter(new Predicate() { // from class: ckfs
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
                                        ekrg ekrgVar = ckfw.b;
                                        return ckfw.g(((anpq) obj2).b());
                                    }
                                }).map(new Function() { // from class: ckfq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((anpq) obj2).a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(collector);
                                ckfw ckfwVar2 = ckfwVar;
                                ckfwVar2.f(ekgbVar4);
                                if (!ekgbVar3.isEmpty()) {
                                    if (((Boolean) ((cczi) cixl.b.get()).e()).booleanValue()) {
                                        ((cixm) ((Optional) ckfwVar2.h.b()).get()).b();
                                    } else {
                                        eijx.e(null);
                                    }
                                    if (ckfwVar2.l.a()) {
                                        int size2 = ekgbVar3.size();
                                        for (int i4 = 0; i4 < size2; i4++) {
                                            bple bpleVar = (bple) ekgbVar3.get(i4);
                                            fcsu fcsuVar = ckfwVar2.g;
                                            final MessageIdType messageIdTypeM = bpleVar.m();
                                            ecem.b();
                                            brdr brdrVarD = MessagesTable.d();
                                            brdrVarD.A("MessageDatabaseOperations#getConversationIdForMessageId");
                                            brdrVarD.c(MessagesTable.c.b);
                                            brdrVarD.h(new Function() { // from class: bawa
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj2) {
                                                    brec brecVar = (brec) obj2;
                                                    cqce cqceVar = baxe.a;
                                                    brecVar.u(messageIdTypeM);
                                                    return brecVar;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            ekgb ekgbVarF = brdrVarD.b().f();
                                            Optional optionalOf = ((ekoe) ekgbVarF).c > 0 ? Optional.of((ConversationIdType) ekgbVarF.get(0)) : Optional.empty();
                                            if (!optionalOf.isEmpty() && ((bakt) ckfwVar2.f.b()).ac((ConversationIdType) optionalOf.get())) {
                                                ((baxe) fcsuVar.b()).Z((ConversationIdType) optionalOf.get(), bpleVar.m());
                                            }
                                        }
                                    }
                                }
                                ckfwVar2.e.C(ekgbVar3);
                                ((ekrd) ((ekrd) ckfw.b.h()).h("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsNotDeliveredMessageTracker", "startAutoFallbackAndNotify", 260, "RcsNotDeliveredMessageTracker.java")).r("Refreshing notification for %d not yet delivered RCS", ekgbVar3.size());
                                return ekgbVar3.isEmpty() ? eijx.e(null) : ckfwVar2.d.a((ekgb) Collection.EL.stream(ekgbVar3).map(new Function() { // from class: ckft
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((bple) obj2).m();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(collector), bvdo.RCS_NOT_DELIVERED);
                            }
                        }, ckfwVar.j);
                    }
                    bple bpleVar = (bple) ekgbVar2.get(i2);
                    MessageIdType messageIdTypeM = bpleVar.m();
                    MessageCoreData messageCoreDataW = ((baxe) ckfwVar.g.b()).w(messageIdTypeM);
                    if (messageCoreDataW == null || !messageCoreDataW.cX() || messageCoreDataW.cF() || baui.k(messageCoreDataW.k()) || messageCoreDataW.r() < ckfwVar.c.f().toEpochMilli() - Duration.ofDays(((Long) ckfwVar.k.b()).longValue()).toMillis()) {
                        ekfwVar3.h(messageIdTypeM);
                    } else {
                        ekfwVar.h(bpleVar);
                        ekfwVar2.h(messageCoreDataW);
                    }
                    i2++;
                }
            }
        }, this.j);
    }

    @Override // defpackage.bayh, defpackage.baye
    public final eieu c() {
        return eiiy.k("RcsNotDeliveredMessageTracker");
    }

    @Override // defpackage.cdhb
    public final Duration d() {
        return ((anpp) this.i.b()).d() ? !((cqhz) this.p.b()).a() ? Duration.ofSeconds(((Long) this.q.b()).longValue()) : Duration.ofSeconds(((Long) this.o.b()).longValue()) : Duration.ofSeconds(((Long) a.e()).longValue());
    }

    public final void e(MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("RcsNotDeliveredMessageTracker::stopTracking");
        try {
            this.d.d(messageIdType, bvdo.RCS_NOT_DELIVERED);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("RcsNotDeliveredMessageTracker::stopTracking");
        try {
            ((cdia) this.n.b()).b(ekgbVar, bvdo.RCS_NOT_DELIVERED);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
