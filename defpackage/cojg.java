package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.DnsOptions;
import org.chromium.net.QuicOptions;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cojg implements cojh {
    public final Context a;
    public final coje b;
    public final cesc c;
    public final ekrg d;
    private final fctc e;

    public cojg(Context context, coje cojeVar, cesc cescVar) {
        context.getClass();
        cescVar.getClass();
        this.a = context;
        this.b = cojeVar;
        this.c = cescVar;
        this.d = ekrg.c("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine");
        this.e = fctd.a(new fdae() { // from class: cojf
            @Override // defpackage.fdae
            public final Object invoke() {
                cojg cojgVar = this.a;
                ekrw ekrwVarE = cojgVar.d.e();
                ekrwVarE.X(eksq.a, "BugleFileTransfer");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "getCronetEngineInternal", 41, "BugleQuicCronetEngine.kt")).q("Initializing BugleQuicCronetEngine.");
                CronetEngine.Builder builderCreateBuilder = cojgVar.c.a().createBuilder();
                builderCreateBuilder.getClass();
                builderCreateBuilder.enableHttp2(true);
                builderCreateBuilder.enableQuic(true);
                DnsOptions.Builder builder = DnsOptions.builder();
                builder.enableStaleDns(true);
                builder.useBuiltInDnsResolver(true);
                builder.preestablishConnectionsToStaleDnsResults(true);
                builder.persistHostCache(true);
                DnsOptions.StaleDnsOptions.Builder builder2 = DnsOptions.StaleDnsOptions.builder();
                builder2.useStaleOnNameNotResolved(true);
                coje cojeVar2 = cojgVar.b;
                Object objB = cojeVar2.e.b();
                objB.getClass();
                builder2.allowCrossNetworkUsage(((Boolean) objB).booleanValue());
                Object objB2 = cojeVar2.c.b();
                objB2.getClass();
                builder2.setFreshLookupTimeoutMillis(((Number) objB2).longValue());
                Object objB3 = cojeVar2.d.b();
                objB3.getClass();
                builder2.setMaxExpiredDelayMillis(((Number) objB3).longValue());
                builder.setStaleDnsOptions(builder2.build());
                builderCreateBuilder.setDnsOptions(builder.build()).getClass();
                try {
                    ecem.b();
                    File file = new File(cojgVar.a.getCacheDir(), "bugle_cronet_cache");
                    if (!file.isDirectory() && !file.mkdir()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    CronetEngine.Builder storagePath = builderCreateBuilder.setStoragePath(absolutePath);
                    Object objB4 = cojeVar2.b.b();
                    objB4.getClass();
                    storagePath.enableHttpCache(2, ((Number) objB4).longValue()).getClass();
                } catch (IllegalArgumentException e) {
                    ekrw ekrwVarJ = cojgVar.d.j();
                    ekrwVarJ.X(eksq.a, "BugleFileTransfer");
                    ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "configureQuicHints", 97, "BugleQuicCronetEngine.kt")).q("Exception occurred while getting access to CronetCache directory, keeping http cache in memory.");
                    Object objB5 = cojgVar.b.b.b();
                    objB5.getClass();
                    builderCreateBuilder.enableHttpCache(1, ((Number) objB5).longValue());
                }
                coje cojeVar3 = cojgVar.b;
                evtg evtgVar = ((ewto) cojeVar3.a.b()).b;
                evtgVar.getClass();
                ekrw ekrwVarE2 = cojgVar.d.e();
                ekrwVarE2.X(eksq.a, "BugleFileTransfer");
                ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine", "configureQuicHints", 104, "BugleQuicCronetEngine.kt")).t("Configuring CronetEngine with quic hints: %s", evtgVar);
                Iterator<E> it = evtgVar.iterator();
                while (it.hasNext()) {
                    builderCreateBuilder.addQuicHint((String) it.next(), 443, 443);
                }
                ConnectionMigrationOptions.Builder builder3 = ConnectionMigrationOptions.builder();
                builder3.enableDefaultNetworkMigration(true);
                builderCreateBuilder.setConnectionMigrationOptions(builder3.build()).getClass();
                fcsu fcsuVar = cojeVar3.f;
                QuicOptions.Builder builder4 = QuicOptions.builder();
                Object objB6 = fcsuVar.b();
                objB6.getClass();
                builder4.setRetransmittableOnWireTimeoutMillis(((Number) objB6).longValue());
                builderCreateBuilder.setQuicOptions(builder4.build()).getClass();
                CronetEngine cronetEngineBuild = builderCreateBuilder.build();
                cronetEngineBuild.getClass();
                return cronetEngineBuild;
            }
        });
    }

    @Override // defpackage.cojh
    public final CronetEngine a() {
        return b();
    }

    public final CronetEngine b() {
        return (CronetEngine) this.e.a();
    }
}
