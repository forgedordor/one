package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abaf {
    public final String a;
    private final abag b;

    public abaf(abag abagVar, String str) {
        this.b = abagVar;
        this.a = str;
    }

    public final abak a() {
        cqbs cqbsVar = new cqbs() { // from class: abae
            @Override // defpackage.cqbs
            public final void a(StringBuilder sb) {
                sb.append(this.a.a);
            }
        };
        ThreadLocal threadLocal = abak.a;
        abak abakVar = (abak) threadLocal.get();
        if (abakVar == null) {
            abak abakVar2 = new abak(this.b);
            threadLocal.set(abakVar2);
            abakVar = abakVar2;
        } else {
            abakVar.r();
        }
        abakVar.t(2, "Diagnostics", cqbsVar);
        return abakVar;
    }

    public final void b(String str) {
        abak abakVarA = a();
        abakVarA.I(str);
        abakVarA.r();
    }
}
