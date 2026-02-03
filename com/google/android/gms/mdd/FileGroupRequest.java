package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddsi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileGroupRequest> CREATOR = new ddsi();
    public final String a;
    public final String b;

    @Deprecated
    public final Account c;

    public FileGroupRequest(String str, String str2, Account account) {
        this.a = str;
        this.b = str2;
        this.c = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
