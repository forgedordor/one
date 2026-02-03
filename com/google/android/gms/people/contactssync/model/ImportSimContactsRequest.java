package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwf;
import defpackage.ejwf;
import defpackage.ejwg;
import defpackage.ejwh;
import defpackage.ekhx;
import defpackage.eonc;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ImportSimContactsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImportSimContactsRequest> CREATOR = new ddwf();
    public final AccountWithDataSet a;
    private final Set b;

    public ImportSimContactsRequest(Set set, AccountWithDataSet accountWithDataSet) {
        this.b = ekhx.o(set);
        this.a = accountWithDataSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportSimContactsRequest)) {
            return false;
        }
        ImportSimContactsRequest importSimContactsRequest = (ImportSimContactsRequest) obj;
        return ejwh.a(this.b, importSimContactsRequest.b) && ejwh.a(this.a, importSimContactsRequest.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("subscriptionIds", this.b);
        ejwfVarB.b("destinationAccount", this.a);
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.b;
        int iA = dclw.a(parcel);
        dclw.v(parcel, 1, eonc.j(set));
        dclw.k(parcel, 2, this.a, i, false);
        dclw.c(parcel, iA);
    }
}
