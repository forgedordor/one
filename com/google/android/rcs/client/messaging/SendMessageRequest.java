package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import defpackage.dclw;
import defpackage.dfog;
import defpackage.efcu;
import defpackage.efdi;
import defpackage.effv;
import defpackage.effw;
import defpackage.efkm;
import defpackage.efkv;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class SendMessageRequest implements Parcelable, efdi {
    public static final Parcelable.Creator<SendMessageRequest> CREATOR = new effv();

    public static effw j() {
        efcu efcuVar = new efcu();
        efcuVar.e(MessageClass.e().a());
        efcuVar.h(TraceId.b().d());
        efcuVar.f(efkm.MESSAGING_METHOD_UNKNOWN);
        return efcuVar;
    }

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract Message c();

    public abstract MessageClass d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.efdi
    public final boolean e() {
        return MessageClass.i(d());
    }

    @Override // defpackage.efdi
    public final boolean f() {
        return b().c() == 2 ? MessageClass.g(d()) : MessageClass.h(d());
    }

    public abstract efkm g();

    public abstract TraceId h();

    public abstract Optional i();

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.B(parcel, a());
        dclw.k(parcel, 2, b(), i, false);
        dclw.k(parcel, 3, c(), i, false);
        dclw.k(parcel, 4, d(), i, false);
        dclw.k(parcel, 5, h(), i, false);
        i().ifPresent(new Consumer() { // from class: effu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dclw.f(parcel, 6, ((evqs) obj).I(), false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (dfog.E()) {
            efkv.c(parcel, 7, g());
        }
        dclw.c(parcel, iA);
    }
}
