package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.UserPreferredSleepWindow;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddoh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 3) {
                iF3 = dclv.f(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                iF4 = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new UserPreferredSleepWindow(iF, iF2, iF3, iF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UserPreferredSleepWindow[i];
    }
}
