package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efdk;
import defpackage.ekgb;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class CreateGroupRequest implements Parcelable {
    public static final Parcelable.Creator<CreateGroupRequest> CREATOR = new efdk();

    public abstract PendingIntent a();

    public abstract ekgb b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.B(parcel, a());
        dclw.m(parcel, 2, d(), false);
        dclw.m(parcel, 3, e(), false);
        dclw.n(parcel, 4, b(), false);
        c().ifPresent(new Consumer() { // from class: efdj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dclw.f(parcel, 5, ((evqs) obj).I(), false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dclw.c(parcel, iA);
    }
}
