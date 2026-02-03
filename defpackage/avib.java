package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avib extends fcyz implements fdat {
    final /* synthetic */ List a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avib(fcxy fcxyVar, List list) {
        super(2, fcxyVar);
        this.a = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avib) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("ScheduleDeleteAndImportContactsHandler#getBatchedSyncParameters");
        bsbx bsbxVar = new bsbx();
        bsbxVar.v(-2);
        bsbxVar.ap(new dqty("participants.contact_id", 7, -1L));
        bsbxVar.o(false);
        bsboVarE.g(bsbxVar);
        bsboVarE.u();
        bsboVarE.c(ParticipantsTable.c.q);
        dqqj dqqjVarP = bsboVarE.b().p();
        try {
            brzj brzjVar = (brzj) dqqjVarP;
            while (brzjVar.moveToNext()) {
                List list = this.a;
                if (list.isEmpty() || ((avgt) ((avgs) fcva.S(list)).instance).b.size() >= ((Number) avbs.i.e()).intValue()) {
                    avgs avgsVar = (avgs) avgt.a.createBuilder();
                    int size = list.size() + 1;
                    avgsVar.copyOnWrite();
                    ((avgt) avgsVar.instance).c = size;
                    list.add(avgsVar);
                }
                avgs avgsVar2 = (avgs) fcva.S(list);
                long jE = brzjVar.e();
                avgsVar2.copyOnWrite();
                avgt avgtVar = (avgt) avgsVar2.instance;
                evta evtaVar = avgtVar.b;
                if (!evtaVar.c()) {
                    avgtVar.b = evsn.mutableCopy(evtaVar);
                }
                avgtVar.b.g(jE);
            }
            fczl.a(dqqjVarP, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avib avibVar = new avib(fcxyVar, this.a);
        avibVar.b = obj;
        return avibVar;
    }
}
