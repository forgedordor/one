package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dclw;
import defpackage.dhiz;
import defpackage.efhr;
import defpackage.efjd;
import defpackage.efje;
import defpackage.efjf;
import defpackage.efkv;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GroupMember implements Parcelable {
    public static final Parcelable.Creator<GroupMember> CREATOR = new efjd();

    public static efje f() {
        efhr efhrVar = new efhr();
        efhrVar.b("");
        efhrVar.d(false);
        efhrVar.f(efjf.UNKNOWN);
        return efhrVar;
    }

    public abstract efjf a();

    public abstract RcsDestinationId b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    public final String toString() {
        dhiz dhizVar = dhiz.PHONE_NUMBER;
        return String.format("GroupMember {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", dhizVar.c(b())), String.format("displayName=%s", dhiz.USER_ID.c(d())), String.format("referrer=%s", dhizVar.c(c())), String.format("isOwnUser=%s", Boolean.valueOf(e())), String.format("status=%s", a()))));
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, b(), i, false);
        dclw.m(parcel, 2, d(), false);
        if (c().isPresent()) {
            dclw.k(parcel, 3, c().get(), i, false);
        }
        dclw.d(parcel, 4, e());
        efkv.c(parcel, 5, a());
        dclw.c(parcel, iA);
    }
}
