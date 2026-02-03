package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dczb;
import defpackage.dczc;
import defpackage.dczd;
import defpackage.ejwh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = new dczd();
    public final String a;
    private final TokenBindingStatus b;

    /* compiled from: PG */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new dczb();
        public final String d;

        TokenBindingStatus(String str) {
            this.d = str;
        }

        public static TokenBindingStatus a(String str) throws dczc {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.d)) {
                    return tokenBindingStatus;
                }
            }
            throw new dczc(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.d);
        }
    }

    static {
        new TokenBinding(TokenBindingStatus.SUPPORTED.d, null);
        new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.d, null);
    }

    public TokenBinding(String str, String str2) {
        dclh.m(str);
        try {
            this.b = TokenBindingStatus.a(str);
            this.a = str2;
        } catch (dczc e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return ejwh.a(this.b, tokenBinding.b) && ejwh.a(this.a, tokenBinding.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b.d;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.a, false);
        dclw.c(parcel, iA);
    }
}
