package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dobx extends fdbo implements fdat {
    public dobx(Object obj) {
        super(2, obj, docj.class, "onNewResults", "onNewResults(Ljava/lang/CharSequence;Ljava/lang/Iterable;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        docn docnVar;
        CharSequence charSequence = (CharSequence) obj;
        Iterable iterable = (Iterable) obj2;
        charSequence.getClass();
        iterable.getClass();
        docj docjVar = (docj) this.g;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            doav doavVar = (doav) it.next();
            doav doavVar2 = true == (doavVar instanceof doav) ? doavVar : null;
            if (doavVar2 != null) {
                arrayList.add(doavVar2);
            }
        }
        ArrayList arrayList2 = true != arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 != null) {
            docn docnVar2 = docjVar.am;
            if (docnVar2 == null) {
                fdbq.c("searchResultsAdapter");
                docnVar = null;
            } else {
                docnVar = docnVar2;
            }
            fdil.d(docjVar.bH(), null, null, new doci(docjVar, docnVar, arrayList2, charSequence, null), 3);
        } else {
            docj.bk(docjVar, null, null, Integer.valueOf(docjVar.ah), null, null, 27);
        }
        if (((dobm) docjVar.bC()).g()) {
            docjVar.bc();
        }
        return fctx.a;
    }
}
