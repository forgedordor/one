package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbqq;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ekgb;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VerifyWithGoogleRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<VerifyWithGoogleRequest> CREATOR = new dbqq();
    public final ekgb a;
    public final String b;
    public final boolean c;
    public final String d;

    public VerifyWithGoogleRequest(List list, String str, boolean z, String str2) {
        dclh.b((list == null || list.isEmpty()) ? false : true, "requestedScopes cannot be null or empty");
        if (z) {
            dclh.b(str != null, "If offline access is requested, server client id must be provided.");
        } else {
            dclh.b(str == null, "If offline access is not requested, server client id must not be provided.");
        }
        this.a = ekgb.n(list);
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleRequest)) {
            return false;
        }
        VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) obj;
        ekgb ekgbVar = this.a;
        int size = ekgbVar.size();
        ekgb ekgbVar2 = verifyWithGoogleRequest.a;
        return size == ekgbVar2.size() && ekgbVar.containsAll(ekgbVar2) && this.c == verifyWithGoogleRequest.c && dclc.a(this.b, verifyWithGoogleRequest.b) && dclc.a(this.d, verifyWithGoogleRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.c);
        dclw.m(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }
}
