package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwxa {
    public final dwwy a;
    final /* synthetic */ dwxc c;
    public boolean b = false;
    private final dwwx d = new dwwx() { // from class: dwwz
        @Override // defpackage.dwwx
        public final void a(Object obj) {
            dwxa dwxaVar = this.a;
            synchronized (dwxaVar.c) {
                synchronized (dwxaVar) {
                    if (!dwxaVar.b) {
                        dwxaVar.b = true;
                        dwxc dwxcVar = dwxaVar.c;
                        dwxcVar.b--;
                    }
                    dwxc dwxcVar2 = dwxaVar.c;
                    Map map = dwxcVar2.a;
                    map.put(dwxaVar.a, obj);
                    if (dwxcVar2.b == 0) {
                        dwxcVar2.c(new dwxb(map));
                    }
                }
            }
        }
    };

    public dwxa(dwxc dwxcVar, dwwy dwwyVar) {
        this.c = dwxcVar;
        this.a = dwwyVar;
    }

    public final synchronized void a() {
        this.b = false;
        this.a.j(this.d);
    }

    public final synchronized void b() {
        this.a.l(this.d);
        this.b = false;
    }
}
