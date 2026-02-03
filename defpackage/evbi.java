package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<evbi> CREATOR = new evbj();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final String f;
    public final boolean g;

    public evbi(String str, String str2, String str3, boolean z, int i, String str4, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.e = i;
        this.d = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.d(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.m(parcel, 6, this.f, false);
        dclw.d(parcel, 7, this.g);
        dclw.c(parcel, iA);
    }
}
