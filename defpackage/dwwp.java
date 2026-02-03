package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwwp extends dwwy {
    public final ejvr a;
    public final dwwx b = new dwwx() { // from class: dwwn
        @Override // defpackage.dwwx
        public final void a(Object obj) {
            this.a.c(obj);
        }
    };
    public boolean c;
    public dwwy d;
    private final ListenableFuture g;
    private final eosc h;

    public dwwp(ListenableFuture listenableFuture, ejvr ejvrVar, eosc eoscVar) {
        this.g = listenableFuture;
        this.a = ejvrVar;
        this.h = eoscVar;
    }

    @Override // defpackage.dwwy
    protected final synchronized void a() {
        this.c = false;
        eork.r(this.g, new dwwo(this), this.h);
    }

    @Override // defpackage.dwwy
    protected final synchronized void b() {
        this.c = true;
        dwwy dwwyVar = this.d;
        if (dwwyVar != null) {
            dwwyVar.l(this.b);
        }
    }
}
