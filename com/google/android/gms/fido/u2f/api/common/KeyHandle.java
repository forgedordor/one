package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.dczw;
import defpackage.dczy;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new dczw();
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.d = list;
        } catch (dczy e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.b, keyHandle.b) || !this.c.equals(keyHandle.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && keyHandle.d == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.d) != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    public final String toString() {
        List list = this.d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", dcmw.a(this.b), this.c, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.f(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c.d, false);
        dclw.n(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }
}
