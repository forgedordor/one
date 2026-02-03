package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddcd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Boolean boolO = null;
        ArrayList arrayListY = null;
        ArrayList arrayListX = null;
        ArrayList arrayListY2 = null;
        ArrayList arrayListX2 = null;
        byte[][] bArrL = null;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 4:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 5:
                    arrayListX = dclv.x(parcel, i);
                    break;
                case 6:
                    arrayListY2 = dclv.y(parcel, i);
                    break;
                case 7:
                    arrayListX2 = dclv.x(parcel, i);
                    break;
                case 8:
                    bArrL = dclv.L(parcel, i);
                    break;
                case 9:
                    boolO = dclv.o(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new FRDProductSpecificDataEntry(iF, iF2, arrayListY, arrayListX, arrayListY2, arrayListX2, bArrL, boolO.booleanValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FRDProductSpecificDataEntry[i];
    }
}
