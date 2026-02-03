package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddvd;
import defpackage.ejwh;
import defpackage.ekgb;
import defpackage.ekoe;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsCoarseStatus> CREATOR = new ddvd();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        return this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && ejwh.a(this.f, contactsConsentsCoarseStatus.f) && ejwh.a(this.e, contactsConsentsCoarseStatus.e) && ejwh.a(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && ejwh.a(this.g, contactsConsentsCoarseStatus.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVarN;
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.d(parcel, 2, this.b);
        List list = this.e;
        if (list == null) {
            int i2 = ekgb.d;
            ekgbVarN = ekoe.a;
        } else {
            ekgbVarN = ekgb.n(list);
        }
        dclw.n(parcel, 3, ekgbVarN, false);
        List list2 = this.f;
        dclw.n(parcel, 4, list2 == null ? ekoe.a : ekgb.n(list2), false);
        dclw.m(parcel, 5, this.c, false);
        dclw.d(parcel, 6, this.d);
        List list3 = this.g;
        dclw.n(parcel, 7, list3 == null ? ekoe.a : ekgb.n(list3), false);
        dclw.c(parcel, iA);
    }
}
