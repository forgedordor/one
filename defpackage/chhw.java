package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chhw extends fcyz implements fdat {
    final /* synthetic */ chhx a;
    final /* synthetic */ chif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chhw(chhx chhxVar, chif chifVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = chhxVar;
        this.b = chifVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chhw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        chif chifVar = this.b;
        chia chiaVar = chifVar.d;
        chjn chjnVar = chiaVar.e;
        ContentValues contentValues = chifVar.g;
        aydh aydhVar = this.a.a;
        String asString = contentValues.getAsString("address");
        int i = chjnVar.b;
        ParticipantsTable.BindData bindData = ((axly) aydhVar.d(asString, i)).b;
        chhz chhzVar = chifVar.f;
        long epochMilli = chiaVar.c.toEpochMilli();
        MessageIdType messageIdType = chhzVar.g;
        chhu chhuVar = chifVar.e;
        aydhVar.i(new axlx(messageIdType, chhuVar.a, bindData, chhuVar.b, chhuVar.c, epochMilli, i, chjnVar.f));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chhw(this.a, this.b, fcxyVar);
    }
}
