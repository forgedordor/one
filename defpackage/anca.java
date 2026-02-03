package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anca implements andq {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/InternalMessagePager");
    public final ancc a;
    final AtomicReference b = new AtomicReference(Optional.empty());
    private final eosc d;
    private final eosc e;
    private final anej f;

    public anca(eosc eoscVar, eosc eoscVar2, anej anejVar, ancc anccVar) {
        this.d = eoscVar;
        this.e = eoscVar2;
        this.f = anejVar;
        this.a = anccVar;
    }

    private final eiju l(final eiju eijuVar, final eiju eijuVar2) {
        eieu eieuVarK = eiiy.k("InternalMessagePager#process");
        try {
            eiju eijuVarG = eiju.g(eika.d(eijuVar, eijuVar2).a(new Callable() { // from class: anbv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ekgb ekgbVar = (ekgb) eork.q(eijuVar);
                    andn andnVarA = ((ando) eork.q(eijuVar2)).a(ekgbVar);
                    return new andk(ekgbVar, andnVarA.a, andnVarA.b, new anbx(this.a));
                }
            }, this.d));
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final eiju m(final int i) {
        eieu eieuVarK = eiiy.k("InternalMessagePager#queryCountFuture");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: anbj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.a.ae().c(i);
                }
            }, this.e);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajma
    public final ajly a(ajlt ajltVar) {
        return i(ajltVar.b(), ajltVar.o());
    }

    @Override // defpackage.ajma
    public final ajly b(Integer num) {
        return new anas(num.intValue());
    }

    @Override // defpackage.ajma
    public final cquc c(ajlz ajlzVar) {
        eieu eieuVarK = eiiy.k("InternalMessagePager#subscribeToChanges");
        try {
            cquc cqucVarL = this.a.l(new anbw(this, ajlzVar));
            eieuVarK.close();
            return cqucVarL;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.andq
    public final void close() {
        j();
    }

    @Override // defpackage.ajma
    public final eiju d(final MessageId messageId) {
        eieu eieuVarK = eiiy.k("InternalMessagePager#absoluteOffset");
        try {
            eiju eijuVarH = eijx.h(new eooy() { // from class: anbu
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    MessageId messageId2 = messageId;
                    ejwl.l(messageId2 instanceof amgc);
                    final MessageIdType messageIdTypeC = ((amgc) messageId2).c();
                    amdx amdxVar = (amdx) this.a.a;
                    final long epochMilli = amdxVar.aj(messageId2).toEpochMilli();
                    if (messageId2 instanceof CoreBuglePartialMessageId) {
                        return amdxVar.g.e(amdxVar.k, messageIdTypeC, ((CoreBuglePartialMessageId) messageId2).b, epochMilli, false);
                    }
                    alyy alyyVar = amdxVar.g;
                    final BugleConversationId bugleConversationId = amdxVar.k;
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("fullMessageOffsetQuery");
                    brdrVarD.v();
                    brdrVarD.n(new dqxm("COUNT(*)"), "count");
                    brdrVarD.h(new Function() { // from class: alyd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            amfr.b(brecVar, bugleConversationId);
                            final long j = epochMilli;
                            final MessageIdType messageIdType = messageIdTypeC;
                            brecVar.b(new Function() { // from class: alxt
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return amgh.a.f.a((brec) obj2, Long.valueOf(j));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: alye
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object objA = amgh.a.e.a((brec) obj2, Long.valueOf(j));
                                    ((brec) objA).r(messageIdType.a);
                                    return objA;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brap brapVar = (brap) alyyVar.b.a(brdrVarD).b().p();
                    try {
                        if (!brapVar.moveToNext()) {
                            throw new IllegalStateException("cannot determine the absolute offset of a message");
                        }
                        Integer numValueOf = Integer.valueOf(Integer.parseInt(brapVar.de("count")));
                        brapVar.close();
                        return eijx.e(numValueOf);
                    } finally {
                    }
                }
            }, this.e);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajma
    public final eiju e(final ajly ajlyVar, final int i) {
        eiju eijuVarAh;
        eieu eieuVarK = eiiy.k("InternalMessagePager#loadAppend");
        try {
            j();
            ancc anccVar = this.a;
            if (((arky) ((amdx) anccVar).w.b()).a()) {
                eijuVarAh = ((amdx) anccVar).ah(((amdx) anccVar).g.f(((amdx) anccVar).k, (alzi) ajlyVar, i).b());
            } else {
                eijuVarAh = ((amdx) anccVar).ah(((amdx) anccVar).g.c(((amdx) anccVar).k, (alzi) ajlyVar, i).b());
            }
            eieu eieuVarK2 = eiiy.k("InternalMessagePager#queryCountAfterKeyFuture");
            try {
                eiju eijuVarG = eijx.g(new Callable() { // from class: anbk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.a.ae().a(ajlyVar);
                    }
                }, this.e);
                eieuVarK2.b(eijuVarG);
                eieuVarK2.close();
                eiju eijuVarH = l(eijuVarAh, eijuVarG).h(new ejvr() { // from class: anbm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        andk andkVar = (andk) obj;
                        ekgb ekgbVar = andkVar.a;
                        alzg alzgVar = ((amdx) this.a.a).h;
                        boolean zA = alzgVar.a(ekgbVar);
                        int i2 = i;
                        if (!zA) {
                            alzgVar.b(andkVar, i2);
                            return andkVar;
                        }
                        if (!(((ajlt) ekgbVar.get(0)).b() instanceof CoreBuglePartialMessageId)) {
                            andk andkVar2 = new andk(alzg.f(ekgbVar, 0, i2), andkVar.b, andkVar.c + Math.max(0, ekgbVar.size() - i2), alzgVar.b);
                            alzgVar.b(andkVar2, i2);
                            return andkVar2;
                        }
                        for (int i3 = 0; i3 < ekgbVar.size(); i3++) {
                            ajly ajlyVar2 = ajlyVar;
                            ajlt ajltVar = (ajlt) ekgbVar.get(i3);
                            ejwl.l(ajltVar.b() instanceof CoreBuglePartialMessageId);
                            CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) ajltVar.b();
                            ejwl.l(ajlyVar2 instanceof alzi);
                            alzi alziVar = (alzi) ajlyVar2;
                            if (coreBuglePartialMessageId.b <= alziVar.b()) {
                                ejwl.l(coreBuglePartialMessageId.a.a <= alziVar.a());
                                andk andkVar3 = new andk(alzg.f(ekgbVar, i3, i2 + i3), andkVar.b, (ekgbVar.size() - r6.size()) + andkVar.c, alzgVar.b);
                                alzgVar.b(andkVar3, i2);
                                return andkVar3;
                            }
                        }
                        throw new IllegalStateException("Expected to find a valid target for the paging key in the results");
                    }
                }, eoqg.a);
                eieuVarK.b(eijuVarH);
                eieuVarK.close();
                return eijuVarH;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajma
    public final eiju f(final ajly ajlyVar, final int i) {
        eiju eijuVarAh;
        eiju eijuVarH;
        eieu eieuVarK = eiiy.k("InternalMessagePager#loadInitial");
        try {
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/message/internal/InternalMessagePager", "loadInitial", 77, "InternalMessagePager.java")).q("InternalMessagePager loadInitial start.");
            Optional optionalJ = j();
            if (ajlyVar == null) {
                if (optionalJ.isPresent()) {
                    eijuVarH = ((anbz) optionalJ.get()).a;
                    eieuVarK.b(eijuVarH);
                } else {
                    eijuVarH = l(this.a.ai(0, i), m(0)).i(new eooz() { // from class: anbn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return ((amdx) this.a.a).h.d((andk) obj, 0, i);
                        }
                    }, eoqg.a);
                    eieuVarK.b(eijuVarH);
                }
            } else if (ajlyVar instanceof ancx) {
                final int iMax = Math.max(((ancx) ajlyVar).a() - (i / 2), 0);
                eijuVarH = l(this.a.ai(iMax, i), m(iMax)).i(new eooz() { // from class: anbo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((amdx) this.a.a).h.d((andk) obj, iMax, i);
                    }
                }, eoqg.a);
                eieuVarK.b(eijuVarH);
            } else {
                ancc anccVar = this.a;
                if (((arky) ((amdx) anccVar).w.b()).a()) {
                    alyy alyyVar = ((amdx) anccVar).g;
                    BugleConversationId bugleConversationId = ((amdx) anccVar).k;
                    alzi alziVar = (alzi) ajlyVar;
                    int i2 = i / 2;
                    brdr brdrVarF = alyyVar.f(bugleConversationId, alziVar, (i % 2) + i2);
                    brdrVarF.p(alyyVar.g(bugleConversationId, alziVar, i2 + 1));
                    eijuVarAh = ((amdx) anccVar).ah(brdrVarF.b());
                } else {
                    alyy alyyVar2 = ((amdx) anccVar).g;
                    BugleConversationId bugleConversationId2 = ((amdx) anccVar).k;
                    alzi alziVar2 = (alzi) ajlyVar;
                    int i3 = i / 2;
                    brdr brdrVarC = alyyVar2.c(bugleConversationId2, alziVar2, (i % 2) + i3);
                    brdrVarC.p(alyyVar2.a(bugleConversationId2, alziVar2, i3 + 1));
                    eijuVarAh = ((amdx) anccVar).ah(brdrVarC.b());
                }
                eieu eieuVarK2 = eiiy.k("InternalMessagePager#queryCountInitialKeyFuture");
                try {
                    eiju eijuVarG = eijx.g(new Callable() { // from class: anbt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.a.a.ae().b(ajlyVar);
                        }
                    }, this.e);
                    eieuVarK2.b(eijuVarG);
                    eieuVarK2.close();
                    eijuVarH = l(eijuVarAh, eijuVarG).h(new ejvr() { // from class: anbp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            andk andkVar = (andk) obj;
                            ekgb ekgbVar = andkVar.a;
                            alzg alzgVar = ((amdx) this.a.a).h;
                            boolean zA = alzgVar.a(ekgbVar);
                            int i4 = i;
                            if (!zA) {
                                alzgVar.b(andkVar, i4);
                                ekrw ekrwVarE = alzg.a.e();
                                ekrwVarE.X(eksq.a, "BugleMapi");
                                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clipInitial", 150, "BuglePagingClipToBounds.java")).u("returning message list without clipping, limit %d, list's size: %d", i4, ekgbVar.size());
                                return andkVar;
                            }
                            if (ekgbVar.size() <= i4) {
                                alzgVar.b(andkVar, i4);
                                ekrw ekrwVarH2 = alzg.a.h();
                                ekrwVarH2.X(eksq.a, "BugleMapi");
                                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clipInitial", 159, "BuglePagingClipToBounds.java")).u("Skip clipping despite multi-part messages at boundary, limit %d, list's size: %d", i4, ekgbVar.size());
                                return andkVar;
                            }
                            int iA = andkVar.a(ajlyVar);
                            int i5 = i4 / 2;
                            int i6 = iA - i5;
                            int i7 = iA + i5;
                            int iMax2 = Math.max(0, i6);
                            int iMin = Math.min(i7 + (i4 % 2), ekgbVar.size());
                            andk andkVar2 = new andk(alzg.f(ekgbVar, iMax2, iMin), andkVar.b + iMax2, (andkVar.c + ekgbVar.size()) - iMin, alzgVar.b);
                            alzgVar.b(andkVar2, i4);
                            return andkVar2;
                        }
                    }, eoqg.a);
                    eieuVarK.b(eijuVarH);
                } finally {
                }
            }
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajma
    public final eiju g(final ajly ajlyVar, final int i) {
        eiju eijuVarAh;
        eieu eieuVarK = eiiy.k("InternalMessagePager#loadPrepend");
        try {
            j();
            ancc anccVar = this.a;
            if (((arky) ((amdx) anccVar).w.b()).a()) {
                eijuVarAh = ((amdx) anccVar).ah(((amdx) anccVar).g.g(((amdx) anccVar).k, (alzi) ajlyVar, i));
            } else {
                eijuVarAh = ((amdx) anccVar).ah(((amdx) anccVar).g.a(((amdx) anccVar).k, (alzi) ajlyVar, i));
            }
            eieu eieuVarK2 = eiiy.k("InternalMessagePager#queryCountBeforeKeyFuture");
            try {
                eiju eijuVarG = eijx.g(new Callable() { // from class: anbl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.a.ae().d(ajlyVar);
                    }
                }, this.e);
                eieuVarK2.b(eijuVarG);
                eieuVarK2.close();
                eiju eijuVarH = l(eijuVarAh, eijuVarG).h(new ejvr() { // from class: anbr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        CoreBuglePartialMessageId coreBuglePartialMessageId;
                        alzi alziVar;
                        andk andkVar = (andk) obj;
                        ekgb ekgbVar = andkVar.a;
                        alzg alzgVar = ((amdx) this.a.a).h;
                        boolean zA = alzgVar.a(ekgbVar);
                        int i2 = i;
                        if (!zA) {
                            alzgVar.b(andkVar, i2);
                            return andkVar;
                        }
                        if (!(((ajlt) ekis.j(ekgbVar)).b() instanceof CoreBuglePartialMessageId)) {
                            int iMax = Math.max(0, ekgbVar.size() - i2);
                            andk andkVar2 = new andk(alzg.f(ekgbVar, iMax, ekgbVar.size()), andkVar.b + iMax, andkVar.c, alzgVar.b);
                            alzgVar.b(andkVar2, i2);
                            return andkVar2;
                        }
                        int size = ekgbVar.size();
                        int size2 = ekgbVar.size();
                        do {
                            size2--;
                            if (size2 < 0) {
                                throw new IllegalStateException("Expected to find a valid target for the paging key in the results");
                            }
                            ajly ajlyVar2 = ajlyVar;
                            ajlt ajltVar = (ajlt) ekgbVar.get(size2);
                            ejwl.l(ajltVar.b() instanceof CoreBuglePartialMessageId);
                            coreBuglePartialMessageId = (CoreBuglePartialMessageId) ajltVar.b();
                            ejwl.l(ajlyVar2 instanceof alzi);
                            alziVar = (alzi) ajlyVar2;
                        } while (coreBuglePartialMessageId.b < alziVar.b());
                        ejwl.l(coreBuglePartialMessageId.a.a >= alziVar.a());
                        int iMin = Math.min(size, size2 + 1);
                        andk andkVar3 = new andk(alzg.f(ekgbVar, Math.max(0, iMin - i2), iMin), (ekgbVar.size() - r6.size()) + andkVar.b, andkVar.c, alzgVar.b);
                        alzgVar.b(andkVar3, i2);
                        return andkVar3;
                    }
                }, eoqg.a);
                eieuVarK.b(eijuVarH);
                eieuVarK.close();
                return eijuVarH;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajma
    public final eiju h(final MessageId messageId) {
        eieu eieuVarK = eiiy.k("InternalMessagePager#pagingKeyOf");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: anbs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    anca ancaVar = this.a;
                    ancc anccVar = ancaVar.a;
                    MessageId messageId2 = messageId;
                    return ancaVar.i(messageId2, anccVar.aj(messageId2));
                }
            }, this.e);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajly i(MessageId messageId, Instant instant) {
        return this.a.ad(messageId, instant);
    }

    public final Optional j() {
        Optional optional = (Optional) this.b.getAndSet(Optional.empty());
        optional.ifPresent(new Consumer() { // from class: anbq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((anbz) obj).b.a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return optional;
    }

    @Override // defpackage.andq
    public final void k() {
        eieu eieuVarK = eiiy.k("InternalMessagePager#startPreload");
        try {
            anbz anbzVar = new anbz();
            anbzVar.b = c(new anby());
            ancc anccVar = this.a;
            Object objE = this.f.a.e();
            objE.getClass();
            anbzVar.a = l(anccVar.ai(0, ((Number) objE).intValue()), m(0));
            ejwl.l(((Optional) this.b.getAndSet(Optional.of(anbzVar))).isEmpty());
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
