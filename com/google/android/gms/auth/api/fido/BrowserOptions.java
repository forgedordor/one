package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpf;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BrowserOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BrowserOptions> CREATOR = new dbpf();
    public final String a;
    public final ChromeOptions b;
    private final evqs c;

    public BrowserOptions(String str, evqs evqsVar, ChromeOptions chromeOptions) {
        dclh.m(str);
        this.a = str;
        this.c = evqsVar;
        this.b = chromeOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserOptions)) {
            return false;
        }
        BrowserOptions browserOptions = (BrowserOptions) obj;
        return dclc.a(this.a, browserOptions.a) && dclc.a(this.c, browserOptions.c) && dclc.a(this.b, browserOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        evqs evqsVar = this.c;
        dclw.f(parcel, 3, evqsVar == null ? null : evqsVar.I(), false);
        dclw.k(parcel, 4, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
