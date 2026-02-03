package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvud {
    public final fcsu a;
    public final ains b;
    private final bvsv c;

    public bvud(bvsv bvsvVar, fcsu fcsuVar, ains ainsVar) {
        this.c = bvsvVar;
        this.a = fcsuVar;
        this.b = ainsVar;
    }

    public final void a(ezol ezolVar, String str) {
        if (ezolVar == null || TextUtils.isEmpty(str)) {
            this.b.e("Bugle.Ditto.Connectivity.UpdateOnWorker.Skip.Count", ezolVar == null ? 4 : 5);
            return;
        }
        bvsv bvsvVar = this.c;
        bvtp bvtpVar = (bvtp) bvtq.a.createBuilder();
        epfy epfyVar = epfy.MOBILE_DATA_CONNECTION;
        bvtpVar.copyOnWrite();
        ((bvtq) bvtpVar.instance).c = epfyVar.a();
        bvtpVar.copyOnWrite();
        bvtq bvtqVar = (bvtq) bvtpVar.instance;
        bvtqVar.d = ezolVar;
        bvtqVar.b |= 1;
        bvtpVar.copyOnWrite();
        bvtq bvtqVar2 = (bvtq) bvtpVar.instance;
        str.getClass();
        bvtqVar2.e = str;
        bvtq bvtqVar3 = (bvtq) bvtpVar.build();
        caxr caxrVar = new caxr();
        caxrVar.b = "ditto-user-alert-mobile-connection";
        caxrVar.f = new bvuc(this);
        ((cazj) bvsvVar.a.b()).a(cbcu.g("ditto_process_user_alert", bvtqVar3, caxrVar.a()));
    }
}
