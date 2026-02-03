package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqd extends fcyz implements fdat {
    final /* synthetic */ brdp a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjqd(fcxy fcxyVar, brdp brdpVar) {
        super(2, fcxyVar);
        this.a = brdpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjqd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brap brapVar = (brap) this.a.q(MessagesTable.c.o);
        try {
            ekgb ekgbVarA = brapVar.A();
            brapVar.close();
            return ekgbVarA;
        } catch (Throwable th) {
            try {
                brapVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cjqd cjqdVar = new cjqd(fcxyVar, this.a);
        cjqdVar.b = obj;
        return cjqdVar;
    }
}
