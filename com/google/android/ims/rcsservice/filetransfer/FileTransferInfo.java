package com.google.android.ims.rcsservice.filetransfer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhcx;
import defpackage.dhdc;
import defpackage.dhdm;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FileTransferInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<FileTransferInfo> CREATOR = new dhcx();
    private static final long serialVersionUID = -391832621873810778L;
    public final dhdc a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final String e;
    public long f;
    public long g;
    private final dhdm h;

    public FileTransferInfo(Parcel parcel) {
        this.f = -1L;
        this.a = dhdc.values()[parcel.readInt()];
        this.h = new dhdm((Uri) parcel.readParcelable(Uri.class.getClassLoader()));
        this.e = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createByteArray();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
    }

    public final Uri a() {
        return this.h.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        byte[] bArr = this.d;
        int length = bArr != null ? bArr.length : 0;
        dhdc dhdcVar = this.a;
        String str = this.e;
        dhdm dhdmVar = this.h;
        return "Type: " + String.valueOf(dhdcVar) + ", name: " + str + ", content uri: " + String.valueOf(dhdmVar.a()) + ", content type: " + this.b + ", size: " + this.f + ", preview size: " + length + ", audio duration: " + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.ordinal());
        parcel.writeParcelable(this.h.a(), 0);
        parcel.writeString(this.e);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
    }

    public FileTransferInfo(dhdc dhdcVar, Uri uri, String str, String str2, long j, long j2, byte[] bArr, String str3) {
        this(dhdcVar, uri, str, str2, j, bArr, str3);
        this.g = j2;
    }

    public FileTransferInfo(dhdc dhdcVar, Uri uri, String str, String str2, long j, byte[] bArr, String str3) {
        this.f = -1L;
        if (uri == null) {
            throw new IllegalArgumentException("Content URI must not be null");
        }
        if (dhdcVar != null) {
            this.a = dhdcVar;
            this.h = new dhdm(uri);
            this.b = str;
            this.d = bArr;
            this.c = str3;
            this.f = j;
            this.e = str2;
            return;
        }
        throw new IllegalArgumentException("Service type must be specified: image sharing, location sharing or file transfer");
    }
}
