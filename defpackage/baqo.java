package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class baqo extends fcyz implements fdat {
    final /* synthetic */ baqs a;
    final /* synthetic */ ConversationIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqo(baqs baqsVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = baqsVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        baqs baqsVar = this.a;
        ConversationIdType conversationIdType = this.b;
        List listI = baqsVar.i(conversationIdType, false);
        if (bvdi.d(((bakt) baqsVar.a.b()).c(conversationIdType))) {
            ekgb<axcy> ekgbVarG = baqsVar.c.g();
            ekgbVarG.getClass();
            ArrayList arrayList = new ArrayList();
            for (axcy axcyVar : ekgbVarG) {
                axcyVar.getClass();
                alqm alqmVarH = baqsVar.h(axcyVar);
                if (alqmVarH != null) {
                    arrayList.add(alqmVarH);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listI) {
                if (!arrayList.contains(baqsVar.b.q((ParticipantsTable.BindData) obj2))) {
                    arrayList2.add(obj2);
                }
            }
            listI = arrayList2;
        }
        return ekfv.a(listI);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new baqo(this.a, this.b, fcxyVar);
    }
}
