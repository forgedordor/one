package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxu {
    public static final hyr a(final fdat fdatVar, fdap fdapVar) {
        fdat fdatVar2 = new fdat() { // from class: hxt
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                hyk hykVar;
                hya hyaVar = (hya) obj;
                List list = (List) fdatVar.a(hyaVar, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (hykVar = hyaVar.b) != null && !hykVar.d(obj3)) {
                        throw new IllegalArgumentException(a.y(obj3, i, "item at index ", " can't be saved: "));
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            }
        };
        fdcm.e(fdapVar, 1);
        return new hyu(fdatVar2, fdapVar);
    }
}
