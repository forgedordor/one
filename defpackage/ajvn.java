package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajvn implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier");
    public final cqtq b;
    public final fcsu c;
    public final eosc d;
    public final eosc e;
    public final fcsu f;
    public final BugleConversationId g;
    public final bbmn h;
    public final aofc i;
    public final anpj j;
    public final akfu k;
    public cquc l;
    public final aofc m;
    public final fcsu n;
    public final anpj o;
    public final arpr p;
    public final aptm q;
    public final ardo r;
    private final alrj s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;

    public ajvn(cqtp cqtpVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, bbmo bbmoVar, aofc aofcVar, akfs akfsVar, alrj alrjVar, aofc aofcVar2, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, arpr arprVar, aptm aptmVar, akgx akgxVar, ardo ardoVar, BugleConversationId bugleConversationId) {
        this.b = cqtpVar.a(new ajvm(this));
        this.c = fcsuVar;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.f = fcsuVar3;
        this.g = bugleConversationId;
        this.h = new bbmn((cqtp) bbmoVar.a.b(), k(bugleConversationId), new Consumer() { // from class: ajuf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Pair pair = (Pair) obj;
                ((dqpi) pair.second).ga((bosz) pair.first);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, "getPropertiesById");
        this.i = aofcVar;
        this.j = aofcVar.a();
        akft akftVarA = akfsVar.a();
        anpj anpjVarE = ((anty) fcsuVar4.b()).e(bugleConversationId);
        akgj akgjVar = akftVarA.a;
        fdjx fdjxVar = (fdjx) akgjVar.a.b();
        fdjxVar.getClass();
        fdjx fdjxVar2 = (fdjx) akgjVar.b.b();
        fdjxVar2.getClass();
        cqtp cqtpVar2 = (cqtp) akgjVar.c.b();
        cqtpVar2.getClass();
        bbmo bbmoVar2 = (bbmo) akgjVar.d.b();
        bbmoVar2.getClass();
        fcsu fcsuVar8 = akgjVar.g;
        this.k = new akgi(fdjxVar, fdjxVar2, cqtpVar2, bbmoVar2, akgjVar.e, akgjVar.f, bugleConversationId, anpjVarE, fcsuVar8);
        this.s = alrjVar;
        this.m = aofcVar2;
        this.t = fcsuVar2;
        this.u = fcsuVar5;
        this.v = fcsuVar6;
        this.n = fcsuVar7;
        this.p = arprVar;
        this.q = aptmVar;
        this.o = akgxVar.a(bugleConversationId);
        this.r = ardoVar;
    }

    public static akbk d(bojh bojhVar) {
        String[] strArr = bros.a;
        brns brnsVar = (brns) bojhVar.ax("parent_disallowed_conversations", brns.class);
        return brnsVar == null ? akbk.b : brnsVar.k();
    }

    public static akbl e(bojh bojhVar) {
        return !bojhVar.aG("parental_approval_status") ? akbl.a : bojhVar.az("parental_approval_status").equals("1") ? akbl.b : akbl.c;
    }

    public static Optional i(ekgb ekgbVar, final SelfIdentityId selfIdentityId) {
        return selfIdentityId == null ? Optional.empty() : Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: ajus
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
            public final boolean test(Object obj) {
                return ((aoer) obj).h().equals(selfIdentityId);
            }
        }).findFirst();
    }

    public static String j(Optional optional) {
        aoer aoerVar = (aoer) optional.orElse(null);
        return aoerVar != null ? aoerVar.q() : "unavailable";
    }

    private static bosz k(final BugleConversationId bugleConversationId) {
        bopp boppVar = botm.c;
        bopq bopqVar = boppVar.a;
        ekgb ekgbVarC = ekgb.C(bopqVar, boppVar.O, boppVar.R, boppVar.q, boppVar.c, boppVar.d, boppVar.ak, boppVar.N, boppVar.p, boppVar.P, boppVar.H, boppVar.A, boppVar.t, boppVar.aq, boppVar.ap, boppVar.ab, boppVar.aa, boppVar.M, boppVar.y, boppVar.an, boppVar.ar, boppVar.af, boppVar.as);
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(ekgbVarC);
        ekfwVar.h(boppVar.ag);
        if (arkw.a()) {
            ekfwVar.h(boppVar.r);
        }
        if (eotp.a("bugle.enable_zinnia_in_conversations", "bugle")) {
            ekfwVar.h(boppVar.au);
        }
        ekfwVar.h(boppVar.D);
        ekfwVar.h(boppVar.C);
        botb botbVarE = botm.e();
        botbVarE.A("getConversationRowByIdQuery");
        botbVarE.c((bopq[]) Collection.EL.toArray(ekfwVar.g(), new IntFunction() { // from class: ajuu
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new bopq[i];
            }
        }));
        botbVarE.i(new Function() { // from class: ajuv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.r(bugleConversationId.a);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (aptn.a()) {
            dqtr dqtrVarI = dqts.i(bros.a().b(), bros.c.a, bopqVar);
            ((dqos) dqtrVarI).e = "parent_disallowed_conversations";
            botbVarE.H(dqtrVarI.g());
        } else {
            bron bronVarA = bros.a();
            bronVarA.c(bros.c.a);
            bronVarA.k(new broq((bror) new Function() { // from class: ajuw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bror brorVar = (bror) obj;
                    brorVar.b(bugleConversationId.a);
                    return brorVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new bror())));
            botbVarE.n(new dqwi(bronVarA.b()), "parental_approval_status");
        }
        if (arps.a()) {
            String[] strArr = ConversationNotificationSettingsTable.a;
            dqtr dqtrVarI2 = dqts.i(new bnyp(ConversationNotificationSettingsTable.a).b(), ConversationNotificationSettingsTable.c.a, bopqVar);
            ((dqos) dqtrVarI2).e = "conversation_notification_settings_query_tag";
            botbVarE.H(dqtrVarI2.g());
        }
        return botbVarE.b();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.b.a(new cqtk() { // from class: ajuz
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "BugleConversationPropertiesSupplier::register", "BugleConversationPropertiesSupplier::callback", "BugleConversationPropertiesSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        eieu eieuVarK = eiiy.k("getPropertiesForConversation");
        try {
            final Instant instantF = this.p.a() ? ((cogw) this.v.b()).f() : Instant.EPOCH;
            eiju eijuVarI = k(this.g).x().i(new eooz() { // from class: ajuc
                /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x02f6  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x031d  */
                @Override // defpackage.eooz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r20) {
                    /*
                        Method dump skipped, instructions count: 986
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ajuc.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.d);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final eiju f(final ajwi ajwiVar, final bojh bojhVar) {
        if (((aqbh) this.t.b()).a() && bojhVar.k() == 0 && this.s.p(ejwk.b(bojhVar.ab())).B()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleConversation");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 370, "BugleConversationPropertiesSupplier.java")).q("Conversation type is satellite. Setting satellite self identity as active.");
            return this.m.a().b().h(new ejvr() { // from class: ajug
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Optional optionalFindFirst = Collection.EL.stream((ekgb) obj).findFirst();
                    final ajwi ajwiVar2 = ajwiVar;
                    optionalFindFirst.ifPresent(new Consumer() { // from class: ajux
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) {
                            ((ajti) ajwiVar2).e = (aoer) obj2;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return ajwiVar2.a();
                }
            }, this.d);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final SelfIdentityId selfIdentityIdC = aofa.c(bojhVar.T());
        eiju eijuVarB = this.m.b().b();
        eooz eoozVar = new eooz() { // from class: ajuh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ajvn ajvnVar = this.a;
                if (((aoff) obj) != aoff.e) {
                    ekrw ekrwVarH2 = ajvn.a.h();
                    ekrwVarH2.X(eksq.a, "BugleConversation");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 403, "BugleConversationPropertiesSupplier.java")).q("Connection type is not manual connect. Using regular self identity");
                    return ajvnVar.j.b();
                }
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ekrw ekrwVarH3 = ajvn.a.h();
                ekrwVarH3.X(eksq.a, "BugleConversation");
                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 395, "BugleConversationPropertiesSupplier.java")).q("Connection type is manual satellite. Replacing active self identity with satellite.");
                atomicBoolean2.set(false);
                return ajvnVar.m.a().b();
            }
        };
        eosc eoscVar = this.d;
        final eiju eijuVarI = eijuVarB.i(eoozVar, eoscVar);
        eooz eoozVar2 = new eooz() { // from class: ajui
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                int iK = bojhVar.k();
                Integer numValueOf = Integer.valueOf(iK);
                if (!((Boolean) ((cczi) crbf.aE.get()).e()).booleanValue()) {
                    return eijx.e(new akgk(akgl.HIDDEN, null));
                }
                Optional optionalI = ajvn.i(ekgbVar, selfIdentityIdC);
                if (!optionalI.isPresent()) {
                    return eijx.e(new akgk(akgl.HIDDEN, null));
                }
                ajvn ajvnVar = this.a;
                aoer aoerVar = (aoer) optionalI.get();
                numValueOf.getClass();
                akgi akgiVar = (akgi) ajvnVar.k;
                return auvw.c(akgiVar.a, fcyi.a, fdjz.a, new akfy(akgiVar, aoerVar, iK, null));
            }
        };
        eosc eoscVar2 = this.e;
        final eiju eijuVarI2 = eijuVarI.i(eoozVar2, eoscVar2);
        eiju eijuVarI3 = eijx.k(eijuVarI, eijuVarI2).b(new eooy() { // from class: ajuj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final ekgb ekgbVar = (ekgb) eork.q(eijuVarI);
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                final Optional optionalI = atomicBoolean2.get() ? ajvn.i(ekgbVar, selfIdentityIdC) : Collection.EL.stream(ekgbVar).findFirst();
                final bojh bojhVar2 = bojhVar;
                final ajwi ajwiVar2 = ajwiVar;
                eiju eijuVar = eijuVarI2;
                final ajvn ajvnVar = this.a;
                ajwiVar2.t((akgk) eork.q(eijuVar));
                if (optionalI.isEmpty() || !((aoer) optionalI.get()).w()) {
                    return bojhVar2.ae() != null ? ajvnVar.h(bojhVar2.C(), ekgbVar, ajwiVar2) : ajvnVar.i.f().i(new eooz() { // from class: ajva
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            Optional optional = (Optional) obj;
                            ekrw ekrwVarH2 = ajvn.a.h();
                            ekrwVarH2.X(eksq.a, "BugleConversation");
                            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "setLegacyDefaultSelfIdentity", 651, "BugleConversationPropertiesSupplier.java")).t("Current active self identity: %s", ajvn.j(optional));
                            aoer aoerVar = (aoer) optional.orElse(null);
                            ajwi ajwiVar3 = ajwiVar2;
                            ((ajti) ajwiVar3).e = aoerVar;
                            return eijx.e(ajwiVar3.a());
                        }
                    }, ajvnVar.d);
                }
                if (bojhVar2.ae() != null && atomicBoolean2.get()) {
                    return ((aoer) optionalI.get()).f().b().i(new eooz() { // from class: ajvc
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            boolean zA = ((aoio) obj).a();
                            ajwi ajwiVar3 = ajwiVar2;
                            if (zA) {
                                Optional optional = optionalI;
                                ekrw ekrwVarH2 = ajvn.a.h();
                                ekrwVarH2.X(eksq.a, "BugleConversation");
                                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 452, "BugleConversationPropertiesSupplier.java")).t("Current active self identity: %s", ajvn.j(optional));
                                ((ajti) ajwiVar3).e = (aoer) optional.get();
                                return eijx.e(ajwiVar3.a());
                            }
                            ekgb ekgbVar2 = ekgbVar;
                            bojh bojhVar3 = bojhVar2;
                            ajvn ajvnVar2 = ajvnVar;
                            ekrw ekrwVarH3 = ajvn.a.h();
                            ekrwVarH3.X(eksq.a, "BugleConversation");
                            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 446, "BugleConversationPropertiesSupplier.java")).q("Current active selfId not available, trying to update to a different self identity in group.");
                            return ajvnVar2.h(bojhVar3.C(), ekgbVar2, ajwiVar3);
                        }
                    }, ajvnVar.e);
                }
                ekrw ekrwVarH2 = ajvn.a.h();
                ekrwVarH2.X(eksq.a, "BugleConversation");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 460, "BugleConversationPropertiesSupplier.java")).t("Current active self identity: %s", ajvn.j(optionalI));
                ((ajti) ajwiVar2).e = (aoer) optionalI.get();
                return eijx.e(ajwiVar2.a());
            }
        }, eoscVar2).i(new eooz() { // from class: ajuk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final bojh bojhVar2 = bojhVar;
                final ajwj ajwjVar = (ajwj) obj;
                if (!bvdi.d(bojhVar2.k()) || ajwjVar.h() == null) {
                    return eijx.e(ajwjVar);
                }
                aoer aoerVarH = ajwjVar.h();
                aoerVarH.getClass();
                if (!aoerVarH.w()) {
                    return eijx.e(ajwjVar);
                }
                ajvn ajvnVar = this.a;
                eiju eijuVarB2 = aoerVarH.f().b();
                ejvr ejvrVar = new ejvr() { // from class: ajud
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        bojh bojhVar3 = bojhVar2;
                        aoio aoioVar = (aoio) obj2;
                        boolean z = false;
                        if (bojhVar3.L().d(ciga.REMOVE_USER_BY_ALL) && bojhVar3.n() == 0 && aoioVar.a()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                };
                eosc eoscVar3 = ajvnVar.e;
                return eijuVarB2.h(ejvrVar, eoscVar3).h(new ejvr() { // from class: ajvd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ajwi ajwiVarD = ajwjVar.D();
                        ajwiVarD.c(((Boolean) obj2).booleanValue());
                        return ajwiVarD.a();
                    }
                }, eoscVar3);
            }
        }, eoscVar2);
        fcsu fcsuVar = this.u;
        eooz eoozVar3 = ((ardk) fcsuVar.b()).a() ? new eooz() { // from class: ajul
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final bojh bojhVar2 = bojhVar;
                final ajwj ajwjVar = (ajwj) obj;
                int iN = bojhVar2.n();
                final boolean zE = bvdi.e(bojhVar2.k());
                final boolean zD = bvdi.d(bojhVar2.k());
                aoer aoerVarH = ajwjVar.h();
                if (aoerVarH != null && iN == 0) {
                    if (!zE) {
                        if (zD) {
                            zD = true;
                        }
                    }
                    return aoerVarH.f().b().h(new ejvr() { // from class: ajua
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            boolean z = true;
                            boolean z2 = zD && ((aoio) obj2).a();
                            ajwj ajwjVar2 = ajwjVar;
                            cigb cigbVarL = bojhVar2.L();
                            ajwi ajwiVarD = ajwjVar2.D();
                            if ((!z2 || !cigbVarL.d(ciga.NAME_CHANGE)) && !zE) {
                                z = false;
                            }
                            ajwiVarD.f(z);
                            ajwiVarD.e(z2);
                            return ajwiVarD.a();
                        }
                    }, this.a.d);
                }
                ajwi ajwiVarD = ajwjVar.D();
                ajwiVarD.f(false);
                ajwiVarD.e(false);
                return eijx.e(ajwiVarD.a());
            }
        } : new eooz() { // from class: ajum
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eiju eijuVarE;
                final bojh bojhVar2 = bojhVar;
                final ajwj ajwjVar = (ajwj) obj;
                boolean zB = bvdi.b(bojhVar2.k());
                ajvn ajvnVar = this.a;
                if (!zB) {
                    eijuVarE = eijx.e(false);
                } else if (bvdi.e(bojhVar2.k())) {
                    eijuVarE = eijx.e(true);
                } else if (ajwjVar.h() == null) {
                    eijuVarE = eijx.e(false);
                } else {
                    aoer aoerVarH = ajwjVar.h();
                    aoerVarH.getClass();
                    eijuVarE = !aoerVarH.w() ? eijx.e(false) : aoerVarH.f().b().h(new ejvr() { // from class: ajtz
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            bojh bojhVar3 = bojhVar2;
                            aoio aoioVar = (aoio) obj2;
                            boolean z = false;
                            if (bojhVar3.L().d(ciga.NAME_CHANGE) && bojhVar3.n() == 0 && aoioVar.a()) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                    }, ajvnVar.e);
                }
                return eijuVarE.h(new ejvr() { // from class: ajub
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ajwi ajwiVarD = ajwjVar.D();
                        ajwiVarD.f(((Boolean) obj2).booleanValue());
                        return ajwiVarD.a();
                    }
                }, ajvnVar.e);
            }
        };
        if (true != ((ardk) fcsuVar.b()).a()) {
            eoscVar = eoscVar2;
        }
        return eijuVarI3.i(eoozVar3, eoscVar);
    }

    public final eiju g() {
        return eijx.f(new Runnable() { // from class: ajup
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.c(new Supplier() { // from class: ajvb
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return null;
                    }
                }, "BugleConversationPropertiesSupplier::Notify");
            }
        }, this.d);
    }

    public final eiju h(final ConversationIdType conversationIdType, final ekgb ekgbVar, final ajwi ajwiVar) {
        Callable callable = new Callable() { // from class: ajuo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ekgb ekgbVar2 = ekgbVar;
                final ekhx ekhxVar = (ekhx) Collection.EL.stream(ekgbVar2).map(new Function() { // from class: ajve
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((aoer) obj).o().flatMap(new Function() { // from class: ajue
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return Optional.ofNullable(((alqm) obj2).l());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: ajvf
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
                    public final boolean test(Object obj) {
                        return ((Optional) obj).isPresent();
                    }
                }).map(new Function() { // from class: ajtu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (String) ((Optional) obj).get();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.b);
                if (ekhxVar.isEmpty()) {
                    return Optional.empty();
                }
                final ConversationIdType conversationIdType2 = conversationIdType;
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("activeSelfAsOtherParticipant");
                bsboVarE.h(new Function() { // from class: ajtv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsbx bsbxVar = (bsbx) obj;
                        bsbxVar.s(ekhxVar);
                        String[] strArr = boiv.a;
                        boiq boiqVar = new boiq(boiv.a);
                        final ConversationIdType conversationIdType3 = conversationIdType2;
                        boiqVar.f(new Function() { // from class: ajun
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                boiu boiuVar = (boiu) obj2;
                                boiuVar.b(conversationIdType3);
                                return boiuVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boiqVar.c(boiv.c.b);
                        bsbxVar.l(boiqVar.b());
                        return bsbxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Optional optionalFindAny = Collection.EL.stream(bsboVarE.b().z()).findAny();
                return optionalFindAny.isEmpty() ? Optional.empty() : optionalFindAny.map(new Function() { // from class: ajtw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ParticipantsTable.BindData) obj).T();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).flatMap(new Function() { // from class: ajtx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        final String str = (String) obj;
                        return Collection.EL.stream(ekgbVar2).filter(new Predicate() { // from class: ajtt
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
                                return str.equals(((aoer) obj2).o().map(new Function() { // from class: ajty
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((alqm) obj3).l();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).orElse(null));
                            }
                        }).findAny();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        };
        eosc eoscVar = this.e;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: ajuq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                ekrw ekrwVarH = ajvn.a.h();
                ekrwVarH.X(eksq.a, "BugleConversation");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "updatedConversationSelfId", 513, "BugleConversationPropertiesSupplier.java")).t("Current active self identity: %s", ajvn.j(optional));
                aoer aoerVar = (aoer) optional.orElse(null);
                ajwi ajwiVar2 = ajwiVar;
                ((ajti) ajwiVar2).e = aoerVar;
                return ajwiVar2.a();
            }
        }, eoscVar);
    }
}
