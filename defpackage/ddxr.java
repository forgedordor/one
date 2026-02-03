package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Long lS = null;
        ArrayList arrayListZ = null;
        String strT2 = null;
        Long lS2 = null;
        Long lS3 = null;
        DeviceVersionEntity deviceVersionEntity = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    arrayListZ = dclv.z(parcel, i, SourceStatsEntity.CREATOR);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    lS2 = dclv.s(parcel, i);
                    break;
                case 6:
                    lS3 = dclv.s(parcel, i);
                    break;
                case 7:
                    lS = dclv.s(parcel, i);
                    break;
                case 8:
                    deviceVersionEntity = (DeviceVersionEntity) dclv.n(parcel, i, DeviceVersionEntity.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new BackedUpContactsPerDeviceEntity(strT, lS, arrayListZ, strT2, lS2, lS3, deviceVersionEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BackedUpContactsPerDeviceEntity[i];
    }
}
