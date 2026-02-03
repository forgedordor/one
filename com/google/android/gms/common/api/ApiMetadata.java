package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfg;
import defpackage.dcfh;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = dcfh.a;
    public static final ApiMetadata a = dcfg.a(null, false);
    public final ComplianceOptions b;
    public boolean c;

    static {
        dcfg.a(null, true);
    }

    public ApiMetadata(ComplianceOptions complianceOptions) {
        this.b = complianceOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return dclc.a(this.b, apiMetadata.b) && this.c == apiMetadata.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
        } else {
            parcel.writeInt(-204102970);
            int iA = dclw.a(parcel);
            dclw.k(parcel, 1, this.b, i, false);
            dclw.c(parcel, iA);
        }
    }
}
