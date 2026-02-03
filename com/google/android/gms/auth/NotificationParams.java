package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbmv;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NotificationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotificationParams> CREATOR = new dbmv();
    public final String a;
    public final String b;
    public final boolean c;

    public NotificationParams(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationParams) {
            NotificationParams notificationParams = (NotificationParams) obj;
            if (TextUtils.equals(this.a, notificationParams.a) && TextUtils.equals(this.b, notificationParams.b) && this.c == notificationParams.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        return "title=" + this.a + ", text=" + this.b + ", suppressNotification=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
