package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.atgy;
import defpackage.axsw;
import defpackage.axsx;
import defpackage.cohh;
import defpackage.cqaz;
import defpackage.craf;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekrg;
import defpackage.elgm;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.fcsu;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PauseRcsFileTransferAction extends Action<Void> {
    public final eosc b;
    public final fcsu c;
    public final fcsu d;
    public final cohh e;
    public final atgy f;
    private final Context g;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axsw();

    /* compiled from: PG */
    public interface a {
        axsx hR();
    }

    public PauseRcsFileTransferAction(Context context, eosc eoscVar, fcsu fcsuVar, cohh cohhVar, fcsu fcsuVar2, atgy atgyVar, Parcel parcel) {
        super(parcel, elgm.PAUSE_RCS_FILE_TRANSFER_ACTION);
        this.g = context;
        this.b = eoscVar;
        this.c = fcsuVar;
        this.e = cohhVar;
        this.d = fcsuVar2;
        this.f = atgyVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("PauseRcsFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.PauseFileTransfer.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        if (!craf.i(this.g)) {
            return eijx.g(new Callable() { // from class: axsu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    PauseRcsFileTransferAction pauseRcsFileTransferAction = this.a;
                    MessageIdType messageIdTypeB = bary.b(pauseRcsFileTransferAction.v.l("rcs_ft_message_id"));
                    return ((aptx) pauseRcsFileTransferAction.d.b()).a() ? ((baxe) pauseRcsFileTransferAction.c.b()).w(messageIdTypeB) : ((baxe) pauseRcsFileTransferAction.c.b()).A(messageIdTypeB);
                }
            }, this.b).i(new eooz() { // from class: axsv
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final MessageCoreData messageCoreData = (MessageCoreData) obj;
                    if (messageCoreData == null) {
                        return eijx.e(null);
                    }
                    final PauseRcsFileTransferAction pauseRcsFileTransferAction = this.a;
                    if (((aptx) pauseRcsFileTransferAction.d.b()).a() && messageCoreData.cS()) {
                        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
                        if (messagePartCoreDataH == null) {
                            ekrw ekrwVarI = PauseRcsFileTransferAction.a.i();
                            ekrwVarI.X(eksq.a, "BugleDataModel");
                            ekrd ekrdVar = (ekrd) ekrwVarI;
                            ekrdVar.X(cqnc.b, messageCoreData.C());
                            ekrdVar.X(cqnc.f, messageCoreData.F());
                            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", 155, "PauseRcsFileTransferAction.java")).q("Attachment is null. Nothing to pause for outgoing message.");
                            return eijx.e(null);
                        }
                        athh athhVarZ = messagePartCoreDataH.z();
                        if (athhVarZ != null) {
                            ekrw ekrwVarH = PauseRcsFileTransferAction.a.h();
                            ekrwVarH.X(eksq.a, "BugleDataModel");
                            ekrd ekrdVar2 = (ekrd) ekrwVarH;
                            ekrdVar2.X(cqnc.b, messageCoreData.C());
                            ekrdVar2.X(cqnc.f, messageCoreData.F());
                            ekrdVar2.X(coie.j, athhVarZ);
                            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", 164, "PauseRcsFileTransferAction.java")).q("Pausing processing for outgoing message.");
                            atgy atgyVar = pauseRcsFileTransferAction.f;
                            return auvw.i(atgyVar.b, new atgv(atgyVar, athhVarZ, messageCoreData, null));
                        }
                        ekrw ekrwVarJ = PauseRcsFileTransferAction.a.j();
                        ekrwVarJ.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar3 = (ekrd) ekrwVarJ;
                        ekrdVar3.X(cqnc.b, messageCoreData.C());
                        ekrdVar3.X(cqnc.f, messageCoreData.F());
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", 170, "PauseRcsFileTransferAction.java")).q("ProcessingId is null for outgoing message to pause.");
                    }
                    colw colwVarB = comb.b();
                    colwVarB.A("pauseFileTransferForChatApi");
                    colf colfVar = comb.c;
                    colwVarB.c(colfVar.b, colfVar.c);
                    colwVarB.e(new Function() { // from class: axsr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            coma comaVar = (coma) obj2;
                            comaVar.b(messageCoreData.C());
                            return comaVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    cokk cokkVar = (cokk) colwVarB.b().l();
                    if (cokkVar == null) {
                        ekrw ekrwVarJ2 = PauseRcsFileTransferAction.a.j();
                        ekrwVarJ2.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar4 = (ekrd) ekrwVarJ2;
                        ekrdVar4.X(cqnc.b, messageCoreData.C());
                        ekrdVar4.X(cqnc.f, messageCoreData.F());
                        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", 187, "PauseRcsFileTransferAction.java")).q("No file transfer bind data found. Cannot pause file transfer.");
                        return eijx.e(null);
                    }
                    if (comc.UPLOAD.equals(cokkVar.p())) {
                        covy covyVarB = pauseRcsFileTransferAction.e.b();
                        String strR = cokkVar.r();
                        strR.getClass();
                        return covyVarB.a(strR);
                    }
                    conr conrVarA = pauseRcsFileTransferAction.e.a();
                    String strR2 = cokkVar.r();
                    strR2.getClass();
                    return conrVarA.b(strR2).f(cond.class, new eooz() { // from class: axss
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return eijx.e(false);
                        }
                    }, eoqg.a).h(new ejvr() { // from class: axst
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            if (((Boolean) obj2).booleanValue()) {
                                return null;
                            }
                            MessageCoreData messageCoreData2 = messageCoreData;
                            PauseRcsFileTransferAction pauseRcsFileTransferAction2 = pauseRcsFileTransferAction;
                            ekrw ekrwVarH2 = PauseRcsFileTransferAction.a.h();
                            ekrwVarH2.X(eksq.a, "BugleDataModel");
                            ekrd ekrdVar5 = (ekrd) ekrwVarH2;
                            ekrdVar5.X(cqnc.b, messageCoreData2.C());
                            ekrdVar5.X(cqnc.f, messageCoreData2.F());
                            ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "updateMessageStatusForFailedPause", 224, "PauseRcsFileTransferAction.java")).q("No ongoing file transfer to pause so changing to manual download.");
                            messageCoreData2.bU(110);
                            ((baxe) pauseRcsFileTransferAction2.c.b()).U(messageCoreData2);
                            return null;
                        }
                    }, pauseRcsFileTransferAction.b);
                }
            }, eoqg.a);
        }
        cqaz.c("PauseRcsFileTransferAction. Secondary user can't pause a file transfer");
        return eijx.e(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public PauseRcsFileTransferAction(Context context, eosc eoscVar, fcsu fcsuVar, cohh cohhVar, fcsu fcsuVar2, atgy atgyVar, MessageIdType messageIdType) {
        super(elgm.PAUSE_RCS_FILE_TRANSFER_ACTION);
        this.g = context;
        this.b = eoscVar;
        this.c = fcsuVar;
        this.e = cohhVar;
        this.d = fcsuVar2;
        this.f = atgyVar;
        this.v.v("rcs_ft_message_id", messageIdType.b());
    }
}
