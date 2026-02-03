package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyro extends fcrl {
    public eyro(fbnd fbndVar, fbnc fbncVar) {
        super(fbndVar, fbncVar);
    }

    @Override // defpackage.fcrn
    protected final /* synthetic */ fcrn a(fbnd fbndVar, fbnc fbncVar) {
        return new eyro(fbndVar, fbncVar);
    }

    public final ListenableFuture b(ewwd ewwdVar) {
        fbrk fbrkVarA = eyrp.a;
        if (fbrkVarA == null) {
            synchronized (eyrp.class) {
                fbrkVarA = eyrp.a;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.LighterFrontend", "SendLighterMessage");
                    fbrhVarA.b();
                    ewwd ewwdVar2 = ewwd.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ewwdVar2);
                    fbrhVarA.b = new fcrh(ewwf.a);
                    fbrkVarA = fbrhVarA.a();
                    eyrp.a = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), ewwdVar);
    }
}
