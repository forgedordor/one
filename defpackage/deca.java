package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deca implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Status status = null;
        GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                status = (Status) dclv.n(parcel, i, Status.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                getGlobalSearchSourcesCall$GlobalSearchSourceArr = (GetGlobalSearchSourcesCall$GlobalSearchSource[]) dclv.J(parcel, i, GetGlobalSearchSourcesCall$GlobalSearchSource.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetGlobalSearchSourcesCall$Response(status, getGlobalSearchSourcesCall$GlobalSearchSourceArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$Response[i];
    }
}
