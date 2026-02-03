package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.depq;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppParcelable> CREATOR = new depq();
    public final String a;
    public final String b;
    public final WebIconParcelable c;
    public final String d;
    public final String e;
    public final Float f;
    public final AppWearDetailsParcelable g;

    public AppParcelable(String str, String str2, WebIconParcelable webIconParcelable, String str3, String str4, Float f, AppWearDetailsParcelable appWearDetailsParcelable) {
        this.a = str;
        this.b = str2;
        this.c = webIconParcelable;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = appWearDetailsParcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AppParcelable appParcelable = (AppParcelable) obj;
            if (Objects.equals(this.a, appParcelable.a) && Objects.equals(this.b, appParcelable.b) && Objects.equals(this.c, appParcelable.c) && Objects.equals(this.d, appParcelable.d) && Objects.equals(this.e, appParcelable.e) && Objects.equals(this.f, appParcelable.f) && Objects.equals(this.g, appParcelable.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        WebIconParcelable webIconParcelable = this.c;
        return "AppParcelable{title='" + this.b + "', developerName='" + this.d + "', formattedPrice='" + this.e + "', starRating=" + this.f + ", wearDetails=" + String.valueOf(this.g) + ", deepLinkUri='" + this.a + "', icon=" + String.valueOf(webIconParcelable) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.t(parcel, 6, this.f);
        dclw.k(parcel, 7, this.g, i, false);
        dclw.c(parcel, iA);
    }
}
