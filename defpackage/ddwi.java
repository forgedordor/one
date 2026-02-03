package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.ActionPreference;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.GroupContactOrder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        GroupContactOrder groupContactOrder = null;
        int iF = 0;
        ActionPreference actionPreference = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                groupContactOrder = (GroupContactOrder) dclv.n(parcel, i, GroupContactOrder.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                actionPreference = (ActionPreference) dclv.n(parcel, i, ActionPreference.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CpgDocument(iF, groupContactOrder, actionPreference);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CpgDocument[i];
    }
}
