package com.google.android.gms.spatula.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dedy;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SpatulaSettingPreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SpatulaSettingPreference> CREATOR = new dedy();
    public int a;
    public boolean b;

    public SpatulaSettingPreference() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpatulaSettingPreference) {
            SpatulaSettingPreference spatulaSettingPreference = (SpatulaSettingPreference) obj;
            if (dclc.a(Integer.valueOf(this.a), Integer.valueOf(spatulaSettingPreference.a)) && dclc.a(Boolean.valueOf(this.b), Boolean.valueOf(spatulaSettingPreference.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.d(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }

    public SpatulaSettingPreference(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
