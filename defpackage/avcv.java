package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avcv extends fcyz implements fdat {
    int a;
    final /* synthetic */ avcx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avcv(fcxy fcxyVar, avcx avcxVar) {
        super(2, fcxyVar);
        this.b = avcxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avcv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            botb botbVarE = botm.e();
            botbVarE.A("ContactsSyncRecurringMetricsLoggerImpl");
            botl botlVar = new botl();
            botlVar.q();
            botlVar.c(bvdk.UNARCHIVED);
            botbVarE.h(botlVar);
            botbVarE.e(new bosy(botm.c.r, false));
            botbVarE.y(10);
            obj = botbVarE.b().z();
            obj.getClass();
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            List listK = ((bakt) this.b.b.b()).K(((bojh) it.next()).C());
            listK.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listK) {
                if (((ParticipantsTable.BindData) obj2).r() == -2) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avcv avcvVar = new avcv(fcxyVar, this.b);
        avcvVar.c = obj;
        return avcvVar;
    }
}
