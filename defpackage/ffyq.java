package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.base.UnguessableToken;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffyq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        if (j == 0 || j2 == 0) {
            return null;
        }
        return new UnguessableToken(j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UnguessableToken[i];
    }
}
