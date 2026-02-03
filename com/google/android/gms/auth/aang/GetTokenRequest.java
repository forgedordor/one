package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnk;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetTokenRequest> CREATOR = new dbnk();
    public final GoogleAccount a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final int g;
    public final String h;
    public final boolean i;
    public final byte[] j;
    public final String k;
    public final boolean l;

    public GetTokenRequest(GoogleAccount googleAccount, String str, List list, List list2, List list3, List list4, int i, String str2, boolean z, byte[] bArr, String str3, boolean z2) {
        this.a = googleAccount;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = str2;
        this.i = z;
        this.j = bArr;
        this.k = str3;
        this.l = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, googleAccount, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.D(parcel, 3, this.c);
        dclw.D(parcel, 4, this.d);
        dclw.D(parcel, 5, this.e);
        dclw.D(parcel, 6, this.f);
        dclw.i(parcel, 7, this.g);
        dclw.m(parcel, 8, this.h, false);
        dclw.d(parcel, 9, this.i);
        dclw.f(parcel, 10, this.j, false);
        dclw.m(parcel, 11, this.k, false);
        dclw.d(parcel, 12, this.l);
        dclw.c(parcel, iA);
    }
}
