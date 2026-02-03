package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbqi;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ekgb;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new dbqi();
    public final ekgb a;
    public final Account b;
    public final String c;

    public RevokeAccessRequest(List list, Account account, String str) {
        this.a = ekgb.n(list);
        this.b = account;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            ekgb ekgbVar = this.a;
            int size = ekgbVar.size();
            ekgb ekgbVar2 = revokeAccessRequest.a;
            if (size == ekgbVar2.size() && ekgbVar.containsAll(ekgbVar2) && dclc.a(this.b, revokeAccessRequest.b) && dclc.a(this.c, revokeAccessRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
