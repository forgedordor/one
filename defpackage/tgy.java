package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgy extends fcyz implements fdat {
    final /* synthetic */ Object a;
    final /* synthetic */ tgz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgy(fcxy fcxyVar, Object obj, tgz tgzVar) {
        super(2, fcxyVar);
        this.a = obj;
        this.b = tgzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tgy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        if (fctk.d(obj2)) {
            List<ParticipantsTable.BindData> list = (List) obj2;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            for (ParticipantsTable.BindData bindData : list) {
                baif baifVar = this.b.a;
                axjf axjfVar = (axjf) baifVar.a.b();
                axjfVar.getClass();
                alrj alrjVar = (alrj) baifVar.b.b();
                alrjVar.getClass();
                bindData.getClass();
                arrayList.add(new baie(axjfVar, alrjVar, bindData));
            }
            obj2 = arrayList;
        }
        return new fctk(obj2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tgy tgyVar = new tgy(fcxyVar, this.a, this.b);
        tgyVar.c = obj;
        return tgyVar;
    }
}
