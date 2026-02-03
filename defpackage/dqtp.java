package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqtp {
    final String a;
    final ekgb b;
    final dqwl c;
    private final String d;
    private final int e;

    public dqtp(String str, String str2, ekgb ekgbVar, dqwl dqwlVar, int i) {
        this.a = str;
        this.d = str2;
        this.b = ekgbVar;
        this.c = dqwlVar;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a() {
        dqsy dqsyVarE = dqru.e(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT ");
        sb.append(ejwk.b(dqru.j(this.e)));
        sb.append(" INTO ");
        String str = this.a;
        sb.append(str);
        sb.append(" (");
        ekgb ekgbVar = this.b;
        int i = ((ekoe) ekgbVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(dqru.o((String) ekgbVar.get(i2)));
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(") ");
        dqwl dqwlVar = this.c;
        sb.append(dqwlVar.H(new dqxp(dqwlVar.m, dqwlVar.e, true, null), true, null));
        String string = sb.toString();
        eieu eieuVarK = eiiy.k("Insert#insert update");
        try {
            int iB = dqsyVarE.b(dqsyVarE.h().compileStatement(string), new dqsb(str, "-insert"));
            eieuVarK.close();
            return iB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
