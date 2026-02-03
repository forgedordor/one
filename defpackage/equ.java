package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class equ {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    final /* synthetic */ eqv f;

    public equ(eqv eqvVar, List list) {
        this.f = eqvVar;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            ebs.c("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
