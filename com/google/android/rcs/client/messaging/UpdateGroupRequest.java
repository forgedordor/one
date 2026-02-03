package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efdi;
import defpackage.efgi;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class UpdateGroupRequest implements Parcelable, efdi {
    public static final Parcelable.Creator<UpdateGroupRequest> CREATOR = new efgi();

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract Optional c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.efdi
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.efdi
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.B(parcel, a());
        dclw.k(parcel, 2, b(), i, false);
        if (d().isPresent()) {
            dclw.m(parcel, 3, (String) d().get(), false);
        }
        c().ifPresent(new Consumer() { // from class: efgh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dclw.f(parcel, 4, ((evqs) obj).I(), false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dclw.c(parcel, iA);
    }
}
