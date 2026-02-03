package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iek extends icr implements jgg, jbf, jcb {
    public final fdap a;
    public iek b;
    public long c;
    public iek d;
    private final Object e;

    public iek() {
        this(null);
    }

    public final void a(ief iefVar) {
        iek iekVar = this.b;
        if (iekVar != null) {
            iekVar.a(iefVar);
        }
        this.b = null;
    }

    @Override // defpackage.jgg
    public final Object dZ() {
        return this.e;
    }

    public final void f(ief iefVar) {
        jgg jggVar;
        iek iekVar;
        iek iekVar2 = this.b;
        iek iekVar3 = null;
        if (iekVar2 == null || !iel.b(iekVar2, iem.a(iefVar))) {
            if (this.s.C) {
                fdci fdciVar = new fdci();
                jgh.d(this, new iej(fdciVar, this, iefVar));
                jggVar = (jgg) fdciVar.a;
            } else {
                jggVar = null;
            }
            iekVar = (iek) jggVar;
        } else {
            iekVar = iekVar2;
        }
        if (iekVar != null && iekVar2 == null) {
            iel.c(iekVar, iefVar);
        } else if (iekVar == null && iekVar2 != null) {
            iekVar2.a(iefVar);
        } else if (!fdbq.f(iekVar, iekVar2)) {
            if (iekVar != null) {
                iel.c(iekVar, iefVar);
                iekVar3 = iekVar;
            }
            if (iekVar2 != null) {
                iekVar2.a(iefVar);
            }
            iekVar = iekVar3;
        } else if (iekVar != null) {
            iekVar.f(iefVar);
        }
        this.b = iekVar;
    }

    @Override // defpackage.jcb
    public final void i(long j) {
        this.c = j;
    }

    @Override // defpackage.icr
    public final void s() {
        this.d = null;
        this.b = null;
    }

    public /* synthetic */ iek(byte[] bArr) {
        this.a = null;
        this.e = ieg.a;
        this.c = 0L;
    }

    @Override // defpackage.jcb
    public final /* synthetic */ void ea(ivy ivyVar) {
    }
}
