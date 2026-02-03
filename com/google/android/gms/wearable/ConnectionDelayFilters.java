package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.denn;
import defpackage.ejwf;
import defpackage.ejwg;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConnectionDelayFilters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionDelayFilters> CREATOR = new denn();
    public final List a;

    public ConnectionDelayFilters(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionDelayFilters) {
            return Objects.equals(this.a, ((ConnectionDelayFilters) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("dataItemFilters", this.a);
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.c(parcel, iA);
    }
}
