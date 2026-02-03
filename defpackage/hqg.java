package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqg {
    public static final void a(hqi hqiVar) {
        fduf fdufVar;
        hwo hwoVar;
        hwo hwoVar2;
        do {
            fdufVar = hqq.a;
            hwoVar = (hwo) fdufVar.c();
            hvp hvpVarC = hwoVar.d;
            hwn hwnVar = (hwn) hvpVarC.get(hqiVar);
            if (hwnVar == null) {
                hwoVar2 = hwoVar;
            } else {
                hwg hwgVar = hvpVarC.b;
                hwg hwgVarJ = hwgVar.j(hqiVar != null ? hqiVar.hashCode() : 0, hqiVar, 0);
                if (hwgVar != hwgVarJ) {
                    hvpVarC = hwgVarJ == null ? hvp.a : new hvp(hwgVarJ, hvpVarC.b() - 1);
                }
                if (hwnVar.c()) {
                    Object obj = hwnVar.a;
                    Object obj2 = hvpVarC.get(obj);
                    obj2.getClass();
                    hvpVarC = hvpVarC.c(obj, ((hwn) obj2).a(hwnVar.b));
                }
                if (hwnVar.b()) {
                    Object obj3 = hwnVar.b;
                    Object obj4 = hvpVarC.get(obj3);
                    obj4.getClass();
                    hvpVarC = hvpVarC.c(obj3, new hwn(hwnVar.a, ((hwn) obj4).b));
                }
                hwoVar2 = new hwo(!hwnVar.c() ? hwnVar.b : hwoVar.b, !hwnVar.b() ? hwnVar.a : hwoVar.c, hvpVarC);
            }
            if (hwoVar == hwoVar2) {
                return;
            }
        } while (!fdufVar.g(hwoVar, hwoVar2));
    }
}
