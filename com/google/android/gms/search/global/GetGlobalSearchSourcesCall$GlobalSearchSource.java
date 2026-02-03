package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deby;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetGlobalSearchSourcesCall$GlobalSearchSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$GlobalSearchSource> CREATOR = new deby();
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public GetGlobalSearchSourcesCall$CorpusInfo[] i;
    public boolean j;

    public GetGlobalSearchSourcesCall$GlobalSearchSource() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.i(parcel, 2, this.c);
        dclw.i(parcel, 3, this.d);
        dclw.i(parcel, 4, this.e);
        dclw.m(parcel, 5, this.f, false);
        dclw.m(parcel, 6, this.g, false);
        dclw.m(parcel, 7, this.h, false);
        dclw.E(parcel, 8, this.i, i);
        dclw.d(parcel, 9, this.j);
        dclw.m(parcel, 10, this.b, false);
        dclw.c(parcel, iA);
    }

    public GetGlobalSearchSourcesCall$GlobalSearchSource(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = getGlobalSearchSourcesCall$CorpusInfoArr;
        this.j = z;
    }
}
