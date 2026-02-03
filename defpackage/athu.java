package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class athu extends fcyz implements fdat {
    final /* synthetic */ athv a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ String c;
    final /* synthetic */ fdch d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public athu(athv athvVar, MessageCoreData messageCoreData, String str, fdch fdchVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = athvVar;
        this.b = messageCoreData;
        this.c = str;
        this.d = fdchVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((athu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c.a(this.b.F(), this.c, this.d.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new athu(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
