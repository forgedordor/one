package com.google.android.gms.location.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddps;
import defpackage.etrc;
import defpackage.etrg;
import defpackage.etry;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetGoogleLocationAccuracyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetGoogleLocationAccuracyRequest> CREATOR = new ddps();
    public final boolean a;
    private final etrc b;
    private final etry c;
    private final etrg d;

    public SetGoogleLocationAccuracyRequest(boolean z, int i, byte[] bArr, byte[] bArr2) {
        etrc etrcVar;
        etry etryVar;
        this.a = z;
        etrg etrgVar = null;
        switch (i) {
            case 0:
                etrcVar = etrc.SOURCE_UNKNOWN;
                break;
            case 1:
                etrcVar = etrc.SOURCE_SYSTEM_SETTINGS;
                break;
            case 2:
                etrcVar = etrc.SOURCE_QUICK_SETTINGS;
                break;
            case 3:
                etrcVar = etrc.SOURCE_LOCATION_ACCURACY;
                break;
            case 4:
                etrcVar = etrc.SOURCE_LOCATION_SETTINGS_DIALOG;
                break;
            case 5:
                etrcVar = etrc.SOURCE_LOCATION_OFF_WARNING_DIALOG;
                break;
            case 6:
                etrcVar = etrc.SOURCE_SETUP_WIZARD;
                break;
            case 7:
                etrcVar = etrc.SOURCE_ADD_ACCOUNT;
                break;
            case 8:
                etrcVar = etrc.SOURCE_EMERGENCY_LOCATION_SERVICE;
                break;
            case 9:
                etrcVar = etrc.SOURCE_FAMILY_LINK;
                break;
            case 10:
                etrcVar = etrc.SOURCE_TEST;
                break;
            case 11:
                etrcVar = etrc.SOURCE_DEMO_USER;
                break;
            default:
                etrcVar = null;
                break;
        }
        dclh.m(etrcVar);
        this.b = etrcVar;
        if (bArr != null) {
            try {
                etryVar = (etry) evsn.parseFrom(etry.a, bArr, evrr.a());
            } catch (evtj e) {
                throw new BadParcelableException(e);
            }
        } else {
            etryVar = null;
        }
        this.c = etryVar;
        if (bArr2 != null) {
            etrgVar = (etrg) evsn.parseFrom(etrg.a, bArr2, evrr.a());
        }
        this.d = etrgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.i(parcel, 2, this.b.m);
        etry etryVar = this.c;
        dclw.f(parcel, 3, etryVar == null ? null : etryVar.toByteArray(), false);
        etrg etrgVar = this.d;
        dclw.f(parcel, 4, etrgVar != null ? etrgVar.toByteArray() : null, false);
        dclw.c(parcel, iA);
    }
}
