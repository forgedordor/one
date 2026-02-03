package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.debp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCorpusStatusCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetCorpusStatusCall$Response> CREATOR = new debp();
    public Status a;
    public CorpusStatus b;

    public GetCorpusStatusCall$Response() {
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
        dclw.c(parcel, iA);
    }

    public GetCorpusStatusCall$Response(Status status, CorpusStatus corpusStatus) {
        this.a = status;
        this.b = corpusStatus;
    }
}
