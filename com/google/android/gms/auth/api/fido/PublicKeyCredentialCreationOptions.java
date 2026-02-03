package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import defpackage.dbpk;
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
public class PublicKeyCredentialCreationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new dbpk();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final ekgb c;
    public final Double d;
    public final ekgb e;
    public final AuthenticatorSelectionCriteria f;
    public final TokenBinding g;
    public final AuthenticationExtensions h;
    public final ekgb i;
    private final evqs j;
    private final AttestationConveyancePreference k;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, evqs evqsVar, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, TokenBinding tokenBinding, AttestationConveyancePreference attestationConveyancePreference, AuthenticationExtensions authenticationExtensions, List list3) {
        dclh.n(publicKeyCredentialRpEntity, "relying party entity shouldn't be null");
        this.a = publicKeyCredentialRpEntity;
        dclh.n(publicKeyCredentialUserEntity, "user entity shouldn't be null");
        this.b = publicKeyCredentialUserEntity;
        this.j = evqsVar;
        dclh.n(list, "parameters shouldn't be null");
        this.c = ekgb.n(list);
        this.d = d;
        this.e = list2 == null ? null : ekgb.n(list2);
        this.f = authenticatorSelectionCriteria;
        this.g = tokenBinding;
        this.k = attestationConveyancePreference;
        this.h = authenticationExtensions;
        this.i = list3 != null ? ekgb.n(list3) : null;
    }

    public final String a() {
        AttestationConveyancePreference attestationConveyancePreference = this.k;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.d;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        ekgb ekgbVar2;
        ekgb ekgbVar3;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (dclc.a(this.a, publicKeyCredentialCreationOptions.a) && dclc.a(this.b, publicKeyCredentialCreationOptions.b) && dclc.a(this.j, publicKeyCredentialCreationOptions.j) && dclc.a(this.d, publicKeyCredentialCreationOptions.d)) {
            ekgb ekgbVar4 = this.c;
            ekgb ekgbVar5 = publicKeyCredentialCreationOptions.c;
            if (ekgbVar4.containsAll(ekgbVar5) && ekgbVar5.containsAll(ekgbVar4) && ((((ekgbVar = this.e) == null && publicKeyCredentialCreationOptions.e == null) || (ekgbVar != null && (ekgbVar2 = publicKeyCredentialCreationOptions.e) != null && ekgbVar.containsAll(ekgbVar2) && ekgbVar2.containsAll(ekgbVar))) && dclc.a(this.f, publicKeyCredentialCreationOptions.f) && dclc.a(this.g, publicKeyCredentialCreationOptions.g) && dclc.a(this.k, publicKeyCredentialCreationOptions.k) && dclc.a(this.h, publicKeyCredentialCreationOptions.h))) {
                ekgb ekgbVar6 = this.i;
                if (ekgbVar6 == null && publicKeyCredentialCreationOptions.i == null) {
                    return true;
                }
                return ekgbVar6 != null && (ekgbVar3 = publicKeyCredentialCreationOptions.i) != null && ekgbVar6.containsAll(ekgbVar3) && ekgbVar3.containsAll(ekgbVar6);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.k, this.h, this.i});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nrp: %s\nuser: %s\nchallenge: %s\ntimeoutSeconds: %s\nparameters: %s\nexcludeList: %s\nauthenticatorSelection: %s\ntokenBinding: %s\nattestationConveyancePreference: %s\nauthenticationExtensions :%s\nattestationFormats: %s}", this.a, this.b, dcmw.c(this.j.I()), this.d, this.c, this.e, this.f, this.g, a(), this.h, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, publicKeyCredentialRpEntity, i, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.f(parcel, 4, this.j.I(), false);
        dclw.n(parcel, 5, this.c, false);
        dclw.r(parcel, 6, this.d);
        dclw.n(parcel, 7, this.e, false);
        dclw.k(parcel, 8, this.f, i, false);
        dclw.k(parcel, 9, this.g, i, false);
        dclw.m(parcel, 10, a(), false);
        dclw.k(parcel, 11, this.h, i, false);
        dclw.D(parcel, 12, this.i);
        dclw.c(parcel, iA);
    }
}
