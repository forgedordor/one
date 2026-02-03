package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shj implements SafeParcelable {
    public static final Parcelable.Creator<shj> CREATOR = new shk();
    public final ekgb a;
    public final shu b;
    public final int c;

    public shj(List list, shu shuVar, int i) {
        this.a = ekgb.n(list);
        this.b = shuVar;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
