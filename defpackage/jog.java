package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jog {
    public final jsc a;
    public final cui b;

    public jog(jsl jslVar, ctj ctjVar) {
        this.a = jslVar.c;
        this.b = new cui(jslVar.j().size());
        List listJ = jslVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            jsl jslVar2 = (jsl) listJ.get(i);
            if (ctjVar.b(jslVar2.e)) {
                this.b.d(jslVar2.e);
            }
        }
    }
}
