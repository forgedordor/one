package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyzs extends fcrl {
    public eyzs(fbnd fbndVar, fbnc fbncVar) {
        super(fbndVar, fbncVar);
    }

    @Override // defpackage.fcrn
    protected final /* synthetic */ fcrn a(fbnd fbndVar, fbnc fbncVar) {
        return new eyzs(fbndVar, fbncVar);
    }

    public final ListenableFuture b(eyko eykoVar) {
        fbrk fbrkVarA = eyzt.a;
        if (fbrkVarA == null) {
            synchronized (eyzt.class) {
                fbrkVarA = eyzt.a;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.SmartMessaging", "GetContentDecoration");
                    fbrhVarA.b();
                    eyko eykoVar2 = eyko.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eykoVar2);
                    fbrhVarA.b = new fcrh(eykq.a);
                    fbrkVarA = fbrhVarA.a();
                    eyzt.a = fbrkVarA;
                }
            }
        }
        return fcrw.a(this.a.a(fbrkVarA, this.b), eykoVar);
    }
}
