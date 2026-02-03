package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupb implements euoz {
    public static final /* synthetic */ int a = 0;
    private static final ekzm b;
    private final ekxq c;

    static {
        ekgb ekgbVar = ekzm.a;
        ekzi ekziVar = new ekzi();
        ekziVar.a = 100;
        b = new ekzm(ekziVar);
    }

    public eupb(ekxq ekxqVar) {
        this.c = ekxqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0346 A[LOOP:4: B:121:0x033f->B:124:0x0346, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035b  */
    @Override // defpackage.euoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(double r31, double r33, double r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eupb.a(double, double, double):boolean");
    }

    @Override // defpackage.euoz
    public final boolean b() {
        ekxq ekxqVar = this.c;
        Iterator<ekxp> it = ekxqVar.iterator();
        while (it.hasNext()) {
            if (!it.next().H()) {
                return false;
            }
        }
        for (int i = 1; i < ekxqVar.a.size(); i++) {
            if (((ekxp) ekxqVar.a.get(i - 1)).x().compareTo(((ekxp) ekxqVar.a.get(i)).y()) >= 0) {
                return false;
            }
        }
        return true;
    }
}
