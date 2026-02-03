package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<shl> CREATOR = new shm();
    public final int a;
    public final shu b;

    public shl(int i, shu shuVar) {
        this.a = i;
        this.b = shuVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
