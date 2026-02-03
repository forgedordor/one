package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efln implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optionalEmpty = Optional.empty();
        Parcelable.Creator creator = efll.a;
        efdo efdoVar = (efdo) efmp.f(parcel, 1, creator).get();
        Optional optionalF = efmp.f(parcel, 2, creator);
        if (optionalF.isPresent()) {
            optionalEmpty = Optional.of((efdo) optionalF.get());
        }
        ejwl.a(efmp.j(parcel).isPresent());
        return new efbu(efdoVar, optionalEmpty);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new efdp[0];
    }
}
