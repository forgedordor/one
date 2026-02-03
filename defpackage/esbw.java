package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbw {
    public static esad a(Status status, String str) {
        dclh.m(status);
        String str2 = status.h;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        switch (status.g) {
            case 17510:
                return new esaf(str);
            case 17511:
                return new esag(str);
            case 17512:
            default:
                return new esad(str);
            case 17513:
                return new esae(str);
            case 17514:
                return new esac(str);
        }
    }
}
