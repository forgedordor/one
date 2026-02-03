package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caem extends cayv {
    public static final cqce a = cqce.g("BugleCms", "CmsOptOutWorkHandler");
    static final ejvr b = new cafw();
    public final aukz c;
    public final cogw d;
    public final ains e;
    private final cafd f;
    private final aurx g;

    public caem(cafd cafdVar, aurx aurxVar, aukz aukzVar, cogw cogwVar, ains ainsVar) {
        this.f = cafdVar;
        this.g = aurxVar;
        this.c = aukzVar;
        this.d = cogwVar;
        this.e = ainsVar;
    }

    public static String k(caei caeiVar) {
        if (cpyl.a() || ((Boolean) ((cczi) cpyl.Y.get()).e()).booleanValue()) {
            caee caeeVarB = caee.b(caeiVar.h);
            if (caeeVarB == null) {
                caeeVarB = caee.UNSPECIFIED_FLOW;
            }
            if (caeeVarB == caee.BNR_OPT_OUT) {
                return "Backup and Restore";
            }
        }
        if (!cpyl.a()) {
            return "Multi Device";
        }
        caee caeeVarB2 = caee.b(caeiVar.h);
        if (caeeVarB2 == null) {
            caeeVarB2 = caee.UNSPECIFIED_FLOW;
        }
        return caeeVarB2 == caee.BNR_AND_MD_OPT_OUT ? "Backup and Restore with Multi Device" : "Multi Device";
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.b(caze.WAKELOCK);
        caxzVarL.f(pza.a);
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsOptOutWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caei.b.getParserForType();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    @Override // defpackage.cayv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ defpackage.eiju j(defpackage.cayy r11, defpackage.evuh r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caem.j(cayy, evuh):eiju");
    }

    public final void l(caei caeiVar) {
        if (!cpyl.a() && !((Boolean) ((cczi) cpyl.Y.get()).e()).booleanValue()) {
            this.g.ad(auml.DISABLE_FAILED);
            return;
        }
        caee caeeVarB = caee.b(caeiVar.h);
        if (caeeVarB == null) {
            caeeVarB = caee.UNSPECIFIED_FLOW;
        }
        int iOrdinal = caeeVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                this.g.Q(auml.DISABLE_FAILED);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return;
                }
                aurx aurxVar = this.g;
                auml aumlVar = auml.DISABLE_FAILED;
                aurxVar.Q(aumlVar);
                aurxVar.ad(aumlVar);
                return;
            }
        }
        this.g.ad(auml.DISABLE_FAILED);
    }

    public final void m(caei caeiVar, int i) {
        if ((caeiVar.c & 16) != 0) {
            aukz aukzVar = this.c;
            ejvr ejvrVar = b;
            caeg caegVarB = caeg.b(caeiVar.e);
            if (caegVarB == null) {
                caegVarB = caeg.UNSPECIFIED_STEP;
            }
            Object objApply = ejvrVar.apply(caegVarB);
            evvp evvpVar = caeiVar.i;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            aukzVar.v((emdn) objApply, evvpVar, evxc.c(this.d.f().toEpochMilli()), i);
        }
    }
}
