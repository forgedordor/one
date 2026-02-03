package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efiq;
import defpackage.efir;
import defpackage.efis;
import defpackage.efkv;
import defpackage.evqs;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class FileInformation implements Parcelable {
    public static final Parcelable.Creator<FileInformation> CREATOR = new efiq();

    public abstract int a();

    public abstract ContentType b();

    public abstract efir c();

    public abstract Instant d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    @Deprecated
    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        if (h().isPresent()) {
            dclw.m(parcel, 1, (String) h().get(), false);
        }
        dclw.i(parcel, 2, a());
        dclw.k(parcel, 3, b(), i, false);
        dclw.m(parcel, 4, i(), false);
        efkv.d(parcel, 5, d());
        if (g().isPresent()) {
            dclw.i(parcel, 6, ((efis) g().get()).ordinal());
        }
        if (f().isPresent()) {
            dclw.f(parcel, 7, ((evqs) f().get()).I(), false);
        }
        if (e().isPresent()) {
            dclw.j(parcel, 8, ((Duration) e().get()).getSeconds());
        }
        dclw.c(parcel, iA);
    }
}
