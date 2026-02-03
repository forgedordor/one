package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.InitiateClientSideFallbackAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anqc implements anpp {
    public static final eksp a = eksp.c("BugleRcs");
    public final baxf b;
    public final aofc c;
    public final cqbm d;
    public final eosc e;
    public final eosc f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final eijt j = new eijt();
    public final arwe k;
    public final arwd l;
    public final axpj m;
    private final eosc n;
    private final crqv o;
    private final fcsu p;
    private final boolean q;

    public anqc(baxf baxfVar, aofc aofcVar, cqbm cqbmVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, crqv crqvVar, axpj axpjVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, arwe arweVar, arwd arwdVar, boolean z) {
        this.b = baxfVar;
        this.c = aofcVar;
        this.d = cqbmVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.n = eoscVar3;
        this.o = crqvVar;
        this.m = axpjVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.p = fcsuVar4;
        this.k = arweVar;
        this.l = arwdVar;
        this.q = z;
    }

    @Override // defpackage.anpp
    public final eiju a(final MessageCoreData messageCoreData, final eljx eljxVar) {
        return !messageCoreData.cX() ? eijx.e(new anpn(messageCoreData.C(), 7)) : this.q ? eijx.g(new Callable() { // from class: anpt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.f(messageCoreData, eljxVar));
            }
        }, this.n).i(new eooz() { // from class: anpu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MessageCoreData messageCoreData2 = messageCoreData;
                if (zBooleanValue) {
                    return eijx.e(new anpn(messageCoreData2.C(), 5));
                }
                return this.a.e(messageCoreData2, eljxVar);
            }
        }, this.f) : f(messageCoreData, eljxVar) ? eijx.e(new anpn(messageCoreData.C(), 5)) : e(messageCoreData, eljxVar);
    }

    @Override // defpackage.anpp
    public final eiju b(final MessageIdType messageIdType, final eljx eljxVar) {
        return eijx.h(new eooy() { // from class: anps
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                anqc anqcVar = this.a;
                baxe baxeVar = (baxe) anqcVar.i.b();
                MessageIdType messageIdType2 = messageIdType;
                MessageCoreData messageCoreDataW = baxeVar.w(messageIdType2);
                if (messageCoreDataW != null) {
                    return anqcVar.a(messageCoreDataW, eljxVar);
                }
                eksl ekslVar = (eksl) anqc.a.h();
                ekslVar.X(cqnc.b, messageIdType2);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallback", 252, "RcsFallbackControllerImpl.java")).q("Fallback not initiated as message not found");
                return eijx.e(new anpn(messageIdType2, 1));
            }
        }, this.n);
    }

    @Override // defpackage.anpp
    public final ekgb c(ekgb ekgbVar, final eljx eljxVar) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: anpy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                final anqc anqcVar = this.a;
                final eljx eljxVar2 = eljxVar;
                return eiju.g(anqcVar.j.a(new eooy() { // from class: anpw
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        return anqcVar.a(messageCoreData, eljxVar2);
                    }
                }, anqcVar.f));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    @Override // defpackage.anpp
    public final boolean d() {
        return this.o.q("auto_fallback_rcs", false);
    }

    public final eiju e(final MessageCoreData messageCoreData, final eljx eljxVar) {
        if (messageCoreData.m() != 0 || civb.a(messageCoreData.ac(), civa.RCS_PENPAL_NAMESPACE, "LOCALE").isPresent() || ((Boolean) messageCoreData.af().map(new Function() { // from class: anpx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((alqm) obj).z());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallbackInternal", 163, "RcsFallbackControllerImpl.java")).q("Penpal message fallback blocked");
            return eijx.e(new anpn(messageCoreData.C(), 8));
        }
        if (((Boolean) this.p.b()).booleanValue() && (ckfj.a(messageCoreData) || civb.a(messageCoreData.ac(), civa.RCS_EDIT_NAMESPACE, "Edited-Message-Id").isPresent())) {
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallbackInternal", 169, "RcsFallbackControllerImpl.java")).q("Message edits not allowed in fallback");
            return eijx.e(new anpn(messageCoreData.C(), 9));
        }
        if (ckxi.a(messageCoreData.ac()) == ckmc.REACTION_ACTION_UNSPECIFIED && !civb.a(messageCoreData.ac(), civa.REACTIONS_NAMESPACE, "Message-Reply-Type").isPresent()) {
            return eijx.g(new Callable() { // from class: anqa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ((bakt) this.a.h.b()).F(messageCoreData.A()).map(new Function() { // from class: anpv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            baks baksVar = (baks) obj;
                            eksp ekspVar = anqc.a;
                            boolean z = false;
                            if (baksVar.a() == 0 && !baksVar.b()) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            }, this.n).i(new eooz() { // from class: anqb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean zIsEmpty = optional.isEmpty();
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    if (zIsEmpty || !((Boolean) optional.get()).booleanValue()) {
                        return eijx.e(new anpn(messageCoreData2.C(), 8));
                    }
                    final eljx eljxVar2 = eljxVar;
                    final anqc anqcVar = this.a;
                    return anqcVar.c.e(messageCoreData2.v()).h(new ejvr() { // from class: anpz
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Optional optional2 = (Optional) obj2;
                            boolean zIsEmpty2 = optional2.isEmpty();
                            MessageCoreData messageCoreData3 = messageCoreData2;
                            if (zIsEmpty2) {
                                ((eksl) anqc.a.n().h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "fallbackIfConnected", 280, "RcsFallbackControllerImpl.java")).q("fallbackIfConnected: exists due to empty SelfIdentity");
                                return new anpn(messageCoreData3.C(), 6);
                            }
                            anqc anqcVar2 = anqcVar;
                            int iB = ((aoer) optional2.get()).b();
                            int iA = anqcVar2.b.a(messageCoreData3, iB);
                            Optional optionalOf = Objects.equals(((cqey) anqcVar2.d.a()).d(iA, iB), cqgk.AVAILABLE) ? Optional.of(Integer.valueOf(iA)) : Optional.empty();
                            if (optionalOf.isEmpty()) {
                                ((eksl) ((eksl) anqc.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "fallbackIfConnected", 288, "RcsFallbackControllerImpl.java")).q("fallbackIfConnected: exists due to absent fallback protocol");
                                return new anpn(messageCoreData3.C(), 6);
                            }
                            eljx eljxVar3 = eljxVar2;
                            int iIntValue = ((Integer) optionalOf.get()).intValue();
                            aoer aoerVar = (aoer) optional2.get();
                            arwe arweVar = anqcVar2.k;
                            if ((arweVar.a() || anqcVar2.l.a()) && !anpr.a(eljxVar3) && !anqcVar2.d()) {
                                boolean zA = iIntValue == 0 ? arweVar.a() : anqcVar2.l.a() && !aoerVar.y();
                                ekrw ekrwVarN = anqc.a.n();
                                ekrwVarN.X(cqnc.b, messageCoreData3.C());
                                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "fallbackWithUnexpectedCost", 380, "RcsFallbackControllerImpl.java")).x("Auto fallback attempt via protocol %s without potential cost %s", iIntValue, zA);
                                if (!zA) {
                                    return new anpn(messageCoreData3.C(), 11);
                                }
                            }
                            int iB2 = ((aoer) optional2.get()).b();
                            axpj axpjVar = anqcVar2.m;
                            MessageIdType messageIdTypeC = messageCoreData3.C();
                            cogw cogwVar = (cogw) axpjVar.b.b();
                            cogwVar.getClass();
                            ajhd ajhdVar = (ajhd) axpjVar.c.b();
                            ajhdVar.getClass();
                            ains ainsVar = (ains) axpjVar.d.b();
                            ainsVar.getClass();
                            cteb ctebVar = (cteb) axpjVar.e.b();
                            ctebVar.getClass();
                            chwq chwqVar = (chwq) axpjVar.f.b();
                            chwqVar.getClass();
                            dqsn dqsnVar = (dqsn) axpjVar.g.b();
                            dqsnVar.getClass();
                            baxf baxfVar = (baxf) axpjVar.h.b();
                            baxfVar.getClass();
                            messageIdTypeC.getClass();
                            eljxVar3.getClass();
                            new InitiateClientSideFallbackAction(axpjVar.a, cogwVar, ajhdVar, ainsVar, ctebVar, chwqVar, dqsnVar, baxfVar, messageIdTypeC, iB2, eljxVar3).w(0L);
                            int i = true != anpr.a(eljxVar3) ? 3 : 2;
                            ((ajhd) anqcVar2.g.b()).an(messageCoreData3, ((Integer) optionalOf.get()).intValue(), enyw.UNKNOWN_RCS_TYPE, iB2, i);
                            return new anpn(messageCoreData3.C(), i);
                        }
                    }, anqcVar.e);
                }
            }, this.f);
        }
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallbackInternal", 175, "RcsFallbackControllerImpl.java")).q("Message reactions not allowed in fallback");
        return eijx.e(new anpn(messageCoreData.C(), 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (((defpackage.bakt) r4.h.b()).ac(r5.A()) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r5, defpackage.eljx r6) {
        /*
            r4 = this;
            boolean r0 = defpackage.anpr.a(r6)
            r1 = 0
            if (r0 != 0) goto L61
            eljx r0 = defpackage.eljx.UNKNOWN_LATCH_REASON
            boolean r0 = j$.util.Objects.equals(r6, r0)
            r2 = 1
            r0 = r0 ^ r2
            java.lang.String r3 = "unknown fallback latch reason"
            defpackage.ejwl.b(r0, r3)
            eljx r0 = defpackage.eljx.EMERGENCY_RCS_PROTOCOL_DETERMINATION_MESSAGE_FAILED
            boolean r6 = j$.util.Objects.equals(r6, r0)
            if (r6 != 0) goto L61
            arwe r6 = r4.k
            boolean r6 = r6.a()
            if (r6 != 0) goto L32
            arwd r6 = r4.l
            boolean r6 = r6.a()
            if (r6 == 0) goto L2d
            goto L32
        L2d:
            boolean r5 = r4.d()
            goto L5e
        L32:
            boolean r6 = r4.d()
            if (r6 != 0) goto L5d
            boolean r6 = r5.cB()
            if (r6 != 0) goto L5b
            boolean r6 = r5.df()
            if (r6 == 0) goto L5b
            boolean r6 = r4.q
            if (r6 == 0) goto L5d
            fcsu r6 = r4.h
            java.lang.Object r6 = r6.b()
            bakt r6 = (defpackage.bakt) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r5.A()
            boolean r5 = r6.ac(r5)
            if (r5 != 0) goto L60
            goto L5d
        L5b:
            r5 = r1
            goto L5e
        L5d:
            r5 = r2
        L5e:
            if (r5 != 0) goto L61
        L60:
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anqc.f(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, eljx):boolean");
    }
}
