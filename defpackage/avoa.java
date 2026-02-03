package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import j$.time.Instant;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avoa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 != i; i2++) {
            arrayList.add(IncomingDraft.Attachment.CREATOR.createFromParcel(parcel));
        }
        return new IncomingDraft(string, arrayList, parcel.readString(), parcel.readInt() != 0, (Instant) parcel.readSerializable(), (EditingData) parcel.readParcelable(IncomingDraft.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IncomingDraft[i];
    }
}
