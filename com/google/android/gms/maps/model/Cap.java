package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddrc;
import defpackage.ddrg;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new ddrg();
    private static final String c = "Cap";
    public final int a;
    public final Float b;
    private final ddrc d;

    protected Cap(int i) {
        this(i, null, null);
    }

    final Cap a() {
        int i = this.a;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            Log.w(c, a.g(i, "Unknown Cap type: "));
            return this;
        }
        ddrc ddrcVar = this.d;
        dclh.i(ddrcVar != null, "bitmapDescriptor must not be null");
        Float f = this.b;
        dclh.i(f != null, "bitmapRefWidth must not be null");
        return new CustomCap(ddrcVar, f.floatValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.a == cap.a && dclc.a(this.d, cap.d) && dclc.a(this.b, cap.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.d, this.b});
    }

    public String toString() {
        return "[Cap: type=" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, i2);
        ddrc ddrcVar = this.d;
        dclw.u(parcel, 3, ddrcVar == null ? null : ddrcVar.a.asBinder());
        dclw.t(parcel, 4, this.b);
        dclw.c(parcel, iA);
    }

    public Cap(int i, ddrc ddrcVar, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = ddrcVar != null && z2;
            i = 3;
        } else {
            z = true;
        }
        dclh.b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), ddrcVar, f));
        this.a = i;
        this.d = ddrcVar;
        this.b = f;
    }
}
