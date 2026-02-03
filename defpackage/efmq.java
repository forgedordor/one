package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efmq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcn efcnVar = new efcn();
        efcnVar.c(new int[]{1, 2}[((Integer) efmp.d(parcel, 1).get()).intValue()]);
        efcnVar.b((String) efmp.h(parcel, 2).get());
        ejwl.a(efmp.j(parcel).isPresent());
        return efcnVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new effi[i];
    }
}
