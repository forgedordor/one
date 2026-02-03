package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcno;
import defpackage.ddnv;
import defpackage.ddpo;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationRequestInternal> CREATOR = new ddpo();
    LocationRequest a;

    public LocationRequestInternal(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource;
        ddnv ddnvVar = new ddnv(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    dcno.a(workSource, clientIdentity.a, clientIdentity.b);
                }
            }
            ddnvVar.c = workSource;
        }
        if (z) {
            ddnvVar.c(1);
        }
        if (z2) {
            ddnvVar.g(2);
        }
        if (z3) {
            ddnvVar.b = true;
        }
        if (z4) {
            ddnvVar.a = true;
        }
        if (j != Long.MAX_VALUE) {
            ddnvVar.d(j);
        }
        this.a = ddnvVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return dclc.a(this.a, ((LocationRequestInternal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.c(parcel, iA);
    }
}
