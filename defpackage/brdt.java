package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brdt extends dqyd {
    public brdt(String str, ContentValues contentValues, Map map, ekgb ekgbVar, dqyh dqyhVar) {
        super(str, contentValues, map, ekgbVar, dqyhVar);
    }

    public final int a() {
        return this.a.getAsInteger("message_status").intValue();
    }

    public final ekgb b() {
        final int i = 0;
        return (ekgb) MessagesTable.f().p("messages.updateAndReturnUpdatedRows-txn", new ejxr() { // from class: brds
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("messages.updateAndReturnUpdatedRows-query");
                brdt brdtVar = this.a;
                ekgb ekgbVar = brdtVar.e;
                int i2 = ((ekoe) ekgbVar).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    brdrVarD.k((brdv) ((dqyj) ekgbVar.get(i3)));
                }
                dqpb dqpbVar = (dqpb) brdtVar.d;
                if (dqpbVar.b) {
                    brec brecVar = new brec();
                    brecVar.ar(brdtVar.h());
                    brdrVarD.g(brecVar);
                }
                if (dqpbVar.c) {
                    brdrVarD.s();
                }
                Integer num = i;
                ekgb ekgbVarZ = brdrVarD.b().z();
                num.intValue();
                brdtVar.t(0);
                return ekgbVarZ;
            }
        });
    }
}
