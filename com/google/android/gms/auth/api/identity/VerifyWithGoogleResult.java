package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbqr;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VerifyWithGoogleResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VerifyWithGoogleResult> CREATOR = new dbqr();
    public final String a;
    public final String b;
    public final List c;
    public final PendingIntent d;

    public VerifyWithGoogleResult(String str, String str2, List list, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        dclh.m(list);
        this.c = list;
        this.d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleResult)) {
            return false;
        }
        VerifyWithGoogleResult verifyWithGoogleResult = (VerifyWithGoogleResult) obj;
        return dclc.a(this.a, verifyWithGoogleResult.a) && dclc.a(this.b, verifyWithGoogleResult.b) && dclc.a(this.c, verifyWithGoogleResult.c) && dclc.a(this.d, verifyWithGoogleResult.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.D(parcel, 3, this.c);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.c(parcel, iA);
    }
}
