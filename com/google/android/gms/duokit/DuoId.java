package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcst;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DuoId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DuoId> CREATOR = new dcst();
    public int a;
    public String b;

    public DuoId() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DuoId) {
            DuoId duoId = (DuoId) obj;
            if (dclc.a(Integer.valueOf(this.a), Integer.valueOf(duoId.a)) && dclc.a(this.b, duoId.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }

    public DuoId(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
