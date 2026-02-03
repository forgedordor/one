package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzck implements bzbb {
    private final dqsn a;

    public bzck(dqsn dqsnVar) {
        dqsnVar.getClass();
        this.a = dqsnVar;
    }

    @Override // defpackage.bzbb
    public final void a(String str, String str2, cpyi cpyiVar) {
        try {
            String[] strArr = botm.a;
            bote boteVar = new bote();
            boteVar.ap("CmsConversationsBackupTableAdapter#setCmsIdAndLifeCycleInTransaction");
            boteVar.l(cpyiVar);
            boteVar.k(str2);
            if (boteVar.f(barn.b(str))) {
            } else {
                throw new bzdd(str);
            }
        } catch (SQLiteConstraintException e) {
            throw new bzdb(e);
        } catch (SQLiteException e2) {
            throw new bzdj("Conversations", str, e2);
        }
    }

    @Override // defpackage.bzbb
    public final void b(Iterable iterable, cpyi cpyiVar) {
        Object next;
        iterable.getClass();
        cpyiVar.getClass();
        this.a.i();
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("CmsConversationsBackupTableAdapter#setCmsLifeCyclesInTransaction");
        boteVar.l(cpyiVar);
        botl botlVar = new botl();
        botlVar.u(barn.c(iterable));
        boteVar.ac(botlVar);
        if (boteVar.b().e() == fcva.E(iterable)) {
            return;
        }
        botb botbVarE = botm.e();
        botbVarE.A("+CmsConversationBackupTableAdapter#setCmsLifeCyclesInTransaction");
        botbVarE.c(botm.c.a);
        botl botlVar2 = new botl();
        botlVar2.u(barn.c(iterable));
        botbVarE.h(botlVar2);
        ekgb ekgbVarG = botbVarE.b().g();
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (!ekgb.n((Collection) Collection.EL.stream(ekgbVarG).map(new Function() { // from class: barl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ConversationIdType) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new barj()))).contains((String) next)) {
                    break;
                }
            }
        }
        String strA = (String) next;
        if (strA == null) {
            strA = barn.a.a();
        }
        strA.getClass();
        throw new bzdd(strA);
    }
}
