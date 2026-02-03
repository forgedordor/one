package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcmg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new dcmg();
    public final int a;
    public final int b;
    public final Long c;
    public final Long d;
    public final int e;

    public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = l;
        this.d = l2;
        this.e = i3;
        if (l == null || l2 == null || l2.longValue() == 0) {
            return;
        }
        l.longValue();
        if (l2.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.i(parcel, 2, this.b);
        dclw.A(parcel, 3, this.c);
        dclw.A(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}
