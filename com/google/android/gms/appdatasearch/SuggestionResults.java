package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbjk;
import defpackage.dbjl;
import defpackage.dbjm;
import defpackage.dclw;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SuggestionResults extends AbstractSafeParcelable implements Iterable<dbjk> {
    public static final Parcelable.Creator<SuggestionResults> CREATOR = new dbjm();
    final String a;
    public final String[] b;
    final String[] c;

    public SuggestionResults(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // java.lang.Iterable
    public final Iterator<dbjk> iterator() {
        if (this.a != null) {
            return null;
        }
        return new dbjl(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.C(parcel, 2, this.b);
        dclw.C(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
