package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwb;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExtendedSyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExtendedSyncStatus> CREATOR = new ddwb();
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public ExtendedSyncStatus(int i, String str, long j, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    public final String toString() {
        return String.format(Locale.US, "ExtendedSyncStatus{code=%d, message=%s, lastSyncTimeMillis=%d, numOfItems=%d, syncStage=%d, dataType=%d, cycleStatus=%d, numOfSyncedItems=%d, numOfTotalItems=%d}", Integer.valueOf(this.a), this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, i2);
        dclw.m(parcel, 3, this.b, false);
        dclw.j(parcel, 4, this.c);
        dclw.i(parcel, 5, this.d);
        dclw.i(parcel, 6, this.e);
        dclw.i(parcel, 7, this.f);
        dclw.i(parcel, 8, this.g);
        dclw.i(parcel, 9, this.h);
        dclw.i(parcel, 10, this.i);
        dclw.c(parcel, iA);
    }
}
