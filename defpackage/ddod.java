package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.NlpLocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddod implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        WorkSource workSource = new WorkSource();
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                workSource = (WorkSource) dclv.n(parcel, i, WorkSource.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new NlpLocationRequest(workSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NlpLocationRequest[i];
    }
}
