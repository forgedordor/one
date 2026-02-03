package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqty {
    public static final cquc a(List list) {
        list.getClass();
        return list.size() == 1 ? (cquc) list.get(0) : new cqtz(list);
    }

    public static final cquc b(cquc... cqucVarArr) {
        return cqucVarArr.length == 1 ? cqucVarArr[0] : new cqtz(fcur.c(cqucVarArr));
    }
}
