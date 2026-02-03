package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpfd implements crmu {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public cpfd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    @Override // defpackage.crmu
    public final int a() {
        return ((cqpz) this.b.b()).b("bugle_min_phone_number_length_to_format", 7);
    }

    @Override // defpackage.crmu
    public final String b() {
        return ((crpp) this.a.b()).a();
    }

    @Override // defpackage.crmu
    public final String c(int i) {
        String str = (String) ((cuur) this.d.b()).a(i).h().orElse("");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @Override // defpackage.crmu
    public final boolean d() {
        return ((cqjy) this.c.b()).t;
    }
}
