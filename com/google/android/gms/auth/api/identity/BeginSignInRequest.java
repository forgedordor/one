package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpr;
import defpackage.dbqc;
import defpackage.dbqf;
import defpackage.dbqg;
import defpackage.dbqh;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new dbpr();
    public final PasswordRequestOptions a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final PasskeysRequestOptions f;
    public final PasskeyJsonRequestOptions g;
    public final boolean h;

    /* compiled from: PG */
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new dbqc();
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final List f;
        public final boolean g;

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List list, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            dclh.b(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.a = z;
            if (z) {
                dclh.n(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f = arrayList;
            this.e = str3;
            this.g = z3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.a == googleIdTokenRequestOptions.a && dclc.a(this.b, googleIdTokenRequestOptions.b) && dclc.a(this.c, googleIdTokenRequestOptions.c) && this.d == googleIdTokenRequestOptions.d && dclc.a(this.e, googleIdTokenRequestOptions.e) && dclc.a(this.f, googleIdTokenRequestOptions.f) && this.g == googleIdTokenRequestOptions.g;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int iA = dclw.a(parcel);
            dclw.d(parcel, 1, z);
            dclw.m(parcel, 2, this.b, false);
            dclw.m(parcel, 3, this.c, false);
            dclw.d(parcel, 4, this.d);
            dclw.m(parcel, 5, this.e, false);
            dclw.D(parcel, 6, this.f);
            dclw.d(parcel, 7, this.g);
            dclw.c(parcel, iA);
        }
    }

    /* compiled from: PG */
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new dbqf();
        public final boolean a;
        public final String b;

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                dclh.m(str);
            }
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.a == passkeyJsonRequestOptions.a && dclc.a(this.b, passkeyJsonRequestOptions.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int iA = dclw.a(parcel);
            dclw.d(parcel, 1, z);
            dclw.m(parcel, 2, this.b, false);
            dclw.c(parcel, iA);
        }
    }

    /* compiled from: PG */
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new dbqg();
        public final boolean a;
        public final byte[] b;
        public final String c;

        public PasskeysRequestOptions(boolean z, byte[] bArr, String str) {
            if (z) {
                dclh.m(bArr);
                dclh.m(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.a == passkeysRequestOptions.a && Arrays.equals(this.b, passkeysRequestOptions.b) && Objects.equals(this.c, passkeysRequestOptions.c);
        }

        public final int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.a), this.c) * 31) + Arrays.hashCode(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int iA = dclw.a(parcel);
            dclw.d(parcel, 1, z);
            dclw.f(parcel, 2, this.b, false);
            dclw.m(parcel, 3, this.c, false);
            dclw.c(parcel, iA);
        }
    }

    /* compiled from: PG */
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new dbqh();
        public final boolean a;

        public PasswordRequestOptions(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.a == ((PasswordRequestOptions) obj).a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int iA = dclw.a(parcel);
            dclw.d(parcel, 1, z);
            dclw.c(parcel, iA);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        dclh.m(passwordRequestOptions);
        this.a = passwordRequestOptions;
        dclh.m(googleIdTokenRequestOptions);
        this.b = googleIdTokenRequestOptions;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = passkeysRequestOptions == null ? new PasskeysRequestOptions(false, null, null) : passkeysRequestOptions;
        this.g = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return dclc.a(this.a, beginSignInRequest.a) && dclc.a(this.b, beginSignInRequest.b) && dclc.a(this.f, beginSignInRequest.f) && dclc.a(this.g, beginSignInRequest.g) && dclc.a(this.c, beginSignInRequest.c) && this.d == beginSignInRequest.d && this.e == beginSignInRequest.e && this.h == beginSignInRequest.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PasswordRequestOptions passwordRequestOptions = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, passwordRequestOptions, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.d(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.k(parcel, 7, this.g, i, false);
        dclw.d(parcel, 8, this.h);
        dclw.c(parcel, iA);
    }
}
