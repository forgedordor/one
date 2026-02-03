package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class odm {
    public final odh a;
    public final int b;
    public final mbt c;
    public boolean d;

    public odm(mau mauVar, odh odhVar) {
        this.a = odhVar;
        this.c = mauVar.l;
        this.b = oeu.b(mauVar.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static String k(mau mauVar, List list) {
        String str = mauVar.o;
        mee.f(str);
        boolean zL = mbw.l(str);
        ekhv ekhvVar = new ekhv();
        ekhvVar.c(str);
        if (zL) {
            ekhvVar.c("video/hevc");
            ekhvVar.c("video/avc");
        }
        ekhvVar.j(list);
        ekgb ekgbVarG = ekhvVar.g().g();
        for (int i = 0; i < ekgbVarG.size(); i++) {
            String str2 = (String) ekgbVarG.get(i);
            if (list.contains(str2)) {
                if (zL) {
                    mag magVar = mauVar.E;
                    if (mag.i(magVar)) {
                        if (!ocf.g(str2, magVar).isEmpty()) {
                            return str2;
                        }
                    }
                }
                if (!ocf.f(str2).isEmpty()) {
                    return str2;
                }
            }
        }
        return null;
    }

    public abstract void d();

    protected boolean g() {
        return false;
    }

    protected abstract mau p();

    protected abstract mix q();

    public abstract ocx r(obt obtVar, mau mauVar, int i);

    protected abstract void s();

    protected abstract boolean t();
}
