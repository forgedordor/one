package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhq efhqVar = new efhq();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    efhqVar.d(dclv.t(parcel, i));
                    break;
                case 2:
                    efhqVar.e(dclv.t(parcel, i));
                    break;
                case 3:
                    efhqVar.b(dclv.t(parcel, i));
                    break;
                case 4:
                    ArrayList arrayListZ = dclv.z(parcel, i, GroupMember.CREATOR);
                    if (efhqVar.a != null) {
                        throw new IllegalStateException("Cannot set groupMembers after calling groupMembersBuilder()");
                    }
                    efhqVar.b = ekgb.n(arrayListZ);
                    break;
                case 5:
                    efhqVar.c((GroupRemoteCapabilities) dclv.n(parcel, i, GroupRemoteCapabilities.CREATOR));
                    break;
                case 6:
                    efhqVar.f((SubjectExtension) dclv.n(parcel, i, SubjectExtension.CREATOR));
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        return efhqVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupInformation[i];
    }
}
