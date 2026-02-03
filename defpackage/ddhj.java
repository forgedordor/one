package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.AreConversationsAllowedRequest;
import com.google.android.gms.kids.ConversationData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ConversationData[] conversationDataArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                conversationDataArr = (ConversationData[]) dclv.J(parcel, i, ConversationData.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new AreConversationsAllowedRequest(conversationDataArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AreConversationsAllowedRequest[i];
    }
}
