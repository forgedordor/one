package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjck extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjgl cjglVar = (cjgl) obj;
        aubv aubvVar = (aubv) aubx.a.createBuilder();
        if ((cjglVar.b & 1) != 0) {
            String str = cjglVar.c;
            aubvVar.copyOnWrite();
            aubx aubxVar = (aubx) aubvVar.instance;
            str.getClass();
            aubxVar.b |= 1;
            aubxVar.c = str;
        }
        if ((cjglVar.b & 2) != 0) {
            String str2 = cjglVar.d;
            aubvVar.copyOnWrite();
            aubx aubxVar2 = (aubx) aubvVar.instance;
            str2.getClass();
            aubxVar2.b |= 2;
            aubxVar2.d = str2;
        }
        c(cjglVar, aubvVar);
        return (aubx) aubvVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aubx aubxVar = (aubx) obj;
        cjgk cjgkVar = (cjgk) cjgl.a.createBuilder();
        if ((aubxVar.b & 1) != 0) {
            String str = aubxVar.c;
            cjgkVar.copyOnWrite();
            cjgl cjglVar = (cjgl) cjgkVar.instance;
            str.getClass();
            cjglVar.b |= 1;
            cjglVar.c = str;
        }
        if ((aubxVar.b & 2) != 0) {
            String str2 = aubxVar.d;
            cjgkVar.copyOnWrite();
            cjgl cjglVar2 = (cjgl) cjgkVar.instance;
            str2.getClass();
            cjglVar2.b |= 2;
            cjglVar2.d = str2;
        }
        d(aubxVar, cjgkVar);
        return (cjgl) cjgkVar.build();
    }

    public abstract void c(cjgl cjglVar, aubv aubvVar);

    public abstract void d(aubx aubxVar, cjgk cjgkVar);
}
