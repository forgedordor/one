package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        int iF2 = 0;
        boolean zD2 = false;
        ArrayList arrayListY = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    zD = dclv.D(parcel, i);
                    break;
                case 4:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 5:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 6:
                    strT = dclv.t(parcel, i);
                    break;
                case 7:
                    zD2 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new UsageReportingOptInOptions(iF, zD, arrayListY, iF2, strT, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UsageReportingOptInOptions[i];
    }
}
