package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dels;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new dels();
    int a;
    int b;
    int c;
    String d;

    private ButtonOptions() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (dclc.a(Integer.valueOf(this.a), Integer.valueOf(buttonOptions.a)) && dclc.a(Integer.valueOf(this.b), Integer.valueOf(buttonOptions.b)) && dclc.a(Integer.valueOf(this.c), Integer.valueOf(buttonOptions.c)) && dclc.a(this.d, buttonOptions.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.m(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }

    public ButtonOptions(int i, int i2, int i3, String str) {
        Integer.valueOf(i).getClass();
        this.a = i;
        Integer.valueOf(i2).getClass();
        this.b = i2;
        Integer.valueOf(i3).getClass();
        this.c = i3;
        dclh.m(str);
        this.d = str;
    }
}
