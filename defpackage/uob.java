package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUiState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uob implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ((ConversationActivityUiState.a) cqtf.a(ConversationActivityUiState.a.class)).F();
        return new ConversationActivityUiState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConversationActivityUiState[i];
    }
}
