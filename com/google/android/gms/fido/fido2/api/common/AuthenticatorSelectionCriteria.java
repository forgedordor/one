package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcxi;
import defpackage.dcxt;
import defpackage.dcyz;
import defpackage.dczg;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new dcxt();
    public final Boolean a;
    private final Attachment b;
    private final UserVerificationRequirement c;
    private final ResidentKeyRequirement d;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentA;
        ResidentKeyRequirement residentKeyRequirementA = null;
        if (str == null) {
            attachmentA = null;
        } else {
            try {
                attachmentA = Attachment.a(str);
            } catch (dcxi | dcyz | dczg e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.b = attachmentA;
        this.a = bool;
        this.c = str2 == null ? null : UserVerificationRequirement.a(str2);
        if (str3 != null) {
            residentKeyRequirementA = ResidentKeyRequirement.a(str3);
        }
        this.d = residentKeyRequirementA;
    }

    public final ResidentKeyRequirement a() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.a;
        return (bool == null || !bool.booleanValue()) ? ResidentKeyRequirement.RESIDENT_KEY_DISCOURAGED : ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return dclc.a(this.b, authenticatorSelectionCriteria.b) && dclc.a(this.a, authenticatorSelectionCriteria.a) && dclc.a(this.c, authenticatorSelectionCriteria.c) && dclc.a(a(), authenticatorSelectionCriteria.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, a()});
    }

    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        UserVerificationRequirement userVerificationRequirement = this.c;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.b) + ", \n requireResidentKey=" + this.a + ", \n requireUserVerification=" + String.valueOf(userVerificationRequirement) + ", \n residentKeyRequirement=" + String.valueOf(residentKeyRequirement) + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        Attachment attachment = this.b;
        dclw.m(parcel, 2, attachment == null ? null : attachment.c, false);
        dclw.o(parcel, 3, this.a);
        UserVerificationRequirement userVerificationRequirement = this.c;
        dclw.m(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.d, false);
        ResidentKeyRequirement residentKeyRequirementA = a();
        dclw.m(parcel, 5, residentKeyRequirementA != null ? residentKeyRequirementA.d : null, false);
        dclw.c(parcel, iA);
    }
}
