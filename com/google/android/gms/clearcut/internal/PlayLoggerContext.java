package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcaa;
import defpackage.dcab;
import defpackage.dcbg;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ekqg;
import defpackage.eyek;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlayLoggerContext> CREATOR = new dcbg();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public PlayLoggerContext(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            if (dclc.a(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && dclc.a(this.f, playLoggerContext.f) && dclc.a(this.d, playLoggerContext.d) && this.e == playLoggerContext.e && this.g == playLoggerContext.g && this.h == playLoggerContext.h && dclc.a(this.i, playLoggerContext.i) && this.j == playLoggerContext.j && this.k == playLoggerContext.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.i(parcel, 3, this.b);
        dclw.i(parcel, 4, this.c);
        dclw.m(parcel, 5, this.d, false);
        dclw.d(parcel, 7, this.e);
        dclw.m(parcel, 8, this.f, false);
        dclw.d(parcel, 9, this.g);
        dclw.i(parcel, 10, this.h);
        dclw.x(parcel, 11, this.i);
        dclw.d(parcel, 12, this.j);
        dclw.i(parcel, 13, this.k);
        dclw.c(parcel, iA);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlayLoggerContext(String str, int i, String str2, String str3, eyek eyekVar, dcaa dcaaVar) {
        int i2;
        boolean zA = dcaaVar.a(dcab.ANDROID_ID);
        boolean zEquals = dcaaVar.equals(dcaa.b);
        int i3 = eyekVar.f;
        if (dcaaVar.equals(dcaa.a)) {
            i2 = 0;
        } else {
            ekqg ekqgVarListIterator = dcaaVar.d.listIterator();
            int i4 = -1;
            while (ekqgVarListIterator.hasNext()) {
                i4 &= ~((dcab) ekqgVarListIterator.next()).e;
            }
            i2 = i4;
        }
        this(str, i, -1, str3, zA, str2, zEquals, i3, null, false, i2);
    }
}
