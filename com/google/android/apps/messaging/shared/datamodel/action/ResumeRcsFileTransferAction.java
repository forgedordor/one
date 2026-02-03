package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ains;
import defpackage.atgy;
import defpackage.ayfr;
import defpackage.ayqj;
import defpackage.bary;
import defpackage.cogw;
import defpackage.cohh;
import defpackage.coor;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ekrg;
import defpackage.elgm;
import defpackage.eooy;
import defpackage.eooz;
import defpackage.eosc;
import defpackage.fcsu;
import j$.time.Instant;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ResumeRcsFileTransferAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final cogw c;
    public final ains d;
    public final eosc e;
    public final eosc f;
    public final coor g;
    public final fcsu h;
    public final cohh i;
    public final atgy j;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayfr();

    /* compiled from: PG */
    public interface a {
        ayqj bp();
    }

    public ResumeRcsFileTransferAction(fcsu fcsuVar, cogw cogwVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, cohh cohhVar, coor coorVar, fcsu fcsuVar2, atgy atgyVar, Parcel parcel) {
        super(parcel, elgm.RESUME_RCS_FILE_TRANSFER_ACTION);
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = ainsVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.i = cohhVar;
        this.g = coorVar;
        this.h = fcsuVar2;
        this.j = atgyVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ResumeRcsFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ResumeRcsFileTransferAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        eieu eieuVarK = eiiy.k("ResumeRcsFileTransferAction.executeAction");
        try {
            final MessageIdType messageIdTypeB = bary.b(this.v.l("message_id"));
            eiju eijuVarH = eijx.h(new eooy() { // from class: ayfe
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    ResumeRcsFileTransferAction resumeRcsFileTransferAction = this.a;
                    baxe baxeVar = (baxe) resumeRcsFileTransferAction.b.b();
                    MessageIdType messageIdType = messageIdTypeB;
                    MessageCoreData messageCoreDataW = baxeVar.w(messageIdType);
                    if (messageCoreDataW == null) {
                        ekrw ekrwVarI = ResumeRcsFileTransferAction.a.i();
                        ekrwVarI.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar = (ekrd) ekrwVarI;
                        ekrdVar.X(cqnc.b, messageIdType);
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsync", 167, "ResumeRcsFileTransferAction.java")).q("Message is not found.");
                        return eijx.e(null);
                    }
                    ekrg ekrgVar = ResumeRcsFileTransferAction.a;
                    ekrw ekrwVarE = ekrgVar.e();
                    ekrz ekrzVar = eksq.a;
                    ekrwVarE.X(ekrzVar, "BugleDataModel");
                    ekrd ekrdVar2 = (ekrd) ekrwVarE;
                    ekrz ekrzVar2 = cqnc.b;
                    ekrdVar2.X(ekrzVar2, messageIdType);
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsync", 171, "ResumeRcsFileTransferAction.java")).q("resumeFileTransfer");
                    if (!((aptx) resumeRcsFileTransferAction.h.b()).a() || !messageCoreDataW.cS()) {
                        return resumeRcsFileTransferAction.h(messageCoreDataW).h(new ejvr() { // from class: ayfi
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                return null;
                            }
                        }, resumeRcsFileTransferAction.f);
                    }
                    MessagePartCoreData messagePartCoreDataH = messageCoreDataW.H();
                    if (messagePartCoreDataH == null) {
                        ekrw ekrwVarI2 = ekrgVar.i();
                        ekrwVarI2.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar3 = (ekrd) ekrwVarI2;
                        ekrdVar3.X(ekrzVar2, messageCoreDataW.C());
                        ekrdVar3.X(cqnc.f, messageCoreDataW.F());
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileProcessingPipeline", 208, "ResumeRcsFileTransferAction.java")).q("Attachment is null. Nothing to resume for outgoing message.");
                        return eijx.e(null);
                    }
                    athh athhVarZ = messagePartCoreDataH.z();
                    if (athhVarZ == null) {
                        ekrw ekrwVarJ = ekrgVar.j();
                        ekrwVarJ.X(ekrzVar, "BugleDataModel");
                        ekrd ekrdVar4 = (ekrd) ekrwVarJ;
                        ekrdVar4.X(ekrzVar2, messageCoreDataW.C());
                        ekrdVar4.X(cqnc.f, messageCoreDataW.F());
                        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileProcessingPipeline", 216, "ResumeRcsFileTransferAction.java")).q("ProcessingId is null for outgoing message to resume.");
                        return resumeRcsFileTransferAction.h(messageCoreDataW).h(new ejvr() { // from class: ayfq
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                return null;
                            }
                        }, resumeRcsFileTransferAction.f);
                    }
                    ekrw ekrwVarH = ekrgVar.h();
                    ekrwVarH.X(ekrzVar, "BugleDataModel");
                    ekrd ekrdVar5 = (ekrd) ekrwVarH;
                    ekrdVar5.X(ekrzVar2, messageCoreDataW.C());
                    ekrdVar5.X(cqnc.f, messageCoreDataW.F());
                    ekrdVar5.X(coie.j, messagePartCoreDataH.z());
                    ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileProcessingPipeline", 224, "ResumeRcsFileTransferAction.java")).q("Resuming processing.");
                    return resumeRcsFileTransferAction.j.e(athhVarZ, messageCoreDataW.a() + 1, messageCoreDataW);
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

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fT() {
        return false;
    }

    public final eiju h(final MessageCoreData messageCoreData) {
        Callable callable = new Callable() { // from class: ayff
            @Override // java.util.concurrent.Callable
            public final Object call() {
                colw colwVarB = comb.b();
                colwVarB.A("resumeFileTransferAsyncForChatApi");
                colf colfVar = comb.c;
                colwVarB.c(colfVar.b, colfVar.c, colfVar.e);
                coma comaVar = new coma();
                comaVar.b(messageCoreData.C());
                colwVarB.d(comaVar);
                return (cokk) colwVarB.b().l();
            }
        };
        eosc eoscVar = this.e;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: ayfg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final MessageCoreData messageCoreData2 = messageCoreData;
                cokk cokkVar = (cokk) obj;
                if (cokkVar == null) {
                    ekrw ekrwVarJ = ResumeRcsFileTransferAction.a.j();
                    ekrwVarJ.X(eksq.a, "BugleDataModel");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cqnc.b, messageCoreData2.C());
                    ekrdVar.X(cqnc.f, messageCoreData2.F());
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsyncForChatApi", 254, "ResumeRcsFileTransferAction.java")).q("No file transfer bind data found. Cannot resume file transfer.");
                    return eijx.e(ayfs.NO_FILE_TRANSFER_BIND_DATA);
                }
                final ResumeRcsFileTransferAction resumeRcsFileTransferAction = this.a;
                final String strR = cokkVar.r();
                if (!comc.DOWNLOAD.equals(cokkVar.p()) || !"".equals(strR)) {
                    if (ejwk.c(strR)) {
                        ekrw ekrwVarJ2 = ResumeRcsFileTransferAction.a.j();
                        ekrwVarJ2.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                        ekrdVar2.X(cqnc.b, messageCoreData2.C());
                        ekrdVar2.X(cqnc.f, messageCoreData2.F());
                        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsyncForChatApi", 278, "ResumeRcsFileTransferAction.java")).q("File transfer bind data does not have transfer ID. Cannot resume file transfer.");
                        return eijx.e(ayfs.NO_FILE_TRANSFER_BIND_DATA);
                    }
                    if (comc.UPLOAD.equals(cokkVar.p())) {
                        ekrw ekrwVarE = ResumeRcsFileTransferAction.a.e();
                        ekrwVarE.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar3 = (ekrd) ekrwVarE;
                        ekrdVar3.X(cqnc.b, messageCoreData2.C());
                        ekrdVar3.X(cqnc.f, messageCoreData2.F());
                        ekrdVar3.X(coie.a, strR);
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeUploadForChatApi", 313, "ResumeRcsFileTransferAction.java")).q("Resuming upload.");
                        return resumeRcsFileTransferAction.i.b().b(strR).h(new ejvr() { // from class: ayfp
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ekrg ekrgVar = ResumeRcsFileTransferAction.a;
                                boolean zEquals = ((chvf) obj2).equals(chvf.i);
                                MessageCoreData messageCoreData3 = messageCoreData2;
                                String str = strR;
                                if (zEquals) {
                                    ekrw ekrwVarJ3 = ResumeRcsFileTransferAction.a.j();
                                    ekrwVarJ3.X(eksq.a, "BugleDataModel");
                                    ekrd ekrdVar4 = (ekrd) ekrwVarJ3;
                                    ekrdVar4.X(cqnc.b, messageCoreData3.C());
                                    ekrdVar4.X(cqnc.f, messageCoreData3.F());
                                    ekrdVar4.X(coie.a, str);
                                    ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeUploadForChatApi", 325, "ResumeRcsFileTransferAction.java")).q("Resume upload successfully queued.");
                                    return ayfs.UPLOAD_RESUME_SUCCESS;
                                }
                                ekrw ekrwVarE2 = ResumeRcsFileTransferAction.a.e();
                                ekrwVarE2.X(eksq.a, "BugleDataModel");
                                ekrd ekrdVar5 = (ekrd) ekrwVarE2;
                                ekrdVar5.X(cqnc.b, messageCoreData3.C());
                                ekrdVar5.X(cqnc.f, messageCoreData3.F());
                                ekrdVar5.X(coie.a, str);
                                ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeUploadForChatApi", 333, "ResumeRcsFileTransferAction.java")).q("Resume upload not successfully queued.");
                                return ayfs.UPLOAD_RESUME_FAILED;
                            }
                        }, resumeRcsFileTransferAction.f);
                    }
                    ekrw ekrwVarE2 = ResumeRcsFileTransferAction.a.e();
                    ekrwVarE2.X(eksq.a, "BugleDataModel");
                    ekrd ekrdVar4 = (ekrd) ekrwVarE2;
                    ekrdVar4.X(cqnc.b, messageCoreData2.C());
                    ekrdVar4.X(cqnc.f, messageCoreData2.F());
                    ekrdVar4.X(coie.a, strR);
                    ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeDownloadForChatApi", 345, "ResumeRcsFileTransferAction.java")).q("Resuming download.");
                    eiju eijuVarC = resumeRcsFileTransferAction.i.a().c(strR);
                    ejvr ejvrVar = new ejvr() { // from class: ayfj
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            conb conbVar = (conb) obj2;
                            ekrw ekrwVarE3 = ResumeRcsFileTransferAction.a.e();
                            ekrwVarE3.X(eksq.a, "BugleDataModel");
                            ekrd ekrdVar5 = (ekrd) ekrwVarE3;
                            MessageCoreData messageCoreData3 = messageCoreData2;
                            ekrdVar5.X(cqnc.b, messageCoreData3.C());
                            ekrdVar5.X(cqnc.f, messageCoreData3.F());
                            ekrdVar5.X(coie.a, strR);
                            ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeDownloadForChatApi", 356, "ResumeRcsFileTransferAction.java")).q("Resume download successfully queued.");
                            return conbVar != null ? ayfs.DOWNLOAD_RESUME_SUCCESS : ayfs.DOWNLOAD_RESUME_FAILED;
                        }
                    };
                    eosc eoscVar2 = resumeRcsFileTransferAction.f;
                    return eijuVarC.h(ejvrVar, eoscVar2).e(cond.class, new ejvr() { // from class: ayfk
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrw ekrwVarJ3 = ResumeRcsFileTransferAction.a.j();
                            ekrwVarJ3.X(eksq.a, "BugleDataModel");
                            ekrd ekrdVar5 = (ekrd) ekrwVarJ3;
                            MessageCoreData messageCoreData3 = messageCoreData2;
                            ekrdVar5.X(cqnc.b, messageCoreData3.C());
                            ekrdVar5.X(cqnc.f, messageCoreData3.F());
                            ((ekrd) ((ekrd) ekrdVar5.g((cond) obj2)).h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeDownloadForChatApi", 373, "ResumeRcsFileTransferAction.java")).q("Cannot resume download for rcs file transfer.");
                            return ayfs.DOWNLOAD_RESUME_FAILED;
                        }
                    }, eoscVar2);
                }
                final aucj aucjVarK = cokkVar.k();
                if (aucjVarK == null) {
                    ekrw ekrwVarJ3 = ResumeRcsFileTransferAction.a.j();
                    ekrwVarJ3.X(eksq.a, "BugleDataModel");
                    ekrd ekrdVar5 = (ekrd) ekrwVarJ3;
                    ekrdVar5.X(cqnc.b, messageCoreData2.C());
                    ekrdVar5.X(cqnc.f, messageCoreData2.F());
                    ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsyncForChatApi", 266, "ResumeRcsFileTransferAction.java")).q("File transfer bind data for manual download does not have file information");
                    return eijx.e(ayfs.NO_FILE_TRANSFER_BIND_DATA);
                }
                ekrw ekrwVarE3 = ResumeRcsFileTransferAction.a.e();
                ekrwVarE3.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar6 = (ekrd) ekrwVarE3;
                ekrdVar6.X(cqnc.b, messageCoreData2.C());
                ekrdVar6.X(cqnc.f, messageCoreData2.F());
                ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "startDownloadForChatApi", 385, "ResumeRcsFileTransferAction.java")).q("Starting manual download.");
                coqf coqfVar = (coqf) coqg.a.createBuilder();
                String strF = messageCoreData2.F().f();
                coqfVar.copyOnWrite();
                ((coqg) coqfVar.instance).b = strF;
                final coqg coqgVar = (coqg) coqfVar.build();
                efir efirVarC = ((FileInformation) new atam().fM(aucjVarK)).c();
                efirVarC.d(efis.FILE);
                final FileInformation fileInformationI = efirVarC.i();
                final conr conrVarA = resumeRcsFileTransferAction.i.a();
                Runnable runnable = new Runnable() { // from class: ayfl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResumeRcsFileTransferAction resumeRcsFileTransferAction2 = resumeRcsFileTransferAction;
                        aucj aucjVar = aucjVarK;
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        if (messageCoreData3.ct()) {
                            resumeRcsFileTransferAction2.g.e(messageCoreData3, 4, aucjVar.f);
                        } else {
                            resumeRcsFileTransferAction2.g.e(messageCoreData3, 3, aucjVar.f);
                        }
                    }
                };
                eosc eoscVar3 = resumeRcsFileTransferAction.e;
                eiju eijuVarI = eijx.f(runnable, eoscVar3).i(new eooz() { // from class: ayfm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return conrVarA.a(messageCoreData2.C(), fileInformationI, coqgVar.toByteString());
                    }
                }, eoscVar3);
                ejvr ejvrVar2 = new ejvr() { // from class: ayfn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrw ekrwVarE4 = ResumeRcsFileTransferAction.a.e();
                        ekrwVarE4.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar7 = (ekrd) ekrwVarE4;
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        ekrdVar7.X(cqnc.b, messageCoreData3.C());
                        ekrdVar7.X(cqnc.f, messageCoreData3.F());
                        ekrdVar7.X(coie.a, ((conb) obj2).a());
                        ((ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "startDownloadForChatApi", 394, "ResumeRcsFileTransferAction.java")).q("Manual download successfully queued.");
                        return ayfs.DOWNLOAD_START_SUCCESS;
                    }
                };
                eosc eoscVar4 = resumeRcsFileTransferAction.f;
                return eijuVarI.h(ejvrVar2, eoscVar4).e(cond.class, new ejvr() { // from class: ayfo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrw ekrwVarJ4 = ResumeRcsFileTransferAction.a.j();
                        ekrwVarJ4.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar7 = (ekrd) ((ekrd) ekrwVarJ4).g((cond) obj2);
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        ekrdVar7.X(cqnc.b, messageCoreData3.C());
                        ekrdVar7.X(cqnc.f, messageCoreData3.F());
                        ((ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "startDownloadForChatApi", 405, "ResumeRcsFileTransferAction.java")).q("Cannot start manual download.");
                        return ayfs.DOWNLOAD_START_FAILED;
                    }
                }, eoscVar4);
            }
        }, eoscVar).h(new ejvr() { // from class: ayfh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ayfs ayfsVar = (ayfs) obj;
                ayfs ayfsVar2 = ayfs.NO_FILE_TRANSFER_BIND_DATA;
                boolean z = ayfsVar.h;
                ResumeRcsFileTransferAction resumeRcsFileTransferAction = this.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                if (!z) {
                    if (baui.n(messageCoreData2.k())) {
                        resumeRcsFileTransferAction.d.c("Bugle.Rcs.Files.Transfer.Outgoing.Resumed.Counts");
                    }
                    return ayfsVar;
                }
                Instant instantF = resumeRcsFileTransferAction.c.f();
                if (messageCoreData2.a() < ((Integer) axnw.a.e()).intValue()) {
                    messageCoreData2.aX(instantF);
                } else {
                    messageCoreData2.bb(instantF.toEpochMilli());
                }
                baxe baxeVar = (baxe) resumeRcsFileTransferAction.b.b();
                ConversationIdType conversationIdTypeA = messageCoreData2.A();
                MessageIdType messageIdTypeC = messageCoreData2.C();
                String[] strArr = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("ResumeRcsFileTransferAction#updateMessageRow");
                brduVar.U(messageCoreData2.k());
                brduVar.O(messageCoreData2.r());
                brduVar.D(messageCoreData2.n());
                brduVar.t(messageCoreData2.l());
                baxeVar.R(conversationIdTypeA, messageIdTypeC, brduVar);
                axtl.d(aypw.c(messageCoreData2), resumeRcsFileTransferAction);
                return ayfsVar;
            }
        }, eoscVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ResumeRcsFileTransferAction(fcsu fcsuVar, cogw cogwVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, cohh cohhVar, coor coorVar, fcsu fcsuVar2, atgy atgyVar, MessageIdType messageIdType) {
        super(elgm.RESUME_RCS_FILE_TRANSFER_ACTION);
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = ainsVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.i = cohhVar;
        this.g = coorVar;
        this.h = fcsuVar2;
        this.j = atgyVar;
        this.v.v("message_id", messageIdType.b());
    }
}
