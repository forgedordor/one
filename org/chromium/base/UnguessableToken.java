package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ffyq;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UnguessableToken extends TokenBase implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new ffyq();

    public UnguessableToken(long j, long j2) {
        super(j, j2);
    }

    private final UnguessableToken parcelAndUnparcelForTesting() {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        UnguessableToken unguessableTokenCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return unguessableTokenCreateFromParcel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
