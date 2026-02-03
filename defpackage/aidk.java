package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aidk extends fcyz implements fdat {
    final /* synthetic */ aidl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidk(aidl aidlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aidlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aidk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        aidl aidlVar = this.a;
        if (aidlVar.d()) {
            fcsu fcsuVar = aidlVar.e;
            if (((crny) fcsuVar.b()).a() <= 0) {
                ((ekrd) aidl.a.h().h("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl$addFakeSimIfNeeded$1", "invokeSuspend", 100, "RetailModeEntryPointImpl.kt")).q("Adding fake SIM for Retail Demo mode");
                ((crny) fcsuVar.b()).t(2, "123456789123456789", 2, "Demo SIM", "Demo Carrier", ((alrj) aidlVar.f.b()).c("555-35-35", new ejxr() { // from class: aidj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return Optional.of("US");
                    }
                }), 132, aidl.b);
                ((bxjn) aidlVar.g.b()).c();
                return fctx.a;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aidk(this.a, fcxyVar);
    }
}
