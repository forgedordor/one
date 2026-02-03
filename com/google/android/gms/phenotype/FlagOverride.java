package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddyo;
import defpackage.ddzo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FlagOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FlagOverride> CREATOR = new ddyo();
    public final String a;
    public final String b;
    public final Flag c;
    public final boolean d;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = flag;
        this.d = z;
    }

    final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.d(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverride)) {
            return false;
        }
        FlagOverride flagOverride = (FlagOverride) obj;
        return ddzo.a(this.a, flagOverride.a) && ddzo.a(this.b, flagOverride.b) && ddzo.a(this.c, flagOverride.c) && this.d == flagOverride.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.d(parcel, 5, this.d);
        dclw.c(parcel, iA);
    }
}
