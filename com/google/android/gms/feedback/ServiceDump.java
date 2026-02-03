package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcwp;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ServiceDump extends AbstractSafeParcelable {
    public static final dcwp CREATOR = new dcwp();
    public final ServiceDumpRequest a;
    public final byte[] b;

    public ServiceDump(ServiceDumpRequest serviceDumpRequest, byte[] bArr) {
        serviceDumpRequest.getClass();
        this.a = serviceDumpRequest;
        bArr.getClass();
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServiceDump serviceDump = (ServiceDump) obj;
            if (this.a.equals(serviceDump.a) && Arrays.equals(this.b, serviceDump.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String string = this.a.toString();
        String string2 = Arrays.toString(bArr);
        if (string2.length() > 20) {
            string2 = String.valueOf(string2.substring(0, 17)).concat("...");
        }
        return "ServiceDump{serviceDumpRequest=" + string + ", dumpOutput=\"" + String.format(string2, new Object[0]) + "\"}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.f(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }
}
