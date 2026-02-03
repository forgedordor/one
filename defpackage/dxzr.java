package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzr implements dxzh {
    public final ekgb a;
    private boolean d;
    private Object e;
    private final dxzf c = new dxzf();
    public final Map b = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public dxzr(ekgb ekgbVar, lvj lvjVar) {
        this.a = ekgbVar;
        int i = ((ekoe) ekgbVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            final dxzd dxzdVar = (dxzd) ekgbVar.get(i2);
            dxzdVar.a.f(lvjVar, new lvz() { // from class: dxzq
                @Override // defpackage.lvz
                public final void a(Object obj) {
                    ejwi ejwiVar = (ejwi) obj;
                    ecem.c();
                    boolean zG = ejwiVar.g();
                    dxzr dxzrVar = this.a;
                    dxzd dxzdVar2 = dxzdVar;
                    if (zG) {
                        dxzrVar.b.put(dxzdVar2, (dxzc) ejwiVar.c());
                    } else {
                        dxzrVar.b.remove(dxzdVar2);
                    }
                    dxzrVar.b();
                }
            });
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dxzh
    public final dxzf a(Object obj) {
        if (obj != this.e) {
            ecem.c();
            this.e = obj;
            this.d = true;
            ekgb ekgbVar = this.a;
            for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
                ((dxzd) ekgbVar.get(i)).a(obj);
            }
            this.d = false;
            b();
        }
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        ecem.c();
        if (this.d) {
            return;
        }
        ekgb ekgbVar = this.a;
        dxzc dxzcVar = null;
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            dxzc dxzcVar2 = (dxzc) this.b.get((dxzd) ekgbVar.get(i));
            if (dxzcVar2 != null && (dxzcVar == null || dxzcVar2.compareTo(dxzcVar) > 0)) {
                dxzcVar = dxzcVar2;
            }
        }
        ejwi ejwiVarI = ejwi.i(dxzcVar);
        if (!ejwiVarI.g()) {
            this.c.c(null);
        } else {
            this.c.c((dxzc) ejwiVarI.c());
        }
    }
}
