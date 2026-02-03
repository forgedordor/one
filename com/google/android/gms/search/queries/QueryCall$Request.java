package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.decz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QueryCall$Request> CREATOR = new decz();
    public String a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public QuerySpecification f;
    public Bundle g;

    public QueryCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.C(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.p(parcel, 7, this.g);
        dclw.c(parcel, iA);
    }

    public QueryCall$Request(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = i2;
        this.f = querySpecification;
        this.g = bundle;
    }
}
