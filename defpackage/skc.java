package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skc implements SafeParcelable {
    public static final Parcelable.Creator<skc> CREATOR = new skd();
    public final ekgb a;
    public final shu b;
    public final sjw c;

    public skc(List list, shu shuVar, sjw sjwVar) {
        this.a = ekgb.n(list);
        this.b = shuVar;
        this.c = sjwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof skc) {
            skc skcVar = (skc) obj;
            if (Objects.equals(this.a, skcVar.a) && Objects.equals(this.b, skcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
