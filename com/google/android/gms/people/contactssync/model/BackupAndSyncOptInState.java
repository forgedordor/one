package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddvw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BackupAndSyncOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BackupAndSyncOptInState> CREATOR = new ddvw();
    public final String a;
    public final int[] b;
    public final int c;
    public final String[] d;

    public BackupAndSyncOptInState(String str, int[] iArr, int i, String[] strArr) {
        this.a = str;
        this.b = iArr;
        this.c = i;
        this.d = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.v(parcel, 2, this.b);
        dclw.i(parcel, 4, this.c);
        dclw.C(parcel, 5, this.d);
        dclw.c(parcel, iA);
    }
}
