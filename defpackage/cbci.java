package defpackage;

import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbci implements cbcz {
    public final cbdd a;
    public final fcsu b;
    public final cbbl c;
    private final fdjx d;

    public cbci(cbdd cbddVar, fcsu fcsuVar, cbbl cbblVar, fdjx fdjxVar) {
        cbddVar.getClass();
        fcsuVar.getClass();
        cbblVar.getClass();
        fdjxVar.getClass();
        this.a = cbddVar;
        this.b = fcsuVar;
        this.c = cbblVar;
        this.d = fdjxVar;
    }

    @Override // defpackage.cbcz
    public final eiju a(cbdg cbdgVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cbcg(cbdgVar, this, null));
    }

    @Override // defpackage.cbcz
    public final eiju b(cbdg cbdgVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cbch(cbdgVar, this, null));
    }

    @Override // defpackage.cbcz
    public final Optional c(cbdg cbdgVar) {
        String strR = cbdgVar.r();
        strR.getClass();
        int iOrdinal = this.c.b(strR).ordinal();
        if (iOrdinal == 0) {
            return Optional.empty();
        }
        if (iOrdinal == 1) {
            return ((cbhl) this.b.b()).c(cbdgVar);
        }
        throw new fctg();
    }

    @Override // defpackage.cbcz
    public final boolean d(String str, cbcy cbcyVar, UUID uuid) {
        cbbk cbbkVarA = this.c.a((String) fdgn.S(str, new String[]{"-"}, 0, 6).get(0));
        if (cbbkVarA == null || cbbkVarA.ordinal() != 1) {
            return this.a.d(str, cbcyVar, uuid);
        }
        return true;
    }
}
