package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyjp extends eyjm {
    private final ekgb b;

    public eyjp(ekgb ekgbVar) {
        this.b = ekgbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyjm
    public final eyjh a(eyji eyjiVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int i2 = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i2 >= ((ekoe) ekgbVar).c) {
                break;
            }
            eyjm eyjmVar = (eyjm) ekgbVar.get(i2);
            try {
                ekfwVar.h(eyjmVar.a(eyjiVar));
            } catch (RuntimeException e) {
                eyjt.d(e, eyjmVar, eyjiVar);
            }
            i2++;
        }
        ekgb ekgbVarG = ekfwVar.g();
        return !ekgbVarG.isEmpty() ? ((ekoe) ekgbVarG).c == 1 ? new eyjq((eyjh) ekis.l(ekgbVarG)) : new eyjn(ekgbVarG) : eyjh.a;
    }
}
