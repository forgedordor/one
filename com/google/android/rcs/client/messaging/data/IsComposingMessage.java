package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efjk;
import defpackage.efjm;
import defpackage.efkl;
import defpackage.eflb;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class IsComposingMessage implements Parcelable, eflb {
    public static final Parcelable.Creator<IsComposingMessage> CREATOR = new efjk();

    public abstract efjm a();

    public abstract Optional b();

    public abstract Optional c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eflb
    public final void hl(efkl efklVar) {
        efklVar.e(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, a().ordinal());
        dclw.j(parcel, 2, ((Duration) b().get()).getSeconds());
        if (c().isPresent()) {
            dclw.j(parcel, 3, ((Instant) c().get()).toEpochMilli());
        }
        dclw.c(parcel, iA);
    }
}
