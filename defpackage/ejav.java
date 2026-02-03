package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejav extends ejbe {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -1522852442442473691L;
    protected final String a;
    private final String i;
    private final boolean j;

    static {
        int i = ejat.a;
    }

    protected ejav() {
        this(new ejau());
    }

    protected ejwf b() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.c();
        ejwfVarB.b("quotaProjectId", null);
        ejwfVarB.b("universeDomain", this.i);
        ejwfVarB.h("isExplicitUniverseDomain", false);
        return ejwfVarB;
    }

    @Override // defpackage.ejbe
    public boolean equals(Object obj) {
        if (!(obj instanceof ejav)) {
            return false;
        }
        ejav ejavVar = (ejav) obj;
        String str = ejavVar.a;
        if (Objects.equals(null, null) && Objects.equals(this.i, ejavVar.i)) {
            boolean z = ejavVar.j;
            if (Objects.equals(false, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ejbe
    public int hashCode() {
        return Objects.hash(null, this.i, false);
    }

    @Override // defpackage.ejbe
    public final String toString() {
        return b().toString();
    }

    public ejav(ejau ejauVar) {
        super(ejauVar.a, ejauVar.b, ejauVar.c);
        this.a = null;
        this.i = "googleapis.com";
        this.j = false;
    }
}
