package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crwb implements bayk {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fcsu f;

    public crwb(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.e = fdjxVar;
        this.a = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.d = fcsuVar5;
    }

    public static final boolean c(MessageCoreData messageCoreData, String str) {
        Map map = crvy.a;
        String str2 = (String) crvy.b.get(str);
        if (str2 == null) {
            return false;
        }
        return fdbq.f(messageCoreData.as(), str2);
    }

    @Override // defpackage.bayk
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        ekgb ekgbVarE = bbca.e(messageCoreData.A());
        if (ekgbVarE.size() > 1) {
            return;
        }
        ekgbVarE.getClass();
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) fcva.X(ekgbVarE);
        alqm alqmVarQ = ((alrj) this.f.b()).q(bindData);
        if (bbbe.d(bindData) || alqmVarQ.C() || alqmVarQ.s()) {
            auvw.m(this.e, null, new crwa(this, messageCoreData, bindData, null), 3);
        }
    }

    @Override // defpackage.bayk
    public final boolean j() {
        Object objE = ((cczi) crvx.a.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, fcxy fcxyVar) {
        return messageCoreData;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
