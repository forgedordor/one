package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctuu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/startchat/logger/StartChatEventLogger");
    public final ufx b;
    public final aisp c;
    public final fcsu d;
    public aisq e;
    public final int f;
    private final fcsu g;
    private final fdjx h;

    public ctuu(ufx ufxVar, aisp aispVar, lwn lwnVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        ufxVar.getClass();
        aispVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.b = ufxVar;
        this.c = aispVar;
        this.g = fcsuVar;
        this.d = fcsuVar2;
        this.h = fdjxVar;
        Bundle bundle = (Bundle) lwnVar.b("startchat_logger_bundle");
        Integer num = (Integer) lwnVar.b("contact_picker_source");
        int iA = bundle != null ? emtg.a(bundle.getInt("contact_picker_source")) : num != null ? emtg.a(num.intValue()) : 0;
        this.f = iA == 0 ? 1 : iA;
    }

    public final void a() {
        ufx.d(this.b, 11, 0, this.f, 0, false, 58);
    }

    public final void b(boolean z) {
        ufx.d(this.b, 18, 0, this.f, 4, z, 10);
    }

    public final void c() {
        ufx.d(this.b, 14, 0, this.f, 0, false, 58);
    }

    public final void d() {
        ufx.d(this.b, 10, 0, this.f, 0, false, 58);
    }

    public final void e() {
        ufx.d(this.b, 13, 0, this.f, 0, false, 58);
    }

    public final void f(boolean z) {
        if (!z) {
            ((dzuc) this.g.b()).g(cqjd.k, null, null, dzua.CANCEL);
            return;
        }
        this.b.c(10, this.f);
        fcsu fcsuVar = this.g;
        ((dzuc) fcsuVar.b()).g(cqjd.k, null, null, dzua.SUCCESS);
        ((dzuc) fcsuVar.b()).e(cqjd.l);
    }

    public final void g(String str, String str2) {
        str2.getClass();
        ufx.d(this.b, 8, 0, this.f, 0, false, 58);
        i(false);
        auvw.l(this.h, new ctut(this, str, str2, null));
    }

    public final void h() {
        aisq aisqVar = this.e;
        if (aisqVar != null) {
            aisqVar.a();
        }
    }

    public final void i(boolean z) {
        dzua dzuaVar = z ? dzua.SUCCESS : dzua.CANCEL;
        fcsu fcsuVar = this.g;
        ((dzuc) fcsuVar.b()).g(cqjd.j, null, null, dzuaVar);
        ((dzuc) fcsuVar.b()).g(cqjd.l, null, null, dzuaVar);
    }
}
