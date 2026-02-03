package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dbid;
import defpackage.dbim;
import defpackage.dclh;
import defpackage.dclw;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DocumentSection extends AbstractSafeParcelable {
    public final String b;
    final RegisterSectionInfo c;
    public final int d;
    public final byte[] e;
    public static final int a = Integer.parseInt("-1");
    public static final Parcelable.Creator<DocumentSection> CREATOR = new dbid();

    static {
        ArrayList arrayList = new ArrayList();
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        String str2;
        int i2 = a;
        boolean z = true;
        if (i != i2 && dbim.a(i) == null) {
            z = false;
        }
        dclh.b(z, a.g(i, "Invalid section type "));
        this.b = str;
        this.c = registerSectionInfo;
        this.d = i;
        this.e = bArr;
        if (i == i2 || dbim.a(i) != null) {
            str2 = (str == null || bArr == null) ? null : "Both content and blobContent set";
        } else {
            str2 = "Invalid section type " + i;
        }
        if (str2 != null) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.i(parcel, 4, this.d);
        dclw.f(parcel, 5, this.e, false);
        dclw.c(parcel, iA);
    }
}
