package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.atxs;
import defpackage.auvh;
import defpackage.axoh;
import defpackage.axoi;
import defpackage.aymo;
import defpackage.bakt;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.eoqg;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ForwardIncomingTypingIndicatorToTachyonAction extends Action<Void> {
    private final fcsu b;
    private final atxs c;
    private static final cqce a = cqce.g("BugleNetwork", "ForwardIncomingTypingIndicatorToTachyonAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axoh();

    /* compiled from: PG */
    public interface a {
        axoi hJ();
    }

    public ForwardIncomingTypingIndicatorToTachyonAction(fcsu fcsuVar, long j, String str, boolean z, atxs atxsVar) {
        super(elgm.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION);
        this.b = fcsuVar;
        this.v.s("chat_session_id_key", j);
        if (str != null) {
            this.v.v("user_id_key", str);
        }
        this.v.p("typing_active_key", z);
        this.c = atxsVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ForwardIncomingTypingIndicatorToTachyonAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("ForwardIncomingTypingIndicatorToTachyonAction.executeAction");
        try {
            aymo aymoVar = this.v;
            ConversationIdType conversationIdTypeQ = ((bakt) this.b.b()).q(aymoVar.d("chat_session_id_key"));
            if (conversationIdTypeQ.b()) {
                a.r("Couldn't find conversation id.");
            } else {
                String strL = aymoVar.l("user_id_key");
                if (strL != null) {
                    this.c.a(conversationIdTypeQ, strL, aymoVar.y("typing_active_key")).k(auvh.b(), eoqg.a);
                }
            }
            eieuVarK.close();
            return null;
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
    public final String c() {
        return "Bugle.DataModel.Action.ForwardIncomingTypingIndicatorToTachyon.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ForwardIncomingTypingIndicatorToTachyonAction(fcsu fcsuVar, atxs atxsVar, Parcel parcel) {
        super(parcel, elgm.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION);
        this.b = fcsuVar;
        this.c = atxsVar;
    }
}
