package com.google.android.gms.multidevice.sync.appcast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddtv;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AppCastRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppCastRequest> CREATOR = new ddtv();
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public AppCastRequest(int i, String str, String str2, int i2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppCastRequest)) {
            return false;
        }
        AppCastRequest appCastRequest = (AppCastRequest) obj;
        return this.a == appCastRequest.a && fdbq.f(this.b, appCastRequest.b) && fdbq.f(this.c, appCastRequest.c) && this.d == appCastRequest.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "AppCastRequest(sessionId=" + this.a + ", castReceiverUri=" + this.b + ", packageName=" + this.c + ", userId=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.i(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
