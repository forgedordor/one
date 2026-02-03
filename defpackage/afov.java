package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afov extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ afpe c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afov(fcxy fcxyVar, afpe afpeVar) {
        super(3, fcxyVar);
        this.c = afpeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        afov afovVar = new afov((fcxy) obj3, this.c);
        afovVar.d = (fdpm) obj;
        afovVar.b = obj2;
        return afovVar.b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
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
            goto L9d
        Lb:
            java.lang.Object r10 = r9.d
            java.lang.Object r1 = r9.b
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L20
            djcq r1 = defpackage.afpe.b
            fdpu r2 = new fdpu
            r2.<init>(r1)
            goto L93
        L20:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L29:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r3.next()
            vvs r4 = (defpackage.vvs) r4
            afpe r5 = r9.c
            boolean r6 = r4 instanceof defpackage.vvr
            if (r6 == 0) goto L41
            r6 = r4
            vvr r6 = (defpackage.vvr) r6
            dltd r6 = r6.a
            goto L4c
        L41:
            boolean r6 = r4 instanceof defpackage.vvn
            if (r6 == 0) goto L4b
            r6 = r4
            vvn r6 = (defpackage.vvn) r6
            dltn r6 = r6.b
            goto L4c
        L4b:
            r6 = 0
        L4c:
            boolean r7 = r6 instanceof defpackage.dlto
            if (r7 == 0) goto L74
            dlto r6 = (defpackage.dlto) r6
            doig r7 = r6.a
            java.lang.String r7 = r7.a()
            boolean r7 = defpackage.le.y(r7)
            if (r7 == 0) goto L74
            java.util.Map r7 = r5.f
            java.lang.String r6 = r6.b
            java.lang.Object r8 = r7.get(r6)
            if (r8 != 0) goto L71
            wkk r5 = r5.e
            fdpl r8 = r5.a(r4)
            r7.put(r6, r8)
        L71:
            fdpl r8 = (defpackage.fdpl) r8
            goto L7a
        L74:
            wkk r5 = r5.e
            fdpl r8 = r5.a(r4)
        L7a:
            r2.add(r8)
            goto L29
        L7e:
            java.util.List r2 = defpackage.fcva.ao(r2)
            r3 = 0
            fdpl[] r3 = new defpackage.fdpl[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            fdpl[] r2 = (defpackage.fdpl[]) r2
            afpe r3 = r9.c
            afpd r4 = new afpd
            r4.<init>(r2, r3, r1)
            r2 = r4
        L93:
            r1 = 1
            r9.a = r1
            java.lang.Object r10 = defpackage.fdpy.c(r10, r2, r9)
            if (r10 != r0) goto L9d
            return r0
        L9d:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afov.b(java.lang.Object):java.lang.Object");
    }
}
