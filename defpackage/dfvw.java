package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfvw {
    public static dfvv f() {
        dfvl dfvlVar = new dfvl();
        dfvlVar.a = BasePaymentResult.ERROR_REQUEST_FAILED;
        dfvlVar.c = (byte) 1;
        dfvlVar.b = "OK";
        return dfvlVar;
    }

    @Deprecated
    public abstract int a();

    @Deprecated
    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    @Deprecated
    public abstract String e();
}
