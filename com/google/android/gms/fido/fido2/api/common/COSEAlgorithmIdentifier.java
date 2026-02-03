package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclh;
import defpackage.dcxg;
import defpackage.dcxw;
import defpackage.dcxx;
import defpackage.dcyb;
import defpackage.dcyx;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new dcxw();
    public final dcxg a;

    public COSEAlgorithmIdentifier(dcxg dcxgVar) {
        dclh.m(dcxgVar);
        this.a = dcxgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier a(int i) throws dcxx {
        dcyx dcyxVar;
        if (i == dcyx.LEGACY_RS1.i) {
            dcyxVar = dcyx.RS1;
        } else {
            dcyx[] dcyxVarArrValues = dcyx.values();
            int length = dcyxVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (dcyb dcybVar : dcyb.values()) {
                        if (dcybVar.h == i) {
                            dcyxVar = dcybVar;
                        }
                    }
                    throw new dcxx(i);
                }
                dcyx dcyxVar2 = dcyxVarArrValues[i2];
                if (dcyxVar2.i == i) {
                    dcyxVar = dcyxVar2;
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(dcyxVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.a.a() == ((COSEAlgorithmIdentifier) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + this.a.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
