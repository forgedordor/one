package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shd extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<shd> CREATOR = new she();
    public final int a;
    public final String b;
    public final Bitmap c;
    public final int d;
    public final ParcelFileDescriptor e;

    public shd(int i, String str, Bitmap bitmap, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = str;
        this.c = bitmap;
        this.d = i2;
        this.e = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.i(parcel, 4, this.d);
        dclw.k(parcel, 5, this.e, i, false);
        dclw.c(parcel, iA);
    }
}
