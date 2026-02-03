package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcus;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetupDuoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetupDuoRequest> CREATOR = new dcus();
    public DuoId[] a;

    public SetupDuoRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetupDuoRequest) {
            return Arrays.equals(this.a, ((SetupDuoRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.E(parcel, 1, this.a, i);
        dclw.c(parcel, iA);
    }

    public SetupDuoRequest(DuoId[] duoIdArr) {
        this.a = duoIdArr;
    }
}
