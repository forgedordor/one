package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csyb extends fcyz implements fdat {
    final /* synthetic */ aqcf a;
    final /* synthetic */ fcsu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csyb(aqcf aqcfVar, fcsu fcsuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aqcfVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csyb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a.a()) {
            csya csyaVar = (csya) this.b.b();
            if (csyaVar.f.c()) {
                auvw.k(csyaVar.c, null, null, new csxz(csyaVar, null), 3);
            } else {
                ekrw ekrwVarH = csya.a.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/video/MissedVideoCallObserver", "register", 40, "MissedVideoCallObserver.kt")).q("No CALL_LOG permission, not registering observer");
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csyb(this.a, this.b, fcxyVar);
    }
}
