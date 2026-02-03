package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.debo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCorpusStatusCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCorpusStatusCall$Request> CREATOR = new debo();
    public String a;
    public String b;

    public GetCorpusStatusCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }

    public GetCorpusStatusCall$Request(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
