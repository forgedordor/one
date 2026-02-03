package defpackage;

import android.content.ContentValues;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsrc extends dqyd {
    public bsrc(String str, ContentValues contentValues, Map map, ekgb ekgbVar, dqyh dqyhVar) {
        super(str, contentValues, map, ekgbVar, dqyhVar);
    }

    public final ekgb a() {
        return (ekgb) bsrg.b().p("updateAndReturnUpdatedRowsAfterUpdate-txn-pipeline_work", new ejxr() { // from class: bsrb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                bsra bsraVarA = bsrg.a();
                bsraVarA.A("updateAndReturnUpdatedRowsAfterUpdate-pre-pipeline_work");
                bsraVarA.v();
                bsraVarA.n(new dqxl("ROWID", new Object[0]), "_rowid");
                bsrc bsrcVar = this.a;
                ekgb ekgbVar = bsrcVar.e;
                int i = ((ekoe) ekgbVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    bsraVarA.k((bsre) ((dqyj) ekgbVar.get(i2)));
                }
                if (((dqpb) bsrcVar.d).b) {
                    bsrf bsrfVar = new bsrf();
                    bsrfVar.ar(bsrcVar.h());
                    bsraVarA.c(bsrfVar);
                }
                ekfw ekfwVar = new ekfw();
                bsqj bsqjVar = (bsqj) bsraVarA.b().p();
                while (bsqjVar.moveToNext()) {
                    try {
                        ekfwVar.h(bsqjVar.de("_rowid"));
                    } catch (Throwable th) {
                        try {
                            bsqjVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bsqjVar.close();
                String str = (String) Collection.EL.stream(ekfwVar.g()).collect(Collectors.joining(","));
                bsrcVar.e();
                bsra bsraVarA2 = bsrg.a();
                bsraVarA2.A("updateAndReturnUpdatedRowsAfterUpdate-post-pipeline_work");
                bsrf bsrfVar2 = new bsrf();
                bsrfVar2.ar(new dqxl("ROWID IN ($R)", new Object[]{str}));
                bsraVarA2.c(bsrfVar2);
                return bsraVarA2.b().z();
            }
        });
    }
}
