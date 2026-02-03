package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddho;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EnsureSupervisionSetupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EnsureSupervisionSetupResponse> CREATOR = new ddho();
    public int a;

    private EnsureSupervisionSetupResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnsureSupervisionSetupResponse) {
            return dclc.a(Integer.valueOf(this.a), Integer.valueOf(((EnsureSupervisionSetupResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.c(parcel, iA);
    }

    public EnsureSupervisionSetupResponse(int i) {
        this.a = i;
    }
}
