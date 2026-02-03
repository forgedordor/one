package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shy extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<shy> CREATOR = new shz();
    public final ekgb a;
    public final String b;

    public shy(List list, String str) {
        this.a = ekgb.n(list);
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
