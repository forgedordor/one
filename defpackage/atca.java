package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atca implements atcb {
    public final /* synthetic */ atcd a;

    public atca(atcd atcdVar) {
        this.a = atcdVar;
    }

    @Override // defpackage.atcb
    public final String a() {
        return "SetupState";
    }

    @Override // defpackage.atcb
    public final void b(atbv atbvVar) {
        eksl ekslVar = (eksl) atcd.a.h();
        ekrz ekrzVar = coie.a;
        atcd atcdVar = this.a;
        ekslVar.X(ekrzVar, atcdVar.c);
        ekslVar.X(coie.i, "SetupState");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$SetupState", "enter", 143, "InProgressFileTransfer.java")).q("Preparing the HTTP request for execution.");
        atcdVar.d.a().h(new ejvr() { // from class: atby
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                atdc atdcVar = (atdc) obj;
                int iB = atdcVar.b();
                atca atcaVar = this.a;
                if (iB == 2) {
                    atbq atbqVarA = atdcVar.a();
                    eksl ekslVar2 = (eksl) atcd.a.j();
                    atcd atcdVar2 = atcaVar.a;
                    ekslVar2.X(coie.a, atcdVar2.c);
                    ekslVar2.X(coie.i, "SetupState");
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$SetupState", "enter", 155, "InProgressFileTransfer.java")).q("Failure during setting up the UrlRequest.");
                    atcdVar2.a(atcdVar2.h, new atay(atbqVarA));
                    return null;
                }
                atcd atcdVar3 = atcaVar.a;
                atbz atbzVar = new atbz(atcaVar);
                atea ateaVar = atcdVar3.k;
                boolean z = ateaVar.a;
                long length = z ? ateaVar.b.length() : 0L;
                atcn atcnVarA = ((atco) ateaVar.h.b.b()).a(ateaVar.g, new ated(ateaVar.c, ateaVar.d, length, ateaVar.e, cojd.a(), atbzVar, ateaVar.f));
                if (z) {
                    atcnVarA.b(String.format(Locale.US, "bytes=%d-", Long.valueOf(length)));
                }
                atcnVarA.c(atdcVar.c());
                atcdVar3.a(atcdVar3.g, new atax(atcnVarA.a()));
                return null;
            }
        }, atcdVar.b).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.atcb
    public final void c() {
    }
}
