package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqe {
    private final Context a;
    private final Set b;
    private final Set c;
    private final ejwi d;
    private final fcsu e;
    private volatile esqd f;
    private final Object g = new Object();

    public esqe(Context context, Set set, Set set2, ejwi ejwiVar, fcsu fcsuVar) {
        this.a = context;
        this.b = set;
        this.c = set2;
        this.d = ejwiVar;
        this.e = fcsuVar;
    }

    private static final ejwi b(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CronetProvider cronetProvider = (CronetProvider) it.next();
            if (cronetProvider.getName().equals(str) && cronetProvider.isEnabled()) {
                ejwi.j(str);
                return ejwi.j(cronetProvider);
            }
        }
        return ejud.a;
    }

    final esqd a(boolean z) {
        eieu eieuVarK = eiiy.k("CronetConfigurationModule#getCachedCronetEngine");
        try {
            esqd esqdVar = this.f;
            if (esqdVar != null) {
                eieuVarK.close();
                return esqdVar;
            }
            synchronized (this.g) {
                if (this.f == null) {
                    try {
                        Context context = this.a;
                        Set<espz> set = this.b;
                        Set set2 = this.c;
                        ejwi ejwiVar = this.d;
                        fcsu fcsuVar = this.e;
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        try {
                            Object obj = ((ejwt) ejwiVar).a;
                            ExperimentalCronetEngine.Builder builderB = ((espw) obj).c() != null ? ((espw) obj).c().b() : null;
                            if (builderB == null) {
                                if (z) {
                                    List<CronetProvider> allProviders = CronetProvider.getAllProviders(context);
                                    ejwi ejwiVarB = b(allProviders, CronetProvider.PROVIDER_NAME_APP_PACKAGED);
                                    if (ejwiVarB.g()) {
                                        builderB = (ExperimentalCronetEngine.Builder) ((CronetProvider) ejwiVarB.c()).createBuilder();
                                    } else {
                                        ejwi ejwiVarB2 = b(allProviders, "Google-Play-Services-Cronet-Provider");
                                        if (ejwiVarB2.g()) {
                                            builderB = (ExperimentalCronetEngine.Builder) ((CronetProvider) ejwiVarB2.c()).createBuilder();
                                        } else {
                                            ejwi ejwiVarB3 = b(allProviders, CronetProvider.PROVIDER_NAME_FALLBACK);
                                            if (!ejwiVarB3.g()) {
                                                throw new IllegalStateException("No Cronet Provider available");
                                            }
                                            builderB = (ExperimentalCronetEngine.Builder) ((CronetProvider) ejwiVarB3.c()).createBuilder();
                                        }
                                    }
                                } else {
                                    builderB = new ExperimentalCronetEngine.Builder(context);
                                }
                            }
                            for (espz espzVar : set) {
                                builderB.addQuicHint(espzVar.c(), espzVar.b(), espzVar.a());
                            }
                            ejwi ejwiVar2 = (ejwi) ((eyig) fcsuVar).a;
                            if (ejwiVar2.g() && set2.isEmpty()) {
                                throw new IllegalArgumentException("Google digests were provided, but no hostnames were pinned - this is either a security vulnerability or a waste of APK size. Add hostnames, or remove the dep on google digests.");
                            }
                            if (!set2.isEmpty() && !ejwiVar2.g()) {
                                throw new IllegalArgumentException("Pinning was requested, but digests weren't provided. Add a dependency on the google digests.");
                            }
                            ekqg ekqgVarListIterator = ((ekon) set2).listIterator();
                            while (ekqgVarListIterator.hasNext()) {
                                espy espyVar = (espy) ekqgVarListIterator.next();
                                builderB.addPublicKeyPins(espyVar.a(), (Set<byte[]>) ejwiVar2.c(), espyVar.c(), espyVar.b());
                            }
                            threadPolicy = StrictMode.getThreadPolicy();
                            try {
                                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                                builderB.enableQuic(((espw) obj).e());
                                builderB.enableBrotli(false);
                                if (((espw) obj).d() != null) {
                                    builderB.setExperimentalOptions(((espw) obj).d());
                                }
                                if (((espw) obj).b() != 20) {
                                    builderB.setThreadPriority(((espw) obj).b());
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                                builderB.enableHttpCache(0, 0L);
                                builderB.enableNetworkQualityEstimator(false);
                                esqd esqdVar2 = new esqd(builderB.build(), builderB.getDefaultUserAgent());
                                StrictMode.setThreadPolicy(threadPolicy);
                                this.f = esqdVar2;
                            } finally {
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    } finally {
                    }
                }
            }
            esqd esqdVar3 = this.f;
            eieuVarK.close();
            return esqdVar3;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
