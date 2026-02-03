package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avns implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ComposeRowState((IncomingDraft) parcel.readParcelable(ComposeRowState.class.getClassLoader()), parcel.readInt() == 0 ? null : (avob) Enum.valueOf(avob.class, parcel.readString()), null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ComposeRowState[i];
    }
}
