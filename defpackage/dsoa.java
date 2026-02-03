package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsoa implements dsna {
    public static final eksp a = eksp.c("GnpSdk");
    public final dxgg b;
    public final dxgg c;
    public final drzl d;
    public final String e;
    public final Map f;
    public final ejwi g;
    public final fcsu h;
    public final eygg i;
    public final fdjx j;
    public final fcyh k;
    private final Context l;
    private final ListenableFuture m;
    private final dsgs n;
    private final ejwi o;
    private final ejwi p;
    private final diep q;
    private final Set r;
    private final dxva s;

    public dsoa(Context context, ListenableFuture listenableFuture, dxgg dxggVar, dxgg dxggVar2, dsgs dsgsVar, drzl drzlVar, String str, ejwi ejwiVar, ejwi ejwiVar2, dxva dxvaVar, diep diepVar, Map map, Set set, ejwi ejwiVar3, fcsu fcsuVar, eygg eyggVar, fdjx fdjxVar, fcyh fcyhVar) {
        context.getClass();
        listenableFuture.getClass();
        dxggVar.getClass();
        dxggVar2.getClass();
        dsgsVar.getClass();
        drzlVar.getClass();
        str.getClass();
        ejwiVar.getClass();
        ejwiVar2.getClass();
        dxvaVar.getClass();
        diepVar.getClass();
        fcsuVar.getClass();
        eyggVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.l = context;
        this.m = listenableFuture;
        this.b = dxggVar;
        this.c = dxggVar2;
        this.n = dsgsVar;
        this.d = drzlVar;
        this.e = str;
        this.o = ejwiVar;
        this.p = ejwiVar2;
        this.s = dxvaVar;
        this.q = diepVar;
        this.f = map;
        this.r = set;
        this.g = ejwiVar3;
        this.h = fcsuVar;
        this.i = eyggVar;
        this.j = fdjxVar;
        this.k = fcyhVar;
    }

    @Override // defpackage.dsna
    public final Object a(evje evjeVar, fcxy fcxyVar) {
        return fdin.a(this.k, new dsnx(evjeVar, this, null), fcxyVar);
    }

    public final etgy b() {
        etgx etgxVar = (etgx) etgy.a.createBuilder();
        etgxVar.getClass();
        etgk etgkVar = (etgk) etgm.a.createBuilder();
        etgkVar.getClass();
        etgkVar.copyOnWrite();
        etgm etgmVar = (etgm) etgkVar.instance;
        etgmVar.c = 6;
        etgmVar.b |= 1;
        etgkVar.copyOnWrite();
        etgm etgmVar2 = (etgm) etgkVar.instance;
        etgmVar2.b |= 2;
        etgmVar2.d = 757365213;
        etge etgeVar = (etge) etgf.a.createBuilder();
        etgeVar.getClass();
        etgeVar.copyOnWrite();
        etgf etgfVar = (etgf) etgeVar.instance;
        etgfVar.c = 4;
        etgfVar.d = this.e;
        ejwi ejwiVar = this.o;
        if (ejwiVar.g()) {
            String strValueOf = String.valueOf(((Number) ejwiVar.c()).intValue());
            strValueOf.getClass();
            etgeVar.copyOnWrite();
            etgf etgfVar2 = (etgf) etgeVar.instance;
            etgfVar2.b |= 1;
            etgfVar2.e = strValueOf;
        }
        ejwi ejwiVar2 = this.p;
        if (ejwiVar2.g()) {
            String str = (String) ejwiVar2.c();
            etgeVar.copyOnWrite();
            etgf etgfVar3 = (etgf) etgeVar.instance;
            etgfVar3.b |= 2;
            etgfVar3.f = str;
        }
        evsn evsnVarBuild = etgeVar.build();
        evsnVarBuild.getClass();
        etgkVar.copyOnWrite();
        etgm etgmVar3 = (etgm) etgkVar.instance;
        etgmVar3.e = (etgf) evsnVarBuild;
        etgmVar3.b |= 4;
        evsn evsnVarBuild2 = etgkVar.build();
        evsnVarBuild2.getClass();
        etgxVar.copyOnWrite();
        etgy etgyVar = (etgy) etgxVar.instance;
        etgyVar.d = (etgm) evsnVarBuild2;
        etgyVar.b |= 1;
        etgr etgrVar = (etgr) etgu.a.createBuilder();
        etgrVar.getClass();
        String strA = dsbe.a(this.l);
        if (strA == null) {
            strA = "";
        }
        etgrVar.copyOnWrite();
        etgu etguVar = (etgu) etgrVar.instance;
        etguVar.b |= 4;
        etguVar.f = strA;
        etgrVar.copyOnWrite();
        etgu etguVar2 = (etgu) etgrVar.instance;
        etguVar2.g = 1;
        etguVar2.b |= 8;
        String strValueOf2 = String.valueOf(Build.VERSION.SDK_INT);
        strValueOf2.getClass();
        etgrVar.copyOnWrite();
        etgu etguVar3 = (etgu) etgrVar.instance;
        etguVar3.b |= 16;
        etguVar3.h = strValueOf2;
        etgp etgpVar = (etgp) etgq.a.createBuilder();
        etgpVar.getClass();
        String str2 = Build.BRAND;
        str2.getClass();
        etgpVar.copyOnWrite();
        etgq etgqVar = (etgq) etgpVar.instance;
        etgqVar.b = 1 | etgqVar.b;
        etgqVar.c = str2;
        String str3 = Build.DISPLAY;
        str3.getClass();
        etgpVar.copyOnWrite();
        etgq etgqVar2 = (etgq) etgpVar.instance;
        etgqVar2.b |= 2;
        etgqVar2.d = str3;
        String str4 = Build.MODEL;
        str4.getClass();
        etgpVar.copyOnWrite();
        etgq etgqVar3 = (etgq) etgpVar.instance;
        etgqVar3.b = 4 | etgqVar3.b;
        etgqVar3.e = str4;
        evsn evsnVarBuild3 = etgpVar.build();
        evsnVarBuild3.getClass();
        etgrVar.copyOnWrite();
        etgu etguVar4 = (etgu) etgrVar.instance;
        etguVar4.d = (etgq) evsnVarBuild3;
        etguVar4.c = 7;
        String strE = fbdp.a.get().e();
        if (strE.length() != 0) {
            etgrVar.copyOnWrite();
            etgu etguVar5 = (etgu) etgrVar.instance;
            etguVar5.b |= 2;
            etguVar5.e = strE;
        }
        evsn evsnVarBuild4 = etgrVar.build();
        evsnVarBuild4.getClass();
        etgxVar.copyOnWrite();
        etgy etgyVar2 = (etgy) etgxVar.instance;
        etgyVar2.e = (etgu) evsnVarBuild4;
        etgyVar2.b |= 2;
        return etgv.a(etgxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0122, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.common.util.concurrent.ListenableFuture r8, defpackage.etgy r9, java.lang.String r10, defpackage.evje r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsoa.c(com.google.common.util.concurrent.ListenableFuture, etgy, java.lang.String, evje, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.evje r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dsny
            if (r0 == 0) goto L13
            r0 = r9
            dsny r0 = (defpackage.dsny) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsny r0 = new dsny
            r0.<init>(r7, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.fctl.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            evje r8 = r6.d
            defpackage.fctl.b(r9)
            goto L4c
        L39:
            defpackage.fctl.b(r9)
            dxva r9 = r7.s
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a()
            r6.d = r8
            r6.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r6)
            if (r9 == r0) goto La1
        L4c:
            r5 = r8
            com.google.android.gms.pseudonymous.PseudonymousIdToken r9 = (com.google.android.gms.pseudonymous.PseudonymousIdToken) r9
            java.lang.String r8 = r9.a
            if (r8 != 0) goto L68
            eksp r8 = defpackage.dsoa.a
            ekrw r8 = r8.j()
            eksl r8 = (defpackage.eksl) r8
            java.lang.String r9 = "Not syncing signed out user - token is null - can happen if device just started"
            r8.q(r9)
            dxfx r8 = new dxfx
            fctx r9 = defpackage.fctx.a
            r8.<init>(r9)
            return r8
        L68:
            dxgg r9 = r7.b
            r1 = 0
            java.lang.Object r9 = r9.a(r1)
            dski r9 = (defpackage.dski) r9
            com.google.common.util.concurrent.ListenableFuture r9 = r9.c()
            r9.getClass()
            etgy r3 = r7.b()
            evsf r3 = r3.toBuilder()
            etgx r3 = (defpackage.etgx) r3
            r3.getClass()
            r3.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r4 = r3.instance
            etgy r4 = (defpackage.etgy) r4
            r4.c = r8
            etgy r3 = defpackage.etgv.a(r3)
            r6.d = r1
            r6.c = r2
            r4 = 0
            r1 = r7
            r2 = r9
            java.lang.Object r8 = r1.c(r2, r3, r4, r5, r6)
            if (r8 != r0) goto La0
            goto La1
        La0:
            return r8
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsoa.d(evje, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dsnz
            if (r0 == 0) goto L13
            r0 = r5
            dsnz r0 = (defpackage.dsnz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsnz r0 = new dsnz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            com.google.common.util.concurrent.ListenableFuture r5 = r4.m
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            android.content.SharedPreferences$Editor r5 = r5.edit()
            android.content.Context r0 = r4.l
            java.lang.String r1 = "SYNC_LANGUAGE"
            java.lang.String r0 = defpackage.dsbe.a(r0)
            android.content.SharedPreferences$Editor r0 = r5.putString(r1, r0)
            diep r1 = r4.q
            j$.time.Instant r1 = r1.f()
            long r1 = r1.toEpochMilli()
            java.lang.String r3 = "LAST_SYNC_TIME"
            r0.putLong(r3, r1)
            r5.apply()
            dxfx r5 = new dxfx
            fctx r0 = defpackage.fctx.a
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsoa.e(fcxy):java.lang.Object");
    }
}
