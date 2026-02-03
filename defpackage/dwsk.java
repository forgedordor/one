package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwsk {
    public abstract ekgb a();

    public abstract String b();

    /* JADX WARN: Multi-variable type inference failed */
    public final String c() {
        String strB = b();
        ekgb ekgbVarA = a();
        int i = ((ekoe) ekgbVarA).c;
        int i2 = 0;
        while (i2 < i) {
            dwsj dwsjVar = (dwsj) ekgbVarA.get(i2);
            String strB2 = dwsjVar.b();
            int iA = dwsjVar.a();
            String strB3 = dvhp.a().b(iA);
            if (iA != 0) {
                strB = ejwk.c(strB3) ? "" : strB.replace(strB2, strB3);
            }
            i2++;
            if (ejwk.c(strB)) {
                return "";
            }
        }
        return strB;
    }
}
