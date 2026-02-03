package com.google.android.ims.rcsservice.filetransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import defpackage.dclw;
import defpackage.dhdi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ResumeDownloadRequest implements Parcelable {
    public static final Parcelable.Creator<ResumeDownloadRequest> CREATOR = new dhdi();

    public abstract PendingIntent a();

    public abstract FileInformation b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.B(parcel, a());
        dclw.m(parcel, 2, c(), false);
        dclw.k(parcel, 3, b(), i, false);
        dclw.c(parcel, iA);
    }
}
