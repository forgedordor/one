package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayh extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ daym c;
    final /* synthetic */ ctcj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayh(daym daymVar, ctcj ctcjVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = daymVar;
        this.d = ctcjVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dayh dayhVar = new dayh(this.c, this.d, (fcxy) obj3);
        dayhVar.a = (dauz) obj;
        dayhVar.b = (chnc) obj2;
        return dayhVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof dauw;
        Object obj3 = this.b;
        if (z || (obj2 instanceof daux)) {
            return null;
        }
        if (!(obj2 instanceof dauy)) {
            throw new fctg();
        }
        final daym daymVar = this.c;
        final efwo efwoVarA = ((dauy) obj2).a.a();
        final ctcj ctcjVar = this.d;
        int iOrdinal = ctcjVar.ordinal();
        if (iOrdinal != 3 && iOrdinal != 4) {
            return null;
        }
        final chnc chncVar = (chnc) obj3;
        return new fdae() { // from class: daxw
            @Override // defpackage.fdae
            public final Object invoke() {
                daym daymVar2 = daymVar;
                auvw.k(daymVar2.k, null, null, new dayj(daymVar2, efwoVarA, ctcjVar, chncVar, null), 3);
                return fctx.a;
            }
        };
    }
}
