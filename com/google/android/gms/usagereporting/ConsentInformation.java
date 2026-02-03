package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.deje;
import defpackage.dejf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConsentInformation> CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    /* compiled from: PG */
    public static class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator<AccountConsentInformation> CREATOR = new deje();
        public final String a;
        public final byte[] b;
        public final List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            return dclc.a(this.a, accountConsentInformation.a) && dclc.a(this.b, accountConsentInformation.b) && dclc.a(this.c, accountConsentInformation.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int iA = dclw.a(parcel);
            dclw.m(parcel, 1, str, false);
            dclw.f(parcel, 2, this.b, false);
            dclw.w(parcel, 3, new ArrayList(this.c));
            dclw.c(parcel, iA);
        }
    }

    static {
        new ConsentInformation(null, false, false);
        CREATOR = new dejf();
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        return dclc.a(this.c, consentInformation.c) && dclc.a(Boolean.valueOf(this.a), Boolean.valueOf(consentInformation.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, new ArrayList(this.c), false);
        dclw.d(parcel, 2, this.a);
        dclw.d(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
