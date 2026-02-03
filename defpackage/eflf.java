package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eflf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optionalOfNullable;
        efdf efdfVar = (efdf) efmp.f(parcel, 1, efli.a).get();
        if (efmp.s(parcel, 2)) {
            parcel.readInt();
            optionalOfNullable = Optional.ofNullable(parcel.createByteArray());
        } else {
            optionalOfNullable = Optional.empty();
        }
        evqs evqsVarX = evqs.x((byte[]) optionalOfNullable.get());
        ejwl.a(efmp.j(parcel).isPresent());
        return new efbo(evqsVarX, efdfVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new efdd[i];
    }
}
