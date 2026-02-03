package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxd extends fcyz implements fdat {
    final /* synthetic */ ccxe a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxd(ccxe ccxeVar, MessageId messageId, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ccxeVar;
        this.b = messageId;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bped.a;
        bpdh bpdhVar = new bpdh();
        final MessageId messageId = this.b;
        bpdhVar.b(ccxe.b(messageId));
        bpdhVar.c(this.c);
        return Boolean.valueOf(bpdhVar.a().m(new Function() { // from class: ccxc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bpec bpecVar = (bpec) obj2;
                bpecVar.b(ccxe.b(messageId));
                return bpecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccxd(this.a, this.b, this.c, fcxyVar);
    }
}
