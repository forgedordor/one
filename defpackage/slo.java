package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slo extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<slo> CREATOR = new slp();
    public final ekgb a;
    public final shu b;

    public slo(List list, shu shuVar) {
        this.a = ekgb.n(list);
        this.b = shuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slo)) {
            return false;
        }
        slo sloVar = (slo) obj;
        return Objects.equals(this.a, sloVar.a) && Objects.equals(this.b, sloVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        shu shuVar = this.b;
        return "TextClassificationResult{results=" + String.valueOf(this.a) + ", inferenceEventTraceResult=" + String.valueOf(shuVar) + "}";
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
