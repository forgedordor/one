package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.auwc;
import defpackage.ayen;
import defpackage.ayeo;
import defpackage.ayey;
import defpackage.ayez;
import defpackage.aymo;
import defpackage.barn;
import defpackage.bary;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.crlk;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RequestSmartSuggestionsAction extends Action<Void> {
    private final fcsu b;
    private final ayez c;
    private static final cqce a = cqce.g("Bugle", "RequestSmartSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayen();

    /* compiled from: PG */
    public interface a {
        ayeo ih();
    }

    public RequestSmartSuggestionsAction(ayez ayezVar, fcsu fcsuVar, Parcel parcel) {
        super(parcel, elgm.REQUEST_P2P_CONVERSATION_SUGGESTIONS_ACTION);
        this.c = ayezVar;
        this.b = fcsuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("RequestSmartSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RequestP2pConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        if (!((crlk) this.b.b()).b()) {
            a.n("Action was called even though debug smart replies are not enabled.");
            return null;
        }
        try {
            aymo aymoVar = this.v;
            ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
            MessageIdType messageIdTypeB = bary.b(aymoVar.l("message_id"));
            int iA = aymoVar.a("context_message_count");
            ayez ayezVar = this.c;
            ayezVar.a(ayezVar.b(conversationIdTypeB, messageIdTypeB, iA)).k(auwc.a(new ayey(ayezVar, messageIdTypeB)), ayezVar.e);
            return null;
        } catch (IllegalArgumentException | IllegalStateException e) {
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Problem requesting SmartReplies.");
            cqbdVarA.A("reason", e.getMessage());
            cqbdVarA.r();
            return null;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju fQ() {
        if (!((crlk) this.b.b()).b()) {
            a.n("Action was called even though debug smart replies are not enabled.");
            return eijx.e(null);
        }
        try {
            aymo aymoVar = this.v;
            ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
            String strL = aymoVar.l("message_id");
            int iA = aymoVar.a("context_message_count");
            final ayez ayezVar = this.c;
            final MessageIdType messageIdTypeB = bary.b(strL);
            return ayezVar.a(ayezVar.b(conversationIdTypeB, messageIdTypeB, iA)).h(new ejvr() { // from class: ayew
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ayezVar.d((crbg) obj, messageIdTypeB);
                    return null;
                }
            }, ayezVar.e).e(Throwable.class, new ejvr() { // from class: ayex
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cqbd cqbdVarE = ayez.a.e();
                    cqbdVarE.I("Error in async p2p suggestions request");
                    cqbdVarE.I(messageIdTypeB);
                    cqbdVarE.s((Throwable) obj);
                    return null;
                }
            }, ayezVar.d);
        } catch (IllegalArgumentException | IllegalStateException e) {
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Problem requesting SmartReplies.");
            cqbdVarA.A("reason", e.getMessage());
            cqbdVarA.r();
            return eijx.e(null);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RequestSmartSuggestionsAction(ayez ayezVar, fcsu fcsuVar, ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        super(elgm.REQUEST_P2P_CONVERSATION_SUGGESTIONS_ACTION);
        this.c = ayezVar;
        this.b = fcsuVar;
        this.v.v("conversation_id", conversationIdType.a());
        this.v.r("context_message_count", i);
        this.v.v("message_id", messageIdType.b());
    }
}
