package com.google.android.apps.messaging.conversation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import defpackage.barn;
import defpackage.ejwk;
import defpackage.ekhx;
import defpackage.uob;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConversationActivityUiState implements Parcelable, Cloneable {
    public static final Parcelable.Creator<ConversationActivityUiState> CREATOR;
    public int a;
    public ConversationId b;

    @Deprecated
    Conversation c;
    public boolean d;

    /* compiled from: PG */
    public interface a {
        void F();
    }

    static {
        ekhx.r(3, 7);
        CREATOR = new uob();
    }

    public ConversationActivityUiState(int i) {
        this.c = null;
        this.d = false;
        this.b = null;
        this.a = i;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ConversationActivityUiState clone() {
        try {
            return (ConversationActivityUiState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("ConversationActivityUiState: failed to clone(). Is there a mutable reference?", e);
        }
    }

    public final boolean b() {
        return this.a == 11;
    }

    public final boolean c() {
        int i = this.a;
        return (i == 0 || i == 1 || i == 11) ? false : true;
    }

    public final boolean d() {
        int i = this.a;
        return i == 1 || i == 11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.a == 0;
    }

    public final int f(int i) {
        int i2 = this.a;
        return i2 != 2 ? (i2 == 5 || i2 == 7 || i2 == 12 || i2 == 14) ? 3 : 1 : i == 2 ? 4 : 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        ConversationId conversationId = this.b;
        parcel.writeString(conversationId == null ? null : conversationId.b());
        parcel.writeParcelable(this.c, i);
    }

    public ConversationActivityUiState(ConversationId conversationId, int i) {
        this.c = null;
        this.d = false;
        this.b = conversationId;
        this.a = i;
    }

    public ConversationActivityUiState(Parcel parcel) {
        this.c = null;
        this.d = false;
        this.a = parcel.readInt();
        this.b = null;
        String string = parcel.readString();
        if (!ejwk.c(string)) {
            this.b = new BugleConversationId(barn.b(string));
        }
        if (parcel.dataAvail() > 0) {
            this.c = (Conversation) parcel.readParcelable(getClass().getClassLoader());
        }
    }
}
