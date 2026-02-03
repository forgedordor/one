package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efdr efdrVarB = GetGroupNotificationsRequest.b();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                efdrVarB.b(dclv.f(parcel, i));
            }
        }
        return efdrVarB.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGroupNotificationsRequest[i];
    }
}
