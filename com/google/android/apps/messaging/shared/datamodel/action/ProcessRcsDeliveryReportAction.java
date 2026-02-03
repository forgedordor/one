package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import defpackage.axyd;
import defpackage.axye;
import defpackage.axyf;
import defpackage.aymo;
import defpackage.basd;
import defpackage.cbqz;
import defpackage.ciwi;
import defpackage.cmxp;
import defpackage.cqce;
import defpackage.crrq;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.elgm;
import defpackage.elof;
import defpackage.elpg;
import defpackage.enyw;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessRcsDeliveryReportAction extends Action<Void> {
    private final axye b;
    private static final cqce a = cqce.g("BugleDataModel", "ProcessRcsDeliveryReportAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axyd();

    /* compiled from: PG */
    public interface a {
        axyf hY();
    }

    public ProcessRcsDeliveryReportAction(axye axyeVar, Parcel parcel) {
        super(parcel, elgm.PROCESS_RCS_DELIVERY_REPORT_ACTION);
        this.b = axyeVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessRcsDeliveryReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessRcsDeliveryReport.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        a.p("Executing ProcessRcsDeliveryReportAction");
        aymo aymoVar = this.v;
        return ((ciwi) this.b.a.b()).a((ChatSessionMessageEvent) aymoVar.h("chat_message_event"), cbqz.a, basd.a(aymoVar.l("imdn_rcs_message_id")), crrq.a(aymoVar.A("chat.extra.logData")));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProcessRcsDeliveryReportAction(axye axyeVar, ChatSessionMessageEvent chatSessionMessageEvent, String str) {
        elof elofVar = (elof) elpg.b.createBuilder();
        enyw enywVar = enyw.RCS_LEGACY;
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.Y = enywVar.h;
        elpgVar.d |= 2097152;
        this(axyeVar, chatSessionMessageEvent, str, (elpg) elofVar.build());
    }

    public ProcessRcsDeliveryReportAction(axye axyeVar, ChatSessionMessageEvent chatSessionMessageEvent, String str, elpg elpgVar) {
        super(elgm.PROCESS_RCS_DELIVERY_REPORT_ACTION);
        this.b = axyeVar;
        this.v.t("chat_message_event", chatSessionMessageEvent);
        this.v.p("etouffee_report", false);
        this.v.q("chat.extra.logData", elpgVar.toByteArray());
        if (((Boolean) cmxp.d.e()).booleanValue()) {
            this.v.v("imdn_rcs_message_id", str);
        }
    }
}
