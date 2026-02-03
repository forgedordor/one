package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amyh extends fcyz implements fdat {
    final /* synthetic */ MessageId a;
    final /* synthetic */ amyi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyh(MessageId messageId, amyi amyiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = messageId;
        this.b = amyiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((amyh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        MessageId messageId = this.a;
        amyi amyiVar = this.b;
        if (!fdbq.f(messageId, amyiVar.c)) {
            return null;
        }
        amyiVar.e.c(new Supplier() { // from class: amyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RichCardFileTransferProgressSupplier:Notify");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amyh(this.a, this.b, fcxyVar);
    }
}
