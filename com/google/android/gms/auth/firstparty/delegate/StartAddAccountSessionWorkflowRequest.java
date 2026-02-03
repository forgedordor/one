package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtg;
import defpackage.dclh;
import defpackage.dclw;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StartAddAccountSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartAddAccountSessionWorkflowRequest> CREATOR = new dbtg();
    public final int a;
    public final AppDescription b;
    public final String c;
    public final AccountAuthenticatorResponse d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    private final List k;
    private final Bundle l;

    public StartAddAccountSessionWorkflowRequest(int i, List list, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z, boolean z2, String str2, String str3, boolean z3, boolean z4) {
        this.a = i;
        this.k = list;
        this.l = bundle;
        dclh.m(appDescription);
        this.b = appDescription;
        this.c = str;
        this.d = accountAuthenticatorResponse;
        this.e = z;
        this.f = z2;
        this.g = str2;
        this.h = str3;
        this.i = z3;
        this.j = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        List list = this.k;
        dclw.D(parcel, 2, list == null ? null : DesugarCollections.unmodifiableList(list));
        dclw.p(parcel, 3, new Bundle(this.l));
        dclw.k(parcel, 4, this.b, i, false);
        dclw.m(parcel, 5, this.c, false);
        dclw.k(parcel, 6, this.d, i, false);
        dclw.d(parcel, 7, this.e);
        dclw.d(parcel, 8, this.f);
        dclw.m(parcel, 9, this.g, false);
        dclw.m(parcel, 10, this.h, false);
        dclw.d(parcel, 11, this.i);
        dclw.d(parcel, 12, this.j);
        dclw.c(parcel, iA);
    }
}
