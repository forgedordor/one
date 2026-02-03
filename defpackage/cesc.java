package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesc implements espx {
    public static final Map a = fcwa.g(new fcti(CronetProvider.PROVIDER_NAME_APP_PACKAGED, 0), new fcti("Google-Play-Services-Cronet-Provider", 1), new fcti(CronetProvider.PROVIDER_NAME_FALLBACK, 2));
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory");
    private final Context c;

    public cesc(Context context) {
        context.getClass();
        this.c = context;
    }

    public final CronetProvider a() {
        Object next;
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(this.c);
        ekrg ekrgVar = b;
        ekrd ekrdVar = (ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "selectProvider", 67, "CronetEngineBuilderFactory.kt");
        allProviders.getClass();
        ekrdVar.t("Found Cronet providers: %s", fcva.aF(allProviders, null, null, null, new fdap() { // from class: cesa
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Map map = cesc.a;
                String name = ((CronetProvider) obj).getName();
                name.getClass();
                return name;
            }
        }, 31));
        Iterator it = fcva.al(allProviders, new cesb()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CronetProvider) next).isEnabled()) {
                break;
            }
        }
        CronetProvider cronetProvider = (CronetProvider) next;
        if (cronetProvider == null) {
            throw new IllegalStateException("Unable to find any enabled Cronet provider");
        }
        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "selectProvider", 81, "CronetEngineBuilderFactory.kt")).D("Selected Cronet provider is %s, version %s", cronetProvider.getName(), cronetProvider.getVersion());
        return cronetProvider;
    }

    @Override // defpackage.espx
    public final ExperimentalCronetEngine.Builder b() {
        CronetProvider cronetProviderA = a();
        if (fdbq.f(cronetProviderA.getName(), CronetProvider.PROVIDER_NAME_FALLBACK)) {
            ((ekrd) b.j().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "createBuilder", 43, "CronetEngineBuilderFactory.kt")).q("No native Cronet provider found");
            throw new IllegalStateException("No native Cronet provider found");
        }
        try {
            CronetEngine.Builder builderCreateBuilder = cronetProviderA.createBuilder();
            builderCreateBuilder.getClass();
            return (ExperimentalCronetEngine.Builder) builderCreateBuilder;
        } catch (ClassCastException e) {
            ((ekrd) b.j().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "createBuilder", 49, "CronetEngineBuilderFactory.kt")).q("Failed cast to ExperimentalCronetEngine.Builder");
            throw new IllegalStateException("Failed cast to ExperimentalCronetEngine.Builder", e);
        }
    }
}
