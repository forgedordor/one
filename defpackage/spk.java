package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class spk {
    public abstract smy a();

    public abstract ekgb b();

    /* JADX WARN: Multi-variable type inference failed */
    public final skg c() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVarB = b();
        int size = ekgbVarB.size();
        for (int i2 = 0; i2 < size; i2++) {
            ekfwVar.h(((spj) ekgbVarB.get(i2)).a());
        }
        return new skg(ekfwVar.g(), 1, new smg(false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sks d() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVarB = b();
        int size = ekgbVarB.size();
        for (int i2 = 0; i2 < size; i2++) {
            spj spjVar = (spj) ekgbVarB.get(i2);
            ekfwVar.h(new sko(spjVar.b(), spjVar.a()));
        }
        return new sks(ekfwVar.g(), 1);
    }
}
