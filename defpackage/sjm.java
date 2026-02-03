package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjm extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sjm> CREATOR = new sjn();
    public final ekgb a;
    public final shu b;

    public sjm(List list, shu shuVar) {
        this.a = ekgb.n(list);
        this.b = shuVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
