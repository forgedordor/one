package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbce implements cqci {
    public static final /* synthetic */ int a = 0;
    private static final eksp b;
    private static final List c;
    private static final Set d;
    private final fcsu e;
    private final fcsu f;

    static {
        cdag.v("enable_participant_destination_mutation_logger").getClass();
        b = eksp.c("BugleParticipantData");
        c = fcva.g(bbcx.c, bbcx.j, bbcx.f, bbcx.h, bbcx.d);
        d = new LinkedHashSet();
    }

    public bbce(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.e = fcsuVar;
        this.f = fcsuVar2;
    }

    private static final boolean c(bbcx bbcxVar, String str) {
        return (str != null && bbcxVar == bbcx.i && d.contains(str)) ? false : true;
    }

    public final int a(bsbr bsbrVar) {
        ekgb<ParticipantsTable.BindData> ekgbVarA = bsbrVar.a();
        for (ParticipantsTable.BindData bindData : ekgbVarA) {
            bbdd.b((bbdd) this.e.b(), bindData.T(), bindData.V(), bsbrVar.c(), bsbrVar.d(), false, false, null, 1008);
        }
        return ekgbVarA.size();
    }

    public final int b(final bsbs bsbsVar, bbcx bbcxVar) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        bbcxVar.getClass();
        eieu eieuVarH = eiiy.h("validateDestinationsThenExecuteUpdate");
        try {
            final fdcg fdcgVar = new fdcg();
            final fdci fdciVar = new fdci();
            fdciVar.a = fcvo.a;
            bsbr bsbrVarB = bsbsVar.b();
            boolean z4 = true;
            if (c.contains(bbcxVar)) {
                z = false;
                z2 = false;
            } else {
                ContentValues contentValues = bsbsVar.a;
                if (c(bbcxVar, contentValues.getAsString("send_destination"))) {
                    bsbsVar.ai(ParticipantsTable.c.g);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c(bbcxVar, contentValues.getAsString("normalized_destination"))) {
                    bsbsVar.ai(ParticipantsTable.c.f);
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z3;
            }
            ((dqsn) this.f.b()).d("validateDestinationsThenExecuteUpdate", new Runnable() { // from class: bbcd
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i = bbce.a;
                    bsbo bsboVarE = ParticipantsTable.e();
                    bsboVarE.s();
                    bsbs bsbsVar2 = bsbsVar;
                    ekgb ekgbVar = bsbsVar2.b().e;
                    ekgbVar.getClass();
                    ekqh it = ekgbVar.iterator();
                    while (it.hasNext()) {
                        dqyj dqyjVar = (dqyj) it.next();
                        dqyjVar.getClass();
                        bsboVarE.k((bsbt) dqyjVar);
                    }
                    fdci fdciVar2 = fdciVar;
                    bsboVarE.A("validateDestinationsThenExecuteUpdate");
                    ekgb ekgbVarZ = bsboVarE.b().z();
                    ekgbVarZ.getClass();
                    fdciVar2.a = ekgbVarZ;
                    bsbr bsbrVarB2 = bsbsVar2.b();
                    fdcgVar.a = bsbrVarB2.o() ? 0 : bsbrVarB2.e();
                }
            });
            for (ParticipantsTable.BindData bindData : (Iterable) fdciVar.a) {
                bbdd.b((bbdd) this.e.b(), bindData.T(), bindData.V(), bsbrVarB.c(), bsbrVarB.d(), z, z2, bbcxVar.name(), 112);
            }
            if (!z) {
                if (z2) {
                }
                int i = fdcgVar.a;
                fczl.a(eieuVarH, null);
                return i;
            }
            z4 = z2;
            eksl ekslVar = (eksl) b.h();
            ekslVar.V(5, TimeUnit.SECONDS);
            Iterable iterable = (Iterable) fdciVar.a;
            ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParticipantsTable.BindData) it.next()).R());
            }
            ekslVar.I("Blocked participant destination update: participantIds [%s], blockedSendDestinationUpdate [%s], blockedNormalizedDestinationUpdate [%s]", arrayList, Boolean.valueOf(z), Boolean.valueOf(z4));
            int i2 = fdcgVar.a;
            fczl.a(eieuVarH, null);
            return i2;
        } finally {
        }
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        if (i == 80) {
            d.clear();
        }
    }
}
