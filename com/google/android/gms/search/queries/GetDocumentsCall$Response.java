package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.decu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetDocumentsCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetDocumentsCall$Response> CREATOR = new decu();
    public Status a;
    public DocumentResults b;
    public Bundle c;

    public GetDocumentsCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.p(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }

    public GetDocumentsCall$Response(Status status, DocumentResults documentResults, Bundle bundle) {
        this.a = status;
        this.b = documentResults;
        this.c = bundle;
    }
}
