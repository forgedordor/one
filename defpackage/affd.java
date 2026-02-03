package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class affd extends dxdt {
    final /* synthetic */ afey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public affd(afey afeyVar, dxdr dxdrVar, dvpy dvpyVar) {
        super(dxdrVar, dvpyVar);
        this.a = afeyVar;
    }

    @Override // defpackage.dxdt
    public final void a(final boolean z) {
        afey afeyVar = this.a;
        final dwje dwjeVar = afeyVar.e;
        final dwpk dwpkVarA = afeyVar.f.a();
        afeyVar.g.h(new egpq(eork.n(new eooy() { // from class: dxds
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dwdt dwdtVar = this.b.a;
                dvxe dvxeVarC = dvxf.c();
                dvxeVarC.b(dvxj.g);
                ((dvxa) dvxeVarC).a = "set read receipt";
                dvxf dvxfVarA = dvxeVarC.a();
                dwos dwosVar = new dwos();
                dwosVar.b(z);
                dwsm dwsmVarA = dwosVar.a();
                ekgb ekgbVarR = ekgb.r(1);
                dwcm dwcmVar = dwdtVar.a;
                UUID uuidRandomUUID = UUID.randomUUID();
                dwje dwjeVar2 = dwjeVar;
                return eooq.f(dwcmVar.b(uuidRandomUUID, new dwgf(dwjeVar2, dwpkVarA, dwsmVarA, ekgbVarR), dwcmVar.d.c(), dwjeVar2, dvxfVarA, true), new ejvr() { // from class: dvpx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((dwot) ((dvrb) obj).a()).a.c();
                    }
                }, eoqg.a);
            }
        }, afeyVar.c)), new egpo(Boolean.valueOf(z)), afeyVar.i);
    }
}
