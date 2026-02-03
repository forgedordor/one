package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbia;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DocumentContents> CREATOR = new dbia();
    final DocumentSection[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = documentSectionArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            if (dclc.a(this.b, documentContents.b) && dclc.a(Boolean.valueOf(this.c), Boolean.valueOf(documentContents.c)) && dclc.a(this.d, documentContents.d) && Arrays.equals(this.a, documentContents.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.E(parcel, 1, this.a, i);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.c);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.c(parcel, iA);
    }
}
