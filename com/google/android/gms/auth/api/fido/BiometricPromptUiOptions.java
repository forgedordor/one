package com.google.android.gms.auth.api.fido;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpe;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BiometricPromptUiOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BiometricPromptUiOptions> CREATOR = new dbpe();
    public final String a;
    public final String b;
    public final String c;
    public final Bitmap d;
    public final String e;

    public BiometricPromptUiOptions(String str, String str2, String str3, Bitmap bitmap, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bitmap;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BiometricPromptUiOptions)) {
            return false;
        }
        BiometricPromptUiOptions biometricPromptUiOptions = (BiometricPromptUiOptions) obj;
        return dclc.a(this.a, biometricPromptUiOptions.a) && dclc.a(this.b, biometricPromptUiOptions.b) && dclc.a(this.c, biometricPromptUiOptions.c) && this.d.sameAs(biometricPromptUiOptions.d) && dclc.a(this.e, biometricPromptUiOptions.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.m(parcel, 6, this.e, false);
        dclw.c(parcel, iA);
    }
}
