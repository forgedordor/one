package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcxz;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CableAuthenticationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CableAuthenticationExtension> CREATOR = new dcxz();
    public final List a;

    public CableAuthenticationExtension(List list) {
        dclh.m(list);
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationExtension)) {
            return false;
        }
        List list = this.a;
        List list2 = ((CableAuthenticationExtension) obj).a;
        return list.containsAll(list2) && list2.containsAll(list);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.c(parcel, iA);
    }
}
