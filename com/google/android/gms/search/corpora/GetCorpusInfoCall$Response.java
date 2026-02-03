package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.debn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCorpusInfoCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetCorpusInfoCall$Response> CREATOR = new debn();
    public Status a;
    public RegisterCorpusInfo b;

    public GetCorpusInfoCall$Response() {
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

    public GetCorpusInfoCall$Response(Status status, RegisterCorpusInfo registerCorpusInfo) {
        this.a = status;
        this.b = registerCorpusInfo;
    }
}
