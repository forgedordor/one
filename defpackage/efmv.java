package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efmv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcw efcwVar = new efcw();
        efcwVar.a = efmp.f(parcel, 1, efmr.a);
        efcwVar.b = efmp.c(parcel, 2);
        ejwl.a(efmp.j(parcel).isPresent());
        return efcwVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new efgb[i];
    }
}
