package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddqa;
import defpackage.ddqc;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UploadRequest> CREATOR = new ddqa();
    public final Account a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public UploadRequest(Account account, String str, long j, long j2, long j3, String str2) {
        this.a = account;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadRequest)) {
            return false;
        }
        UploadRequest uploadRequest = (UploadRequest) obj;
        return this.a.equals(uploadRequest.a) && this.b.equals(uploadRequest.b) && dclc.a(Long.valueOf(this.c), Long.valueOf(uploadRequest.c)) && this.d == uploadRequest.d && this.e == uploadRequest.e && dclc.a(this.f, uploadRequest.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f});
    }

    public final String toString() {
        return "UploadRequest{, mAccount=" + ddqc.a(this.a) + ", mReason='" + this.b + "', mDurationMillis=" + this.c + ", mMovingLatencyMillis=" + this.d + ", mStationaryLatencyMillis=" + this.e + ", mAppSpecificKey='" + this.f + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, account, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.j(parcel, 4, this.c);
        dclw.j(parcel, 5, this.d);
        dclw.j(parcel, 6, this.e);
        dclw.m(parcel, 7, this.f, false);
        dclw.c(parcel, iA);
    }
}
