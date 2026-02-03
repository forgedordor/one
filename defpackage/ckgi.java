package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgi implements cdhb {
    public static final cqce a = cqce.g("Bugle", "RcsStillSendingMessageTracker");
    public static final eksp b = eksp.c("Bugle");
    public final eoqr c = new eoqr();
    public final eosc d;
    public final fcsu e;
    public final cdik f;
    public final fcsu g;
    public final cgbn h;
    private final eosc i;
    private final eosc j;
    private final fcsu k;
    private final fcsu l;

    public ckgi(eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar, cdik cdikVar, fcsu fcsuVar2, cgbn cgbnVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.i = eoscVar;
        this.d = eoscVar2;
        this.e = fcsuVar;
        this.f = cdikVar;
        this.g = fcsuVar2;
        this.h = cgbnVar;
        this.j = eoscVar3;
        this.k = fcsuVar3;
        this.l = fcsuVar4;
    }

    public final void a(MessageIdType messageIdType, Instant instant) {
        eieu eieuVarK = eiiy.k("RcsStillSendingMessageTracker::startTracking");
        try {
            this.f.b(messageIdType, instant, bvdo.RCS_STILL_SENDING);
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

    @Override // defpackage.cdhb
    public final eiju b(final ekgb ekgbVar) {
        return eijx.h(new eooy() { // from class: ckfz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                int i = ekgb.d;
                final ekfw ekfwVar = new ekfw();
                ekfw ekfwVar2 = new ekfw();
                final ekgb ekgbVar2 = ekgbVar;
                int size = ekgbVar2.size();
                int i2 = 0;
                while (true) {
                    final ckgi ckgiVar = this.a;
                    if (i2 >= size) {
                        return eijx.i((Iterable) Collection.EL.stream(ekfwVar2.g()).map(new Function() { // from class: ckgg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                                final ckgi ckgiVar2 = ckgiVar;
                                return eiju.g(ckgiVar2.c.b(eiid.c(new eooy() { // from class: ckfy
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        return ((anpp) ckgiVar2.g.b()).a(messageCoreData, eljx.SEND_MESSAGE_TIMEOUT_AUTO_FALLBACK);
                                    }
                                }), ckgiVar2.d));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(ekcv.a)).i(new eooz() { // from class: ckgh
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                Stream map = Collection.EL.stream((List) obj).filter(new Predicate() { // from class: ckga
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
                                        anpq anpqVar = (anpq) obj2;
                                        cqce cqceVar = ckgi.a;
                                        return anpqVar != null && anpqVar.b() == 3;
                                    }
                                }).map(new Function() { // from class: ckgb
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        anpq anpqVar = (anpq) obj2;
                                        eksl ekslVar = (eksl) ckgi.b.h();
                                        ekrz ekrzVar = cqnc.b;
                                        anpqVar.getClass();
                                        ekslVar.X(ekrzVar, anpqVar.a());
                                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsStillSendingMessageTracker", "initiateFallbackAndComputeNotifyMessages", 224, "RcsStillSendingMessageTracker.java")).q("Auto fallback initiated");
                                        return anpqVar.a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i3 = ekgb.d;
                                ekgb ekgbVar3 = (ekgb) map.collect(ekcv.a);
                                ekfw ekfwVar3 = ekfwVar;
                                ekfwVar3.j(ekgbVar3);
                                ckgi ckgiVar2 = ckgiVar;
                                cdik cdikVar = ckgiVar2.f;
                                eygg eyggVar = cdikVar.d;
                                final ekgb ekgbVarG = ekfwVar3.g();
                                final bvdo bvdoVar = bvdo.RCS_STILL_SENDING;
                                eiju eijuVarB = ((cdia) eyggVar.b()).b(ekgbVarG, bvdoVar);
                                ejvr ejvrVar = new ejvr() { // from class: cdic
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        ((eksl) ((eksl) cdik.b.h()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageTracker", "stopTracking", 153, "MessageTracker.java")).D("Stopped tracking messages %s for tracking purpose %s", ekgbVarG, bvdoVar);
                                        return null;
                                    }
                                };
                                eosc eoscVar = cdikVar.c;
                                eiju eijuVarE = eijuVarB.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: cdid
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        ((eksl) ((eksl) ((eksl) cdik.b.j()).g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageTracker", "stopTracking", 161, "MessageTracker.java")).D("Error when trying to stop tracking %s for tracking purpose %s", ekgbVarG, bvdoVar);
                                        return null;
                                    }
                                }, eoscVar);
                                final ekgb ekgbVar4 = ekgbVar2;
                                return eijuVarE.h(new ejvr() { // from class: ckgc
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        cqce cqceVar = ckgi.a;
                                        Stream stream = Collection.EL.stream(ekgbVar4);
                                        final ekgb ekgbVar5 = ekgbVarG;
                                        Stream streamFilter = stream.filter(new Predicate() { // from class: ckgd
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
                                                cqce cqceVar2 = ckgi.a;
                                                return !ekgbVar5.contains(((bple) obj3).m());
                                            }
                                        });
                                        int i4 = ekgb.d;
                                        Collector collector = ekcv.a;
                                        ekgb ekgbVar6 = (ekgb) streamFilter.collect(collector);
                                        return Collection.EL.stream(ekgbVar6).allMatch(new Predicate() { // from class: ckge
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
                                                return ((bple) obj3).q();
                                            }
                                        }) ? ekoe.a : (ekgb) Collection.EL.stream(ekgbVar6).map(new Function() { // from class: ckgf
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                return ((bple) obj3).m();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(collector);
                                    }
                                }, ckgiVar2.d);
                            }
                        }, ckgiVar.d);
                    }
                    bple bpleVar = (bple) ekgbVar2.get(i2);
                    MessageCoreData messageCoreDataW = ((baxe) ckgiVar.e.b()).w(bpleVar.m());
                    if (messageCoreDataW == null || !baui.n(messageCoreDataW.k())) {
                        ekfwVar.h(bpleVar.m());
                    } else {
                        ekfwVar2.h(messageCoreDataW);
                    }
                    i2++;
                }
            }
        }, this.j).i(new eooz() { // from class: ckfx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgb ekgbVar2 = (ekgb) obj;
                if (ekgbVar2.isEmpty()) {
                    return eijx.e(null);
                }
                ckgi ckgiVar = this.a;
                ckgiVar.h.D(ekgbVar2);
                cqbd cqbdVarC = ckgi.a.c();
                cqbdVarC.I("Refresh notification for RCS still sending");
                cqbdVarC.A("messageIds", ekgbVar2);
                cqbdVarC.r();
                return ckgiVar.f.a(ekgbVar2, bvdo.RCS_STILL_SENDING);
            }
        }, this.i);
    }

    public final void c(MessageIdType messageIdType, Instant instant, Duration duration) {
        eieu eieuVarK = eiiy.k("RcsStillSendingMessageTracker::startTracking");
        try {
            this.f.c(messageIdType, instant, bvdo.RCS_STILL_SENDING, duration);
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

    @Override // defpackage.cdhb
    public final Duration d() {
        return !((cqhz) this.k.b()).a() ? Duration.ofSeconds(((Long) this.l.b()).longValue()) : Duration.ofMillis(((Long) anpo.c.e()).longValue());
    }
}
