package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sly extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sly> CREATOR = new slz();
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Bitmap f;
    public final Bitmap g;

    public sly(String str, int i, int i2, int i3, int i4, Bitmap bitmap, Bitmap bitmap2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = bitmap;
        this.g = bitmap2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.k(parcel, 7, this.g, i, false);
        dclw.c(parcel, iA);
    }
}
