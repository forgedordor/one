package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zcy extends fcyz implements fdat {
    final /* synthetic */ zdm a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ amuy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcy(zdm zdmVar, MessageId messageId, amuy amuyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = zdmVar;
        this.b = messageId;
        this.c = amuyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zcy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.k.a(this.b, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zcy(this.a, this.b, this.c, fcxyVar);
    }
}
