package com.google.android.gms.contactkeys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcou;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactInfoParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactInfoParcelable> CREATOR = new dcou();
    public String a;
    public String b;
    public String c;
    public String d;

    public ContactInfoParcelable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContactInfoParcelable) {
            ContactInfoParcelable contactInfoParcelable = (ContactInfoParcelable) obj;
            if (this.a.equals(contactInfoParcelable.a) && dclc.a(this.b, contactInfoParcelable.b) && dclc.a(this.c, contactInfoParcelable.c) && dclc.a(this.d, contactInfoParcelable.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }

    public ContactInfoParcelable(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
