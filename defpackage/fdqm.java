package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdqm extends fcyz implements fdau {
    long a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ fdpl e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdqm(long j, fdpl fdplVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = j;
        this.e = fdplVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdqm fdqmVar = new fdqm(this.d, this.e, (fcxy) obj3);
        fdqmVar.f = (fdjx) obj;
        fdqmVar.c = (fdpm) obj2;
        return fdqmVar.b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0063 -> B:10:0x0065). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            if (r1 == 0) goto L14
            long r1 = r8.a
            java.lang.Object r3 = r8.c
            fdou r3 = (defpackage.fdou) r3
            java.lang.Object r4 = r8.f
            fdpm r4 = (defpackage.fdpm) r4
            defpackage.fctl.b(r9)
            goto L65
        L14:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.f
            fdjx r9 = (defpackage.fdjx) r9
            java.lang.Object r1 = r8.c
            fdpm r1 = (defpackage.fdpm) r1
            long r2 = r8.d
            r4 = 0
            int r4 = defpackage.fdhi.a(r2, r4)
            if (r4 <= 0) goto L72
            fdpl r4 = r8.e
            r5 = 0
            r6 = 2
            fdpl r4 = defpackage.fdpn.a(r4, r5, r6)
            fdou r9 = defpackage.fdpw.b(r4, r9)
            r4 = r1
            r1 = r2
            r3 = r9
        L38:
            feaq r9 = new feaq
            fcyh r5 = r8.u()
            r9.<init>(r5)
            feam r5 = r3.B()
            fdqk r6 = new fdqk
            r7 = 0
            r6.<init>(r4, r7)
            r9.a(r5, r6)
            fdql r5 = new fdql
            r5.<init>(r1, r7)
            defpackage.feak.b(r9, r1, r5)
            r8.f = r4
            r8.c = r3
            r8.a = r1
            r5 = 1
            r8.b = r5
            java.lang.Object r9 = defpackage.feaq.d(r9, r8)
            if (r9 == r0) goto L71
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6e
            goto L38
        L6e:
            fctx r9 = defpackage.fctx.a
            return r9
        L71:
            return r0
        L72:
            fdmx r9 = new fdmx
            java.lang.String r0 = "Timed out immediately"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdqm.b(java.lang.Object):java.lang.Object");
    }
}
