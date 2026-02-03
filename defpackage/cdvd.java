package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdvd extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdve b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdvd(fcxy fcxyVar, cdve cdveVar) {
        super(2, fcxyVar);
        this.b = cdveVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdvd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dtma dtmaVar;
        fcyl fcylVar = fcyl.a;
        boolean z = true;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                if (!crbf.e()) {
                    ((ekrd) this.b.b.g().h("com/google/android/apps/messaging/shared/mdd/geller/EmotifyControllerImpl$special$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 48, "EmotifyControllerImpl.kt")).q("Photomoji is not enabled");
                    return false;
                }
                dtpz dtpzVarF = dtqa.f();
                dtpzVarF.b("genai-models-group");
                ListenableFuture listenableFutureE = ((dtsl) this.b.a.b()).e(dtpzVarF.a());
                listenableFutureE.getClass();
                this.a = 1;
                obj = fdxs.c(listenableFutureE, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            dtmaVar = (dtma) obj;
        } catch (Exception e) {
            ((ekrd) ((ekrd) this.b.b.i()).g(e).h("com/google/android/apps/messaging/shared/mdd/geller/EmotifyControllerImpl$special$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 65, "EmotifyControllerImpl.kt")).q("Failed to get Photomoji FileGroup");
        }
        if (dtmaVar != null && (dtmaVar.b & 1) != 0) {
            return Boolean.valueOf(z);
        }
        ((ekrd) this.b.b.g().h("com/google/android/apps/messaging/shared/mdd/geller/EmotifyControllerImpl$special$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 61, "EmotifyControllerImpl.kt")).q("Photomoji file group is not available");
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdvd cdvdVar = new cdvd(fcxyVar, this.b);
        cdvdVar.c = obj;
        return cdvdVar;
    }
}
