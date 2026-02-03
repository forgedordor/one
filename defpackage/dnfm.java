package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnfm extends fcyz implements fdap {
    final /* synthetic */ dnfr a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfm(dnfr dnfrVar, int i, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = dnfrVar;
        this.b = i;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ecnr ecnrVar = dnfe.a;
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("\n      SELECT `value`, `context`, `time`, `search_term`\n      FROM `usages`\n      WHERE `type` = ?\n      ORDER BY `_ROWID_` DESC LIMIT ?\n      ");
        dnfr dnfrVar = this.a;
        ecnwVar.d(dnfrVar.f);
        ecnwVar.c(Long.valueOf(this.b));
        return new fdpg(new dnfl(dnfrVar, ecnwVar.a(), null, dnfrVar));
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnfm(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
