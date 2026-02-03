package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import defpackage.ajhd;
import defpackage.apwz;
import defpackage.axnw;
import defpackage.axtl;
import defpackage.axwx;
import defpackage.aymo;
import defpackage.aypt;
import defpackage.aypw;
import defpackage.ayqn;
import defpackage.basd;
import defpackage.bbfn;
import defpackage.cgbn;
import defpackage.cggg;
import defpackage.chtu;
import defpackage.cogw;
import defpackage.coyz;
import defpackage.cqaz;
import defpackage.cqnc;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejwk;
import defpackage.ejxr;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.emws;
import defpackage.emwy;
import defpackage.evrr;
import defpackage.evwl;
import defpackage.fcsu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ProcessFileTransferAction extends Action<Void> {
    public final ayqn b;
    public final fcsu c;
    public final fcsu d;
    public final cogw e;
    public final ajhd f;
    public final Optional g;
    public final fcsu h;
    private final cggg i;
    private final bbfn j;
    private final dqsn k;
    private final coyz l;
    private final fcsu m;
    private final fcsu n;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axwx();

    /* compiled from: PG */
    public interface a {
        aypt be();
    }

    /* compiled from: PG */
    public interface b {
        cgbn bY();
    }

    public ProcessFileTransferAction(bbfn bbfnVar, ayqn ayqnVar, cggg cgggVar, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, ajhd ajhdVar, dqsn dqsnVar, Optional optional, coyz coyzVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, Event event) {
        super(elgm.PROCESS_FILE_TRANSFER_ACTION);
        this.j = bbfnVar;
        this.b = ayqnVar;
        this.i = cgggVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = cogwVar;
        this.f = ajhdVar;
        this.k = dqsnVar;
        this.g = optional;
        this.l = coyzVar;
        this.h = fcsuVar3;
        this.n = fcsuVar4;
        this.m = fcsuVar5;
        if (event instanceof FileTransferEvent) {
            this.v.t("key_rcs_file_transfer_event", event);
        } else {
            cqaz.c("ProcessFileTransferAction: unexpected event ".concat(event.toString()));
        }
    }

    public static boolean l(MessageCoreData messageCoreData, long j) {
        int i = (int) j;
        return (i == 11 || i == 201 || i == 202 || messageCoreData.a() >= ((Integer) axnw.a.e()).intValue()) ? false : true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        final FileTransferEvent fileTransferEvent = (FileTransferEvent) this.v.h("key_rcs_file_transfer_event");
        eieu eieuVarK = eiiy.k("ProcessFileTransferAction.executeAction");
        try {
            final basd basdVarA = basd.a(fileTransferEvent.a);
            MessageCoreData messageCoreData = (MessageCoreData) ((Optional) this.k.c("ProcessFileTransferAction#processResult", new ejxr() { // from class: axww
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0152, code lost:
                
                    if (r1 != r2.k()) goto L56;
                 */
                @Override // defpackage.ejxr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object get() {
                    /*
                        Method dump skipped, instructions count: 741
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.axww.get():java.lang.Object");
                }
            })).orElse(null);
            if (messageCoreData != null) {
                ConversationIdType conversationIdTypeA = messageCoreData.A();
                int iD = messageCoreData.d();
                if (messageCoreData.cD()) {
                    this.i.d();
                }
                if (messageCoreData.cD()) {
                    this.j.c(conversationIdTypeA, false, 0, iD, h(messageCoreData), !messageCoreData.cK());
                }
                String strAx = messageCoreData.ax();
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(cqnc.s, conversationIdTypeA);
                ekrdVar.X(cqnc.b, messageCoreData.C());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessFileTransferAction", "processResult", 284, "ProcessFileTransferAction.java")).M("process Result. %s %s. eventCode: %d, retryAfter: %s, status: %s, info: %d, autoRetryCounter: %d.", messageCoreData.ao(), ejwk.b(strAx), Integer.valueOf(fileTransferEvent.h), fileTransferEvent.b, messageCoreData.aD(), Long.valueOf(fileTransferEvent.i), Integer.valueOf(messageCoreData.a()));
                if (!messageCoreData.dd() && !messageCoreData.cz()) {
                    axtl.e(aypw.c(messageCoreData), fileTransferEvent.b, this);
                }
            }
            eieuVarK.close();
            return null;
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessFileTransfer.ExecuteAction.Latency";
    }

    public final int h(MessageCoreData messageCoreData) {
        if (!((apwz) this.n.b()).a()) {
            return -1;
        }
        return ((chtu) this.m.b()).a(messageCoreData.w());
    }

    public final void j(MessageCoreData messageCoreData) {
        aymo aymoVar = this.v;
        this.l.b(messageCoreData, !aymoVar.x("key_failed_file_transfer_diagnostics") ? emwy.a : (emwy) ((evwl) aymoVar.h("key_failed_file_transfer_diagnostics")).a(emwy.a, evrr.a()), !aymoVar.x("key_failed_file_transfer_details") ? emws.a : (emws) ((evwl) aymoVar.h("key_failed_file_transfer_details")).a(emws.a, evrr.a()), Optional.empty());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessFileTransferAction(bbfn bbfnVar, ayqn ayqnVar, cggg cgggVar, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, ajhd ajhdVar, dqsn dqsnVar, Optional optional, fcsu fcsuVar3, coyz coyzVar, fcsu fcsuVar4, fcsu fcsuVar5, Parcel parcel) {
        super(parcel, elgm.PROCESS_FILE_TRANSFER_ACTION);
        this.j = bbfnVar;
        this.b = ayqnVar;
        this.i = cgggVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = cogwVar;
        this.f = ajhdVar;
        this.k = dqsnVar;
        this.g = optional;
        this.h = fcsuVar3;
        this.l = coyzVar;
        this.n = fcsuVar4;
        this.m = fcsuVar5;
    }
}
