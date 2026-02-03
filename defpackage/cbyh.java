package defpackage;

import android.content.Context;
import com.sun.jna.Memory;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbyh implements cbum {
    public static final /* synthetic */ int e = 0;
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClient");
    private static final feav g = new feaz();
    public final ccpl a;
    public final epvr b;
    public final cbvk c;
    public final ahmf d;
    private final Context h;
    private final fcyh i;
    private final fcsu j;
    private final boolean k;
    private final fcsu l;
    private final ccos m;
    private final fcsu n;
    private final fcsu o;
    private final cbwm p;
    private fdhz q;
    private final cbwt r;
    private final ahmy s;
    private final ahko t;
    private final ahjz u;

    public cbyh(Context context, fcyh fcyhVar, ahmf ahmfVar, fcsu fcsuVar, ccpl ccplVar, epvr epvrVar, boolean z, fcsu fcsuVar2, ahmy ahmyVar, ahkh ahkhVar, ccos ccosVar, fcsu fcsuVar3, ahko ahkoVar, fcsu fcsuVar4, cbwm cbwmVar, ahjz ahjzVar) {
        context.getClass();
        fcyhVar.getClass();
        ahmfVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        ahmyVar.getClass();
        ahkhVar.getClass();
        fcsuVar3.getClass();
        ahkoVar.getClass();
        fcsuVar4.getClass();
        ahjzVar.getClass();
        this.h = context;
        this.i = fcyhVar;
        this.d = ahmfVar;
        this.j = fcsuVar;
        this.a = ccplVar;
        this.b = epvrVar;
        this.k = z;
        this.l = fcsuVar2;
        this.s = ahmyVar;
        this.m = ccosVar;
        this.n = fcsuVar3;
        this.t = ahkoVar;
        this.o = fcsuVar4;
        this.p = cbwmVar;
        this.u = ahjzVar;
        fdia fdiaVar = fdia.a;
        this.q = new fdhz(null, fdiaVar);
        cbwt cbwtVar = new cbwt(new fdhz(null, fdiaVar));
        this.r = cbwtVar;
        this.c = new cbwa(cbwtVar);
    }

    @Override // defpackage.cbum
    public final epvv a(byte[] bArr) throws Throwable {
        Object objA;
        this.j.b();
        eqbi eqbiVar = eqbh.a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        fcti fctiVarC = epzk.c(bArrCopyOf);
        Memory memory = (Memory) fctiVarC.a;
        epzp epzpVarZinnia_TlsStructConverter_convert_from_serialized_tls_to_commit_list = eqbh.a.Zinnia_TlsStructConverter_convert_from_serialized_tls_to_commit_list((eqau) fctiVarC.b);
        if (epzpVarZinnia_TlsStructConverter_convert_from_serialized_tls_to_commit_list.isOk == 1) {
            eqam eqamVar = new eqam(epzpVarZinnia_TlsStructConverter_convert_from_serialized_tls_to_commit_list.union.ok);
            eqamVar.a();
            objA = eqamVar;
            if (memory != null) {
                memory.close();
                objA = eqamVar;
            }
        } else {
            eqbs eqbsVar = new eqbs(epzpVarZinnia_TlsStructConverter_convert_from_serialized_tls_to_commit_list.union.err);
            eqbsVar.b();
            if (memory != null) {
                memory.close();
            }
            objA = fctl.a(eqbsVar);
        }
        fctl.b(objA);
        byte[] bArrB = ((eqam) objA).b();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
        bArrCopyOf2.getClass();
        epvv epvvVar = (epvv) evsn.parseFrom(epvv.a, bArrCopyOf2);
        epvvVar.getClass();
        return epvvVar;
    }

    @Override // defpackage.cbum
    public final epwj b(byte[] bArr) throws Throwable {
        Object objA;
        this.j.b();
        eqbi eqbiVar = eqbh.a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        fcti fctiVarC = epzk.c(bArrCopyOf);
        Memory memory = (Memory) fctiVarC.a;
        epzp epzpVarZinnia_TlsStructConverter_convert_from_serialized_tls_to_proposal_list = eqbh.a.Zinnia_TlsStructConverter_convert_from_serialized_tls_to_proposal_list((eqau) fctiVarC.b);
        if (epzpVarZinnia_TlsStructConverter_convert_from_serialized_tls_to_proposal_list.isOk == 1) {
            eqam eqamVar = new eqam(epzpVarZinnia_TlsStructConverter_convert_from_serialized_tls_to_proposal_list.union.ok);
            eqamVar.a();
            objA = eqamVar;
            if (memory != null) {
                memory.close();
                objA = eqamVar;
            }
        } else {
            eqbs eqbsVar = new eqbs(epzpVarZinnia_TlsStructConverter_convert_from_serialized_tls_to_proposal_list.union.err);
            eqbsVar.b();
            if (memory != null) {
                memory.close();
            }
            objA = fctl.a(eqbsVar);
        }
        fctl.b(objA);
        byte[] bArrB = ((eqam) objA).b();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
        bArrCopyOf2.getClass();
        epwj epwjVar = (epwj) evsn.parseFrom(epwj.a, bArrCopyOf2);
        epwjVar.getClass();
        return epwjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ccep r11, java.util.List r12, defpackage.enba r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.cbwx
            if (r0 == 0) goto L13
            r0 = r14
            cbwx r0 = (defpackage.cbwx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbwx r0 = new cbwx
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            enba r13 = r0.f
            java.lang.Object r12 = r0.a
            ccep r11 = r0.e
            defpackage.fctl.b(r14)
            goto L4d
        L3c:
            defpackage.fctl.b(r14)
            r0.e = r11
            r0.a = r12
            r0.f = r13
            r0.d = r4
            java.lang.Object r14 = r10.w(r0)
            if (r14 == r1) goto L70
        L4d:
            r7 = r11
            r8 = r12
            r9 = r13
            cbvk r14 = (defpackage.cbvk) r14
            fcyh r11 = r10.i
            fcyh r11 = defpackage.eicg.a(r11)
            cbww r4 = new cbww
            r5 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r12 = 0
            r0.e = r12
            r0.a = r12
            r0.f = r12
            r0.d = r3
            java.lang.Object r11 = defpackage.fdin.a(r11, r4, r0)
            if (r11 != r1) goto L6f
            goto L70
        L6f:
            return r11
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.c(ccep, java.util.List, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ccep r6, defpackage.enba r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cbwz
            if (r0 == 0) goto L13
            r0 = r8
            cbwz r0 = (defpackage.cbwz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbwz r0 = new cbwz
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            enba r7 = r0.e
            ccep r6 = r0.d
            defpackage.fctl.b(r8)
            goto L49
        L3a:
            defpackage.fctl.b(r8)
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = r5.w(r0)
            if (r8 == r1) goto L65
        L49:
            cbvk r8 = (defpackage.cbvk) r8
            fcyh r8 = r5.i
            fcyh r8 = defpackage.eicg.a(r8)
            cbwy r2 = new cbwy
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.d = r4
            r0.e = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r8, r2, r0)
            if (r6 != r1) goto L64
            goto L65
        L64:
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.d(ccep, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cbwd r13, defpackage.ccep r14, defpackage.basd r15, defpackage.ccct r16, defpackage.enba r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.cbxb
            if (r1 == 0) goto L15
            r1 = r0
            cbxb r1 = (defpackage.cbxb) r1
            int r3 = r1.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.c = r3
            goto L1a
        L15:
            cbxb r1 = new cbxb
            r1.<init>(r12, r0)
        L1a:
            r8 = r1
            java.lang.Object r0 = r8.a
            fcyl r9 = defpackage.fcyl.a
            int r1 = r8.c
            r10 = 2
            r3 = 1
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L35
            if (r1 != r10) goto L2d
            defpackage.fctl.b(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            enba r1 = r8.h
            ccct r3 = r8.g
            basd r4 = r8.f
            ccep r5 = r8.e
            cbwd r6 = r8.d
            defpackage.fctl.b(r0)
            r7 = r6
            r6 = r3
            r3 = r7
            r7 = r5
            r5 = r4
            r4 = r7
            r7 = r1
            goto L70
        L4a:
            defpackage.fctl.b(r0)
            boolean r0 = r15.k()
            if (r0 == 0) goto L93
            r8.d = r13
            r8.e = r14
            r8.f = r15
            r5 = r16
            r8.g = r5
            r6 = r17
            r8.h = r6
            r8.c = r3
            java.lang.Object r3 = r12.w(r8)
            if (r3 != r9) goto L6a
            goto L91
        L6a:
            r4 = r14
            r0 = r3
            r7 = r6
            r3 = r13
            r6 = r5
            r5 = r15
        L70:
            cbvk r0 = (defpackage.cbvk) r0
            fcyh r0 = r12.i
            fcyh r11 = defpackage.eicg.a(r0)
            cbxa r0 = new cbxa
            r1 = 0
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r1
            r8.e = r1
            r8.f = r1
            r8.g = r1
            r8.h = r1
            r8.c = r10
            java.lang.Object r0 = defpackage.fdin.a(r11, r0, r8)
            if (r0 != r9) goto L92
        L91:
            return r9
        L92:
            return r0
        L93:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "MessageId is empty."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.e(cbwd, ccep, basd, ccct, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ccep r11, defpackage.eprw r12, defpackage.enba r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.cbxd
            if (r0 == 0) goto L13
            r0 = r14
            cbxd r0 = (defpackage.cbxd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbxd r0 = new cbxd
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            enba r13 = r0.f
            eprw r12 = r0.e
            ccep r11 = r0.d
            defpackage.fctl.b(r14)
            goto L4d
        L3c:
            defpackage.fctl.b(r14)
            r0.d = r11
            r0.e = r12
            r0.f = r13
            r0.c = r4
            java.lang.Object r14 = r10.w(r0)
            if (r14 == r1) goto L70
        L4d:
            r7 = r11
            r8 = r12
            r9 = r13
            cbvk r14 = (defpackage.cbvk) r14
            fcyh r11 = r10.i
            fcyh r11 = defpackage.eicg.a(r11)
            cbxc r4 = new cbxc
            r5 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r12 = 0
            r0.d = r12
            r0.e = r12
            r0.f = r12
            r0.c = r3
            java.lang.Object r11 = defpackage.fdin.a(r11, r4, r0)
            if (r11 != r1) goto L6f
            goto L70
        L6f:
            return r11
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.f(ccep, eprw, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ccep r11, defpackage.epsb r12, defpackage.enba r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.cbxf
            if (r0 == 0) goto L13
            r0 = r14
            cbxf r0 = (defpackage.cbxf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbxf r0 = new cbxf
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            enba r13 = r0.f
            epsb r12 = r0.e
            ccep r11 = r0.d
            defpackage.fctl.b(r14)
            goto L4d
        L3c:
            defpackage.fctl.b(r14)
            r0.d = r11
            r0.e = r12
            r0.f = r13
            r0.c = r4
            java.lang.Object r14 = r10.w(r0)
            if (r14 == r1) goto L70
        L4d:
            r7 = r11
            r8 = r12
            r9 = r13
            cbvk r14 = (defpackage.cbvk) r14
            fcyh r11 = r10.i
            fcyh r11 = defpackage.eicg.a(r11)
            cbxe r4 = new cbxe
            r5 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r12 = 0
            r0.d = r12
            r0.e = r12
            r0.f = r12
            r0.c = r3
            java.lang.Object r11 = defpackage.fdin.a(r11, r4, r0)
            if (r11 != r1) goto L6f
            goto L70
        L6f:
            return r11
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.g(ccep, epsb, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ccep r6, defpackage.enba r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cbxh
            if (r0 == 0) goto L13
            r0 = r8
            cbxh r0 = (defpackage.cbxh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbxh r0 = new cbxh
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            enba r7 = r0.e
            ccep r6 = r0.d
            defpackage.fctl.b(r8)
            goto L49
        L3a:
            defpackage.fctl.b(r8)
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = r5.w(r0)
            if (r8 == r1) goto L65
        L49:
            cbvk r8 = (defpackage.cbvk) r8
            fcyh r8 = r5.i
            fcyh r8 = defpackage.eicg.a(r8)
            cbxg r2 = new cbxg
            r4 = 0
            r2.<init>(r4, r5, r7, r6)
            r0.d = r4
            r0.e = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r8, r2, r0)
            if (r6 != r1) goto L64
            goto L65
        L64:
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.h(ccep, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r6, defpackage.enba r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cbxj
            if (r0 == 0) goto L13
            r0 = r8
            cbxj r0 = (defpackage.cbxj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbxj r0 = new cbxj
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.a
            enba r7 = r0.e
            defpackage.fctl.b(r8)
            goto L4c
        L3a:
            defpackage.fctl.b(r8)
            if (r6 < 0) goto L66
            r0.e = r7
            r0.a = r6
            r0.d = r4
            java.lang.Object r8 = r5.w(r0)
            if (r8 != r1) goto L4c
            goto L64
        L4c:
            cbvk r8 = (defpackage.cbvk) r8
            fcyh r8 = r5.i
            fcyh r8 = defpackage.eicg.a(r8)
            cbxi r2 = new cbxi
            r4 = 0
            r2.<init>(r4, r5, r7, r6)
            r0.e = r4
            r0.d = r3
            java.lang.Object r6 = defpackage.fdin.a(r8, r2, r0)
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            return r6
        L66:
            java.lang.String r7 = "Count needs to be non-negative: "
            java.lang.String r6 = defpackage.a.g(r6, r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.i(int, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cbxk
            if (r0 == 0) goto L13
            r0 = r5
            cbxk r0 = (defpackage.cbxk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbxk r0 = new cbxk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.w(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            cbvk r5 = (defpackage.cbvk) r5
            cbvk r5 = r4.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.j(fcxy):java.lang.Object");
    }

    @Override // defpackage.cbum
    public final Object k(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.i), new cbxm(null, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ccep r11, defpackage.epti r12, defpackage.enba r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.cbxo
            if (r0 == 0) goto L13
            r0 = r14
            cbxo r0 = (defpackage.cbxo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbxo r0 = new cbxo
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            enba r13 = r0.f
            epti r12 = r0.e
            ccep r11 = r0.d
            defpackage.fctl.b(r14)
            goto L4d
        L3c:
            defpackage.fctl.b(r14)
            r0.d = r11
            r0.e = r12
            r0.f = r13
            r0.c = r4
            java.lang.Object r14 = r10.w(r0)
            if (r14 == r1) goto L70
        L4d:
            r7 = r11
            r8 = r12
            r9 = r13
            cbvk r14 = (defpackage.cbvk) r14
            fcyh r11 = r10.i
            fcyh r11 = defpackage.eicg.a(r11)
            cbxn r4 = new cbxn
            r5 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r12 = 0
            r0.d = r12
            r0.e = r12
            r0.f = r12
            r0.c = r3
            java.lang.Object r11 = defpackage.fdin.a(r11, r4, r0)
            if (r11 != r1) goto L6f
            goto L70
        L6f:
            return r11
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.l(ccep, epti, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.cbwd r12, java.util.List r13, defpackage.evqs r14, defpackage.enba r15, defpackage.fcxy r16) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof defpackage.cbxq
            if (r1 == 0) goto L15
            r1 = r0
            cbxq r1 = (defpackage.cbxq) r1
            int r3 = r1.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.e = r3
            goto L1a
        L15:
            cbxq r1 = new cbxq
            r1.<init>(r11, r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.c
            fcyl r8 = defpackage.fcyl.a
            int r1 = r7.e
            r9 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L35
            if (r1 != r9) goto L2d
            defpackage.fctl.b(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            enba r1 = r7.g
            java.lang.Object r3 = r7.b
            java.lang.Object r4 = r7.a
            cbwd r5 = r7.f
            defpackage.fctl.b(r0)
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r5
            goto L5d
        L45:
            defpackage.fctl.b(r0)
            r7.f = r12
            r7.a = r13
            r7.b = r14
            r7.g = r15
            r7.e = r3
            java.lang.Object r3 = r11.w(r7)
            if (r3 == r8) goto L82
            r4 = r13
            r0 = r14
            r6 = r15
            r1 = r3
            r3 = r12
        L5d:
            cbvk r1 = (defpackage.cbvk) r1
            fcyh r1 = r11.i
            fcyh r10 = defpackage.eicg.a(r1)
            r1 = r0
            cbxp r0 = new cbxp
            r5 = r1
            r1 = 0
            evqs r5 = (defpackage.evqs) r5
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f = r1
            r7.a = r1
            r7.b = r1
            r7.g = r1
            r7.e = r9
            java.lang.Object r0 = defpackage.fdin.a(r10, r0, r7)
            if (r0 != r8) goto L81
            goto L82
        L81:
            return r0
        L82:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.m(cbwd, java.util.List, evqs, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.cbwd r13, defpackage.cchc r14, defpackage.epsb r15, int r16, defpackage.enba r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.cbxs
            if (r1 == 0) goto L15
            r1 = r0
            cbxs r1 = (defpackage.cbxs) r1
            int r3 = r1.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.d = r3
            goto L1a
        L15:
            cbxs r1 = new cbxs
            r1.<init>(r12, r0)
        L1a:
            r8 = r1
            java.lang.Object r0 = r8.b
            fcyl r9 = defpackage.fcyl.a
            int r1 = r8.d
            r10 = 2
            r3 = 1
            if (r1 == 0) goto L49
            if (r1 == r3) goto L35
            if (r1 != r10) goto L2d
            defpackage.fctl.b(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            int r1 = r8.a
            enba r3 = r8.h
            epsb r4 = r8.g
            cchc r5 = r8.f
            cbwd r6 = r8.e
            defpackage.fctl.b(r0)
            r7 = r5
            r5 = r4
            r4 = r7
            r7 = r3
            r3 = r6
            r6 = r1
            goto L67
        L49:
            defpackage.fctl.b(r0)
            r8.e = r13
            r8.f = r14
            r8.g = r15
            r5 = r17
            r8.h = r5
            r6 = r16
            r8.a = r6
            r8.d = r3
            java.lang.Object r3 = r12.w(r8)
            if (r3 == r9) goto L88
            r4 = r14
            r0 = r3
            r7 = r5
            r3 = r13
            r5 = r15
        L67:
            cbvk r0 = (defpackage.cbvk) r0
            fcyh r0 = r12.i
            fcyh r11 = defpackage.eicg.a(r0)
            cbxr r0 = new cbxr
            r1 = 0
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.e = r1
            r8.f = r1
            r8.g = r1
            r8.h = r1
            r8.d = r10
            java.lang.Object r0 = defpackage.fdin.a(r11, r0, r8)
            if (r0 != r9) goto L87
            goto L88
        L87:
            return r0
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.n(cbwd, cchc, epsb, int, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.cbwd r6, defpackage.eyxu r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cbxu
            if (r0 == 0) goto L13
            r0 = r8
            cbxu r0 = (defpackage.cbxu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbxu r0 = new cbxu
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            eyxu r7 = r0.e
            cbwd r6 = r0.d
            defpackage.fctl.b(r8)
            goto L49
        L3a:
            defpackage.fctl.b(r8)
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = r5.w(r0)
            if (r8 == r1) goto L65
        L49:
            cbvk r8 = (defpackage.cbvk) r8
            fcyh r8 = r5.i
            fcyh r8 = defpackage.eicg.a(r8)
            cbxt r2 = new cbxt
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.d = r4
            r0.e = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r8, r2, r0)
            if (r6 != r1) goto L64
            goto L65
        L64:
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.o(cbwd, eyxu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.cbwd r15, defpackage.cchc r16, int r17, defpackage.evqs r18, defpackage.aubq r19, defpackage.enba r20, defpackage.basd r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r22
            boolean r1 = r0 instanceof defpackage.cbxw
            if (r1 == 0) goto L15
            r1 = r0
            cbxw r1 = (defpackage.cbxw) r1
            int r3 = r1.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.e = r3
            goto L1a
        L15:
            cbxw r1 = new cbxw
            r1.<init>(r14, r0)
        L1a:
            r10 = r1
            java.lang.Object r0 = r10.c
            fcyl r11 = defpackage.fcyl.a
            int r1 = r10.e
            r12 = 2
            r3 = 1
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L35
            if (r1 != r12) goto L2d
            defpackage.fctl.b(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            int r1 = r10.b
            basd r3 = r10.j
            enba r4 = r10.i
            aubq r5 = r10.h
            java.lang.Object r6 = r10.a
            cchc r7 = r10.g
            cbwd r8 = r10.f
            defpackage.fctl.b(r0)
            r9 = r3
            r3 = r8
            r8 = r4
            r4 = r7
            r7 = r5
            r5 = r1
            goto L7a
        L4d:
            defpackage.fctl.b(r0)
            r10.f = r15
            r1 = r16
            r10.g = r1
            r4 = r18
            r10.a = r4
            r5 = r19
            r10.h = r5
            r6 = r20
            r10.i = r6
            r7 = r21
            r10.j = r7
            r8 = r17
            r10.b = r8
            r10.e = r3
            java.lang.Object r3 = r14.w(r10)
            if (r3 == r11) goto La1
            r0 = r3
            r9 = r7
            r3 = r15
            r7 = r5
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r1
        L7a:
            cbvk r0 = (defpackage.cbvk) r0
            fcyh r0 = r14.i
            fcyh r13 = defpackage.eicg.a(r0)
            cbxv r0 = new cbxv
            r1 = 0
            evqs r6 = (defpackage.evqs) r6
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f = r1
            r10.g = r1
            r10.a = r1
            r10.h = r1
            r10.i = r1
            r10.j = r1
            r10.e = r12
            java.lang.Object r0 = defpackage.fdin.a(r13, r0, r10)
            if (r0 != r11) goto La0
            goto La1
        La0:
            return r0
        La1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.p(cbwd, cchc, int, evqs, aubq, enba, basd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.cbwd r14, defpackage.cchc r15, defpackage.eprw r16, defpackage.ccep r17, int r18, defpackage.enba r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r20
            boolean r1 = r0 instanceof defpackage.cbxy
            if (r1 == 0) goto L15
            r1 = r0
            cbxy r1 = (defpackage.cbxy) r1
            int r3 = r1.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.d = r3
            goto L1a
        L15:
            cbxy r1 = new cbxy
            r1.<init>(r13, r0)
        L1a:
            r9 = r1
            java.lang.Object r0 = r9.b
            fcyl r10 = defpackage.fcyl.a
            int r1 = r9.d
            r11 = 2
            r3 = 1
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L35
            if (r1 != r11) goto L2d
            defpackage.fctl.b(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            int r1 = r9.a
            enba r3 = r9.i
            ccep r4 = r9.h
            eprw r5 = r9.g
            cchc r6 = r9.f
            cbwd r7 = r9.e
            defpackage.fctl.b(r0)
            r8 = r6
            r6 = r4
            r4 = r8
            r8 = r3
            r3 = r7
            r7 = r1
            goto L70
        L4b:
            defpackage.fctl.b(r0)
            r9.e = r14
            r9.f = r15
            r4 = r16
            r9.g = r4
            r5 = r17
            r9.h = r5
            r6 = r19
            r9.i = r6
            r7 = r18
            r9.a = r7
            r9.d = r3
            java.lang.Object r3 = r13.w(r9)
            if (r3 == r10) goto L93
            r0 = r3
            r8 = r6
            r3 = r14
            r6 = r5
            r5 = r4
            r4 = r15
        L70:
            cbvk r0 = (defpackage.cbvk) r0
            fcyh r0 = r13.i
            fcyh r12 = defpackage.eicg.a(r0)
            cbxx r0 = new cbxx
            r1 = 0
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.e = r1
            r9.f = r1
            r9.g = r1
            r9.h = r1
            r9.i = r1
            r9.d = r11
            java.lang.Object r0 = defpackage.fdin.a(r12, r0, r9)
            if (r0 != r10) goto L92
            goto L93
        L92:
            return r0
        L93:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.q(cbwd, cchc, eprw, ccep, int, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.cbwd r13, defpackage.cchc r14, defpackage.eprw r15, int r16, defpackage.enba r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.cbya
            if (r1 == 0) goto L15
            r1 = r0
            cbya r1 = (defpackage.cbya) r1
            int r3 = r1.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.d = r3
            goto L1a
        L15:
            cbya r1 = new cbya
            r1.<init>(r12, r0)
        L1a:
            r8 = r1
            java.lang.Object r0 = r8.b
            fcyl r9 = defpackage.fcyl.a
            int r1 = r8.d
            r10 = 2
            r3 = 1
            if (r1 == 0) goto L49
            if (r1 == r3) goto L35
            if (r1 != r10) goto L2d
            defpackage.fctl.b(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            int r1 = r8.a
            enba r3 = r8.h
            eprw r4 = r8.g
            cchc r5 = r8.f
            cbwd r6 = r8.e
            defpackage.fctl.b(r0)
            r7 = r5
            r5 = r4
            r4 = r7
            r7 = r3
            r3 = r6
            r6 = r1
            goto L67
        L49:
            defpackage.fctl.b(r0)
            r8.e = r13
            r8.f = r14
            r8.g = r15
            r5 = r17
            r8.h = r5
            r6 = r16
            r8.a = r6
            r8.d = r3
            java.lang.Object r3 = r12.w(r8)
            if (r3 == r9) goto L88
            r4 = r14
            r0 = r3
            r7 = r5
            r3 = r13
            r5 = r15
        L67:
            cbvk r0 = (defpackage.cbvk) r0
            fcyh r0 = r12.i
            fcyh r11 = defpackage.eicg.a(r0)
            cbxz r0 = new cbxz
            r1 = 0
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.e = r1
            r8.f = r1
            r8.g = r1
            r8.h = r1
            r8.d = r10
            java.lang.Object r0 = defpackage.fdin.a(r11, r0, r8)
            if (r0 != r9) goto L87
            goto L88
        L87:
            return r0
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.r(cbwd, cchc, eprw, int, enba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbyc
            if (r0 == 0) goto L13
            r0 = r6
            cbyc r0 = (defpackage.cbyc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbyc r0 = new cbyc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.i
            fcyh r6 = defpackage.eicg.a(r6)
            cbyb r2 = new cbyb
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            cbvk r6 = (defpackage.cbvk) r6
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.s(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (defpackage.fdin.a(r7, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.enba r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cbyf
            if (r0 == 0) goto L13
            r0 = r7
            cbyf r0 = (defpackage.cbyf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbyf r0 = new cbyf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            enba r6 = r0.d
            defpackage.fctl.b(r7)
            goto L45
        L38:
            defpackage.fctl.b(r7)
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = r5.w(r0)
            if (r7 == r1) goto L61
        L45:
            cbvk r7 = (defpackage.cbvk) r7
            fcyh r7 = r5.i
            fcyh r7 = defpackage.eicg.a(r7)
            cbye r2 = new cbye
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r7, r2, r0)
            if (r6 != r1) goto L5e
            goto L61
        L5e:
            fctx r6 = defpackage.fctx.a
            return r6
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.t(enba, fcxy):java.lang.Object");
    }

    @Override // defpackage.cbum
    public final byte[] u(epws epwsVar) throws Throwable {
        Object objA;
        this.j.b();
        eqbi eqbiVar = eqbh.a;
        byte[] byteArray = epwsVar.toByteArray();
        byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
        bArrCopyOf.getClass();
        fcti fctiVarC = epzk.c(bArrCopyOf);
        Memory memory = (Memory) fctiVarC.a;
        epzp epzpVarZinnia_TlsStructConverter_convert_to_serialized_tls = eqbh.a.Zinnia_TlsStructConverter_convert_to_serialized_tls((eqau) fctiVarC.b);
        if (epzpVarZinnia_TlsStructConverter_convert_to_serialized_tls.isOk == 1) {
            eqam eqamVar = new eqam(epzpVarZinnia_TlsStructConverter_convert_to_serialized_tls.union.ok);
            eqamVar.a();
            objA = eqamVar;
            if (memory != null) {
                memory.close();
                objA = eqamVar;
            }
        } else {
            eqbs eqbsVar = new eqbs(epzpVarZinnia_TlsStructConverter_convert_to_serialized_tls.union.err);
            eqbsVar.b();
            if (memory != null) {
                memory.close();
            }
            objA = fctl.a(eqbsVar);
        }
        fctl.b(objA);
        byte[] bArrB = ((eqam) objA).b();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
        bArrCopyOf2.getClass();
        return bArrCopyOf2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6 A[PHI: r4 r9
      0x00e6: PHI (r4v10 ccio) = (r4v9 ccio), (r4v5 ccio), (r4v32 ccio) binds: [B:28:0x00e4, B:26:0x00b2, B:18:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r9v4 ccil) = (r9v3 ccil), (r9v3 ccil), (r9v12 ccil) binds: [B:28:0x00e4, B:26:0x00b2, B:18:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x049e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.v(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cbxl
            if (r0 == 0) goto L13
            r0 = r7
            cbxl r0 = (defpackage.cbxl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbxl r0 = new cbxl
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            feaz r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L75
        L2c:
            r7 = move-exception
            goto L82
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            feaz r2 = r0.d
            defpackage.fctl.b(r7)
            r7 = r2
            goto L5a
        L3d:
            defpackage.fctl.b(r7)
            cbwt r7 = r6.r
            boolean r7 = r7.b()
            if (r7 == 0) goto L4b
            cbvk r7 = r6.c
            return r7
        L4b:
            feav r7 = defpackage.cbyh.g
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L86
        L5a:
            cbwt r2 = r6.r     // Catch: java.lang.Throwable -> L7e
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L65
            cbvk r0 = r6.c     // Catch: java.lang.Throwable -> L7e
            goto L7a
        L65:
            r2 = r7
            feaz r2 = (defpackage.feaz) r2     // Catch: java.lang.Throwable -> L7e
            r0.d = r2     // Catch: java.lang.Throwable -> L7e
            r0.c = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r6.y(r0)     // Catch: java.lang.Throwable -> L7e
            if (r0 == r1) goto L86
            r5 = r0
            r0 = r7
            r7 = r5
        L75:
            cbvk r7 = (defpackage.cbvk) r7     // Catch: java.lang.Throwable -> L2c
            r5 = r0
            r0 = r7
            r7 = r5
        L7a:
            r7.d()
            return r0
        L7e:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L82:
            r0.d()
            throw r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.w(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cbyd
            if (r0 == 0) goto L13
            r0 = r7
            cbyd r0 = (defpackage.cbyd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbyd r0 = new cbyd
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            feaz r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5f
        L2c:
            r7 = move-exception
            goto L69
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            feaz r2 = r0.d
            defpackage.fctl.b(r7)
            r7 = r2
            goto L4f
        L3d:
            defpackage.fctl.b(r7)
            feav r7 = defpackage.cbyh.g
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L6d
        L4f:
            r2 = r7
            feaz r2 = (defpackage.feaz) r2     // Catch: java.lang.Throwable -> L65
            r0.d = r2     // Catch: java.lang.Throwable -> L65
            r0.c = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r6.y(r0)     // Catch: java.lang.Throwable -> L65
            if (r0 == r1) goto L6d
            r5 = r0
            r0 = r7
            r7 = r5
        L5f:
            cbvk r7 = (defpackage.cbvk) r7     // Catch: java.lang.Throwable -> L2c
            r0.d()
            return r7
        L65:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L69:
            r0.d()
            throw r7
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.x(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbyg
            if (r0 == 0) goto L13
            r0 = r6
            cbyg r0 = (defpackage.cbyg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbyg r0 = new cbyg
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            ahko r1 = r0.g
            ahjz r2 = r0.f
            cbwm r3 = r0.e
            cbyh r0 = r0.d
            defpackage.fctl.b(r6)
            goto L54
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            defpackage.fctl.b(r6)
            cbwm r6 = r5.p
            ahjz r2 = r5.u
            ahko r4 = r5.t
            r0.d = r5
            r0.e = r6
            r0.f = r2
            r0.g = r4
            r0.c = r3
            java.lang.Object r0 = r5.v(r0)
            if (r0 == r1) goto L9c
            r3 = r6
            r6 = r0
            r1 = r4
            r0 = r5
        L54:
            ahmz r1 = r1.a
            ahkn r1 = r1.a
            eqca r6 = (defpackage.eqca) r6
            cbyx r4 = new cbyx
            ahnh r1 = r1.a
            eyik r1 = r1.uc
            r4.<init>(r1, r6)
            ahkm r6 = r2.a
            ahkn r6 = r6.a
            cbuj r1 = new cbuj
            eyik r6 = r6.nG
            java.lang.Object r6 = r6.b()
            cbui r6 = (defpackage.cbui) r6
            r1.<init>(r6, r4)
            dqsn r6 = r3.a
            cbwa r2 = new cbwa
            cbwn r3 = new cbwn
            r3.<init>(r6, r1)
            r2.<init>(r3)
            fdia r6 = defpackage.fdia.a
            fdhz r1 = new fdhz
            r1.<init>(r2, r6)
            r0.q = r1
            cbwt r6 = r5.r
            fdhz r0 = r5.q
            java.lang.Object r0 = r0.a
            r0.getClass()
            fdhz r6 = r6.a
            cbvk r0 = (defpackage.cbvk) r0
            r6.c(r0)
            cbvk r6 = r5.c
            return r6
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbyh.y(fcxy):java.lang.Object");
    }
}
