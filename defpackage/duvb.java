package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duvb implements eora {
    final /* synthetic */ duur a;
    final /* synthetic */ duab b;
    final /* synthetic */ duvd c;

    public duvb(duvd duvdVar, duur duurVar, duab duabVar) {
        this.a = duurVar;
        this.b = duabVar;
        this.c = duvdVar;
    }

    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        duur duurVar = this.a;
        ejwi ejwiVar = ((duum) duurVar).d;
        if (!ejwiVar.g()) {
            this.c.d.e(((duaa) this.b).a);
            return;
        }
        bxov bxovVar = (bxov) ejwiVar.c();
        bxox bxoxVar = bxovVar.a;
        final Uri uri = bxovVar.c;
        final Uri uri2 = bxovVar.d;
        bxor bxorVar = bxovVar.b;
        cqbd cqbdVarC = bxox.a.c();
        cqbdVarC.I("Download succeeded, notifying callback");
        cqbdVarC.N(VCardConstants.PROPERTY_URL, uri);
        cqbdVarC.N("fileUri", uri2);
        cqbdVarC.r();
        try {
            try {
                Set<bxqj> set = ((bxpo) bxorVar).b;
                for (final bxqj bxqjVar : set) {
                    ((bxpo) bxorVar).c(new Runnable() { // from class: bxpi
                        @Override // java.lang.Runnable
                        public final void run() {
                            bxqj bxqjVar2 = bxqjVar;
                            Uri uri3 = uri;
                            try {
                                bxqjVar2.e(uri3.toString(), uri2);
                            } catch (RuntimeException e) {
                                bxpo.a.s("Error while calling #onSuccess", e);
                            }
                        }
                    });
                }
                set.clear();
            } catch (RuntimeException e) {
                cqbd cqbdVarB = bxox.a.b();
                cqbdVarB.I("Download callback onSuccess error");
                cqbdVarB.s(e);
            }
            ConcurrentMap concurrentMap = bxoxVar.c.a;
            concurrentMap.remove(uri);
            cqbd cqbdVarC2 = bxox.a.c();
            cqbdVarC2.y("remainingDownloads", concurrentMap.size());
            cqbdVarC2.r();
            eika.l(eorv.a, new duva(this, duurVar, this.b), this.c.a);
        } catch (Throwable th) {
            ConcurrentMap concurrentMap2 = bxoxVar.c.a;
            concurrentMap2.remove(uri);
            cqbd cqbdVarC3 = bxox.a.c();
            cqbdVarC3.y("remainingDownloads", concurrentMap2.size());
            cqbdVarC3.r();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [duve, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [duve, java.lang.Object] */
    @Override // defpackage.eora
    public final void hi(Throwable th) {
        durt.k(th, "%s: Download Future failed", "DownloaderImp");
        try {
            try {
                ejwi ejwiVar = ((duum) this.a).d;
                if (ejwiVar.g()) {
                    Object objC = ejwiVar.c();
                    bxox bxoxVar = ((bxov) objC).a;
                    Uri uri = ((bxov) objC).c;
                    bxor bxorVar = ((bxov) objC).b;
                    cqbd cqbdVarB = bxox.a.b();
                    cqbdVarB.I("Download failed");
                    cqbdVarB.N(VCardConstants.PROPERTY_URL, uri);
                    cqbdVarB.A("exception", th.getClass().getName());
                    cqbdVarB.A("message", th.getMessage());
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        cqbdVarB.A("cause", cause.getClass().getName());
                        cqbdVarB.A("causeMessage", cause.getMessage());
                    }
                    cqbdVarB.r();
                    try {
                        try {
                            bxorVar.a(uri, th);
                        } catch (RuntimeException e) {
                            cqbd cqbdVarB2 = bxox.a.b();
                            cqbdVarB2.I("Callback error: #onFailure");
                            cqbdVarB2.s(e);
                        }
                        ConcurrentMap concurrentMap = bxoxVar.c.a;
                        concurrentMap.remove(uri);
                        cqbd cqbdVarC = bxox.a.c();
                        cqbdVarC.y("remainingDownloads", concurrentMap.size());
                        cqbdVarC.r();
                    } catch (Throwable th2) {
                        ConcurrentMap concurrentMap2 = bxoxVar.c.a;
                        concurrentMap2.remove(uri);
                        cqbd cqbdVarC2 = bxox.a.c();
                        cqbdVarC2.y("remainingDownloads", concurrentMap2.size());
                        cqbdVarC2.r();
                        throw th2;
                    }
                }
            } catch (RuntimeException unused) {
                durt.e(th, "%s: Download Listener onFailure failed", "DownloaderImp");
            }
        } finally {
            duum duumVar = (duum) this.a;
            if (duumVar.d.g()) {
                ejwi ejwiVar2 = this.c.b;
                if (ejwiVar2.g()) {
                    ejwiVar2.c().f(duumVar.a);
                }
            }
            this.c.d.e(((duaa) this.b).a);
        }
    }
}
