package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFontData;
import com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CallingCardFontData callingCardFontData = null;
        CallingCardFullScreenImageData callingCardFullScreenImageData = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                callingCardFontData = (CallingCardFontData) dclv.n(parcel, i, CallingCardFontData.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                callingCardFullScreenImageData = (CallingCardFullScreenImageData) dclv.n(parcel, i, CallingCardFullScreenImageData.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CallingCardMetadata(callingCardFontData, callingCardFullScreenImageData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardMetadata[i];
    }
}
