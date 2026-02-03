package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.GetAppThemeResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dero implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        AppTheme appTheme = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                appTheme = (AppTheme) dclv.n(parcel, i, AppTheme.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetAppThemeResponse(iF, appTheme);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAppThemeResponse[i];
    }
}
