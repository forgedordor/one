package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcfh implements Parcelable.Creator {
    public static final dcfh a = new dcfh();

    private dcfh() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() != -204102970) {
            parcel.setDataPosition(iDataPosition - 4);
            return ApiMetadata.a;
        }
        int iH = dclv.h(parcel);
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                complianceOptions = (ComplianceOptions) dclv.n(parcel, i, ComplianceOptions.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new ApiMetadata(complianceOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApiMetadata[i];
    }
}
