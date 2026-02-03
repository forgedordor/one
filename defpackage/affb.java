package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class affb implements ehaw {
    final /* synthetic */ dwje a;
    final /* synthetic */ dwpx b;
    final /* synthetic */ afey c;

    public affb(afey afeyVar, dwje dwjeVar, dwpx dwpxVar) {
        this.a = dwjeVar;
        this.b = dwpxVar;
        this.c = afeyVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return new egyb("INITIALIZE_READ_RECEIPT_SETTING_VALUE_KEY");
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        final dwje dwjeVar = this.a;
        final dwpx dwpxVar = this.b;
        return eijx.h(new eooy() { // from class: affa
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dwpx dwpxVar2 = dwpxVar;
                dvpy dvpyVar = this.a.c.l;
                dwpk dwpkVarA = dwpxVar2.a();
                dvxe dvxeVarC = dvxf.c();
                dvxeVarC.b(dvxj.g);
                ((dvxa) dvxeVarC).a = "get user properties";
                dvxf dvxfVarA = dvxeVarC.a();
                dwcm dwcmVar = dvpyVar.a.a;
                UUID uuidRandomUUID = UUID.randomUUID();
                dwje dwjeVar2 = dwjeVar;
                return eooq.f(dwcmVar.b(uuidRandomUUID, new dwfl(dwjeVar2, dwpkVarA), dwcmVar.d.c(), dwjeVar2, dvxfVarA, true), new ejvr() { // from class: dvpw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((dwot) ((dvqq) obj).a()).a.c();
                    }
                }, eoqg.a);
            }
        }, this.c.c);
    }
}
