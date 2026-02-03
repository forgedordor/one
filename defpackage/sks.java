package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sks extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sks> CREATOR = new skt();
    public final ekgb a;
    public final int b;

    public sks(List list, int i) {
        this.a = ekgb.n(list);
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.i(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
