package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import defpackage.dbpl;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.ekgb;
import defpackage.evqs;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new dbpl();
    public final Double a;
    public final String b;
    public final ekgb c;
    public final TokenBinding d;
    public final AuthenticationExtensions e;
    private final evqs f;
    private final UserVerificationRequirement g;

    public PublicKeyCredentialRequestOptions(evqs evqsVar, Double d, String str, List list, TokenBinding tokenBinding, UserVerificationRequirement userVerificationRequirement, AuthenticationExtensions authenticationExtensions) {
        this.f = evqsVar;
        this.a = d;
        dclh.k(str);
        this.b = str;
        this.c = list == null ? null : ekgb.n(list);
        this.d = tokenBinding;
        this.g = userVerificationRequirement;
        this.e = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        ekgb ekgbVar2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return dclc.a(this.f, publicKeyCredentialRequestOptions.f) && dclc.a(this.a, publicKeyCredentialRequestOptions.a) && dclc.a(this.b, publicKeyCredentialRequestOptions.b) && (((ekgbVar = this.c) == null && publicKeyCredentialRequestOptions.c == null) || (ekgbVar != null && (ekgbVar2 = publicKeyCredentialRequestOptions.c) != null && ekgbVar.containsAll(ekgbVar2) && ekgbVar2.containsAll(ekgbVar))) && dclc.a(this.d, publicKeyCredentialRequestOptions.d) && dclc.a(this.g, publicKeyCredentialRequestOptions.g) && dclc.a(this.e, publicKeyCredentialRequestOptions.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.a, this.b, this.c, this.d, this.g, this.e});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nchallenge: %s\ntimeoutSeconds: %s\nrpId: %s\nallowList: %s\ntokenBinding: %s\nauthenticationExtensions :%s}", dcmw.c(this.f.I()), this.a, this.b, this.c, this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        evqs evqsVar = this.f;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, evqsVar.I(), false);
        dclw.r(parcel, 3, this.a);
        dclw.m(parcel, 4, this.b, false);
        dclw.n(parcel, 5, this.c, false);
        dclw.k(parcel, 6, this.d, i, false);
        UserVerificationRequirement userVerificationRequirement = this.g;
        dclw.m(parcel, 7, userVerificationRequirement == null ? null : userVerificationRequirement.d, false);
        dclw.k(parcel, 8, this.e, i, false);
        dclw.c(parcel, iA);
    }
}
