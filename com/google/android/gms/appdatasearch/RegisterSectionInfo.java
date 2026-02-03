package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbix;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterSectionInfo> CREATOR = new dbix();
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final Feature[] g;
    public final String h;
    public final ScoringConfig i;

    public RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, String str4, ScoringConfig scoringConfig) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.g = featureArr;
        this.h = str4;
        this.i = scoringConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSectionInfo)) {
            return false;
        }
        RegisterSectionInfo registerSectionInfo = (RegisterSectionInfo) obj;
        return this.c == registerSectionInfo.c && this.d == registerSectionInfo.d && this.e == registerSectionInfo.e && dclc.a(this.a, registerSectionInfo.a) && dclc.a(this.b, registerSectionInfo.b) && dclc.a(this.f, registerSectionInfo.f) && dclc.a(this.h, registerSectionInfo.h) && dclc.a(this.i, registerSectionInfo.i) && Arrays.equals(this.g, registerSectionInfo.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.d(parcel, 5, this.e);
        dclw.m(parcel, 6, this.f, false);
        dclw.E(parcel, 7, this.g, i);
        dclw.m(parcel, 11, this.h, false);
        dclw.k(parcel, 12, this.i, i, false);
        dclw.c(parcel, iA);
    }
}
