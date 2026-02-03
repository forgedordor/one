package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqu implements cbqj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/data/E2eeDatabaseOperationsImpl");
    private final fcsu b;
    private final cogw c;
    private final bxlc d;

    public cbqu(fcsu fcsuVar, cogw cogwVar, bxlc bxlcVar) {
        fcsuVar.getClass();
        cogwVar.getClass();
        bxlcVar.getClass();
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = bxlcVar;
    }

    public static final cbqx k(cbqz cbqzVar, cbqx cbqxVar, cbqx cbqxVar2) {
        if (!cbqzVar.e()) {
            return cbqxVar2;
        }
        if (cbqxVar != null) {
            return cbqxVar;
        }
        throw new IllegalArgumentException("Missing encryption Id for MLS protocol");
    }

    public static final void l(ConversationIdType conversationIdType, String str, int i, cbqz cbqzVar, cbqx cbqxVar, cbqz cbqzVar2) {
        cbta cbtaVarO = o(conversationIdType, str);
        cbsw cbswVarA = cbtb.a();
        cbswVarA.A("removeSupportedEncryptionProtocol");
        cbswVarA.c(cbtaVarO);
        ekgb ekgbVarZ = cbswVarA.b().z();
        ekgbVarZ.getClass();
        cbre cbreVar = (cbre) fcva.P(ekgbVarZ);
        if (cbreVar != null) {
            cbqz cbqzVarB = cbreVar.m().b(cbqzVar2);
            cbqx cbqxVarK = cbqzVarB.e() ? cbreVar.k() : null;
            cbsy cbsyVar = new cbsy();
            cbsyVar.d(cbqzVarB);
            cbsyVar.c(cbqxVarK);
            cbsyVar.e(cbtaVarO);
            cbsyVar.ap("E2eeDatabaseOperations#removeSupportedEncryptionProtocol");
            cbsyVar.b().e();
            return;
        }
        if (fdbq.f(cbqzVar, cbqz.a) || cbqzVar == null) {
            return;
        }
        cbrh cbrhVar = new cbrh();
        cbrhVar.b(conversationIdType);
        cbrhVar.c(i);
        cbrhVar.f(cbqzVar);
        cbrhVar.e(cbqxVar);
        cbrhVar.g(str);
        cbrhVar.a().n().longValue();
    }

    public static final int m(ConversationIdType conversationIdType, String str, cbqz cbqzVar, cbqx cbqxVar, int i, boolean z) {
        botl botlVar;
        if (str == null) {
            String[] strArr = botm.a;
            botlVar = new botl();
            botlVar.r(conversationIdType);
        } else {
            String[] strArr2 = botm.a;
            botl botlVar2 = new botl();
            botlVar2.r(conversationIdType);
            botlVar2.k(str);
            botlVar = botlVar2;
        }
        bote boteVar = new bote();
        boteVar.ap("E2eeDatabaseOperations.updateConversation");
        boteVar.q(i);
        boteVar.y(z);
        boteVar.w(cbqzVar);
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 60210) {
            dqru.x("encryption_id", iIntValue2);
        }
        if (iIntValue >= 60210) {
            if (cbqxVar == null) {
                boteVar.a.putNull("encryption_id");
            } else {
                boteVar.a.put("encryption_id", cbqx.a(cbqxVar));
            }
        }
        boteVar.ac(botlVar);
        return boteVar.b().e();
    }

    public static final void n(ConversationIdType conversationIdType, awjl awjlVar, String str, int i, cbqz cbqzVar, cbqx cbqxVar) {
        cbta cbtaVarO = o(conversationIdType, str);
        cbsw cbswVarA = cbtb.a();
        cbswVarA.A("addSupportedEncryptionProtocol");
        cbswVarA.c(cbtaVarO);
        ekgb ekgbVarZ = cbswVarA.b().z();
        ekgbVarZ.getClass();
        cbre cbreVar = (cbre) fcva.P(ekgbVarZ);
        if (cbreVar == null) {
            cbrh cbrhVar = new cbrh();
            cbrhVar.b(conversationIdType);
            cbrhVar.d(awjlVar);
            cbrhVar.c(i);
            cbrhVar.f(cbqzVar);
            cbrhVar.e(cbqxVar);
            cbrhVar.g(str);
            cbrhVar.a().n().longValue();
            return;
        }
        cbqx cbqxVarK = k(cbqzVar, cbqxVar, cbreVar.k());
        cbsy cbsyVar = new cbsy();
        cbsyVar.d(cbreVar.m().a(cbqzVar));
        cbsyVar.c(cbqxVarK);
        if (cbqzVar.e()) {
            cbsyVar.a.putNull("mls_last_unexpected_downgrade_timestamp");
        }
        cbsyVar.e(cbtaVarO);
        cbsyVar.ap("E2eeDatabaseOperationsImpl#addSupportedEncryptionProtocolToEncryptionTable");
        cbsyVar.b().e();
    }

    private static final cbta o(ConversationIdType conversationIdType, final String str) {
        String[] strArr = cbtb.a;
        cbta cbtaVar = new cbta();
        cbtaVar.ap(new dqpj("conversation_encryption.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
        Function function = new Function() { // from class: cbqo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbta cbtaVar2 = (cbta) obj;
                cbtaVar2.b(str);
                return cbtaVar2;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        Function[] functionArr = {function, new Function() { // from class: cbqp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbta cbtaVar2 = (cbta) obj;
                int iIntValue = cbtb.c().intValue();
                if (iIntValue < 60890) {
                    dqru.x("conv_type", iIntValue);
                }
                cbtaVar2.ap(new dqty("conversation_encryption.conv_type", 1, 2));
                return cbtaVar2;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }};
        cbta[] cbtaVarArr = new cbta[2];
        for (int i = 0; i < 2; i++) {
            cbtaVarArr[i] = (cbta) functionArr[i].apply(new cbta());
        }
        cbtaVar.aq(cbtaVarArr);
        return cbtaVar;
    }

    private static final cbta p(ConversationIdType conversationIdType, ccpl ccplVar) {
        return o(conversationIdType, ccplVar.b());
    }

    @Override // defpackage.cbqj
    public final ConversationIdType a(final cbqx cbqxVar) throws IOException {
        botb botbVarE = botm.e();
        botbVarE.c(botm.c.a);
        botbVarE.i(new Function() { // from class: cbqs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                int iIntValue = botm.g().intValue();
                if (iIntValue < 60210) {
                    dqru.x("encryption_id", iIntValue);
                }
                botlVar.ap(new dqpj("conversations.encryption_id", 1, cbqx.a(cbqxVar)));
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.A("MlsStateChangeHandler#findConversationForMlsGroup");
        botbVarE.y(1);
        dqqj dqqjVarP = botbVarE.b().p();
        try {
            bopr boprVar = (bopr) dqqjVarP;
            ConversationIdType conversationIdTypeH = boprVar.moveToFirst() ? boprVar.h() : null;
            fczl.a(dqqjVarP, null);
            return conversationIdTypeH;
        } finally {
        }
    }

    @Override // defpackage.cbqj
    public final ConversationIdType b(final aubq aubqVar, final String str) {
        if (fdgn.H(str)) {
            botb botbVarE = botm.e();
            botbVarE.A("getConversationIdForIncomingChatApiMessage");
            botbVarE.i(new Function() { // from class: cbql
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.C(aubqVar.d);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopp boppVar = botm.c;
            botbVarE.e(new bosy(boppVar.r, false), new bosy(boppVar.a, false));
            ekgb ekgbVarG = botbVarE.b().g();
            ekgbVarG.getClass();
            return (ConversationIdType) fcva.P(ekgbVarG);
        }
        botb botbVarE2 = botm.e();
        botbVarE2.A("getConversationIdForIncomingChatApiMessage");
        botbVarE2.i(new Function() { // from class: cbqm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.E(str);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopp boppVar2 = botm.c;
        botbVarE2.e(new bosy(boppVar2.r, false), new bosy(boppVar2.a, false));
        ekgb ekgbVarG2 = botbVarE2.b().g();
        ekgbVarG2.getClass();
        return (ConversationIdType) fcva.P(ekgbVarG2);
    }

    @Override // defpackage.cbqj
    public final cbqx c(final ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        botb botbVarE = botm.e();
        botbVarE.A("getEncryptionId");
        botbVarE.i(new Function() { // from class: cbqt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.r(conversationIdType);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarF = botbVarE.b().f();
        ekgbVarF.getClass();
        return (cbqx) fcva.P(ekgbVarF);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // defpackage.cbqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.Instant d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3, defpackage.ccpl r4) {
        /*
            r2 = this;
            r4.getClass()
            cbsw r0 = defpackage.cbtb.a()
            java.lang.String r1 = "getConversationEncryptionRow"
            r0.A(r1)
            cbta r3 = p(r3, r4)
            r0.c(r3)
            cbsv r3 = r0.b()
            dqpd r3 = r3.l()
            cbre r3 = (defpackage.cbre) r3
            r4 = 0
            if (r3 == 0) goto L32
            r0 = 8
            java.lang.String r1 = "mls_last_unexpected_downgrade_timestamp"
            r3.aA(r0, r1)
            j$.util.Optional r3 = r3.i
            if (r3 == 0) goto L32
            java.lang.Object r3 = defpackage.fdct.b(r3)
            j$.time.Instant r3 = (j$.time.Instant) r3
            goto L33
        L32:
            r3 = r4
        L33:
            j$.time.Instant r0 = j$.time.Instant.EPOCH
            boolean r0 = defpackage.fdbq.f(r3, r0)
            if (r0 == 0) goto L3c
            return r4
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbqu.d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ccpl):j$.time.Instant");
    }

    @Override // defpackage.cbqj
    public final List e(ccpl ccplVar) throws ccot {
        ccplVar.getClass();
        ccpn ccpnVar = (ccpn) ccplVar;
        String strD = ccpnVar.d();
        cbsw cbswVarA = cbtb.a();
        cbswVarA.A("getMlsOneToOneConversations");
        Function function = new Function() { // from class: cbqk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cbse) obj).f;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        cbse cbseVar = cbtb.c;
        cbsf[] cbsfVarArr = {(cbsf) function.apply(cbseVar)};
        int iIntValue = cbtb.c().intValue();
        if (((Integer) cbtb.b.getOrDefault(cbsfVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        cbswVarA.m(cbsfVarArr);
        cbta cbtaVar = new cbta();
        cbtaVar.b(strD);
        List list = cbqz.e;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(cbqy.a((cbqz) it.next())));
        }
        cbtaVar.ap(new dqpm("conversation_encryption.encryption_protocol", 3, cbta.as(ekfwVar.g()), true));
        cbswVarA.c(cbtaVar);
        cbswVarA.s();
        cbsg cbsgVar = (cbsg) cbswVarA.b().q(cbseVar.f);
        try {
            ekgb ekgbVarC = cbsgVar.c();
            cbsgVar.close();
            ekgbVarC.getClass();
            String strD2 = ccpnVar.d();
            botb botbVarE = botm.e();
            botbVarE.A("getMlsGroupConversationsWithSelfMsisdn");
            botbVarE.g(new Function() { // from class: cbqn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bopp) obj).av;
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            });
            botl botlVar = new botl();
            botlVar.I(strD2);
            List list2 = cbqz.e;
            int iIntValue2 = botm.g().intValue();
            if (iIntValue2 < 60180) {
                dqru.x("encryption_protocol", iIntValue2);
            }
            ekfw ekfwVar2 = new ekfw();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ekfwVar2.h(String.valueOf(cbqy.a((cbqz) it2.next())));
            }
            botlVar.ap(new dqpm("conversations.encryption_protocol", 3, botl.as(ekfwVar2.g()), true));
            botlVar.j(2);
            botbVarE.h(botlVar);
            botbVarE.s();
            ekgb ekgbVarF = botbVarE.b().f();
            ekgbVarF.getClass();
            return fcva.ah(ekgbVarC, ekgbVarF);
        } catch (Throwable th) {
            try {
                cbsgVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbqj
    public final boolean f(final ConversationIdType conversationIdType, final awjl awjlVar, aubq aubqVar, final cbqz cbqzVar, final SelfIdentityId selfIdentityId, final cbqx cbqxVar) {
        conversationIdType.getClass();
        awjlVar.getClass();
        cbqzVar.getClass();
        final String str = aubqVar.d;
        str.getClass();
        if ((!fdbq.f(cbqzVar, cbqz.c) || fdbq.f(cbqxVar, null)) && !(fdbq.f(cbqzVar, cbqz.b) && fdbq.f(cbqxVar, null))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fdbq.f(awjlVar, awjl.a)) {
            throw new IllegalArgumentException("Destination token should not be dummy.");
        }
        Integer num = (Integer) ((dqsn) this.b.b()).c("addSupportedEncryptionProtocol", new ejxr() { // from class: cbqr
            @Override // defpackage.ejxr
            public final Object get() {
                String strB;
                ConversationIdType conversationIdType2 = conversationIdType;
                bojh bojhVarB = botm.b(conversationIdType2);
                if (bojhVarB == null) {
                    return 0;
                }
                boolean z = bojhVarB.k() == 2;
                if (z) {
                    strB = null;
                } else {
                    SelfIdentityId selfIdentityId2 = selfIdentityId;
                    strB = selfIdentityId2 != null ? selfIdentityId2.b() : bojhVarB.T();
                }
                boolean z2 = z;
                awjl awjlVar2 = awjlVar;
                cbqx cbqxVar2 = cbqxVar;
                cbqz cbqzVar2 = cbqzVar;
                String str2 = str;
                if (true == z2) {
                    str2 = "";
                }
                if (!z2 && !fdbq.f(strB, bojhVarB.T())) {
                    cbqu.n(conversationIdType2, awjlVar2, str2, bojhVarB.k(), cbqzVar2, cbqxVar2);
                    return 0;
                }
                cbqx cbqxVarK = cbqu.k(cbqzVar2, cbqxVar2, bojhVarB.I());
                cbqz cbqzVarA = bojhVarB.J().a(cbqzVar2);
                int iM = cbqu.m(conversationIdType2, strB, cbqzVarA, cbqxVarK, 1, true);
                cbqu.n(conversationIdType2, awjlVar2, str2, bojhVarB.k(), cbqzVarA, cbqxVarK);
                return Integer.valueOf(iM);
            }
        });
        if (num.intValue() > 0) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleE2ee");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.s, conversationIdType);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/data/E2eeDatabaseOperationsImpl", "addSupportedEncryptionProtocolInternal", 142, "E2eeDatabaseOperationsImpl.kt")).t("Encryption protocol %s is added.", cbqzVar);
            this.d.d(conversationIdType);
        }
        return num.intValue() > 0;
    }

    @Override // defpackage.cbqj
    public final boolean g(ConversationIdType conversationIdType, ccpl ccplVar) {
        ccplVar.getClass();
        String[] strArr = cbtb.a;
        cbsy cbsyVar = new cbsy();
        Optional optionalOf = Optional.of(this.c.f());
        int iIntValue = cbtb.c().intValue();
        int iIntValue2 = cbtb.c().intValue();
        if (iIntValue2 < 60920) {
            dqru.x("mls_last_unexpected_downgrade_timestamp", iIntValue2);
        }
        if (iIntValue >= 60920) {
            cbsyVar.a.put("mls_last_unexpected_downgrade_timestamp", Long.valueOf(basb.a(optionalOf)));
        }
        cbsyVar.e(p(conversationIdType, ccplVar));
        cbsyVar.ap("E2eeDatabaseOperationsImpl#markUnexpectedMlsDowngrade");
        return cbsyVar.b().e() > 0;
    }

    @Override // defpackage.cbqj
    public final boolean h(final ConversationIdType conversationIdType, aubq aubqVar, final SelfIdentityId selfIdentityId, final cbqz cbqzVar) {
        final String str = aubqVar.d;
        str.getClass();
        if (fdbq.f(cbqzVar, cbqz.d)) {
            throw new IllegalArgumentException("Encryption protocol needs to be removed one by one.");
        }
        Integer num = (Integer) ((dqsn) this.b.b()).c("removeSupportedEncryptionProtocol", new ejxr() { // from class: cbqq
            @Override // defpackage.ejxr
            public final Object get() {
                ConversationIdType conversationIdType2 = conversationIdType;
                bojh bojhVarB = botm.b(conversationIdType2);
                if (bojhVarB == null) {
                    return 0;
                }
                boolean z = bojhVarB.k() == 2;
                String strB = z ? null : selfIdentityId.b();
                cbqz cbqzVar2 = cbqzVar;
                String str2 = str;
                if (true == z) {
                    str2 = "";
                }
                if (!z && !fdbq.f(strB, bojhVarB.T())) {
                    cbqu.l(conversationIdType2, str2, bojhVarB.k(), null, null, cbqzVar2);
                    return 0;
                }
                cbqz cbqzVarB = bojhVarB.J().b(cbqzVar2);
                int iM = cbqu.m(conversationIdType2, strB, cbqzVarB, bojhVarB.I(), fdbq.f(cbqzVarB, cbqz.a) ? 0 : bojhVarB.m(), bojhVarB.am());
                cbqu.l(conversationIdType2, str2, bojhVarB.k(), cbqzVarB, bojhVarB.I(), cbqzVar2);
                return Integer.valueOf(iM);
            }
        });
        if (num.intValue() > 0) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleE2ee");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.s, conversationIdType);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/data/E2eeDatabaseOperationsImpl", "removeSupportedEncryptionProtocolInternal", 245, "E2eeDatabaseOperationsImpl.kt")).t("Encryption protocol %s is removed.", cbqzVar);
            this.d.d(conversationIdType);
        }
        return num.intValue() > 0;
    }

    @Override // defpackage.cbqj
    public final void i(ConversationIdType conversationIdType, ccpl ccplVar) {
        ccplVar.getClass();
        String[] strArr = cbtb.a;
        cbsy cbsyVar = new cbsy();
        Optional optionalOf = Optional.of(this.c.f());
        int iIntValue = cbtb.c().intValue();
        int iIntValue2 = cbtb.c().intValue();
        if (iIntValue2 < 60920) {
            dqru.x("added_to_mls_group_timestamp", iIntValue2);
        }
        if (iIntValue >= 60920) {
            cbsyVar.a.put("added_to_mls_group_timestamp", Long.valueOf(basb.a(optionalOf)));
        }
        cbsyVar.e(p(conversationIdType, ccplVar));
        cbsyVar.ap("E2eeDatabaseOperationsImpl#markAddedToMlsGroup");
        cbsyVar.b().e();
    }

    @Override // defpackage.cbqj
    public final void j(ConversationIdType conversationIdType, ccpl ccplVar) {
        ccplVar.getClass();
        String[] strArr = cbtb.a;
        cbsy cbsyVar = new cbsy();
        cbsyVar.a.putNull("mls_reupgrade_after_unexpected_downgrade_attempt_count");
        cbsyVar.e(p(conversationIdType, ccplVar));
        cbsyVar.ap("E2eeDatabaseOperationsImpl#resetReupgradeAfterUnexpectedDowngradeAttemptCount");
        cbsyVar.b().e();
    }
}
