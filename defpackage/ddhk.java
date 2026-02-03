package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.AreConversationsAllowedResponse;
import com.google.android.gms.kids.ConversationResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ConversationResult[] conversationResultArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                conversationResultArr = (ConversationResult[]) dclv.J(parcel, i, ConversationResult.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new AreConversationsAllowedResponse(conversationResultArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AreConversationsAllowedResponse[i];
    }
}
