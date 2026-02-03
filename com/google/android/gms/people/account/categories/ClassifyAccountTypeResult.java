package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dduz;
import defpackage.ddva;
import defpackage.ddvc;
import defpackage.ejwf;
import defpackage.ejwg;
import defpackage.ejwh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClassifyAccountTypeResult> CREATOR = new ddvc();
    public final String a;
    public final String b;
    private final dduz c;
    private final ddva d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        dduz dduzVar;
        this.a = str;
        this.b = str2;
        ddva ddvaVar = null;
        switch (i) {
            case 0:
                dduzVar = dduz.UNKNOWN;
                break;
            case 1:
                dduzVar = dduz.NULL_ACCOUNT;
                break;
            case 2:
                dduzVar = dduz.GOOGLE;
                break;
            case 3:
                dduzVar = dduz.DEVICE;
                break;
            case 4:
                dduzVar = dduz.SIM;
                break;
            case 5:
                dduzVar = dduz.EXCHANGE;
                break;
            case 6:
                dduzVar = dduz.THIRD_PARTY_EDITABLE;
                break;
            case 7:
                dduzVar = dduz.THIRD_PARTY_READONLY;
                break;
            case 8:
                dduzVar = dduz.SIM_SDN;
                break;
            case 9:
                dduzVar = dduz.PRELOAD_SDN;
                break;
            default:
                dduzVar = null;
                break;
        }
        this.c = dduzVar == null ? dduz.UNKNOWN : dduzVar;
        if (i2 == 0) {
            ddvaVar = ddva.UNKNOWN;
        } else if (i2 == 1) {
            ddvaVar = ddva.NONE;
        } else if (i2 == 2) {
            ddvaVar = ddva.EXACT;
        } else if (i2 == 3) {
            ddvaVar = ddva.SUBSTRING;
        } else if (i2 == 4) {
            ddvaVar = ddva.HEURISTIC;
        } else if (i2 == 5) {
            ddvaVar = ddva.SHEEPDOG_ELIGIBLE;
        }
        this.d = ddvaVar == null ? ddva.UNKNOWN : ddvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            if (ejwh.a(this.a, classifyAccountTypeResult.a) && ejwh.a(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("accountType", this.a);
        ejwfVarB.b("dataSet", this.b);
        ejwfVarB.b("category", this.c);
        ejwfVarB.b("matchTag", this.d);
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c.k);
        dclw.i(parcel, 4, this.d.g);
        dclw.c(parcel, iA);
    }
}
