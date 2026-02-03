package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddve;
import defpackage.ejwh;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactsConsentsConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsConfig> CREATOR = new ddve();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Account d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final boolean i;

    public ContactsConsentsConfig(boolean z, boolean z2, boolean z3, Account account, boolean z4, boolean z5, String str, List list, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = account;
        this.e = z4;
        this.f = z5;
        this.g = str;
        this.h = list;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsConfig)) {
            return false;
        }
        ContactsConsentsConfig contactsConsentsConfig = (ContactsConsentsConfig) obj;
        return this.a == contactsConsentsConfig.a && this.b == contactsConsentsConfig.b && this.c == contactsConsentsConfig.c && this.e == contactsConsentsConfig.e && this.f == contactsConsentsConfig.f && this.i == contactsConsentsConfig.i && ejwh.a(this.d, contactsConsentsConfig.d) && ejwh.a(this.g, contactsConsentsConfig.g) && ejwh.a(this.h, contactsConsentsConfig.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.i), Boolean.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.d(parcel, 2, this.b);
        dclw.d(parcel, 3, this.c);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.d(parcel, 5, this.e);
        dclw.d(parcel, 6, this.f);
        dclw.m(parcel, 7, this.g, false);
        dclw.n(parcel, 8, this.h, false);
        dclw.d(parcel, 9, this.i);
        dclw.c(parcel, iA);
    }
}
