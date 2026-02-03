package com.google.android.ims.util;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhhh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Content implements Parcelable {
    public static Parcelable.Creator<Content> CREATOR = new dhhh();
    public final byte[] a;
    private final String b;

    public Content(String str, byte[] bArr) {
        this.b = str;
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        byte[] bArr = this.a;
        parcel.writeInt(bArr == null ? 0 : bArr.length);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public Content(Parcel parcel) {
        this.b = parcel.readString();
        int i = parcel.readInt();
        if (i <= 0) {
            this.a = null;
            return;
        }
        byte[] bArr = new byte[i];
        this.a = bArr;
        parcel.readByteArray(bArr);
    }
}
