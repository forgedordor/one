package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<smg> CREATOR = new smh();
    public static final smg a = new smg(false);
    public final boolean b;

    public smg(boolean z) {
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.c(parcel, iA);
    }
}
