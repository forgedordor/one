package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efdv efdvVarC = GetMessagesRequest.c();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efdvVarC.b(dclv.f(parcel, i));
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                efdvVarC.c((TraceId) dclv.n(parcel, i, TraceId.CREATOR));
            }
        }
        return efdvVarC.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetMessagesRequest[i];
    }
}
