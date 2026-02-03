package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxrx extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxsg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxrx(bxsg bxsgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bxsgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxrx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                ListenableFuture listenableFutureA = drgi.a(((esab) this.b.b.b()).b());
                this.a = 1;
                obj = fdxs.c(listenableFutureA, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            ekrw ekrwVarH = bxsg.a.h();
            ekrwVarH.X(eksq.a, "BugleSearch");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/search/appsearch/LegacyIcingIndexerImpl$removeAll$1", "invokeSuspend", 143, "LegacyIcingIndexerImpl.kt")).q("Removed all icing index successfully.");
            return true;
        } catch (Exception e) {
            ekrw ekrwVarI = bxsg.a.i();
            ekrwVarI.X(eksq.a, "BugleSearch");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/datamodel/search/appsearch/LegacyIcingIndexerImpl$removeAll$1", "invokeSuspend", 146, "LegacyIcingIndexerImpl.kt")).q("Failed to remove all icing index.");
            return false;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxrx(this.b, fcxyVar);
    }
}
