package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzo implements dlzn {
    private final dlzc a;
    private final fduj b;
    private final Set c;

    public dlzo(dlze dlzeVar, dlzd dlzdVar) {
        fdjx fdjxVar = (fdjx) dlzeVar.a.b();
        fdjxVar.getClass();
        fdjx fdjxVar2 = (fdjx) dlzeVar.b.b();
        fdjxVar2.getClass();
        dqiz dqizVar = (dqiz) dlzeVar.c.b();
        dqizVar.getClass();
        dlzf dlzfVar = (dlzf) dlzeVar.d.b();
        dlzfVar.getClass();
        dlzc dlzcVar = new dlzc(fdjxVar, fdjxVar2, dqizVar, dlzfVar, dlzdVar);
        this.a = dlzcVar;
        this.b = dlzcVar.g;
        this.c = fcwm.b(dlzcVar);
    }

    @Override // defpackage.dlzn
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.dlzn
    public final fduj b() {
        return this.b;
    }
}
