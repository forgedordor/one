package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AppParcelable;
import com.google.android.gms.wearable.internal.AppWearDetailsParcelable;
import com.google.android.gms.wearable.internal.WebIconParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        WebIconParcelable webIconParcelable = null;
        String strT3 = null;
        String strT4 = null;
        Float fQ = null;
        AppWearDetailsParcelable appWearDetailsParcelable = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 3:
                    webIconParcelable = (WebIconParcelable) dclv.n(parcel, i, WebIconParcelable.CREATOR);
                    break;
                case 4:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 6:
                    fQ = dclv.q(parcel, i);
                    break;
                case 7:
                    appWearDetailsParcelable = (AppWearDetailsParcelable) dclv.n(parcel, i, AppWearDetailsParcelable.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AppParcelable(strT, strT2, webIconParcelable, strT3, strT4, fQ, appWearDetailsParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppParcelable[i];
    }
}
