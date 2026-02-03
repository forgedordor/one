package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daoj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new FileInfoResult(parcel, (fdbk) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileInfoResult[i];
    }
}
