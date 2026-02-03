package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sim extends AbstractSafeParcelable {
    public static final Parcelable.Creator<sim> CREATOR = new sin();
    public final String a;

    @Deprecated
    public final float b;
    public final int c;
    public final float d;

    public sim(String str, float f, int i, float f2) {
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.h(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.h(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
