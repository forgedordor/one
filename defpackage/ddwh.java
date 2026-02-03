package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.ActionPreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 7:
                    jI = dclv.i(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ActionPreference(strT, iF, iF2, strT2, strT3, iF3, jI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActionPreference[i];
    }
}
