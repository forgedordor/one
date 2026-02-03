package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFontData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        float fC = 0.0f;
        float fC2 = 0.0f;
        float fC3 = 0.0f;
        float fC4 = 0.0f;
        float fC5 = 0.0f;
        float fC6 = 0.0f;
        float fC7 = 0.0f;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    fC = dclv.c(parcel, i);
                    break;
                case 2:
                    fC2 = dclv.c(parcel, i);
                    break;
                case 3:
                    fC3 = dclv.c(parcel, i);
                    break;
                case 4:
                    fC4 = dclv.c(parcel, i);
                    break;
                case 5:
                    fC5 = dclv.c(parcel, i);
                    break;
                case 6:
                    fC6 = dclv.c(parcel, i);
                    break;
                case 7:
                    iF = dclv.f(parcel, i);
                    break;
                case 8:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 9:
                    fC7 = dclv.c(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new CallingCardFontData(fC, fC2, fC3, fC4, fC5, fC6, iF, iF2, fC7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardFontData[i];
    }
}
