package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkw implements dnkk, dnkh {
    public final fdjx a;
    public List b;
    public Map c;
    private final fctc d;
    private final fctc e;

    public dnkw(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = fdjxVar;
        this.d = fctd.a(new fdae() { // from class: dnkl
            @Override // defpackage.fdae
            public final Object invoke() {
                dnkw dnkwVar = this.a;
                return fdil.d(dnkwVar.a, null, null, new dnkq(dnkwVar, null), 3);
            }
        });
        this.e = fctd.a(new fdae() { // from class: dnkm
            @Override // defpackage.fdae
            public final Object invoke() {
                dnkw dnkwVar = this.a;
                return fdil.d(dnkwVar.a, null, null, new dnks(dnkwVar, null), 3);
            }
        });
    }

    @Override // defpackage.dnkh
    public final Object a(final dnmj dnmjVar, fcxy fcxyVar) {
        return f(new fdap() { // from class: dnkn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Object next;
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    dnmj dnmjVar2 = dnmjVar;
                    next = it.next();
                    if (((dnkg) next).b.contains(dnmjVar2)) {
                        break;
                    }
                }
                return (dnkg) next;
            }
        }, fcxyVar);
    }

    @Override // defpackage.dnkh
    public final Object b(fcxy fcxyVar) {
        return f(new fdap() { // from class: dnkp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                List list = (List) obj;
                list.getClass();
                return list;
            }
        }, fcxyVar);
    }

    @Override // defpackage.dnkk
    public final Object c(fcxy fcxyVar) {
        Object objO = ((fdlr) this.e.a()).o(fcxyVar);
        return objO == fcyl.a ? objO : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dnkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.CharSequence r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dnkt
            if (r0 == 0) goto L13
            r0 = r6
            dnkt r0 = (defpackage.dnkt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnkt r0 = new dnkt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.e(r5, r0)
            if (r6 == r1) goto L79
        L3e:
            dnmj r6 = (defpackage.dnmj) r6
            r0 = 0
            if (r6 == 0) goto L78
            dnjs r1 = r6.a()
            java.lang.CharSequence r1 = r1.a()
            boolean r1 = defpackage.fdbq.f(r1, r5)
            if (r1 == 0) goto L56
            dnjs r5 = r6.a()
            return r5
        L56:
            java.util.Set r6 = r6.i()
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()
            r2 = r1
            dnke r2 = (defpackage.dnke) r2
            java.lang.CharSequence r2 = r2.a()
            boolean r2 = defpackage.fdbq.f(r2, r5)
            if (r2 == 0) goto L5e
            r0 = r1
        L76:
            dnkf r0 = (defpackage.dnkf) r0
        L78:
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnkw.d(java.lang.CharSequence, fcxy):java.lang.Object");
    }

    @Override // defpackage.dnkk
    public final Object e(final CharSequence charSequence, fcxy fcxyVar) {
        return g(new fdap() { // from class: dnko
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.getClass();
                return (dnmj) map.get(charSequence);
            }
        }, fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dnku
            if (r0 == 0) goto L13
            r0 = r6
            dnku r0 = (defpackage.dnku) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnku r0 = new dnku
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fctc r6 = r4.d
            java.lang.Object r6 = r6.a()
            fdlr r6 = (defpackage.fdlr) r6
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.o(r0)
            if (r6 == r1) goto L55
        L46:
            java.util.List r6 = r4.b
            if (r6 != 0) goto L50
            java.lang.String r6 = "categories"
            defpackage.fdbq.c(r6)
            r6 = 0
        L50:
            java.lang.Object r5 = r5.invoke(r6)
            return r5
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnkw.f(fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dnkv
            if (r0 == 0) goto L13
            r0 = r6
            dnkv r0 = (defpackage.dnkv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnkv r0 = new dnkv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dnko r5 = r0.d
            defpackage.fctl.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r6 = r5
            dnko r6 = (defpackage.dnko) r6
            r0.d = r6
            r0.c = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 == r1) goto L50
        L41:
            java.util.Map r6 = r4.c
            if (r6 != 0) goto L4b
            java.lang.String r6 = "literalsToEmoji"
            defpackage.fdbq.c(r6)
            r6 = 0
        L4b:
            java.lang.Object r5 = r5.invoke(r6)
            return r5
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnkw.g(fdap, fcxy):java.lang.Object");
    }
}
