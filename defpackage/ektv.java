package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ektv {
    private static final ektv a = new ektp();

    public static ektv g(ekte ekteVar, ekte ekteVar2) {
        int iB = ekteVar.b() + ekteVar2.b();
        return iB == 0 ? a : iB <= 28 ? new ektt(ekteVar, ekteVar2) : new ektu(ekteVar, ekteVar2);
    }

    public abstract int a();

    public abstract Object b(ekrz ekrzVar);

    public abstract Set c();

    public abstract void d(ektl ektlVar, Object obj);
}
