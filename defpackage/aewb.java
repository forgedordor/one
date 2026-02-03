package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aewb {
    public static adts g(adts adtsVar, crku crkuVar, boolean z, cogw cogwVar) {
        if (z) {
            adtm adtmVar = adty.c;
            adtsVar.c(new adtp(adtmVar.b, true), new adtp(adtmVar.a, true));
            return adtsVar;
        }
        if (crbf.f()) {
            adtm adtmVar2 = adty.c;
            bmgc.a(adtsVar, true, crkuVar, cogwVar, adtmVar2.b, adtmVar2.c, adtmVar2.a, adtmVar2.d);
            return adtsVar;
        }
        adtm adtmVar3 = adty.c;
        adtsVar.c(new adtp(adtmVar3.d, true), new adtp(adtmVar3.b, true), new adtp(adtmVar3.a, true));
        return adtsVar;
    }

    public static void m(adts adtsVar, final afcz afczVar, cogw cogwVar) {
        if (((admx) afczVar).d) {
            adtsVar.e(new Function() { // from class: aevq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar = (adtx) obj;
                    final afcz afczVar2 = afczVar;
                    adtxVar.b(new Function() { // from class: aeuv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.g(((admx) afczVar2).a);
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aeuw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            admx admxVar = (admx) afczVar2;
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.f(admxVar.a);
                            adtxVar2.c(admxVar.b.a);
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return adtxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            if (!crbf.f()) {
                adtsVar.e(new Function() { // from class: aevs
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        adtx adtxVar = (adtx) obj;
                        final afcz afczVar2 = afczVar;
                        adtxVar.b(new Function() { // from class: aeuz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.b(((admx) afczVar2).c));
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aeva
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                admx admxVar = (admx) afczVar2;
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.a(admxVar.c));
                                adtxVar2.g(admxVar.a);
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aevb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                admx admxVar = (admx) afczVar2;
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.a(admxVar.c));
                                adtxVar2.f(admxVar.a);
                                adtxVar2.c(admxVar.b.a);
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return adtxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return;
            }
            final dqxe dqxeVarP = p(afczVar, ">", cogwVar);
            final dqxe dqxeVarP2 = p(afczVar, "=", cogwVar);
            adtsVar.e(new Function() { // from class: aevr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar = (adtx) obj;
                    final afcz afczVar2 = afczVar;
                    final dqxe dqxeVar = dqxeVarP;
                    final dqxe dqxeVar2 = dqxeVarP2;
                    adtxVar.b(new Function() { // from class: aeus
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.ar(afcx.b(((admx) afczVar2).c));
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aevd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.ar(afcx.a(((admx) afczVar2).c));
                            adtxVar2.ar(dqxeVar);
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aevo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            admx admxVar = (admx) afczVar2;
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.ar(afcx.a(admxVar.c));
                            adtxVar2.ar(dqxeVar2);
                            adtxVar2.c(admxVar.b.a);
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return adtxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
    }

    private final adts n(afcz afczVar, cogw cogwVar) {
        adts adtsVarR = r(afczVar, 1, cogwVar);
        m(adtsVarR, afczVar, cogwVar);
        return adtsVarR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    private static aeum o(adtq adtqVar, crku crkuVar, boolean z, cogw cogwVar) {
        ?? r18;
        ?? r17;
        aeuo aeuoVar;
        String[] strArr = aeur.a;
        aeuq aeuqVar = new aeuq();
        aeuqVar.ap(new dqpk("conversations._id", 3, adtqVar));
        aeuo aeuoVarA = aeur.a();
        aeuoVarA.A("makeBuilder");
        aeuoVarA.n(bcvp.f, "conversation_contains_vsms_participant");
        aeuoVarA.n(bcvp.g, "earliest_reminder_trigger_time");
        aeuoVarA.n(cmax.a, "scheduled_messages_count");
        aeuoVarA.n(bxjj.a, "unread_message_count");
        cmck cmckVarB = ScheduledSendTable.b().b();
        cmby cmbyVar = ScheduledSendTable.c.c;
        aeui aeuiVar = aeur.b;
        aeuj aeujVar = aeuiVar.a;
        cmcs cmcsVar = new cmcs();
        cmcsVar.ar(bmgb.e(aeujVar));
        dqtr dqtrVarT = cmckVarB.t(cmbyVar, aeujVar, new cmcr(cmcsVar));
        ((dqos) dqtrVarT).e = "scheduled_send_nudge";
        aeuoVarA.H(dqtrVarT.g());
        boolean z2 = false;
        boolean z3 = true;
        if (aptn.a()) {
            dqtr dqtrVarI = dqts.i(bros.a().b(), bros.c.a, aeujVar);
            ((dqos) dqtrVarI).e = "parental_approval_join_tag";
            aeuoVarA.H(dqtrVarI.g());
        } else {
            bron bronVarA = bros.a();
            broc brocVar = bros.c.a;
            bronVarA.c(brocVar);
            dqtr dqtrVarI2 = dqts.i(bronVarA.b(), brocVar, aeujVar);
            ((dqos) dqtrVarI2).e = "parental_approval_join_tag";
            aeuoVarA.H(dqtrVarI2.g());
        }
        if (arps.a()) {
            String[] strArr2 = ConversationNotificationSettingsTable.a;
            bnyp bnypVar = new bnyp(ConversationNotificationSettingsTable.a);
            bnyb bnybVar = ConversationNotificationSettingsTable.c;
            bnyc bnycVar = bnybVar.a;
            bnyc[] bnycVarArr = {bnycVar, bnybVar.d, bnybVar.b, bnybVar.c};
            int iA = ConversationNotificationSettingsTable.b().a();
            Integer.valueOf(iA).getClass();
            int i = 0;
            for (int i2 = 4; i < i2; i2 = 4) {
                boolean z4 = z2;
                boolean z5 = z3;
                if (((Integer) ConversationNotificationSettingsTable.b.getOrDefault(bnycVarArr[i].toString(), -1)).intValue() > iA) {
                    dqru.x("columnReference.toString()", iA);
                }
                i++;
                z2 = z4;
                z3 = z5;
            }
            r18 = z2;
            r17 = z3;
            bnypVar.m(bnycVarArr);
            dqtr dqtrVarI3 = dqts.i(bnypVar.b(), bnycVar, aeujVar);
            ((dqos) dqtrVarI3).e = "conversation_notification_settings_table";
            aeuoVarA.H(dqtrVarI3.g());
        } else {
            r18 = 0;
            r17 = 1;
        }
        if (czwc.b()) {
            btig btigVarB = btin.c().b();
            bths bthsVar = btin.c.c;
            btim btimVar = new btim();
            btimVar.ar(bmgb.d(aeujVar, aeuiVar.e, cogwVar));
            dqtr dqtrVarT2 = btigVarB.t(bthsVar, aeujVar, new btil(btimVar));
            ((dqos) dqtrVarT2).e = "reminder_nudge";
            aeuoVarA.H(dqtrVarT2.g());
        }
        bqcg bqcgVarB = bqcn.a().b();
        bqbu bqbuVar = bqcn.c.b;
        aeuj aeujVar2 = aeuiVar.d;
        bqcm bqcmVar = new bqcm();
        bqcmVar.b(ezah.NUDGE_CLASSIFICATION);
        aeuj aeujVar3 = aeuiVar.e;
        aeuj aeujVar4 = aeuiVar.c;
        bqcmVar.ar(bmgb.b(aeujVar3, aeujVar4, crkuVar, cogwVar));
        dqtr dqtrVarT3 = bqcgVarB.t(bqbuVar, aeujVar2, new bqci(bqcmVar));
        ((dqos) dqtrVarT3).e = "nudge_classification";
        aeuoVarA.H(dqtrVarT3.g());
        bngt bngtVarB = bngz.a().b();
        bnge bngeVar = bngz.c.b;
        bngy bngyVar = new bngy();
        bngyVar.c(aukf.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
        bngyVar.b(aukd.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
        bngyVar.ar(bmgb.c(aeujVar, cogwVar, crkuVar));
        dqtr dqtrVarT4 = bngtVarB.t(bngeVar, aeujVar, new bngx(bngyVar));
        ((dqos) dqtrVarT4).e = "conversation_classification_type";
        aeuoVarA.H(dqtrVarT4.g());
        aeuoVarA.o(bcvp.e, bcvp.d);
        aeuoVarA.o(bcvp.c, ((Boolean) ((cczi) tet.l.get()).e()).booleanValue() ? bcvp.b : "0");
        if (cdsz.a()) {
            aeuoVarA.n(cdsx.a, "conversation_contains_matrix_participant");
        }
        aeuoVarA.k(new aeup(aeuqVar));
        if (z) {
            aeul[] aeulVarArr = new aeul[2];
            aeulVarArr[r18] = new aeul(aeuiVar.b);
            aeulVarArr[r17] = new aeul(aeujVar);
            aeuoVarA.c(aeulVarArr);
            aeuoVar = aeuoVarA;
        } else if (crbf.f()) {
            aeuoVar = aeuoVarA;
            bmgc.a(aeuoVar, false, crkuVar, cogwVar, aeuiVar.b, aeujVar4, aeujVar, adty.c.d);
        } else {
            aeuoVar = aeuoVarA;
            aeul[] aeulVarArr2 = new aeul[3];
            aeulVarArr2[r18] = new aeul(aeuiVar.f);
            aeulVarArr2[r17] = new aeul(aeuiVar.b);
            aeulVarArr2[2] = new aeul(aeujVar);
            aeuoVar.c(aeulVarArr2);
        }
        aeuoVar.A("HomeScreenQueryPaged.Duration");
        return aeuoVar.b();
    }

    private static dqxe p(afcz afczVar, String str, cogw cogwVar) {
        adtm adtmVar = adty.c;
        admx admxVar = (admx) afczVar;
        return new dqxm(dqxd.a(bmgb.f(adtmVar.b, adtmVar.c, adtmVar.a, admxVar.f, cogwVar)) + str + admxVar.a);
    }

    private static boolean q(Boolean bool) {
        if (bool == null) {
            return false;
        }
        bool.booleanValue();
        return true;
    }

    private final adts r(afcz afczVar, int i, cogw cogwVar) {
        admx admxVar = (admx) afczVar;
        int i2 = admxVar.e;
        adts adtsVarH = h();
        adtsVarH.y(i2);
        if (i == 1) {
            return g(adtsVarH, admxVar.f, admxVar.d, cogwVar);
        }
        crku crkuVar = admxVar.f;
        if (admxVar.d) {
            adtm adtmVar = adty.c;
            adtsVarH.c(new adtp(adtmVar.b, false), new adtp(adtmVar.a, false));
            return adtsVarH;
        }
        if (crbf.f()) {
            adtm adtmVar2 = adty.c;
            bmgc.a(adtsVarH, false, crkuVar, cogwVar, adtmVar2.b, adtmVar2.c, adtmVar2.a, adtmVar2.d);
            return adtsVarH;
        }
        adtm adtmVar3 = adty.c;
        adtsVarH.c(new adtp(adtmVar3.d, false), new adtp(adtmVar3.b, false), new adtp(adtmVar3.a, false));
        return adtsVarH;
    }

    public abstract Boolean a();

    public abstract Boolean b();

    public abstract Boolean c();

    public abstract Boolean d();

    public abstract Boolean e();

    public abstract Boolean f();

    public final adts h() {
        String[] strArr = adty.a;
        adts adtsVar = new adts(adty.a);
        adtsVar.A("newInnerQueryBuilderNoLimitNoOrder");
        adtn adtnVar = adty.c.a;
        adtn[] adtnVarArr = {adtnVar};
        int iIntValue = adty.b().intValue();
        if (((Integer) adty.b.getOrDefault(adtnVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        adtsVar.m(adtnVarArr);
        adtx adtxVar = new adtx();
        int iIntValue2 = adty.b().intValue();
        if (iIntValue2 < 29020) {
            dqru.x("delete_timestamp", iIntValue2);
        }
        adtxVar.ap(new dqty("conversations.delete_timestamp", 1, 0L));
        if (q(a())) {
            adtxVar.ap(new dqpm("conversations.archive_status", 3, adtx.as((Iterable) DesugarArrays.stream(new bvdk[]{bvdk.ARCHIVED, bvdk.KEEP_ARCHIVED}).map(new Function() { // from class: adtu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((bvdk) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: adtv
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))), true));
        }
        if (q(b())) {
            bvdk bvdkVar = bvdk.UNARCHIVED;
            adtxVar.ap(new dqty("conversations.archive_status", 1, Integer.valueOf(bvdkVar == null ? 0 : bvdkVar.h)));
        }
        if (q(f())) {
            adtxVar.ap(new dqpm("conversations.archive_status", 3, adtx.as((Iterable) ekpo.a(bvdk.g).map(new Function() { // from class: adtw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((bvdk) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: adtv
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))), true));
        }
        if (q(e())) {
            int iIntValue3 = adty.b().intValue();
            if (iIntValue3 < 12001) {
                dqru.x("has_ea2p_bot_recipient", iIntValue3);
            }
            adtxVar.ap(new dqty("conversations.has_ea2p_bot_recipient", 2, 1));
        }
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && q(d())) {
            adtxVar.b(new Function() { // from class: aevl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar2 = (adtx) obj;
                    adtxVar2.e();
                    return adtxVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aevm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar2 = (adtx) obj;
                    adtxVar2.ap(new dqpj("conversations.participant_normalized_destination", 2, "+18339913448"));
                    return adtxVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        if (apsc.a() && q(c())) {
            adtxVar.b(new Function() { // from class: aevn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar2 = (adtx) obj;
                    adtxVar2.e();
                    return adtxVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aevp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar2 = (adtx) obj;
                    adtxVar2.ap(new dqpm("conversations.participant_normalized_destination", 4, adtx.au("EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO"), false));
                    return adtxVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        adtsVar.d(adtxVar);
        adtsVar.w(adtnVar);
        return adtsVar;
    }

    public final aeum i(afcz afczVar, cogw cogwVar) {
        adtq adtqVarB = r(afczVar, 2, cogwVar).b();
        admx admxVar = (admx) afczVar;
        return o(adtqVarB, admxVar.f, admxVar.d, cogwVar);
    }

    public final aeum j(afcz afczVar, cogw cogwVar) {
        admx admxVar = (admx) afczVar;
        boolean z = admxVar.d;
        final ConversationIdType conversationIdType = admxVar.b;
        final long j = admxVar.a;
        adts adtsVarR = r(afczVar, 2, cogwVar);
        if (z) {
            adtsVarR.e(new Function() { // from class: aevg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar = (adtx) obj;
                    final long j2 = j;
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    adtxVar.b(new Function() { // from class: aeut
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.h(j2);
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aeuu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.f(j2);
                            adtxVar2.d(conversationIdType2.a);
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return adtxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            final boolean z2 = admxVar.c;
            if (crbf.f()) {
                final dqxe dqxeVarP = p(afczVar, "<", cogwVar);
                final dqxe dqxeVarP2 = p(afczVar, "=", cogwVar);
                adtsVarR.e(new Function() { // from class: aevh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        adtx adtxVar = (adtx) obj;
                        final boolean z3 = z2;
                        final dqxe dqxeVar = dqxeVarP;
                        final dqxe dqxeVar2 = dqxeVarP2;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        adtxVar.b(new Function() { // from class: aevc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.c(z3));
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aeve
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.a(z3));
                                adtxVar2.ar(dqxeVar);
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aevf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.a(z3));
                                adtxVar2.ar(dqxeVar2);
                                adtxVar2.d(conversationIdType2.a);
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return adtxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            } else {
                adtsVarR.e(new Function() { // from class: aevi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        adtx adtxVar = (adtx) obj;
                        final boolean z3 = z2;
                        final long j2 = j;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        adtxVar.b(new Function() { // from class: aevx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.c(z3));
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aevy
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.a(z3));
                                adtxVar2.h(j2);
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aevz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                adtx adtxVar2 = (adtx) obj2;
                                adtxVar2.ar(afcx.a(z3));
                                adtxVar2.f(j2);
                                adtxVar2.d(conversationIdType2.a);
                                return adtxVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return adtxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }
        return o(adtsVarR.b(), admxVar.f, z, cogwVar);
    }

    public final aeum k(afcz afczVar, cogw cogwVar) {
        adts adtsVarR;
        admw admwVar = new admw(afczVar);
        admx admxVar = (admx) afczVar;
        int i = admxVar.e;
        int i2 = i / 2;
        admwVar.d(i2);
        adts adtsVarN = n(admwVar.a(), cogwVar);
        admw admwVar2 = new admw(afczVar);
        admwVar2.d(i - i2);
        final afcz afczVarA = admwVar2.a();
        if (((admx) afczVarA).d) {
            adtsVarR = r(afczVarA, 2, cogwVar);
            adtsVarR.e(new Function() { // from class: aevt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar = (adtx) obj;
                    final afcz afczVar2 = afczVarA;
                    adtxVar.b(new Function() { // from class: aevj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.h(((admx) afczVar2).a);
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aevk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            admx admxVar2 = (admx) afczVar2;
                            adtx adtxVar2 = (adtx) obj2;
                            adtxVar2.f(admxVar2.a);
                            adtxVar2.ap(new dqty("conversations._id", 10, Long.valueOf(admxVar2.b.a)));
                            return adtxVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return adtxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else if (crbf.f()) {
            final dqxe dqxeVarP = p(afczVarA, "<=", cogwVar);
            adts adtsVarR2 = r(afczVarA, 2, cogwVar);
            String[] strArr = adty.a;
            adtx adtxVar = new adtx();
            adtxVar.b(new Function() { // from class: aevu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar2 = (adtx) obj;
                    adtxVar2.ar(afcx.c(((admx) afczVarA).c));
                    return adtxVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aevv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar2 = (adtx) obj;
                    adtxVar2.ar(afcx.a(((admx) afczVarA).c));
                    adtxVar2.ar(dqxeVarP);
                    return adtxVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            adtsVarR2.d(adtxVar);
            adtsVarR = adtsVarR2;
        } else {
            adtsVarR = r(afczVarA, 2, cogwVar);
            adtsVarR.e(new Function() { // from class: aevw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adtx adtxVar2 = (adtx) obj;
                    final afcz afczVar2 = afczVarA;
                    adtxVar2.b(new Function() { // from class: aeux
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            adtx adtxVar3 = (adtx) obj2;
                            adtxVar3.ar(afcx.c(((admx) afczVar2).c));
                            return adtxVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aeuy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            admx admxVar2 = (admx) afczVar2;
                            adtx adtxVar3 = (adtx) obj2;
                            adtxVar3.ar(afcx.a(admxVar2.c));
                            adtxVar3.ap(new dqty("conversations.sort_timestamp", 10, Long.valueOf(admxVar2.a)));
                            return adtxVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return adtxVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        adtsVarN.p(adtsVarR.b());
        return o(adtsVarN.b(), admxVar.f, admxVar.d, cogwVar);
    }

    public final aeum l(afcz afczVar, cogw cogwVar) {
        adtq adtqVarB = n(afczVar, cogwVar).b();
        admx admxVar = (admx) afczVar;
        return o(adtqVarB, admxVar.f, admxVar.d, cogwVar);
    }
}
