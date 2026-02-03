package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.dhdk;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ResumeDownloadResult implements Parcelable {
    public static final Parcelable.Creator<ResumeDownloadResult> CREATOR = new dhdk();

    public abstract FileTransferResult a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, a(), i, false);
        dclw.c(parcel, iA);
    }
}
