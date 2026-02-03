package com.google.android.apps.messaging.wearable.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.wearable.action.RequestMoreMessagesAction;
import defpackage.aymo;
import defpackage.barn;
import defpackage.cqtf;
import defpackage.cszv;
import defpackage.cszw;
import defpackage.cszx;
import defpackage.ctak;
import defpackage.dapx;
import defpackage.defe;
import defpackage.defh;
import defpackage.defn;
import defpackage.denz;
import defpackage.deoe;
import defpackage.deur;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiko;
import defpackage.eksp;
import defpackage.elgm;
import defpackage.eosc;
import defpackage.fcsu;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RequestMoreMessagesAction extends Action<Void> {
    public ctak b;
    public fcsu c;
    private Context d;
    private deoe e;
    private cszw f;
    private cszx g;
    private eosc h;
    public static final eksp a = eksp.c("BugleWearable");
    public static final Parcelable.Creator<RequestMoreMessagesAction> CREATOR = new dapx();

    /* compiled from: PG */
    public interface a {
        Context T();

        cszw cX();

        cszx cY();

        ctak cZ();

        deoe dl();

        fcsu gv();

        eosc r();
    }

    public RequestMoreMessagesAction(Parcel parcel) {
        super(parcel, elgm.REQUEST_MORE_MESSAGES_ACTION);
        h();
    }

    private final void h() {
        a aVar = (a) cqtf.a(a.class);
        this.d = aVar.T();
        this.e = aVar.dl();
        this.f = aVar.cX();
        this.g = aVar.cY();
        this.b = aVar.cZ();
        this.c = aVar.gv();
        this.h = aVar.r();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("RequestMoreMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RequestMoreMessagesAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        aymo aymoVar = this.v;
        ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversationId"));
        int iA = aymoVar.a("offset");
        String strL = aymoVar.l("nodeId");
        cszx cszxVar = this.g;
        fcsu fcsuVar = cszxVar.a;
        fcsu fcsuVar2 = cszxVar.b;
        cszv cszvVar = new cszv(new denz());
        cszvVar.d(conversationIdTypeB);
        ArrayList arrayListB = this.f.b(cszvVar, null, null, iA, this.d);
        denz denzVar = new denz();
        denzVar.n("1", conversationIdTypeB.a());
        denzVar.k("6", arrayListB);
        final String string = UUID.randomUUID().toString();
        denzVar.n("39", string);
        defn defnVarA = this.e.a(strL, "/bugle/rpc/more_messages/", deur.b(denzVar).a.toByteArray());
        defnVarA.q(this.h, eiko.b(new defh() { // from class: dapv
            @Override // defpackage.defh
            public final void e(Object obj) {
                RequestMoreMessagesAction requestMoreMessagesAction = this.a;
                ((ains) requestMoreMessagesAction.b.b.b()).e("Bugle.Wear.Rpc.Outgoing.Count", ((Integer) ctak.a.getOrDefault("/bugle/rpc/more_messages/", 0)).intValue());
                ctam ctamVar = (ctam) requestMoreMessagesAction.c.b();
                int iIntValue = ((Integer) obj).intValue();
                String str = string;
                str.getClass();
                if (ctamVar.b()) {
                    ctamVar.c(2, "/bugle/rpc/more_messages/", str, null, iIntValue >= 0 ? ctam.b : ctam.c);
                }
            }
        }));
        defnVarA.p(this.h, eiko.a(new defe() { // from class: dapw
            @Override // defpackage.defe
            public final void d(Exception exc) {
                eksl ekslVar = (eksl) ((eksl) RequestMoreMessagesAction.a.j()).g(exc);
                ekslVar.X(cqnc.S, "RequestMoreMessagesAction");
                ekslVar.X(ctbs.c, "/bugle/rpc/more_messages/");
                ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/action/RequestMoreMessagesAction", "doBackgroundWork", 197, "RequestMoreMessagesAction.java")).q("Failed to send message to path");
                ctam ctamVar = (ctam) this.a.c.b();
                String str = string;
                str.getClass();
                if (ctamVar.b()) {
                    ctamVar.c(2, "/bugle/rpc/more_messages/", str, null, ctamVar.a(exc));
                }
            }
        }));
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RequestMoreMessagesAction(String str, ConversationIdType conversationIdType, int i) {
        super(elgm.REQUEST_MORE_MESSAGES_ACTION);
        h();
        aymo aymoVar = this.v;
        if (aymoVar == null) {
            return;
        }
        aymoVar.v("nodeId", str);
        this.v.v("conversationId", conversationIdType.a());
        this.v.r("offset", i);
    }
}
