package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetDocumentsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetDocumentsCall$Request> CREATOR = new dect();
    public String a;
    public String b;
    public String[] c;
    public QuerySpecification d;
    public Bundle e;

    public GetDocumentsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.C(parcel, 3, this.c);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.p(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }

    public GetDocumentsCall$Request(String str, String str2, String[] strArr, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = querySpecification;
        this.e = bundle;
    }
}
