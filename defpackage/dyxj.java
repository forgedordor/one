package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyxj {
    public static dyxj d(dxxk dxxkVar, Object obj) {
        if (obj != null) {
            if (!dxxkVar.g(obj)) {
                return new dyxk(3, null);
            }
            String strC = dxxkVar.c(obj);
            if (strC != null && strC.contains("@")) {
                return new dyxk(1, strC);
            }
        }
        return new dyxk(2, null);
    }

    public final dsvb a() {
        int iC = c() - 1;
        if (iC == 0) {
            String strB = b();
            strB.getClass();
            return dswc.a(strB);
        }
        if (iC != 1) {
            return dswc.b();
        }
        evsl evslVar = dswi.a;
        dswe dsweVar = (dswe) dswh.a.createBuilder();
        dsweVar.copyOnWrite();
        dswh dswhVar = (dswh) dsweVar.instance;
        dswhVar.d = 2;
        dswhVar.b = 2 | dswhVar.b;
        return new dsvb(evslVar, (dswh) dsweVar.build());
    }

    public abstract String b();

    public abstract int c();
}
