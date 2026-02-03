package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eflp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcc efccVar = new efcc();
        efccVar.b(((Integer) efmp.d(parcel, 1).get()).intValue() == 1);
        ejwl.a(efmp.j(parcel).isPresent());
        return efccVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new efel[i];
    }
}
