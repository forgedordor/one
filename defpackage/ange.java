package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ange extends fcyz implements fdat {
    int a;
    final /* synthetic */ angf b;
    final /* synthetic */ MessageId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ange(angf angfVar, MessageId messageId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = angfVar;
        this.c = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ange) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ekgb ekgbVarA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        angf angfVar = this.b;
        final MessageId messageId = this.c;
        this.a = 1;
        String[] strArr = bqfo.a;
        bqfj bqfjVar = new bqfj(bqfo.a);
        bqfjVar.A("+loadEditHistory");
        bqfjVar.g(new Function() { // from class: angc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bqfn bqfnVar = (bqfn) obj2;
                MessageId messageId2 = messageId;
                if (!(messageId2 instanceof amgc)) {
                    throw new IllegalStateException("Unsupported message id type.");
                }
                MessageIdType messageIdTypeC = ((amgc) messageId2).c();
                messageIdTypeC.getClass();
                bqfnVar.ap(new dqpj("message_edits.latest_message_id", 1, Long.valueOf(bary.a(messageIdTypeC))));
                return bqfnVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqfjVar.e(new Function() { // from class: angd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return new bqev[]{((bqeu) obj2).e};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqeu bqeuVar = bqfo.c;
        bqfjVar.d(new bqfg(bqeuVar.d));
        bqfjVar.H(dqts.i(amgb.c(null, null, null, null, 15).b(), MessagesTable.c.a, bqeuVar.a).g());
        ekgb<bqec> ekgbVarZ = bqfjVar.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList();
        for (bqec bqecVar : ekgbVarZ) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) bqecVar.ax("messages", MessagesTable.BindData.class);
            if (bindData == null) {
                ekgbVarA = null;
            } else {
                anbi anbiVar = angfVar.a;
                String[] strArr2 = PartsTable.a;
                dqpd[] dqpdVarArrAH = bqecVar.aH("parts", new PartsTable.BindData[0]);
                dqpdVarArrAH.getClass();
                ekgbVarA = anbiVar.a(bindData, ekfv.c(dqpdVarArrAH), new BugleConversationId(bindData.D()), angfVar.b, angfVar.c, ancl.n, angfVar.d);
                ekqh it = ekgbVarA.iterator();
                it.getClass();
                while (it.hasNext()) {
                    ajlt ajltVar = (ajlt) it.next();
                    ajltVar.getClass();
                    Instant instantN = bqecVar.n();
                    instantN.getClass();
                    ((alwv) ajltVar).g = instantN;
                }
            }
            if (ekgbVarA != null) {
                arrayList.add(ekgbVarA);
            }
        }
        ekgb ekgbVarA2 = ekfv.a(fcva.q(arrayList));
        return ekgbVarA2 == fcylVar ? fcylVar : ekgbVarA2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ange(this.b, this.c, fcxyVar);
    }
}
