package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.AppRestriction;
import com.google.android.gms.auth.aang.AppRestrictionInfo;
import com.google.android.gms.auth.aang.AppRestrictionState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        AppRestrictionState appRestrictionState = null;
        AppRestrictionInfo appRestrictionInfo = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                appRestrictionState = (AppRestrictionState) dclv.n(parcel, i, AppRestrictionState.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                appRestrictionInfo = (AppRestrictionInfo) dclv.n(parcel, i, AppRestrictionInfo.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new AppRestriction(appRestrictionState, appRestrictionInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppRestriction[i];
    }
}
