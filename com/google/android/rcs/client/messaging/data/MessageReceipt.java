package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efkf;
import defpackage.efki;
import defpackage.efkj;
import defpackage.efkk;
import defpackage.efkl;
import defpackage.efkv;
import defpackage.eflb;
import defpackage.evqs;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageReceipt implements Parcelable, eflb {
    public static final Parcelable.Creator<MessageReceipt> CREATOR = new efkf();

    public abstract efkk a();

    public abstract Instant b();

    public abstract Optional c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    public abstract String f();

    public abstract String g();

    public final boolean h() {
        return a().equals(efkk.DELIVERY) && g().equals("failed");
    }

    @Override // defpackage.eflb
    public final void hl(efkl efklVar) {
        efklVar.g(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, a().ordinal());
        dclw.m(parcel, 2, f(), false);
        efkv.d(parcel, 3, b());
        dclw.m(parcel, 4, g(), false);
        if (e().isPresent()) {
            dclw.f(parcel, 5, ((evqs) e().get()).I(), false);
        }
        if (d().isPresent()) {
            dclw.m(parcel, 6, ((efkj) d().get()).name(), false);
        }
        if (c().isPresent()) {
            dclw.m(parcel, 7, ((efki) c().get()).name(), false);
        }
        dclw.c(parcel, iA);
    }
}
