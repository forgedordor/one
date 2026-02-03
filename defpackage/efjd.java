package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efje efjeVarF = GroupMember.f();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efjeVarF.c((RcsDestinationId) dclv.n(parcel, i, RcsDestinationId.CREATOR));
            } else if (iD == 2) {
                efjeVarF.b(dclv.t(parcel, i));
            } else if (iD == 3) {
                efjeVarF.e((RcsDestinationId) dclv.n(parcel, i, RcsDestinationId.CREATOR));
            } else if (iD == 4) {
                efjeVarF.d(dclv.D(parcel, i));
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                efjeVarF.f((efjf) efkv.b(parcel, i, efjf.class));
            }
        }
        return efjeVarF.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupMember[i];
    }
}
