package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dclw;
import defpackage.ddrc;
import defpackage.ddrk;
import defpackage.ddrs;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PinConfig> CREATOR = new ddrs();
    public final int a;
    public final int b;
    public final Glyph c;

    /* compiled from: PG */
    public static class Glyph extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Glyph> CREATOR = new ddrk();
        public final String a;
        public final ddrc b;
        public int c;
        public int d;

        public Glyph(String str, IBinder iBinder, int i, int i2) {
            this.c = -5041134;
            this.d = -16777216;
            this.a = str;
            this.b = iBinder == null ? null : new ddrc(IObjectWrapper.Stub.asInterface(iBinder));
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.c != glyph.c || !Objects.equals(this.a, glyph.a) || this.d != glyph.d) {
                return false;
            }
            ddrc ddrcVar = this.b;
            if ((ddrcVar == null && glyph.b != null) || (ddrcVar != null && glyph.b == null)) {
                return false;
            }
            ddrc ddrcVar2 = glyph.b;
            if (ddrcVar == null || ddrcVar2 == null) {
                return true;
            }
            return Objects.equals(ObjectWrapper.unwrap(ddrcVar.a), ObjectWrapper.unwrap(ddrcVar2.a));
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int iA = dclw.a(parcel);
            dclw.m(parcel, 2, str, false);
            ddrc ddrcVar = this.b;
            dclw.u(parcel, 3, ddrcVar == null ? null : ddrcVar.a.asBinder());
            dclw.i(parcel, 4, this.c);
            dclw.i(parcel, 5, this.d);
            dclw.c(parcel, iA);
        }
    }

    public PinConfig(int i, int i2, Glyph glyph) {
        this.a = i;
        this.b = i2;
        this.c = glyph;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, i2);
        dclw.i(parcel, 3, this.b);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
