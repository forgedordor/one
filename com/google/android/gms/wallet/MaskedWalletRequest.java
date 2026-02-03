package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dele;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new dele();
    String a;
    boolean b;
    boolean c;
    boolean d;
    String e;
    String f;
    String g;
    Cart h;
    boolean i;
    boolean j;
    CountrySpecification[] k;
    final boolean l;
    final boolean m;
    ArrayList n;
    PaymentMethodTokenizationParameters o;
    ArrayList p;
    String q;

    MaskedWalletRequest() {
        this.l = true;
        this.m = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.d(parcel, 3, this.b);
        dclw.d(parcel, 4, this.c);
        dclw.d(parcel, 5, this.d);
        dclw.m(parcel, 6, this.e, false);
        dclw.m(parcel, 7, this.f, false);
        dclw.m(parcel, 8, this.g, false);
        dclw.k(parcel, 9, this.h, i, false);
        dclw.d(parcel, 10, this.i);
        dclw.d(parcel, 11, this.j);
        dclw.E(parcel, 12, this.k, i);
        dclw.d(parcel, 13, this.l);
        dclw.d(parcel, 14, this.m);
        dclw.n(parcel, 15, this.n, false);
        dclw.k(parcel, 16, this.o, i, false);
        dclw.w(parcel, 17, this.p);
        dclw.m(parcel, 18, this.q, false);
        dclw.c(parcel, iA);
    }

    public MaskedWalletRequest(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList arrayList2, String str5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = cart;
        this.i = z4;
        this.j = z5;
        this.k = countrySpecificationArr;
        this.l = z6;
        this.m = z7;
        this.n = arrayList;
        this.o = paymentMethodTokenizationParameters;
        this.p = arrayList2;
        this.q = str5;
    }
}
