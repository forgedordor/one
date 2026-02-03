package com.google.android.gms.contactkeys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcoy;
import defpackage.ekgb;
import defpackage.ekoe;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class E2eeSelfKeyListParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<E2eeSelfKeyListParcelable> CREATOR = new dcoy();
    public final ekgb a;

    private E2eeSelfKeyListParcelable() {
        int i = ekgb.d;
        this.a = ekoe.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2eeSelfKeyListParcelable) {
            return dclc.a(this.a, ((E2eeSelfKeyListParcelable) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.c(parcel, iA);
    }

    public E2eeSelfKeyListParcelable(List list) {
        if (list == null) {
            int i = ekgb.d;
            this.a = ekoe.a;
        } else {
            this.a = ekgb.n(list);
        }
    }
}
