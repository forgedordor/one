package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddse implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        double dB = 0.0d;
        StrokeStyle strokeStyle = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strokeStyle = (StrokeStyle) dclv.n(parcel, i, StrokeStyle.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                dB = dclv.b(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new StyleSpan(strokeStyle, dB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StyleSpan[i];
    }
}
