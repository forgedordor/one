package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddsk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileGroupWithDownloadStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileGroupWithDownloadStatus> CREATOR = new ddsk();
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public FileGroupWithDownloadStatus(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.d);
        dclw.i(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
