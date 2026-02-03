package com.google.android.apps.messaging.shared.api.messaging.conversation.emergency;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.aken;
import defpackage.akll;
import defpackage.aklm;
import defpackage.akln;
import defpackage.fctc;
import defpackage.fctd;
import defpackage.fdae;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EmergencyConversationId implements ConversationId {
    public static final Parcelable.Creator<ConversationId> CREATOR = new aken();
    public final ConversationIdType a;
    private final fctc b;

    public EmergencyConversationId(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        this.a = conversationIdType;
        this.b = fctd.a(new fdae() { // from class: akem
            @Override // defpackage.fdae
            public final Object invoke() {
                return new BugleConversationId(this.a.a);
            }
        });
        if (conversationIdType.b()) {
            throw new IllegalArgumentException("id cannot be null or empty");
        }
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final aklm a() {
        return aklm.EMERGENCY;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId
    public final String b() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    public final BugleConversationId c() {
        return (BugleConversationId) this.b.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmergencyConversationId) {
            return fdbq.f(this.a, ((EmergencyConversationId) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        akll akllVar = (akll) akln.a.createBuilder();
        aklm aklmVar = aklm.EMERGENCY;
        akllVar.copyOnWrite();
        ((akln) akllVar.instance).b = aklmVar.a();
        String string = this.a.toString();
        akllVar.copyOnWrite();
        akln aklnVar = (akln) akllVar.instance;
        string.getClass();
        aklnVar.c = string;
        Bundle bundle = new Bundle();
        bundle.putParcelable("proto", new ProtoParsers.InternalDontUse(null, akllVar.build()));
        parcel.writeBundle(bundle);
    }
}
