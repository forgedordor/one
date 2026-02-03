package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjel {
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aubq a(defpackage.cjgr r7, defpackage.cjju r8) {
        /*
            aubq r0 = defpackage.aubq.a
            evsf r0 = r0.createBuilder()
            aubn r0 = (defpackage.aubn) r0
            int r1 = r8.b
            int r2 = defpackage.cjjt.a(r1)
            if (r2 == 0) goto Lcc
            int r2 = r2 + (-1)
            r3 = 4
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L73
            if (r2 != r4) goto L6b
            if (r1 != r5) goto L20
            java.lang.Object r1 = r8.c
            cjme r1 = (defpackage.cjme) r1
            goto L22
        L20:
            cjme r1 = defpackage.cjme.a
        L22:
            java.lang.String r1 = r1.c
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r0.instance
            aubq r2 = (defpackage.aubq) r2
            r1.getClass()
            int r6 = r2.b
            r6 = r6 | r5
            r2.b = r6
            r2.d = r1
            int r2 = r7.c
            int r2 = defpackage.cjgq.a(r2)
            if (r2 != 0) goto L3e
            goto L8f
        L3e:
            if (r2 != r3) goto L8f
            java.lang.String r2 = "sip"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L4c
            java.lang.String r1 = r1.substring(r3)
        L4c:
            r2 = 59
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto L59
            r6 = 0
            java.lang.String r1 = r1.substring(r6, r2)
        L59:
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r0.instance
            aubq r2 = (defpackage.aubq) r2
            r1.getClass()
            int r6 = r2.b
            r6 = r6 | r5
            r2.b = r6
            r2.d = r1
            goto L8f
        L6b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Conversation type not supported"
            r7.<init>(r8)
            throw r7
        L73:
            if (r1 != r4) goto L7a
            java.lang.Object r1 = r8.c
            cjjp r1 = (defpackage.cjjp) r1
            goto L7c
        L7a:
            cjjp r1 = defpackage.cjjp.a
        L7c:
            java.lang.String r1 = r1.c
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r0.instance
            aubq r2 = (defpackage.aubq) r2
            r1.getClass()
            int r6 = r2.b
            r6 = r6 | r5
            r2.b = r6
            r2.d = r1
        L8f:
            int r8 = r8.b
            if (r8 != r4) goto L96
            aubp r7 = defpackage.aubp.PHONE
            goto Lb5
        L96:
            if (r8 != r5) goto Lb3
            int r7 = r7.c
            int r8 = defpackage.cjgq.a(r7)
            if (r8 != 0) goto La1
            goto La6
        La1:
            if (r8 != r3) goto La6
            aubp r7 = defpackage.aubp.BOT
            goto Lb5
        La6:
            int r7 = defpackage.cjgq.a(r7)
            if (r7 != 0) goto Lad
            goto Lb3
        Lad:
            r8 = 3
            if (r7 != r8) goto Lb3
            aubp r7 = defpackage.aubp.GROUP
            goto Lb5
        Lb3:
            aubp r7 = defpackage.aubp.UNKNOWN_TYPE
        Lb5:
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r0.instance
            aubq r8 = (defpackage.aubq) r8
            int r7 = r7.f
            r8.c = r7
            int r7 = r8.b
            r7 = r7 | r4
            r8.b = r7
            evsn r7 = r0.build()
            aubq r7 = (defpackage.aubq) r7
            return r7
        Lcc:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjel.a(cjgr, cjju):aubq");
    }

    public static cjju b(aubq aubqVar) {
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        int iOrdinal = aubpVarB.ordinal();
        if (iOrdinal == 1) {
            cjjs cjjsVar = (cjjs) cjju.a.createBuilder();
            cjjo cjjoVar = (cjjo) cjjp.a.createBuilder();
            String str = aubqVar.d;
            cjjoVar.copyOnWrite();
            cjjp cjjpVar = (cjjp) cjjoVar.instance;
            str.getClass();
            cjjpVar.b |= 1;
            cjjpVar.c = str;
            cjjsVar.copyOnWrite();
            cjju cjjuVar = (cjju) cjjsVar.instance;
            cjjp cjjpVar2 = (cjjp) cjjoVar.build();
            cjjpVar2.getClass();
            cjjuVar.c = cjjpVar2;
            cjjuVar.b = 1;
            return (cjju) cjjsVar.build();
        }
        if (iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal == 4) {
                throw new UnsupportedOperationException("Emergency ChatEndpoint to RcsDestinationId not yet supported.");
            }
            aubp aubpVarB2 = aubp.b(aubqVar.c);
            if (aubpVarB2 == null) {
                aubpVarB2 = aubp.UNKNOWN_TYPE;
            }
            throw new IllegalArgumentException("ChatEndpoint type not supported: " + aubpVarB2.f);
        }
        cjjs cjjsVar2 = (cjjs) cjju.a.createBuilder();
        cjmd cjmdVar = (cjmd) cjme.a.createBuilder();
        String str2 = aubqVar.d;
        cjmdVar.copyOnWrite();
        cjme cjmeVar = (cjme) cjmdVar.instance;
        str2.getClass();
        cjmeVar.b = 1 | cjmeVar.b;
        cjmeVar.c = str2;
        cjjsVar2.copyOnWrite();
        cjju cjjuVar2 = (cjju) cjjsVar2.instance;
        cjme cjmeVar2 = (cjme) cjmdVar.build();
        cjmeVar2.getClass();
        cjjuVar2.c = cjmeVar2;
        cjjuVar2.b = 2;
        return (cjju) cjjsVar2.build();
    }
}
