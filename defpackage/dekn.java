package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        int iF2 = 0;
        int iF3 = 0;
        WordBoxParcel[] wordBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        BoundingBoxParcel boundingBoxParcel3 = null;
        String strT = null;
        String strT2 = null;
        float fC = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    wordBoxParcelArr = (WordBoxParcel[]) dclv.J(parcel, i, WordBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) dclv.n(parcel, i, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) dclv.n(parcel, i, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    boundingBoxParcel3 = (BoundingBoxParcel) dclv.n(parcel, i, BoundingBoxParcel.CREATOR);
                    break;
                case 6:
                    strT = dclv.t(parcel, i);
                    break;
                case 7:
                    fC = dclv.c(parcel, i);
                    break;
                case 8:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 9:
                    iF = dclv.f(parcel, i);
                    break;
                case 10:
                    zD = dclv.D(parcel, i);
                    break;
                case 11:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 12:
                    iF3 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new LineBoxParcel(wordBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, boundingBoxParcel3, strT, fC, strT2, iF, zD, iF2, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LineBoxParcel[i];
    }
}
