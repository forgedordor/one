package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.dbpt;
import defpackage.dclh;
import defpackage.dclw;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CallerVerificationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallerVerificationRequest> CREATOR = new dbpt();
    final String a;
    final String b;
    final int c;

    public CallerVerificationRequest(String str, String str2, int i) {
        int i2;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else if (i == 3) {
                    i2 = 4;
                } else if (i != 101) {
                    switch (i) {
                        case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                            i2 = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
                            break;
                        case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                            i2 = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
                            break;
                        case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                            i2 = 204;
                            break;
                        case 204:
                            i2 = 205;
                            break;
                        case 205:
                            i2 = 206;
                            break;
                        case 206:
                            i2 = 207;
                            break;
                        case 207:
                            i2 = 208;
                            break;
                        case 208:
                            i2 = 209;
                            break;
                        case 209:
                            i2 = 210;
                            break;
                        case 210:
                            i2 = 211;
                            break;
                        case 211:
                            i2 = 212;
                            break;
                        case 212:
                            i2 = 213;
                            break;
                        case 213:
                            i2 = 214;
                            break;
                        case 214:
                            i2 = 215;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                } else {
                    i2 = 102;
                }
            }
        } else {
            i2 = 1;
        }
        dclh.b(i2 != 0, "Page name must be resolve to an existing PageNumber and be non-null");
        this.a = str;
        this.b = str2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CallerVerificationRequest) {
            CallerVerificationRequest callerVerificationRequest = (CallerVerificationRequest) obj;
            if (Objects.equals(this.a, callerVerificationRequest.a) && Objects.equals(this.b, callerVerificationRequest.b) && this.c == callerVerificationRequest.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        dclw.i(parcel, 4, i2 - 1);
        dclw.c(parcel, iA);
    }
}
