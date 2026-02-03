package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cosv {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public static final eksp b = eksp.c("BugleNotifications");
    public final fcsu A;
    public final eygg B;
    public final fcsu C;
    public final fcsu D;
    public final cavl E;
    public final fcsu F;
    public final fcsu G;
    public final fcsu H;
    public final coor I;
    public final fcsu J;
    public final coti K;
    public final fcsu L;
    public final fcsu M;
    public final fcsu N;
    public final fcsu O;
    public final aqoa P;
    public final fcsu Q;
    public final fcsu R;
    public final fcsu S;
    public final fcsu T;
    public final apto U;
    public final fcsu V;
    public final fcsu W;
    public final arph X;
    public final aqog Y;
    public final fcsu Z;
    public final cbtt aa;
    private final aslv ab;
    private final fcsu ac;
    private final fcsu ad;
    private final fcsu ae;
    private final cohh af;
    public final eosc c;
    public final eosc d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final cmpq k;
    public final asrh l;
    public final cicm m;
    public final fcsu n;
    public final dqsn o;
    public final bveg p;
    public final fcsu q;
    public final crtq r;
    public final bydb s;
    public final bbfn t;
    public final cogw u;
    public final chvp v;
    public final ayqn w;
    public final aypv x;
    public final cteb y;
    public final fcsu z;

    public cosv(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cmpq cmpqVar, asrh asrhVar, cicm cicmVar, fcsu fcsuVar8, dqsn dqsnVar, bveg bvegVar, fcsu fcsuVar9, crtq crtqVar, bydb bydbVar, bbfn bbfnVar, cogw cogwVar, chvp chvpVar, ayqn ayqnVar, aypv aypvVar, cohh cohhVar, cteb ctebVar, aslv aslvVar, cbtt cbttVar, fcsu fcsuVar10, fcsu fcsuVar11, eygg eyggVar, fcsu fcsuVar12, fcsu fcsuVar13, cavl cavlVar, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, coor coorVar, fcsu fcsuVar17, coti cotiVar, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, aqoa aqoaVar, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, apto aptoVar, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, arph arphVar, aqog aqogVar, fcsu fcsuVar30) {
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = fcsuVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = cmpqVar;
        this.l = asrhVar;
        this.m = cicmVar;
        this.n = fcsuVar8;
        this.o = dqsnVar;
        this.p = bvegVar;
        this.q = fcsuVar9;
        this.r = crtqVar;
        this.s = bydbVar;
        this.t = bbfnVar;
        this.u = cogwVar;
        this.v = chvpVar;
        this.w = ayqnVar;
        this.x = aypvVar;
        this.af = cohhVar;
        this.y = ctebVar;
        this.ab = aslvVar;
        this.aa = cbttVar;
        this.z = fcsuVar10;
        this.A = fcsuVar11;
        this.B = eyggVar;
        this.C = fcsuVar12;
        this.D = fcsuVar13;
        this.E = cavlVar;
        this.F = fcsuVar14;
        this.G = fcsuVar15;
        this.H = fcsuVar16;
        this.I = coorVar;
        this.J = fcsuVar17;
        this.K = cotiVar;
        this.L = fcsuVar18;
        this.M = fcsuVar19;
        this.N = fcsuVar2;
        this.O = fcsuVar20;
        this.ac = fcsuVar21;
        this.P = aqoaVar;
        this.Q = fcsuVar22;
        this.R = fcsuVar23;
        this.S = fcsuVar24;
        this.T = fcsuVar25;
        this.ad = fcsuVar26;
        this.U = aptoVar;
        this.V = fcsuVar27;
        this.ae = fcsuVar28;
        this.W = fcsuVar29;
        this.X = arphVar;
        this.Y = aqogVar;
        this.Z = fcsuVar30;
    }

    public static boolean j(aubq aubqVar) {
        aubp aubpVar = aubp.BOT;
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        return aubpVar.equals(aubpVarB);
    }

    public static boolean k(aubq aubqVar) {
        aubp aubpVar = aubp.GROUP;
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        return aubpVar.equals(aubpVarB);
    }

    public static boolean l(aubq aubqVar, ParticipantsTable.BindData bindData) {
        if (j(aubqVar)) {
            return true;
        }
        if (bindData == null) {
            return false;
        }
        ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isRbmBot", 1379, "IncomingFileTransferProcessor.java")).q("Server and client mismatch in whether this is a bot participant. Assume thisis a server mishap.");
        return true;
    }

    public final ConversationIdType a(cpeb cpebVar, ConversationIdType conversationIdType) {
        if (this.P.a()) {
            conversationIdType.getClass();
            return conversationIdType;
        }
        cpebVar.getClass();
        return cpebVar.a();
    }

    public final eiju b(final aubq aubqVar) {
        return this.ab.a(aubqVar.d).h(new ejvr() { // from class: corl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                optional.getClass();
                if (optional.isPresent()) {
                    return (BusinessInfoData) optional.get();
                }
                return ((cmpg) this.a.j.b()).a(aubqVar.d);
            }
        }, this.c);
    }

    public final eiju c(aubq aubqVar) {
        return eijx.g(new coss(this, aubqVar), this.c);
    }

    public final eiju d(aufh aufhVar) {
        if (this.X.a()) {
            axfx axfxVar = aufhVar.i;
            if (axfxVar == null) {
                axfxVar = axfx.a;
            }
            return eijx.e(new axcm(UUID.fromString(axfxVar.b)));
        }
        awxu awxuVar = (awxu) this.Q.b();
        aubq aubqVar = aufhVar.h;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        return awxuVar.i(aubqVar).h(new ejvr() { // from class: corb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((awxn) obj).b();
            }
        }, eoqg.a);
    }

    public final eiju e(final MessageCoreData messageCoreData, final coqg coqgVar, final FileTransferInformation fileTransferInformation, final boolean z, final elpg elpgVar) {
        eiju eijuVarE;
        final conr conrVarA = this.af.a();
        MessageIdType messageIdTypeC = messageCoreData.C();
        Optional optionalD = fileTransferInformation.d();
        if (optionalD.isEmpty()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.b, messageIdTypeC);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1584, "IncomingFileTransferProcessor.java")).q("Thumbnail is not present.");
            eijuVarE = eijx.e(null);
        } else {
            eiju eijuVarA = conrVarA.a(messageIdTypeC, (FileInformation) optionalD.get(), coqgVar.toByteString());
            ejvr ejvrVar = new ejvr() { // from class: coqt
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ((eksl) ((eksl) cosv.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1591, "IncomingFileTransferProcessor.java")).t("Thumbnail successfully queued for download. Download ID: %s", ((conb) obj).a());
                    return null;
                }
            };
            eosc eoscVar = this.c;
            eijuVarE = eijuVarA.h(ejvrVar, eoscVar).e(cond.class, new ejvr() { // from class: coqu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ((eksl) ((eksl) ((eksl) cosv.a.j()).g((cond) obj)).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1603, "IncomingFileTransferProcessor.java")).q("Thumbnail was not successfully queued for download.");
                    return null;
                }
            }, eoscVar);
        }
        eooz eoozVar = new eooz() { // from class: cosl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cosv cosvVar = this.a;
                final MessageCoreData messageCoreData2 = messageCoreData;
                FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                if (!z) {
                    final FileInformation fileInformationA = fileTransferInformation2.a();
                    Callable callable = new Callable() { // from class: cosj
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            MessageIdType messageIdTypeC2 = messageCoreData2.C();
                            aucj aucjVar = (aucj) new atam().fH().fM(fileInformationA);
                            eieu eieuVarK = eiiy.k("FileTransferDatabaseOperations#upsertFileTransferEntryForManualDownload");
                            try {
                                String[] strArr = comb.a;
                                cokn coknVar = new cokn();
                                coknVar.c(messageIdTypeC2);
                                coknVar.e("");
                                coknVar.f(comc.DOWNLOAD);
                                coknVar.b(aucjVar);
                                cokk cokkVarA = coknVar.a();
                                coma comaVar = new coma();
                                comaVar.b(messageIdTypeC2);
                                boolean zS = cokkVarA.s(new colz(comaVar));
                                eieuVarK.close();
                                return Boolean.valueOf(zS);
                            } catch (Throwable th) {
                                try {
                                    eieuVarK.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    };
                    eosc eoscVar2 = cosvVar.c;
                    return eijx.g(callable, eoscVar2).h(new ejvr() { // from class: cosk
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = cosv.a;
                            if (!((Boolean) obj2).booleanValue()) {
                                MessageCoreData messageCoreData3 = messageCoreData2;
                                eksl ekslVar2 = (eksl) cosv.a.j();
                                ekslVar2.X(cqnc.b, messageCoreData3.C());
                                ekslVar2.X(cqnc.f, messageCoreData3.F());
                                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertFileTransferTableEntry", 1689, "IncomingFileTransferProcessor.java")).q("Fail to insert/upsert the FileTransfer table for manual download");
                            }
                            return Optional.empty();
                        }
                    }, eoscVar2);
                }
                final elpg elpgVar2 = elpgVar;
                final coqg coqgVar2 = coqgVar;
                final conr conrVar = conrVarA;
                final FileInformation fileInformationA2 = fileTransferInformation2.a();
                Runnable runnable = new Runnable() { // from class: cosd
                    @Override // java.lang.Runnable
                    public final void run() {
                        cosvVar.I.e(messageCoreData2, 2, fileInformationA2.i());
                    }
                };
                eosc eoscVar3 = cosvVar.c;
                return eijx.f(runnable, eoscVar3).i(new eooz() { // from class: cose
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        eksp ekspVar = cosv.a;
                        return conrVar.a(messageCoreData2.C(), fileInformationA2, coqgVar2.toByteString());
                    }
                }, eoscVar3).h(new ejvr() { // from class: cosf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        conb conbVar = (conb) obj2;
                        eksl ekslVar2 = (eksl) cosv.a.h();
                        ekslVar2.X(cqnc.b, messageCoreData2.C());
                        ekslVar2.X(coie.a, conbVar.a());
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadFile", 1641, "IncomingFileTransferProcessor.java")).q("File successfully queued for download");
                        return Optional.of(conbVar);
                    }
                }, eoscVar3).e(cond.class, new ejvr() { // from class: cosg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cond condVar = (cond) obj2;
                        eksl ekslVar2 = (eksl) ((eksl) cosv.a.j()).g(condVar);
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        ekslVar2.X(cqnc.b, messageCoreData3.C());
                        ekslVar2.X(cqnc.f, messageCoreData3.F());
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadFile", 1655, "IncomingFileTransferProcessor.java")).q("File was not successfully queued for auto download.");
                        coqo coqoVar = (coqo) coqp.a.createBuilder();
                        String str = messageCoreData3.F().b;
                        str.getClass();
                        coqoVar.copyOnWrite();
                        coqp coqpVar = (coqp) coqoVar.instance;
                        coqpVar.b |= 1;
                        coqpVar.c = str;
                        coqoVar.copyOnWrite();
                        coqp coqpVar2 = (coqp) coqoVar.instance;
                        elpg elpgVar3 = elpgVar2;
                        elpgVar3.getClass();
                        coqpVar2.e = elpgVar3;
                        coqpVar2.b |= 4;
                        String message = condVar.getMessage();
                        if (message != null) {
                            coqoVar.copyOnWrite();
                            coqp coqpVar3 = (coqp) coqoVar.instance;
                            coqpVar3.b |= 2;
                            coqpVar3.d = message;
                        }
                        ((cazj) ((coqq) cosvVar.A.b()).a.b()).a(cbcu.f("file_download_failed", (coqp) coqoVar.build()));
                        return Optional.empty();
                    }
                }, eoscVar3);
            }
        };
        eosc eoscVar2 = this.c;
        return eijuVarE.i(eoozVar, eoscVar2).h(new ejvr() { // from class: cosm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = cosv.a;
                return messageCoreData;
            }
        }, eoscVar2);
    }

    public final eiju f(MessageCoreData messageCoreData, cpeb cpebVar, ParticipantsTable.BindData bindData, aubq aubqVar, axcy axcyVar) {
        long jA;
        int iE = axcyVar.e();
        String strT = bindData.T();
        if (strT == null) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInTelephony", 1855, "IncomingFileTransferProcessor.java")).q("Not storing rcs file transfer in Telephony. Sender msisdn is null.");
            return eijx.e(Optional.empty());
        }
        alqm alqmVarU = ((alrj) this.C.b()).u(strT, iE);
        if (this.P.a()) {
            jA = ((avmr) this.ad.b()).a(messageCoreData.A()).a();
        } else {
            cpebVar.getClass();
            jA = cnqk.a(cpebVar.c());
        }
        long j = jA;
        chvp chvpVar = this.v;
        if (chvpVar.q() && chvpVar.p(messageCoreData.A())) {
            return eijx.e(Optional.empty());
        }
        return chvpVar.o(messageCoreData, j, alqmVarU, k(aubqVar) ? aubqVar.d : null, iE).h(new ejvr() { // from class: coro
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Optional.ofNullable((Uri) obj);
            }
        }, this.c);
    }

    public final eiju g(final basd basdVar, final aubq aubqVar, aubq aubqVar2, final ParticipantsTable.BindData bindData, final cpeb cpebVar, final ConversationIdType conversationIdType, final Instant instant, final Instant instant2, final BusinessInfoData businessInfoData, final aubq aubqVar3, final FileTransferInformation fileTransferInformation, final aufh aufhVar, final Bundle bundle) {
        final eiju eijuVarE = this.P.a() ? eijx.e(bindData) : eijx.g(new Callable() { // from class: corw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cosv cosvVar = this.a;
                final ParticipantsTable.BindData bindData2 = bindData;
                final BusinessInfoData businessInfoData2 = businessInfoData;
                return (ParticipantsTable.BindData) cosvVar.o.c("IncomingRcsFileTransferHandler#getOrCreateParticipantInBugleDb", new ejxr() { // from class: cosn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cosv cosvVar2 = cosvVar;
                        fcsu fcsuVar = cosvVar2.f;
                        String strI = ((bbca) fcsuVar.b()).i(bindData2);
                        BusinessInfoData businessInfoData3 = businessInfoData2;
                        if (businessInfoData3 != null) {
                            String logoImageLocalUri = businessInfoData3.getLogoImageLocalUri();
                            if (!ejwk.c(logoImageLocalUri)) {
                                ((eksl) ((eksl) cosv.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "updateBotProfile", 1913, "IncomingFileTransferProcessor.java")).q("Updating RBM bot");
                                if (((bbca) fcsuVar.b()).s(strI, Uri.parse(logoImageLocalUri))) {
                                    ((bakt) cosvVar2.g.b()).R(strI);
                                }
                            }
                        }
                        ParticipantsTable.BindData bindDataB = ((bbca) fcsuVar.b()).b(strI);
                        bindDataB.getClass();
                        return bindDataB;
                    }
                });
            }
        }, this.c);
        final eiju eijuVarE2 = !k(aubqVar3) ? eijx.e(aubqVar2) : ((ciwj) this.ac.b()).a(a(cpebVar, conversationIdType), aubqVar2);
        return eijx.k(eijuVarE, eijuVarE2).b(new eooy() { // from class: cory
            @Override // defpackage.eooy
            public final ListenableFuture a() throws X {
                final aubq aubqVar4 = (aubq) eork.q(eijuVarE2);
                final ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) eork.q(eijuVarE);
                final cosv cosvVar = this.a;
                final basd basdVar2 = basdVar;
                try {
                    final axcy axcyVarB = ((chtu) cosvVar.L.b()).b(aubqVar4);
                    final FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                    coqf coqfVar = (coqf) coqg.a.createBuilder();
                    String str = basdVar2.b;
                    str.getClass();
                    coqfVar.copyOnWrite();
                    ((coqg) coqfVar.instance).b = str;
                    final coqg coqgVar = (coqg) coqfVar.build();
                    int iA = fileTransferInformation2.a().a();
                    cqmi cqmiVarB = ((cqmj) cosvVar.G.b()).b(fileTransferInformation2.a().b(), r10.a());
                    final boolean zC = cqmiVarB.c();
                    cqme cqmeVar = (cqme) cqmiVarB;
                    long j = cqmeVar.a;
                    eksp ekspVar = cosv.a;
                    ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isAutoDownload", 815, "IncomingFileTransferProcessor.java")).I("Calculating message status. FileSize: %d. Auto downloadable file size: %d.  Auto downloading: %b", Integer.valueOf(iA), Long.valueOf(j), Boolean.valueOf(zC));
                    if (!zC) {
                        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isAutoDownload", 820, "IncomingFileTransferProcessor.java")).t("File is not auto downloading b/c %s.", cqmeVar.b);
                    }
                    final aufh aufhVar2 = aufhVar;
                    elpg elpgVar = aufhVar2.o;
                    if (elpgVar == null) {
                        elpgVar = elpg.b;
                    }
                    final elpg elpgVar2 = elpgVar;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    final cpeb cpebVar2 = cpebVar;
                    final ConversationIdType conversationIdTypeA = cosvVar.a(cpebVar2, conversationIdType2);
                    eieu eieuVarK = eiiy.k("IncomingFileTransferProcessor.clearTypingIndicatorAsync");
                    try {
                        ((eksl) ((eksl) ekspVar.e()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "clearTypingIndicatorAsync", 1930, "IncomingFileTransferProcessor.java")).q("Clearing typing indicator on incoming message async.");
                        eiju eijuVarH = eijx.h(new eooy() { // from class: corm
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                atwz atwzVar = (atwz) cosvVar.V.b();
                                efhu efhuVar = new efhu();
                                efhuVar.c(efjm.STOP);
                                return atwzVar.b(efhuVar.a(), aufhVar2, eijx.e(conversationIdTypeA));
                            }
                        }, cosvVar.d);
                        eieuVarK.b(eijuVarH);
                        eijuVarH.k(auvh.b(), eoqg.a);
                        eieuVarK.close();
                        eyga eygaVar = aufhVar2.l;
                        if (eygaVar == null) {
                            eygaVar = eyga.a;
                        }
                        final Bundle bundle2 = bundle;
                        final aubq aubqVar5 = aubqVar3;
                        final Instant instant3 = instant2;
                        final Instant instant4 = instant;
                        final aubq aubqVar6 = aubqVar;
                        final eyga eygaVar2 = eygaVar;
                        final evsz evszVar = new evsz(aufhVar2.q, aufh.a);
                        final FileInformation fileInformationA = fileTransferInformation2.a();
                        final int i = true != zC ? 115 : 105;
                        Callable callable = new Callable() { // from class: cosh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                FileInformation fileInformation = fileInformationA;
                                String string = cqmr.c(fileInformation.b()).toString();
                                long jA = fileInformation.a();
                                long epochMilli = fileInformation.d().toEpochMilli();
                                axcy axcyVar = axcyVarB;
                                String strR = bindData2.R();
                                SelfIdentityId selfIdentityIdF = axcyVar.f();
                                cosv cosvVar2 = cosvVar;
                                crtq crtqVar = cosvVar2.r;
                                ConversationIdType conversationIdType3 = conversationIdTypeA;
                                MessageCoreData messageCoreDataO = cosvVar2.p.o(string, jA, epochMilli, basdVar2, strR, selfIdentityIdF, conversationIdType3, i, 1, crtqVar.a(conversationIdType3), false, instant4.toEpochMilli(), instant3.toEpochMilli(), (String) fileInformation.h().orElse(""), (String) fileTransferInformation2.d().map(new Function() { // from class: coqs
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        eksp ekspVar2 = cosv.a;
                                        return ((FileInformation) obj).b().toString();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).orElse(null));
                                cosvVar2.aa.b(messageCoreDataO, bundle2);
                                fcsu fcsuVar = cosvVar2.C;
                                messageCoreDataO.bP(((alrj) fcsuVar.b()).b(aubqVar6));
                                alqm alqmVarB = ((alrj) fcsuVar.b()).b(aubqVar4);
                                ejwl.a(alqmVarB.e().isPresent());
                                aubp aubpVarB = aubp.b(((aubq) alqmVarB.e().get()).c);
                                if (aubpVarB == null) {
                                    aubpVarB = aubp.UNKNOWN_TYPE;
                                }
                                List list = evszVar;
                                eyga eygaVar3 = eygaVar2;
                                ejwl.a(aubpVarB.equals(aubp.PHONE));
                                messageCoreDataO.bM(alqmVarB);
                                messageCoreDataO.bs(eygaVar3);
                                messageCoreDataO.bH((list.contains(aufg.POSITIVE_DELIVERY) || list.contains(aufg.NEGATIVE_DELIVERY)) ? bvdx.NOT_SENT : bvdx.NOT_REQUESTED);
                                messageCoreDataO.bI(list.contains(aufg.DISPLAY) ? bvdx.NOT_SENT : bvdx.NOT_REQUESTED);
                                return messageCoreDataO;
                            }
                        };
                        eosc eoscVar = cosvVar.c;
                        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: cort
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                MessageCoreData messageCoreData = (MessageCoreData) obj;
                                Iterator it = ((Set) cosvVar.B.b()).iterator();
                                while (it.hasNext()) {
                                    ((bayb) it.next()).e(messageCoreData);
                                }
                                return messageCoreData;
                            }
                        }, eoscVar).i(new eooz() { // from class: coru
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                                final cosv cosvVar2 = cosvVar;
                                ((cmqf) cosvVar2.n.b()).i(instant3.toEpochMilli());
                                final ConversationIdType conversationIdTypeA2 = cosvVar2.P.a() ? messageCoreData.A() : conversationIdTypeA;
                                final Bundle bundle3 = bundle2;
                                final axcy axcyVar = axcyVarB;
                                final boolean z = zC;
                                final aubq aubqVar7 = aubqVar5;
                                final ParticipantsTable.BindData bindData3 = bindData2;
                                final basd basdVar3 = basdVar2;
                                final aufh aufhVar3 = aufhVar2;
                                return eijx.g(new Callable() { // from class: cors
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        int i2;
                                        String str2;
                                        eiju eijuVarA;
                                        final cosv cosvVar3 = cosvVar2;
                                        baxe baxeVar = (baxe) cosvVar3.h.b();
                                        final basd basdVar4 = basdVar3;
                                        MessageCoreData messageCoreDataX = baxeVar.x(basdVar4);
                                        final MessageCoreData messageCoreData2 = messageCoreData;
                                        final ConversationIdType conversationIdType3 = conversationIdTypeA2;
                                        final aufh aufhVar4 = aufhVar3;
                                        if (messageCoreDataX != null) {
                                            eksl ekslVar = (eksl) cosv.a.j();
                                            ekslVar.X(cqnc.f, basdVar4);
                                            ekslVar.X(cqnc.s, conversationIdType3);
                                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInBugleDb", 1728, "IncomingFileTransferProcessor.java")).q("Duplicate message found.");
                                            if (((aryl) cosvVar3.W.b()).a()) {
                                                final Bundle bundle4 = bundle3;
                                                eijuVarA = cosvVar3.d(aufhVar4).i(new eooz() { // from class: corg
                                                    @Override // defpackage.eooz
                                                    public final ListenableFuture a(Object obj2) {
                                                        return cosvVar3.i(aufhVar4, basdVar4, bundle4, (axcm) obj2);
                                                    }
                                                }, cosvVar3.d).h(new ejvr() { // from class: corh
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj2) {
                                                        eksp ekspVar2 = cosv.a;
                                                        return Boolean.valueOf(((chwo) obj2).a);
                                                    }
                                                }, eoqg.a);
                                            } else {
                                                cmpv cmpvVar = (cmpv) cosvVar3.M.b();
                                                messageCoreData2.getClass();
                                                eijuVarA = auvw.a(fdin.b(cmpvVar.a, eicg.a(fcyi.a), fdjz.a, new cmps(null, cmpvVar, messageCoreData2)));
                                            }
                                            auvh.h(eijuVarA.h(new ejvr() { // from class: cori
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj2) {
                                                    Boolean bool = (Boolean) obj2;
                                                    eksp ekspVar2 = cosv.a;
                                                    boolean zBooleanValue = bool.booleanValue();
                                                    MessageCoreData messageCoreData3 = messageCoreData2;
                                                    if (zBooleanValue) {
                                                        eksl ekslVar2 = (eksl) cosv.a.h();
                                                        ekslVar2.X(cqnc.f, messageCoreData3.F());
                                                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForDuplicate", 1832, "IncomingFileTransferProcessor.java")).q("Best-effort delivery report sent.");
                                                        return bool;
                                                    }
                                                    eksl ekslVar3 = (eksl) cosv.a.j();
                                                    ekslVar3.X(cqnc.f, messageCoreData3.F());
                                                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForDuplicate", 1837, "IncomingFileTransferProcessor.java")).q("Failed to send best-effort delivery report.");
                                                    return bool;
                                                }
                                            }, cosvVar3.c));
                                            atav atavVar = atav.SUCCESS;
                                            atavVar.getClass();
                                            return new cooz(atavVar);
                                        }
                                        final aubq aubqVar8 = aubqVar7;
                                        final ParticipantsTable.BindData bindData4 = bindData3;
                                        cosvVar3.o.d("IncomingRcsFileTransferHandler#insertRcsFileTransferInBugleDb", new Runnable() { // from class: cosr
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                cosv cosvVar4 = cosvVar3;
                                                bydb bydbVar = cosvVar4.s;
                                                MessageCoreData messageCoreData3 = messageCoreData2;
                                                bydbVar.g(messageCoreData3);
                                                ((bauh) cosvVar4.J.b()).a(messageCoreData3);
                                                Iterator it = ((Set) cosvVar4.B.b()).iterator();
                                                while (it.hasNext()) {
                                                    ((bayb) it.next()).k(messageCoreData3);
                                                }
                                                aubq aubqVar9 = aubqVar8;
                                                ParticipantsTable.BindData bindData5 = bindData4;
                                                ConversationIdType conversationIdType4 = conversationIdType3;
                                                baqi baqiVar = (baqi) cosvVar4.i.b();
                                                MessageIdType messageIdTypeC = messageCoreData3.C();
                                                Long lValueOf = Long.valueOf(messageCoreData3.o());
                                                boolean zK = cosv.k(aubqVar9);
                                                ((eksl) ((eksl) cosv.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getArchiveStatus", 1950, "IncomingFileTransferProcessor.java")).t("Calculating archive status. isGroup: %b", Boolean.valueOf(zK));
                                                String strT = bindData5.T();
                                                baqiVar.f(conversationIdType4, messageIdTypeC, lValueOf, strT == null ? bvdk.UNARCHIVED : ((baxe) cosvVar4.h.b()).G(conversationIdType4, strT, false, zK), -1L, 0);
                                            }
                                        });
                                        boolean zG = ((bwwe) cosvVar3.D.b()).g(messageCoreData2.A());
                                        boolean z2 = true;
                                        if (!messageCoreData2.cM() && !z && !zG) {
                                            z2 = false;
                                        }
                                        axcy axcyVar2 = axcyVar;
                                        ajhd ajhdVar = (ajhd) cosvVar3.e.b();
                                        int iE = axcyVar2.e();
                                        elpg elpgVar3 = aufhVar4.o;
                                        if (elpgVar3 == null) {
                                            elpgVar3 = elpg.b;
                                        }
                                        elof elofVar = (elof) elpgVar3.toBuilder();
                                        elofVar.copyOnWrite();
                                        elpg elpgVar4 = (elpg) elofVar.instance;
                                        elpgVar4.i = 2;
                                        elpgVar4.c = 2 | elpgVar4.c;
                                        elofVar.copyOnWrite();
                                        elpg elpgVar5 = (elpg) elofVar.instance;
                                        elpgVar5.d |= 1073741824;
                                        elpgVar5.ag = z2;
                                        ajhdVar.H(messageCoreData2, iE, elofVar);
                                        coor coorVar = cosvVar3.I;
                                        ellg ellgVarD = coorVar.d(messageCoreData2, 32, new Consumer() { // from class: coon
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj2) {
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        cmxn cmxnVar = (cmxn) coorVar.d.b();
                                        String strF = messageCoreData2.F().f();
                                        Optional optionalEmpty = Optional.empty();
                                        ekgb ekgbVar = cmxn.k;
                                        int i3 = ((ekoe) ekgbVar).c;
                                        int i4 = 0;
                                        while (i4 < i3) {
                                            cmxn cmxnVar2 = cmxnVar;
                                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cmxnVar.x.get(((cmxm) ekgbVar.get(i4)).ordinal());
                                            if (concurrentHashMap.containsKey(strF)) {
                                                ainn ainnVar = ((cmxk) concurrentHashMap.get(strF)).b;
                                                if (optionalEmpty.isEmpty()) {
                                                    i2 = i4;
                                                    str2 = strF;
                                                } else {
                                                    i2 = i4;
                                                    str2 = strF;
                                                    ainn ainnVar2 = (ainn) optionalEmpty.get();
                                                    if (ainnVar.a >= ainnVar2.a || ainnVar.b >= ainnVar2.b) {
                                                    }
                                                }
                                                optionalEmpty = Optional.of(ainnVar);
                                            } else {
                                                i2 = i4;
                                                str2 = strF;
                                            }
                                            i4 = i2 + 1;
                                            strF = str2;
                                            cmxnVar = cmxnVar2;
                                        }
                                        if (optionalEmpty.isEmpty()) {
                                            ekrw ekrwVarH = coor.a.h();
                                            ekrwVarH.X(eksq.a, "BugleFileTransfer");
                                            ekrd ekrdVar = (ekrd) ekrwVarH;
                                            ekrdVar.X(cqnc.f, messageCoreData2.F());
                                            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/transfer/downloads/analytics/FileDownloadEventLogger", "logRcsMessageDownloadReceiving", 276, "FileDownloadEventLogger.java")).q("Receiving timestamp has not been recorded for message. Skipping logging of RECEIVING event.");
                                        } else {
                                            ailn ailnVarA = ((aimb) coorVar.b.b()).a();
                                            ailnVarA.f((ainn) optionalEmpty.get());
                                            ailnVarA.j(ellgVarD, aioj.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
                                        }
                                        cosvVar3.t.b(conversationIdType3, bindData4, messageCoreData2);
                                        eksl ekslVar2 = (eksl) cosv.a.h();
                                        ekslVar2.X(cqnc.b, messageCoreData2.C());
                                        ekslVar2.X(cqnc.s, conversationIdType3);
                                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInBugleDb", 1789, "IncomingFileTransferProcessor.java")).q("Received and processed RCS file transfer push message.");
                                        ((eksl) ((eksl) cosv.b.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInBugleDb", 1791, "IncomingFileTransferProcessor.java")).q("Creating notification from IncomingFileTransferProcessor");
                                        ((cgpi) cosvVar3.H.b()).b(messageCoreData2.A(), Duration.ofMillis(messageCoreData2.o()), false);
                                        messageCoreData2.getClass();
                                        return new cooy(messageCoreData2);
                                    }
                                }, cosvVar2.c);
                            }
                        }, eoscVar).i(new eooz() { // from class: corv
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                cosu cosuVar = (cosu) obj;
                                int iB = cosuVar.b();
                                final basd basdVar3 = basdVar2;
                                if (iB == 2) {
                                    ConversationIdType conversationIdType3 = conversationIdTypeA;
                                    eksl ekslVar = (eksl) cosv.a.h();
                                    ekslVar.X(cqnc.f, basdVar3);
                                    ekslVar.X(cqnc.s, conversationIdType3);
                                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForValidParticipant", 775, "IncomingFileTransferProcessor.java")).q("Skipping the file download.");
                                    return eijx.e(cosuVar.c());
                                }
                                final axcy axcyVar = axcyVarB;
                                elpg elpgVar3 = elpgVar2;
                                boolean z = zC;
                                FileTransferInformation fileTransferInformation3 = fileTransferInformation2;
                                final aubq aubqVar7 = aubqVar5;
                                coqg coqgVar2 = coqgVar;
                                final cpeb cpebVar3 = cpebVar2;
                                final ParticipantsTable.BindData bindData3 = bindData2;
                                final cosv cosvVar2 = cosvVar;
                                if (!((Boolean) ((cczi) ateo.a.get()).e()).booleanValue()) {
                                    eiju eijuVarE3 = cosvVar2.e(cosuVar.a(), coqgVar2, fileTransferInformation3, z, elpgVar3);
                                    ejvr ejvrVar = new ejvr() { // from class: corj
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            MessageCoreData messageCoreData = (MessageCoreData) obj2;
                                            Iterator it = ((Set) cosvVar2.B.b()).iterator();
                                            while (it.hasNext()) {
                                                ((bayb) it.next()).d(messageCoreData);
                                            }
                                            return messageCoreData;
                                        }
                                    };
                                    eosc eoscVar2 = cosvVar2.c;
                                    return eijuVarE3.h(ejvrVar, eoscVar2).i(new eooz() { // from class: cork
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj2) {
                                            final cosv cosvVar3 = cosvVar2;
                                            final MessageCoreData messageCoreData = (MessageCoreData) obj2;
                                            cpeb cpebVar4 = cpebVar3;
                                            final ParticipantsTable.BindData bindData4 = bindData3;
                                            eiju eijuVarF = cosvVar3.f(messageCoreData, cpebVar4, bindData4, aubqVar7, axcyVar);
                                            final basd basdVar4 = basdVar3;
                                            return eijuVarF.i(new eooz() { // from class: corz
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj3) {
                                                    return cosvVar3.h(messageCoreData, basdVar4, bindData4, (Optional) obj3);
                                                }
                                            }, cosvVar3.c);
                                        }
                                    }, eoscVar2);
                                }
                                final MessageCoreData messageCoreDataA = cosuVar.a();
                                eooy eooyVar = new eooy() { // from class: coqz
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        return cosvVar2.f(messageCoreDataA, cpebVar3, bindData3, aubqVar7, axcyVar);
                                    }
                                };
                                eosc eoscVar3 = cosvVar2.c;
                                final eiju eijuVarH2 = eijx.h(eooyVar, eoscVar3);
                                final coti cotiVar = cosvVar2.K;
                                eksl ekslVar2 = (eksl) coti.a.h();
                                ekslVar2.X(cqnc.e, basdVar3.b);
                                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "addFutureForRcsMessage", 46, "TelephonyInsertionFutureRepository.java")).q("Adding Telephony insertion future to the repository.");
                                cotiVar.b.put(basdVar3, eijuVarH2.h(new ejvr() { // from class: coth
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        eksl ekslVar3 = (eksl) coti.a.h();
                                        basd basdVar4 = basdVar3;
                                        ekslVar3.X(cqnc.e, basdVar4.b);
                                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "addFutureForRcsMessage", 55, "TelephonyInsertionFutureRepository.java")).q("Processing of Telephony insertion finished. Removing from repository.");
                                        return null;
                                    }
                                }, eoqg.a));
                                return eijx.k(cosvVar2.e(messageCoreDataA, coqgVar2, fileTransferInformation3, z, elpgVar3).h(new ejvr() { // from class: cora
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        MessageCoreData messageCoreData = (MessageCoreData) obj2;
                                        Iterator it = ((Set) cosvVar2.B.b()).iterator();
                                        while (it.hasNext()) {
                                            ((bayb) it.next()).d(messageCoreData);
                                        }
                                        return messageCoreData;
                                    }
                                }, eoscVar3), eijuVarH2).b(new eooy() { // from class: corc
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        return cosvVar2.h(messageCoreDataA, basdVar3, bindData3, (Optional) eork.q(eijuVarH2));
                                    }
                                }, eoscVar3);
                            }
                        }, eoscVar);
                    } finally {
                    }
                } catch (IllegalStateException unused) {
                    eksl ekslVar = (eksl) cosv.a.j();
                    ekslVar.X(cqnc.f, basdVar2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForValidParticipant", 710, "IncomingFileTransferProcessor.java")).q("Cannot process incoming FT message because the subscription was not found");
                    asrx asrxVar = (asrx) cosvVar.O.b();
                    elof elofVar = (elof) elpg.b.createBuilder();
                    String strF = basdVar2.f();
                    elofVar.copyOnWrite();
                    elpg elpgVar3 = (elpg) elofVar.instance;
                    elpgVar3.c |= Integer.MIN_VALUE;
                    elpgVar3.H = strF;
                    enyw enywVarA = asrxVar.a.a();
                    elofVar.copyOnWrite();
                    elpg elpgVar4 = (elpg) elofVar.instance;
                    elpgVar4.Y = enywVarA.h;
                    elpgVar4.d |= 2097152;
                    elofVar.copyOnWrite();
                    elpg elpgVar5 = (elpg) elofVar.instance;
                    elpgVar5.h = 3;
                    elpgVar5.c |= 1;
                    elofVar.copyOnWrite();
                    elpg elpgVar6 = (elpg) elofVar.instance;
                    elpgVar6.i = 15;
                    elpgVar6.c |= 2;
                    enxt enxtVar = (enxt) enxu.a.createBuilder();
                    enxv enxvVar = (enxv) enxw.a.createBuilder();
                    enxk enxkVar = enxk.CHAT_API_FAILED_TRANSIENTLY;
                    enxvVar.copyOnWrite();
                    enxw enxwVar = (enxw) enxvVar.instance;
                    enxwVar.g = enxkVar.f;
                    enxwVar.b |= 16;
                    enxi enxiVar = enxi.CHAT_API_NO_RCS_SUBSCRIPTION;
                    enxvVar.copyOnWrite();
                    enxw enxwVar2 = (enxw) enxvVar.instance;
                    enxwVar2.f = enxiVar.D;
                    enxwVar2.b |= 8;
                    enxtVar.copyOnWrite();
                    enxu enxuVar = (enxu) enxtVar.instance;
                    enxw enxwVar3 = (enxw) enxvVar.build();
                    enxwVar3.getClass();
                    enxuVar.c = enxwVar3;
                    enxuVar.b |= 1;
                    elofVar.copyOnWrite();
                    elpg elpgVar7 = (elpg) elofVar.instance;
                    enxu enxuVar2 = (enxu) enxtVar.build();
                    enxuVar2.getClass();
                    elpgVar7.M = enxuVar2;
                    elpgVar7.d |= 1024;
                    elwm elwmVar = (elwm) elwq.a.createBuilder();
                    emfq emfqVar = (emfq) emfr.a.createBuilder();
                    Stream map = Collection.EL.stream(asrxVar.b.m()).map(new asrv());
                    String str2 = aubqVar4.d;
                    str2.getClass();
                    boolean zAnyMatch = map.anyMatch(new asrw(str2));
                    emfqVar.copyOnWrite();
                    emfr emfrVar = (emfr) emfqVar.instance;
                    emfrVar.b |= 1;
                    emfrVar.c = zAnyMatch;
                    elwmVar.copyOnWrite();
                    elwq elwqVar = (elwq) elwmVar.instance;
                    emfr emfrVar2 = (emfr) emfqVar.build();
                    emfrVar2.getClass();
                    elwqVar.i = emfrVar2;
                    elwqVar.b |= 1024;
                    elofVar.copyOnWrite();
                    elpg elpgVar8 = (elpg) elofVar.instance;
                    elwq elwqVar2 = (elwq) elwmVar.build();
                    elwqVar2.getClass();
                    elpgVar8.N = elwqVar2;
                    elpgVar8.d |= 2048;
                    elyw elywVar = (elyw) elyy.a.createBuilder();
                    int i2 = true == ((crmx) asrxVar.c.b()).I(aubqVar4.d) ? 2 : 1;
                    elywVar.copyOnWrite();
                    elyy elyyVar = (elyy) elywVar.instance;
                    elyyVar.d = i2 - 1;
                    elyyVar.b |= 2;
                    elofVar.b(elywVar);
                    asrxVar.d((elpg) elofVar.build());
                    return eijx.e(atav.FAIL_RETRY);
                }
            }
        }, this.c);
    }

    public final eiju h(final MessageCoreData messageCoreData, final basd basdVar, final ParticipantsTable.BindData bindData, final Optional optional) {
        eooy eooyVar = new eooy() { // from class: corx
            @Override // defpackage.eooy
            public final ListenableFuture a() throws IOException {
                final cosv cosvVar = this.a;
                if (!cosvVar.v.q() && optional.isEmpty()) {
                    basd basdVar2 = basdVar;
                    eksl ekslVar = (eksl) cosv.a.i();
                    ekslVar.X(cqnc.f, basdVar2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "scheduleFinishingActions", 943, "IncomingFileTransferProcessor.java")).q("Failed to store incoming file transfer push message in Telephony.");
                    return eijx.e(atav.FAIL_RETRY);
                }
                final MessageCoreData messageCoreData2 = messageCoreData;
                apto aptoVar = cosvVar.U;
                final ConversationIdType conversationIdTypeA = messageCoreData2.A();
                eiju eijuVarF = !aptoVar.a() ? eijx.f(new Runnable() { // from class: coqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        cosvVar.y.c(conversationIdTypeA, 3);
                    }
                }, cosvVar.c) : eijx.e(null);
                ((cscx) cosvVar.q.b()).a(messageCoreData2, null, messageCoreData2.ac());
                eiju eijuVarP = cosvVar.w.d(messageCoreData2.C(), elny.INCOMING_FILE_TRANSFER_PROCESSOR).p();
                eooz eoozVar = new eooz() { // from class: cord
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return cosvVar.x.b(3).p();
                    }
                };
                eosc eoscVar = cosvVar.c;
                return eijx.m(eijuVarF, eijuVarP.i(eoozVar, eoscVar), aptoVar.a() ? eijx.e(null) : ((assl) cosvVar.F.b()).a(((alrj) cosvVar.C.b()).t(bindData), messageCoreData2)).a(new Callable() { // from class: core
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksl ekslVar2 = (eksl) cosv.a.h();
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        ekslVar2.X(cqnc.b, messageCoreData3.C());
                        ekslVar2.X(cqnc.f, messageCoreData3.F());
                        ekslVar2.X(cqnc.s, messageCoreData3.A());
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "scheduleFinishingActionsForIncomingFileTransferPushMessage", 1048, "IncomingFileTransferProcessor.java")).q("Incoming file transfer push message successfully processed.");
                        return atav.SUCCESS;
                    }
                }, eoscVar);
            }
        };
        eosc eoscVar = this.c;
        return eijx.h(eooyVar, eoscVar).i(new eooz() { // from class: cosi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String strT;
                ParticipantsTable.BindData bindData2 = bindData;
                final atav atavVar = (atav) obj;
                if (!bbbe.d(bindData2) || (strT = bindData2.T()) == null) {
                    return eijx.e(atavVar);
                }
                cosv cosvVar = this.a;
                cavh cavhVar = (cavh) cavk.a.createBuilder();
                cavhVar.copyOnWrite();
                ((cavk) cavhVar.instance).b = strT;
                cavhVar.copyOnWrite();
                ((cavk) cavhVar.instance).d = cavj.a(5);
                cavhVar.copyOnWrite();
                ((cavk) cavhVar.instance).c = cavi.a(3);
                cavk cavkVar = (cavk) cavhVar.build();
                caxr caxrVar = new caxr();
                caxrVar.a = strT;
                caxrVar.b = strT;
                return cosvVar.E.a(cavkVar, caxrVar.a()).h(new ejvr() { // from class: corf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = cosv.a;
                        return atavVar;
                    }
                }, cosvVar.c);
            }
        }, eoscVar);
    }

    public final eiju i(aufh aufhVar, basd basdVar, Bundle bundle, axcm axcmVar) {
        awpx awpxVarA;
        fcsu fcsuVar = this.ae;
        aubt aubtVarA = ((chgo) fcsuVar.b()).a(bundle);
        eyga eygaVar = aufhVar.l;
        if (eygaVar == null) {
            eygaVar = eyga.a;
        }
        eyga eygaVar2 = eygaVar;
        cbqz cbqzVarA = this.aa.a(bundle);
        evvp evvpVar = aufhVar.n;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        Instant instantD = evwz.d(evvpVar);
        awky awkyVar = aufhVar.e;
        if (awkyVar == null) {
            awkyVar = awky.a;
        }
        awjl awjlVarA = awjj.a(awkyVar);
        if ((aufhVar.c & 32) != 0) {
            awso awsoVar = aufhVar.g;
            if (awsoVar == null) {
                awsoVar = awso.a;
            }
            awpxVarA = awou.a(awsoVar);
        } else {
            awpxVarA = null;
        }
        chbs chbsVar = new chbs(awjlVarA, awpxVarA);
        chgo chgoVar = (chgo) fcsuVar.b();
        auib auibVar = aufhVar.p;
        if (auibVar == null) {
            auibVar = auib.a;
        }
        aubq aubqVar = aufhVar.h;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        return chgoVar.e(auibVar, aubqVar, axcmVar, instantD, chbsVar, eygaVar2, basdVar, !Objects.equals(cbqzVarA, cbqz.a), cbqzVarA, aubtVarA, auhk.DELIVERY, elny.INCOMING_FILE_TRANSFER_PROCESSOR, bundle);
    }
}
