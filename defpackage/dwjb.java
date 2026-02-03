package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwjb {
    public abstract dwje a();

    public abstract void b(dwjh dwjhVar);

    public abstract void c(long j);

    public abstract void d(evqs evqsVar);

    public abstract void e(dwjd dwjdVar);

    public final void f(dwjg dwjgVar) {
        String str;
        dwin dwinVar = (dwin) dwjgVar;
        Set set = dwinVar.b;
        if (set != null && (str = dwinVar.d) != null) {
            b(new dwme(dwinVar.a, set, dwinVar.c, str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dwinVar.b == null) {
            sb.append(" phoneNumbers");
        }
        if (dwinVar.d == null) {
            sb.append(" tachyonAppName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
