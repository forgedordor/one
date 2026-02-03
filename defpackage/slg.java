package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<slg> CREATOR = new slh();
    public final String a;
    public final float b;

    public slg(String str, float f) {
        this.a = str;
        this.b = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.h(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
