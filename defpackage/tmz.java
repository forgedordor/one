package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tmz extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ epms e;
    final /* synthetic */ tna f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmz(epms epmsVar, tna tnaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = epmsVar;
        this.f = tnaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tmz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [feav] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [feav] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        feav feavVar;
        epms epmsVar;
        ?? r0;
        fcyl fcylVar = fcyl.a;
        int i = this.d;
        try {
            if (i == 0) {
                fctl.b(obj);
                epms epmsVar2 = this.e;
                if (epmr.a(epmsVar2.b) != epmr.CANCEL_REQUEST) {
                    ekrw ekrwVarJ = tna.a.j();
                    ekrwVarJ.X(eksq.a, "BugleAlphaverse");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CancelPairingDelegate$handleDeviceOnboardingPayload$1", "invokeSuspend", 49, "CancelPairingDelegate.kt")).t("DeviceOnboardingMessage payload is not cancel request, skip handling. Payload case: %s", epmr.a(epmsVar2.b));
                    return Optional.empty();
                }
                feav feavVar2 = cecs.a;
                tna tnaVar = this.f;
                feav feavVar3 = cecs.a;
                this.a = feavVar3;
                this.b = tnaVar;
                this.c = epmsVar2;
                this.d = 1;
                if (feavVar3.b(this) != fcylVar) {
                    obj2 = tnaVar;
                    epmsVar = epmsVar2;
                    feavVar = feavVar3;
                }
                return fcylVar;
            }
            if (i != 1) {
                r0 = this.a;
                try {
                    fctl.b(obj);
                    r0 = r0;
                    Optional optionalOf = Optional.of(obj);
                    r0.d();
                    return optionalOf;
                } catch (Throwable th) {
                    th = th;
                    r0.d();
                    throw th;
                }
            }
            ?? r1 = this.c;
            obj2 = this.b;
            ?? r3 = this.a;
            fctl.b(obj);
            epmsVar = r1;
            feavVar = r3;
            epna epnaVar = epmsVar.b == 15 ? (epna) epmsVar.c : epna.a;
            epnaVar.getClass();
            this.a = feavVar;
            this.b = null;
            this.c = null;
            this.d = 2;
            obj = ((tna) obj2).b(epnaVar, this);
            if (obj != fcylVar) {
                r0 = feavVar;
                Optional optionalOf2 = Optional.of(obj);
                r0.d();
                return optionalOf2;
            }
            return fcylVar;
        } catch (Throwable th2) {
            th = th2;
            r0 = feavVar;
            r0.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tmz(this.e, this.f, fcxyVar);
    }
}
