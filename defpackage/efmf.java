package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efmf implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Collection] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        String str = (String) efmp.h(parcel, 1).get();
        Parcelable.Creator creator = efmr.a;
        effi effiVar = (effi) efmp.f(parcel, 2, creator).get();
        int i = new int[]{1, 2, 3, 4, 5, 6}[((Integer) efmp.d(parcel, 3).get()).intValue()];
        int i2 = i - 1;
        ekgb ekgbVar = null;
        if (i == 0) {
            throw null;
        }
        efes efbeVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : new efbe((efdc) efmp.f(parcel, 4, efld.a).get()) : new efbi((efer) efmp.f(parcel, 4, eflu.a).get()) : new efbg((efdp) efmp.f(parcel, 4, eflo.a).get()) : new efbj((effa) efmp.f(parcel, 4, efmi.a).get()) : new efbh((efem) efmp.f(parcel, 4, efls.a).get()) : new efbf((efdd) efmp.f(parcel, 4, eflg.a).get());
        int iA = efmp.a(parcel);
        Optional optionalOf = optionalEmpty;
        Optional optionalOf2 = optionalEmpty2;
        while (iA != Integer.MIN_VALUE) {
            if (iA == 5) {
                optionalOf2 = Optional.of((effi) efmp.f(parcel, iA, creator).get());
            } else if (iA == 6) {
                ekgb ekgbVarN = ekgb.n(efmp.g(parcel, iA, eflw.a).get());
                if (ekgbVarN == null) {
                    throw new NullPointerException("Null extensionHeaders");
                }
                ekgbVar = ekgbVarN;
            } else if (iA != 7) {
                efmp.i(parcel, iA);
            } else {
                optionalOf = Optional.of(efmp.c(parcel, iA).get());
            }
            iA = efmp.a(parcel);
        }
        efmp.e(parcel);
        if (ekgbVar == null) {
            int i3 = ekgb.d;
            ekgbVar = ekoe.a;
        }
        ekgb ekgbVar2 = ekgbVar;
        if (efbeVar != null) {
            return new efch(str, effiVar, efbeVar, optionalOf, optionalOf2, ekgbVar2);
        }
        throw new IllegalStateException("Missing required properties:".concat(" content"));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new efeu[i];
    }
}
