package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SaveInstrumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveInstrumentRequest> CREATOR = new demj();
    Card a;
    ArrayList b;
    byte[] c;

    private SaveInstrumentRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.n(parcel, 2, this.b, false);
        dclw.f(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }

    public SaveInstrumentRequest(Card card, ArrayList arrayList, byte[] bArr) {
        this.a = card;
        this.b = arrayList;
        this.c = bArr;
    }
}
