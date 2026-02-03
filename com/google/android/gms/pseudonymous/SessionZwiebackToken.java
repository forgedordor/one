package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.deag;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SessionZwiebackToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionZwiebackToken> CREATOR = new deag();
    private final String a;
    private final String b;

    public SessionZwiebackToken(Parcel parcel) {
        this.a = parcel.readString();
        String string = parcel.readString();
        dclh.m(string);
        this.b = string;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionZwiebackToken)) {
            return false;
        }
        SessionZwiebackToken sessionZwiebackToken = (SessionZwiebackToken) obj;
        return dclc.a(this.a, sessionZwiebackToken.a) && dclc.a(this.b, sessionZwiebackToken.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
