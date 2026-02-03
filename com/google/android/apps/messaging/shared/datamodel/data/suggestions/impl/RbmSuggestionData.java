package com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.amvq;
import defpackage.bary;
import defpackage.bbex;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.ejxr;
import defpackage.fdbk;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class RbmSuggestionData implements SuggestionData {
    public final ConversationSuggestion b;
    public final MessageIdType c;
    public final amvq d;
    public static final ejxr a = cdag.w(223258190, "use_bugle_message_id_in_rbm_suggestion_data");
    public static final Parcelable.Creator<RbmSuggestionData> CREATOR = new bbex();

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RbmSuggestionData(Parcel parcel, fdbk fdbkVar) {
        ConversationSuggestion conversationSuggestionCreateFromParcel = ConversationSuggestion.CREATOR.createFromParcel(parcel);
        conversationSuggestionCreateFromParcel.getClass();
        ConversationSuggestion conversationSuggestion = conversationSuggestionCreateFromParcel;
        String string = parcel.readString();
        this(conversationSuggestion, bary.b((!((Boolean) ((cczi) a.get()).e()).booleanValue() || fdbq.f("noMessageIdSentinel", string)) ? null : string), null);
    }

    @Override // defpackage.aldp
    public final String a() {
        return this.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
    }

    @Override // defpackage.aldp
    public final String b() {
        throw new UnsupportedOperationException("Not used");
    }

    @Override // defpackage.aldp
    public final String c() {
        String strB = w().b();
        strB.getClass();
        return strB;
    }

    @Override // defpackage.aldp
    public final String d() {
        return this.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.aldp
    public final String e() {
        throw new UnsupportedOperationException("Type not supported for RBM suggestions");
    }

    @Override // defpackage.aldp
    public final boolean f() {
        return this.b.getSuggestionType() == 0;
    }

    public final String g() {
        String rcsMessageId = this.b.getRcsMessageId();
        if (rcsMessageId != null) {
            return rcsMessageId;
        }
        throw new IllegalStateException("missing rcsMessageId");
    }

    public final String toString() {
        amvq amvqVar = this.d;
        if (amvqVar == null) {
            String string = this.b.toString();
            string.getClass();
            return string;
        }
        ConversationSuggestion conversationSuggestion = this.b;
        return amvqVar.c() + " " + amvqVar.d() + " " + conversationSuggestion;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData
    public final MessageIdType w() {
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            MessageIdType messageIdType = this.c;
            if (!messageIdType.c()) {
                return messageIdType;
            }
        }
        return bary.b(this.b.getTargetRcsMessageId());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.b.writeToParcel(parcel, i);
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            parcel.writeString(this.c.b());
        } else {
            parcel.writeString("noMessageIdSentinel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType) {
        this(conversationSuggestion, messageIdType, null, 4, null);
        conversationSuggestion.getClass();
        messageIdType.getClass();
    }

    public RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType, amvq amvqVar) {
        conversationSuggestion.getClass();
        messageIdType.getClass();
        this.b = conversationSuggestion;
        this.c = messageIdType;
        this.d = amvqVar;
    }

    public /* synthetic */ RbmSuggestionData(ConversationSuggestion conversationSuggestion, MessageIdType messageIdType, amvq amvqVar, int i, fdbk fdbkVar) {
        this(conversationSuggestion, messageIdType, (i & 4) != 0 ? null : amvqVar);
    }
}
