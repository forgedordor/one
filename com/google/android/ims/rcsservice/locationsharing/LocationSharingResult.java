package com.google.android.ims.rcsservice.locationsharing;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dheb;
import defpackage.dstt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LocationSharingResult extends dstt {
    public static final Parcelable.Creator<LocationSharingResult> CREATOR = new dheb();
    private final long a;
    private final String b;
    private final String c;

    public LocationSharingResult(long j, String str, int i, String str2) {
        this(j, str, i, str2, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
        parcel.writeLong(this.a);
        String str = this.c;
        parcel.writeByte(str != null ? (byte) 1 : (byte) 0);
        parcel.writeString(str);
    }

    public LocationSharingResult(long j, String str, int i, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.code = i;
        this.description = str2;
        this.c = str3;
    }

    public LocationSharingResult(Parcel parcel) {
        this.b = parcel.readString();
        this.code = parcel.readInt();
        this.description = parcel.readString();
        this.a = parcel.readLong();
        this.c = parcel.readByte() > 0 ? parcel.readString() : null;
    }
}
