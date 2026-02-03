package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<sjw> CREATOR = new sjx();
    public final String a;
    public final float b;
    public final ekgb c;

    public sjw(String str, float f, List list) {
        this.a = str;
        this.b = f;
        this.c = ekgb.n(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sjw) {
            sjw sjwVar = (sjw) obj;
            if (Objects.equals(this.a, sjwVar.a) && Float.compare(this.b, sjwVar.b) == 0 && Objects.equals(this.c, sjwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.h(parcel, 2, this.b);
        dclw.n(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
