package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehty {
    public abstract ehtz a();

    public abstract void b(esob esobVar);

    public final ehtz c() {
        ehtz ehtzVarA = a();
        ehtw ehtwVar = (ehtw) ehtzVarA;
        String str = ehtwVar.a;
        boolean z = false;
        ejwl.m((str == null) == (ehtwVar.b == null), "If host is set, port must be set (and vice-versa)");
        if (str != null) {
            if (str.matches("[a-zA-Z0-9-.]+")) {
            }
            ejwl.p(z, "Host string is invalid: %s", str);
            return ehtzVarA;
        }
        str = null;
        z = true;
        ejwl.p(z, "Host string is invalid: %s", str);
        return ehtzVarA;
    }
}
