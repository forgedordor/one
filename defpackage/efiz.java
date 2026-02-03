package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupMember;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efiz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhp efhpVar = new efhp();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                ArrayList arrayListZ = dclv.z(parcel, i, GroupMember.CREATOR);
                if (efhpVar.a != null) {
                    throw new IllegalStateException("Cannot set changedMembers after calling changedMembersBuilder()");
                }
                efhpVar.b = ekgb.n(arrayListZ);
            }
        }
        return efhpVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupEvent[i];
    }
}
