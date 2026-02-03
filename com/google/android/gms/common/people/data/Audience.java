package com.google.android.gms.common.people.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcmi;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Audience extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Audience> CREATOR = new dcmi();
    public final int a;
    public final List b;
    public final int c;

    @Deprecated
    public final boolean d;
    public final boolean e;

    public Audience(int i, List list, int i2, boolean z, boolean z2) {
        List listUnmodifiableList;
        if (i == 1) {
            list = list == null ? Collections.EMPTY_LIST : list;
            i = 1;
        }
        this.a = i;
        if (i2 == 1) {
            ArrayList arrayList = new ArrayList();
            for (AudienceMember audienceMember : list) {
                if (audienceMember.b != 1 || audienceMember.c != 1) {
                    arrayList.add(audienceMember);
                }
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        } else {
            listUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        this.b = listUnmodifiableList;
        this.c = i2;
        if (i == 1) {
            this.d = z;
            this.e = !z;
        } else {
            this.e = z2;
            this.d = !z2;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Audience)) {
            return false;
        }
        Audience audience = (Audience) obj;
        return this.a == audience.a && dclc.a(this.b, audience.b) && this.c == audience.c && this.e == audience.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.i(parcel, 2, this.c);
        dclw.d(parcel, 3, this.d);
        dclw.d(parcel, 4, this.e);
        dclw.i(parcel, 1000, this.a);
        dclw.c(parcel, iA);
    }
}
