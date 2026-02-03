package com.google.android.rcs.client.messaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efcl;
import defpackage.effb;
import defpackage.effc;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessagingOperationResult implements Parcelable {
    public static final Parcelable.Creator<MessagingOperationResult> CREATOR = new effb();

    public static effc e() {
        efcl efclVar = new efcl();
        efclVar.c(false);
        return efclVar;
    }

    public static MessagingOperationResult f(Intent intent) {
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MESSAGING_OPERATION_RESULT");
            if (byteArrayExtra == null) {
                throw new IllegalArgumentException("Intent extra is missing MESSAGING_OPERATION_RESULT key");
            }
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            try {
                try {
                    return CREATOR.createFromParcel(parcelObtain);
                } finally {
                    parcelObtain.recycle();
                }
            } catch (IllegalStateException | NoSuchElementException e) {
                throw new IllegalArgumentException("Error unmarshalling the MessagingOperationResult", e);
            }
        } catch (ClassCastException e2) {
            throw new IllegalArgumentException("Wrong value type from the intent extra key MESSAGING_OPERATION_RESULT", e2);
        }
    }

    public abstract MessagingResult a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract String c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, a(), i, false);
        dclw.k(parcel, 2, b(), i, false);
        dclw.m(parcel, 3, c(), false);
        dclw.d(parcel, 4, d());
        dclw.c(parcel, iA);
    }
}
