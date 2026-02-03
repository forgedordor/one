package com.google.android.gms.auth.api.fido;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpg;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetGooglePasskeyForExportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGooglePasskeyForExportRequest> CREATOR = new dbpg();
    public final Account a;
    public final String b;

    public GetGooglePasskeyForExportRequest(Account account, String str) {
        this.a = account;
        dclh.l(str, "sessionId cannot be empty or null.");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GetGooglePasskeyForExportRequest) {
            GetGooglePasskeyForExportRequest getGooglePasskeyForExportRequest = (GetGooglePasskeyForExportRequest) obj;
            if (dclc.a(this.a, getGooglePasskeyForExportRequest.a) && dclc.a(this.b, getGooglePasskeyForExportRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, account, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }
}
