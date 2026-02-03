package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwwr extends dwwy {
    private dwwy a;
    private dwwx b;

    public static dwwy d(dwwy dwwyVar, final ejvr ejvrVar) {
        final dwwr dwwrVar = new dwwr();
        dwwrVar.a = dwwyVar;
        dwwrVar.b = new dwwx() { // from class: dwwq
            @Override // defpackage.dwwx
            public final void a(Object obj) {
                this.a.c(ejvrVar.apply(obj));
            }
        };
        return dwwrVar;
    }

    @Override // defpackage.dwwy
    protected final synchronized void a() {
        this.a.j(this.b);
    }

    @Override // defpackage.dwwy
    protected final synchronized void b() {
        this.a.l(this.b);
    }
}
