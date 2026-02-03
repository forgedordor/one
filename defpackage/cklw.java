package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklw {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(cklu ckluVar, ckly cklyVar) {
        for (int i = 0; i < ((cklv) ckluVar.instance).b.size(); i++) {
            ckme ckmeVarA = ckluVar.a(i);
            for (int i2 = 0; i2 < ckmeVarA.d.size(); i2++) {
                ckly cklyVar2 = ((ckmi) ckmeVarA.d.get(i2)).c;
                if (cklyVar2 == null) {
                    cklyVar2 = ckly.a;
                }
                if (cklyVar.equals(cklyVar2)) {
                    if (ckmeVarA.d.size() == 1) {
                        ckluVar.c(i);
                        return;
                    }
                    ckmd ckmdVar = (ckmd) ckmeVarA.toBuilder();
                    ckmdVar.copyOnWrite();
                    ckme ckmeVar = (ckme) ckmdVar.instance;
                    ckmeVar.a();
                    ckmeVar.d.remove(i2);
                    ckluVar.d(i, ckmdVar);
                    return;
                }
            }
        }
    }
}
