package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dczr;
import defpackage.dczs;
import defpackage.dczt;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new dczt();
    public final String a;
    public final String b;
    private final ChannelIdValueType c;

    /* compiled from: PG */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new dczr();
        public final int d;

        ChannelIdValueType(int i) {
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
        }
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    private ChannelIdValue() {
        this.c = ChannelIdValueType.ABSENT;
        this.b = null;
        this.a = null;
    }

    public static ChannelIdValueType a(int i) throws dczs {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.d) {
                return channelIdValueType;
            }
        }
        throw new dczs(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = this.c;
        if (!channelIdValueType.equals(channelIdValue.c)) {
            return false;
        }
        int iOrdinal = channelIdValueType.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.a.equals(channelIdValue.a);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.b.equals(channelIdValue.b);
    }

    public final int hashCode() {
        int i;
        int iHashCode;
        ChannelIdValueType channelIdValueType = this.c;
        int iHashCode2 = channelIdValueType.hashCode() + 31;
        int iOrdinal = channelIdValueType.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.a.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.b.hashCode();
        }
        return i + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        ChannelIdValueType channelIdValueType = ChannelIdValueType.ABSENT;
        dclw.i(parcel, 2, this.c.d);
        dclw.m(parcel, 3, this.a, false);
        dclw.m(parcel, 4, this.b, false);
        dclw.c(parcel, iA);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.c = a(i);
            this.a = str;
            this.b = str2;
        } catch (dczs e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        this.a = str;
        this.c = ChannelIdValueType.STRING;
        this.b = null;
    }
}
