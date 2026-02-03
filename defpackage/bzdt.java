package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdt implements bzbb {
    private final dqsn a;
    private final fcsu b;
    private final fcsu c;

    public bzdt(dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2) {
        dqsnVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = dqsnVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    private final void c(String str) {
        if (!((appk) this.c.b()).a()) {
            throw new bzdd(str);
        }
        throw new bzdd(str, this.b);
    }

    @Override // defpackage.bzbb
    public final void a(String str, String str2, cpyi cpyiVar) {
        try {
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.ap("CmsMessagesBackupTableAdapter#setCmsIdAndLifeCycleInTransaction");
            brduVar.m(cpyiVar);
            brduVar.k(str2);
            if (brduVar.e(bary.b(str))) {
                return;
            }
            c(str);
        } catch (SQLiteConstraintException e) {
            throw new bzdj("Messages", str, e);
        }
    }

    @Override // defpackage.bzbb
    public final void b(Iterable iterable, cpyi cpyiVar) {
        Object next;
        iterable.getClass();
        cpyiVar.getClass();
        this.a.i();
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("setCmsLifeCyclesInTransaction");
        brduVar.m(cpyiVar);
        brec brecVar = new brec();
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(bary.b((String) it.next()));
        }
        brecVar.t(arrayList);
        brduVar.W(brecVar);
        if (brduVar.b().e() == fcva.E(iterable)) {
            return;
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("CmsMessagesBackupTableAdapter#setCmsLifeCyclesInTransaction");
        brdrVarD.c(MessagesTable.c.a);
        brec brecVar2 = new brec();
        ArrayList arrayList2 = new ArrayList(fcva.p(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(bary.b((String) it2.next()));
        }
        brecVar2.t(arrayList2);
        brdrVarD.g(brecVar2);
        ekgb ekgbVarG = brdrVarD.b().g();
        Iterator it3 = iterable.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            } else {
                next = it3.next();
                if (!((List) Collection.EL.stream(ekgbVarG).map(new Function() { // from class: barx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessageIdType) obj).b();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new barw()))).contains((String) next)) {
                    break;
                }
            }
        }
        String str = (String) next;
        if (str == null) {
            str = "unknown";
        }
        c(str);
    }
}
