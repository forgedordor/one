package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqes extends ejvj {
    private final ejvj a;

    public eqes(ejvj ejvjVar) {
        this.a = ejvjVar;
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eqdz eqdzVar;
        ezrs ezrsVar = (ezrs) obj;
        eqdg eqdgVar = new eqdg();
        eqdgVar.a(eqdz.b);
        if ((ezrsVar.b & 1) != 0) {
            ezol ezolVar = ezrsVar.c;
            if (ezolVar == null) {
                ezolVar = ezol.a;
            }
            if (ezolVar == null) {
                throw new NullPointerException("Null id");
            }
            eqdgVar.a = ezolVar;
        }
        ejvj ejvjVarFH = this.a.fH();
        int i = ezrsVar.d;
        fell fellVar = i != 0 ? i != 1 ? i != 2 ? null : fell.REGULAR : fell.ADMIN : fell.DEFAULT_ROLE;
        if (fellVar == null) {
            fellVar = fell.UNRECOGNIZED;
        }
        eqdgVar.a((eqdz) ejvjVarFH.fM(fellVar));
        ezol ezolVar2 = eqdgVar.a;
        if (ezolVar2 != null && (eqdzVar = eqdgVar.b) != null) {
            return new eqdh(ezolVar2, eqdzVar);
        }
        StringBuilder sb = new StringBuilder();
        if (eqdgVar.a == null) {
            sb.append(" id");
        }
        if (eqdgVar.b == null) {
            sb.append(" role");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eqea eqeaVar = (eqea) obj;
        ezrr ezrrVar = (ezrr) ezrs.a.createBuilder();
        ezol ezolVarB = eqeaVar.b();
        ezrrVar.copyOnWrite();
        ezrs ezrsVar = (ezrs) ezrrVar.instance;
        ezrsVar.c = ezolVarB;
        ezrsVar.b |= 1;
        fell fellVar = (fell) this.a.fM(eqeaVar.a());
        ezrrVar.copyOnWrite();
        ((ezrs) ezrrVar.instance).d = fellVar.a();
        return (ezrs) ezrrVar.build();
    }
}
