package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkj implements fdpm {
    final /* synthetic */ ddp a;
    final /* synthetic */ fdjx b;

    public fkj(ddp ddpVar, fdjx fdjxVar) {
        this.a = ddpVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.fdpm
    public final /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        long j = ((ihs) obj).a;
        ddp ddpVar = this.a;
        if ((((ihs) ddpVar.d()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((ihs) ddpVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (4294967295L & j))) {
            Object objE = ddpVar.e(new ihs(j), fcxyVar);
            return objE == fcyl.a ? objE : fctx.a;
        }
        fdil.d(this.b, null, null, new fki(ddpVar, j, null), 3);
        return fctx.a;
    }
}
