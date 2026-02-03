package com.google.android.apps.messaging.shared.datamodel.database.upgrade;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.a;
import defpackage.ainv;
import defpackage.aipo;
import defpackage.alqm;
import defpackage.alvr;
import defpackage.alvx;
import defpackage.anuh;
import defpackage.auej;
import defpackage.auvh;
import defpackage.awxe;
import defpackage.awxh;
import defpackage.awxl;
import defpackage.axie;
import defpackage.axjf;
import defpackage.axjq;
import defpackage.axjr;
import defpackage.aypj;
import defpackage.ayqk;
import defpackage.bakt;
import defpackage.barn;
import defpackage.baro;
import defpackage.barp;
import defpackage.bary;
import defpackage.baxe;
import defpackage.bbbd;
import defpackage.bbca;
import defpackage.bblb;
import defpackage.bblc;
import defpackage.bbld;
import defpackage.bble;
import defpackage.bbmj;
import defpackage.bbml;
import defpackage.bnxi;
import defpackage.boar;
import defpackage.bobl;
import defpackage.boca;
import defpackage.bocd;
import defpackage.bocf;
import defpackage.bocg;
import defpackage.bofo;
import defpackage.bofr;
import defpackage.bohm;
import defpackage.bohr;
import defpackage.boil;
import defpackage.boiv;
import defpackage.bojh;
import defpackage.bopp;
import defpackage.bopq;
import defpackage.bopr;
import defpackage.bost;
import defpackage.bosz;
import defpackage.botb;
import defpackage.bote;
import defpackage.botf;
import defpackage.botl;
import defpackage.botm;
import defpackage.bozp;
import defpackage.bpaa;
import defpackage.bpab;
import defpackage.bpai;
import defpackage.bpau;
import defpackage.bpba;
import defpackage.bpbb;
import defpackage.bpbc;
import defpackage.bprf;
import defpackage.bpxj;
import defpackage.bpzc;
import defpackage.bpzd;
import defpackage.bpzx;
import defpackage.bqkl;
import defpackage.bqrg;
import defpackage.bran;
import defpackage.brao;
import defpackage.brap;
import defpackage.brdo;
import defpackage.brdp;
import defpackage.brdr;
import defpackage.brdu;
import defpackage.brdv;
import defpackage.brec;
import defpackage.brhv;
import defpackage.brvp;
import defpackage.brzh;
import defpackage.brzi;
import defpackage.brzj;
import defpackage.bsbm;
import defpackage.bsbo;
import defpackage.bsbs;
import defpackage.bsbx;
import defpackage.bsgr;
import defpackage.bsgs;
import defpackage.bsgt;
import defpackage.bsix;
import defpackage.bsjc;
import defpackage.bsje;
import defpackage.bsjh;
import defpackage.bsjl;
import defpackage.bstk;
import defpackage.bsum;
import defpackage.bsun;
import defpackage.bswf;
import defpackage.bsyd;
import defpackage.bsyn;
import defpackage.bszn;
import defpackage.bszx;
import defpackage.btgv;
import defpackage.btik;
import defpackage.btin;
import defpackage.btjn;
import defpackage.btjz;
import defpackage.btke;
import defpackage.btkh;
import defpackage.btkn;
import defpackage.btkq;
import defpackage.btmf;
import defpackage.btmm;
import defpackage.btnj;
import defpackage.btnp;
import defpackage.btns;
import defpackage.bton;
import defpackage.btxd;
import defpackage.btyb;
import defpackage.btyd;
import defpackage.btys;
import defpackage.btyw;
import defpackage.btyx;
import defpackage.budf;
import defpackage.budg;
import defpackage.budh;
import defpackage.budi;
import defpackage.bufg;
import defpackage.bugy;
import defpackage.buid;
import defpackage.bujn;
import defpackage.bujw;
import defpackage.bukl;
import defpackage.bukr;
import defpackage.buks;
import defpackage.bukt;
import defpackage.buku;
import defpackage.buym;
import defpackage.buyv;
import defpackage.buyw;
import defpackage.buyx;
import defpackage.bvbu;
import defpackage.bvdk;
import defpackage.bvdu;
import defpackage.bvdz;
import defpackage.caau;
import defpackage.caxr;
import defpackage.caxy;
import defpackage.cazj;
import defpackage.cbcu;
import defpackage.cbff;
import defpackage.cbfi;
import defpackage.cbog;
import defpackage.ccze;
import defpackage.cczi;
import defpackage.cczv;
import defpackage.chsk;
import defpackage.chvp;
import defpackage.chwl;
import defpackage.chwq;
import defpackage.cjpu;
import defpackage.cjpv;
import defpackage.cjpw;
import defpackage.cmcq;
import defpackage.cmqf;
import defpackage.cmqj;
import defpackage.cmtz;
import defpackage.cnqj;
import defpackage.cnqk;
import defpackage.cqaz;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqdf;
import defpackage.craf;
import defpackage.crma;
import defpackage.crmx;
import defpackage.csdm;
import defpackage.csrx;
import defpackage.dhff;
import defpackage.dhka;
import defpackage.dqos;
import defpackage.dqpj;
import defpackage.dqpk;
import defpackage.dqpn;
import defpackage.dqru;
import defpackage.dqsy;
import defpackage.dqtq;
import defpackage.dqtr;
import defpackage.dqts;
import defpackage.dqty;
import defpackage.dqwh;
import defpackage.dqxl;
import defpackage.dqxm;
import defpackage.dqyp;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejwk;
import defpackage.ejwl;
import defpackage.ekcv;
import defpackage.ekgb;
import defpackage.ekgp;
import defpackage.ekoe;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.enqq;
import defpackage.eyzy;
import defpackage.fcsu;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CustomUpgradeSteps {
    private static final String CREATE_CONVERSATION_SUGGESTIONS_INDEX_11000 = "CREATE INDEX index_conversation_suggestions_message_id ON conversation_suggestions(message_id);";
    private static final String CREATE_CONVERSATION_SUGGESTIONS_TABLE_11000 = "CREATE TABLE conversation_suggestions(_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id STRING, conversation_suggestion_type INT DEFAULT(0), properties TEXT, post_back_data TEXT, post_back_encoding TEXT, FOREIGN KEY (message_id) REFERENCES  messages(_id) ON DELETE CASCADE);";
    private static final String CREATE_PROXY_TABLE_SQL = "CREATE TABLE proxy_state_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, participant_id STRING UNIQUE, disabled_reports_timestamp INT DEFAULT(0), FOREIGN KEY (participant_id) REFERENCES participants(_id) ON DELETE CASCADE);";
    private static final String HUAWEI_MANUFACTURER = "HUAWEI";
    private static final int MARK_RCS_IN_TELEPHONY_BATCH_SIZE = 100;
    private static final String PROXY_DISABLED_REPORTS_TIMESTAMP = "disabled_reports_timestamp";
    private static final String PROXY_INDEX = "index_proxy_state_table_participant_id";
    private static final String PROXY_PARTICIPANT_ID = "participant_id";
    private static final String PROXY_TABLE = "proxy_state_table";
    private static final String PROXY_TABLE_PARTICIPANT_ID_INDEX_SQL = "CREATE INDEX index_proxy_state_table_participant_id ON proxy_state_table(participant_id)";
    private final csrx base32Utils;
    private final crmx buglePhoneNumberUtils;
    private final caau cmsBackFillBnrStateForFiMdQueue;
    private final Context context;
    private final fcsu<bakt> conversationDatabaseOperations;
    private final aypj markAsReadActionFactory;
    private final cjpw markRcsMessagesInTelephonyQueue;
    private final fcsu<baxe> messageDatabaseOperations;
    private final axjf participantAvatarUriGenerator;
    private final fcsu<bbca> participantDatabaseOperations;
    private final anuh participantRowFactory;
    private final crma permissionChecker;
    private final fcsu<chvp> rcsTelephonyAccess;
    private final chwl rcsTelephonyStrings;
    private final chwq rcsUtils;
    private final ayqk sanitizeParticipantsActionFactory;
    private final fcsu<cmqf> syncManager;
    private final fcsu<cmqj> telephonyManagerInterface;
    private final aipo timerEventLogger;
    private static final cqce log = cqce.g("BugleDataModel", "OnDeviceDatabaseUpgradeHandler");
    private static final ekrg logger = ekrg.c("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps");
    private static final String[] HUAWEI_MATE_20_MODEL_NAMES = {"LYA-L09", "LYA-L29", "LYA-L0C", "HMA-L09", "HMA-L29", "EVR-L29"};

    public CustomUpgradeSteps(Context context, fcsu<cmqf> fcsuVar, crma crmaVar, fcsu<bbca> fcsuVar2, fcsu<bakt> fcsuVar3, fcsu<baxe> fcsuVar4, chwq chwqVar, chwl chwlVar, fcsu<chvp> fcsuVar5, csrx csrxVar, fcsu<cmqj> fcsuVar6, aipo aipoVar, crmx crmxVar, ayqk ayqkVar, axjf axjfVar, aypj aypjVar, cjpw cjpwVar, caau caauVar, anuh anuhVar) {
        this.context = context;
        this.syncManager = fcsuVar;
        this.permissionChecker = crmaVar;
        this.participantDatabaseOperations = fcsuVar2;
        this.conversationDatabaseOperations = fcsuVar3;
        this.messageDatabaseOperations = fcsuVar4;
        this.rcsUtils = chwqVar;
        this.rcsTelephonyStrings = chwlVar;
        this.rcsTelephonyAccess = fcsuVar5;
        this.base32Utils = csrxVar;
        this.telephonyManagerInterface = fcsuVar6;
        this.timerEventLogger = aipoVar;
        this.buglePhoneNumberUtils = crmxVar;
        this.sanitizeParticipantsActionFactory = ayqkVar;
        this.participantAvatarUriGenerator = axjfVar;
        this.markAsReadActionFactory = aypjVar;
        this.markRcsMessagesInTelephonyQueue = cjpwVar;
        this.cmsBackFillBnrStateForFiMdQueue = caauVar;
        this.participantRowFactory = anuhVar;
    }

    private static bohm[] applyDeduplicationAndConvert(ekgb<boar> ekgbVar) {
        return (bohm[]) Collection.EL.stream(((ekgp) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bbjj
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
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$0((boar) obj);
            }
        }).filter(new Predicate() { // from class: bbjl
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
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$1((boar) obj);
            }
        }).collect(ekcv.b(new Function() { // from class: bbjm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.toConversationParticipantsDeduplicationKey((boar) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity(), new BinaryOperator() { // from class: bbjn
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$2((boar) obj, (boar) obj2);
            }
        }))).values()).map(new Function() { // from class: bbjo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.toConversationToParticipants((boar) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: bbjp
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$3(i);
            }
        });
    }

    private void broadcastIncreaseSessionIdIntent() {
        Intent intent = new Intent(RcsIntents.ACTION_DEBUG_OPTION_INCREASE_SESSION_ID);
        dhka.c(this.context, intent);
        dhff.c(this.context, intent);
        this.context.sendBroadcast(intent);
    }

    private static void copyBlobIdIntoCompressedBlobId() {
        cqce cqceVar = log;
        cqceVar.p("begin copyBlobIdIntoCompressedBlobId.");
        String[] strArr = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("copyBlobIdIntoCompressedBlobId-parts1");
        bsgr bsgrVar = PartsTable.d;
        bsjhVar.ag("compressed_blob_id", bsgrVar.A);
        bsjhVar.b().e();
        bsjh bsjhVar2 = new bsjh();
        bsjhVar2.ap("copyBlobIdIntoCompressedBlobIdparts2");
        bsjhVar2.ag("compressed_blob_upload_permanent_failure", bsgrVar.F);
        bsjhVar2.b().e();
        bsjh bsjhVar3 = new bsjh();
        bsjhVar3.ap("copyBlobIdIntoCompressedBlobId-parts3");
        bsjhVar3.ag("compressed_blob_upload_timestamp", bsgrVar.G);
        bsjhVar3.b().e();
        cqceVar.p("completed copyBlobIdIntoCompressedBlobId.");
    }

    private static void fixLegacyResourceUris() {
        fixLegacyResourceUrisInConversations();
        fixLegacyResourceUrisInDrafts();
    }

    private static void fixLegacyResourceUrisInConversations() {
        botb botbVarE = botm.e();
        botbVarE.A("fixLegacyResourceUrisInConversations1");
        botbVarE.s();
        botbVarE.f(new Function() { // from class: bbis
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$fixLegacyResourceUrisInConversations$0((bopp) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.i(new Function() { // from class: bbit
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInConversations$1(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopr boprVar = (bopr) botbVarE.b().p();
        try {
            if (boprVar.moveToFirst()) {
                do {
                    Uri updatedLegacyStickerUri = getUpdatedLegacyStickerUri(boprVar.g());
                    if (updatedLegacyStickerUri != null) {
                        bote boteVar = new bote();
                        boteVar.ap("fixLegacyResourceUrisInConversations2");
                        boteVar.s(updatedLegacyStickerUri);
                        botl botlVar = new botl();
                        botlVar.r(boprVar.h());
                        boteVar.ac(botlVar);
                        boteVar.b().e();
                    }
                } while (boprVar.moveToNext());
            }
            boprVar.close();
        } catch (Throwable th) {
            try {
                boprVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void fixLegacyResourceUrisInDrafts() {
        boolean z;
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("fixLegacyResourceUrisInDrafts");
        bsjeVarC.s();
        bsjeVarC.e(new Function() { // from class: bbin
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$0((bsgr) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.h(new Function() { // from class: bbip
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$1(bsjlVar);
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
        while (bsgtVar.moveToNext()) {
            try {
                Uri updatedLegacyStickerUri = getUpdatedLegacyStickerUri(bsgtVar.i());
                Uri updatedLegacyStickerUri2 = getUpdatedLegacyStickerUri(bsgtVar.g());
                Uri updatedLegacyStickerUri3 = getUpdatedLegacyStickerUri(bsgtVar.f());
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("fixLegacyResourceUrisInDrafts-parts");
                boolean z2 = true;
                if (updatedLegacyStickerUri != null) {
                    bsjhVar.z(updatedLegacyStickerUri);
                    z = true;
                } else {
                    z = false;
                }
                if (updatedLegacyStickerUri2 != null) {
                    bsjhVar.u(updatedLegacyStickerUri2);
                } else {
                    z2 = z;
                }
                if (updatedLegacyStickerUri3 != null) {
                    bsjhVar.m(updatedLegacyStickerUri3);
                } else if (z2) {
                }
                bsjhVar.c(bsgtVar.p());
            } catch (Throwable th) {
                try {
                    bsgtVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bsgtVar.close();
    }

    private void fixRcsGroupConversation(dqsy dqsyVar, final ConversationIdType conversationIdType, cnqj cnqjVar, final String str, String str2) {
        ejwl.m(str2 != null, "lastUri cannot be null");
        cqbd cqbdVarA = log.a();
        cqbdVarA.I("Promoting to an Rcs group.");
        cqbdVarA.c(conversationIdType);
        cqbdVarA.r();
        final cmtz cmtzVarE = ((Boolean) ((cczi) chwq.a.get()).e()).booleanValue() ? ((chvp) this.rcsTelephonyAccess.b()).e(cnqjVar, str, str2, null) : this.rcsUtils.k(cnqjVar, str, str2, null);
        dqsyVar.w("OnDeviceDatabaseUpgradeHandler#fixRcsGroupConversation", new Runnable() { // from class: bbka
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$fixRcsGroupConversation$0(str, cmtzVarE, conversationIdType);
            }
        });
    }

    private static void fixSpamWarningForOlderReports() {
        cqce cqceVar = log;
        cqceVar.p("begin fixSpamWarningForOlderReports.");
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("fixSpamWarningForOlderReports");
        boteVar.ak();
        boteVar.aa(false);
        botl botlVar = new botl();
        int iIntValue = botm.g().intValue();
        if (iIntValue < 23000) {
            dqru.x("spam_warning_dismiss_status", iIntValue);
        }
        botlVar.ap(new dqty("conversations.spam_warning_dismiss_status", 1, 1));
        boteVar.ac(botlVar);
        boteVar.b().e();
        cqceVar.p("completed fixSpamWarningForOlderReports.");
    }

    private static ekgb<bojh> getAllRcsGroupConversationsWithJoinedStatus() {
        botb botbVarE = botm.e();
        botbVarE.A("CustomUpgradeSteps#getAllRcsGroupConversations");
        botbVarE.s();
        botbVarE.i(new Function() { // from class: bbkp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$getAllRcsGroupConversationsWithJoinedStatus$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopp boppVar = botm.c;
        botbVarE.c(boppVar.a, boppVar.am);
        return botbVarE.b().z();
    }

    private static Uri getUpdatedLegacyStickerUri(Uri uri) {
        String str;
        if (uri == null) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 1) {
            return null;
        }
        switch (Integer.parseInt(pathSegments.get(0))) {
            case 2130837661:
                str = "foodies_animated_angry";
                break;
            case 2130837662:
                str = "foodies_animated_bye";
                break;
            case 2130837663:
                str = "foodies_animated_confused";
                break;
            case 2130837664:
                str = "foodies_animated_congratulations";
                break;
            default:
                return null;
        }
        Uri uriBuild = new Uri.Builder().scheme("android.resource").authority(ejwk.b(uri.getAuthority())).appendPath("drawable").appendPath(str).build();
        cqbd cqbdVarA = log.a();
        cqbdVarA.I("Convert sticker.");
        cqbdVarA.A("oldUri", uri.toString());
        cqbdVarA.A("updatedUri", uriBuild.toString());
        cqbdVarA.r();
        return uriBuild;
    }

    private void huaweiMate20UpgradeCleardata() {
        if (((Boolean) ccze.P.e()).booleanValue() && HUAWEI_MANUFACTURER.equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            for (String str2 : HUAWEI_MATE_20_MODEL_NAMES) {
                if (str.equalsIgnoreCase(str2)) {
                    cqce cqceVar = log;
                    cqceVar.r("Huawei Mate-20 phone detected");
                    Context context = this.context;
                    if (context == null) {
                        cqceVar.r("huaweiMate20UpgradeClearData - unable to retrieve context");
                        return;
                    }
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager == null) {
                        cqceVar.r("huaweiMate20UpgradeClearData - unable to retrieve activity service");
                        return;
                    }
                    cqceVar.r("huaweiMate20UpgradeClearData - Wiping data.");
                    activityManager.clearApplicationUserData();
                    cqceVar.r("huaweiMate20UpgradeClearData - Wiped data.  Forcing exit.");
                    System.exit(0);
                    return;
                }
            }
        }
    }

    private static void invalidateRcsSessionIdsForOneToOne() {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("invalidateRcsSessionIdsForOneToOne");
        boteVar.ak();
        boteVar.T(-1L);
        boteVar.ad(new Function() { // from class: bbil
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$invalidateRcsSessionIdsForOneToOne$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar.b().e();
    }

    public static /* synthetic */ boolean lambda$applyDeduplicationAndConvert$0(boar boarVar) {
        return (boarVar.m() == null || ejwk.c(boarVar.m().toString())) ? false : true;
    }

    public static /* synthetic */ boolean lambda$applyDeduplicationAndConvert$1(boar boarVar) {
        return boarVar.k() > 0;
    }

    public static /* synthetic */ boar lambda$applyDeduplicationAndConvert$2(boar boarVar, boar boarVar2) {
        boarVar.aA(3, "is_normalized");
        return boarVar.d ? boarVar : boarVar2;
    }

    public static /* synthetic */ bohm[] lambda$applyDeduplicationAndConvert$3(int i) {
        return new bohm[i];
    }

    public static /* synthetic */ bopq[] lambda$fixLegacyResourceUrisInConversations$0(bopp boppVar) {
        return new bopq[]{boppVar.a, boppVar.n};
    }

    public static /* synthetic */ botl lambda$fixLegacyResourceUrisInConversations$1(botl botlVar) {
        botlVar.o();
        return botlVar;
    }

    public static /* synthetic */ bsgs[] lambda$fixLegacyResourceUrisInDrafts$0(bsgr bsgrVar) {
        return new bsgs[]{bsgrVar.a, bsgrVar.e, bsgrVar.v, bsgrVar.x};
    }

    public static /* synthetic */ bsjl lambda$fixLegacyResourceUrisInDrafts$1(bsjl bsjlVar) {
        bsjlVar.b(new Function() { // from class: bbjw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar2 = (bsjl) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$2(bsjlVar2);
                return bsjlVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bbjx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar2 = (bsjl) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$3(bsjlVar2);
                return bsjlVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bbjy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar2 = (bsjl) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$4(bsjlVar2);
                return bsjlVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bsjlVar;
    }

    public static /* synthetic */ bsjl lambda$fixLegacyResourceUrisInDrafts$2(bsjl bsjlVar) {
        bsjlVar.w();
        return bsjlVar;
    }

    public static /* synthetic */ bsjl lambda$fixLegacyResourceUrisInDrafts$3(bsjl bsjlVar) {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 10017) {
            dqru.x("preview_content_uri", iIntValue);
        }
        bsjlVar.ap(new dqpj("parts.preview_content_uri", 11, "android.resource%"));
        return bsjlVar;
    }

    public static /* synthetic */ bsjl lambda$fixLegacyResourceUrisInDrafts$4(bsjl bsjlVar) {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 13000) {
            dqru.x("fallback_uri", iIntValue);
        }
        bsjlVar.ap(new dqpj("parts.fallback_uri", 11, "android.resource%"));
        return bsjlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fixRcsGroupConversation$0(String str, cmtz cmtzVar, ConversationIdType conversationIdType) {
        ParticipantsTable.BindData bindDataA;
        brvp brvpVarF = bbbd.f(str);
        ((bbca) this.participantDatabaseOperations.b()).j(brvpVarF);
        ParticipantsTable.BindData bindDataA2 = brvpVarF.a();
        ((bbca) this.participantDatabaseOperations.b()).j(bbbd.f(cmtzVar.d));
        ArrayList arrayList = new ArrayList();
        ArrayList<alqm> arrayList2 = cmtzVar.b;
        if (arrayList2.isEmpty()) {
            arrayList.add(bindDataA2);
        } else {
            for (alqm alqmVar : arrayList2) {
                cczv cczvVar = alvx.a;
                String strK = alqmVar.k(((Boolean) new alvr().get()).booleanValue());
                strK.getClass();
                if (((Boolean) new alvr().get()).booleanValue()) {
                    brvp brvpVarF2 = bbbd.f(strK);
                    ((bbca) this.participantDatabaseOperations.b()).j(brvpVarF2);
                    bindDataA = brvpVarF2.a();
                } else {
                    bindDataA = this.participantRowFactory.a(alqmVar);
                    ((bbca) this.participantDatabaseOperations.b()).i(bindDataA);
                }
                arrayList.add(bindDataA);
            }
        }
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("fixRcsGroupConversation");
        boteVar.C(cmtzVar.c);
        boteVar.F(0L);
        boteVar.J("");
        boteVar.K("");
        boteVar.H("");
        boteVar.n(cmtzVar.d);
        boteVar.G(arrayList.size());
        boteVar.I(arrayList2.toString());
        boteVar.A(cmtzVar.f);
        boteVar.m();
        boteVar.z(this.participantAvatarUriGenerator.b(arrayList).toString());
        ((bakt) this.conversationDatabaseOperations.b()).W(conversationIdType, boteVar);
        if (arrayList2.isEmpty()) {
            return;
        }
        ((bakt) this.conversationDatabaseOperations.b()).ai(bindDataA2, conversationIdType, false);
        ((bakt) this.conversationDatabaseOperations.b()).ao(arrayList, conversationIdType);
    }

    public static /* synthetic */ botl lambda$getAllRcsGroupConversationsWithJoinedStatus$0(botl botlVar) {
        botlVar.j(2);
        botlVar.x(0);
        return botlVar;
    }

    public static /* synthetic */ bopq[] lambda$getAllRcsThreadIdGroupNamePairs$0(bopp boppVar) {
        return new bopq[]{boppVar.b, boppVar.c};
    }

    public static /* synthetic */ botl lambda$invalidateRcsSessionIdsForOneToOne$0(botl botlVar) {
        botlVar.j(0);
        return botlVar;
    }

    public static /* synthetic */ List lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$0(Long l) {
        return new ArrayList();
    }

    public static /* synthetic */ void lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$1(List list) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("potentiallyInvalidateRcsSessionIdsForRcsGroups#update");
        boteVar.A(4);
        boteVar.T(-1L);
        botl botlVar = new botl();
        botlVar.u(list);
        boteVar.af(new botf(botlVar));
        boteVar.b().e();
    }

    public static /* synthetic */ bohm[] lambda$rebuildConversationToParticipantsTable$0(int i) {
        return new bohm[i];
    }

    public static /* synthetic */ bocf lambda$toOtherConversationToParticipants$0(ConversationIdType conversationIdType, long j, bocf bocfVar) {
        bocfVar.b(conversationIdType);
        bocfVar.c(j);
        return bocfVar;
    }

    public static /* synthetic */ brec lambda$updateNotNeededMessageSendReportStatusInTransactionPre41040$0(brec brecVar) {
        brecVar.ar(new dqxl("rcs_message_id NOT NULL AND rcs_message_id <> ''", new Object[0]));
        brecVar.D(0);
        return brecVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion10015$1(botl botlVar) {
        botlVar.ap(new dqpn("conversations.participant_lookup_key", 6));
        return botlVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion10020$0(botl botlVar) {
        botlVar.j(0);
        botlVar.K();
        return botlVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion10025$0(botl botlVar) {
        botlVar.j(3);
        return botlVar;
    }

    public static /* synthetic */ void lambda$upgradeToVersion13030$0() {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.ae(108);
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new brdv(brecVar), 2);
        brec brecVar2 = new brec();
        brecVar2.ae(109);
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new brdv(brecVar2), 3);
        brec brecVar3 = new brec();
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 13020) {
            dqru.x("message_report_status", iIntValue);
        }
        brecVar3.ap(new dqty("messages.message_report_status", 9, 100));
        updateNotNeededMessageSendReportStatusInTransactionPre41040(new brdv(brecVar3), 1);
    }

    public static /* synthetic */ bsbx lambda$upgradeToVersion2000$0(int i, bsbx bsbxVar) {
        bsbxVar.v(i);
        return bsbxVar;
    }

    public static /* synthetic */ bsbx lambda$upgradeToVersion2000$1(int i, bsbx bsbxVar) {
        bsbxVar.v(i);
        return bsbxVar;
    }

    public static /* synthetic */ bpbb lambda$upgradeToVersion24050$0(bpbb bpbbVar) {
        bpbbVar.ap(new dqpn("disambiguations.normalized_destination", 5));
        return bpbbVar;
    }

    public static /* synthetic */ bsjl lambda$upgradeToVersion29000$0(bsjl bsjlVar) {
        bsjlVar.w();
        return bsjlVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion29000$1(botl botlVar) {
        botlVar.o();
        return botlVar;
    }

    public static /* synthetic */ brzi[] lambda$upgradeToVersion29050$0(brzh brzhVar) {
        return new brzi[]{brzhVar.f, brzhVar.e, brzhVar.d, brzhVar.w, brzhVar.x, brzhVar.a};
    }

    public static /* synthetic */ bsbx lambda$upgradeToVersion29050$1(bsbx bsbxVar) {
        bsbxVar.x();
        return bsbxVar;
    }

    public static /* synthetic */ bsjl lambda$upgradeToVersion30030$1(bsjl bsjlVar) {
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 14010) {
            dqru.x("source", iIntValue);
        }
        bsjlVar.ap(new dqty("parts.source", 1, 21));
        return bsjlVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion30030$2(bsjc bsjcVar, brec brecVar) {
        brecVar.s(bsjcVar);
        return brecVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion3010$1(brec brecVar) {
        brecVar.q(PartsTable.d.b);
        return brecVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion35070$1(brec brecVar) {
        brecVar.q(btin.c.b);
        return brecVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion4020$0(int i, brec brecVar) {
        brecVar.ae(i - 90);
        return brecVar;
    }

    public static /* synthetic */ budh lambda$upgradeToVersion41040$0(budh budhVar) {
        budhVar.ap(new dqpj("sqlite_master.type", 1, "trigger"));
        budhVar.ap(new dqpj("sqlite_master.name", 1, "on_messages_update_bkr"));
        return budhVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion42040$0(botl botlVar) {
        botlVar.c(bvdk.KEEP_ARCHIVED);
        return botlVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion42040$1(botl botlVar) {
        botlVar.c(bvdk.ARCHIVED);
        botlVar.A();
        return botlVar;
    }

    public static /* synthetic */ bopq[] lambda$upgradeToVersion42040$2(bopp boppVar) {
        return new bopq[]{boppVar.a, boppVar.y};
    }

    public static /* synthetic */ bsbx lambda$upgradeToVersion42040$3(String str, bsbx bsbxVar) {
        bsbxVar.r(str);
        dqyp[] dqypVarArr = new bsbx[2];
        String[] strArr = ParticipantsTable.a;
        bsbx bsbxVar2 = new bsbx();
        bsbxVar2.c();
        dqypVarArr[0] = bsbxVar2;
        dqyp bsbxVar3 = new bsbx();
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 24060) {
            dqru.x("is_spam", iIntValue);
        }
        bsbxVar3.ap(new dqty("participants.is_spam", 1, 1));
        dqypVarArr[1] = bsbxVar3;
        bsbxVar.aq(dqypVarArr);
        return bsbxVar;
    }

    public static /* synthetic */ brzi[] lambda$upgradeToVersion42040$4(brzh brzhVar) {
        return new brzi[]{brzhVar.v, brzhVar.C, brzhVar.D};
    }

    public static /* synthetic */ botl lambda$upgradeToVersion42040$5(ArrayList arrayList, botl botlVar) {
        botlVar.u(arrayList);
        return botlVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion42040$6(ArrayList arrayList, botl botlVar) {
        botlVar.u(arrayList);
        return botlVar;
    }

    public static /* synthetic */ void lambda$upgradeToVersion45000$0() {
        btke btkeVarA = btkh.a();
        btkeVarA.A("upgradeToVersion45000");
        btkeVarA.s();
        btjn btjnVar = (btjn) btkeVarA.b().p();
        while (btjnVar.moveToNext()) {
            try {
                String strH = btjnVar.h();
                if (strH != null) {
                    String[] strArr = btmf.a;
                    btkq btkqVar = new btkq();
                    btkqVar.i(strH);
                    btkqVar.b(btjnVar.e());
                    btkqVar.c(btjnVar.i());
                    btkqVar.e(btjnVar.k());
                    btkqVar.f(btjnVar.j());
                    btkqVar.g(btjnVar.f());
                    btkqVar.j(btjnVar.c());
                    btkn btknVarA = btkqVar.a();
                    final dqsy dqsyVarB = btmf.b();
                    dqru.b(btmf.b(), "remote_registrations_table", btknVarA, new Function() { // from class: btkj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVarB.O("remote_registrations_table", (dqst) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: btkk
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    String[] strArr2 = bton.a;
                    btns btnsVar = new btns();
                    btnsVar.b(btjnVar.g());
                    btnsVar.c(strH);
                    btnp btnpVarA = btnsVar.a();
                    final dqsy dqsyVarA = bton.a();
                    dqru.b(bton.a(), "remote_user_id_to_registration_id", btnpVarA, new Function() { // from class: btnl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVarA.O("remote_user_id_to_registration_id", (dqst) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: btnm
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                String[] strArr3 = btnj.a;
                btmm btmmVar = new btmm();
                btmmVar.d(btjnVar.g());
                btmmVar.c(btjnVar.f());
                btmmVar.b(btjnVar.e());
                btmmVar.a().n();
            } catch (Throwable th) {
                try {
                    btjnVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        btjz btjzVar = new btjz();
        btjzVar.f("upgradeToVersion45000");
        btjzVar.d();
        btjnVar.close();
    }

    public static /* synthetic */ botl lambda$upgradeToVersion49000$0(botl botlVar) {
        botlVar.x(3);
        botlVar.j(2);
        return botlVar;
    }

    public static /* synthetic */ brzi[] lambda$upgradeToVersion52020$0(brzh brzhVar) {
        return new brzi[]{brzhVar.a, brzhVar.o};
    }

    public static /* synthetic */ bsbx lambda$upgradeToVersion52020$1(bsbx bsbxVar) {
        bsbxVar.p(bvdz.VERIFICATION_NA);
        return bsbxVar;
    }

    public static /* synthetic */ brao[] lambda$upgradeToVersion53000$0(bran branVar) {
        return new brao[]{branVar.a};
    }

    public static /* synthetic */ brec lambda$upgradeToVersion53000$1(brec brecVar) {
        brecVar.q(buyx.c.b);
        brecVar.b(new Function() { // from class: bbkn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$2(brecVar2);
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bbko
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$3(brecVar2);
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return brecVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion53000$2(brec brecVar) {
        brecVar.ae(217);
        return brecVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion53000$3(brec brecVar) {
        brecVar.ae(211);
        return brecVar;
    }

    public static /* synthetic */ buyw lambda$upgradeToVersion53000$4(brdp brdpVar, buyw buywVar) {
        buywVar.ar(new dqwh(brdpVar));
        return buywVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion58020$1(brec brecVar) {
        brecVar.q(ScheduledSendTable.c.b);
        return brecVar;
    }

    public static /* synthetic */ buks lambda$upgradeToVersion58650$0(buks buksVar) {
        buksVar.ap(new dqty("supersort_labels._id", 1, 6));
        return buksVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion59320$0(botl botlVar) {
        botlVar.n(1);
        botlVar.p(false);
        return botlVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion59480$0(brec brecVar) {
        brecVar.ae(232);
        brecVar.ap(new dqpn("messages.self_id", 5));
        return brecVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion59500$0(brec brecVar) {
        brecVar.U(new baro(""));
        return brecVar;
    }

    public static /* synthetic */ bpaa lambda$upgradeToVersion59600$0(bpaa bpaaVar) {
        bpaaVar.d(bvdu.GAIA);
        Function[] functionArr = {new Function() { // from class: bbku
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar2 = (bpaa) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59600$1(bpaaVar2);
                return bpaaVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bbkv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar2 = (bpaa) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59600$2(bpaaVar2);
                return bpaaVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        bpaa[] bpaaVarArr = new bpaa[2];
        for (int i = 0; i < 2; i++) {
            Function function = functionArr[i];
            String[] strArr = bpab.a;
            bpaaVarArr[i] = (bpaa) function.apply(new bpaa());
        }
        bpaaVar.aq(bpaaVarArr);
        return bpaaVar;
    }

    public static /* synthetic */ bpaa lambda$upgradeToVersion59600$1(bpaa bpaaVar) {
        int iIntValue = bpab.c().intValue();
        if (iIntValue < 59560) {
            dqru.x("gaia_email", iIntValue);
        }
        bpaaVar.ap(new dqpn("desktop.gaia_email", 5));
        return bpaaVar;
    }

    public static /* synthetic */ bpaa lambda$upgradeToVersion59600$2(bpaa bpaaVar) {
        int iIntValue = bpab.c().intValue();
        if (iIntValue < 59560) {
            dqru.x("gaia_email", iIntValue);
        }
        bpaaVar.ap(new dqpj("desktop.gaia_email", 1, ""));
        return bpaaVar;
    }

    public static /* synthetic */ bocf lambda$upgradeToVersion59760$2(bsum bsumVar, bocf bocfVar) {
        bocfVar.ap(new dqpk("conversation_participants.participant_id", 1, bsumVar));
        return bocfVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion59760$3(boar boarVar, botl botlVar) {
        botlVar.j(0);
        botlVar.r(boarVar.m());
        return botlVar;
    }

    public static /* synthetic */ bsbx lambda$upgradeToVersion59840$0(bsbx bsbxVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 4000) {
            dqru.x("contact_destination", iIntValue);
        }
        bsbxVar.ap(new dqpn("participants.contact_destination", 6));
        return bsbxVar;
    }

    public static /* synthetic */ btyw lambda$upgradeToVersion60270$0(btyw btywVar) {
        btywVar.b(-1);
        btywVar.ap(new dqty("self_participants.sim_slot_index", 9, 0));
        return btywVar;
    }

    public static /* synthetic */ btyw lambda$upgradeToVersion60270$1(btxd btxdVar, btyw btywVar) {
        btywVar.ap(new dqty("self_participants.sub_id", 7, -1));
        btywVar.ap(new dqty("self_participants.sim_slot_index", 1, Integer.valueOf(btxdVar.k())));
        return btywVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion60370$0(brec brecVar) {
        brecVar.C();
        return brecVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion60450$0(botl botlVar) {
        botlVar.L(cnqj.b(0L));
        return botlVar;
    }

    public static /* synthetic */ brec lambda$upgradeToVersion60480$0(brec brecVar) {
        brecVar.C();
        return brecVar;
    }

    public static /* synthetic */ botl lambda$upgradeToVersion60930$0(botl botlVar) {
        botlVar.n(1);
        return botlVar;
    }

    private void markMessagesAsReadInTelephonyAsync() {
        cqce cqceVar = log;
        cqceVar.p("begin markMessagesAsReadInTelephonyAsync.");
        if (!this.buglePhoneNumberUtils.G()) {
            cqceVar.p("Not default sms app. Cannot mark messages as read in telephony.");
        } else {
            if (!this.permissionChecker.p()) {
                cqceVar.p("No SMS permissions. Cannot mark messages as read in telephony.");
                return;
            }
            cqdf.a(this.context, new bblb(this));
            cqceVar.p("completed markMessagesAsReadInTelephonyAsync.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void markMessagesAsReadInTelephonySync() {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("markMessagesAsReadInTelephonySync");
        bran branVar = MessagesTable.c;
        brao braoVar = branVar.i;
        brdrVarD.c(branVar.o, braoVar);
        brec brecVar = new brec();
        brecVar.O(true);
        brecVar.ac();
        brdrVarD.g(brecVar);
        brdrVarD.d(new brdo(braoVar, false));
        brdrVarD.w(branVar.b);
        brap brapVar = (brap) brdrVarD.b().p();
        while (brapVar.moveToNext()) {
            try {
                ((cmqj) this.telephonyManagerInterface.b()).ac(brapVar.o(), brapVar.l());
            } catch (Throwable th) {
                try {
                    brapVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        brapVar.close();
    }

    private static void potentiallyInvalidateRcsSessionIdsForRcsGroups(dqsy dqsyVar) {
        final ArrayList arrayList = new ArrayList();
        botb botbVarE = botm.e();
        botbVarE.A("potentiallyInvalidateRcsSessionIdsForRcsGroups");
        botbVarE.s();
        bopp boppVar = botm.c;
        botbVarE.c(boppVar.a, boppVar.M);
        botl botlVar = new botl();
        botlVar.j(2);
        botbVarE.k(new botf(botlVar));
        bopr boprVar = (bopr) botbVarE.b().p();
        try {
            HashMap map = new HashMap();
            while (boprVar.moveToNext()) {
                ((List) Map.EL.computeIfAbsent(map, Long.valueOf(boprVar.f()), new Function() { // from class: bbia
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return CustomUpgradeSteps.lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$0((Long) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).add(boprVar.h());
            }
            for (List list : map.values()) {
                if (list.size() > 1) {
                    arrayList.addAll(list);
                }
            }
            boprVar.close();
            if (arrayList.isEmpty()) {
                return;
            }
            dqsyVar.w("OnDeviceDatabaseUpgradeHandler#potentiallyInvalidateRcsSessionIdsForRcsGroups", new Runnable() { // from class: bbib
                @Override // java.lang.Runnable
                public final void run() {
                    CustomUpgradeSteps.lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$1(arrayList);
                }
            });
        } catch (Throwable th) {
            try {
                boprVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void rebuildConversationToParticipantsTable() {
        String[] strArr = boiv.a;
        boil boilVar = new boil();
        boilVar.f("rebuildConversationToParticipantsTable-1");
        boilVar.e();
        boilVar.d();
        boca bocaVarA = bocg.a();
        bocaVarA.A("rebuildConversationToParticipantsTable-2");
        bocaVarA.s();
        boiv.b(0, applyDeduplicationAndConvert(bocaVarA.b().z()));
        bohm[] bohmVarArr = (bohm[]) Collection.EL.stream(getAllRcsGroupConversationsWithJoinedStatus()).map(new Function() { // from class: bbhs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.toOtherConversationToParticipants((bojh) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: bbid
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
        }).map(new Function() { // from class: bbio
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (bohm) ((Optional) obj).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: bbiz
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return CustomUpgradeSteps.lambda$rebuildConversationToParticipantsTable$0(i);
            }
        });
        boiv.b(0, bohmVarArr);
        if (bohmVarArr.length > 0) {
            upgradeRcsGroupsConversationParticipantCount();
        }
    }

    private void safeRebuildConversationToParticipantsTable() {
        try {
            rebuildConversationToParticipantsTable();
        } catch (Exception e) {
            ekrw ekrwVarI = logger.i();
            ekrwVarI.X(eksq.a, "BugleDatabase");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps", "safeRebuildConversationToParticipantsTable", (char) 2087, "CustomUpgradeSteps.java")).q("Failed to rebuild ConversationToParticipantsTable");
        }
    }

    private void sanitizeParticipants() {
        cqce cqceVar = log;
        cqceVar.p("begin sanitizeParticipants.");
        this.sanitizeParticipantsActionFactory.b().z();
        cqceVar.p("completed sanitizeParticipants.");
    }

    private void setThreadArchiveStatusInTelephonyAsync(boolean z) {
        cqce cqceVar = log;
        cqceVar.p("begin setThreadArchiveStatusInTelephonyAsync.");
        if (!this.buglePhoneNumberUtils.G()) {
            cqceVar.p("Not default SMS app. Cannot set thread archive status in telephony.");
        } else {
            if (!this.permissionChecker.p()) {
                cqceVar.p("No SMS permissions. Cannot set thread archive status in telephony.");
                return;
            }
            cqdf.a(this.context, new bblc(this, z));
            cqceVar.p("completed setThreadArchiveStatusInTelephonyAsync.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreadArchiveStatusInTelephonySync(boolean z) {
        String[] strArr = botm.a;
        botl botlVar = new botl();
        if (z) {
            botlVar.d(bvdk.UNARCHIVED);
        } else {
            botlVar.c(bvdk.UNARCHIVED);
        }
        botb botbVarE = botm.e();
        botbVarE.A("setThreadArchiveStatusInTelephonySync");
        botbVarE.g(new Function() { // from class: bbix
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bopp) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botlVar.ap(new dqpn("conversations.sms_thread_id", 6));
        botbVarE.h(botlVar);
        bopr boprVar = (bopr) botbVarE.b().p();
        while (boprVar.moveToNext()) {
            try {
                ((cmqj) this.telephonyManagerInterface.b()).M(boprVar.k(), z);
            } catch (Throwable th) {
                try {
                    boprVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        boprVar.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toConversationParticipantsDeduplicationKey(boar boarVar) {
        return String.valueOf(boarVar.m()) + "|" + boarVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bohm toConversationToParticipants(boar boarVar) {
        String[] strArr = boiv.a;
        bohr bohrVar = new bohr();
        bohrVar.e(boarVar.k());
        bohrVar.c(boarVar.m());
        boarVar.aA(4, "rcs_group_join_status");
        bohrVar.f(boarVar.e);
        boarVar.aA(5, "last_modified_by_key");
        bohrVar.d(boarVar.f);
        return bohrVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Optional<bohm> toOtherConversationToParticipants(bojh bojhVar) throws NumberFormatException {
        String strAf = bojhVar.af();
        if (strAf == null) {
            return Optional.empty();
        }
        final ConversationIdType conversationIdTypeC = bojhVar.C();
        final long j = Long.parseLong(((bbca) this.participantDatabaseOperations.b()).i(bbbd.b(strAf)));
        boca bocaVarA = bocg.a();
        bocaVarA.A("CustomUpgradeSteps#toConversationToParticipants.hasSelfParticipant");
        bocaVarA.d(new Function() { // from class: bbjd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bocf bocfVar = (bocf) obj;
                CustomUpgradeSteps.lambda$toOtherConversationToParticipants$0(conversationIdTypeC, j, bocfVar);
                return bocfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (bocaVarA.b().U()) {
            return Optional.empty();
        }
        String[] strArr = boiv.a;
        bohr bohrVar = new bohr();
        bohrVar.e(j);
        bohrVar.c(conversationIdTypeC);
        bohrVar.f(auej.JOINED);
        return Optional.of(bohrVar.a());
    }

    private static void updateNotNeededMessageSendReportStatusInTransactionPre41040(brdv brdvVar, int i) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("updateNotNeededMessageSendReportStatusInTransactionPre41040");
        brduVar.s(i);
        brduVar.X(new Function() { // from class: bbkm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$updateNotNeededMessageSendReportStatusInTransactionPre41040$0(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.af(brdvVar);
        brduVar.ak();
        brduVar.b().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void upgradeRcsGroups(dqsy dqsyVar) {
        dqsy dqsyVar2;
        log.p("begin upgradeRcsGroups.");
        String[] strArr = botm.a;
        botl botlVar = new botl();
        bopp boppVar = botm.c;
        int i = 0;
        botlVar.ar(new dqxl("$V{J:convo} like $V", new Object[]{boppVar.c, "@rcs.google.com"}));
        botf botfVar = new botf(botlVar);
        String[] strArr2 = MessagesTable.a;
        brdv brdvVar = new brdv(new brec());
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#queryLastMessagesForEachConversation");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("+queryLastMessagesForEachConversation");
            brdrVarD.e(new Function() { // from class: bavi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    cqce cqceVar = baxe.a;
                    return new brao[]{branVar.a, branVar.b, branVar.o};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botb botbVarE = botm.e();
            botbVarE.f(new Function() { // from class: bavj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bopp boppVar2 = (bopp) obj;
                    cqce cqceVar = baxe.a;
                    return new bopq[]{boppVar2.b, boppVar2.c};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.k(botfVar);
            bosz boszVarB = botbVarE.b();
            bopq bopqVar = boppVar.a;
            bran branVar = MessagesTable.c;
            brao braoVar = branVar.b;
            dqtr dqtrVarI = dqts.i(boszVarB, bopqVar, braoVar);
            ((dqos) dqtrVarI).e = "convo";
            brdrVarD.H(dqtrVarI.g());
            brdrVarD.h(new Function() { // from class: bavk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar.ac();
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.k(brdvVar);
            brdrVarD.n(new dqxl("MAX($V)", new Object[]{branVar.i}), "max_timestamp_expression");
            brdrVarD.w(braoVar);
            ekgb ekgbVarZ = brdrVarD.b().z();
            eieuVarK.close();
            int size = ekgbVarZ.size();
            while (i < size) {
                MessagesTable.BindData bindData = (MessagesTable.BindData) ekgbVarZ.get(i);
                bojh bojhVar = (bojh) bindData.ax("conversation", bojh.class);
                Uri uriC = bindData.C();
                if (bojhVar == null || uriC == null) {
                    dqsyVar2 = dqsyVar;
                } else {
                    dqsyVar2 = dqsyVar;
                    fixRcsGroupConversation(dqsyVar2, bindData.D(), bojhVar.N(), bojhVar.Y(), uriC.toString());
                }
                i++;
                dqsyVar = dqsyVar2;
            }
            log.p("completed upgradeRcsGroups.");
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void upgradeRcsGroupsConversationParticipantCount() {
        log.p("begin upgradeRcsGroupsParticipantCount.");
        ekgb ekgbVarU = ((bakt) this.conversationDatabaseOperations.b()).u();
        int i = ((ekoe) ekgbVarU).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((bakt) this.conversationDatabaseOperations.b()).T((ConversationIdType) ekgbVarU.get(i2));
        }
        log.p("completed upgradeRcsGroupsParticipantCount.");
    }

    private void upgradeRcsTelephonyEncoding() {
        int i;
        log.p("begin upgradeRcsTelephonyEncoding.");
        java.util.Map<Long, String> allRcsThreadIdGroupNamePairs = getAllRcsThreadIdGroupNamePairs();
        SparseArray sparseArray = new SparseArray();
        Iterator<Long> it = allRcsThreadIdGroupNamePairs.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Long next = it.next();
            long jLongValue = next.longValue();
            String str = allRcsThreadIdGroupNamePairs.get(next);
            String strC = ((cmqj) this.telephonyManagerInterface.b()).C(jLongValue);
            if (strC != null) {
                if (strC.split(" ").length == 1) {
                    String strTrim = strC.trim();
                    alqm alqmVar = (alqm) ((cmqj) this.telephonyManagerInterface.b()).U(strTrim).get(0);
                    cczv cczvVar = alvx.a;
                    String strB = ejwk.b(alqmVar.k(((Boolean) new alvr().get()).booleanValue()));
                    csrx csrxVar = this.base32Utils;
                    StringTokenizer stringTokenizer = new StringTokenizer(strB, "@");
                    if (!stringTokenizer.hasMoreTokens() || !csrxVar.b(stringTokenizer.nextToken())) {
                        sparseArray.put(Integer.parseInt(strTrim), this.rcsTelephonyStrings.d(strB, str));
                    }
                } else {
                    log.n("An RCS group in threads table exists with multiple recipients, which should only happen in MMS groups.");
                }
            }
        }
        ContentResolver contentResolver = this.context.getContentResolver();
        for (i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            String str2 = (String) sparseArray.get(iKeyAt);
            ContentValues contentValues = new ContentValues(1);
            Uri uriBuild = cmqj.b.buildUpon().appendPath(Integer.toString(iKeyAt)).build();
            contentValues.put("address", this.base32Utils.d(str2));
            ainv ainvVarB = this.timerEventLogger.b("Bugle.Telephony.Update.FieldBulk.Latency");
            int iUpdate = contentResolver.update(uriBuild, contentValues, a.g(iKeyAt, "_id="), null);
            ainvVarB.c();
            if (iUpdate <= 0) {
                cqbd cqbdVarB = log.b();
                cqbdVarB.I("Updating the backup contact address on canonical addresses table failed.");
                cqbdVarB.y("numberOfRowsUpdated", iUpdate);
                cqbdVarB.r();
            }
        }
        log.p("completed upgradeRcsTelephonyEncoding.");
    }

    public void clearOneToOneColumnsForRcsGroups(dqsy dqsyVar) {
        cqce cqceVar = log;
        cqceVar.p("begin clearOneToOneColumnsForRcsGroups.");
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("clearOneToOneColumnsForRcsGroups");
        boteVar.ak();
        boteVar.F(0L);
        ContentValues contentValues = boteVar.a;
        contentValues.putNull("participant_lookup_key");
        contentValues.putNull("participant_normalized_destination");
        botl botlVar = new botl();
        botlVar.j(2);
        boteVar.ac(botlVar);
        int iE = boteVar.b().e();
        if (iE > 0) {
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("cleared 1:1s rcs groups.");
            cqbdVarC.y("count", iE);
            cqbdVarC.r();
        }
        cqceVar.p("completed clearOneToOneColumnsForRcsGroups.");
    }

    public void copySuggestionRcsMessageIdIntoTargetRcsMessageId(dqsy dqsyVar) {
        cqce cqceVar = log;
        cqceVar.p("begin copySuggestionRcsMessageIdIntoTargetRcsMessageId.");
        String[] strArr = bofr.a;
        bofo bofoVar = new bofo();
        bofoVar.ap("copySuggestionRcsMessageIdIntoTargetRcsMessageId");
        bofoVar.ag("target_rcs_message_id", bofr.b.g);
        bofoVar.b().e();
        cqceVar.p("completed copySuggestionRcsMessageIdIntoTargetRcsMessageId.");
    }

    public java.util.Map<Long, String> getAllRcsThreadIdGroupNamePairs() {
        eieu eieuVarK = eiiy.k("CustomUpgradeSteps#getAllRcsThreadIdGroupNamePairs");
        try {
            cqaz.h();
            HashMap map = new HashMap();
            botb botbVarE = botm.e();
            botbVarE.A("getAllRcsThreadIdGroupNamePairs");
            botbVarE.s();
            botl botlVar = new botl();
            botlVar.j(2);
            botbVarE.h(botlVar);
            botbVarE.f(new Function() { // from class: bbic
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return CustomUpgradeSteps.lambda$getAllRcsThreadIdGroupNamePairs$0((bopp) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopr boprVar = (bopr) botbVarE.b().p();
            while (boprVar.moveToNext()) {
                try {
                    long jA = cnqk.a(boprVar.k());
                    String strQ = boprVar.q();
                    if (strQ != null) {
                        map.put(Long.valueOf(jA), strQ);
                    }
                } finally {
                }
            }
            boprVar.close();
            eieuVarK.close();
            return map;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void markUnreadMessagesInReadConversationsAsRead(dqsy dqsyVar) {
        cqce cqceVar = log;
        cqceVar.p("begin markUnreadMessagesInReadConversationsAsRead.");
        bran branVar = MessagesTable.c;
        brao braoVar = branVar.b;
        String string = braoVar.toString();
        brao braoVar2 = branVar.n;
        String string2 = braoVar2.toString();
        String string3 = braoVar.toString();
        String string4 = braoVar.toString();
        String[] strArr = botm.a;
        Cursor cursorE = null;
        try {
            try {
                cursorE = dqsyVar.e("/*EXEMPT-FROM-QUERY-PLAN-CHECK*/SELECT DISTINCT " + string + " FROM messages WHERE " + string2 + "=0 AND " + string3 + " IN ( SELECT " + string4 + " FROM conversations LEFT JOIN messages ON conversations.latest_message_id = " + branVar.a.toString() + " WHERE " + braoVar2.toString() + "=1)", null);
                int count = cursorE.getCount();
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("Found read conversations with unread messages.");
                cqbdVarC.y("countOfConversationIds", count);
                cqbdVarC.r();
                if (count > 0) {
                    ConversationIdType[] conversationIdTypeArr = new ConversationIdType[count];
                    int i = 0;
                    while (cursorE.moveToNext()) {
                        conversationIdTypeArr[i] = barn.b(cursorE.getString(0));
                        i++;
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.markAsReadActionFactory.g(conversationIdTypeArr, bary.a).G(new bbld(countDownLatch));
                    if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                        log.p("Latch timed out waiting for actions.");
                    }
                }
            } catch (InterruptedException e) {
                log.s("Latch await has been interrupted.", e);
            }
            log.p("completed markUnreadMessagesInReadConversationsAsRead.");
        } finally {
            if (cursorE != null) {
                cursorE.close();
            }
        }
    }

    public void potentiallyInvalidateRcsSessionIds(dqsy dqsyVar) {
        invalidateRcsSessionIdsForOneToOne();
        potentiallyInvalidateRcsSessionIdsForRcsGroups(dqsyVar);
        broadcastIncreaseSessionIdIntent();
    }

    public void removeIncompletePaymentMetadataRows(dqsy dqsyVar) {
        cqce cqceVar = log;
        cqceVar.p("begin removeIncompletePaymentMetadataRows.");
        dqsyVar.v("DELETE FROM rbm_payment_request_metadata WHERE conversation_id IS NULL;");
        cqceVar.p("completed removeIncompletePaymentMetadataRows.");
    }

    public void updateConversationOtherParticipantDisplayDestination(dqsy dqsyVar) {
        cqce cqceVar = log;
        cqceVar.p("begin updateConversationOtherParticipantDisplayDestination.");
        String[] strArr = botm.a;
        dqsyVar.v(" UPDATE conversations SET participant_display_destination= ( SELECT display_destination FROM conversations AS c  INNER JOIN participants AS p  ON c.participant_normalized_destination = p.normalized_destination WHERE conversations.participant_normalized_destination = p.normalized_destination)  WHERE " + botm.c.O.toString() + " = 0");
        cqceVar.p("completed updateConversationOtherParticipantDisplayDestination.");
    }

    @bble(a = true)
    void upgradeToVersion10007(dqsy dqsyVar) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion10007");
        bopp boppVar = botm.c;
        boteVar.ag("conv_type", new dqxl("CASE WHEN $V > 1 THEN CASE WHEN $V = $V THEN $V ELSE $V END ELSE $V END", new Object[]{boppVar.D, boppVar.M, -1L, 1, 2, 0}));
        boteVar.b().e();
    }

    @bble(a = true)
    void upgradeToVersion10008(dqsy dqsyVar) {
        upgradeRcsGroups(dqsyVar);
    }

    @bble(a = true)
    void upgradeToVersion10015(dqsy dqsyVar) {
        eieu eieuVarK = eiiy.k("CustomUpgradeSteps#prefillDisambiguationTable");
        try {
            botb botbVarE = botm.e();
            botbVarE.A("upgradeToVersion10015");
            botbVarE.s();
            botbVarE.g(new Function() { // from class: bbiq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bopp) obj).w;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopp boppVar = botm.c;
            botbVarE.n(new dqxl("MIN($V)", new Object[]{boppVar.y}), "min_normalized_destination_expression");
            botbVarE.n(new dqxm("COUNT(*)"), "row_count_expression");
            botbVarE.i(new Function() { // from class: bbir
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    CustomUpgradeSteps.lambda$upgradeToVersion10015$1(botlVar);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.w(boppVar.w);
            bopr boprVar = (bopr) botbVarE.b().p();
            while (boprVar.moveToNext()) {
                try {
                    if (Long.parseLong(boprVar.de("row_count_expression")) == 1) {
                        String[] strArr = bpbc.a;
                        bpai bpaiVar = new bpai();
                        bpaiVar.b(boprVar.s());
                        bpaiVar.c(boprVar.de("min_normalized_destination_expression"));
                        bpaiVar.a().k();
                    }
                } finally {
                }
            }
            boprVar.close();
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

    @bble
    void upgradeToVersion10020(dqsy dqsyVar) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion10020");
        boteVar.ak();
        boteVar.T(-1L);
        boteVar.ad(new Function() { // from class: bbjc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion10020$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iE = boteVar.b().e();
        cqbd cqbdVarD = log.d();
        cqbdVarD.I("Cleared rcs 1:1 conversations.");
        cqbdVarD.y("sessionsCount", iE);
        cqbdVarD.r();
    }

    @bble
    void upgradeToVersion10024(dqsy dqsyVar) {
        upgradeRcsTelephonyEncoding();
    }

    @bble
    void upgradeToVersion10025(dqsy dqsyVar) {
        String[] strArr = botm.a;
        bost bostVar = new bost();
        bostVar.f("upgradeToVersion10025");
        bostVar.a(new Function() { // from class: bbim
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion10025$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bostVar.d();
    }

    @bble
    void upgradeToVersion10028(dqsy dqsyVar) {
        log.p("Will soon update database data for version 10028.");
        clearOneToOneColumnsForRcsGroups(dqsyVar);
    }

    @bble
    void upgradeToVersion10029(dqsy dqsyVar) {
        dqsyVar.v(CREATE_PROXY_TABLE_SQL);
        dqsyVar.v(PROXY_TABLE_PARTICIPANT_ID_INDEX_SQL);
    }

    @bble
    void upgradeToVersion11000(dqsy dqsyVar) {
        dqsyVar.v(CREATE_CONVERSATION_SUGGESTIONS_TABLE_11000);
        dqsyVar.v(CREATE_CONVERSATION_SUGGESTIONS_INDEX_11000);
    }

    @bble(a = true)
    void upgradeToVersion12000(dqsy dqsyVar) {
        copySuggestionRcsMessageIdIntoTargetRcsMessageId(dqsyVar);
    }

    @bble
    void upgradeToVersion12002(dqsy dqsyVar) {
        dqsyVar.v("DROP INDEX index_proxy_state_table_participant_id");
        dqsyVar.v("DROP TABLE proxy_state_table");
    }

    @bble
    void upgradeToVersion12003(dqsy dqsyVar) {
        log.p("Launching full sync as upgrade to version 12003.");
        ((cmqf) this.syncManager.b()).k(enqq.CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_12003);
    }

    @bble
    void upgradeToVersion12004(dqsy dqsyVar) {
        log.p("Will mark messages read in telephony for version 12004.");
        markMessagesAsReadInTelephonyAsync();
    }

    @bble
    void upgradeToVersion12005(dqsy dqsyVar) {
        log.p("Will mark threads archived in telephony for version 12005.");
        setThreadArchiveStatusInTelephonyAsync(true);
    }

    @bble
    void upgradeToVersion13001(dqsy dqsyVar) {
        log.p("Will mark threads unarchived in telephony for version 13001.");
        setThreadArchiveStatusInTelephonyAsync(false);
    }

    @bble
    void upgradeToVersion13030(dqsy dqsyVar) {
        dqsyVar.w("OnDeviceDatabaseUpgradeHandler#upgradeToVersion13030", new Runnable() { // from class: bbhz
            @Override // java.lang.Runnable
            public final void run() {
                CustomUpgradeSteps.lambda$upgradeToVersion13030$0();
            }
        });
    }

    @bble
    void upgradeToVersion13060(dqsy dqsyVar) {
        log.p("Will sanitize participants table for version 13060.");
        sanitizeParticipants();
    }

    @bble(a = true)
    void upgradeToVersion15010(dqsy dqsyVar) {
        updateConversationOtherParticipantDisplayDestination(dqsyVar);
    }

    @bble
    void upgradeToVersion17000(dqsy dqsyVar) {
        String[] strArr = bofr.a;
        dqru.w(dqsyVar, "index_conversation_suggestions_target_rcs_message_id", "CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
    }

    @bble
    void upgradeToVersion19000(dqsy dqsyVar) {
        dqsyVar.v("CREATE TABLE rbm_payment_request_metadata(_id INTEGER PRIMARY KEY AUTOINCREMENT, request_id TEXT NOT NULL, rbm_bot_id TEXT NOT NULL, expiration_time_millis INT DEFAULT(0), is_expired INT DEFAULT(0));");
    }

    @bble
    void upgradeToVersion19010(dqsy dqsyVar) {
        dqsyVar.v("ALTER TABLE rbm_payment_request_metadata ADD COLUMN conversation_id INT REFERENCES conversations(_id) ON DELETE CASCADE;");
    }

    @bble
    void upgradeToVersion19030(dqsy dqsyVar) {
        String[] strArr = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("upgradeToVersion19030");
        bsjhVar.ak();
        bsjhVar.e();
        bsjhVar.b().e();
        PartsTable.f(dqsyVar);
        dqsyVar.v(axie.b);
    }

    @bble(a = true)
    void upgradeToVersion2000(dqsy dqsyVar) {
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("upgradeToVersion2000-participants1");
        bsbsVarF.P(-1);
        bsbsVarF.U(new Function() { // from class: bbig
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion2000$0(-1, bsbxVar);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF.b().e();
        bsbs bsbsVarF2 = ParticipantsTable.f();
        bsbsVarF2.ap("upgradeToVersion2000-participants2");
        bsbsVarF2.P(-2);
        bsbsVarF2.U(new Function() { // from class: bbih
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion2000$1(-2, bsbxVar);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF2.b().e();
    }

    @bble
    void upgradeToVersion20000(dqsy dqsyVar) {
        dqsyVar.v("CREATE TABLE link_preview (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id TEXT NOT NULL REFERENCES messages(_id) ON DELETE CASCADE, trigger_url TEXT NOT NULL, expiration_time_millis INT DEFAULT(0), link_title TEXT, link_description TEXT, link_image_url TEXT, link_domain TEXT, link_canonical_url TEXT);");
    }

    @bble
    void upgradeToVersion20040(dqsy dqsyVar) {
        String[] strArr = bpzx.a;
        dqsyVar.v("DROP TABLE messages_annotations");
        dqsyVar.v("DROP INDEX IF EXISTS index_messages_annotations_message_id");
        bpzx.e(dqsyVar, 20040);
    }

    @bble
    void upgradeToVersion20050(dqsy dqsyVar) {
        markUnreadMessagesInReadConversationsAsRead(dqsyVar);
    }

    @bble(b = true)
    void upgradeToVersion21000(dqsy dqsyVar) {
        bpxj.f(dqsyVar, 21000);
    }

    @bble
    void upgradeToVersion22030(dqsy dqsyVar) {
        dqsyVar.v(axie.h);
    }

    @bble
    void upgradeToVersion24000(dqsy dqsyVar) {
        cqce cqceVar = log;
        cqceVar.p("version 24000 start schema upgrade.");
        bprf.d(dqsyVar, 24000);
        dqsyVar.v("CREATE INDEX index_generic_worker_queue_inflight_retries ON generic_worker_queue(in_flight,retry_count)");
        cqceVar.p("version 24000 apply triggers to schema.");
        dqsyVar.v("CREATE TRIGGER on_conversations_insert AFTER INSERT ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,NEW._id); END");
        dqsyVar.v("CREATE TRIGGER on_messages_insert AFTER INSERT ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,NEW._id); END");
        dqsyVar.v("CREATE TRIGGER on_participants_insert AFTER INSERT ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,NEW._id); END");
        cqceVar.p("version 24000 OnPostInsert triggers done.");
        dqsyVar.v("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
        dqsyVar.v("CREATE TRIGGER on_messages_update AFTER UPDATE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,OLD._id); END");
        dqsyVar.v("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        cqceVar.p("version 24000 OnPostUpdate triggers done.");
        dqsyVar.v("CREATE TRIGGER on_conversations_delete AFTER DELETE ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
        dqsyVar.v("CREATE TRIGGER on_messages_delete AFTER DELETE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,1,OLD._id); END");
        dqsyVar.v("CREATE TRIGGER on_participants_delete AFTER DELETE ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        removeIncompletePaymentMetadataRows(dqsyVar);
    }

    @bble(b = true)
    void upgradeToVersion24050(dqsy dqsyVar) {
        String[] strArr = bpbc.a;
        bpau bpauVar = new bpau();
        bpauVar.f("upgradeToVersion24050");
        bpauVar.b = new bpba((bpbb) new Function() { // from class: bbju
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpbb bpbbVar = (bpbb) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion24050$0(bpbbVar);
                return bpbbVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bpbb()));
        bpauVar.d();
        dqru.K(dqsyVar, "disambiguations", bpbc.b("TEMP___disambiguations"), bpbc.a, bpbc.c());
    }

    @bble
    void upgradeToVersion24100(dqsy dqsyVar) {
        dqsyVar.v(axie.g);
    }

    @bble
    void upgradeToVersion25000(dqsy dqsyVar) {
        cqce cqceVar = log;
        cqceVar.p("begin enqueueRcsLocationsForAnnotations.");
        String[] strArr = bprf.a;
        bsgr bsgrVar = PartsTable.d;
        dqsyVar.v("INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT DISTINCT 2,1," + bsgrVar.b.toString() + " FROM parts WHERE " + bsgrVar.f.toString() + " = 'application/vnd.gsma.rcspushlocation+xml';");
        cqceVar.p("begin enqueueRcsLocationsForAnnotations.");
    }

    @bble
    void upgradeToVersion25020(dqsy dqsyVar) {
        bbml bbmlVar = bbml.UPDATE;
        dqsyVar.v("DROP TRIGGER IF EXISTS ".concat(bbmj.e(1, bbmlVar.name())));
        dqsyVar.v("DROP TRIGGER IF EXISTS ".concat(bbmj.e(3, bbmlVar.name())));
        dqsyVar.v("DROP TRIGGER IF EXISTS ".concat(bbmj.e(2, bbmlVar.name())));
        dqsyVar.v("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,3,OLD._id); END");
        dqsyVar.v("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (3,2,OLD._id); END");
    }

    @bble
    void upgradeToVersion25030(dqsy dqsyVar) {
        dqsyVar.v("DROP TRIGGER IF EXISTS ".concat(bbmj.e(1, bbml.UPDATE.name())));
    }

    @bble
    void upgradeToVersion26060(dqsy dqsyVar) {
        huaweiMate20UpgradeCleardata();
        fixLegacyResourceUris();
    }

    @bble(a = true)
    void upgradeToVersion27000(dqsy dqsyVar) {
        dqsyVar.v(axie.c);
        copyBlobIdIntoCompressedBlobId();
    }

    @bble
    void upgradeToVersion27010(dqsy dqsyVar) {
        dqsyVar.v("CREATE TRIGGER on_messages_annotations_insert AFTER INSERT ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,NEW._id); END");
        dqsyVar.v("CREATE TRIGGER on_messages_annotations_update AFTER UPDATE ON messages_annotations WHEN OLD.message_id != NEW.message_id OR OLD.annotation_details != NEW.annotation_details OR OLD.annotation_type != NEW.annotation_type BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,OLD._id); END");
        dqsyVar.v("CREATE TRIGGER on_messages_annotations_delete AFTER DELETE ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (1,4,OLD._id); END");
        String[] strArr = bprf.a;
        bpzc bpzcVar = bpzx.c;
        String string = bpzcVar.a.toString();
        bpzd bpzdVar = bpzcVar.d;
        dqsyVar.v("INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT DISTINCT 1,4," + string + " FROM messages_annotations WHERE " + bpzdVar.toString() + " = " + eyzy.LINK_ANNOTATION.a() + " OR " + bpzdVar.toString() + " = " + eyzy.ADDRESS_ANNOTATION.a() + ";");
    }

    @bble
    void upgradeToVersion29000(dqsy dqsyVar) {
        String[] strArr = btgv.a;
        dqsyVar.v("DROP TABLE IF EXISTS recent_stickers");
        String[] strArr2 = bufg.a;
        dqsyVar.v("DROP TABLE IF EXISTS sticker_sets_localization");
        String[] strArr3 = buid.a;
        dqsyVar.v("DROP TABLE IF EXISTS stickers_localization");
        String[] strArr4 = bugy.a;
        dqsyVar.v("DROP TABLE IF EXISTS sticker_sets");
        String[] strArr5 = bujn.a;
        dqsyVar.v("DROP TABLE IF EXISTS stickers");
        dqsyVar.v("DROP INDEX IF EXISTS index_stickers_sticker_set_id");
        String[] strArr6 = PartsTable.a;
        bsix bsixVar = new bsix();
        bsixVar.e();
        bsixVar.f("upgradeToVersion29000");
        bsixVar.a(new Function() { // from class: bbkk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion29000$0(bsjlVar);
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsixVar.d();
        String[] strArr7 = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion29000");
        boteVar.ak();
        boteVar.t();
        boteVar.ad(new Function() { // from class: bbkl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion29000$1(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar.b().e();
    }

    @bble
    void upgradeToVersion29010(dqsy dqsyVar) {
        dqsyVar.v("DROP TRIGGER IF EXISTS participantsCorpus_delete_trigger_appdatasearch;");
        dqsyVar.v("DROP TRIGGER IF EXISTS participantsCorpus_insert_trigger_appdatasearch;");
        dqsyVar.v("DROP TRIGGER IF EXISTS participantsCorpus_update_trigger_appdatasearch;");
        dqsyVar.v("DROP TRIGGER IF EXISTS partsCorpus_delete_trigger_appdatasearch;");
        dqsyVar.v("DROP TRIGGER IF EXISTS partsCorpus_insert_trigger_appdatasearch;");
        dqsyVar.v("DROP TRIGGER IF EXISTS partsCorpus_update_trigger_appdatasearch;");
        dqsyVar.v("DROP TRIGGER IF EXISTS messagesCorpus_delete_trigger_appdatasearch;");
        dqsyVar.v("DROP TRIGGER IF EXISTS messagesCorpus_insert_trigger_appdatasearch;");
        dqsyVar.v("DROP TRIGGER IF EXISTS messagesCorpus_update_trigger_appdatasearch;");
        dqsyVar.v("DROP TABLE IF EXISTS partsCorpus_seqno_table_appdatasearch;");
        dqsyVar.v("DROP TABLE IF EXISTS messagesCorpus_seqno_table_appdatasearch;");
        dqsyVar.v("DROP TABLE IF EXISTS participantsCorpus_seqno_table_appdatasearch;");
    }

    @bble(a = true)
    void upgradeToVersion29050(dqsy dqsyVar) {
        String[] strArr = btyx.a;
        dqtq dqtqVar = new dqtq("self_participants", "$primary");
        btyb btybVar = btyx.c;
        dqtqVar.b(btybVar.b, btybVar.d, btybVar.e, btybVar.f, btybVar.g, btybVar.h);
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("upgradeToVersion29050");
        bsboVarE.e(new Function() { // from class: bbie
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$upgradeToVersion29050$0((brzh) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.h(new Function() { // from class: bbif
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion29050$1(bsbxVar);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtqVar.c = bsboVarE.b();
        dqtqVar.a().a();
    }

    @bble(a = true)
    void upgradeToVersion29060(dqsy dqsyVar) {
        String[] strArr = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("upgradeToVersion29060");
        bsjhVar.ag("storage_uri", PartsTable.d.e);
        bsjhVar.b().e();
    }

    @bble
    void upgradeToVersion29070(dqsy dqsyVar) {
        dqsyVar.v("DROP TRIGGER IF EXISTS on_messages_update_enqueue_worker");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_conversations_update_enqueue_worker");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_participants_update_enqueue_worker");
    }

    @bble
    void upgradeToVersion30030(dqsy dqsyVar) {
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("upgradeToVersion30030-parts");
        bsjeVarC.f(new Function() { // from class: bbkq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bsgr) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.h(new Function() { // from class: bbks
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion30030$1(bsjlVar);
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bsjc bsjcVarB = bsjeVarC.b();
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("upgradeToVersion30030-messages");
        brduVar.q(true);
        brduVar.X(new Function() { // from class: bbkt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion30030$2(bsjcVarB, brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.ak();
        brduVar.b().e();
    }

    @bble(b = true)
    void upgradeToVersion30050(dqsy dqsyVar) {
        dqru.K(dqsyVar, "verified_sms_senders", bvbu.c("TEMP___verified_sms_senders"), bvbu.a, bvbu.d());
    }

    @bble(a = true)
    void upgradeToVersion3010(dqsy dqsyVar) {
        String[] strArr = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("upgradeToVersion3010");
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.f(new Function() { // from class: bbkx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).i;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: bbky
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion3010$1(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjhVar.ag("timestamp", brdrVarD.b());
        bsjhVar.b().e();
        dqsyVar.v(axie.a);
        dqsyVar.v(axie.d);
    }

    @bble
    void upgradeToVersion32040(dqsy dqsyVar) {
        String[] strArr = bprf.a;
        dqsyVar.v("CREATE INDEX index_generic_worker_queue_worker_table_itemId ON generic_worker_queue(worker_type,item_table_type,item_id)");
        dqsyVar.v("UPDATE generic_worker_queue SET in_flight = 0 WHERE in_flight = 'false'");
        dqsyVar.v("UPDATE generic_worker_queue SET in_flight = 1 WHERE in_flight = 'true'");
    }

    @bble
    void upgradeToVersion33050(dqsy dqsyVar) {
        dqsyVar.v("DROP VIEW IF EXISTS conversation_list_view");
    }

    @bble
    void upgradeToVersion34010(dqsy dqsyVar) {
        String[] strArr = btkh.a;
        dqsyVar.v("DROP TABLE IF EXISTS remote_instances");
        btkh.d(dqsyVar, 34010);
    }

    @bble
    void upgradeToVersion35000(dqsy dqsyVar) {
        String[] strArr = MessagesTable.a;
        dqru.w(dqsyVar, "index_messages_cms_id", "CREATE UNIQUE INDEX index_messages_cms_id ON messages(cms_id);");
        String[] strArr2 = ParticipantsTable.a;
        dqru.w(dqsyVar, "index_participants_cms_id", "CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
        fixSpamWarningForOlderReports();
    }

    @bble(a = true)
    void upgradeToVersion35070(dqsy dqsyVar) {
        String[] strArr = btin.a;
        btik btikVar = new btik();
        btikVar.ap("upgradeToVersion35070");
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.f(new Function() { // from class: bbje
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: bbjf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion35070$1(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btikVar.ag("conversation_id", brdrVarD.b());
        btikVar.b().e();
    }

    @bble
    void upgradeToVersion37050(dqsy dqsyVar) {
        potentiallyInvalidateRcsSessionIds(dqsyVar);
    }

    @bble(a = true)
    void upgradeToVersion39020(dqsy dqsyVar) {
        dqsyVar.v("DROP TRIGGER IF EXISTS on_conversations_insert");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_messages_insert");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_participants_insert");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_messages_annotations_insert");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_conversations_update");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_participants_update");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_messages_annotations_update");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_conversations_delete");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_messages_delete");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_participants_delete");
        dqsyVar.v("DROP TRIGGER IF EXISTS on_messages_annotations_delete");
        dqsyVar.v("CREATE TRIGGER on_conversations_insert AFTER INSERT ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,NEW._id; END");
        dqsyVar.v("CREATE TRIGGER on_messages_insert AFTER INSERT ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,1,NEW._id; END");
        dqsyVar.v("CREATE TRIGGER on_participants_insert AFTER INSERT ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,NEW._id; END");
        dqsyVar.v("CREATE TRIGGER on_messages_annotations_insert AFTER INSERT ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,NEW._id; END");
        dqsyVar.v("CREATE TRIGGER on_conversations_update AFTER UPDATE ON conversations WHEN OLD.name != NEW.name BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,OLD._id; END");
        dqsyVar.v("CREATE TRIGGER on_participants_update AFTER UPDATE ON participants WHEN OLD.full_name != NEW.full_name OR OLD.lookup_key != NEW.lookup_key OR OLD.display_destination != NEW.display_destination OR OLD.normalized_destination != NEW.normalized_destination BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,OLD._id; END");
        dqsyVar.v("CREATE TRIGGER on_messages_annotations_update AFTER UPDATE ON messages_annotations WHEN OLD.message_id != NEW.message_id OR OLD.annotation_details != NEW.annotation_details OR OLD.annotation_type != NEW.annotation_type BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,OLD._id; END");
        dqsyVar.v("CREATE TRIGGER on_conversations_delete AFTER DELETE ON conversations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,2,OLD._id; END");
        dqsyVar.v("CREATE TRIGGER on_messages_delete AFTER DELETE ON messages BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,1,OLD._id; END");
        dqsyVar.v("CREATE TRIGGER on_participants_delete AFTER DELETE ON participants BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 3,3,OLD._id; END");
        dqsyVar.v("CREATE TRIGGER on_messages_annotations_delete AFTER DELETE ON messages_annotations BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) SELECT 1,4,OLD._id; END");
    }

    @bble
    void upgradeToVersion39035(dqsy dqsyVar) {
        potentiallyInvalidateRcsSessionIds(dqsyVar);
    }

    @bble
    void upgradeToVersion40000(dqsy dqsyVar) {
        potentiallyInvalidateRcsSessionIds(dqsyVar);
    }

    @bble(a = true)
    void upgradeToVersion4020(dqsy dqsyVar) {
        int[] iArr = {100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107};
        for (int i = 0; i < 8; i++) {
            final int i2 = iArr[i];
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.ap("upgradeToVersion4020");
            brduVar.U(i2);
            brduVar.X(new Function() { // from class: bbii
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    CustomUpgradeSteps.lambda$upgradeToVersion4020$0(i2, brecVar);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brduVar.b().e();
        }
    }

    @bble(a = true)
    void upgradeToVersion41040(dqsy dqsyVar) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("upgradeToVersion41040");
        brduVar.ag("rcs_message_id_with_text_type", new dqxl("rcs_message_id", new Object[0]));
        brduVar.b().e();
        dqsyVar.v("UPDATE messages SET rcs_message_id = NULL");
        budf budfVarA = budi.a();
        budfVarA.A("upgradeToVersion41040");
        budfVarA.k(new budg((budh) new Function() { // from class: bbiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                budh budhVar = (budh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion41040$0(budhVar);
                return budhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new budh())));
        if (budfVarA.b().U()) {
            dqsyVar.v("DROP TRIGGER IF EXISTS on_messages_update_bkr");
            dqsyVar.v("CREATE TRIGGER on_messages_update_bkr AFTER UPDATE ON messages WHEN (OLD.sender_id IS NOT NEW.sender_id) OR (OLD.message_protocol IS NOT NEW.message_protocol) OR (OLD.mms_subject IS NOT NEW.mms_subject) OR (OLD.mms_transaction_id IS NOT NEW.mms_transaction_id) OR (OLD.mms_expiry IS NOT NEW.mms_expiry) OR (OLD.mms_retrieve_text IS NOT NEW.mms_retrieve_text) OR (OLD.cloud_sync_id IS NOT NEW.cloud_sync_id) OR (OLD.rcs_message_id_with_text_type IS NOT NEW.rcs_message_id_with_text_type) OR (OLD.etouffee_status IS NOT NEW.etouffee_status) OR (OLD.rcs_file_transfer_session_id IS NOT NEW.rcs_file_transfer_session_id) OR (OLD.sms_error_code IS NOT NEW.sms_error_code) OR (OLD.correlation_id IS NOT NEW.correlation_id) BEGIN INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id,account_id,flags) SELECT 32,5,OLD._id,IFNULL((SELECT linked_account.account_id FROM linked_account WHERE linked_account.account_id IS NOT NULL LIMIT 1),-1),4; END");
        }
    }

    @bble
    void upgradeToVersion42040(dqsy dqsyVar) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion42040#update");
        boteVar.ad(new Function() { // from class: bbkg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar.h(bvdk.BLOCKED_FOLDER);
        boteVar.b().e();
        botb botbVarE = botm.e();
        botbVarE.A("upgradeToVersion42040");
        botbVarE.i(new Function() { // from class: bbkr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$1(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.f(new Function() { // from class: bbkz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$upgradeToVersion42040$2((bopp) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopr boprVar = (bopr) botbVarE.b().p();
        while (boprVar.moveToNext()) {
            try {
                try {
                    ConversationIdType conversationIdTypeH = boprVar.h();
                    final String strT = boprVar.t();
                    if (!conversationIdTypeH.b() && !TextUtils.isEmpty(strT)) {
                        bsbo bsboVarE = ParticipantsTable.e();
                        bsboVarE.A("upgradeToVersion42040-participants");
                        bsboVarE.h(new Function() { // from class: bbla
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsbx bsbxVar = (bsbx) obj;
                                CustomUpgradeSteps.lambda$upgradeToVersion42040$3(strT, bsbxVar);
                                return bsbxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsboVarE.e(new Function() { // from class: bbht
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return CustomUpgradeSteps.lambda$upgradeToVersion42040$4((brzh) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brzj brzjVar = (brzj) bsboVarE.b().p();
                        try {
                            if (brzjVar.moveToNext()) {
                                if (brzjVar.s() && csdm.a(brzjVar.c()).e()) {
                                    arrayList2.add(conversationIdTypeH);
                                } else if (brzjVar.r()) {
                                    arrayList.add(conversationIdTypeH);
                                }
                            }
                            brzjVar.close();
                        } catch (Throwable th) {
                            try {
                                brzjVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (Exception unused) {
                    log.n("Failed to determine if participant's conversation should be moved");
                }
            } catch (Throwable th3) {
                try {
                    boprVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        boprVar.close();
        bote boteVar2 = new bote();
        boteVar2.ap("upgradeToVersion42040#update2");
        boteVar2.ad(new Function() { // from class: bbhu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$5(arrayList, botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar2.h(bvdk.BLOCKED_FOLDER);
        boteVar2.b().e();
        bote boteVar3 = new bote();
        boteVar3.ap("upgradeToVersion42040-conversations#update");
        boteVar3.ad(new Function() { // from class: bbhv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$6(arrayList2, botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar3.h(bvdk.SPAM_FOLDER);
        boteVar3.b().e();
    }

    @bble(a = true)
    void upgradeToVersion45000(dqsy dqsyVar) {
        dqsyVar.w("OnDeviceDatabaseUpgradeHandler#upgradeToVersion45000", new Runnable() { // from class: bbjg
            @Override // java.lang.Runnable
            public final void run() {
                CustomUpgradeSteps.lambda$upgradeToVersion45000$0();
            }
        });
    }

    @bble(a = true)
    void upgradeToVersion46070(dqsy dqsyVar) {
        String[] strArr = cbfi.a;
        cbff cbffVar = new cbff();
        cbffVar.al();
        cbffVar.ap("upgradeToVersion46070");
        cbffVar.ak();
        Date date = new Date(0L);
        int iIntValue = cbfi.c().intValue();
        int iIntValue2 = cbfi.c().intValue();
        if (iIntValue2 < 46070) {
            dqru.x("minimum_start_time", iIntValue2);
        }
        if (iIntValue >= 46070) {
            cbffVar.a.put("minimum_start_time", Long.valueOf(barp.a(date)));
        }
        cbffVar.b().e();
    }

    @bble(a = true)
    void upgradeToVersion49000(dqsy dqsyVar) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion49000");
        boteVar.ak();
        boteVar.ad(new Function() { // from class: bbiy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion49000$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar.A(4);
        boteVar.b().e();
    }

    @bble(a = true)
    void upgradeToVersion5000(dqsy dqsyVar) {
        dqsyVar.v(axie.i);
    }

    @bble
    void upgradeToVersion51020(dqsy dqsyVar) {
        String[] strArr = bswf.a;
        dqsyVar.v("DROP TABLE IF EXISTS rbm_business_info_properties");
        bswf.d(dqsyVar, 51020);
    }

    @bble(b = true)
    void upgradeToVersion52010(dqsy dqsyVar) {
        String[] strArr = bsyn.a;
        bsyd bsydVar = new bsyd();
        bsydVar.f("upgradeToVersion52010-rbmbusinfo");
        bsydVar.e();
        bsydVar.d();
        dqru.K(dqsyVar, "rbm_business_info", bsyn.f(52010, "TEMP___rbm_business_info"), bsyn.a, bsyn.i());
        String[] strArr2 = bszx.a;
        bszn bsznVar = new bszn();
        bsznVar.f("upgradeToVersion52010-rbmbusverifier");
        bsznVar.e();
        bsznVar.d();
        dqru.K(dqsyVar, "rbm_business_verifier_info", bszx.b("TEMP___rbm_business_verifier_info"), bszx.a, bszx.c());
    }

    @bble
    void upgradeToVersion52020(dqsy dqsyVar) {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("upgradeToVersion52020-participants");
        bsboVarE.s();
        bsboVarE.e(new Function() { // from class: bbij
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$upgradeToVersion52020$0((brzh) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.h(new Function() { // from class: bbik
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion52020$1(bsbxVar);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brzj brzjVar = (brzj) bsboVarE.b().p();
        while (brzjVar.moveToNext()) {
            try {
                Uri uriF = brzjVar.f();
                if (uriF != null) {
                    Uri uriBuild = uriF.buildUpon().appendQueryParameter("v", Boolean.TRUE.toString()).build();
                    String strO = brzjVar.o();
                    bsbs bsbsVarF = ParticipantsTable.f();
                    bsbsVarF.ap("upgradeToVersion52020-participants#update");
                    bsbsVarF.M(uriBuild);
                    bsbsVarF.e(strO);
                }
            } catch (Throwable th) {
                try {
                    brzjVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        brzjVar.close();
    }

    @bble
    void upgradeToVersion53000(dqsy dqsyVar) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("upgradeToVersion53000");
        brdrVarD.e(new Function() { // from class: bbhw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CustomUpgradeSteps.lambda$upgradeToVersion53000$0((bran) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: bbhx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$1(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final brdp brdpVarB = brdrVarD.b();
        String[] strArr = buyx.a;
        buym buymVar = new buym();
        buymVar.f("upgradeToVersion53000");
        buymVar.e();
        buymVar.b = new buyv((buyw) new Function() { // from class: bbhy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buyw buywVar = (buyw) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$4(brdpVarB, buywVar);
                return buywVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new buyw()));
        int iD = buymVar.d();
        cqbd cqbdVarA = log.a();
        cqbdVarA.I("Deleted");
        cqbdVarA.G(iD);
        cqbdVarA.I("rows from UserReferenceTable for upgrade to 53000");
        cqbdVarA.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @bble(b = true)
    void upgradeToVersion53020(dqsy dqsyVar) {
        bukt.b(dqsyVar);
        dqru.K(dqsyVar, "conversation_labels", bnxi.c(53020, "TEMP___conversation_labels"), bnxi.a, bnxi.e(53020));
        ekgb ekgbVarU = ekgb.u(SuperSortLabel.PERSONAL, SuperSortLabel.TRANSACTION, SuperSortLabel.PROMOTION, SuperSortLabel.UPDATE);
        int i = ((ekoe) ekgbVarU).c;
        for (int i2 = 0; i2 < i; i2++) {
            SuperSortLabel superSortLabel = (SuperSortLabel) ekgbVarU.get(i2);
            int i3 = superSortLabel.i;
            bujw bujwVar = new bujw();
            bujwVar.c(i3);
            bujwVar.d(superSortLabel.toString());
            bujwVar.e(buku.NO_CHANGE);
            bujwVar.b();
        }
    }

    @bble(a = true)
    void upgradeToVersion53070(dqsy dqsyVar) {
        String[] strArr = bukt.a;
        bujw bujwVar = new bujw();
        SuperSortLabel superSortLabel = SuperSortLabel.OTP;
        bujwVar.c(superSortLabel.i);
        bujwVar.d(superSortLabel.toString());
        bujwVar.e(buku.NO_CHANGE);
        bujwVar.b();
    }

    @bble(b = true)
    void upgradeToVersion54030(dqsy dqsyVar) {
        dqru.K(dqsyVar, "message_reactions", bqkl.d(54030, "TEMP___message_reactions"), bqkl.a, bqkl.g(54030));
    }

    @bble(b = true)
    void upgradeToVersion54050(dqsy dqsyVar) {
        bpxj.f(dqsyVar, 54050);
    }

    @bble(b = true)
    void upgradeToVersion54060(dqsy dqsyVar) {
        dqru.K(dqsyVar, "smarts_personalization_features", brhv.d(54060, "TEMP___smarts_personalization_features"), brhv.a, brhv.f(54060));
    }

    @bble(b = true)
    void upgradeToVersion55000(dqsy dqsyVar) {
        dqru.K(dqsyVar, "message_spam", bqrg.d(55000, "TEMP___message_spam"), bqrg.a, bqrg.f(55000));
    }

    @bble(a = true, b = true)
    void upgradeToVersion55010(dqsy dqsyVar) {
        ParticipantsTable.n(dqsyVar, 55010);
        axjq.c();
        dqsyVar.v("CREATE TRIGGER participants_IS_NOT_EMPTY_TRIGER AFTER UPDATE ON participants WHEN NOT( OLD.is_valid_phone_number_data ) AND NEW.send_destination IS NOT NULL AND NEW.display_destination IS NOT NULL AND NEW.normalized_destination IS NOT NULL AND length(NEW.send_destination ) > 0  AND length(NEW.display_destination ) > 0  AND length(NEW.normalized_destination) > 0  BEGIN UPDATE participants  SET is_valid_phone_number_data = 1  WHERE rowid=NEW.rowid; END;");
        if (((Boolean) axjr.a.e()).booleanValue()) {
            bsbs bsbsVarF = ParticipantsTable.f();
            bsbsVarF.ap("upgradeToVersion55010");
            bsbsVarF.x(true);
            bsbsVarF.b().e();
        }
    }

    @bble(b = true)
    void upgradeToVersion56030(dqsy dqsyVar) {
        dqsyVar.v("DROP TABLE IF EXISTS rbm_payment_request_metadata;");
    }

    @bble(a = true)
    void upgradeToVersion56050(dqsy dqsyVar) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("upgradeToVersion56050");
        brdrVarD.s();
        brec brecVar = new brec();
        brecVar.J(3);
        brdrVarD.g(brecVar);
        brdrVarD.c(MessagesTable.c.a);
        brap brapVar = (brap) brdrVarD.b().p();
        try {
            ArrayList arrayList = new ArrayList(100);
            caxr caxrVar = new caxr();
            caxrVar.c = Duration.ofSeconds(10L);
            cbog cbogVarA = caxrVar.a();
            while (brapVar.moveToNext()) {
                MessageIdType messageIdTypeQ = brapVar.q();
                if (!messageIdTypeQ.c()) {
                    arrayList.add(messageIdTypeQ);
                    if (arrayList.size() == 100) {
                        cjpw cjpwVar = this.markRcsMessagesInTelephonyQueue;
                        cjpu cjpuVar = (cjpu) cjpv.a.createBuilder();
                        cjpuVar.a((Iterable) Collection.EL.stream(arrayList).map(new Function() { // from class: bbjq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((MessageIdType) obj).b();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: bbjr
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        })));
                        cjpwVar.a((cjpv) cjpuVar.build(), cbogVarA);
                        arrayList.clear();
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                cjpw cjpwVar2 = this.markRcsMessagesInTelephonyQueue;
                cjpu cjpuVar2 = (cjpu) cjpv.a.createBuilder();
                cjpuVar2.a((Iterable) Collection.EL.stream(arrayList).map(new Function() { // from class: bbjs
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessageIdType) obj).b();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bbjr
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
                cjpwVar2.a((cjpv) cjpuVar2.build(), cbogVarA);
            }
            brapVar.close();
        } catch (Throwable th) {
            try {
                brapVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @bble(a = true)
    void upgradeToVersion58020(dqsy dqsyVar) {
        String[] strArr = ScheduledSendTable.a;
        cmcq cmcqVar = new cmcq();
        cmcqVar.ap("upgradeToVersion58020");
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.f(new Function() { // from class: bbjh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).g;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: bbji
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion58020$1(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cmcqVar.ag("creation_time", brdrVarD.b());
        cmcqVar.b().e();
    }

    @bble
    void upgradeToVersion58260(dqsy dqsyVar) {
        ((cazj) this.cmsBackFillBnrStateForFiMdQueue.a.b()).a(cbcu.f("cms_back_fill_bnr_state_for_fi_md", caxy.a));
    }

    @bble(a = true)
    void upgradeToVersion58290(dqsy dqsyVar) {
        dqsyVar.v("DROP INDEX IF EXISTS index_scheduled_send_scheduled_time");
    }

    @bble(a = true)
    void upgradeToVersion58570(dqsy dqsyVar) {
        bocd bocdVarB = bocg.b();
        bocdVarB.ap("upgradeToVersion58570");
        bocdVarB.ak();
        bocdVarB.c(auej.JOINED);
        bocdVarB.b().e();
    }

    @bble(a = true)
    void upgradeToVersion58650(dqsy dqsyVar) {
        String[] strArr = bukt.a;
        bukl buklVar = new bukl();
        buklVar.f("upgradeToVersion58650");
        buklVar.b = new bukr((buks) new Function() { // from class: bbjz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buks buksVar = (buks) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion58650$0(buksVar);
                return buksVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new buks()));
        buklVar.d();
    }

    @bble(a = true)
    void upgradeToVersion58990(dqsy dqsyVar) {
        dqsyVar.v(new String(Base64.decode("RFJPUCBUQUJMRSBJRiBFWElTVFMgdm9pY2VfdHJhbnNjcmlwdGlvbnM=", 0)));
    }

    @bble
    void upgradeToVersion59090(dqsy dqsyVar) {
        if (craf.g) {
            log.p("Running a one-time sync.");
            auvh.h(((cmqf) this.syncManager.b()).f(enqq.CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_59090));
        }
    }

    @bble(a = true)
    void upgradeToVersion59130(dqsy dqsyVar) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion59130");
        boteVar.ag("new_duplicate_of", botm.c.ai);
        boteVar.ag("duplicate_of", new dqxl("null", new Object[0]));
        boteVar.b().e();
    }

    @bble(a = true)
    void upgradeToVersion59320(dqsy dqsyVar) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion59320");
        boteVar.ad(new Function() { // from class: bbkj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59320$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar.ak();
        boteVar.y(true);
        boteVar.b().e();
    }

    @bble(a = true)
    void upgradeToVersion59480(dqsy dqsyVar) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("upgradeToVersion59480");
        brduVar.ag("self_id", new dqxl("sender_id", new Object[0]));
        brduVar.X(new Function() { // from class: bbkc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59480$0(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.b().e();
    }

    @bble(a = false)
    void upgradeToVersion59500(dqsy dqsyVar) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("upgradeToVersion59500");
        brduVar.ak();
        brduVar.J(new baro(null));
        brduVar.X(new Function() { // from class: bbkw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59500$0(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.b().e();
    }

    @bble(a = false)
    void upgradeToVersion59600(dqsy dqsyVar) {
        String[] strArr = bpab.a;
        bozp bozpVar = new bozp();
        bozpVar.f("upgradeToVersion59600");
        bozpVar.c(new Function() { // from class: bbjb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar = (bpaa) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59600$0(bpaaVar);
                return bpaaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bozpVar.b().b();
    }

    @bble
    void upgradeToVersion59680(dqsy dqsyVar) {
        dqsyVar.v("DROP TRIGGER IF EXISTS group_conversation_participants_insert_audit_log;");
        dqsyVar.v("DROP TRIGGER IF EXISTS group_conversation_participants_update_audit_log;");
        dqsyVar.v("DROP TRIGGER IF EXISTS group_conversation_participants_delete_audit_log;");
        dqsyVar.v("DROP TABLE IF EXISTS group_conversation_participants_audit_log;");
    }

    @bble
    void upgradeToVersion59740(dqsy dqsyVar) {
        cqce cqceVar = log;
        cqceVar.p("begin removeRowsNeedingUnpairing.");
        dqsyVar.v("DELETE FROM desktop WHERE needs_unpairing = 1;");
        cqceVar.p("completed removeRowsNeedingUnpairing.");
    }

    @bble(a = true)
    void upgradeToVersion59760(dqsy dqsyVar) {
        bsun bsunVarA = ProfilesTable.a();
        bsunVarA.A("upgradeToVersion59760-profiles");
        bsunVarA.d(new Function() { // from class: bbkd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bstj) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.h(new Function() { // from class: bbke
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.q();
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbm bsbmVarB = bsboVarE.b();
        brzi brziVar = ParticipantsTable.c.a;
        bstk bstkVar = ProfilesTable.c.b;
        bsunVarA.F(dqts.i(bsbmVarB, brziVar, bstkVar).g());
        bsunVarA.A("upgradeToVersion59760");
        final bsum bsumVarB = bsunVarA.b();
        boca bocaVarA = bocg.a();
        bocaVarA.A("upgradeToVersion59760-conversationparticipants");
        bsun bsunVarA2 = ProfilesTable.a();
        bsunVarA2.d(new Function() { // from class: bbkf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bstj) obj).i;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bocaVarA.F(dqts.i(bsunVarA2.b(), bstkVar, bocg.c.c).g());
        bocaVarA.d(new Function() { // from class: bbkh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bocf bocfVar = (bocf) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59760$2(bsumVarB, bocfVar);
                return bocfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bobl boblVar = (bobl) bocaVarA.b().p();
        while (boblVar.moveToNext()) {
            try {
                final boar boarVar = (boar) boblVar.cQ();
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) boarVar.ax("profiles_table", ProfilesTable.BindData.class);
                if (bindData != null && !TextUtils.isEmpty(bindData.v())) {
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.ap("upgradeToVersion59760-conversations");
                    String strV = bindData.v();
                    strV.getClass();
                    boteVar.ab(chsk.a(strV));
                    boteVar.ad(new Function() { // from class: bbki
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            CustomUpgradeSteps.lambda$upgradeToVersion59760$3(boarVar, botlVar);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    boteVar.b().e();
                }
            } catch (Throwable th) {
                try {
                    boblVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        boblVar.close();
    }

    @bble
    void upgradeToVersion59840(dqsy dqsyVar) {
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("CustomUpgradeSteps#upgradeTo59790");
        bsbsVarF.m();
        bsbsVarF.U(new Function() { // from class: bbiu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59840$0(bsbxVar);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF.ak();
        bsbsVarF.b().e();
    }

    @bble(a = true)
    void upgradeToVersion59900(dqsy dqsyVar) {
        upgradeRcsGroupsConversationParticipantCount();
    }

    @bble(a = true)
    void upgradeToVersion59980(dqsy dqsyVar) {
        String[] strArr = awxh.a;
        awxe awxeVar = new awxe();
        awxeVar.ap("CustomUpgradeSteps#upgradeToVersion59980");
        awxl awxlVar = awxl.a;
        int iIntValue = awxh.c().intValue();
        if (awxh.c().intValue() >= 59980 && iIntValue >= 59980) {
            if (awxlVar == null) {
                awxeVar.a.putNull("address_type");
            } else {
                awxeVar.a.put("address_type", Integer.valueOf(awxlVar.ordinal()));
            }
        }
        awxeVar.b().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @bble
    void upgradeToVersion60270(dqsy dqsyVar) {
        try {
            btys btysVarA = btyx.a();
            btysVarA.A("upgradeToVersion60270");
            btysVarA.c(new Function() { // from class: bbjk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btyw btywVar = (btyw) obj;
                    CustomUpgradeSteps.lambda$upgradeToVersion60270$0(btywVar);
                    return btywVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = btysVarA.b().z();
            if (ekgbVarZ.size() != 1) {
                return;
            }
            final btxd btxdVar = (btxd) ekgbVarZ.get(0);
            btys btysVarA2 = btyx.a();
            btysVarA2.c(new Function() { // from class: bbjv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btyw btywVar = (btyw) obj;
                    CustomUpgradeSteps.lambda$upgradeToVersion60270$1(btxdVar, btywVar);
                    return btywVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btyd btydVar = (btyd) btysVarA2.b().q(btyx.c.a);
            try {
                ekgb ekgbVarC = btydVar.c();
                btydVar.close();
                if (((ekoe) ekgbVarC).c == 1) {
                    String str = (String) ekgbVarC.get(0);
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.ak();
                    boteVar.n(str);
                    boteVar.g(btxdVar.n());
                }
            } finally {
            }
        } catch (Exception e) {
            ekrw ekrwVarI = logger.i();
            ekrwVarI.X(eksq.a, "BugleDatabase");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps", "upgradeToVersion60270", (char) 1982, "CustomUpgradeSteps.java")).q("Failed to update currentSelfId on legacy conversations");
        }
    }

    @bble(b = true)
    void upgradeToVersion60350(dqsy dqsyVar) {
        safeRebuildConversationToParticipantsTable();
    }

    @bble(a = true)
    void upgradeToVersion60370(dqsy dqsyVar) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("upgradeToVersion60370");
        brduVar.r(new dqxl("lower(hex(randomblob(4)) || '-' || hex( randomblob(2)) || '-' || '4' || substr(hex( randomblob(2)), 2) || '-'\n || substr('AB89', 1 + (abs(random()) % 4) , 1)  || substr(hex(randomblob(2)), 2) || '-' || hex(randomblob(6)))", new Object[0]));
        brduVar.X(new Function() { // from class: bbiw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60370$0(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.b().e();
    }

    @bble
    void upgradeToVersion60380(dqsy dqsyVar) {
        dqsyVar.v("DROP INDEX IF EXISTS contacts_dedupe");
        dqsyVar.v("DROP INDEX IF EXISTS contacts_dedupe_custom");
    }

    @bble
    void upgradeToVersion60450(dqsy dqsyVar) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion60450");
        boteVar.X(new cnqj());
        boteVar.ad(new Function() { // from class: bbkb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60450$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar.b().e();
    }

    @bble(a = true)
    void upgradeToVersion60480(dqsy dqsyVar) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("upgradeToVersion60480");
        brduVar.r(new dqxl("lower(hex(randomblob(4)) || '-' || hex( randomblob(2)) || '-' || '4' || substr(hex( randomblob(2)), 2) || '-'\n || substr('AB89', 1 + (abs(random()) % 4) , 1)  || substr(hex(randomblob(2)), 2) || '-' || hex(randomblob(6)))", new Object[0]));
        brduVar.X(new Function() { // from class: bbjt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60480$0(brecVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.b().e();
    }

    @bble
    void upgradeToVersion60500(dqsy dqsyVar) {
        safeRebuildConversationToParticipantsTable();
    }

    @bble(a = true)
    void upgradeToVersion60930(dqsy dqsyVar) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("upgradeToVersion60510");
        boteVar.ag("encryption_protocol", new dqxl("$V | 1", new Object[]{botm.c.au}));
        boteVar.ad(new Function() { // from class: bbja
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60930$0(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iE = boteVar.b().e();
        ekrw ekrwVarH = logger.h();
        ekrwVarH.X(eksq.a, "BugleDatabase");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/database/upgrade/CustomUpgradeSteps", "upgradeToVersion60930", 2080, "CustomUpgradeSteps.java")).r("Backfilled %d rows for encryption protocol.", iE);
    }

    @bble(a = true)
    void upgradeToVersion22000(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion37010(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion41020(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion53010(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58000(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58310(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58500(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58560(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58730(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58830(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58860(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58890(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58970(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion58980(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion59000(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion59020(dqsy dqsyVar) {
    }

    @bble(a = true)
    void upgradeToVersion59280(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion59750(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion59770(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion59790(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion59800(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60030(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60100(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60130(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60290(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60300(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60390(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60440(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60470(dqsy dqsyVar) {
    }

    @bble
    void upgradeToVersion60490(dqsy dqsyVar) {
    }
}
