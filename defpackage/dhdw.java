package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dhdu((ewwv) ProtoParsers.e(parcel, ewwv.a, evrr.a()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StopAllRcsTransportsExceptRequest[i];
    }
}
