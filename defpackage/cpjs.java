package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpjs extends fcyz implements fdat {
    final /* synthetic */ cpjt a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpjs(cpjt cpjtVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cpjtVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpjs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String strT;
        fctl.b(obj);
        cpjt cpjtVar = this.a;
        ParticipantsTable.BindData bindDataB = ((bbca) cpjtVar.b.b()).b(this.b);
        if (bindDataB != null && (strT = bindDataB.T()) != null && strT.length() != 0) {
            fcsu fcsuVar = cpjtVar.a;
            if (((cpjp) fcsuVar.b()).f(strT)) {
                ((cpjp) fcsuVar.b()).b(cpim.a(true, strT, false, true, null, 3, 8, 0, 300));
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cpjs(this.a, this.b, fcxyVar);
    }
}
