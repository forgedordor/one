package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwj;
import defpackage.ejwh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CpgDocumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CpgDocumentRequest> CREATOR = new ddwj();
    public final int a;
    public final PreferenceDocumentRequest b;

    public CpgDocumentRequest(int i, PreferenceDocumentRequest preferenceDocumentRequest) {
        this.a = i;
        this.b = preferenceDocumentRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CpgDocumentRequest cpgDocumentRequest = (CpgDocumentRequest) obj;
            if (this.a == cpgDocumentRequest.a && ejwh.a(this.b, cpgDocumentRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
