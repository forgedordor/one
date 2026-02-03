package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<esaz> CREATOR = new esba();
    public final int a;

    public esaz(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.c(parcel, iA);
    }
}
