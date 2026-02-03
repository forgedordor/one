package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcmj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AudienceMember extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AudienceMember> CREATOR = new dcmj();
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    @Deprecated
    public final Bundle h;

    public AudienceMember(int i, int i2, int i3, String str, String str2, String str3, String str4, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudienceMember)) {
            return false;
        }
        AudienceMember audienceMember = (AudienceMember) obj;
        return this.a == audienceMember.a && this.b == audienceMember.b && this.c == audienceMember.c && dclc.a(this.d, audienceMember.d) && dclc.a(this.e, audienceMember.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        int i = this.b;
        return i != 2 ? (i == 1 && this.c == -1) ? String.format("Circle [%s] %s", this.d, this.f) : String.format("Group [%s] %s", this.d, this.f) : String.format("Person [%s] %s", this.e, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.i(parcel, 2, this.c);
        dclw.m(parcel, 3, this.d, false);
        dclw.m(parcel, 4, this.e, false);
        dclw.m(parcel, 5, this.f, false);
        dclw.m(parcel, 6, this.g, false);
        dclw.p(parcel, 7, this.h);
        dclw.i(parcel, 1000, this.a);
        dclw.c(parcel, iA);
    }
}
