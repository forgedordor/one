package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddxs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BirthdayEntity extends AbstractSafeParcelable implements Birthday {
    public static final Parcelable.Creator<BirthdayEntity> CREATOR = new ddxs();
    public final PersonFieldMetadataEntity a;
    public final Long b;

    public BirthdayEntity(PersonFieldMetadataEntity personFieldMetadataEntity, Long l) {
        this.a = personFieldMetadataEntity;
        this.b = l;
    }

    @Override // com.google.android.gms.people.protomodel.Birthday
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Birthday
    public final Long b() {
        return this.b;
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Birthday)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Birthday birthday = (Birthday) obj;
        return dclc.a(a(), birthday.a()) && dclc.a(b(), birthday.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, personFieldMetadataEntity, i, false);
        dclw.A(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
