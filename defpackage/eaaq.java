package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaaq {
    public final eldz a = eldz.f;
    private final ejxr b;
    private final ejxr c;

    public eaaq(final evqs evqsVar, final String str, final String str2) {
        this.b = ejxx.a(new ejxr() { // from class: eaao
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.a.j(evqsVar.I());
            }
        });
        this.c = ejxx.a(new ejxr() { // from class: eaap
            @Override // defpackage.ejxr
            public final Object get() {
                int i = elcz.a;
                int i2 = eldk.a;
                eldj eldjVar = new eldj();
                eldjVar.j(str.getBytes());
                eldjVar.c((byte) 0);
                eldjVar.j(str2.getBytes());
                return this.a.a.j(eldjVar.r().e());
            }
        });
    }

    public final File a() {
        return new File(((String) this.b.get()) + "/" + ((String) this.c.get()) + ".pb");
    }
}
