package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pqs {
    private final WebSettingsBoundaryInterface a;

    public pqs(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.a = webSettingsBoundaryInterface;
    }

    public void a(int i) {
        this.a.setForceDark(i);
    }

    public void b() {
        this.a.setForceDarkBehavior(1);
    }
}
