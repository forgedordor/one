package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edqs {
    public static edrb a(edll edllVar) {
        ekgb ekgbVarC = c(edllVar.b(), 7);
        edqk edqkVar = new edqk();
        ekgbVarC.getClass();
        edqkVar.a = new edqf(ekgbVarC);
        boolean z = true;
        if (ekgbVarC.size() >= edllVar.b().size() && !edllVar.d()) {
            z = false;
        }
        edqkVar.b(z);
        edqkVar.b = edllVar.c();
        return edqkVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static edrb b(edlw edlwVar, int i, edqr edqrVar) {
        ekgb ekgbVarC = edlwVar.c();
        ekfw ekfwVar = new ekfw();
        int size = ekgbVarC.size();
        for (int i2 = 0; i2 < size; i2++) {
            etwu etwuVar = (etwu) ekgbVarC.get(i2);
            int iA = etwt.a(etwuVar.e);
            if (iA != 0 && iA == 2) {
                ekfwVar.h(etwuVar);
            }
        }
        ekgb ekgbVarC2 = c(ekfwVar.g(), i);
        edqk edqkVar = new edqk();
        edqkVar.a = edqrVar.a(ekgbVarC2);
        edqkVar.b(ekgbVarC2.size() < edlwVar.c().size() || edlwVar.d());
        edqkVar.b = edlwVar.b();
        return edqkVar.a();
    }

    private static ekgb c(ekgb ekgbVar, int i) {
        return ekgbVar.subList(0, Math.min(ekgbVar.size(), i));
    }
}
