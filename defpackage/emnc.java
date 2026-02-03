package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emnc {
    public final emoo a;

    public emnc(emoo emooVar) {
        this.a = emooVar;
    }

    public final /* synthetic */ emop a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (emop) evsnVarBuild;
    }

    public final void b(empl emplVar) {
        emoo emooVar = this.a;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emopVar.d = emplVar;
        emopVar.c = 102;
    }

    public final void c(emqj emqjVar) {
        emoo emooVar = this.a;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emopVar.f = emqjVar;
        emopVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public final void d(emqu emquVar) {
        emoo emooVar = this.a;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emopVar.f = emquVar;
        emopVar.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
    }
}
