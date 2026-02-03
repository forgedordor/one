package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.deqd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ChannelImpl extends AbstractSafeParcelable implements Channel, ChannelClient.Channel {
    public static final Parcelable.Creator<ChannelImpl> CREATOR = new deqd();
    public final String a;
    public final String b;
    public final String c;

    public ChannelImpl(String str, String str2, String str3) {
        dclh.m(str);
        this.a = str;
        dclh.m(str2);
        this.b = str2;
        dclh.m(str3);
        this.c = str3;
    }

    @Override // com.google.android.gms.wearable.ChannelClient.Channel
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.a.equals(channelImpl.a) && dclc.a(channelImpl.b, this.b) && dclc.a(channelImpl.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String strTrim = str.trim();
        int length = strTrim.length();
        if (length > 25) {
            strTrim = strTrim.substring(0, 10) + "..." + strTrim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + strTrim + ", nodeId=" + this.b + ", path=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.c(parcel, iA);
    }
}
