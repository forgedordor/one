package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.dhcj;
import defpackage.dhcy;
import defpackage.dhda;
import defpackage.efkv;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class FileTransferResult implements Parcelable {
    public static final Parcelable.Creator<FileTransferResult> CREATOR;
    public static final FileTransferResult a;
    public static final FileTransferResult b;

    static {
        dhcj dhcjVar = new dhcj();
        dhcjVar.b(dhda.OK);
        a = dhcjVar.a();
        dhcj dhcjVar2 = new dhcj();
        dhcjVar2.b(dhda.FAILED);
        b = dhcjVar2.a();
        CREATOR = new dhcy();
    }

    public abstract dhda a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        efkv.c(parcel, 1, a());
        dclw.c(parcel, iA);
    }
}
