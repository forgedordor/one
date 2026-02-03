package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqpc implements ejca {
    public static final cqce a = cqce.g("Bugle", "TenorService");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService");
    public static final ekrz c = new ekrz("status", Integer.class, false, false);
    public static final String[] d = {"gif", "mediumgif", "tinygif", "nanogif"};
    public final cqbm e;
    private final cqom f;
    private final eosc g;
    private final Context h;
    private final eosc i;

    public cqpc(Context context, cqom cqomVar, eosc eoscVar, eosc eoscVar2, cqbm cqbmVar) {
        this.g = eoscVar;
        this.f = cqomVar;
        this.h = context;
        this.i = eoscVar2;
        this.e = cqbmVar;
    }

    public static eylj b(cqpt cqptVar) {
        eyli eyliVar = (eyli) eylj.a.createBuilder();
        if (cqptVar.c() != null) {
            String strC = cqptVar.c();
            strC.getClass();
            eyliVar.copyOnWrite();
            ((eylj) eyliVar.instance).c = strC;
        }
        eylq eylqVar = (eylq) eylr.a.createBuilder();
        if (cqptVar.f() != null) {
            Integer numF = cqptVar.f();
            numF.getClass();
            int iIntValue = numF.intValue();
            eylqVar.copyOnWrite();
            ((eylr) eylqVar.instance).b = iIntValue;
        }
        if (cqptVar.e() != null) {
            Integer numE = cqptVar.e();
            numE.getClass();
            int iIntValue2 = numE.intValue();
            eylqVar.copyOnWrite();
            ((eylr) eylqVar.instance).c = iIntValue2;
        }
        eyliVar.copyOnWrite();
        eylj eyljVar = (eylj) eyliVar.instance;
        eylr eylrVar = (eylr) eylqVar.build();
        eylrVar.getClass();
        eyljVar.d = eylrVar;
        eyljVar.b |= 1;
        return (eylj) eyliVar.build();
    }

    private static String d(Locale locale) {
        return locale.getLanguage() + "_" + locale.getCountry();
    }

    @Override // defpackage.ejca
    public final ListenableFuture a(eyll eyllVar) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        eork.r(this.f.b(cqom.a, eyllVar.c, 50, d(craf.c(this.h)), (String) cqol.b.e()), new cqpb(this, settableFutureCreate), this.g);
        return settableFutureCreate;
    }

    public final void c(cqpu cqpuVar) {
        String str = cqom.a;
        String strD = d(craf.c(this.h));
        cqpf cqpfVar = (cqpf) cqpuVar;
        eiju eijuVarG = eiju.g(this.f.a(str, cqpfVar.a, cqpfVar.b, strD));
        ejvr ejvrVar = new ejvr() { // from class: cqon
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = cqpc.a;
                return null;
            }
        };
        eosc eoscVar = this.i;
        auvh.h(eijuVarG.h(ejvrVar, eoscVar).e(fhcc.class, new ejvr() { // from class: cqop
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fhcc fhccVar = (fhcc) obj;
                ekrd ekrdVar = (ekrd) ((ekrd) cqpc.b.j()).g(fhccVar);
                ekrdVar.X(cqpc.c, Integer.valueOf(fhccVar.a));
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 149, "TenorService.java")).q("HTTP Exception while registering share.");
                return null;
            }
        }, eoscVar).e(UnknownHostException.class, new ejvr() { // from class: cqoq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) cqpc.b.j()).g((UnknownHostException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 156, "TenorService.java")).q("No connectivity while registering share.");
                return null;
            }
        }, eoscVar).e(SSLHandshakeException.class, new ejvr() { // from class: cqor
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) cqpc.b.j()).g((SSLHandshakeException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 163, "TenorService.java")).q("SSLHandshake Exception while registering share.");
                return null;
            }
        }, eoscVar).e(ConnectException.class, new ejvr() { // from class: cqos
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) cqpc.b.j()).g((ConnectException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 171, "TenorService.java")).q("Connect Exception while registering share.");
                return null;
            }
        }, eoscVar).e(SocketTimeoutException.class, new ejvr() { // from class: cqot
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) cqpc.b.j()).g((SocketTimeoutException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 178, "TenorService.java")).q("Socket Timeout Exception while registering share.");
                return null;
            }
        }, eoscVar));
    }
}
