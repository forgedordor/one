package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deks;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new deks();
    ArrayList a;
    final boolean b;
    boolean c;
    int d;

    private CardRequirements() {
        this.b = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.w(parcel, 1, this.a);
        dclw.d(parcel, 2, this.b);
        dclw.d(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
