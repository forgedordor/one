package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shr extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<shr> CREATOR = new shs();
    public final List a;
    public final shu b;
    public final List c;

    public shr(List list, shu shuVar, List list2) {
        this.a = list;
        this.b = shuVar;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.D(parcel, 1, list);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.n(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
