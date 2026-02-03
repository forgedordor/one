package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dedb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QuerySuggestCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuerySuggestCall$Request> CREATOR = new dedb();
    public String a;
    public String b;
    public String[] c;
    public int d;
    public SuggestSpecification e;
    public Bundle f;

    public QuerySuggestCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.C(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.k(parcel, 5, this.e, i, false);
        dclw.p(parcel, 6, this.f);
        dclw.c(parcel, iA);
    }

    public QuerySuggestCall$Request(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = suggestSpecification;
        this.f = bundle;
    }
}
