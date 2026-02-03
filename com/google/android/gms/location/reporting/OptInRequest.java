package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddpu;
import defpackage.ddqc;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OptInRequest> CREATOR = new ddpu();
    public final Account a;
    public final String b;
    public final String c;
    private final boolean d;

    public OptInRequest(Account account, String str, String str2, boolean z) {
        this.a = account;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptInRequest)) {
            return false;
        }
        OptInRequest optInRequest = (OptInRequest) obj;
        return this.a.equals(optInRequest.a) && dclc.a(this.b, optInRequest.b) && dclc.a(this.c, optInRequest.c) && dclc.a(Boolean.valueOf(this.d), Boolean.valueOf(optInRequest.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "UploadRequest{, account=" + ddqc.a(this.a) + ", tag='" + this.b + ", auditToken=" + this.c + ", enableAdsSubconsent=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, account, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        boolean z = this.d;
        Boolean.valueOf(z).getClass();
        dclw.d(parcel, 5, z);
        dclw.c(parcel, iA);
    }
}
