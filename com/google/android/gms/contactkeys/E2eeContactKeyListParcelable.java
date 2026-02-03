package com.google.android.gms.contactkeys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcow;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekoe;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class E2eeContactKeyListParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<E2eeContactKeyListParcelable> CREATOR = new dcow();
    public final ekgb a;

    private E2eeContactKeyListParcelable() {
        int i = ekgb.d;
        this.a = ekoe.a;
    }

    public static E2eeContactKeyListParcelable a(DataHolder dataHolder) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int i2 = dataHolder.i;
        int i3 = 0;
        while (i3 < i2) {
            boolean z = true;
            dclh.a(i3 >= 0);
            if (i3 >= dataHolder.i) {
                z = false;
            }
            dclh.a(z);
            String strC = dataHolder.c("lookupKey", i3, dataHolder.b(i3));
            String strC2 = dataHolder.c("deviceId", i3, dataHolder.b(i3));
            String strC3 = dataHolder.c("accountId", i3, dataHolder.b(i3));
            String strC4 = dataHolder.c("ownerPackageName", i3, dataHolder.b(i3));
            int iB = dataHolder.b(i3);
            dataHolder.d("timeUpdated", i3);
            long j = dataHolder.e[iB].getLong(i3, dataHolder.d.getInt("timeUpdated"));
            byte[] bArrG = dataHolder.g("keyValue", i3, dataHolder.b(i3));
            int iA = dataHolder.a("remoteVerificationState", i3, dataHolder.b(i3));
            int iA2 = dataHolder.a("localVerificationState", i3, dataHolder.b(i3));
            String strC5 = dataHolder.c("displayName", i3, dataHolder.b(i3));
            String strC6 = dataHolder.c(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, i3, dataHolder.b(i3));
            int i4 = i2;
            String strC7 = dataHolder.c("emailAddress", i3, dataHolder.b(i3));
            E2eeContactKeyParcelable e2eeContactKeyParcelable = new E2eeContactKeyParcelable();
            e2eeContactKeyParcelable.a = strC;
            e2eeContactKeyParcelable.b = strC2;
            e2eeContactKeyParcelable.c = strC3;
            e2eeContactKeyParcelable.d = strC4;
            e2eeContactKeyParcelable.e = j;
            e2eeContactKeyParcelable.f = bArrG;
            e2eeContactKeyParcelable.h = iA;
            e2eeContactKeyParcelable.g = iA2;
            e2eeContactKeyParcelable.i = strC5;
            e2eeContactKeyParcelable.j = strC6;
            e2eeContactKeyParcelable.k = strC7;
            ekfwVar.h(e2eeContactKeyParcelable);
            i3++;
            i2 = i4;
        }
        ekgb ekgbVarG = ekfwVar.g();
        return new E2eeContactKeyListParcelable(ekgbVarG == null ? ekoe.a : ekgb.n(ekgbVarG));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2eeContactKeyListParcelable) {
            return dclc.a(this.a, ((E2eeContactKeyListParcelable) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.c(parcel, iA);
    }

    public E2eeContactKeyListParcelable(List list) {
        if (list == null) {
            int i = ekgb.d;
            this.a = ekoe.a;
        } else {
            this.a = ekgb.n(list);
        }
    }
}
