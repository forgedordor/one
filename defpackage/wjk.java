package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjk extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ wjy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjk(fcxy fcxyVar, wjy wjyVar) {
        super(3, fcxyVar);
        this.c = wjyVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wjk wjkVar = new wjk((fcxy) obj3, this.c);
        wjkVar.d = (fdpm) obj;
        wjkVar.b = obj2;
        return wjkVar.b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Type inference failed for: r10v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            defpackage.fctl.b(r10)
            if (r1 == 0) goto Lb
            goto La8
        Lb:
            java.lang.Object r10 = r9.d
            java.lang.Object r1 = r9.b
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L20
            djcq r1 = defpackage.wjy.b
            fdpu r2 = new fdpu
            r2.<init>(r1)
            goto L9e
        L20:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.fcva.p(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L2f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r3.next()
            vvs r4 = (defpackage.vvs) r4
            wjy r5 = r9.c
            boolean r6 = r4 instanceof defpackage.vvr
            if (r6 == 0) goto L47
            r6 = r4
            vvr r6 = (defpackage.vvr) r6
            dltd r6 = r6.a
            goto L52
        L47:
            boolean r6 = r4 instanceof defpackage.vvn
            if (r6 == 0) goto L51
            r6 = r4
            vvn r6 = (defpackage.vvn) r6
            dltn r6 = r6.b
            goto L52
        L51:
            r6 = 0
        L52:
            boolean r7 = r6 instanceof defpackage.dlto
            if (r7 == 0) goto L7f
            dlto r6 = (defpackage.dlto) r6
            doig r7 = r6.a
            java.lang.String r7 = r7.a()
            boolean r7 = defpackage.le.y(r7)
            if (r7 == 0) goto L7f
            wkt r7 = r5.g
            java.lang.String r6 = r6.b
            wji r8 = new wji
            r8.<init>()
            java.util.Map r4 = r7.a
            java.lang.Object r5 = r4.get(r6)
            if (r5 != 0) goto L7c
            java.lang.Object r5 = r8.invoke()
            r4.put(r6, r5)
        L7c:
            fdpl r5 = (defpackage.fdpl) r5
            goto L85
        L7f:
            wkk r5 = r5.e
            fdpl r5 = r5.a(r4)
        L85:
            r2.add(r5)
            goto L2f
        L89:
            java.util.List r2 = defpackage.fcva.ao(r2)
            r3 = 0
            fdpl[] r3 = new defpackage.fdpl[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            fdpl[] r2 = (defpackage.fdpl[]) r2
            wjy r3 = r9.c
            wjt r4 = new wjt
            r4.<init>(r2, r3, r1)
            r2 = r4
        L9e:
            r1 = 1
            r9.a = r1
            java.lang.Object r10 = defpackage.fdpy.c(r10, r2, r9)
            if (r10 != r0) goto La8
            return r0
        La8:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjk.b(java.lang.Object):java.lang.Object");
    }
}
