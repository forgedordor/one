package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddmr;
import defpackage.ekfv;
import defpackage.ekgb;
import defpackage.ekoe;
import defpackage.fdbq;
import defpackage.fdgn;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new ddmr();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final ClientIdentity f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ClientIdentity(int i, String str, String str2, String str3, List list, ClientIdentity clientIdentity) {
        if (clientIdentity != null && clientIdentity.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? clientIdentity != null ? clientIdentity.d : null : str3;
        if (list == null) {
            list = clientIdentity != null ? clientIdentity.e : null;
            if (list == null) {
                int i2 = ekgb.d;
                list = ekoe.a;
                list.getClass();
            }
        }
        this.e = ekfv.a(list);
        this.f = clientIdentity;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.a == clientIdentity.a && fdbq.f(this.b, clientIdentity.b) && fdbq.f(this.c, clientIdentity.c) && fdbq.f(this.d, clientIdentity.d) && fdbq.f(this.f, clientIdentity.f) && fdbq.f(this.e, clientIdentity.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.c;
        int length = str != null ? str.length() : 0;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + 18 + length);
        sb.append(this.a);
        sb.append("/");
        sb.append(str2);
        if (str != null) {
            sb.append("[");
            if (fdgn.t(str, str2)) {
                sb.append((CharSequence) str, str2.length(), str.length());
            } else {
                sb.append(str);
            }
            sb.append("]");
        }
        String str3 = this.d;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.m(parcel, 6, this.d, false);
        dclw.k(parcel, 7, this.f, i, false);
        dclw.n(parcel, 8, this.e, false);
        dclw.c(parcel, iA);
    }
}
