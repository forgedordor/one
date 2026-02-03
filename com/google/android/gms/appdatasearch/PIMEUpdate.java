package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbio;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PIMEUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PIMEUpdate> CREATOR = new dbio();
    final byte[] a;
    final byte[] b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    final Bundle g;
    public final long h;
    public final long i;
    public final Account j;

    public PIMEUpdate(byte[] bArr, byte[] bArr2, int i, String str, String str2, boolean z, Bundle bundle, long j, long j2, Account account) {
        this.a = bArr;
        this.b = bArr2;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = bundle;
        this.h = j;
        this.i = j2;
        this.j = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, bArr, false);
        dclw.f(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.d(parcel, 6, this.f);
        dclw.p(parcel, 8, this.g);
        dclw.j(parcel, 9, this.h);
        dclw.j(parcel, 10, this.i);
        dclw.k(parcel, 11, this.j, i, false);
        dclw.c(parcel, iA);
    }
}
