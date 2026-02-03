package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<slq> CREATOR = new slr();
    public final float[] a;

    public slq(float[] fArr) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        this.a = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, length);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float[] fArr = this.a;
        int iA = dclw.a(parcel);
        dclw.s(parcel, fArr);
        dclw.c(parcel, iA);
    }
}
