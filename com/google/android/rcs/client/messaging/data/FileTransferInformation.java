package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efix;
import defpackage.efkl;
import defpackage.eflb;
import defpackage.evqs;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class FileTransferInformation implements Parcelable, eflb {
    public static final Parcelable.Creator<FileTransferInformation> CREATOR = new efix();

    public abstract FileInformation a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eflb
    public final void hl(efkl efklVar) {
        efklVar.d(this);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, a(), i, false);
        if (d().isPresent()) {
            dclw.k(parcel, 2, d().get(), i, false);
        }
        if (b().isPresent()) {
            dclw.f(parcel, 3, ((evqs) b().get()).I(), false);
        }
        if (c().isPresent()) {
            dclw.f(parcel, 4, ((evqs) c().get()).I(), false);
        }
        dclw.c(parcel, iA);
    }
}
