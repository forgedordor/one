package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.decj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCorpusHandlesRegisteredForIMECall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetCorpusHandlesRegisteredForIMECall$Response> CREATOR = new decj();
    public Status a;
    public String[] b;

    public GetCorpusHandlesRegisteredForIMECall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.C(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }

    public GetCorpusHandlesRegisteredForIMECall$Response(Status status, String[] strArr) {
        this.a = status;
        this.b = strArr;
    }
}
