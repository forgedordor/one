package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbvv;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileParams> CREATOR = new dbvv();
    public final String a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final long d;

    public FileParams(String str, String str2, ParcelFileDescriptor parcelFileDescriptor, long j) {
        this.a = str;
        this.b = str2;
        this.c = parcelFileDescriptor;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.j(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
