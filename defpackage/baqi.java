package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baqi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataDatabaseOperations");
    public static final ekgb b = ekgb.r(259);
    public final Context c;
    public final fcsu d;
    public final dqsn e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final cogw i;
    public final bxlc j;
    public final apri k;
    public final fcsu l;
    public final aqhc m;
    private final fcsu n;
    private final apqv o;

    public baqi(Context context, fcsu fcsuVar, dqsn dqsnVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cogw cogwVar, bxlc bxlcVar, apqv apqvVar, apri apriVar, fcsu fcsuVar6, aqhc aqhcVar) {
        this.c = context;
        this.d = fcsuVar;
        this.e = dqsnVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.n = fcsuVar5;
        this.i = cogwVar;
        this.j = bxlcVar;
        this.o = apqvVar;
        this.k = apriVar;
        this.l = fcsuVar6;
        this.m = aqhcVar;
    }

    private final void m(final Runnable runnable, final String str, final ConversationIdType conversationIdType, final boolean z) {
        this.e.h(new dqsm() { // from class: baqh
            @Override // defpackage.dqsm
            public final eieu a() {
                ekrg ekrgVar = baqi.a;
                return eiiy.k(str);
            }
        }, ((eoth) ((aovp) this.o).a.b()).a("bugle.enable_deduping_update_conversation_meta_data_runnable_in_silo_execution") ? str.concat(String.valueOf(String.valueOf(conversationIdType))) : null, new Runnable() { // from class: baqg
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
                if (z) {
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    final baqi baqiVar = this.a;
                    dqsm dqsmVar = new dqsm() { // from class: bapx
                        @Override // defpackage.dqsm
                        public final eieu a() {
                            ekrg ekrgVar = baqi.a;
                            return eiiy.k("notifyConversationPushAfterCommit");
                        }
                    };
                    String strValueOf = String.valueOf(String.valueOf(conversationIdType2));
                    baqiVar.e.g(dqsmVar, "notifyConversationPushAfterCommit".concat(strValueOf), new Runnable() { // from class: bapy
                        @Override // java.lang.Runnable
                        public final void run() {
                            baqiVar.j.e(conversationIdType2, true);
                        }
                    });
                }
            }
        }, dqss.TXN_1);
    }

    public final void a(final ConversationIdType conversationIdType, final boolean z, final bvdk bvdkVar) {
        d(new Runnable() { // from class: bapq
            @Override // java.lang.Runnable
            public final void run() {
                cqaz.h();
                baqi baqiVar = this.a;
                ConversationIdType conversationIdType2 = conversationIdType;
                if (baqiVar.k(conversationIdType2)) {
                    baqiVar.b(conversationIdType2, z, bvdkVar);
                }
            }
        }, "ConversationMetadataDatabaseOperations#maybeRefreshConversationMetadata", conversationIdType);
    }

    public final void b(final ConversationIdType conversationIdType, final boolean z, final bvdk bvdkVar) {
        if (!((Boolean) this.n.b()).booleanValue()) {
            d(new Runnable() { // from class: bapw
                @Override // java.lang.Runnable
                public final void run() {
                    cqaz.h();
                    this.a.c(conversationIdType, z, bvdkVar);
                }
            }, "ConversationMetadataDatabaseOperations#refreshConversationMetadata", conversationIdType);
            return;
        }
        dqsn dqsnVar = this.e;
        dqsm dqsmVar = new dqsm() { // from class: bapu
            @Override // defpackage.dqsm
            public final eieu a() {
                ekrg ekrgVar = baqi.a;
                return eiiy.k("CMDO::runRefreshConversationMetadata::runAfterCommit");
            }
        };
        String strValueOf = String.valueOf(String.valueOf(conversationIdType));
        dqsnVar.g(dqsmVar, "ConversationMetadataDatabaseOperations#refreshConversationMetadataRunAfterCommit#conversationId#".concat(strValueOf), new Runnable() { // from class: bapv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(conversationIdType, z, bvdkVar);
            }
        });
    }

    public final void c(ConversationIdType conversationIdType, boolean z, bvdk bvdkVar) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("runRefreshConversationMetadataReaction");
        bqkg bqkgVarA = bqkl.a();
        bqjp bqjpVar = bqkl.c;
        bqkgVarA.c(bqjpVar.a, bqjpVar.e);
        bqkf bqkfVarB = bqkgVarA.b();
        bqjq bqjqVar = bqjpVar.b;
        bran branVar = MessagesTable.c;
        dqtr dqtrVarI = dqts.i(bqkfVarB, bqjqVar, branVar.a);
        ((dqos) dqtrVarI).e = "message_reactions";
        brdrVarD.F(dqtrVarI.g());
        brec brecVarD = baxe.D(conversationIdType, true);
        brecVarD.b(new Function() { // from class: bavz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = baxe.a;
                brecVar.ak();
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bawj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = baxe.a;
                brecVar.af();
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.k(new brdv(brecVarD));
        brao braoVar = branVar.i;
        brdrVarD.d(new brdo(braoVar, false));
        brdrVarD.y(1);
        brdrVarD.e(new Function() { // from class: baqf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar2 = (bran) obj;
                ekrg ekrgVar = baqi.a;
                return new brao[]{branVar2.a, branVar2.i, branVar2.c};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brap brapVar = (brap) brdrVarD.b().p();
        try {
            brdr brdrVarD2 = MessagesTable.d();
            brdrVarD2.A("runRefreshConversationMetadata");
            brdrVarD2.k(new brdv(baxe.E(conversationIdType)));
            brdrVarD2.d(new brdo(braoVar, false));
            brdrVarD2.y(1);
            brdrVarD2.e(new Function() { // from class: bapz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar2 = (bran) obj;
                    ekrg ekrgVar = baqi.a;
                    return new brao[]{branVar2.a, branVar2.i, branVar2.c};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brap brapVar2 = (brap) brdrVarD2.b().p();
            try {
                if (brapVar.moveToFirst() && brapVar2.moveToFirst()) {
                    bqit bqitVar = (bqit) ((MessagesTable.BindData) brapVar.cQ()).ax("message_reactions", bqit.class);
                    bqitVar.getClass();
                    e(conversationIdType, (bqitVar.p() == ckml.REACTION_TYPE_UNSPECIFIED || brapVar.l() <= brapVar2.l()) ? brapVar2.q() : brapVar.q(), Long.valueOf(brapVar2.l()), bvdkVar, z);
                } else if (brapVar2.moveToFirst()) {
                    e(conversationIdType, brapVar2.q(), Long.valueOf(brapVar2.l()), bvdkVar, z);
                }
                brapVar2.close();
                brapVar.close();
            } finally {
            }
        } finally {
        }
    }

    public final void d(Runnable runnable, String str, ConversationIdType conversationIdType) {
        m(runnable, str, conversationIdType, false);
    }

    public final void e(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, bvdk bvdkVar, boolean z) {
        cqaz.h();
        g(conversationIdType, messageIdType, l, bvdkVar, null, z);
    }

    public final void f(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, bvdk bvdkVar, long j, Integer num) {
        cqaz.h();
        h(conversationIdType, messageIdType, l, bvdkVar, null, true, j, num, null);
    }

    public final void g(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, bvdk bvdkVar, String str, boolean z) {
        h(conversationIdType, messageIdType, l, bvdkVar, str, z, -1L, null, null);
    }

    public final void h(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, bvdk bvdkVar, String str, boolean z, long j, Integer num, SelfIdentityId selfIdentityId) {
        i(conversationIdType, messageIdType, l, bvdkVar, str, z, j, num, selfIdentityId, false);
    }

    public final void i(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final Long l, final bvdk bvdkVar, final String str, final boolean z, final long j, final Integer num, final SelfIdentityId selfIdentityId, boolean z2) {
        m(new Runnable() { // from class: bapr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                SelfIdentityId selfIdentityIdI;
                SelfIdentityId selfIdentityIdV;
                axcy axcyVarE;
                ckmb ckmbVarO;
                cqaz.h();
                ConversationIdType conversationIdType2 = conversationIdType;
                MessageIdType messageIdType2 = messageIdType;
                baqi baqiVar = this.a;
                if (baqiVar.k.a()) {
                    ekrw ekrwVarH = baqi.a.h();
                    ekrwVarH.X(eksq.a, "BugleDatabase");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cqnc.s, conversationIdType2);
                    ekrdVar.X(cqnc.b, messageIdType2);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataDatabaseOperations", "updateConversationMetadata", 196, "ConversationMetadataDatabaseOperations.java")).q("UpdateConversationMetadata: Setting latest message ID for conversation");
                }
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.al();
                if (!messageIdType2.c()) {
                    if (messageIdType2 == null) {
                        boteVar.a.putNull("latest_message_id");
                    } else {
                        boteVar.a.put("latest_message_id", Long.valueOf(bary.a(messageIdType2)));
                    }
                }
                SelfIdentityId selfIdentityId2 = selfIdentityId;
                if (!TextUtils.isEmpty(aoet.a(selfIdentityId2))) {
                    selfIdentityId2.getClass();
                    boteVar.n(((SelfIdentityIdImpl) selfIdentityId2).a);
                }
                Long l2 = l;
                if (l2 != null) {
                    boteVar.Z(l2.longValue());
                }
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    dqru.v(boteVar.a, "sms_service_center", str2);
                }
                long j2 = j;
                if (j2 != -1) {
                    if (cqbe.c()) {
                        cqaz.b(((bakt) baqiVar.h.b()).q(j2), conversationIdType2);
                    }
                    boteVar.T(j2);
                }
                Integer num2 = num;
                if (num2 != null) {
                    num2.intValue();
                    boteVar.A(0);
                }
                bvdk bvdkVar2 = bvdkVar;
                fcsu fcsuVar = baqiVar.h;
                bvdk bvdkVarS = ((bakt) fcsuVar.b()).s(conversationIdType2);
                if (bvdkVar2 != null && (bvdkVarS == null || (bvdkVar2 != bvdkVarS && !bvdkVarS.g()))) {
                    ((cpgf) baqiVar.f.b()).a(conversationIdType2, bvdkVar2, elka.CONVERSATION_FROM_METADATA_UPDATE);
                }
                boolean z3 = z;
                if (!messageIdType2.c()) {
                    fcsu fcsuVar2 = baqiVar.g;
                    final MessageCoreData messageCoreDataW = ((baxe) fcsuVar2.b()).w(messageIdType2);
                    if (messageCoreDataW != null) {
                        if (baqiVar.m.a() && baqi.b.contains(Integer.valueOf(messageCoreDataW.k()))) {
                            return;
                        }
                        String strA = null;
                        if (messageCoreDataW.cF()) {
                            bqkg bqkgVarA = bqkl.a();
                            bqkgVarA.A("getSnippetOverrideTextIfReaction");
                            bqjp bqjpVar = bqkl.c;
                            bqkgVarA.c(bqjpVar.d, bqjpVar.f);
                            bqkgVarA.f(new Function() { // from class: baps
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bqkk bqkkVar = (bqkk) obj;
                                    ekrg ekrgVar = baqi.a;
                                    bqkkVar.b(messageCoreDataW.C());
                                    return bqkkVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bqkgVarA.y(1);
                            ekgb ekgbVarZ = bqkgVarA.b().z();
                            if (ekgbVarZ.size() == 1 && (ckmbVarO = ((bqit) ekgbVarZ.get(0)).o()) != null) {
                                ckml ckmlVarB = ckml.b(ckmbVarO.e);
                                if (ckmlVarB == null) {
                                    ckmlVarB = ckml.UNRECOGNIZED;
                                }
                                if (ckmlVarB == ckml.EMOTIFY) {
                                    strA = baqiVar.c.getString(R.string.conversation_photomoji_snippet);
                                } else {
                                    MessageCoreData messageCoreDataW2 = ((baxe) fcsuVar2.b()).w(((bqit) ekgbVarZ.get(0)).m());
                                    if (messageCoreDataW2 != null) {
                                        strA = ((ckya) baqiVar.l.b()).a(ckmc.ADD_REACTION, ckmbVarO, cknp.a(((MessageData) messageCoreDataW2).i));
                                    }
                                }
                            }
                        }
                        baxe.W(messageCoreDataW, boteVar, strA);
                        if (z3) {
                            eieu eieuVarK = eiiy.k("ConversationMetadataDatabaseOperations#addSelfIdAutoSwitchInfoToContentValues");
                            try {
                                if (messageCoreDataW.cK() && (selfIdentityIdV = messageCoreDataW.v()) != null && (axcyVarE = ((bbdl) baqiVar.d.b()).e(selfIdentityIdV)) != null && axcyVarE.h() && !axcyVarE.i()) {
                                    ((bakt) fcsuVar.b()).am(axcyVarE.f(), boteVar);
                                }
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
                }
                fcsu fcsuVar3 = baqiVar.h;
                ((bakt) fcsuVar3.b()).W(conversationIdType2, boteVar);
                if (!z3 || (selfIdentityIdI = ((bakt) fcsuVar3.b()).i(conversationIdType2)) == null) {
                    return;
                }
                avmn.a(baqiVar.c, conversationIdType2, selfIdentityIdI);
            }
        }, "ConversationMetadataDatabaseOperations#updateConversationMetadata", conversationIdType, z2);
    }

    public final void j(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, bvdk bvdkVar, long j, Integer num) {
        cqaz.h();
        i(conversationIdType, messageIdType, l, bvdkVar, null, true, j, num, null, true);
    }

    public final boolean k(final ConversationIdType conversationIdType) {
        MessageCoreData messageCoreDataO = ((baxe) this.g.b()).o(conversationIdType);
        MessageIdType messageIdTypeC = messageCoreDataO == null ? bary.a : messageCoreDataO.C();
        eieu eieuVarK = eiiy.k("ConversationMetadataDatabaseOperations#getStoredLatestMessageId");
        try {
            cqaz.h();
            botb botbVarE = botm.e();
            botbVarE.A("getStoredLatestMessageId");
            botbVarE.g(new Function() { // from class: baqa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ekrg ekrgVar = baqi.a;
                    return ((bopp) obj).f;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.i(new Function() { // from class: baqb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    ekrg ekrgVar = baqi.a;
                    botlVar.r(conversationIdType);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopr boprVar = (bopr) botbVarE.b().p();
            try {
                MessageIdType messageIdTypeI = boprVar.moveToFirst() ? boprVar.i() : bary.a;
                boprVar.close();
                eieuVarK.close();
                return messageIdTypeC.c() || !messageIdTypeC.equals(messageIdTypeI);
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

    public final void l(final ConversationIdType conversationIdType, final bvdk bvdkVar, final long j) throws Throwable {
        eieu eieuVarK = eiiy.k("ConversationMetadataDatabaseOperations#maybeUpdateConversationMetadata");
        try {
            if (((bakt) this.h.b()).a(conversationIdType) != 0) {
                try {
                    d(new Runnable() { // from class: baqc
                        @Override // java.lang.Runnable
                        public final void run() {
                            cqaz.h();
                            baqi baqiVar = this.a;
                            bvdk bvdkVar2 = bvdkVar;
                            baqiVar.f(conversationIdType, bary.a, null, bvdkVar2, j, 0);
                        }
                    }, "ConversationMetadataDatabaseOperations#maybeUpdateConversationMetadata", conversationIdType);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        eieuVarK.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            eieuVarK.close();
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
