package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwly extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwlz b;
    final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwly(bwlz bwlzVar, Set set, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bwlzVar;
        this.c = set;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwly) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        if (r8 == r0) goto L16;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L6e
            goto L81
        Ld:
            bwlz r8 = r7.b
            fcsu r8 = r8.b
            java.lang.Object r8 = r8.b()
            bwlv r8 = (defpackage.bwlv) r8
            java.util.Set r1 = r7.c
            bwmd r3 = defpackage.bwmd.a
            evsf r3 = r3.createBuilder()
            bwma r3 = (defpackage.bwma) r3
            r3.getClass()
            MessageType extends evsn<MessageType, BuilderType> r4 = r3.instance
            bwmd r4 = (defpackage.bwmd) r4
            evtg r4 = r4.b
            java.util.List r4 = j$.util.DesugarCollections.unmodifiableList(r4)
            r4.getClass()
            r3.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r4 = r3.instance
            bwmd r4 = (defpackage.bwmd) r4
            evtg r5 = r4.b
            boolean r6 = r5.c()
            if (r6 != 0) goto L46
            evtg r5 = defpackage.evsn.mutableCopy(r5)
            r4.b = r5
        L46:
            evtg r4 = r4.b
            defpackage.evpz.addAll(r1, r4)
            evsn r1 = r3.build()
            r1.getClass()
            fcsu r8 = r8.a
            bwmd r1 = (defpackage.bwmd) r1
            java.lang.Object r8 = r8.b()
            cazj r8 = (defpackage.cazj) r8
            java.lang.String r3 = "encrypted_message_delete"
            cbcu r1 = defpackage.cbcu.f(r3, r1)
            eiju r8 = r8.b(r1)
            r7.a = r2
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 == r0) goto L85
        L6e:
            cazi r8 = (defpackage.cazi) r8
            eiju r8 = r8.b()
            r8.getClass()
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto L81
            goto L85
        L81:
            r8.getClass()
            return r8
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwly.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwly(this.b, this.c, fcxyVar);
    }
}
