package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dblz;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BrowserResolutionCookie extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BrowserResolutionCookie> CREATOR = new dblz();
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public boolean f;
    public boolean g;

    private BrowserResolutionCookie() {
        this.d = "/";
        this.e = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserResolutionCookie) {
            BrowserResolutionCookie browserResolutionCookie = (BrowserResolutionCookie) obj;
            if (dclc.a(this.a, browserResolutionCookie.a) && dclc.a(this.b, browserResolutionCookie.b) && dclc.a(this.c, browserResolutionCookie.c) && dclc.a(this.d, browserResolutionCookie.d) && dclc.a(Long.valueOf(this.e), Long.valueOf(browserResolutionCookie.e)) && dclc.a(Boolean.valueOf(this.f), Boolean.valueOf(browserResolutionCookie.f)) && dclc.a(Boolean.valueOf(this.g), Boolean.valueOf(browserResolutionCookie.g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.j(parcel, 5, this.e);
        dclw.d(parcel, 6, this.f);
        dclw.d(parcel, 7, this.g);
        dclw.c(parcel, iA);
    }

    public BrowserResolutionCookie(String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        this.d = "/";
        this.e = -1L;
        dclh.k(str);
        this.a = str;
        dclh.k(str2);
        this.b = str2;
        dclh.k(str3);
        this.c = str3;
        dclh.k(str4);
        this.d = str4;
        this.e = j;
        this.f = z;
        this.g = z2;
    }
}
