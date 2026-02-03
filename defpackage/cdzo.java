package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzo extends fgkj {
    private final Stack c = new Stack();
    public final List a = new ArrayList();
    public final StringBuilder b = new StringBuilder();
    private int d = 1;

    private final void y(fgle fgleVar) {
        Stack stack = this.c;
        if (stack.isEmpty()) {
            return;
        }
        fgle fgleVarA = ((cdzm) stack.peek()).a();
        if (fgleVarA == null || fdbq.f(fgleVarA, fgleVar)) {
            cdzm cdzmVar = (cdzm) stack.pop();
            y(cdzmVar.b());
            if (cdzmVar instanceof cdzk) {
                cdzk cdzkVar = (cdzk) cdzmVar;
                this.a.add(new diio(cdzkVar.b, cdzkVar.a, this.b.length(), null, 56));
                return;
            }
            if (!(cdzmVar instanceof cdzl)) {
                if ((cdzmVar instanceof cdzj) && (fgleVar instanceof fglo)) {
                    this.a.add(new diim(((cdzj) cdzmVar).a, ((fglo) fgleVar).a, this.b.length(), null, 24));
                    return;
                }
                return;
            }
            List list = this.a;
            cdzl cdzlVar = (cdzl) cdzmVar;
            dijs dijsVar = cdzlVar.b;
            int i = cdzlVar.a;
            list.add(new diin(dijsVar, i, fgleVarA == null ? i : this.b.length(), (fdap) null, 24));
        }
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void a(fgkm fgkmVar) {
        StringBuilder sb = this.b;
        if (sb.length() > 0) {
            sb.append("\n");
        }
        x(fgkmVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void b(fgkn fgknVar) {
        dijs dijsVar = dijs.g;
        StringBuilder sb = this.b;
        this.a.add(new diin(dijsVar, sb.length(), sb.length() + fgknVar.a.length(), (fdap) null, 24));
        sb.append(fgknVar.a);
        x(fgknVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void c(fgkp fgkpVar) {
        if (fgkpVar instanceof fghq) {
            this.c.push(new cdzl(this.b.length(), dijs.f, fgkpVar, ((fghq) fgkpVar).g));
        }
        if (((Boolean) ((cczi) crbf.aD.get()).e()).booleanValue()) {
            if (fgkpVar instanceof fghw) {
                this.c.push(new cdzl(this.b.length(), dijs.n, fgkpVar, ((fghw) fgkpVar).g));
            } else if (fgkpVar instanceof fghu) {
                this.c.push(new cdzl(this.b.length(), dijs.o, fgkpVar, ((fghu) fgkpVar).g));
            } else if (fgkpVar instanceof fghx) {
                this.c.push(new cdzl(this.b.length(), dijs.p, fgkpVar, ((fghx) fgkpVar).g));
            } else if (fgkpVar instanceof fghv) {
                Stack stack = this.c;
                StringBuilder sb = this.b;
                stack.push(new cdzl(sb.length(), dijs.q, fgkpVar, ((fghv) fgkpVar).g));
                sb.append("\u200b");
            }
        }
        x(fgkpVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void d(fgks fgksVar) {
        this.c.push(new cdzl(this.b.length(), dijs.e, fgksVar, fgksVar.g));
        x(fgksVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void e(fgkt fgktVar) {
        StringBuilder sb = this.b;
        sb.append("\n");
        this.a.add(new diil(sb.length(), sb.length() + fgktVar.d.length()));
        sb.append(fgktVar.d);
        x(fgktVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void f(fgku fgkuVar) {
        this.b.append("\n\n");
        x(fgkuVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void g(fgkv fgkvVar) {
        StringBuilder sb = this.b;
        if (sb.length() > 0) {
            sb.append("\n\n");
        }
        this.c.push(new cdzl(sb.length(), dijs.k, fgkvVar, fgkvVar.g));
        x(fgkvVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void h(fgky fgkyVar) {
        if (fgkyVar.g == null) {
            List list = this.a;
            String str = fgkyVar.a;
            str.getClass();
            StringBuilder sb = this.b;
            list.add(new diim(str, null, sb.length(), null, 24));
            if (cdzp.a(fgkyVar)) {
                sb.append("\u200b");
                return;
            }
            return;
        }
        Stack stack = this.c;
        StringBuilder sb2 = this.b;
        int length = sb2.length();
        fgle fgleVar = fgkyVar.g;
        String str2 = fgkyVar.a;
        str2.getClass();
        stack.push(new cdzj(length, fgkyVar, fgleVar, str2));
        if (cdzp.a(fgkyVar)) {
            sb2.append("\u200b");
        }
        x(fgkyVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void i(fgla fglaVar) {
        int length = this.b.length();
        fgle fgleVar = fglaVar.g;
        String str = fglaVar.a;
        str.getClass();
        this.c.push(new cdzk(length, fglaVar, fgleVar, str));
        x(fglaVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void j(fgld fgldVar) {
        fgle fgleVar;
        fgle fgleVar2 = fgldVar.g;
        if (fgleVar2 != null && (fgleVar = fgleVar2.g) != null) {
            dijs dijsVar = fgldVar.b() instanceof fgli ? dijs.j : dijs.i;
            Stack stack = this.c;
            StringBuilder sb = this.b;
            stack.push(new cdzl(sb.length(), dijsVar, fgldVar, fgleVar));
            if (fgldVar.b() instanceof fgli) {
                sb.append(this.d + ".\t");
                this.d = this.d + 1;
            }
        }
        x(fgldVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void k(fgli fgliVar) {
        StringBuilder sb = this.b;
        if (sb.length() > 0) {
            sb.append("\n");
        }
        x(fgliVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // defpackage.fgkj, defpackage.fglq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.fglj r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = r3.b
            int r1 = r0.length()
            if (r1 <= 0) goto L5a
            fdgl r1 = new fdgl
            java.lang.String r2 = "\\n\u200b*$"
            r1.<init>(r2)
            boolean r1 = r1.d(r0)
            if (r1 != 0) goto L5a
            java.util.Stack r1 = r3.c
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L3a
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5a
            java.lang.Object r1 = r1.peek()
            cdzm r1 = (defpackage.cdzm) r1
            r1.getClass()
            boolean r2 = r1 instanceof defpackage.cdzl
            if (r2 == 0) goto L3a
            cdzl r1 = (defpackage.cdzl) r1
            dijs r1 = r1.b
            boolean r1 = defpackage.cdzp.c(r1)
            if (r1 != 0) goto L5a
        L3a:
            java.util.List r1 = r3.a
            boolean r1 = defpackage.cdzp.d(r1)
            java.lang.String r2 = "\n"
            if (r1 == 0) goto L4b
            r1 = 1
            r3.d = r1
            r0.append(r2)
            goto L5a
        L4b:
            fgle r1 = r4.h
            boolean r1 = r1 instanceof defpackage.fgkv
            if (r1 == 0) goto L55
            r0.append(r2)
            goto L5a
        L55:
            java.lang.String r1 = "\n\n"
            r0.append(r1)
        L5a:
            r3.x(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdzo.l(fglj):void");
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void m(fglk fglkVar) {
        if (fglkVar.i instanceof fgky) {
            this.b.append("\u200b");
        } else {
            this.b.append("\n");
        }
        x(fglkVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void n(fgln fglnVar) {
        this.c.push(new cdzl(this.b.length(), dijs.d, fglnVar, fglnVar.g));
        x(fglnVar);
    }

    @Override // defpackage.fgkj, defpackage.fglq
    public final void o(fglo fgloVar) {
        if (!(fgloVar.e instanceof fgky)) {
            StringBuilder sb = this.b;
            sb.append(fgloVar.a);
            sb.append("\u200b");
        }
        y(fgloVar);
    }
}
