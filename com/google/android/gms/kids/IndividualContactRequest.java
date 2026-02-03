package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddhs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class IndividualContactRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IndividualContactRequest> CREATOR = new ddhs();
    public String a;
    public UriWithType[] b;

    public IndividualContactRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IndividualContactRequest) {
            IndividualContactRequest individualContactRequest = (IndividualContactRequest) obj;
            if (dclc.a(this.a, individualContactRequest.a) && Arrays.equals(this.b, individualContactRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.E(parcel, 2, this.b, i);
        dclw.c(parcel, iA);
    }

    public IndividualContactRequest(String str, UriWithType[] uriWithTypeArr) {
        this.a = str;
        this.b = uriWithTypeArr;
    }
}
