package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajtp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajtq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajtp(ajtq ajtqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajtqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajtp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ajtq ajtqVar = this.b;
            this.a = 1;
            obj = ajtqVar.d(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ajtq ajtqVar2 = this.b;
        ekrw ekrwVarE = ajtq.a.e();
        ekrwVarE.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(ajtq.b, fcva.aF((List) obj, null, null, null, null, 63));
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationLocalIdentitiesSupplier", "logFilteredSelfIdentities", 73, "BugleConversationLocalIdentitiesSupplier.kt")).t("Filtered self identities for the sim picker, conversation %s.", ajtqVar2.c.a);
        return obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajtp(this.b, fcxyVar);
    }
}
