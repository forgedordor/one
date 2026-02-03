package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddsj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileGroupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileGroupResponse> CREATOR = new ddsj();
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public FileGroupResponse(String str, String str2, int i, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.n(parcel, 2, this.c, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.i(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
