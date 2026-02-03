package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbfq {
    public final alrj a;
    private final chtk b;

    public bbfq(chtk chtkVar, alrj alrjVar) {
        chtkVar.getClass();
        alrjVar.getClass();
        this.b = chtkVar;
        this.a = alrjVar;
    }

    public final bbfo a(ekgb ekgbVar) {
        ekgbVar.getClass();
        fdap fdapVar = new fdap() { // from class: bbfp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                bindData.getClass();
                return this.a.a.q(bindData);
            }
        };
        chtk chtkVar = this.b;
        Set setM = ((dghj) chtkVar.a.b()).m();
        ArrayList arrayList = new ArrayList(fcva.p(setM, 10));
        Iterator it = setM.iterator();
        while (it.hasNext()) {
            arrayList.add(((asqx) chtkVar.c.b()).c(((dggk) it.next()).a));
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.a.b((aubq) it2.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : ekgbVar) {
            obj.getClass();
            if (arrayList2.contains(fdapVar.invoke(obj))) {
                arrayList3.add(obj);
            } else {
                arrayList4.add(obj);
            }
        }
        fcti fctiVar = new fcti(arrayList3, arrayList4);
        return new bbfo(ekfv.a((List) fctiVar.a), ekfv.a((List) fctiVar.b));
    }
}
