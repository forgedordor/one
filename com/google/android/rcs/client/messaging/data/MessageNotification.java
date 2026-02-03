package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.dfog;
import defpackage.efhz;
import defpackage.efkc;
import defpackage.efkd;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageNotification implements Parcelable {
    public static final Parcelable.Creator<MessageNotification> CREATOR = new efkc();

    public static efkd e() {
        efhz efhzVar = new efhz();
        efhzVar.e(TraceId.b().d());
        return efhzVar;
    }

    public abstract Conversation a();

    public abstract Message b();

    public abstract TraceId c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, a(), i, false);
        dclw.k(parcel, 2, b(), i, false);
        dclw.k(parcel, 3, c(), i, false);
        if (dfog.v()) {
            d().ifPresent(new Consumer() { // from class: efkb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    efkv.d(parcel, 4, (Instant) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        dclw.c(parcel, iA);
    }
}
