package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddco implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        GoogleHelp googleHelp = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                googleHelp = (GoogleHelp) dclv.n(parcel, i, GoogleHelp.CREATOR);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 4) {
                strT3 = dclv.t(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                strT4 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SupportRequestHelp(googleHelp, strT, strT2, strT3, strT4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SupportRequestHelp[i];
    }
}
