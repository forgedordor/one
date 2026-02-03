package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;
import defpackage.dclw;
import defpackage.ddsy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncRequest> CREATOR = new ddsy();
    public final byte[] a;
    public final SyncOptions b;
    public final long c;
    public final int d;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions, long j) {
        int i2;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    i2 = 4;
                    if (i != 3) {
                        i2 = i != 4 ? 0 : 5;
                    }
                } else {
                    i2 = 3;
                }
            }
        } else {
            i2 = 1;
        }
        this.d = i2 != 0 ? i2 : 1;
        this.a = bArr;
        this.b = syncOptions;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d - 1;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.f(parcel, 2, this.a, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.j(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
