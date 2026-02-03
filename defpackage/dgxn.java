package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxn extends dgxi {
    private final Context i;
    private final deyw j;

    public dgxn(dfys dfysVar, dgwg dgwgVar, dgxm dgxmVar, dhjt dhjtVar, Context context, deyw deywVar) {
        super(dfysVar, dgwgVar, dgxmVar, dhjtVar);
        this.i = context;
        this.j = deywVar;
    }

    private final void u(int i) {
        ewje ewjeVar = (ewje) ewjh.a.createBuilder();
        ewjeVar.copyOnWrite();
        ewjh ewjhVar = (ewjh) ewjeVar.instance;
        ewjhVar.e = 1;
        ewjhVar.b = 1 | ewjhVar.b;
        ewjeVar.copyOnWrite();
        ewjh ewjhVar2 = (ewjh) ewjeVar.instance;
        ewjhVar2.d = Integer.valueOf(i - 1);
        ewjhVar2.c = 2;
        ewjh ewjhVar3 = (ewjh) ewjeVar.build();
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        ewjhVar3.getClass();
        ewseVar.d = ewjhVar3;
        ewseVar.c = 14;
        this.j.i(this.i, ewsdVar, ewqu.UNEXPECTED_EVENT);
    }

    @Override // defpackage.dgxi
    public final void s(String str, long j, String str2) {
        u(3);
    }

    @Override // defpackage.dgxi
    public final void t(String str) {
        u(2);
    }

    @Override // defpackage.dgvq
    public final void n() {
    }

    @Override // defpackage.dgvq
    public final void o() {
    }
}
