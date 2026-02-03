package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceoe implements cepy {
    private final fbnd a;
    private final fbrg b;

    public ceoe(fbnd fbndVar, fbrg fbrgVar) {
        this.a = fbndVar;
        this.b = fbrgVar;
    }

    private final eyzg j() {
        return (eyzg) ceqb.c(eyzh.a(this.a), this.b, false);
    }

    private static eyzg k(fbnd fbndVar, fbrg fbrgVar, eson esonVar) {
        fbrb fbrbVar = cepd.a;
        fbrg fbrgVar2 = new fbrg();
        fbrgVar2.g(fbrgVar);
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        fbqw fbqwVar = new fbqw("X-Goog-Api-Key", fbqxVar);
        if (fbrgVar2.i(fbqwVar)) {
            fbrgVar2.n(fbqwVar, (String) fbrgVar2.c(fbqwVar));
        }
        fbrgVar2.h(cepd.a, "Bearer ".concat(String.valueOf(esonVar.a)));
        fbrgVar2.h(cepd.b, esonVar.a());
        return (eyzg) ceqb.c(eyzh.a(fbndVar), fbrgVar2, false);
    }

    @Override // defpackage.cepy
    public final eiju a(eziq eziqVar) {
        eyzg eyzgVarJ = j();
        fbnd fbndVar = eyzgVarJ.a;
        fbrk fbrkVarA = eyzh.i;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.i;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "GetAccountInfo");
                    fbrhVarA.b();
                    eziq eziqVar2 = eziq.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eziqVar2);
                    fbrhVarA.b = new fcrh(ezis.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.i = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eyzgVarJ.b), eziqVar));
    }

    @Override // defpackage.cepy
    public final eiju b(ezvc ezvcVar) {
        eyzg eyzgVarJ = j();
        fbnd fbndVar = eyzgVarJ.a;
        fbrk fbrkVarA = eyzh.f;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.f;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "GetPreKeyBatch");
                    fbrhVarA.b();
                    ezvc ezvcVar2 = ezvc.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezvcVar2);
                    fbrhVarA.b = new fcrh(ezvi.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.f = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eyzgVarJ.b), ezvcVar));
    }

    @Override // defpackage.cepy
    public final eiju c(ezjp ezjpVar, eson esonVar) {
        eyzg eyzgVarK = k(this.a, this.b, esonVar);
        fbnd fbndVar = eyzgVarK.a;
        fbrk fbrkVarA = eyzh.l;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.l;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "LinkIdentity");
                    fbrhVarA.b();
                    ezjp ezjpVar2 = ezjp.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezjpVar2);
                    fbrhVarA.b = new fcrh(ezjr.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.l = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eyzgVarK.b), ezjpVar));
    }

    @Override // defpackage.cepy
    public final eiju d(ezjt ezjtVar) {
        eyzg eyzgVarJ = j();
        return eiju.g(fcrw.a(eyzgVarJ.a.a(eyzh.b(), eyzgVarJ.b), ezjtVar));
    }

    @Override // defpackage.cepy
    public final eiju e(ezlp ezlpVar) {
        return eiju.g(j().b(ezlpVar));
    }

    @Override // defpackage.cepy
    public final eiju f(ezll ezllVar) {
        return eiju.g(j().c(ezllVar));
    }

    @Override // defpackage.cepy
    public final eiju g(ezwg ezwgVar) {
        eyzg eyzgVarJ = j();
        fbnd fbndVar = eyzgVarJ.a;
        fbrk fbrkVarA = eyzh.g;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.g;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "SetPreKeys");
                    fbrhVarA.b();
                    ezwg ezwgVar2 = ezwg.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezwgVar2);
                    fbrhVarA.b = new fcrh(ezwi.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.g = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eyzgVarJ.b), ezwgVar));
    }

    @Override // defpackage.cepy
    public final eiju h(ezna eznaVar, eson esonVar) {
        eyzg eyzgVarK = k(this.a, this.b, esonVar);
        fbnd fbndVar = eyzgVarK.a;
        fbrk fbrkVarA = eyzh.m;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.m;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "UnlinkIdentity");
                    fbrhVarA.b();
                    ezna eznaVar2 = ezna.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eznaVar2);
                    fbrhVarA.b = new fcrh(eznc.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.m = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eyzgVarK.b), eznaVar));
    }

    @Override // defpackage.cepy
    public final eiju i(ezno eznoVar) {
        eyzg eyzgVarJ = j();
        fbnd fbndVar = eyzgVarJ.a;
        fbrk fbrkVarA = eyzh.d;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.d;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "Verify");
                    fbrhVarA.b();
                    ezno eznoVar2 = ezno.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eznoVar2);
                    fbrhVarA.b = new fcrh(eznq.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.d = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eyzgVarJ.b), eznoVar));
    }
}
