package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.telephonyspam.MessageContent;
import com.google.android.gms.telephonyspam.MessageSpamOptions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        ArrayList arrayListZ = null;
        long jI = 0;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                jI = dclv.i(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, MessageContent.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new MessageSpamOptions(iF, strT, jI, arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageSpamOptions[i];
    }
}
