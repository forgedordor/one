package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Boolean boolO = null;
        Boolean boolO2 = null;
        Boolean boolO3 = null;
        ArrayList arrayListY = null;
        Boolean boolO4 = null;
        Boolean boolO5 = null;
        ArrayList arrayListY2 = null;
        ArrayList arrayListY3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    boolO = dclv.o(parcel, i);
                    break;
                case 2:
                    boolO2 = dclv.o(parcel, i);
                    break;
                case 3:
                    boolO3 = dclv.o(parcel, i);
                    break;
                case 4:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 5:
                    boolO4 = dclv.o(parcel, i);
                    break;
                case 6:
                    boolO5 = dclv.o(parcel, i);
                    break;
                case 7:
                    arrayListY2 = dclv.y(parcel, i);
                    break;
                case 8:
                    arrayListY3 = dclv.y(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new DeviceFilter(boolO, boolO2, boolO3, arrayListY, boolO4, boolO5, arrayListY2, arrayListY3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceFilter[i];
    }
}
