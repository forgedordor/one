package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcq implements vch {
    public final fcsu a;
    public final dzuc b;
    public final fcsu c;
    public final fcyh d;
    public final fdjx e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final ekrg n;
    private final ejcf o;
    private final fcsu p;
    private final fdjx q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;

    public vcq(ejcf ejcfVar, fcsu fcsuVar, dzuc dzucVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar, fcyh fcyhVar, fdjx fdjxVar2, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16) {
        fcsuVar.getClass();
        dzucVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjxVar2.getClass();
        fcsuVar5.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        fcsuVar15.getClass();
        fcsuVar16.getClass();
        this.o = ejcfVar;
        this.a = fcsuVar;
        this.b = dzucVar;
        this.p = fcsuVar2;
        this.c = fcsuVar3;
        this.q = fdjxVar;
        this.d = fcyhVar;
        this.e = fdjxVar2;
        this.f = fcsuVar4;
        this.r = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.s = fcsuVar8;
        this.i = fcsuVar9;
        this.j = fcsuVar10;
        this.k = fcsuVar11;
        this.l = fcsuVar12;
        this.m = fcsuVar13;
        this.t = fcsuVar14;
        this.u = fcsuVar15;
        this.v = fcsuVar16;
        this.n = ekrg.c("com/google/android/apps/messaging/conversation/suggestions/smarterreplies/SmarterRepliesUiHandlerWithAccountImpl");
    }

    @Override // defpackage.vch
    public final eiju a(List list) {
        return auvw.c(this.q, fcyi.a, fdjz.a, new vco(this, list, null));
    }

    public final epix b(epix epixVar) {
        if (!((Boolean) this.s.b()).booleanValue() || epixVar.b.size() <= 0) {
            return epixVar;
        }
        try {
            evtg evtgVar = epixVar.b;
            evtgVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : evtgVar) {
                ezgi ezgiVar = (ezgi) obj;
                uwn uwnVar = (uwn) this.g.b();
                String str = (ezgiVar.c == 2 ? (ezgk) ezgiVar.d : ezgk.a).c;
                str.getClass();
                if (!uwnVar.a(str)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                epiw epiwVar = (epiw) epix.a.createBuilder();
                epiwVar.getClass();
                epiy.c(10, epiwVar);
                return epiy.a(epiwVar);
            }
            epiw epiwVar2 = (epiw) epix.a.createBuilder();
            epiwVar2.getClass();
            DesugarCollections.unmodifiableList(((epix) epiwVar2.instance).b).getClass();
            epiy.b(arrayList, epiwVar2);
            return epiy.a(epiwVar2);
        } catch (Exception e) {
            ekrw ekrwVarJ = this.n.j();
            ekrwVarJ.X(eksq.a, "BuglePenpal");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/conversation/suggestions/smarterreplies/SmarterRepliesUiHandlerWithAccountImpl", "filterSensitiveOutput", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "SmarterRepliesUiHandlerWithAccountImpl.kt")).q("Exception running sensitive classifier");
            if (!((Boolean) this.i.b()).booleanValue()) {
                return epixVar;
            }
            epiw epiwVar3 = (epiw) epix.a.createBuilder();
            epiwVar3.getClass();
            epiy.c(10, epiwVar3);
            return epiy.a(epiwVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ezdx r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.vci
            if (r0 == 0) goto L13
            r0 = r10
            vci r0 = (defpackage.vci) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vci r0 = new vci
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 3
            r7 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L3a
            if (r1 == r7) goto L36
            if (r1 != r2) goto L2e
            defpackage.fctl.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.fctl.b(r10)
            return r10
        L3a:
            ezdx r9 = r6.d
            defpackage.fctl.b(r10)
            goto L89
        L40:
            defpackage.fctl.b(r10)
            fcsu r10 = r8.u
            java.lang.Object r10 = r10.b()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L9b
            fcsu r10 = r8.f
            java.lang.Object r10 = r10.b()
            j$.util.Optional r10 = (j$.util.Optional) r10
            java.lang.Object r10 = r10.get()
            r1 = r10
            ejcj r1 = (defpackage.ejcj) r1
            cczi r10 = defpackage.crbf.be
            java.lang.Object r10 = r10.e()
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            int r10 = (int) r4
            fcsu r2 = r8.v
            java.lang.Object r2 = r2.b()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            r6.d = r9
            r6.c = r3
            r2 = r9
            r3 = r10
            java.lang.Object r10 = r1.b(r2, r3, r4, r6)
            if (r10 != r0) goto L89
            goto La3
        L89:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L9a
            r10 = 0
            r6.d = r10
            r6.c = r7
            java.lang.Object r9 = r8.d(r9, r6)
            if (r9 != r0) goto L99
            goto La3
        L99:
            return r9
        L9a:
            return r10
        L9b:
            r6.c = r2
            java.lang.Object r9 = r8.d(r9, r6)
            if (r9 != r0) goto La4
        La3:
            return r0
        La4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcq.c(ezdx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ezdx r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.vcj
            if (r0 == 0) goto L13
            r0 = r10
            vcj r0 = (defpackage.vcj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vcj r0 = new vcj
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r9 = r0.d
            defpackage.fctl.b(r10)
            goto L8d
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            defpackage.fctl.b(r10)
            fcsu r10 = r8.t
            java.lang.Object r2 = r10.b()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto Lc0
            java.lang.Object r10 = r10.b()
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L67
            fcsu r10 = r8.f
            java.lang.Object r10 = r10.b()
            j$.util.Optional r10 = (j$.util.Optional) r10
            java.lang.Object r10 = r10.get()
            ejcj r10 = (defpackage.ejcj) r10
            java.lang.String r9 = r10.e(r9)
            goto L79
        L67:
            fcsu r10 = r8.f
            java.lang.Object r10 = r10.b()
            j$.util.Optional r10 = (j$.util.Optional) r10
            java.lang.Object r10 = r10.get()
            ejcj r10 = (defpackage.ejcj) r10
            java.lang.String r9 = r10.f(r9)
        L79:
            fcsu r10 = r8.p
            java.lang.Object r10 = r10.b()
            vce r10 = (defpackage.vce) r10
            r0.d = r9
            r0.c = r3
            fdap r10 = r10.h
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 == r1) goto Lbf
        L8d:
            org.tensorflow.lite.support.text.tokenizers.SentencePieceTokenizer r10 = (org.tensorflow.lite.support.text.tokenizers.SentencePieceTokenizer) r10
            if (r10 == 0) goto Lbd
            boolean r0 = r10.b
            if (r0 == 0) goto L99
            java.lang.String r9 = r9.toLowerCase()
        L99:
            long r0 = r10.a
            java.lang.String[] r9 = r10.nativeTokenize(r0, r9)
            java.util.List r9 = java.util.Arrays.asList(r9)
            if (r9 == 0) goto Lbd
            fcsu r10 = r8.t
            int r9 = r9.size()
            java.lang.Object r10 = r10.b()
            java.lang.Number r10 = (java.lang.Number) r10
            long r0 = r10.longValue()
            int r10 = (int) r0
            int r9 = r9 + r10
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        Lbd:
            r9 = 0
            return r9
        Lbf:
            return r1
        Lc0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "promptTokenCount must be non-negative"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcq.d(ezdx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ezdx r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcq.e(ezdx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ezdx r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.vcl
            if (r0 == 0) goto L13
            r0 = r13
            vcl r0 = (defpackage.vcl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vcl r0 = new vcl
            r0.<init>(r11, r13)
        L18:
            r8 = r0
            java.lang.Object r13 = r8.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r13)
            goto L8b
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.fctl.b(r13)
            fcsu r13 = r11.f
            java.lang.Object r13 = r13.b()
            j$.util.Optional r13 = (j$.util.Optional) r13
            java.lang.Object r13 = r13.get()
            r1 = r13
            ejcj r1 = (defpackage.ejcj) r1
            cczi r13 = defpackage.crbf.be
            java.lang.Object r13 = r13.e()
            java.lang.Number r13 = (java.lang.Number) r13
            long r3 = r13.longValue()
            int r3 = (int) r3
            fcsu r13 = r11.r
            java.lang.Object r13 = r13.b()
            java.lang.Number r13 = (java.lang.Number) r13
            long r4 = r13.longValue()
            int r4 = (int) r4
            cczi r13 = defpackage.crbf.bf
            java.lang.Object r5 = r13.e()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r9 = 0
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L7f
            java.lang.Object r13 = r13.e()
            java.lang.Number r13 = (java.lang.Number) r13
            long r5 = r13.longValue()
            int r13 = (int) r5
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r13)
            goto L80
        L7f:
            r5 = 0
        L80:
            r8.c = r2
            r6 = 10
            r2 = r12
            java.lang.Object r13 = r1.d(r2, r3, r4, r5, r6, r8)
            if (r13 == r0) goto Lea
        L8b:
            java.util.List r13 = (java.util.List) r13
            epix r12 = defpackage.epix.a
            evsf r12 = r12.createBuilder()
            epiw r12 = (defpackage.epiw) r12
            r12.getClass()
            defpackage.epiy.d(r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r13, r1)
            r0.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        Laa:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Lde
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            ezgi r2 = defpackage.ezgi.a
            evsf r2 = r2.createBuilder()
            ezgh r2 = (defpackage.ezgh) r2
            r2.getClass()
            ezgk r3 = defpackage.ezgk.a
            evsf r3 = r3.createBuilder()
            ezgj r3 = (defpackage.ezgj) r3
            r3.getClass()
            defpackage.ezav.b(r1, r3)
            ezgk r1 = defpackage.ezav.a(r3)
            defpackage.ezau.d(r1, r2)
            ezgi r1 = defpackage.ezau.a(r2)
            r0.add(r1)
            goto Laa
        Lde:
            defpackage.epiy.b(r0, r12)
            r13 = 2
            defpackage.epiy.c(r13, r12)
            epix r12 = defpackage.epiy.a(r12)
            return r12
        Lea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcq.f(ezdx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r1 != r8) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00fa -> B:34:0x00fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ezdx r18, long r19, long r21, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcq.g(ezdx, long, long, fcxy):java.lang.Object");
    }
}
