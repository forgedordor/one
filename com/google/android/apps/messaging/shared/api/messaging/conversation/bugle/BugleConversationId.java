package com.google.android.apps.messaging.shared.api.messaging.conversation.bugle;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ajtm;
import defpackage.akll;
import defpackage.aklm;
import defpackage.akln;
import defpackage.barn;
import defpackage.ejwl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class BugleConversationId implements ConversationId {
    public static final Parcelable.Creator<ConversationId> CREATOR = new ajtm();
    public final ConversationIdType a;

    public BugleConversationId(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        this.a = conversationIdType;
        ejwl.a(!conversationIdType.b());
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final aklm a() {
        return aklm.BUGLE;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final String b() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BugleConversationId) {
            return this.a.equals(((BugleConversationId) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        akll akllVar = (akll) akln.a.createBuilder();
        aklm aklmVar = aklm.BUGLE;
        akllVar.copyOnWrite();
        ((akln) akllVar.instance).b = aklmVar.a();
        String string = this.a.toString();
        akllVar.copyOnWrite();
        akln aklnVar = (akln) akllVar.instance;
        string.getClass();
        aklnVar.c = string;
        Bundle bundle = new Bundle();
        bundle.putParcelable("proto", new ProtoParsers.InternalDontUse(null, (akln) akllVar.build()));
        parcel.writeBundle(bundle);
    }

    public BugleConversationId(String str) {
        this.a = barn.b(str);
        ejwl.a(!r1.b());
    }
}
