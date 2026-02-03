package com.google.android.apps.messaging.shared.util;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.axcy;
import defpackage.aymo;
import defpackage.bakt;
import defpackage.barn;
import defpackage.bbdl;
import defpackage.byeb;
import defpackage.byed;
import defpackage.cogw;
import defpackage.cpeg;
import defpackage.cpeh;
import defpackage.cqaz;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class LegacyGroupProtocolSwitchAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new cpeg();
    private final fcsu a;
    private final byeb b;
    private final bbdl c;
    private final cogw d;

    /* compiled from: PG */
    public interface a {
        cpeh hO();
    }

    public LegacyGroupProtocolSwitchAction(fcsu<bakt> fcsuVar, byeb byebVar, bbdl bbdlVar, cogw cogwVar, Parcel parcel) {
        super(parcel, elgm.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION);
        this.a = fcsuVar;
        this.b = byebVar;
        this.c = bbdlVar;
        this.d = cogwVar;
    }

    private final List h(ConversationIdType conversationIdType, String str) {
        ArrayList arrayList = new ArrayList();
        for (ParticipantsTable.BindData bindData : ((bakt) this.a.b()).K(conversationIdType)) {
            if (!str.equals(bindData.R())) {
                arrayList.add(bindData);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("LegacyGroupProtocolSwitchAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.LegacyGroupProtocolSwitch.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        int i;
        aymo aymoVar = this.v;
        ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
        byeb byebVar = this.b;
        int iA = aymoVar.a("sub_id");
        int iA2 = aymoVar.a("recipient_count");
        boolean zY = aymoVar.y("is_rcs");
        String strL = aymoVar.l("self_id");
        int i2 = byebVar.i(false, conversationIdTypeB, zY, false, iA2, iA);
        if (byed.e(i2)) {
            axcy axcyVarF = this.c.f(iA);
            List listH = h(conversationIdTypeB, strL);
            cqaz.k(byed.e(i2));
            long jH = ((bakt) byebVar.d.b()).h(conversationIdTypeB);
            byebVar.k(Optional.empty(), conversationIdTypeB, axcyVarF, axcyVarF.a(), listH, i2, jH == 0 ? byebVar.f.f().toEpochMilli() : jH + 1, -1L);
            return null;
        }
        if (i2 == 204) {
            i = i2;
        } else {
            if (i2 != 205) {
                return null;
            }
            i = 205;
        }
        long jH2 = ((bakt) this.a.b()).h(conversationIdTypeB);
        byebVar.p(Optional.empty(), conversationIdTypeB, h(conversationIdTypeB, strL), i, jH2 == 0 ? this.d.f().toEpochMilli() : jH2 + 1);
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public LegacyGroupProtocolSwitchAction(fcsu<bakt> fcsuVar, byeb byebVar, bbdl bbdlVar, cogw cogwVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i, int i2, boolean z) {
        super(elgm.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION);
        this.v.v("conversation_id", conversationIdType.a());
        if (selfIdentityId != null) {
            this.v.v("self_id", selfIdentityId.b());
        }
        this.v.r("sub_id", i);
        this.v.r("recipient_count", i2);
        this.v.p("is_rcs", z);
        this.a = fcsuVar;
        this.b = byebVar;
        this.c = bbdlVar;
        this.d = cogwVar;
    }
}
