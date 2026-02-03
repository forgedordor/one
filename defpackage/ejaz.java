package defpackage;

import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejaz implements eora {
    private final fbtu a;

    public ejaz(fbtu fbtuVar) {
        this.a = fbtuVar;
    }

    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        fbrg fbrgVar;
        Map map = ((ejba) obj).b;
        fbtu fbtuVar = this.a;
        try {
            fbtx fbtxVar = fbtuVar.b;
            synchronized (fbtxVar) {
                Map map2 = fbtxVar.e;
                if (map2 == null || map2 != map) {
                    fbrg fbrgVar2 = new fbrg();
                    for (String str : map.keySet()) {
                        if (str.endsWith("-bin")) {
                            fbqz fbqzVar = fbrg.b;
                            int i = fbrb.d;
                            fbqy fbqyVar = new fbqy(str, fbqzVar);
                            Iterator it = ((List) map.get(str)).iterator();
                            while (it.hasNext()) {
                                fbrgVar2.h(fbqyVar, eldz.e.k((String) it.next()));
                            }
                        } else {
                            fbqx fbqxVar = fbrg.c;
                            int i2 = fbrb.d;
                            fbqw fbqwVar = new fbqw(str, fbqxVar);
                            Iterator it2 = ((List) map.get(str)).iterator();
                            while (it2.hasNext()) {
                                fbrgVar2.h(fbqwVar, (String) it2.next());
                            }
                        }
                    }
                    fbtxVar.d = fbrgVar2;
                    fbtxVar.e = map;
                }
                fbrgVar = fbtxVar.d;
            }
            fbmy fbmyVar = fbtuVar.a;
            fchv fchvVar = (fchv) fbmyVar;
            ejwl.m(!fchvVar.i, "apply() or fail() already called");
            fbrgVar.getClass();
            fbrg fbrgVar3 = fchvVar.c;
            fbrgVar3.g(fbrgVar);
            fbog fbogVarA = fchvVar.e.a();
            try {
                fcan fcanVarD = ((fchv) fbmyVar).a.d(((fchv) fbmyVar).b, fbrgVar3, ((fchv) fbmyVar).d, ((fchv) fbmyVar).f);
                fchvVar.e.f(fbogVarA);
                fchvVar.b(fcanVarD);
            } catch (Throwable th) {
                fchvVar.e.f(fbogVarA);
                throw th;
            }
        } catch (Throwable th2) {
            fbtuVar.a.a(Status.j.withDescription("Failed to convert credential metadata").d(th2));
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof ExecutionException) {
            th = th.getCause();
        }
        fbtu fbtuVar = this.a;
        if ((th instanceof ejar) && ((ejar) th).a()) {
            fbtuVar.a.a(Status.p.withDescription("Credentials failed to obtain metadata").d(th));
        } else {
            fbtuVar.a.a(Status.j.withDescription("Failed computing credential metadata").d(th));
        }
    }
}
