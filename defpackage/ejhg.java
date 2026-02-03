package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhg {
    public final ekgb a;
    public final String b;

    public ejhg(ejgl ejglVar) {
        this.b = ejglVar.d;
        int i = ejglVar.c;
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator<E> it = ejglVar.b.iterator();
        while (it.hasNext()) {
            ekfwVar.h(new ejhf((ejgj) it.next()));
        }
        this.a = ekfwVar.g();
    }
}
