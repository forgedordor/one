package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<esbr> CREATOR = new esbs();
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final esav e;
    public final String f;
    public final String g;

    public esbr(int i, Thing[] thingArr, String[] strArr, String[] strArr2, esav esavVar, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = esavVar;
        this.f = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.E(parcel, 2, this.b, i);
        dclw.C(parcel, 3, this.c);
        dclw.C(parcel, 5, this.d);
        dclw.k(parcel, 6, this.e, i, false);
        dclw.m(parcel, 7, this.f, false);
        dclw.m(parcel, 8, this.g, false);
        dclw.c(parcel, iA);
    }
}
