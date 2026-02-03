package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<sgz> CREATOR = new sha();
    public final int a;
    public final ekgb b;
    public final ekgb c;
    public final boolean d;
    public final boolean e;

    public sgz(int i, List list, List list2, boolean z, boolean z2) {
        this.a = i;
        this.b = ekgb.n(list);
        this.c = ekgb.n(list2);
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.D(parcel, 2, this.b);
        dclw.D(parcel, 3, this.c);
        dclw.d(parcel, 4, this.d);
        dclw.d(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}
