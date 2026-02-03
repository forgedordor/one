package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dydq {
    public static final /* synthetic */ int a = 0;
    private static final eknw b;
    private final dydh c;
    private boolean d;

    static {
        int i = 0;
        ekjp ekjpVar = new ekjp(dyhr.INCOGNITO, new dyhr[]{dyhr.PRIVACY_ADVISOR, dyhr.SETTINGS, dyhr.HELP_AND_FEEDBACK});
        ekgi ekgiVar = new ekgi(ekjpVar.size());
        Iterator<E> it = ekjpVar.iterator();
        while (it.hasNext()) {
            ekgiVar.i(it.next(), Integer.valueOf(i));
            i++;
        }
        b = new ekeb(ekgiVar.c());
    }

    public dydq(dydh dydhVar) {
        this.c = dydhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekgb a() {
        ekfw ekfwVar = new ekfw();
        ArrayList arrayList = new ArrayList();
        ekgb ekgbVar = ((dyii) ((dydm) this.c).e).j;
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            dyhu dyhuVar = (dyhu) ekgbVar.get(i);
            dyhr dyhrVarG = dyhuVar.g();
            ejwl.l(!dyhrVarG.equals(dyhr.CUSTOM));
            if (!this.d || !dyhrVarG.equals(dyhr.PRIVACY_ADVISOR)) {
                arrayList.add(dyhuVar);
            }
        }
        ekgb ekgbVarE = ekgb.E(new dydp(b), arrayList);
        int i2 = ((ekoe) ekgbVarE).c;
        for (int i3 = 0; i3 < i2; i3++) {
            final dyhu dyhuVar2 = (dyhu) ekgbVarE.get(i3);
            ekfwVar.h(new dyes(new dyfc() { // from class: dydo
                @Override // defpackage.dyfc
                public final dyfk a(Object obj) {
                    int i4 = dydq.a;
                    dyer dyerVar = new dyer(dyhuVar2);
                    dyerVar.j(dygk.COMMON_ACTION_CARD);
                    return dyerVar;
                }
            }));
        }
        return ekfwVar.g();
    }

    public final void b() {
        this.d = true;
    }
}
