package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class cfgu implements cfrj {
    private final String a;
    private String b = "";
    private long c = 0;

    public cfgu(String str) {
        this.a = str;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return new cfre(this.a);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture c(ezpp ezppVar) {
        eznd ezndVar = (eznd) ezne.a.createBuilder();
        ezndVar.copyOnWrite();
        ezne ezneVar = (ezne) ezndVar.instance;
        ezppVar.getClass();
        ezneVar.c = ezppVar;
        ezneVar.b |= 1;
        ezne ezneVar2 = (ezne) ezndVar.build();
        this.b = ezppVar.c;
        return eijx.e(ezneVar2);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezne ezneVar = (ezne) evuhVar;
        eyzg eyzgVarA = cezvVar.c().a();
        fbnd fbndVar = eyzgVarA.a;
        fbrk fbrkVarA = eyzh.j;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.j;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "UnregisterGoogleRCS");
                    fbrhVarA.b();
                    ezne ezneVar2 = ezne.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezneVar2);
                    fbrhVarA.b = new fcrh(ezng.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.j = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eyzgVarA.b), ezneVar));
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezng ezngVar = (ezng) evuhVar;
        if (ezngVar != null) {
            ezpr ezprVar = ezngVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.c = j;
        return eijx.e(ezngVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "UnregisterGoogleRcsHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.b;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
