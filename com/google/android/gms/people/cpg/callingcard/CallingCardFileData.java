package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwm;
import defpackage.ejwh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CallingCardFileData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallingCardFileData> CREATOR = new ddwm();
    public final ParcelFileDescriptor a;
    public final String b;
    public final String c;

    public CallingCardFileData(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallingCardFileData) {
            CallingCardFileData callingCardFileData = (CallingCardFileData) obj;
            if (ejwh.a(this.b, callingCardFileData.b) && ejwh.a(this.c, callingCardFileData.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i | 1, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
