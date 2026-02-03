package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egli implements dxxk {
    private final ejwi a;

    public egli(ejwi ejwiVar) {
        this.a = ejwiVar;
    }

    public static final String i(egbe egbeVar) {
        return String.valueOf(((efwq) egbeVar.a()).a);
    }

    @Override // defpackage.dxxk
    public final /* synthetic */ dxxo a(Object obj) {
        egbe egbeVar = (egbe) obj;
        if (!g(egbeVar)) {
            return null;
        }
        egbs egbsVarB = egbeVar.b();
        evsl evslVarCheckIsLite = evsn.checkIsLite(egfn.a);
        egbsVarB.d(evslVarCheckIsLite);
        Object objL = egbsVarB.r.l(evslVarCheckIsLite.d);
        egfg egfgVar = (egfg) (objL == null ? evslVarCheckIsLite.b : evslVarCheckIsLite.c(objL));
        boolean z = egfgVar.c;
        int iA = egff.a(egfgVar.e);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        int i2 = i != 0 ? i != 1 ? 3 : 2 : 1;
        dxxl dxxlVar = new dxxl();
        dxxlVar.a(false);
        dxxlVar.c = 1;
        dxxlVar.a(z);
        dxxlVar.c = i2;
        if (dxxlVar.b == 1) {
            return new dxxm(dxxlVar.a, i2);
        }
        StringBuilder sb = new StringBuilder();
        if (dxxlVar.b == 0) {
            sb.append(" isG1User");
        }
        if (dxxlVar.c == 0) {
            sb.append(" isUnicornUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dxxk
    public final /* bridge */ /* synthetic */ String b(Object obj) {
        return i((egbe) obj);
    }

    @Override // defpackage.dxxk
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return ((egbe) obj).b().g;
    }

    @Override // defpackage.dxxk
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return ((egbe) obj).b().h;
    }

    @Override // defpackage.dxxk
    public final /* bridge */ /* synthetic */ String e(Object obj) {
        return ((egbe) obj).b().d;
    }

    @Override // defpackage.dxxk
    public final /* bridge */ /* synthetic */ String f(Object obj) {
        egbe egbeVar = (egbe) obj;
        if ((egbeVar.b().b & 4) != 0) {
            return egbeVar.b().e;
        }
        return null;
    }

    @Override // defpackage.dxxk
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean g(egbe egbeVar) {
        return ((String) ((ejwt) this.a).a).equals(egbeVar.b().k);
    }
}
