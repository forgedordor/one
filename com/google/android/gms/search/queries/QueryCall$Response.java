package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.deda;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QueryCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<QueryCall$Response> CREATOR = new deda();
    public Status a;
    public SearchResults b;
    public Bundle c;

    public QueryCall$Response() {
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

    public QueryCall$Response(Status status, SearchResults searchResults, Bundle bundle) {
        this.a = status;
        this.b = searchResults;
        this.c = bundle;
    }
}
