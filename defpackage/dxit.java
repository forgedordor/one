package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxit implements dxif {
    public final fcsu b;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final Context j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fdjx n;
    private static final eksp c = eksp.c("GnpSdk");
    public static final Set a = fcwm.d(1, 2, 3);

    public dxit(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, Context context, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        context.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fdjxVar.getClass();
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = context;
        this.k = fcsuVar7;
        this.l = fcsuVar8;
        this.b = fcsuVar9;
        this.m = fcsuVar10;
        this.n = fdjxVar;
    }

    private final void k() {
        ejwi ejwiVar = (ejwi) ((eyig) this.l).a;
        if (ejwiVar.g()) {
            ((dxie) ejwiVar.c()).a();
        }
    }

    private final byte[] l(byte[] bArr, boolean z, dxid dxidVar) {
        fcsu fcsuVar = this.g;
        long epochMilli = ((diep) fcsuVar.b()).f().toEpochMilli();
        dxft dxftVarA = ((dxky) this.i.b()).a(bArr);
        ((ecog) ((dxtx) this.k.b()).e.get()).b(((diep) fcsuVar.b()).f().toEpochMilli() - epochMilli, this.j.getPackageName(), Boolean.valueOf(dxftVarA.g()));
        if (dxftVarA instanceof dxfx) {
            return (byte[]) ((dxfx) dxftVarA).a;
        }
        ((eksl) ((eksl) c.j()).g(dxftVarA.f())).q("Payload decompression failed.");
        int i = true != z ? 62 : 61;
        dxkt dxktVar = (dxkt) this.e.b();
        dxku dxkuVarA = ((dxkw) this.f.b()).a(i);
        evdg evdgVarK = dxidVar.k();
        evdgVarK.getClass();
        dxkuVarA.a(evdgVarK);
        dxktVar.a(dxkuVarA);
        return null;
    }

    private static final dxih m(dxid dxidVar, boolean z) {
        byte[] bArrDecode;
        evih evihVarA;
        eksp ekspVar = dxig.a;
        String strC = dxidVar.c();
        if (strC == null) {
            evihVarA = null;
        } else {
            try {
                bArrDecode = Base64.decode(strC, 1);
            } catch (IllegalArgumentException e) {
                ((eksl) ((eksl) dxig.a.i()).g(e)).q("Failed to decode payload string into bytes.");
                bArrDecode = null;
            }
            evihVarA = dxig.a(bArrDecode);
        }
        if (evihVarA != null) {
            return new dxih(evihVarA, true == z ? 3 : 1);
        }
        return null;
    }

    @Override // defpackage.dxhl
    public final void a(Intent intent, dxfy dxfyVar, long j) {
        dxfyVar.getClass();
        d(dxid.j(intent), dxfyVar, j);
    }

    @Override // defpackage.dxhl
    public final boolean b(Intent intent) {
        if (!fdbq.f("com.google.android.c2dm.intent.RECEIVE", intent.getAction())) {
            return false;
        }
        ekrw ekrwVarO = c.o();
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder("Extras: [\n");
        if (extras != null) {
            for (String str : extras.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(extras.get(str));
                sb.append('\n');
            }
        }
        sb.append("]");
        ekrwVarO.D("onReceive: %s \n %s", action, sb.toString());
        dxid dxidVarJ = dxid.j(intent);
        int i = ((dxib) dxidVarJ).b - 1;
        return (i == 0 || i == 1) ? dxidVarJ.l() : i == 2;
    }

    @Override // defpackage.dxif
    public final Object c(dxid dxidVar, dxfy dxfyVar, long j, fcxy fcxyVar) throws Throwable {
        Object objA;
        c.o().q("Handling an FCM message in the PushIntentHandler.");
        long jA = ((diep) this.g.b()).a();
        dxkt dxktVar = (dxkt) this.e.b();
        dxku dxkuVarB = ((dxkw) this.f.b()).b(34);
        evdg evdgVarK = dxidVar.k();
        evdgVarK.getClass();
        dxkuVarB.a(evdgVarK);
        ((dxkx) dxkuVarB).k = j;
        dxktVar.a(dxkuVarB);
        int i = ((dxib) dxidVar).b - 1;
        if (i == 0 || i == 1) {
            Object objG = g(dxidVar, dxfyVar, j, jA, fcxyVar);
            if (objG == fcyl.a) {
                return objG;
            }
        } else if (i == 2) {
            ejwi ejwiVar = (ejwi) ((eyig) this.b).a;
            if (ejwiVar.g() && (objA = ((dxfg) ejwiVar.c()).a()) == fcyl.a) {
                return objA;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.dxif
    public final void d(dxid dxidVar, dxfy dxfyVar, long j) {
        c.o().q("Handling an FCM message in the PushIntentHandler.");
        long jA = ((diep) this.g.b()).a();
        dxkt dxktVar = (dxkt) this.e.b();
        dxku dxkuVarB = ((dxkw) this.f.b()).b(34);
        evdg evdgVarK = dxidVar.k();
        evdgVarK.getClass();
        dxkuVarB.a(evdgVarK);
        ((dxkx) dxkuVarB).k = j;
        dxktVar.a(dxkuVarB);
        int i = ((dxib) dxidVar).b - 1;
        if (i == 0 || i == 1) {
        } else if (i == 2 && ((ejwi) ((eyig) this.b).a).g()) {
            fdim.a(fcyi.a, new dxiq(this, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.evqs r5, boolean r6, defpackage.dxid r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.dxij
            if (r0 == 0) goto L13
            r0 = r8
            dxij r0 = (defpackage.dxij) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dxij r0 = new dxij
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r6 = r0.a
            java.lang.Object r7 = r0.b
            defpackage.fctl.b(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r8)
            byte[] r5 = r5.I()
            r5.getClass()
            r0.b = r7
            r0.a = r6
            r0.e = r3
            java.lang.Object r8 = r4.i(r6, r7, r0)
            if (r8 == r1) goto L5f
        L49:
            byte[] r8 = (byte[]) r8
            r5 = 0
            if (r8 != 0) goto L4f
            return r5
        L4f:
            dxid r7 = (defpackage.dxid) r7
            byte[] r6 = r4.l(r8, r6, r7)
            if (r6 != 0) goto L58
            return r5
        L58:
            eksp r5 = defpackage.dxig.a
            evih r5 = defpackage.dxig.a(r6)
            return r5
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxit.e(evqs, boolean, dxid, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dxid r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxit.f(dxid, fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:118|141|119|120|143|121|122|145|123|(5:125|134|135|116|(2:136|137)(0))|138) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03c1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03c3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03ca, code lost:
    
        ((defpackage.eksl) ((defpackage.eksl) defpackage.dxit.c.j()).g(r0)).q("Error while waiting for SystemTrayPushHandler to complete.");
        r2 = defpackage.fctx.a;
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0169, code lost:
    
        if (r4.length() > 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0175, code lost:
    
        if (r4.length() <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0178, code lost:
    
        r2 = ((defpackage.dxkw) r20.f.b()).a(10);
        r3 = r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0186, code lost:
    
        if (r3 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0188, code lost:
    
        r3 = defpackage.evjg.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018a, code lost:
    
        r3.getClass();
        r2.c(r3);
        r3 = r14.k();
        r3.getClass();
        r2.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019e, code lost:
    
        if (defpackage.fbdc.b() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a0, code lost:
    
        r3 = (defpackage.dxkt) r20.e.b();
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01aa, code lost:
    
        if (r0 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ac, code lost:
    
        r0 = defpackage.evjx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ae, code lost:
    
        r0 = r0.d;
        r0.getClass();
        ((defpackage.dxkx) r2).l = r0;
        r3.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bc, code lost:
    
        r3 = (defpackage.dxkt) r20.e.b();
        r0 = r0.c;
        r0.getClass();
        ((defpackage.dxkx) r2).f = r0;
        r3.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d1, code lost:
    
        k();
        ((defpackage.eksl) defpackage.dxit.c.j()).q("Recipient was not found on the device for this user targeted notification.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        return defpackage.fctx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        if (r5 != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x03bf -> B:134:0x03dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.dxid r21, defpackage.dxfy r22, long r23, long r25, defpackage.fcxy r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxit.g(dxid, dxfy, long, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.dxid r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dxis
            if (r0 == 0) goto L13
            r0 = r6
            dxis r0 = (defpackage.dxis) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxis r0 = new dxis
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L27
            goto L73
        L27:
            r5 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            dxib r5 = (defpackage.dxib) r5
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L73
            fcsu r5 = r4.h
            eyig r5 = (defpackage.eyig) r5
            java.lang.Object r5 = r5.a
            ejwi r5 = (defpackage.ejwi) r5
            boolean r6 = r5.g()
            if (r6 == 0) goto L63
            java.lang.Object r5 = r5.c()     // Catch: java.lang.Exception -> L27
            dxlk r5 = (defpackage.dxlk) r5     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L73
            return r1
        L57:
            eksp r6 = defpackage.dxit.c
            ekrw r6 = r6.j()
            java.lang.String r0 = "Failed to save the key to invalidate in shared preferences."
            defpackage.a.N(r6, r0, r5)
            goto L73
        L63:
            eksp r5 = defpackage.dxit.c
            ekrw r5 = r5.i()
            eksl r5 = (defpackage.eksl) r5
            java.lang.String r6 = "Can't save key to invalidate because GnpEncryptionManager is missing."
            r5.q(r6)
            fctx r5 = defpackage.fctx.a
            return r5
        L73:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxit.h(dxid, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(boolean r17, defpackage.dxid r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxit.i(boolean, dxid, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r9.a(r7, r6, r8, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e9, code lost:
    
        if (r7.d() == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.evih r6, defpackage.dxhe r7, defpackage.dxid r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxit.j(evih, dxhe, dxid, fcxy):java.lang.Object");
    }
}
