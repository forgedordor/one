package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.ArrayMap;
import java.net.Proxy;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvv implements eyif {
    public static ebun a(Context context, eosc eoscVar, final eygg eyggVar) throws PackageManager.NameNotFoundException {
        cqce cqceVar = bwvu.a;
        List list = dbyl.m;
        dbyl dbylVarC = new dbyi(context, "EXPRESSION").c();
        dbzq dbzqVar = new dbzq(dbylVarC, "EXPRESSION_COUNTERS", 100);
        ejxw ejxwVar = new ejxw(false);
        Context applicationContext = context.getApplicationContext();
        eryu eryuVar = (eryu) eryv.a.createBuilder();
        eryuVar.copyOnWrite();
        ((eryv) eryuVar.instance).b = eryr.a(4);
        String strD = cpge.d(context);
        eryuVar.copyOnWrite();
        eryv eryvVar = (eryv) eryuVar.instance;
        strD.getClass();
        eryvVar.c = strD;
        eryv eryvVar2 = (eryv) eryuVar.build();
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: bwvt
            @Override // defpackage.ejxr
            public final Object get() {
                cqce cqceVar2 = bwvu.a;
                cepb cepbVar = (cepb) eyggVar.b();
                synchronized (cepbVar.q) {
                    fbqm fbqmVar = cepbVar.p;
                    if (fbqmVar != null) {
                        return fbqmVar;
                    }
                    ekrw ekrwVarE = cepb.a.e();
                    ekrwVarE.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getExpressiveStickerChannel", 296, "GrpcChannelManager.java")).q("Creating Expressive Sticker gRPC Channel");
                    fbqm fbqmVarA = cepbVar.a((String) cepb.i.e(), cepbVar.g(6));
                    cepbVar.p = fbqmVarA;
                    return fbqmVarA;
                }
            }
        });
        String str = (String) bwvu.b.e();
        ebyh ebyhVar = new ebyh(Proxy.NO_PROXY, ebyh.a, new ArrayMap(), eoscVar);
        Uri uri = Uri.parse((String) bwvx.a.e());
        if (eoscVar == null) {
            throw new IllegalStateException("bgExecutor == null");
        }
        if (eryvVar2 == null) {
            throw new IllegalStateException("clientInfo == null");
        }
        if (ejxrVarA == null) {
            throw new IllegalStateException("rpcChannelSupplier and rpcChannel both null");
        }
        if (str != null) {
            return new ebvc(applicationContext, eoscVar, eryvVar2, ejxrVarA, str, new ebvk(applicationContext), new ebxs(applicationContext, eryvVar2, dbylVarC, dbzqVar), ebyhVar, uri, ejxwVar);
        }
        throw new IllegalStateException("apiKey == null");
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
