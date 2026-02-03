package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyzg extends fcrl {
    public eyzg(fbnd fbndVar, fbnc fbncVar) {
        super(fbndVar, fbncVar);
    }

    @Override // defpackage.fcrn
    protected final /* synthetic */ fcrn a(fbnd fbndVar, fbnc fbncVar) {
        return new eyzg(fbndVar, fbncVar);
    }

    public final ListenableFuture b(ezlp ezlpVar) {
        fbrk fbrkVarA = eyzh.a;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.a;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "Register");
                    fbrhVarA.b();
                    ezlp ezlpVar2 = ezlp.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezlpVar2);
                    fbrhVarA.b = new fcrh(ezlr.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.a = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), ezlpVar);
    }

    public final ListenableFuture c(ezll ezllVar) {
        fbrk fbrkVarA = eyzh.c;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.c;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "RegisterRefresh");
                    fbrhVarA.b();
                    ezll ezllVar2 = ezll.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezllVar2);
                    fbrhVarA.b = new fcrh(ezln.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.c = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), ezllVar);
    }

    public final ListenableFuture d(ezmr ezmrVar) {
        fbrk fbrkVarA = eyzh.h;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.h;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "SignInGaia");
                    fbrhVarA.b();
                    ezmr ezmrVar2 = ezmr.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezmrVar2);
                    fbrhVarA.b = new fcrh(ezmt.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.h = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), ezmrVar);
    }

    public final ListenableFuture e(ezni ezniVar) {
        fbrk fbrkVarA = eyzh.e;
        if (fbrkVarA == null) {
            synchronized (eyzh.class) {
                fbrkVarA = eyzh.e;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "Unregister");
                    fbrhVarA.b();
                    ezni ezniVar2 = ezni.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezniVar2);
                    fbrhVarA.b = new fcrh(eznk.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzh.e = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), ezniVar);
    }
}
