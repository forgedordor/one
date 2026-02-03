package com.google.android.apps.messaging.conversation2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.ajlm;
import defpackage.fdbk;
import defpackage.fdbq;
import defpackage.vrd;
import defpackage.vre;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OpenConversation2Arguments implements Parcelable {
    public static final Parcelable.Creator<OpenConversation2Arguments> CREATOR = new vre();
    public final ConversationId a;
    public final MessageId b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final ajlm f;
    private final Boolean g;

    public OpenConversation2Arguments(ConversationId conversationId, MessageId messageId, String str, Boolean bool, boolean z, boolean z2, ajlm ajlmVar) {
        conversationId.getClass();
        ajlmVar.getClass();
        this.a = conversationId;
        this.b = messageId;
        this.c = str;
        this.g = bool;
        this.d = z;
        this.e = z2;
        this.f = ajlmVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenConversation2Arguments)) {
            return false;
        }
        OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) obj;
        return fdbq.f(this.a, openConversation2Arguments.a) && fdbq.f(this.b, openConversation2Arguments.b) && fdbq.f(this.c, openConversation2Arguments.c) && fdbq.f(this.g, openConversation2Arguments.g) && this.d == openConversation2Arguments.d && this.e == openConversation2Arguments.e && this.f == openConversation2Arguments.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        MessageId messageId = this.b;
        int iHashCode2 = (iHashCode + (messageId == null ? 0 : messageId.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.g;
        return ((((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + vrd.a(this.d)) * 31) + vrd.a(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "OpenConversation2Arguments(conversationId=" + this.a + ", messageId=" + this.b + ", searchQuery=" + this.c + ", canNavigateBack=" + this.g + ", renderAddPeople=" + this.d + ", isBubbleActivity=" + this.e + ", conversationOpenMode=" + this.f + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBooleanValue;
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        Boolean bool = this.g;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OpenConversation2Arguments(ConversationId conversationId, MessageId messageId, String str, Boolean bool, boolean z, boolean z2, ajlm ajlmVar, int i, fdbk fdbkVar) {
        ajlm ajlmVar2 = (i & 64) != 0 ? ajlm.FOR_DISPLAY : ajlmVar;
        int i2 = i & 16;
        int i3 = i & 8;
        int i4 = i & 4;
        int i5 = i & 2;
        boolean z3 = ((i & 32) == 0) & z2;
        boolean z4 = (i2 == 0) & z;
        Boolean bool2 = i3 != 0 ? null : bool;
        this(conversationId, i5 != 0 ? null : messageId, i4 != 0 ? null : str, bool2, z4, z3, ajlmVar2);
    }
}
