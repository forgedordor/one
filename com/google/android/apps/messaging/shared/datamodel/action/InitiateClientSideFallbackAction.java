package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InitiateClientSideFallbackAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ains;
import defpackage.ajhd;
import defpackage.anpr;
import defpackage.axpi;
import defpackage.axpj;
import defpackage.axtl;
import defpackage.aymo;
import defpackage.bary;
import defpackage.baui;
import defpackage.baxe;
import defpackage.baxf;
import defpackage.bvdn;
import defpackage.chwq;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqnc;
import defpackage.cteb;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejxr;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.eljx;
import defpackage.fcsu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class InitiateClientSideFallbackAction extends Action<Boolean> {
    public final fcsu b;
    public final cogw c;
    public final ajhd d;
    public final ains e;
    public final chwq f;
    public final baxf g;
    private final cteb i;
    private final dqsn j;
    private static final ekrg h = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction");
    public static final cqce a = cqce.g("BugleAction", "InitiateClientSideFallbackAction");
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new axpi();

    /* compiled from: PG */
    public interface a {
        axpj hN();
    }

    public InitiateClientSideFallbackAction(fcsu fcsuVar, cogw cogwVar, ajhd ajhdVar, ains ainsVar, cteb ctebVar, chwq chwqVar, dqsn dqsnVar, baxf baxfVar, Parcel parcel) {
        super(parcel, elgm.INITIATE_CLIENT_SIDE_FALLBACK_ACTION);
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = ajhdVar;
        this.e = ainsVar;
        this.i = ctebVar;
        this.f = chwqVar;
        this.j = dqsnVar;
        this.g = baxfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("InitiateClientSideFallbackAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        bvdn bvdnVar;
        aymo aymoVar = this.v;
        final MessageIdType messageIdTypeB = bary.b(aymoVar.l("message_id"));
        final int iA = aymoVar.a("sub_id");
        Optional optionalOfNullable = Optional.ofNullable(eljx.b(aymoVar.a("latch_change_reason")));
        eljx eljxVar = eljx.UNKNOWN_LATCH_REASON;
        eljx eljxVar2 = (eljx) optionalOfNullable.orElse(eljxVar);
        if (eljxVar2 == eljxVar) {
            ekrw ekrwVarJ = h.j();
            ekrwVarJ.X(eksq.a, "BugleAction");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction", "getFallbackReason", 267, "InitiateClientSideFallbackAction.java")).q("Unknown latch reason");
            bvdnVar = bvdn.UNKNOWN;
        } else {
            bvdnVar = eljxVar2 == eljx.EMERGENCY_RCS_PROTOCOL_DETERMINATION_MESSAGE_FAILED ? bvdn.CFS_AUTO_FALLBACK_ON_EMERGENCY_PROTOCOL_DETERMINATION_MESSAGE : anpr.a(eljxVar2) ? bvdn.CFS_MANUAL_FALLBACK_ON_NOT_DELIVERED : bvdn.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE;
        }
        final bvdn bvdnVar2 = bvdnVar;
        final MessageCoreData messageCoreDataW = ((baxe) this.b.b()).w(messageIdTypeB);
        if (messageCoreDataW == null) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.d(messageIdTypeB);
            cqbdVarE.I("doesn't exist, cant manually fallback.");
            cqbdVarE.r();
            return Boolean.FALSE;
        }
        if (!messageCoreDataW.cX()) {
            ekrw ekrwVarJ2 = h.j();
            ekrwVarJ2.X(eksq.a, "BugleAction");
            ekrd ekrdVar = (ekrd) ekrwVarJ2;
            ekrdVar.X(cqnc.b, messageIdTypeB);
            ekrdVar.X(cqnc.f, messageCoreDataW.F());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction", "executeAction", 168, "InitiateClientSideFallbackAction.java")).q("Cannot fallback non-RCS message");
            return Boolean.FALSE;
        }
        if (baui.k(messageCoreDataW.k())) {
            cqbd cqbdVarA = a.a();
            cqbdVarA.d(messageIdTypeB);
            cqbdVarA.I("message has been delivered, should not fallback");
            cqbdVarA.r();
            return Boolean.FALSE;
        }
        if (!((Boolean) this.j.c("InitiateClientSideFallbackAction#executeAction", new ejxr() { // from class: axph
            @Override // defpackage.ejxr
            public final Object get() {
                InitiateClientSideFallbackAction initiateClientSideFallbackAction = this.a;
                baxf baxfVar = initiateClientSideFallbackAction.g;
                cogw cogwVar = initiateClientSideFallbackAction.c;
                MessageCoreData messageCoreData = messageCoreDataW;
                int i = iA;
                if (!initiateClientSideFallbackAction.f.G(messageCoreData, baxfVar.a(messageCoreData, i), i, cogwVar.f().toEpochMilli())) {
                    return Boolean.FALSE;
                }
                bvdn bvdnVar3 = bvdnVar2;
                MessageIdType messageIdType = messageIdTypeB;
                cqbd cqbdVarA2 = InitiateClientSideFallbackAction.a.a();
                cqbdVarA2.d(messageIdType);
                cqbdVarA2.A("fallback reason", bvdnVar3);
                cqbdVarA2.r();
                baxe baxeVar = (baxe) initiateClientSideFallbackAction.b.b();
                ConversationIdType conversationIdTypeA = messageCoreData.A();
                String[] strArr = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("InitiateClientSideFallbackAction#executeAction");
                int iIntValue = MessagesTable.g().intValue();
                int iIntValue2 = MessagesTable.g().intValue();
                if (iIntValue2 < 58710) {
                    dqru.x("fallback_reason", iIntValue2);
                }
                if (iIntValue >= 58710) {
                    if (bvdnVar3 == null) {
                        brduVar.a.putNull("fallback_reason");
                    } else {
                        brduVar.a.put("fallback_reason", Integer.valueOf(bvdnVar3.ordinal()));
                    }
                }
                baxeVar.V(conversationIdTypeA, messageIdType, brduVar);
                if (bvdn.CFS_MANUAL_FALLBACK_ON_NOT_DELIVERED.equals(bvdnVar3)) {
                    ((MessageData) messageCoreData).k.q();
                    initiateClientSideFallbackAction.e.c("Bugle.Rcs.Chat.Message.Fallback.Manual.Counts");
                }
                ((MessageData) messageCoreData).k.s();
                initiateClientSideFallbackAction.d.U(messageCoreData);
                return Boolean.TRUE;
            }
        })).booleanValue()) {
            return Boolean.FALSE;
        }
        axtl.d(7, this);
        this.i.b(messageCoreDataW.A(), eljxVar2);
        return Boolean.TRUE;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InitiateClientSideFallback.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public InitiateClientSideFallbackAction(fcsu fcsuVar, cogw cogwVar, ajhd ajhdVar, ains ainsVar, cteb ctebVar, chwq chwqVar, dqsn dqsnVar, baxf baxfVar, MessageIdType messageIdType, int i, eljx eljxVar) {
        super(elgm.INITIATE_CLIENT_SIDE_FALLBACK_ACTION);
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = ajhdVar;
        this.e = ainsVar;
        this.i = ctebVar;
        this.f = chwqVar;
        this.j = dqsnVar;
        this.g = baxfVar;
        this.v.v("message_id", messageIdType.b());
        this.v.r("sub_id", i);
        this.v.r("latch_change_reason", eljxVar.k);
    }
}
