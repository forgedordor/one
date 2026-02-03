package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddtr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OpenFileDescriptorRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenFileDescriptorRequest> CREATOR = new ddtr();
    public final Uri a;
    public final int b;

    public OpenFileDescriptorRequest(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.i(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
