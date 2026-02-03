package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afmu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Bundle bundle = parcel.readBundle(afmt.class.getClassLoader());
        if (bundle == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objA = ih.a(bundle, "conversation_id", ConversationId.class);
        if (objA != null) {
            return new ChipId.Conversation((ConversationId) objA);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChipId.Conversation[i];
    }
}
