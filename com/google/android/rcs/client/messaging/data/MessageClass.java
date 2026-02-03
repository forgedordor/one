package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.efhx;
import defpackage.efjv;
import defpackage.efjw;
import defpackage.efjx;
import defpackage.efjy;
import defpackage.efkv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageClass implements Parcelable {
    public static final dfny a = dfnv.b("include_disposition_notification_required");
    public static final Parcelable.Creator<MessageClass> CREATOR = new efjv();

    public static efjw e() {
        efhx efhxVar = new efhx();
        efhxVar.e(efjy.UNKNOWN_MESSAGE_SOURCE);
        efhxVar.d(efjx.UNKNOWN_MESSAGE_PRIORITY);
        efhxVar.c(true);
        efhxVar.b(true);
        return efhxVar;
    }

    public static boolean f(MessageClass messageClass) {
        if (messageClass.b() == efjy.CONTROL) {
            return messageClass.a() == efjx.HIGH || messageClass.a() == efjx.NORMAL;
        }
        return false;
    }

    public static boolean g(MessageClass messageClass) {
        return (messageClass.b() == efjy.CONTROL && messageClass.a() == efjx.LOW) ? false : true;
    }

    public static boolean h(MessageClass messageClass) {
        if (messageClass.b() == efjy.USER) {
            return messageClass.a() == efjx.HIGH || messageClass.a() == efjx.NORMAL;
        }
        return false;
    }

    public static boolean i(MessageClass messageClass) {
        return (messageClass.a().equals(efjx.HIGH) || messageClass.a().equals(efjx.NORMAL)) && !messageClass.d();
    }

    public abstract efjx a();

    public abstract efjy b();

    public abstract boolean c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        efkv.c(parcel, 1, b());
        efkv.c(parcel, 2, a());
        dclw.d(parcel, 3, d());
        if (((Boolean) a.a()).booleanValue()) {
            dclw.d(parcel, 4, c());
        }
        dclw.c(parcel, iA);
    }
}
