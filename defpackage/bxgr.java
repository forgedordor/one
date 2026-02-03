package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgr {
    private static final cqce b = cqce.g("Bugle", "MediaResourceManager");
    public final Executor a;
    private final Executor c;

    /* compiled from: PG */
    public interface a {
        void iT();
    }

    public bxgr(Context context) {
        ((a) ehli.a(context, a.class)).iT();
        this.c = cqdp.a("MediaLoading", 10, 10);
        this.a = Executors.newSingleThreadExecutor(new cqcj("MediaBackgroundThread", 1));
    }

    public static void c(bxgp bxgpVar, boolean z, bxgk bxgkVar, bxfw bxfwVar) {
        if (bxgpVar != null) {
            cqaz.k(!z);
            bxgz bxgzVar = bxgpVar.a;
            cqaz.k(bxgzVar.n() > 0);
            if (bxfwVar != null) {
                try {
                    bxfwVar.fV(bxfwVar, bxgzVar, bxgpVar.b);
                } finally {
                    bxgpVar.a.q();
                    bxgpVar.a();
                }
            }
            return;
        }
        if (!z) {
            cqaz.k(bxfwVar == null || !bxfwVar.i());
            cqbd cqbdVarD = b.d();
            cqbdVarD.I("media request not processed, no longer bound.");
            cqbdVarD.D("key", bxgkVar.f());
            cqbdVarD.r();
            return;
        }
        cqbd cqbdVarE = b.e();
        cqbdVarE.I("Asynchronous media loading failed.");
        cqbdVarE.A("key", bxgkVar.f());
        cqbdVarE.r();
        if (bxfwVar != null) {
            bxfwVar.fU(bxfwVar);
        }
    }

    private final bxgp f(bxgk bxgkVar) {
        bxgz bxgzVarH;
        ArrayList arrayList = new ArrayList();
        bxgz bxgzVarG = bxgkVar.a() == 0 ? g(bxgkVar) : null;
        if (bxgzVarG == null) {
            bxgzVarH = h(bxgkVar, arrayList);
        } else if (bxgzVarG.k()) {
            bxgk bxgkVarL = bxgzVarG.l();
            cqaz.l(bxgkVarL);
            bxgzVarG.q();
            bxgzVarH = h(bxgkVarL, arrayList);
        } else {
            bxgzVarH = bxgzVarG;
        }
        return new bxgp(this, bxgzVarH, bxgzVarG != null, arrayList);
    }

    private static bxgz g(bxgk bxgkVar) {
        bxgi bxgiVarC;
        bxgz bxgzVarB;
        if (bxgkVar.b() != 3 || (bxgiVarC = bxgkVar.c()) == null || (bxgzVarB = bxgiVarC.b(bxgkVar.f())) == null) {
            return null;
        }
        return bxgzVarB;
    }

    private static final bxgz h(bxgk bxgkVar, List list) {
        bxgz bxgzVarE = bxgkVar.e(list);
        cqaz.l(bxgzVarE);
        bxgzVarE.p();
        if (bxgzVarE.h() && bxgkVar.a() == 0) {
            cqaz.k(true);
            bxgi bxgiVarC = bxgkVar.c();
            if (bxgiVarC != null) {
                bxgiVarC.a(bxgkVar.f(), bxgzVarE);
                cqbd cqbdVarD = b.d();
                cqbdVarD.I("added media resource to");
                cqbdVarD.I(bxgiVarC.a);
                cqbdVarD.D("key", bxgkVar.f());
                cqbdVarD.r();
            }
        }
        return bxgzVarE;
    }

    public final /* synthetic */ bxgo a(bxfw bxfwVar, bxgk bxgkVar) {
        if (bxfwVar != null && !bxfwVar.i()) {
            return new bxgo(false, null);
        }
        try {
            return new bxgo(false, f(bxgkVar));
        } catch (Exception | OutOfMemoryError e) {
            b.s("Media Request Failed.", e);
            return new bxgo(true, null);
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:28), block:B:12:0x001b */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bxgz b(defpackage.bxgk r6) throws java.lang.Throwable {
        /*
            r5 = this;
            defpackage.cqaz.h()
            r0 = 0
            bxgp r1 = r5.f(r6)     // Catch: java.lang.Throwable -> L21 java.lang.OutOfMemoryError -> L23 java.lang.Exception -> L25
            bxgz r2 = r1.a     // Catch: java.lang.Throwable -> L1a java.lang.OutOfMemoryError -> L1d java.lang.Exception -> L1f
            int r3 = r2.n()     // Catch: java.lang.Throwable -> L1a java.lang.OutOfMemoryError -> L1d java.lang.Exception -> L1f
            if (r3 <= 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            defpackage.cqaz.k(r3)     // Catch: java.lang.Throwable -> L1a java.lang.OutOfMemoryError -> L1d java.lang.Exception -> L1f
            r1.a()
            return r2
        L1a:
            r6 = move-exception
            r0 = r1
            goto L45
        L1d:
            r2 = move-exception
            goto L28
        L1f:
            r2 = move-exception
            goto L28
        L21:
            r6 = move-exception
            goto L45
        L23:
            r1 = move-exception
            goto L26
        L25:
            r1 = move-exception
        L26:
            r2 = r1
            r1 = r0
        L28:
            cqce r3 = defpackage.bxgr.b     // Catch: java.lang.Throwable -> L1a
            cqbd r3 = r3.e()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Synchronous media loading failed."
            r3.I(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "key"
            java.lang.String r6 = r6.f()     // Catch: java.lang.Throwable -> L1a
            r3.A(r4, r6)     // Catch: java.lang.Throwable -> L1a
            r3.s(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L44
            r1.a()
        L44:
            return r0
        L45:
            if (r0 == 0) goto L4a
            r0.a()
        L4a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxgr.b(bxgk):bxgz");
    }

    public final void d(bxgk bxgkVar) {
        e(bxgkVar, this.c);
    }

    public final void e(final bxgk bxgkVar, Executor executor) {
        bxgp bxgpVar;
        final bxfw bxfwVar = bxgkVar instanceof bxfw ? (bxfw) bxgkVar : null;
        if (bxfwVar == null || bxfwVar.i()) {
            if (bxgkVar.a() == 0) {
                if (bxgkVar.f() == null) {
                    cqaz.c("mediaRequest with cache policy has no key!");
                } else {
                    bxgz bxgzVarG = g(bxgkVar);
                    if (bxgzVarG != null && !bxgzVarG.k()) {
                        bxgpVar = new bxgp(this, bxgzVarG, true, new ArrayList());
                    }
                }
                bxgpVar = null;
            } else {
                bxgpVar = null;
            }
            if (bxgpVar == null) {
                new bxgs(new ejxr() { // from class: bxgm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return this.a.a(bxfwVar, bxgkVar);
                    }
                }, new ejvr() { // from class: bxgn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        bxgo bxgoVar = (bxgo) obj;
                        bxgr.c(bxgoVar.b, bxgoVar.a, bxgkVar, bxfwVar);
                        return null;
                    }
                }).executeOnExecutor(executor, new Void[0]);
                return;
            }
            try {
                c(f(bxgkVar), false, bxgkVar, bxfwVar);
            } catch (Exception | OutOfMemoryError e) {
                b.s("Media Request Failed.", e);
                c(null, true, bxgkVar, bxfwVar);
            }
        }
    }
}
