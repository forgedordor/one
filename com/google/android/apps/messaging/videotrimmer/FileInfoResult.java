package com.google.android.apps.messaging.videotrimmer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.daoj;
import defpackage.fdbk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FileInfoResult implements Parcelable {
    public static final Parcelable.Creator<FileInfoResult> CREATOR = new daoj();
    public final String a;
    public final long b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FileInfoResult(Parcel parcel, fdbk fdbkVar) {
        String string = parcel.readString();
        string.getClass();
        this(string, parcel.readLong());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }

    public FileInfoResult(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }
}
