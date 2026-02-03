package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auxv implements fdpm {
    final /* synthetic */ List a;
    final /* synthetic */ fdpm b;

    public auxv(List list, fdpm fdpmVar) {
        this.a = list;
        this.b = fdpmVar;
    }

    @Override // defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        List list = this.a;
        list.add(obj);
        if (list.size() == 100) {
            List listAo = fcva.ao(list);
            list.clear();
            Object objFO = this.b.fO(listAo, fcxyVar);
            if (objFO == fcyl.a) {
                return objFO;
            }
        }
        return fctx.a;
    }
}
