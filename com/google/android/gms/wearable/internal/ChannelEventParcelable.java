package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dclw;
import defpackage.denh;
import defpackage.deqa;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelEventParcelable> CREATOR = new deqa();
    final ChannelImpl a;
    final int b;
    final int c;
    final int d;

    public ChannelEventParcelable(ChannelImpl channelImpl, int i, int i2, int i3) {
        this.a = channelImpl;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(denh denhVar) {
        int i = this.b;
        if (i == 1) {
            denhVar.m(this.a);
            return;
        }
        if (i == 2) {
            denhVar.p(this.a);
            return;
        }
        if (i == 3) {
            denhVar.n(this.a);
        } else if (i != 4) {
            Log.w("ChannelEventParcelable", a.g(i, "Unknown type: "));
        } else {
            denhVar.o(this.a);
        }
    }

    public final String toString() {
        int i = this.b;
        String strValueOf = String.valueOf(this.a);
        String string = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        return "ChannelEventParcelable[, channel=" + strValueOf + ", type=" + string + ", closeReason=" + (i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL") + ", appErrorCode=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.i(parcel, 3, this.b);
        dclw.i(parcel, 4, this.c);
        dclw.i(parcel, 5, this.d);
        dclw.c(parcel, iA);
    }
}
