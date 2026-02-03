package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyjo extends eyjl {
    private final ekgb b;

    public eyjo(Iterable iterable) {
        this.b = ekgb.j(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyjl
    public final eyjm a(Object obj) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVar = this.b;
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            eyjl eyjlVar = (eyjl) ekgbVar.get(i2);
            try {
                ekfwVar.h(eyjlVar.a(obj));
            } catch (RuntimeException e) {
                eyjt.b(e, eyjlVar, obj);
            }
        }
        ekgb ekgbVarG = ekfwVar.g();
        return !ekgbVarG.isEmpty() ? ((ekoe) ekgbVarG).c == 1 ? new eyjs((eyjm) ekis.l(ekgbVarG)) : new eyjp(ekgbVarG) : eyjm.a;
    }
}
