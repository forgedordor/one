package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dclw;
import defpackage.deql;
import j$.util.Objects;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionStateEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionStateEventParcelable> CREATOR = new deql();
    public final int a;
    public final String b;

    public ConnectionStateEventParcelable(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionStateEventParcelable)) {
            return false;
        }
        ConnectionStateEventParcelable connectionStateEventParcelable = (ConnectionStateEventParcelable) obj;
        return this.a == connectionStateEventParcelable.a && Objects.equals(this.b, connectionStateEventParcelable.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String strG;
        int i = this.a;
        switch (i) {
            case NetError.ERR_UNEXPECTED /* -9 */:
                strG = "Migration was cancelled";
                break;
            case NetError.ERR_FILE_TOO_BIG /* -8 */:
                strG = "Another migration is already in progress";
                break;
            case NetError.ERR_TIMED_OUT /* -7 */:
                strG = "Connect message malformed";
                break;
            case -6:
                strG = "Migration status mismatch between watch and phone";
                break;
            case -5:
                strG = "Phone switching feature disabled";
                break;
            case -4:
                strG = "Did not receive connect msg";
                break;
            case -3:
                strG = "No bluetooth connection";
                break;
            case -2:
                strG = "Accounts mismatch";
                break;
            case -1:
                strG = "Unknown failure";
                break;
            case 0:
                strG = "Connected";
                break;
            case 1:
                strG = "Connection handshake in progress";
                break;
            case 2:
                strG = "Connection handshake complete";
                break;
            case 3:
                strG = "Sync with old node suspended";
                break;
            case 4:
                strG = "Control plane transport connected";
                break;
            case 5:
                strG = "Accounts Matched";
                break;
            case 6:
                strG = "Association to watch terminated";
                break;
            default:
                strG = a.g(i, "Unrecognized state value: ");
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, strG);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
