package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmb implements cfmz {
    public static final cqce a = cqce.g("BugleNetwork", "ListConversationsDelegate");
    private static final ekgp g;
    public final cehg b;
    public final fcsu c;
    public final Executor d;
    public final fcsu e;
    public final fcsu f;
    private final fcsu h;
    private final cexq i;
    private final eosc j;
    private final eosc k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(eowr.ACTIVE, cdpg.HOME);
        ekgiVar.i(eowr.ARCHIVED, cdpg.ARCHIVED);
        ekgiVar.i(eowr.KEEP_ARCHIVED, cdpg.ARCHIVED);
        ekgiVar.i(eowr.SPAM_FOLDER, cdpg.SPAM_FOLDER);
        ekgiVar.i(eowr.BLOCKED_FOLDER, cdpg.SPAM_FOLDER);
        g = ekgiVar.c();
    }

    public cfmb(fcsu fcsuVar, cehg cehgVar, cexq cexqVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.h = fcsuVar;
        this.b = cehgVar;
        this.i = cexqVar;
        this.c = fcsuVar2;
        this.j = eoscVar;
        this.k = eoscVar2;
        this.e = fcsuVar6;
        this.d = new eoss(eoscVar);
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.n = fcsuVar5;
        this.f = fcsuVar7;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    @Override // defpackage.cfmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.eiju b(defpackage.cfmy r14, defpackage.evuh r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfmb.b(cfmy, evuh):eiju");
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ evuh c(evqs evqsVar) {
        return (epai) evsn.parseFrom(epai.a, evqsVar);
    }

    public final eiju d(final bajf bajfVar) {
        return this.i.b(bajfVar.J()).i(new eooz() { // from class: cfli
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.b.f(bajfVar, (ekgb) obj);
            }
        }, this.d);
    }

    public final eopy e(final bcut bcutVar, ekgb ekgbVar, final epai epaiVar, final long j, final ConversationIdType conversationIdType) {
        final int iA = cfkq.a();
        final badt badtVar = (badt) this.h.b();
        eiju eijuVarE = ekgbVar.isEmpty() ? eijx.e((epaj) epak.a.createBuilder()) : eijx.a((ekgb) Collection.EL.stream(ekgbVar).map(new Function() { // from class: cflp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.d((bajf) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a)).h(new ejvr() { // from class: cflq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = cfmb.a;
                epaj epajVar = (epaj) epak.a.createBuilder();
                int i = 0;
                for (eowm eowmVar : (List) obj) {
                    int i2 = iA;
                    int serializedSize = eowmVar.getSerializedSize() + i;
                    if (serializedSize < i2) {
                        epajVar.a(eowmVar);
                        i = serializedSize;
                    }
                }
                return epajVar;
            }
        }, this.k);
        eooz eoozVar = new eooz() { // from class: cfln
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final bcut bcutVar2 = bcutVar;
                final epaj epajVar = (epaj) obj;
                bcutVar2.di();
                boolean zBooleanValue = ((Boolean) ((cczi) bvfd.p.get()).e()).booleanValue();
                epai epaiVar2 = epaiVar;
                final badt badtVar2 = badtVar;
                if (!zBooleanValue || epaiVar2.c <= ((Integer) agzg.a.e()).intValue()) {
                    bcutVar2.moveToFirst();
                    while (true) {
                        if (bcutVar2.isAfterLast()) {
                            break;
                        }
                        long j2 = j;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        badtVar2.M(bcutVar2);
                        if (conversationIdType2.equals(badtVar2.J())) {
                            if (badtVar2.G() <= j2) {
                                break;
                            }
                            bcutVar2.moveToNext();
                        } else if (badtVar2.G() < j2) {
                            while (badtVar2.G() <= j2 && bcutVar2.moveToPrevious()) {
                                badtVar2.M(bcutVar2);
                            }
                        } else {
                            bcutVar2.moveToNext();
                        }
                    }
                }
                final cfmb cfmbVar = this.a;
                int iSum = Collection.EL.stream(DesugarCollections.unmodifiableList(((epak) epajVar.instance).c)).mapToInt(new ToIntFunction() { // from class: cflj
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj2) {
                        return ((eowm) obj2).getSerializedSize();
                    }
                }).sum();
                int iIntValue = epaiVar2.c;
                if (iIntValue == 0) {
                    iIntValue = ((Integer) bvfd.g.e()).intValue();
                }
                int i = iIntValue;
                final cfma cfmaVar = new cfma(bcutVar2, iSum);
                eiju eijuVarE2 = eijx.e(null);
                for (int i2 = 0; i2 < i; i2++) {
                    final int i3 = iA;
                    eooz eoozVar2 = new eooz() { // from class: cflk
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            bcutVar2.di();
                            cfma cfmaVar2 = cfmaVar;
                            if (!cfmaVar2.c) {
                                bcut bcutVar3 = cfmaVar2.a;
                                if (bcutVar3.moveToNext()) {
                                    badt badtVar3 = badtVar2;
                                    cfmb cfmbVar2 = cfmbVar;
                                    badtVar3.M(bcutVar3);
                                    return cfmbVar2.d(badtVar3).h(new ejvr() { // from class: cfls
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            return Optional.of((eowm) obj3);
                                        }
                                    }, cfmbVar2.d);
                                }
                            }
                            cfmaVar2.c = true;
                            return eijx.e(Optional.empty());
                        }
                    };
                    Executor executor = cfmbVar.d;
                    eijuVarE2 = eijuVarE2.i(eoozVar2, executor).h(new ejvr() { // from class: cfll
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Optional optional = (Optional) obj2;
                            cqce cqceVar = cfmb.a;
                            cfma cfmaVar2 = cfmaVar;
                            if (cfmaVar2.c || optional.isEmpty()) {
                                return null;
                            }
                            int i4 = i3;
                            bcutVar2.di();
                            eowm eowmVar = (eowm) optional.get();
                            int serializedSize = eowmVar.getSerializedSize();
                            if (cfmaVar2.b + serializedSize < i4) {
                                epajVar.a(eowmVar);
                                cfmaVar2.b += serializedSize;
                                return null;
                            }
                            bcut bcutVar3 = cfmaVar2.a;
                            bcutVar3.moveToPrevious();
                            if (!bcutVar3.isBeforeFirst()) {
                                badtVar2.M(bcutVar3);
                            }
                            cfmaVar2.c = true;
                            return null;
                        }
                    }, executor);
                }
                return eijuVarE2.h(new ejvr() { // from class: cflm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = cfmb.a;
                        return epajVar;
                    }
                }, cfmbVar.d);
            }
        };
        Executor executor = this.d;
        return eijs.c(eijuVarE.i(eoozVar, executor).h(new ejvr() { // from class: cflo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bcut bcutVar2 = bcutVar;
                epaj epajVar = (epaj) obj;
                bcutVar2.di();
                if (bcutVar2.moveToNext() && ((epak) epajVar.instance).c.size() > 0) {
                    if (bcutVar2.isFirst()) {
                        epaf epafVar = (epaf) epag.a.createBuilder();
                        epafVar.copyOnWrite();
                        ((epag) epafVar.instance).b = "EMPTY";
                        epafVar.copyOnWrite();
                        ((epag) epafVar.instance).c = Long.MAX_VALUE;
                        epajVar.copyOnWrite();
                        epak epakVar = (epak) epajVar.instance;
                        epag epagVar = (epag) epafVar.build();
                        epagVar.getClass();
                        epakVar.e = epagVar;
                        epakVar.b |= 1;
                    } else {
                        badt badtVar2 = badtVar;
                        epaf epafVar2 = (epaf) epag.a.createBuilder();
                        String strA = badtVar2.J().a();
                        epafVar2.copyOnWrite();
                        epag epagVar2 = (epag) epafVar2.instance;
                        strA.getClass();
                        epagVar2.b = strA;
                        long jG = badtVar2.G();
                        epafVar2.copyOnWrite();
                        ((epag) epafVar2.instance).c = jG;
                        epajVar.copyOnWrite();
                        epak epakVar2 = (epak) epajVar.instance;
                        epag epagVar3 = (epag) epafVar2.build();
                        epagVar3.getClass();
                        epakVar2.e = epagVar3;
                        epakVar2.b |= 1;
                        String str = String.valueOf(badtVar2.J()) + "\u2063" + badtVar2.G();
                        epajVar.copyOnWrite();
                        ((epak) epajVar.instance).d = str;
                    }
                }
                return (epak) epajVar.build();
            }
        }, executor)).a;
    }
}
