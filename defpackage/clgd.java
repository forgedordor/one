package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clgd extends fcyz implements fdat {
    final /* synthetic */ MessageCoreData a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clgd(fcxy fcxyVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.a = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clgd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        basd basdVar;
        fctl.b(obj);
        MessageCoreData messageCoreData = this.a;
        clfy clfyVarW = messageCoreData.W();
        if (clfyVarW == null) {
            return messageCoreData;
        }
        clfy clfyVarW2 = messageCoreData.W();
        if (clfyVarW2 == null || !clfyVarW2.c.k()) {
            basdVar = (basd) MessagesTable.i(clfyVarW.b, new Function() { // from class: clgc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return ((MessagesTable.BindData) obj2).I();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            clfy clfyVarW3 = messageCoreData.W();
            basdVar = clfyVarW3 != null ? clfyVarW3.c : null;
        }
        if (basdVar == null || fdbq.f(basdVar, basd.a)) {
            throw new IllegalStateException("Can't send a reply to a message without RCS id.");
        }
        civc civcVarB = messageCoreData.ac() != null ? civc.b(messageCoreData.ac()) : civc.a();
        String str = basdVar.b;
        if (str == null) {
            throw new IllegalArgumentException("addGsmaReplyHeaders with empty rcsMessageId");
        }
        civa civaVar = civa.GSMA_RCS_NAMESPACE;
        civcVarB.e(civaVar, "Reference-ID", str);
        civcVarB.e(civaVar, "Reference-Type", "Reply");
        civcVarB.e(civa.REPLIES_NAMESPACE, "In-Reply-To-Message-Id", str);
        messageCoreData.bs(civcVarB.c());
        return messageCoreData;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clgd clgdVar = new clgd(fcxyVar, this.a);
        clgdVar.b = obj;
        return clgdVar;
    }
}
