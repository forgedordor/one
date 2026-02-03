package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AutoValue_JoinGroupRequest;
import com.google.android.rcs.client.messaging.JoinGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efen implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PendingIntent pendingIntentJ = null;
        Conversation conversation = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                pendingIntentJ = dclv.j(parcel, i);
                if (pendingIntentJ == null) {
                    throw new NullPointerException("Null intent");
                }
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                conversation = (Conversation) dclv.n(parcel, i, Conversation.CREATOR);
                if (conversation == null) {
                    throw new NullPointerException("Null conversation");
                }
            }
        }
        if (pendingIntentJ != null && conversation != null) {
            return new AutoValue_JoinGroupRequest(pendingIntentJ, conversation);
        }
        StringBuilder sb = new StringBuilder();
        if (pendingIntentJ == null) {
            sb.append(" intent");
        }
        if (conversation == null) {
            sb.append(" conversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new JoinGroupRequest[i];
    }
}
