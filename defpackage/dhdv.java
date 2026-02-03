package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dhdt((ewwr) ProtoParsers.e(parcel, ewwr.a, evrr.a()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InitializeAndStartRcsTransportRequest[i];
    }
}
