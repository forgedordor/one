package com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.akfh;
import defpackage.akll;
import defpackage.aklm;
import defpackage.akln;
import defpackage.ejwl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EmergencySosConversationId implements ConversationId {
    public static final Parcelable.Creator<ConversationId> CREATOR = new akfh();
    public final ConversationIdType a;
    public final BugleConversationId b;

    public EmergencySosConversationId(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        this.a = conversationIdType;
        this.b = new BugleConversationId(conversationIdType);
        ejwl.a(!conversationIdType.b());
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final aklm a() {
        return aklm.SATELLITE;
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
        if (obj instanceof EmergencySosConversationId) {
            return this.a.equals(((EmergencySosConversationId) obj).a);
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
        aklm aklmVar = aklm.SATELLITE;
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
