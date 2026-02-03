package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ajsn;
import defpackage.avmp;
import defpackage.axtl;
import defpackage.axxy;
import defpackage.aydu;
import defpackage.aymo;
import defpackage.aypl;
import defpackage.ayqd;
import defpackage.ayqh;
import defpackage.ayqj;
import defpackage.bakt;
import defpackage.bary;
import defpackage.baxe;
import defpackage.bojh;
import defpackage.brdu;
import defpackage.cggg;
import defpackage.cgpi;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RedownloadMessageAction extends Action<Void> implements Parcelable {
    private final Context c;
    private final fcsu d;
    private final cogw e;
    private final avmp f;
    private final ayqj g;
    private final axxy h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private static final cqce a = cqce.g("BugleDataModel", "RedownloadMessageAction");
    private static final eksp b = eksp.c("BugleNotifications");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aydu();

    /* compiled from: PG */
    public interface a {
        aypl aZ();
    }

    public RedownloadMessageAction(Context context, fcsu fcsuVar, cogw cogwVar, avmp avmpVar, ayqj ayqjVar, axxy axxyVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, Parcel parcel) {
        super(parcel, elgm.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = fcsuVar;
        this.e = cogwVar;
        this.f = avmpVar;
        this.g = ayqjVar;
        this.h = axxyVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.l = fcsuVar5;
    }

    private final void h(MessageCoreData messageCoreData, int i) {
        long epochMilli = this.e.f().toEpochMilli();
        baxe baxeVar = (baxe) this.d.b();
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        MessageIdType messageIdTypeC = messageCoreData.C();
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("RedownloadMessageAction#updateMessageStatus");
        brduVar.U(i);
        brduVar.I(epochMilli);
        baxeVar.R(conversationIdTypeA, messageIdTypeC, brduVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("RedownloadMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        aymo aymoVar = this.v;
        MessageCoreData messageCoreDataW = ((baxe) this.d.b()).w(bary.b(aymoVar.l("message_id")));
        if (aymoVar.y("open_conv") && messageCoreDataW != null && !messageCoreDataW.A().b()) {
            boolean zBooleanValue = ((Boolean) messageCoreDataW.af().map(new Function() { // from class: aydt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((alqm) obj).A());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false)).booleanValue();
            avmp avmpVar = this.f;
            Context context = this.c;
            ConversationIdType conversationIdTypeA = messageCoreDataW.A();
            bojh bojhVarR = ((bakt) this.l.b()).r(conversationIdTypeA);
            context.startActivity(avmpVar.o(context, ((ajsn) this.k.b()).a(conversationIdTypeA, bojhVarR == null ? null : bojhVarR.ab(), zBooleanValue), null, false));
        }
        if (messageCoreDataW == null || ((!messageCoreDataW.ci() || messageCoreDataW.d() == 1) && !messageCoreDataW.cw())) {
            if (messageCoreDataW == null) {
                a.n("The message to be downloaded is null.");
            } else {
                cqbd cqbdVarB = a.b();
                cqbdVarB.I("Attempt to re-download an un-redownloadable message:");
                cqbdVarB.A("status", messageCoreDataW.aD());
                cqbdVarB.A("protocol", messageCoreDataW.ax());
                cqbdVarB.r();
                messageCoreDataW = null;
            }
        } else if (messageCoreDataW.cX()) {
            h(messageCoreDataW, 103);
            Action actionA = ayqh.a(this.g, messageCoreDataW);
            if (actionA != null) {
                actionA.B(this);
            }
        } else {
            h(messageCoreDataW, 102);
            axxy.b(this.h.j.a(messageCoreDataW, null), true);
            axtl.d(6, this);
        }
        if (!aymoVar.y("should_cancel_notification") || messageCoreDataW == null) {
            ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/shared/datamodel/action/RedownloadMessageAction", "executeAction", 258, "RedownloadMessageAction.java")).q("Creating notification from RedownloadMessageAction");
            ((cgpi) this.i.b()).d();
        } else {
            ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/shared/datamodel/action/RedownloadMessageAction", "executeAction", 254, "RedownloadMessageAction.java")).q("Canceling incoming message notification from redwonload message action");
            ((cgpi) this.i.b()).a(messageCoreDataW.A());
        }
        ((cggg) this.j.b()).b();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RedownloadMms.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RedownloadMessageAction(Context context, fcsu<baxe> fcsuVar, cogw cogwVar, avmp avmpVar, ayqj ayqjVar, ayqd ayqdVar, axxy axxyVar, fcsu<cgpi> fcsuVar2, fcsu<cggg> fcsuVar3, fcsu<ajsn> fcsuVar4, fcsu<bakt> fcsuVar5, MessageIdType messageIdType, boolean z) {
        super(elgm.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = fcsuVar;
        this.e = cogwVar;
        this.f = avmpVar;
        this.g = ayqjVar;
        this.h = axxyVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.l = fcsuVar5;
        this.v.v("message_id", messageIdType.b());
        this.v.p("open_conv", z);
        this.v.p("should_cancel_notification", false);
    }

    public RedownloadMessageAction(Context context, fcsu<baxe> fcsuVar, cogw cogwVar, avmp avmpVar, ayqj ayqjVar, ayqd ayqdVar, axxy axxyVar, fcsu<cgpi> fcsuVar2, fcsu<cggg> fcsuVar3, fcsu<ajsn> fcsuVar4, fcsu<bakt> fcsuVar5, MessageIdType messageIdType, boolean z, boolean z2) {
        super(elgm.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = fcsuVar;
        this.e = cogwVar;
        this.f = avmpVar;
        this.g = ayqjVar;
        this.h = axxyVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.l = fcsuVar5;
        this.v.v("message_id", messageIdType.b());
        this.v.p("open_conv", z);
        this.v.p("should_cancel_notification", z2);
    }
}
