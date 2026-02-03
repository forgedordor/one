package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efjw efjwVarE = MessageClass.e();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efjwVarE.e((efjy) efkv.b(parcel, i, efjy.class));
            } else if (iD == 2) {
                efjwVarE.d((efjx) efkv.b(parcel, i, efjx.class));
            } else if (iD == 3) {
                efjwVarE.c(dclv.D(parcel, i));
            } else if (iD == 4 && ((Boolean) MessageClass.a.a()).booleanValue()) {
                efjwVarE.b(dclv.D(parcel, i));
            } else {
                dclv.C(parcel, i);
            }
        }
        return efjwVarE.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MessageClass[0];
    }
}
