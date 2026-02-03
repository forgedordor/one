package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclb;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddxq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AvatarReference extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AvatarReference> CREATOR = new ddxq();
    final int a;

    @Deprecated
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final Long g;
    final Long h;

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        dclh.h(i != 0);
        this.a = i;
        this.b = true == TextUtils.isEmpty(str) ? null : str;
        this.c = true == TextUtils.isEmpty(str2) ? null : str2;
        this.d = true == TextUtils.isEmpty(str3) ? null : str3;
        this.e = true == TextUtils.isEmpty(str4) ? null : str4;
        this.f = true == TextUtils.isEmpty(str5) ? null : str5;
        this.g = l;
        this.h = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AvatarReference avatarReference = (AvatarReference) obj;
            if (this.a == avatarReference.a && dclc.a(this.b, avatarReference.b) && dclc.a(this.c, avatarReference.c) && dclc.a(this.d, avatarReference.d) && dclc.a(this.e, avatarReference.e) && dclc.a(this.f, avatarReference.f) && dclc.a(this.g, avatarReference.g) && dclc.a(this.h, avatarReference.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("source", Integer.valueOf(this.a), arrayList);
        dclb.b("location", this.b, arrayList);
        dclb.b("url", this.c, arrayList);
        dclb.b("email", this.d, arrayList);
        dclb.b("account", this.e, arrayList);
        dclb.b("focusId", this.f, arrayList);
        dclb.b("contactId", this.g, arrayList);
        dclb.b("rawContactId", this.h, arrayList);
        return dclb.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.A(parcel, 7, this.g);
        dclw.A(parcel, 8, this.h);
        dclw.c(parcel, iA);
    }
}
