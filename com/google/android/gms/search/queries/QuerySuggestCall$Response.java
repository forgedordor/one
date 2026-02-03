package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.dedc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QuerySuggestCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<QuerySuggestCall$Response> CREATOR = new dedc();
    public Status a;
    public SuggestionResults b;
    public Bundle c;

    public QuerySuggestCall$Response() {
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

    public QuerySuggestCall$Response(Status status, SuggestionResults suggestionResults, Bundle bundle) {
        this.a = status;
        this.b = suggestionResults;
        this.c = bundle;
    }
}
