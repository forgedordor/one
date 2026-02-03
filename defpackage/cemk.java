package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cemk implements cemb {
    public final cfwu a;
    public final ceku b;
    public final cezv c;
    public final cejj d;
    public final ains e;
    public final eygg f;
    public final cenj g;
    private final eosc h;
    private final Optional i;
    private final Optional j;
    private final Optional k;
    private final aipo l;
    private final cepq m;

    public cemk(eosc eoscVar, Optional optional, cezv cezvVar, cfwu cfwuVar, ceku cekuVar, Optional optional2, cejj cejjVar, ains ainsVar, Optional optional3, eygg eyggVar, cenj cenjVar, aipo aipoVar, cepq cepqVar) {
        this.h = eoscVar;
        this.c = cezvVar;
        this.i = optional;
        this.a = cfwuVar;
        this.k = optional2;
        this.l = aipoVar;
        this.m = cepqVar;
        this.b = cekuVar;
        this.d = cejjVar;
        this.e = ainsVar;
        this.j = optional3;
        this.f = eyggVar;
        this.g = cenjVar;
    }

    private static boolean c(cfrh cfrhVar) {
        return aprx.a() && (cfrhVar instanceof cfrd) && Objects.equals(((cfrd) cfrhVar).a, "CMS");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    @Override // defpackage.cemb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju a(final defpackage.cfrj r8) {
        /*
            r7 = this;
            cepz r0 = defpackage.cepz.d()
            r1 = r0
            ceoc r1 = (defpackage.ceoc) r1
            cepp r2 = r1.b
            ceob r2 = (defpackage.ceob) r2
            java.lang.String r2 = r2.a
            if (r2 != 0) goto L12
            aioo r2 = defpackage.aioo.a
            goto L18
        L12:
            aipo r3 = r7.l
            ainv r2 = r3.b(r2)
        L18:
            cepq r3 = r7.m
            cepp r1 = r1.a
            cfrh r4 = r8.b()
            cfrg r5 = r4.a()
            int r5 = r5.ordinal()
            if (r5 == 0) goto La3
            r6 = 1
            if (r5 == r6) goto L74
            r6 = 2
            if (r5 == r6) goto L60
            r6 = 3
            if (r5 == r6) goto L47
            r6 = 4
            if (r5 != r6) goto L37
            goto L47
        L37:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "unknown registration type "
            java.lang.String r0 = r1.concat(r0)
            r8.<init>(r0)
            throw r8
        L47:
            boolean r4 = c(r4)
            if (r4 == 0) goto L74
            j$.util.Optional r4 = r7.k
            boolean r5 = r4.isPresent()
            if (r5 == 0) goto L74
            java.lang.Object r4 = r4.get()
            ceku r4 = (defpackage.ceku) r4
            eiju r4 = r4.l()
            goto L7a
        L60:
            cejj r5 = r7.d
            cfre r4 = (defpackage.cfre) r4
            eiju r4 = r5.a(r4)
            cemf r5 = new cemf
            r5.<init>()
            eoqg r6 = defpackage.eoqg.a
            eiju r4 = r4.i(r5, r6)
            goto L7a
        L74:
            ceku r4 = r7.b
            eiju r4 = r4.w()
        L7a:
            eiju r4 = r7.b(r8, r4)
            eiju r1 = r3.a(r1, r4)
            cemg r3 = new cemg
            r3.<init>()
            eosc r4 = r7.h
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            eiju r1 = r1.f(r5, r3, r4)
            cemh r3 = new cemh
            r3.<init>()
            eoqg r5 = defpackage.eoqg.a
            eiju r1 = r1.i(r3, r5)
            cemj r3 = new cemj
            r3.<init>(r7, r2, r0, r8)
            defpackage.eika.l(r1, r3, r4)
            return r1
        La3:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "UNREGISTERED support not implemented"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cemk.a(cfrj):eiju");
    }

    public final eiju b(final cfrj cfrjVar, eiju eijuVar) {
        cfrh cfrhVarB = cfrjVar.b();
        int iOrdinal = cfrhVarB.a().ordinal();
        final String str = iOrdinal != 2 ? iOrdinal != 3 ? "Bugle" : c(cfrhVarB) ? "CMS" : "GDitto" : "RCS";
        eooz eoozVar = new eooz() { // from class: cemc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezpo ezpoVarA = this.a.g.a(str);
                evqs evqsVar = ((ezns) obj).b;
                ezpoVarA.copyOnWrite();
                ezpp ezppVar = (ezpp) ezpoVarA.instance;
                ezpp ezppVar2 = ezpp.a;
                evqsVar.getClass();
                ezppVar.f = evqsVar;
                return cfrjVar.c((ezpp) ezpoVarA.build());
            }
        };
        eosc eoscVar = this.h;
        return eijuVar.i(eoozVar, eoscVar).i(new eooz() { // from class: cemd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cemk cemkVar = this.a;
                cfrj cfrjVar2 = cfrjVar;
                evuh evuhVar = (evuh) obj;
                if (evuhVar != null) {
                    cemkVar.e.g("Bugle.Network.Rpc.Request.Size.Bytes", evuhVar.getSerializedSize());
                    cfrjVar2.i();
                }
                return cfrjVar2.d(cemkVar.c, evuhVar);
            }
        }, eoscVar);
    }

    @Override // defpackage.cfwt
    public final eiju d() {
        if (!this.j.isPresent()) {
            cqca.n("BugleNetwork", "DittoForegroundService is not supported in this device");
            return eijx.d(new UnsupportedOperationException("DittoForegroundService is not available in this device"));
        }
        cqca.l("BugleNetwork", "Retrying RPC and showing notification");
        Optional optional = this.i;
        return (optional.isPresent() ? ((cfzf) optional.get()).d() : eijx.e(null)).i(new eooz() { // from class: cemi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((bvit) this.a.f.b()).d();
            }
        }, eoqg.a);
    }
}
