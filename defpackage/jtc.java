package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jtc extends fdbr implements fdat {
    public static final jtc a = new jtc();

    public jtc() {
        super(2);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        if (list == null) {
            return list2;
        }
        List listAq = fcva.aq(list);
        listAq.addAll(list2);
        return listAq;
    }
}
