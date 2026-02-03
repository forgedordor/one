package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efin implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhi efhiVar = new efhi();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efhiVar.d(new int[]{1, 2}[dclv.f(parcel, i)]);
            } else if (iD == 2) {
                efhiVar.c(dclv.t(parcel, i));
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                efhiVar.b((RcsDestinationId) dclv.n(parcel, i, RcsDestinationId.CREATOR));
            }
        }
        return efhiVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Conversation[i];
    }
}
