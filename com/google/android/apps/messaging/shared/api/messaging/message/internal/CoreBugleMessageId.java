package com.google.android.apps.messaging.shared.api.messaging.message.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.anbc;
import defpackage.bary;
import defpackage.basd;
import defpackage.ejwl;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CoreBugleMessageId implements BugleMessageId {
    public static final Parcelable.Creator<MessageId> CREATOR = new anbc();
    public final MessageIdType a;
    private final long b;
    private final basd c;
    private final basd d;

    public CoreBugleMessageId(MessageIdType messageIdType, long j) {
        ejwl.a(!messageIdType.equals(bary.a));
        this.a = messageIdType;
        this.b = j;
        basd basdVar = basd.a;
        this.c = basdVar;
        this.d = basdVar;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.MessageId
    public final String a() {
        return this.a.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId
    public final long b() {
        return this.b;
    }

    @Override // defpackage.amgc
    public final MessageIdType c() {
        return this.a;
    }

    @Override // defpackage.amhg
    public final basd d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.amhg
    public final basd e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof CoreBugleMessageId) {
            return this.a.equals(((CoreBugleMessageId) obj).a);
        }
        if (obj instanceof CoreBuglePartialMessageId) {
            CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) obj;
            if (this.a.equals(coreBuglePartialMessageId.a) && this.b == coreBuglePartialMessageId.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.b);
        parcel.writeString(this.d.b);
    }

    public CoreBugleMessageId(MessageIdType messageIdType, long j, basd basdVar, basd basdVar2) {
        ejwl.a(!messageIdType.equals(bary.a));
        this.a = messageIdType;
        this.b = j;
        this.c = basdVar;
        this.d = basdVar2;
    }

    public CoreBugleMessageId(String str) {
        this.a = bary.b(str);
        this.b = -1L;
        basd basdVar = basd.a;
        this.c = basdVar;
        this.d = basdVar;
    }
}
