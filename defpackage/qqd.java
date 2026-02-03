package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqd {
    public final List a;
    public final List b;
    public final List c;

    public qqd(List list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(((qts) list.get(i)).a.a());
            this.b.add(((qts) list.get(i)).b.a());
        }
    }
}
