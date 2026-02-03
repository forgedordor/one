package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cifs {
    public static final boolean a(alqm alqmVar, List list) {
        Optional optionalE;
        aubq aubqVar;
        String str = null;
        if (alqmVar != null && (optionalE = alqmVar.e()) != null && (aubqVar = (aubq) fdct.b(optionalE)) != null) {
            str = aubqVar.d;
        }
        if (alqmVar == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (fdbq.f(((ParticipantsTable.BindData) it.next()).T(), str)) {
                return true;
            }
        }
        return false;
    }

    public static final int b(List list, Set set) {
        Stream stream = Collection.EL.stream(set);
        final fdap fdapVar = new fdap() { // from class: cifm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                aubq aubqVar = (aubq) obj;
                aubqVar.getClass();
                return aubqVar.d;
            }
        };
        ekhx ekhxVar = (ekhx) stream.map(new Function() { // from class: cifn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ekhxVar.contains(((ParticipantsTable.BindData) it.next()).T()) && (i = i + 1) < 0) {
                fcva.l();
            }
        }
        return i;
    }

    public static final boolean c(alqm alqmVar, List list) {
        Optional optionalE;
        aubq aubqVar;
        String str = null;
        if (alqmVar != null && (optionalE = alqmVar.e()) != null && (aubqVar = (aubq) fdct.b(optionalE)) != null) {
            str = aubqVar.d;
        }
        if (alqmVar == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (fdbq.f(((aubq) it.next()).d, str)) {
                return true;
            }
        }
        return false;
    }

    public static final int d(List list, Set set) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (set.contains((aubq) it.next()) && (i = i + 1) < 0) {
                fcva.l();
            }
        }
        return i;
    }
}
