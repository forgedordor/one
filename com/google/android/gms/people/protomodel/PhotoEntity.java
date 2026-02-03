package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddya;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhotoEntity extends AbstractSafeParcelable implements Photo {
    public static final Parcelable.Creator<PhotoEntity> CREATOR = new ddya();
    public final PersonFieldMetadataEntity a;
    public final String b;

    public PhotoEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.a = personFieldMetadataEntity;
        this.b = str;
    }

    @Override // com.google.android.gms.people.protomodel.Photo
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Photo
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Photo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Photo photo = (Photo) obj;
        return dclc.a(a(), photo.a()) && dclc.a(b(), photo.b());
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
