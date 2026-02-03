package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dige implements digf {
    private static final ekrg a = ekrg.c("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl");
    private final Context b;
    private final Uri c;

    public dige(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    private final Bundle f(String str, String str2, Optional optional) {
        final Bundle bundle = new Bundle();
        bundle.putString("storage_file_name", "bugle_mobile_configuration");
        bundle.putString("preference_key", str2);
        optional.ifPresent(new Consumer() { // from class: digd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bundle.putString("preference_value", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        try {
            return this.b.getContentResolver().call(this.c, str, "STRING", bundle);
        } catch (IllegalArgumentException | IllegalStateException e) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "callContentProvider", 'J', "BugleConfigurationManagerImpl.java")).q("error in callContentProvider");
            return null;
        }
    }

    @Override // defpackage.digf
    public final ekhx a(ekgp ekgpVar) throws difk {
        ekhv ekhvVar = new ekhv();
        ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            String str = (String) entry.getKey();
            digh dighVar = (digh) d(str).orElse(digh.a);
            if (fbfz.a.get().b(this.b)) {
                etse etseVar = dighVar.c;
                if (etseVar == null) {
                    etseVar = etse.a;
                }
                etto ettoVar = etseVar.f;
                if (ettoVar == null) {
                    ettoVar = etto.a;
                }
                etto ettoVar2 = ((etse) entry.getValue()).f;
                if (ettoVar2 == null) {
                    ettoVar2 = etto.a;
                }
                if (!ettoVar.equals(ettoVar2)) {
                    ekhvVar.c((String) entry.getKey());
                    digg diggVar = (digg) dighVar.toBuilder();
                    etse etseVar2 = (etse) entry.getValue();
                    diggVar.copyOnWrite();
                    digh dighVar2 = (digh) diggVar.instance;
                    etseVar2.getClass();
                    dighVar2.c = etseVar2;
                    dighVar2.b |= 1;
                    e(str, (digh) diggVar.build());
                }
            } else {
                etse etseVar3 = dighVar.c;
                if (etseVar3 == null) {
                    etseVar3 = etse.a;
                }
                if (!etseVar3.equals(entry.getValue())) {
                    ekhvVar.c((String) entry.getKey());
                    digg diggVar2 = (digg) dighVar.toBuilder();
                    etse etseVar22 = (etse) entry.getValue();
                    diggVar2.copyOnWrite();
                    digh dighVar22 = (digh) diggVar2.instance;
                    etseVar22.getClass();
                    dighVar22.c = etseVar22;
                    dighVar22.b |= 1;
                    e(str, (digh) diggVar2.build());
                }
            }
        }
        return ekhvVar.g();
    }

    @Override // defpackage.digf
    public final Optional b() {
        ekgp ekgpVar = (ekgp) c().orElse(ekoj.a);
        Instant instantMinusSeconds = Instant.now().minusSeconds(fbfz.a.get().a(this.b));
        ekhv ekhvVar = new ekhv();
        ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            digh dighVar = (digh) entry.getValue();
            if ((dighVar.b & 8) != 0) {
                evvp evvpVar = dighVar.f;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                if (evwz.d(evvpVar).isBefore(instantMinusSeconds)) {
                    Bundle bundleF = f("REMOVE", (String) entry.getKey(), Optional.empty());
                    if (bundleF == null || bundleF.containsKey("result_error_key")) {
                        ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "deleteStaleConfigs", 186, "BugleConfigurationManagerImpl.java")).q("deleteStaleConfigs: error calling content provider");
                        return Optional.empty();
                    }
                    ekhvVar.c((String) entry.getKey());
                } else {
                    continue;
                }
            }
        }
        return Optional.of(ekhvVar.g());
    }

    @Override // defpackage.digf
    public final Optional c() {
        Bundle bundleF = f("GET", "bugle_all_mobile_configurations", Optional.empty());
        if (bundleF == null || bundleF.containsKey("result_error_key")) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getAllConfigurationData", 107, "BugleConfigurationManagerImpl.java")).q("getAllConfigurationData: error calling content provider");
            return Optional.empty();
        }
        try {
            return Optional.of(ekgp.j(DesugarCollections.unmodifiableMap(((digk) bxme.a(bundleF.getString("preference_key"), digk.a)).b)));
        } catch (evtj unused) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getAllConfigurationData", 118, "BugleConfigurationManagerImpl.java")).q("getAllConfigurationData: error decoding string to proto");
            return Optional.empty();
        }
    }

    @Override // defpackage.digf
    public final Optional d(String str) {
        Bundle bundleF = f("GET", str, Optional.empty());
        if (bundleF == null || bundleF.containsKey("result_error_key")) {
            ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getConfigurationData", 84, "BugleConfigurationManagerImpl.java")).q("getConfigurationData: error calling content provider");
            return Optional.empty();
        }
        String string = bundleF.getString("preference_key");
        try {
            digh dighVar = digh.a;
            digh dighVar2 = (digh) bxme.a(string, dighVar);
            return dighVar2.equals(dighVar) ? Optional.empty() : Optional.of(dighVar2);
        } catch (evtj unused) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getConfigurationData", 97, "BugleConfigurationManagerImpl.java")).q("getConfigurationData: error decoding string to proto");
            return Optional.empty();
        }
    }

    @Override // defpackage.digf
    public final void e(String str, digh dighVar) throws difk {
        Bundle bundleF = f("PUT", str, Optional.of(bxme.b(dighVar)));
        if (bundleF == null || bundleF.containsKey("result_error_key")) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "putConfigurationData", 164, "BugleConfigurationManagerImpl.java")).q("putConfigurationData: error calling content provider");
            throw new difk();
        }
    }
}
