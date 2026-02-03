package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exsv extends fcrl {
    public exsv(fbnd fbndVar, fbnc fbncVar) {
        super(fbndVar, fbncVar);
    }

    @Override // defpackage.fcrn
    protected final /* synthetic */ fcrn a(fbnd fbndVar, fbnc fbncVar) {
        return new exsv(fbndVar, fbncVar);
    }

    public final ListenableFuture b(extc extcVar) {
        fbrk fbrkVarA = exsw.a;
        if (fbrkVarA == null) {
            synchronized (exsw.class) {
                fbrkVarA = exsw.a;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("mdi.aratea.ArateaService", "Generate");
                    fbrhVarA.b();
                    extc extcVar2 = extc.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(extcVar2);
                    fbrhVarA.b = new fcrh(exte.a);
                    fbrkVarA = fbrhVarA.a();
                    exsw.a = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), extcVar);
    }
}
