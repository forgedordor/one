package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.ajga;
import defpackage.axls;
import defpackage.aycf;
import defpackage.aycg;
import defpackage.aydh;
import defpackage.aymo;
import defpackage.cqce;
import defpackage.dzfh;
import defpackage.dzub;
import defpackage.dzuc;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.ejvr;
import defpackage.ejwk;
import defpackage.elgm;
import defpackage.eoqg;
import defpackage.eosc;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveSmsMessageAction extends Action<Void> implements Parcelable {
    public final aydh b;
    private final eosc c;
    private final dzuc d;
    private final ajga e;
    public static final cqce a = cqce.g("BugleDataModel", "ReceiveSmsMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aycf();

    /* compiled from: PG */
    public interface a {
        /* renamed from: if */
        aycg mo80if();
    }

    public ReceiveSmsMessageAction(ContentValues contentValues, aydh aydhVar, eosc eoscVar, dzuc dzucVar, ajga ajgaVar) {
        super(elgm.RECEIVE_SMS_MESSAGE_ACTION);
        this.v.t("message_values", contentValues);
        this.b = aydhVar;
        this.c = eoscVar;
        this.d = dzucVar;
        this.e = ajgaVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReceiveSmsMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveSmsMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        aymo aymoVar = this.v;
        ContentValues contentValues = (ContentValues) aymoVar.h("message_values");
        long jE = aymoVar.e("message_logging_id", 0L);
        Integer asInteger = contentValues.getAsInteger("sub_id");
        if (asInteger == null) {
            asInteger = -1;
        }
        dzub dzubVarD = this.d.d();
        String asString = contentValues.getAsString("address");
        axls axlsVar = new axls(ejwk.b(asString), ejwk.b(asString), false);
        final aydh aydhVar = this.b;
        eiju eijuVarF = aydhVar.f(asInteger.intValue(), contentValues, jE, axlsVar);
        ejvr ejvrVar = new ejvr() { // from class: aycb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return aydhVar.b((aydc) obj);
            }
        };
        eosc eoscVar = this.c;
        eiju eijuVarH = eijuVarF.h(ejvrVar, eoscVar).h(new ejvr() { // from class: aycc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aydd ayddVar = (aydd) obj;
                if (ayddVar != null) {
                    aydh aydhVar2 = this.a.b;
                    aydhVar2.i(aydhVar2.c(ayddVar, null));
                }
                return null;
            }
        }, eoscVar);
        ejvr ejvrVar2 = new ejvr() { // from class: aycd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ReceiveSmsMessageAction.a.o("Fail to insert to telephony", (Exception) obj);
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return this.e.a(dzubVarD, eijuVarH.e(Exception.class, ejvrVar2, eoqgVar).h(new ejvr() { // from class: ayce
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ReceiveSmsMessageAction.a.l("SMS receiving END");
                return null;
            }
        }, eoqgVar), new dzfh("ReceiveSmsMessageAction#executeActionAsync"));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fT() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveSmsMessageAction(Parcel parcel, aydh aydhVar, eosc eoscVar, dzuc dzucVar, ajga ajgaVar) {
        super(parcel, elgm.RECEIVE_SMS_MESSAGE_ACTION);
        this.b = aydhVar;
        this.c = eoscVar;
        this.d = dzucVar;
        this.e = ajgaVar;
    }
}
