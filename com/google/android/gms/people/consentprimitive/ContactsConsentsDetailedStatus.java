package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddvf;
import defpackage.ejwh;
import defpackage.ekgi;
import defpackage.ekgp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactsConsentsDetailedStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsDetailedStatus> CREATOR = new ddvf();
    public final int a;
    public final Bundle b;

    public ContactsConsentsDetailedStatus(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final ekgp a() {
        ekgi ekgiVar = new ekgi();
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            ekgiVar.i(new Account(str, "com.google"), Integer.valueOf(bundle.getInt(str)));
        }
        return ekgiVar.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) obj;
        return this.a == contactsConsentsDetailedStatus.a && ejwh.a(a(), contactsConsentsDetailedStatus.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.p(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
