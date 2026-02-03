package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbik;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlobalSearchCorpusConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalSearchCorpusConfig> CREATOR = new dbik();
    public final int[] a;
    public final Feature[] b;

    public GlobalSearchCorpusConfig(int[] iArr, Feature[] featureArr) {
        this.a = iArr;
        this.b = featureArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalSearchCorpusConfig) {
            GlobalSearchCorpusConfig globalSearchCorpusConfig = (GlobalSearchCorpusConfig) obj;
            if (Arrays.equals(this.b, globalSearchCorpusConfig.b) && Arrays.equals(this.a, globalSearchCorpusConfig.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.v(parcel, 1, this.a);
        dclw.E(parcel, 2, this.b, i);
        dclw.c(parcel, iA);
    }
}
