package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbcu {
    /* JADX WARN: Type inference failed for: r6v3, types: [evuh, java.lang.Object] */
    public static cbcu e(cayp caypVar, cbaz cbazVar) {
        cazg cazgVarC = cbazVar.c(caypVar.c);
        String str = caypVar.c;
        ?? F = cazgVarC.d().f(caypVar.d);
        cayr cayrVar = caypVar.e;
        if (cayrVar == null) {
            cayrVar = cayr.a;
        }
        caxr caxrVar = new caxr();
        if (!cboe.a(cayrVar.c)) {
            caxrVar.a = cayrVar.c;
        }
        if (!cboe.a(cayrVar.d)) {
            caxrVar.b = cayrVar.d;
        }
        if ((cayrVar.b & 1) != 0) {
            evrj evrjVar = cayrVar.e;
            if (evrjVar == null) {
                evrjVar = evrj.a;
            }
            evrj evrjVar2 = cayrVar.e;
            if (evrjVar2 == null) {
                evrjVar2 = evrj.a;
            }
            if (!evrjVar.equals(evrjVar2.getDefaultInstanceForType())) {
                evrj evrjVar3 = cayrVar.e;
                if (evrjVar3 == null) {
                    evrjVar3 = evrj.a;
                }
                caxrVar.c = evwz.c(evrjVar3);
            }
        }
        if (!cboe.a(cayrVar.f)) {
            caxrVar.d = cayrVar.f;
        }
        return new caxo(str, F, caxrVar.a(), new cohf("Deserialized WorkQueueRequest"));
    }

    public static cbcu f(String str, evuh evuhVar) {
        return g(str, evuhVar, new caxr().a());
    }

    public static cbcu g(String str, evuh evuhVar, cbog cbogVar) {
        return new caxo(str, evuhVar, cbogVar, new cohf(str));
    }

    public abstract cbog a();

    public abstract cohg b();

    public abstract evuh c();

    public abstract String d();
}
