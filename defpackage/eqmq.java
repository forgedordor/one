package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqmq extends fcrl {
    public eqmq(fbnd fbndVar, fbnc fbncVar) {
        super(fbndVar, fbncVar);
    }

    @Override // defpackage.fcrn
    protected final /* synthetic */ fcrn a(fbnd fbndVar, fbnc fbncVar) {
        return new eqmq(fbndVar, fbncVar);
    }

    public final ListenableFuture b(eqkc eqkcVar) {
        fbrk fbrkVarA = eqmr.a;
        if (fbrkVarA == null) {
            synchronized (eqmr.class) {
                fbrkVarA = eqmr.a;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "CreateObject");
                    fbrhVarA.b();
                    eqkc eqkcVar2 = eqkc.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqkcVar2);
                    fbrhVarA.b = new fcrh(eqnd.a);
                    fbrkVarA = fbrhVarA.a();
                    eqmr.a = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), eqkcVar);
    }

    public final ListenableFuture c(eqky eqkyVar) {
        fbrk fbrkVarA = eqmr.o;
        if (fbrkVarA == null) {
            synchronized (eqmr.class) {
                fbrkVarA = eqmr.o;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "GetObjectByCorrelationId");
                    fbrhVarA.b();
                    eqky eqkyVar2 = eqky.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqkyVar2);
                    fbrhVarA.b = new fcrh(eqnd.a);
                    fbrkVarA = fbrhVarA.a();
                    eqmr.o = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), eqkyVar);
    }

    public final ListenableFuture d(eqlf eqlfVar) {
        fbrk fbrkVarA = eqmr.D;
        if (fbrkVarA == null) {
            synchronized (eqmr.class) {
                fbrkVarA = eqmr.D;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "GetUserStorageInfo");
                    fbrhVarA.b();
                    eqlf eqlfVar2 = eqlf.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqlfVar2);
                    fbrhVarA.b = new fcrh(eqlh.a);
                    fbrkVarA = fbrhVarA.a();
                    eqmr.D = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), eqlfVar);
    }

    public final ListenableFuture e(eqma eqmaVar) {
        fbrk fbrkVarA = eqmr.c;
        if (fbrkVarA == null) {
            synchronized (eqmr.class) {
                fbrkVarA = eqmr.c;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "ListObjects");
                    fbrhVarA.b();
                    eqma eqmaVar2 = eqma.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqmaVar2);
                    fbrhVarA.b = new fcrh(eqmc.a);
                    fbrkVarA = fbrhVarA.a();
                    eqmr.c = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), eqmaVar);
    }

    public final ListenableFuture f(eqoe eqoeVar) {
        fbrk fbrkVarA = eqmr.s;
        if (fbrkVarA == null) {
            synchronized (eqmr.class) {
                fbrkVarA = eqmr.s;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateBox");
                    fbrhVarA.b();
                    eqoe eqoeVar2 = eqoe.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqoeVar2);
                    fbrhVarA.b = new fcrh(eqiz.b);
                    fbrkVarA = fbrhVarA.a();
                    eqmr.s = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), eqoeVar);
    }

    public final ListenableFuture g(eqok eqokVar) {
        fbrk fbrkVarA = eqmr.e;
        if (fbrkVarA == null) {
            synchronized (eqmr.class) {
                fbrkVarA = eqmr.e;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateObject");
                    fbrhVarA.b();
                    eqok eqokVar2 = eqok.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqokVar2);
                    fbrhVarA.b = new fcrh(eqnd.a);
                    fbrkVarA = fbrhVarA.a();
                    eqmr.e = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), eqokVar);
    }
}
