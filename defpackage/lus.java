package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lus extends fcyz implements fdat {
    int a;
    final /* synthetic */ lvv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lus(lvv lvvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = lvvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lus) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [lvz] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        lvz lvzVar;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.a;
        try {
        } catch (Throwable th) {
            fdjq fdjqVar = fdkq.a;
            fcyh fcyhVarPlus = fdzb.a.j().plus(fdmk.a);
            lur lurVar = new lur(this.b, r1, null);
            this.c = th;
            this.a = 3;
            if (fdin.a(fcyhVarPlus, lurVar, this) != fcylVar) {
                throw th;
            }
        }
        if (r1 == 0) {
            fctl.b(obj);
            final fdos fdosVar = (fdos) this.c;
            lvz lvzVar2 = new lvz() { // from class: lup
                @Override // defpackage.lvz
                public final void a(Object obj2) {
                    fdosVar.b(obj2);
                }
            };
            fdjq fdjqVar2 = fdkq.a;
            fdmi fdmiVarJ = fdzb.a.j();
            luq luqVar = new luq(this.b, lvzVar2, null);
            this.c = lvzVar2;
            this.a = 1;
            lvzVar = lvzVar2;
            if (fdin.a(fdmiVarJ, luqVar, this) != fcylVar) {
            }
            return fcylVar;
        }
        if (r1 != 1) {
            if (r1 != 2) {
                Throwable th2 = (Throwable) this.c;
                fctl.b(obj);
                throw th2;
            }
            lvz lvzVar3 = (lvz) this.c;
            fctl.b(obj);
            r1 = lvzVar3;
            throw new fcta();
        }
        lvz lvzVar4 = (lvz) this.c;
        fctl.b(obj);
        lvzVar = lvzVar4;
        this.c = lvzVar;
        this.a = 2;
        r1 = lvzVar;
        if (fdkj.b(this) == fcylVar) {
            return fcylVar;
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lus lusVar = new lus(this.b, fcxyVar);
        lusVar.c = obj;
        return lusVar;
    }
}
