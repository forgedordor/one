package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrs extends fcyz implements fdat {
    int a;
    final /* synthetic */ csrt b;
    final /* synthetic */ ParticipantsTable.BindData c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csrs(csrt csrtVar, ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, boolean z, int i, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csrtVar;
        this.c = bindData;
        this.d = conversationIdType;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csrs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            csrt csrtVar = this.b;
            ParticipantsTable.BindData bindData = this.c;
            ConversationIdType conversationIdType = this.d;
            baxe baxeVar = (baxe) csrtVar.c.b();
            Object objE = crtr.g.e();
            objE.getClass();
            ekgb ekgbVarH = baxeVar.H(conversationIdType, ((Number) objE).intValue());
            ekgbVarH.getClass();
            boolean z = this.e;
            int i2 = this.f;
            int i3 = this.g;
            this.a = 1;
            if (csrtVar.c(bindData, conversationIdType, ekgbVarH, z, 3, i2, i3, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csrs(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
