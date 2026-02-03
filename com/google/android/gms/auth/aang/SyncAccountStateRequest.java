package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnq;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncAccountStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncAccountStateRequest> CREATOR = new dbnq();
    public final GoogleAccount a;
    private final int b;

    public SyncAccountStateRequest(GoogleAccount googleAccount, int i) {
        int i2;
        this.a = googleAccount;
        switch (i) {
            case 0:
                i2 = 2;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 6;
                break;
            case 5:
                i2 = 7;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 9;
                break;
            case 8:
                i2 = 10;
                break;
            case 9:
                i2 = 11;
                break;
            case 10:
                i2 = 12;
                break;
            case 11:
                i2 = 13;
                break;
            case 12:
                i2 = 14;
                break;
            case 13:
                i2 = 15;
                break;
            case 14:
                i2 = 16;
                break;
            case 15:
                i2 = 17;
                break;
            case 16:
                i2 = 18;
                break;
            case 17:
                i2 = 19;
                break;
            case 18:
                i2 = 20;
                break;
            case 19:
                i2 = 21;
                break;
            case 20:
                i2 = 22;
                break;
            case 21:
                i2 = 23;
                break;
            case 22:
                i2 = 24;
                break;
            case 23:
                i2 = 25;
                break;
            case 24:
                i2 = 26;
                break;
            case 25:
                i2 = 27;
                break;
            case 26:
                i2 = 28;
                break;
            case 27:
                i2 = 29;
                break;
            case 28:
                i2 = 30;
                break;
            case 29:
                i2 = 31;
                break;
            case 30:
                i2 = 32;
                break;
            case 31:
                i2 = 33;
                break;
            case 32:
                i2 = 34;
                break;
            case 33:
                i2 = 35;
                break;
            case 34:
                i2 = 36;
                break;
            case 35:
                i2 = 37;
                break;
            case 36:
                i2 = 38;
                break;
            case 37:
                i2 = 39;
                break;
            case 38:
                i2 = 40;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                i2 = 41;
                break;
            case 40:
                i2 = 42;
                break;
            case 41:
                i2 = 43;
                break;
            case 42:
                i2 = 44;
                break;
            case 43:
                i2 = 45;
                break;
            case 44:
                i2 = 46;
                break;
            case 45:
                i2 = 47;
                break;
            case 46:
                i2 = 48;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            throw null;
        }
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, googleAccount, i, false);
        dclw.i(parcel, 2, this.b - 2);
        dclw.c(parcel, iA);
    }
}
