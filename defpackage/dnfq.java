package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnfq extends fcyz implements fdap {
    final /* synthetic */ String a;
    final /* synthetic */ dnfr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfq(String str, dnfr dnfrVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = str;
        this.b = dnfrVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ecnv ecnvVarA;
        fctl.b(obj);
        String str = this.a;
        if (((str == null || fdgn.H(str)) ? null : str) == null) {
            ecnr ecnrVar = dnfe.a;
            dnfr dnfrVar = this.b;
            ecnw ecnwVar = new ecnw();
            ecnwVar.b("\n      SELECT `context`, `time`, `search_term`\n      FROM `usages`\n      WHERE `search_term` IS NOT NULL\n      AND `type` = ?\n      ORDER BY `_ROWID_` DESC LIMIT ?\n      ");
            ecnwVar.d(dnfrVar.f);
            ecnwVar.c(100L);
            ecnvVarA = ecnwVar.a();
        } else {
            ecnr ecnrVar2 = dnfe.a;
            dnfr dnfrVar2 = this.b;
            str.getClass();
            ecnw ecnwVar2 = new ecnw();
            ecnwVar2.b("\n      SELECT `context`, `time`, `search_term`\n      FROM `usages`\n      WHERE `type` = ?\n      AND `search_term` LIKE ?\n      ORDER BY `_ROWID_` DESC LIMIT ?\n      ");
            ecnwVar2.d(dnfrVar2.f);
            ecnwVar2.d(dnfe.a(str).concat("%"));
            ecnwVar2.c(100L);
            ecnvVarA = ecnwVar2.a();
        }
        dnfr dnfrVar3 = this.b;
        return new fdpg(new dnfp(dnfrVar3, ecnvVarA, null, dnfrVar3));
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnfq(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
