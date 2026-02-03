package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.ajhd;
import defpackage.axum;
import defpackage.axun;
import defpackage.aymo;
import defpackage.cmqj;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessDeliveryReportAction extends Action<Void> implements Parcelable {
    public final fcsu a;
    public final cogw b;
    public final ajhd c;
    private final cmqj e;
    private final dqsn f;
    private static final cqce d = cqce.g("BugleDataModel", "ProcessDeliveryReportAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axum();

    /* compiled from: PG */
    public interface a {
        axun hT();
    }

    public ProcessDeliveryReportAction(fcsu fcsuVar, cogw cogwVar, cmqj cmqjVar, ajhd ajhdVar, dqsn dqsnVar, Uri uri, int i) {
        super(elgm.PROCESS_DELIVERY_REPORT_ACTION);
        this.a = fcsuVar;
        this.b = cogwVar;
        this.e = cmqjVar;
        this.c = ajhdVar;
        this.f = dqsnVar;
        this.v.t(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        this.v.r("status", i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessDeliveryReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("ProcessDeliveryReportAction.executeAction");
        try {
            aymo aymoVar = this.v;
            final Uri uri = (Uri) aymoVar.h(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            final int iA = aymoVar.a("status");
            if (ContentUris.parseId(uri) < 0) {
                cqbd cqbdVarB = d.b();
                cqbdVarB.I("can't find message.");
                cqbdVarB.A("smsMessageUri", uri);
                cqbdVarB.r();
            } else {
                final long epochMilli = this.b.f().toEpochMilli();
                this.e.K(uri, iA, epochMilli);
                this.f.d("ProcessDeliveryReportAction.executeAction", new Runnable() { // from class: axul
                    @Override // java.lang.Runnable
                    public final void run() {
                        cqce cqceVar = cmvy.a;
                        ProcessDeliveryReportAction processDeliveryReportAction = this.a;
                        fcsu fcsuVar = processDeliveryReportAction.a;
                        baxe baxeVar = (baxe) fcsuVar.b();
                        Uri uri2 = uri;
                        MessageCoreData messageCoreDataZ = baxeVar.z(uri2);
                        if (messageCoreDataZ != null) {
                            int i = iA;
                            long j = epochMilli;
                            cqaz.k(uri2.equals(messageCoreDataZ.u()));
                            baxe baxeVar2 = (baxe) fcsuVar.b();
                            ConversationIdType conversationIdTypeA = messageCoreDataZ.A();
                            MessageIdType messageIdTypeC = messageCoreDataZ.C();
                            String[] strArr = MessagesTable.a;
                            brdu brduVar = new brdu();
                            brduVar.ap("ProcessDeliveryReportAction#executeAction");
                            brduVar.U(cmvy.b(true, 2, i));
                            brduVar.O(j);
                            baxeVar2.R(conversationIdTypeA, messageIdTypeC, brduVar);
                            cogw cogwVar = processDeliveryReportAction.b;
                            processDeliveryReportAction.c.ab(messageCoreDataZ, Optional.empty(), enyw.NOT_RCS, ainm.a(cogwVar));
                        }
                    }
                });
            }
            eieuVarK.close();
            return null;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessDeliveryReport.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessDeliveryReportAction(fcsu fcsuVar, cogw cogwVar, cmqj cmqjVar, ajhd ajhdVar, dqsn dqsnVar, Parcel parcel) {
        super(parcel, elgm.PROCESS_DELIVERY_REPORT_ACTION);
        this.a = fcsuVar;
        this.b = cogwVar;
        this.e = cmqjVar;
        this.c = ajhdVar;
        this.f = dqsnVar;
    }
}
