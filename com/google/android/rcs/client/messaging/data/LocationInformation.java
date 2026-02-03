package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dclw;
import defpackage.dhiz;
import defpackage.efjn;
import defpackage.efkl;
import defpackage.efkv;
import defpackage.eflb;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class LocationInformation implements Parcelable, eflb {
    public static final Parcelable.Creator<LocationInformation> CREATOR = new efjn();

    public abstract double a();

    public abstract double b();

    public abstract Optional c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    @Override // defpackage.eflb
    public final void hl(efkl efklVar) {
        efklVar.f(this);
    }

    public abstract String i();

    public final String toString() {
        String str = String.format("id=%s", i());
        String str2 = String.format("timestamp=%s", h());
        dhiz dhizVar = dhiz.LOCATION;
        return String.format("LocationInformation {%s}", TextUtils.join(",", Arrays.asList(str, str2, String.format("label=%s", dhizVar.c(e())), String.format("location=%s", dhizVar.c(f())), String.format("longitude=%s", dhizVar.c(Double.valueOf(b()))), String.format("latitude=%s", dhizVar.c(Double.valueOf(a()))), String.format("radius=%s", dhizVar.c(g())), String.format("entity=%s", dhizVar.c(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, i(), false);
        if (h().isPresent()) {
            efkv.d(parcel, 2, (Instant) h().get());
        }
        if (d().isPresent()) {
            efkv.d(parcel, 3, (Instant) d().get());
        }
        if (e().isPresent()) {
            dclw.m(parcel, 4, (String) e().get(), false);
        }
        if (f().isPresent()) {
            dclw.m(parcel, 5, (String) f().get(), false);
        }
        dclw.g(parcel, 6, b());
        dclw.g(parcel, 7, a());
        if (g().isPresent()) {
            dclw.g(parcel, 8, ((Double) g().get()).doubleValue());
        }
        if (c().isPresent()) {
            dclw.m(parcel, 9, (String) c().get(), false);
        }
        dclw.c(parcel, iA);
    }
}
