package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.decw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetPhraseAffinityCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetPhraseAffinityCall$Response> CREATOR = new decw();
    public Status a;
    public PhraseAffinityResponse b;
    public Bundle c;

    public GetPhraseAffinityCall$Response() {
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

    public GetPhraseAffinityCall$Response(Status status, PhraseAffinityResponse phraseAffinityResponse, Bundle bundle) {
        this.a = status;
        this.b = phraseAffinityResponse;
        this.c = bundle;
    }
}
