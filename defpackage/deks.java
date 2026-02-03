package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CardRequirements;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deks implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = true;
        ArrayList arrayListW = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListW = dclv.w(parcel, i);
            } else if (iD == 2) {
                zD2 = dclv.D(parcel, i);
            } else if (iD == 3) {
                zD = dclv.D(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new CardRequirements(arrayListW, zD2, zD, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardRequirements[i];
    }
}
