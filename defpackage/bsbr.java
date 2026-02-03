package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbr extends dqyd {
    public bsbr(String str, ContentValues contentValues, Map map, ekgb ekgbVar, dqyh dqyhVar) {
        super(str, contentValues, map, ekgbVar, dqyhVar);
    }

    public final ekgb a() {
        final int i = 0;
        return (ekgb) ParticipantsTable.g().p("participants.updateAndReturnUpdatedRows-txn", new ejxr() { // from class: bsbp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("participants.updateAndReturnUpdatedRows-query");
                bsbr bsbrVar = this.a;
                ekgb ekgbVar = bsbrVar.e;
                int i2 = ((ekoe) ekgbVar).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    bsboVarE.k((bsbt) ((dqyj) ekgbVar.get(i3)));
                }
                dqpb dqpbVar = (dqpb) bsbrVar.d;
                if (dqpbVar.b) {
                    bsbx bsbxVar = new bsbx();
                    bsbxVar.ar(bsbrVar.h());
                    bsboVarE.g(bsbxVar);
                }
                if (dqpbVar.c) {
                    bsboVarE.s();
                }
                Integer num = i;
                ekgb ekgbVarZ = bsboVarE.b().z();
                num.intValue();
                bsbrVar.t(0);
                return ekgbVarZ;
            }
        });
    }

    public final ekgb b() {
        return (ekgb) ParticipantsTable.g().p("updateAndReturnUpdatedRowsAfterUpdate-txn-participants", new ejxr() { // from class: bsbq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("updateAndReturnUpdatedRowsAfterUpdate-pre-participants");
                bsboVarE.v();
                bsboVarE.n(new dqxl("ROWID", new Object[0]), "_rowid");
                bsbr bsbrVar = this.a;
                ekgb ekgbVar = bsbrVar.e;
                int i = ((ekoe) ekgbVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    bsboVarE.k((bsbt) ((dqyj) ekgbVar.get(i2)));
                }
                if (((dqpb) bsbrVar.d).b) {
                    bsbx bsbxVar = new bsbx();
                    bsbxVar.ar(bsbrVar.h());
                    bsboVarE.g(bsbxVar);
                }
                ekfw ekfwVar = new ekfw();
                brzj brzjVar = (brzj) bsboVarE.b().p();
                while (brzjVar.moveToNext()) {
                    try {
                        ekfwVar.h(brzjVar.de("_rowid"));
                    } catch (Throwable th) {
                        try {
                            brzjVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                brzjVar.close();
                String str = (String) Collection.EL.stream(ekfwVar.g()).collect(Collectors.joining(","));
                bsbrVar.e();
                bsbo bsboVarE2 = ParticipantsTable.e();
                bsboVarE2.A("updateAndReturnUpdatedRowsAfterUpdate-post-participants");
                bsbx bsbxVar2 = new bsbx();
                bsbxVar2.ar(new dqxl("ROWID IN ($R)", new Object[]{str}));
                bsboVarE2.g(bsbxVar2);
                return bsboVarE2.b().z();
            }
        });
    }

    public final String c() {
        return this.a.getAsString("normalized_destination");
    }

    public final String d() {
        return this.a.getAsString("send_destination");
    }
}
