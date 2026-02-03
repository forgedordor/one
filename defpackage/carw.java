package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cary b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public carw(fcxy fcxyVar, cary caryVar) {
        super(2, fcxyVar);
        this.b = caryVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((carw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("BugleDbCmsObjectCounter#countAllObjects-messages");
        int iH = brdrVarD.b().h();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("BugleDbCmsObjectCounter#countAllObjects-participants");
        int iH2 = bsboVarE.b().h();
        botb botbVarE = botm.e();
        botbVarE.A("BugleDbCmsObjectCounter#countAllObjects-conversations");
        cars carsVar = new cars(iH, botbVarE.b().h(), iH2);
        return carsVar != fcylVar ? carsVar : fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        carw carwVar = new carw(fcxyVar, this.b);
        carwVar.c = obj;
        return carwVar;
    }
}
