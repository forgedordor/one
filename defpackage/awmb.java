package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awmb extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    /* synthetic */ Object f;
    final /* synthetic */ List g;
    final /* synthetic */ awmk h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awmb(List list, awmk awmkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.g = list;
        this.h = awmkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awmb) c((Set) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x007c -> B:11:0x007d). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.e
            if (r1 == 0) goto L16
            java.lang.Object r1 = r7.d
            java.lang.Object r2 = r7.c
            java.lang.Object r3 = r7.b
            java.lang.Object r4 = r7.a
            java.lang.Object r5 = r7.f
            awmk r5 = (defpackage.awmk) r5
            defpackage.fctl.b(r8)
            goto L7d
        L16:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.f
            java.util.Set r8 = (java.util.Set) r8
            ekrg r1 = defpackage.awmk.a
            ekrw r1 = r1.e()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r3 = "BugleCME"
            r1.X(r2, r3)
            r2 = 327(0x147, float:4.58E-43)
            java.lang.String r3 = "CachingGroupManager.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/core/group/CachingGroupManager$getGroupsFromLegacyGroupsCache$2$1"
            java.lang.String r5 = "invokeSuspend"
            ekrw r1 = r1.h(r4, r5, r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            java.util.List r2 = r7.g
            java.lang.String r3 = "Cache miss looking up groups %s from legacyGroupsCache."
            r1.t(r3, r2)
            awmk r1 = r7.h
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 10
            int r3 = defpackage.fcva.p(r8, r3)
            int r3 = defpackage.fcwa.a(r3)
            r4 = 16
            int r3 = defpackage.fddu.f(r3, r4)
            r2.<init>(r3)
            java.util.Iterator r8 = r8.iterator()
            r3 = r8
            r5 = r1
        L5c:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L8a
            java.lang.Object r1 = r3.next()
            r8 = r1
            awpx r8 = (defpackage.awpx) r8
            r7.f = r5
            r7.a = r2
            r7.b = r3
            r7.c = r2
            r7.d = r1
            r4 = 1
            r7.e = r4
            java.lang.Object r8 = r5.i(r8, r7)
            if (r8 == r0) goto L89
            r4 = r2
        L7d:
            awmp r8 = (defpackage.awmp) r8
            awmq r6 = new awmq
            r6.<init>(r8)
            r2.put(r1, r6)
            r2 = r4
            goto L5c
        L89:
            return r0
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awmb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awmb awmbVar = new awmb(this.g, this.h, fcxyVar);
        awmbVar.f = obj;
        return awmbVar;
    }
}
