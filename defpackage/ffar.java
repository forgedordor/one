package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffar {
    public final List a;
    private int b;

    public ffar(List list) {
        this.a = list;
    }

    public final fezl a() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        List list = this.a;
        int i = this.b;
        this.b = i + 1;
        return (fezl) list.get(i);
    }

    public final boolean b() {
        return this.b < this.a.size();
    }
}
