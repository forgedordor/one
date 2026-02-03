package com.google.android.gms.cobalt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcdg;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogIntegerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogIntegerRequest> CREATOR = new dcdg();
    public int a;
    public int b;
    public int c;
    public long d;
    public int[] e;

    private LogIntegerRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogIntegerRequest) {
            LogIntegerRequest logIntegerRequest = (LogIntegerRequest) obj;
            if (dclc.a(Integer.valueOf(this.a), Integer.valueOf(logIntegerRequest.a)) && dclc.a(Integer.valueOf(this.b), Integer.valueOf(logIntegerRequest.b)) && dclc.a(Integer.valueOf(this.c), Integer.valueOf(logIntegerRequest.c)) && dclc.a(Long.valueOf(this.d), Long.valueOf(logIntegerRequest.d)) && Arrays.equals(this.e, logIntegerRequest.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.j(parcel, 4, this.d);
        dclw.v(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }

    public LogIntegerRequest(int i, int i2, int i3, long j, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = iArr;
    }
}
