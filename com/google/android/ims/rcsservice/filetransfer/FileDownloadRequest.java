package com.google.android.ims.rcsservice.filetransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import defpackage.dclw;
import defpackage.dhct;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class FileDownloadRequest implements Parcelable {
    public static final Parcelable.Creator<FileDownloadRequest> CREATOR = new dhct();

    public abstract PendingIntent a();

    public abstract FileInformation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.B(parcel, a());
        dclw.k(parcel, 2, b(), i, false);
        dclw.c(parcel, iA);
    }
}
