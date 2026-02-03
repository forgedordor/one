package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.SymbolBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        SymbolBoxParcel[] symbolBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        String strT = null;
        String strT2 = null;
        float fC = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    symbolBoxParcelArr = (SymbolBoxParcel[]) dclv.J(parcel, i, SymbolBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) dclv.n(parcel, i, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) dclv.n(parcel, i, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    strT = dclv.t(parcel, i);
                    break;
                case 6:
                    fC = dclv.c(parcel, i);
                    break;
                case 7:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 8:
                    zD = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new WordBoxParcel(symbolBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, strT, fC, strT2, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WordBoxParcel[i];
    }
}
