package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbiv;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisterCorpusIMEInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterCorpusIMEInfo> CREATOR = new dbiv();
    public final int a;
    public final String[] b;
    public final String c;
    public final String d;
    public final String[] e;
    public final String f;

    public RegisterCorpusIMEInfo(int i, String[] strArr, String str, String str2, String[] strArr2, String str3) {
        this.a = i;
        this.b = strArr;
        this.c = str;
        this.d = str2;
        this.e = strArr2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusIMEInfo)) {
            return false;
        }
        RegisterCorpusIMEInfo registerCorpusIMEInfo = (RegisterCorpusIMEInfo) obj;
        return this.a == registerCorpusIMEInfo.a && Arrays.equals(this.b, registerCorpusIMEInfo.b) && dclc.a(this.c, registerCorpusIMEInfo.c) && dclc.a(this.d, registerCorpusIMEInfo.d) && Arrays.equals(this.e, registerCorpusIMEInfo.e) && dclc.a(this.f, registerCorpusIMEInfo.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.C(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.C(parcel, 7, this.e);
        dclw.c(parcel, iA);
    }
}
