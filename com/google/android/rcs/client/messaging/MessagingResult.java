package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.efcm;
import defpackage.effd;
import defpackage.effe;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessagingResult implements Parcelable {
    public static final Parcelable.Creator<MessagingResult> CREATOR = new effd();
    public static final MessagingResult d;
    public static final MessagingResult e;

    @Deprecated
    public static final MessagingResult f;

    @Deprecated
    public static final MessagingResult g;

    @Deprecated
    public static final MessagingResult h;

    @Deprecated
    public static final MessagingResult i;

    @Deprecated
    public static final MessagingResult j;

    @Deprecated
    public static final MessagingResult k;

    static {
        effe effeVarD = d();
        effeVarD.c(0);
        d = effeVarD.e();
        effe effeVarD2 = d();
        effeVarD2.c(1);
        e = effeVarD2.e();
        effe effeVarD3 = d();
        effeVarD3.c(2);
        f = effeVarD3.e();
        effe effeVarD4 = d();
        effeVarD4.c(3);
        g = effeVarD4.e();
        effe effeVarD5 = d();
        effeVarD5.c(10);
        h = effeVarD5.e();
        effe effeVarD6 = d();
        effeVarD6.c(11);
        i = effeVarD6.e();
        effe effeVarD7 = d();
        effeVarD7.c(12);
        j = effeVarD7.e();
        effe effeVarD8 = d();
        effeVarD8.c(13);
        k = effeVarD8.e();
    }

    public static effe d() {
        efcm efcmVar = new efcm();
        efcmVar.b(0);
        efcmVar.d(Duration.ZERO);
        return efcmVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract Duration c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        String str;
        int iB = b();
        String str2 = "UNKNOWN";
        if (iB == 0) {
            str = "OK";
        } else if (iB == 1) {
            str = "PENDING";
        } else if (iB == 2) {
            str = "FAILED";
        } else if (iB != 3) {
            switch (iB) {
                case 10:
                    str = "FAILED_CLIENT_ERROR";
                    break;
                case 11:
                    str = "FAILED_CLIENT_RESOURCE_NOT_FOUND";
                    break;
                case 12:
                    str = "FAILED_CLIENT_FORBIDDEN";
                    break;
                case 13:
                    str = "FAILED_CLIENT_NOT_ACCEPTABLE";
                    break;
                case 14:
                    str = "FAILED_MAY_LATCH_TO_XMS";
                    break;
                case 15:
                    str = "FAILED_NO_RETRY";
                    break;
                case 16:
                    str = "FAILED_RETRY";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "FAILED_SERVER_ERROR";
        }
        String str3 = String.format("ErrorCode: %s (%s)", str, Integer.valueOf(b()));
        switch (a()) {
            case 0:
                break;
            case 1:
                str2 = "GROUP_TOO_FEW_PARTICIPANTS";
                break;
            case 2:
                str2 = "GROUP_TOO_MANY_PARTICIPANTS";
                break;
            case 3:
                str2 = "USER_NOT_A_GROUP_PARTICIPANT";
                break;
            case 4:
                str2 = "GROUP_SESSION_NOT_FOUND";
                break;
            case 5:
                str2 = "NOT_AUTHORIZED_TO_RESTART_GROUP";
                break;
            case 6:
                str2 = "LOW_PRIORITY_MESSAGE_REJECTED";
                break;
            case 7:
                str2 = "TRANSPORT_INTERNAL_ERROR";
                break;
            default:
                str2 = "INVALID_CAUSE";
                break;
        }
        return String.format("%s with %s", str3, String.format("ErrorCause: %s (%s)", str2, Integer.valueOf(a())));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, b());
        dclw.i(parcel, 2, a());
        dclw.j(parcel, 3, c().getSeconds());
        dclw.c(parcel, iA);
    }
}
