package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtr extends fcyz implements fdau {
    /* synthetic */ long a;
    final /* synthetic */ gtx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtr(gtx gtxVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = gtxVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((ihs) obj2).a;
        gtr gtrVar = new gtr(this.b, (fcxy) obj3);
        gtrVar.a = j;
        return gtrVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        float fG;
        fctl.b(obj);
        long j = this.a;
        gtx gtxVar = this.b;
        if (gtxVar.e == dwm.a) {
            fG = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            int i = (int) (j >> 32);
            fG = gtxVar.d ? gtxVar.g() - Float.intBitsToFloat(i) : Float.intBitsToFloat(i);
        }
        gtxVar.j(fG - gtxVar.c());
        return fctx.a;
    }
}
