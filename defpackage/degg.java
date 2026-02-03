package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.telephonyspam.MessageContent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        int iF = 0;
        int iF2 = 0;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                jI = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new MessageContent(iF, strT, iF2, jI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageContent[i];
    }
}
