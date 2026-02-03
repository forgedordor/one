package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aykn;
import defpackage.aymo;
import defpackage.ayox;
import defpackage.bakt;
import defpackage.barn;
import defpackage.bote;
import defpackage.botm;
import defpackage.bvdp;
import defpackage.bxlc;
import defpackage.byeb;
import defpackage.cqaz;
import defpackage.dqru;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateConversationOptionsAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aykn();
    private final fcsu a;
    private final byeb b;
    private final bxlc c;

    /* compiled from: PG */
    public interface a {
        ayox aQ();
    }

    public UpdateConversationOptionsAction(fcsu fcsuVar, byeb byebVar, bxlc bxlcVar, Parcel parcel) {
        super(parcel, elgm.UPDATE_CONVERSATION_OPTIONS_ACTION);
        this.a = fcsuVar;
        this.b = byebVar;
        this.c = bxlcVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateConversationOptionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        aymo aymoVar = this.v;
        ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
        bakt baktVar = (bakt) this.a.b();
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("putOptionValues");
        if (aymoVar.x("enable_notification")) {
            boteVar.a.put("notification_enabled", Boolean.valueOf(aymoVar.y("enable_notification")));
        }
        if (aymoVar.x("ringtone_uri")) {
            dqru.v(boteVar.a, "notification_sound_uri", aymoVar.l("ringtone_uri"));
        }
        if (aymoVar.x("enable_vibration")) {
            boteVar.a.put("notification_vibration", Boolean.valueOf(aymoVar.y("enable_vibration")));
        }
        if (aymoVar.x("send_mode")) {
            boteVar.V(aymoVar.a("send_mode"));
        }
        if (aymoVar.x("conv_name")) {
            String strL = aymoVar.l("conv_name");
            boteVar.C(strL);
            boteVar.D(TextUtils.isEmpty(strL) ? bvdp.NAME_IS_AUTOMATIC : bvdp.NAME_IS_MANUAL);
        }
        baktVar.aj(conversationIdTypeB, boteVar);
        if (aymoVar.x("conv_name")) {
            this.b.g(conversationIdTypeB, aymoVar.l("conv_name"));
        }
        this.c.d(conversationIdTypeB);
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationOptions.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateConversationOptionsAction(fcsu fcsuVar, byeb byebVar, bxlc bxlcVar, ConversationIdType conversationIdType, Boolean bool, String str, Boolean bool2, Integer num) {
        super(elgm.UPDATE_CONVERSATION_OPTIONS_ACTION);
        this.a = fcsuVar;
        this.b = byebVar;
        this.c = bxlcVar;
        cqaz.l(conversationIdType);
        this.v.v("conversation_id", conversationIdType.a());
        if (bool != null) {
            this.v.p("enable_notification", bool.booleanValue());
        }
        if (str != null) {
            this.v.v("ringtone_uri", str);
        }
        if (bool2 != null) {
            this.v.p("enable_vibration", bool2.booleanValue());
        }
        if (num != null) {
            this.v.r("send_mode", num.intValue());
        }
    }
}
