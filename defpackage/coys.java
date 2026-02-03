package defpackage;

import android.util.Base64;
import androidx.car.app.model.Alert;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coys {
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/transfer/uploads/UploaderCommon");
    public final eosc a;
    public final eosc b;
    public final couh c;
    public final eyde d;
    public final eyde e;
    public final fcsu f;
    private final eosc h;
    private final fcsu i;
    private final coxz j;

    public coys(eosc eoscVar, eosc eoscVar2, eosc eoscVar3, couh couhVar, eyde eydeVar, fcsu fcsuVar, coxz coxzVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = eoscVar;
        this.b = eoscVar2;
        this.h = eoscVar3;
        this.c = couhVar;
        this.d = eydeVar;
        this.e = (eyde) fcsuVar.b();
        this.f = fcsuVar2;
        this.j = coxzVar;
        this.i = fcsuVar3;
    }

    public static String d(ezuc ezucVar) {
        return Base64.encodeToString(ezucVar.toByteArray(), 2);
    }

    public static final long f(eycb eycbVar) {
        if (eycbVar.e() <= 0) {
            return 104857600L;
        }
        return eycbVar.e();
    }

    static final eydb g(long j) {
        if (j <= 0) {
            eyda eydaVar = new eyda();
            eydaVar.a = cojd.c().b;
            return new eydb(eydaVar);
        }
        eyda eydaVar2 = new eyda();
        eydaVar2.a = cojd.c().b;
        eydaVar2.b = j;
        return new eydb(eydaVar2);
    }

    static final aucj h(ezuk ezukVar, Optional optional, Optional optional2) {
        int i;
        ContentType contentType = (ContentType) optional2.orElse(ContentType.e("application/vnd.gsma.rcs-ft-http+xml"));
        auci auciVar = (auci) aucj.a.createBuilder();
        String str = (String) optional.orElse("");
        auciVar.copyOnWrite();
        aucj aucjVar = (aucj) auciVar.instance;
        str.getClass();
        aucjVar.c = str;
        long j = ezukVar.d;
        if (j > 2147483647L) {
            ekrw ekrwVarJ = g.j();
            ekrwVarJ.X(eksq.a, "BugleFileTransfer");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/transfer/uploads/UploaderCommon", "convertSizeBytes", 253, "UploaderCommon.java")).s("Uploaded file of size %d, which is larger than can be stored in FileInformation.size_bytes, int32 max (~2.15 gb).", j);
            i = Alert.DURATION_SHOW_INDEFINITELY;
        } else {
            i = (int) j;
        }
        auciVar.copyOnWrite();
        ((aucj) auciVar.instance).d = i;
        aubx aubxVar = (aubx) new atal().fH().fM(contentType);
        auciVar.copyOnWrite();
        aucj aucjVar2 = (aucj) auciVar.instance;
        aubxVar.getClass();
        aucjVar2.e = aubxVar;
        aucjVar2.b |= 1;
        String str2 = ezukVar.b;
        auciVar.copyOnWrite();
        aucj aucjVar3 = (aucj) auciVar.instance;
        str2.getClass();
        aucjVar3.f = str2;
        evvp evvpVar = ezukVar.c;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        auciVar.copyOnWrite();
        aucj aucjVar4 = (aucj) auciVar.instance;
        evvpVar.getClass();
        aucjVar4.g = evvpVar;
        aucjVar4.b |= 2;
        return (aucj) auciVar.build();
    }

    final eijs a(final cous cousVar, final coyr coyrVar) {
        return eijs.d(new eopn() { // from class: coyo
            @Override // defpackage.eopn
            public final Object a(eopt eoptVar) {
                coyr coyrVar2 = coyrVar;
                coys coysVar = this.a;
                eycb eycbVarA = coyrVar2.a(coysVar.c, cousVar);
                eoptVar.a(eycbVarA, coysVar.a);
                return eycbVarA;
            }
        }, this.b);
    }

    final eiju b(final ezuc ezucVar, final eycb eycbVar, final Optional optional, final Optional optional2, final evqs evqsVar, final String str, final long j) {
        return eijx.g(new Callable() { // from class: coyl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                coys coysVar = this.a;
                boolean zA = ((arai) coysVar.f.b()).a();
                Optional optional3 = optional;
                eycb eycbVar2 = eycbVar;
                long j2 = j;
                String str2 = str;
                Optional optional4 = optional2;
                evqs evqsVar2 = evqsVar;
                ezuc ezucVar2 = ezucVar;
                return (zA || (eycbVar2 != null && coys.f(eycbVar2) > 0 && coys.f(eycbVar2) <= j2)) ? coysVar.e.b(str2, coysVar.c(optional3, optional4, coys.f(eycbVar2), evqsVar2), eycbVar2, coys.d(ezucVar2), coys.g(j2)) : coysVar.d.b(str2, coysVar.c(optional3, optional4, coys.f(eycbVar2), evqsVar2), eycbVar2, coys.d(ezucVar2), coys.g(j2));
            }
        }, this.h);
    }

    public final eyce c(Optional optional, Optional optional2, long j, evqs evqsVar) {
        eyce eyceVar = new eyce();
        eyceVar.e("X-Goog-Upload-Header-Content-Length", Long.toString(j));
        eyceVar.e("X-Goog-Upload-Header-Content-Type", (String) optional.map(new Function() { // from class: coym
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ContentType) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("application/vnd.gsma.rcs-ft-http+xml"));
        eyceVar.e("X-Goog-Upload-File-Name", (String) optional2.orElse(""));
        eyceVar.d("Authorization", "Bearer ".concat(String.valueOf(Base64.encodeToString(evqsVar.I(), 2))));
        eyceVar.d("Upload-Type", "TG");
        fcsu fcsuVar = this.i;
        if (!((String) fcsuVar.b()).isEmpty()) {
            eyceVar.d("Cookie", (String) fcsuVar.b());
        }
        return eyceVar;
    }

    public final void e(atir atirVar, eycv eycvVar, eycb eycbVar, coir coirVar) {
        long jF = f(eycbVar);
        coirVar.getClass();
        atirVar.getClass();
        coxz coxzVar = this.j;
        eosc eoscVar = (eosc) coxzVar.b.b();
        eoscVar.getClass();
        eycvVar.e(new coxy(coirVar, coxzVar.a, atirVar, jF, eoscVar), cojd.b(), (int) evwy.b(evwy.d(((Long) cojd.a.e()).longValue())));
    }
}
