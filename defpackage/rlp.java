package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlp {
    public final res a;
    public final List b;
    public final rfg c;

    public rlp(res resVar, rfg rfgVar) {
        this(resVar, Collections.EMPTY_LIST, rfgVar);
    }

    public rlp(res resVar, List list, rfg rfgVar) {
        rvi.f(resVar);
        this.a = resVar;
        rvi.f(list);
        this.b = list;
        rvi.f(rfgVar);
        this.c = rfgVar;
    }
}
