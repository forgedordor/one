package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhof implements dhor {
    private final Context a;
    private final Optional b;
    private final dhoi c;
    private final Map d;

    public dhof(Context context, Optional optional, dhoi dhoiVar, ahjw ahjwVar) {
        context.getClass();
        dhoiVar.getClass();
        ahjwVar.getClass();
        this.a = context;
        this.b = optional;
        this.c = dhoiVar;
        this.d = new LinkedHashMap();
    }

    private final synchronized dhop c(dhnv dhnvVar) {
        Object objA;
        Map map = this.d;
        objA = map.get(dhnvVar);
        if (objA == null) {
            objA = this.c.a(dhnvVar);
            map.put(dhnvVar, objA);
        }
        return (dhop) objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dhor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dhoe
            if (r0 == 0) goto L13
            r0 = r7
            dhoe r0 = (defpackage.dhoe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhoe r0 = new dhoe
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dhop r6 = r0.d
            defpackage.fctl.b(r7)
            return r6
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            r6.getClass()
            j$.util.Optional r7 = r5.b
            java.lang.Object r7 = defpackage.fdct.b(r7)
            fcsu r7 = (defpackage.fcsu) r7
            r2 = 0
            if (r7 == 0) goto L55
            java.lang.Object r7 = r7.b()
            dhnv r7 = (defpackage.dhnv) r7
            if (r7 == 0) goto L55
            java.lang.String r4 = r7.a
            int r4 = r4.length()
            if (r4 > 0) goto L53
            r7 = r2
        L53:
            if (r7 != 0) goto L64
        L55:
            android.content.Context r7 = r5.a
            dhnv r4 = new dhnv
            java.lang.String r7 = r7.getPackageName()
            r7.getClass()
            r4.<init>(r7, r6)
            r7 = r4
        L64:
            dhop r6 = r5.c(r7)
            r0.d = r6
            r0.c = r3
            dhon r7 = new dhon
            r7.<init>(r6, r2)
            java.lang.Object r7 = defpackage.fdjy.a(r7, r0)
            if (r7 == r1) goto L79
            fctx r7 = defpackage.fctx.a
        L79:
            if (r7 == r1) goto L7c
            return r6
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhof.a(java.lang.String, fcxy):java.lang.Object");
    }

    @Override // defpackage.dhor
    public final /* synthetic */ ListenableFuture b() {
        return fdxs.b(fdjy.b(fdkq.b), fcyi.a, fdjz.a, new dhoq(this, null));
    }
}
