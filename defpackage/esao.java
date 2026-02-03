package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esao extends AbstractSafeParcelable implements Iterable<esal> {
    public static final Parcelable.Creator<esao> CREATOR = new esap();
    final List a;

    public esao(List list) {
        this.a = list;
    }

    @Override // java.lang.Iterable
    public final Iterator<esal> iterator() {
        return this.a.iterator();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.c(parcel, iA);
    }
}
