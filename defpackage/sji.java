package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sji extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sji> CREATOR = new sjj();
    public final List a;
    public final shu b;

    public sji(List list, shu shuVar) {
        this.a = list;
        this.b = shuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sji)) {
            return false;
        }
        sji sjiVar = (sji) obj;
        return Objects.equals(this.a, sjiVar.a) && Objects.equals(this.b, sjiVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
