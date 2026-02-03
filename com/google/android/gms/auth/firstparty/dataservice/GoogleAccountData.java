package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsn;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleAccountData> CREATOR = new dbsn();
    final int a;

    @Deprecated
    final String b;
    final boolean c;
    public final List d;
    public final String e;
    public final String f;
    public final Account g;

    public GoogleAccountData(int i, String str, boolean z, List list, String str2, String str3, Account account) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = str2;
        this.f = str3;
        if (account != null || TextUtils.isEmpty(str)) {
            this.g = account;
        } else {
            this.g = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.c);
        dclw.D(parcel, 4, this.d);
        dclw.m(parcel, 5, this.e, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.k(parcel, 7, this.g, i, false);
        dclw.c(parcel, iA);
    }
}
