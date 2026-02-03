package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzdp extends fcyz implements fdat {
    final /* synthetic */ bzds a;
    final /* synthetic */ List b;
    final /* synthetic */ bzbz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzdp(bzds bzdsVar, List list, bzbz bzbzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bzdsVar;
        this.b = list;
        this.c = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzdp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final bzds bzdsVar = this.a;
        dzub dzubVarD = bzdsVar.e.d();
        dzubVarD.getClass();
        dzua dzuaVar = dzua.SUCCESS;
        try {
            try {
                dqsn dqsnVar = bzdsVar.d;
                final List list = this.b;
                final bzbz bzbzVar = this.c;
                dqsnVar.d("CmsMessageBackupDelegate#onInsertionBatchCompleted", new Runnable() { // from class: bzdo
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzdsVar.g(bzds.h(list), bzbzVar);
                    }
                });
                bzds bzdsVar2 = this.a;
                bzdsVar2.e.f(dzubVarD, new dzfh("OnInsertionBatchCompleted"), null, dzuaVar);
                return fctx.a;
            } catch (Exception e) {
                dzua dzuaVar2 = dzua.ERROR;
                throw e;
            }
        } catch (Throwable th) {
            bzds bzdsVar3 = this.a;
            bzdsVar3.e.f(dzubVarD, new dzfh("OnInsertionBatchCompleted"), null, dzuaVar);
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzdp(this.a, this.b, this.c, fcxyVar);
    }
}
