package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.decx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlobalQueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalQueryCall$Request> CREATOR = new decx();
    public String a;
    public int b;
    public int c;
    public GlobalSearchQuerySpecification d;
    public Bundle e;

    public GlobalQueryCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.p(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }

    public GlobalQueryCall$Request(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = globalSearchQuerySpecification;
        this.e = bundle;
    }
}
