package com.google.android.apps.messaging.shared.datamodel.data.common;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bajm;
import defpackage.bajo;
import defpackage.bsbs;
import defpackage.cqbd;
import defpackage.cqce;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ParticipantColor implements ParticipantCoreColor {
    public int a;
    public int b;
    public int c;
    private static final cqce d = cqce.g("Bugle", "ParticipantColor");
    public static final Parcelable.Creator<ParticipantColor> CREATOR = new bajm();

    public ParticipantColor() {
        d(null);
    }

    public static ParticipantColor b(String str) {
        try {
            Color.parseColor(str);
            return new ParticipantColor(2, -1, Color.parseColor(str));
        } catch (IllegalArgumentException | NullPointerException e) {
            cqbd cqbdVarE = d.e();
            cqbdVarE.I("Unable to parse color from");
            cqbdVarE.I(str);
            cqbdVarE.s(e);
            return new ParticipantColor(2, -1, 3622735);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor
    public final void c(bsbs bsbsVar) {
        bsbsVar.j(this.b);
        bsbsVar.k(this.a);
        bsbsVar.s(this.c);
    }

    public final void d(ParticipantColor participantColor) {
        if (participantColor != null) {
            e(participantColor.a, participantColor.b, participantColor.c);
        } else {
            e(0, -1, 0);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean f(ParticipantCoreColor participantCoreColor) {
        if (participantCoreColor.a() != 0 || this.a == 0) {
            return (participantCoreColor.a() == 1 && this.a == 2) ? false : true;
        }
        return false;
    }

    public final boolean g() {
        return this.a == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public ParticipantColor(int i, int i2, int i3) {
        e(i, i2, i3);
    }

    public ParticipantColor(Parcel parcel) {
        e(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public ParticipantColor(ParticipantColor participantColor) {
        d(participantColor);
    }

    public ParticipantColor(bajo bajoVar) {
        this(bajoVar.c, (bajoVar.b & 1) != 0 ? bajoVar.d : -1, bajoVar.e);
    }
}
