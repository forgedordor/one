package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efii implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhg efhgVar = new efhg();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efhgVar.c((ContentType) dclv.n(parcel, i, ContentType.CREATOR));
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                efhgVar.b(evqs.x(dclv.E(parcel, i)));
            }
        }
        return efhgVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChatMessage[i];
    }
}
