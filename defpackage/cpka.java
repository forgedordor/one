package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpka extends fcyz implements fdat {
    int a;
    final /* synthetic */ cpkr b;
    final /* synthetic */ cpke c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpka(cpkr cpkrVar, cpke cpkeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cpkrVar;
        this.c = cpkeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpka) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cpkr cpkrVar = this.b;
        if ((cpkrVar.b & 4) != 0) {
            String str = cpkrVar.e;
            str.getClass();
            if (str.length() != 0) {
                cpke cpkeVar = this.c;
                ParticipantsTable.BindData bindDataB = ((bbca) cpkeVar.a.b()).b(cpkrVar.e);
                if (bindDataB == null) {
                    return null;
                }
                eiju eijuVarP = ((anty) cpkeVar.g.b()).p(((alrj) cpkeVar.f.b()).q(bindDataB));
                this.a = 1;
                Object objC = fdxs.c(eijuVarP, this);
                return objC == fcylVar ? fcylVar : objC;
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cpka(this.b, this.c, fcxyVar);
    }
}
