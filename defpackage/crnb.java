package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crnb {
    private static final ejye b;
    public final crnf a;

    static {
        ejyk ejykVar = new ejyk();
        ejykVar.f(((Integer) dfog.o().a.ao.a()).intValue());
        ejykVar.e(((Integer) dfog.o().a.ap.a()).intValue(), TimeUnit.SECONDS);
        b = ejykVar.a();
    }

    public crnb(crnf crnfVar) {
        this.a = crnfVar;
    }

    public static String a(String str, ejxr ejxrVar) {
        ejye ejyeVar = b;
        String str2 = (String) ejyeVar.b(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) ejxrVar.get();
        ejyeVar.d(str, str3);
        return str3;
    }

    public final String b() {
        final crnf crnfVar = this.a;
        crnfVar.getClass();
        return a("main", new ejxr() { // from class: crmy
            @Override // defpackage.ejxr
            public final Object get() {
                return crnfVar.c();
            }
        });
    }

    public final String c(final int i) {
        return a(String.valueOf(i), new ejxr() { // from class: crna
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.a.d(i);
            }
        });
    }
}
