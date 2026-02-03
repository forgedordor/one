package com.google.android.apps.messaging.shared.api.messaging.conversation.rbm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.akll;
import defpackage.aklm;
import defpackage.akln;
import defpackage.akmu;
import defpackage.barn;
import defpackage.ejwl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RbmConversationId implements ConversationId {
    public static final Parcelable.Creator<ConversationId> CREATOR = new akmu();
    public final ConversationIdType a;
    public final BugleConversationId b;

    public RbmConversationId(ConversationIdType conversationIdType) {
        boolean z = false;
        if (conversationIdType != null && !conversationIdType.b()) {
            z = true;
        }
        ejwl.a(z);
        this.a = conversationIdType;
        this.b = new BugleConversationId(conversationIdType);
    }

    public static RbmConversationId c(String str) {
        return new RbmConversationId(barn.b(str));
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final aklm a() {
        return aklm.RBM;
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
        if (obj instanceof RbmConversationId) {
            return this.a.equals(((RbmConversationId) obj).a);
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
        aklm aklmVar = aklm.RBM;
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
}
