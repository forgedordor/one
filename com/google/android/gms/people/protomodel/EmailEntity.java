package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddxu;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EmailEntity extends AbstractSafeParcelable implements Email {
    public static final Parcelable.Creator<EmailEntity> CREATOR = new ddxu();
    public final PersonFieldMetadataEntity a;
    public final String b;

    public EmailEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.a = personFieldMetadataEntity;
        this.b = str;
    }

    @Override // com.google.android.gms.people.protomodel.Email
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Email
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Email)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Email email = (Email) obj;
        return dclc.a(a(), email.a()) && dclc.a(b(), email.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, personFieldMetadataEntity, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }
}
