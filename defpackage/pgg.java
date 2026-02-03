package defpackage;

import android.database.SQLException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgg extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ pgn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgg(pgn pgnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = pgnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pgg) c((pft) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        pft pftVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
            if (i == 0) {
                fctl.b(obj);
                pftVar = (pft) this.b;
                this.b = pftVar;
                this.a = 1;
                obj = pftVar.c();
                if (obj != fcylVar) {
                }
                return fcylVar;
            }
            if (i != 1) {
                fctl.b(obj);
                return (Set) obj;
            }
            pftVar = (pft) this.b;
            fctl.b(obj);
            if (((Boolean) obj).booleanValue()) {
                return fcvq.a;
            }
            pfs pfsVar = pfs.b;
            pgf pgfVar = new pgf(this.c, null);
            this.b = null;
            this.a = 2;
            obj = pftVar.b(pfsVar, pgfVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            return (Set) obj;
        } catch (SQLException unused) {
            return fcvq.a;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        pgg pggVar = new pgg(this.c, fcxyVar);
        pggVar.b = obj;
        return pggVar;
    }
}
