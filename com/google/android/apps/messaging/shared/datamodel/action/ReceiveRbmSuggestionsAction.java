package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.aybw;
import defpackage.aybx;
import defpackage.barn;
import defpackage.bary;
import defpackage.basd;
import defpackage.baxe;
import defpackage.bxlc;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveRbmSuggestionsAction extends Action<Void> implements Parcelable {
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final cogw g;
    private final bxlc h;
    private final fcsu i;
    private final fcsu j;
    private static final cqce a = cqce.g("Bugle", "ReceiveRbmSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aybw();

    /* compiled from: PG */
    public interface a {
        aybx ie();
    }

    public ReceiveRbmSuggestionsAction(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cogw cogwVar, bxlc bxlcVar, fcsu fcsuVar6, fcsu fcsuVar7, Bundle bundle) {
        super(bundle, elgm.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = cogwVar;
        this.h = bxlcVar;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
    }

    private static boolean H(ConversationSuggestion conversationSuggestion) {
        return conversationSuggestion.getSuggestionType() == 5 && !TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT));
    }

    private static boolean I(ConversationSuggestion conversationSuggestion) {
        return (conversationSuggestion.getSuggestionType() != 1 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI))) ? false : true;
    }

    private static boolean J(ConversationSuggestion conversationSuggestion) {
        return (conversationSuggestion.getSuggestionType() != 11 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_APPLICATION)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r14, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ReceiveRbmSuggestionsAction.h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):void");
    }

    private static boolean j(ConversationSuggestion conversationSuggestion) {
        return conversationSuggestion.getSuggestionType() == 4 && !TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT));
    }

    private static boolean l(ConversationSuggestion conversationSuggestion) {
        if (!TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) && conversationSuggestion.getSuggestionType() == 3) {
            if (!TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY))) {
                return true;
            }
            if (!TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT)) && !TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG))) {
                return true;
            }
        }
        return false;
    }

    private static boolean m(ConversationSuggestion conversationSuggestion) {
        return (conversationSuggestion.getSuggestionType() != 2 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER))) ? false : true;
    }

    private static boolean n(ConversationSuggestion conversationSuggestion) {
        return conversationSuggestion.getSuggestionType() == 0 && !TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReceiveRbmSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("ReceiveRbmSuggestionsAction.executeAction");
        try {
            basd basdVarB = basd.b(this.v.f(), RcsIntents.EXTRA_TARGET_RCS_MESSAGE_ID);
            if (basdVarB.i()) {
                a.r("Couldn't add RBM bot suggestions to conversation: empty RCS message ID");
            } else {
                MessageCoreData messageCoreDataY = ((baxe) this.e.b()).y(basdVarB);
                if (messageCoreDataY == null) {
                    cqbd cqbdVarE = a.e();
                    cqbdVarE.I("Adding RBM suggestion with target RCS message ID not yet found.");
                    cqbdVarE.A("targetRcsMessageId", basdVarB);
                    cqbdVarE.r();
                    h(bary.a, barn.a);
                } else {
                    h(messageCoreDataY.C(), messageCoreDataY.A());
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
        return "Bugle.DataModel.Action.ReceiveConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveRbmSuggestionsAction(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cogw cogwVar, bxlc bxlcVar, fcsu fcsuVar6, fcsu fcsuVar7, Parcel parcel) {
        super(parcel, elgm.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = cogwVar;
        this.h = bxlcVar;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
    }
}
