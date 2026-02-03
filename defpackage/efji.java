package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efji implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efht efhtVar = new efht();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efhtVar.d(dclv.D(parcel, i));
            } else if (iD == 2) {
                efhtVar.c(Boolean.valueOf(dclv.D(parcel, i)));
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                efhtVar.b(Boolean.valueOf(dclv.D(parcel, i)));
            }
        }
        return efhtVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupRemoteCapabilities[i];
    }
}
