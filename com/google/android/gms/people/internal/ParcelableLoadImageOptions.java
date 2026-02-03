package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclb;
import defpackage.dclw;
import defpackage.ddxb;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ParcelableLoadImageOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableLoadImageOptions> CREATOR = new ddxb();
    public final int a;
    public final int b;
    public final boolean c;

    public ParcelableLoadImageOptions(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("imageSize", Integer.valueOf(this.a), arrayList);
        dclb.b("avatarOptions", Integer.valueOf(this.b), arrayList);
        dclb.b("useLargePictureForCp2Images", Boolean.valueOf(this.c), arrayList);
        return dclb.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.i(parcel, 2, this.b);
        dclw.d(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
