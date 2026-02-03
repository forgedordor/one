package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yex extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ lvb b;
    final /* synthetic */ yis c;
    final /* synthetic */ yen d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yex(boolean z, lvb lvbVar, yis yisVar, yen yenVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = lvbVar;
        this.c = yisVar;
        this.d = yenVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yex) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a && this.b.a(lvb.e)) {
            this.d.n.invoke(this.c);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yex(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
