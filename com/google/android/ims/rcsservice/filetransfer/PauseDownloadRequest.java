package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.dhde;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class PauseDownloadRequest implements Parcelable {
    public static final Parcelable.Creator<PauseDownloadRequest> CREATOR = new dhde();

    public abstract String a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, a(), false);
        dclw.c(parcel, iA);
    }
}
