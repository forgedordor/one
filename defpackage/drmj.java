package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drmj implements drob {
    public final drnf a;
    private final ekgb b;

    public drmj(Context context) {
        this.a = drnf.e(context);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        final drny drnyVar = drny.b;
        if (drnyVar == null) {
            synchronized (drny.class) {
                drnyVar = drny.b;
                if (drnyVar == null) {
                    drnyVar = new drny(context);
                    ListenableFuture listenableFuture = drnyVar.h;
                    if (listenableFuture != null && !listenableFuture.isDone()) {
                        drnyVar.h.cancel(false);
                    }
                    drod drodVar = drnyVar.e;
                    final drmp drmpVar = (drmp) drodVar;
                    drnyVar.h = eooq.f(((drmp) drodVar).b.a(), new ejvr() { // from class: drmn
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            drnr drnrVar;
                            int i2;
                            drnr drnrVar2 = (drnr) obj;
                            drmp drmpVar2 = drmpVar;
                            String string = drmpVar2.d.a().getString("emoji_variant_global_prefs", "");
                            try {
                                drnrVar = (drnr) evsn.parseFrom(drnr.a, eldz.e.k(string), evrr.a());
                            } catch (evtj | IllegalArgumentException e) {
                                ((ekrd) ((ekrd) ((ekrd) drng.a.i()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "retrieveBackupForGlobalPreference", 'd', "EmojiVariantPreferencesBackupHelper.java")).q("Unable to parse the retrieved backup proto");
                                drnrVar = null;
                            }
                            int i3 = 0;
                            if (!TextUtils.isEmpty(string)) {
                                ekrg ekrgVar = drvi.a;
                                drvg.a.b(drnk.a, 3);
                            }
                            HashMap map = new HashMap();
                            if (!((Boolean) drng.d.b()).booleanValue() || drnrVar == null) {
                                i2 = 0;
                            } else {
                                droh drohVar = drnrVar.c;
                                if (drohVar == null) {
                                    drohVar = droh.a;
                                }
                                ekgb ekgbVarN = ekgb.n(drohVar.b);
                                int iC = drmp.c(ekgbVarN);
                                int iB = drmp.b(ekgbVarN);
                                map.putAll(DesugarCollections.unmodifiableMap(drnrVar.d));
                                i2 = iB;
                                i3 = iC;
                            }
                            droh drohVar2 = drnrVar2.c;
                            if (drohVar2 == null) {
                                drohVar2 = droh.a;
                            }
                            ekgb ekgbVarN2 = ekgb.n(drohVar2.b);
                            int iC2 = drmp.c(ekgbVarN2);
                            if (iC2 != 0) {
                                i3 = iC2;
                            }
                            int iB2 = drmp.b(ekgbVarN2);
                            if (iB2 != 0) {
                                i2 = iB2;
                            }
                            map.putAll(DesugarCollections.unmodifiableMap(drnrVar2.d));
                            drnp drnpVar = (drnp) drnr.a.createBuilder();
                            drog drogVar = (drog) droh.a.createBuilder();
                            if (i3 != 0) {
                                droe droeVar = (droe) drof.a.createBuilder();
                                droeVar.copyOnWrite();
                                drof drofVar = (drof) droeVar.instance;
                                drofVar.c = Integer.valueOf(i3 - 1);
                                drofVar.b = 1;
                                drogVar.a(droeVar);
                            }
                            if (i2 != 0) {
                                droe droeVar2 = (droe) drof.a.createBuilder();
                                droeVar2.copyOnWrite();
                                drof drofVar2 = (drof) droeVar2.instance;
                                drofVar2.c = Integer.valueOf(i2 - 1);
                                drofVar2.b = 2;
                                drogVar.a(droeVar2);
                            }
                            droh drohVar3 = (droh) drogVar.build();
                            drnpVar.copyOnWrite();
                            drnr drnrVar3 = (drnr) drnpVar.instance;
                            drohVar3.getClass();
                            drnrVar3.c = drohVar3;
                            drnrVar3.b |= 1;
                            drnpVar.a(map);
                            drnr drnrVar4 = (drnr) drnpVar.build();
                            if (!drnrVar4.equals(drnrVar2)) {
                                drmpVar2.a(drnrVar4);
                            }
                            return drnrVar4;
                        }
                    }, ((drmp) drodVar).c);
                    drnyVar.i = eork.d(drnyVar.h, drnyVar.f.k).a(new Callable() { // from class: drnv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            drny drnyVar2 = drnyVar;
                            drnr drnrVar = (drnr) drnm.a(drnyVar2.h, drnr.a);
                            drnyVar2.d.putAll(DesugarCollections.unmodifiableMap(drnrVar.d));
                            droh drohVar = drnrVar.c;
                            if (drohVar == null) {
                                drohVar = droh.a;
                            }
                            drnyVar2.c.set(drohVar);
                            return null;
                        }
                    }, drnyVar.g);
                    eork.r(drnyVar.i, new drnx(), drnyVar.g);
                    drny.b = drnyVar;
                }
            }
        }
        ekfwVar.h(drnyVar);
        final drom dromVar = drom.b;
        if (dromVar == null) {
            synchronized (drom.class) {
                dromVar = drom.b;
                if (dromVar == null) {
                    dromVar = new drom(context);
                    ListenableFuture listenableFuture2 = dromVar.h;
                    if (listenableFuture2 != null && !listenableFuture2.isDone()) {
                        dromVar.h.cancel(true);
                    }
                    drod drodVar2 = dromVar.f;
                    final drmt drmtVar = (drmt) drodVar2;
                    dromVar.h = eork.m(new Callable() { // from class: drmr
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ekgi ekgiVar = new ekgi();
                            drmt drmtVar2 = drmtVar;
                            for (String str : drmtVar2.d.a().getStringSet("emoji_variant_prefs", ekon.a)) {
                                List listI = drng.c.i(str);
                                if (listI.size() == 2) {
                                    ekgiVar.i((String) listI.get(0), (String) listI.get(1));
                                } else {
                                    ((ekrd) ((ekrd) drng.a.j()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "retrieveBackup", 148, "EmojiVariantPreferencesBackupHelper.java")).t("Malformed entry in serialized emoji variant preferences: %s", str);
                                }
                            }
                            ekgp ekgpVarC = ekgiVar.c();
                            if (!ekgpVarC.isEmpty()) {
                                ekrg ekrgVar = drvi.a;
                                drvg.a.b(drnk.a, 1);
                            }
                            HashMap map = new HashMap(ekgpVarC);
                            Object map2 = new HashMap();
                            synchronized (drmtVar2.e) {
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(drmtVar2.a());
                                    try {
                                        map2 = DesugarCollections.unmodifiableMap(((drnj) evsn.parseFrom(drnj.a, fileInputStream, evrr.a())).b);
                                        map.putAll(map2);
                                        fileInputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    ((ekrd) ((ekrd) ((ekrd) drmt.a.i()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider", "loadFromStickyPreferences", 102, "DefaultStickyPreferencesProtoProvider.java")).q("Failed to load sticky preferences from file");
                                }
                            }
                            drni drniVar = (drni) drnj.a.createBuilder();
                            drniVar.a(map);
                            drnj drnjVar = (drnj) drniVar.build();
                            if (((Boolean) drng.d.b()).booleanValue() && !ekmi.m(ekgpVarC, map2)) {
                                drmtVar2.b(drnjVar);
                            }
                            return drnjVar;
                        }
                    }, ((drmt) drodVar2).c);
                    dromVar.g = eork.d(dromVar.h, dromVar.c.k).a(new Callable() { // from class: drok
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ekrg ekrgVar = drom.a;
                            ((ekrd) ((ekrd) ekrgVar.g()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "initStickyVariantsPreferences", 97, "StickyVariantsPreferences.java")).q("Successfully load sticky preferences from disk");
                            final drom dromVar2 = dromVar;
                            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((drnj) drnm.a(dromVar2.h, drnj.a)).b);
                            Map map = dromVar2.d;
                            map.putAll(mapUnmodifiableMap);
                            drnf drnfVar = dromVar2.c;
                            ekhx ekhxVarO = ekhx.o(!drnl.a(drnfVar.k) ? ekon.a : ((ekgd) drnfVar.i.get()).x());
                            if (ekhxVarO.containsAll(map.keySet())) {
                                return null;
                            }
                            ekhx ekhxVarF = ekpg.b(map.keySet(), ekhxVarO).f();
                            ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 162, "StickyVariantsPreferences.java")).r("Attempting to migrate %d sticky preferences to new base variant", ekhxVarF.size());
                            ekqg ekqgVarListIterator = ekhxVarF.listIterator();
                            while (ekqgVarListIterator.hasNext()) {
                                String str = (String) ekqgVarListIterator.next();
                                final String str2 = (String) map.get(str);
                                if (str2 == null) {
                                    ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 168, "StickyVariantsPreferences.java")).t("%s not found in base variant --> sticky variant map", str);
                                } else {
                                    ejwi ejwiVarC = ekis.c(ekhxVarO, new ejwm() { // from class: drol
                                        @Override // defpackage.ejwm
                                        public final boolean a(Object obj) {
                                            return dromVar2.c.c((String) obj).contains(str2);
                                        }
                                    });
                                    if (ejwiVarC.g()) {
                                        ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 181, "StickyVariantsPreferences.java")).D("Migrated sticky preference for %s to new base variant %s", str, ejwiVarC);
                                        map.put((String) ejwiVarC.c(), str2);
                                    } else {
                                        ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences", "maybeMigrateBaseVariantKeys", 177, "StickyVariantsPreferences.java")).D("%s missing in variant map, discarding sticky preference for old base variant %s", str2, str);
                                    }
                                    map.remove(str);
                                }
                            }
                            ((drmt) dromVar2.f).b(dromVar2.a());
                            return null;
                        }
                    }, dromVar.e);
                    drom.b = dromVar;
                }
            }
        }
        ekfwVar.h(dromVar);
        this.b = ekfwVar.g();
    }

    @Override // defpackage.drob
    public final /* synthetic */ droa a() {
        return this.a;
    }

    @Override // defpackage.droc
    public final ListenableFuture b() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                return eork.a(arrayList).a(new Callable() { // from class: drmi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, eoqg.a);
            }
            arrayList.add(((droc) ekgbVar.get(i)).b());
            i++;
        }
    }

    @Override // defpackage.droc
    public final String c(String str) {
        String strC;
        String strK = null;
        int i = 0;
        drny drnyVar = null;
        drom dromVar = null;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                break;
            }
            droc drocVar = (droc) ekgbVar.get(i);
            if (drocVar instanceof drny) {
                drnyVar = (drny) drocVar;
            }
            if (drocVar instanceof drom) {
                dromVar = (drom) drocVar;
            }
            i++;
        }
        drnz drnzVarA = this.a.a(str);
        if (drnyVar == null || drnzVarA == drnz.SKINTONE_AND_GENDER_DIRECTIONAL) {
            strC = null;
        } else {
            strC = drnyVar.c(str);
            if (strC != null) {
                return strC;
            }
        }
        if (dromVar == null) {
            return strC;
        }
        String str2 = (String) dromVar.d.get(dromVar.c.d(str));
        if (drnyVar != null) {
            if (str2 != null) {
                str = str2;
            }
            drnf drnfVar = drnyVar.f;
            droh drohVarB = drnfVar.b(str);
            if (drohVarB != null && ekis.q(drohVarB.b, new drns()) && ekis.q(drohVarB.b, new drnt())) {
                drof drofVarG = drnyVar.g();
                if (drofVarG == null) {
                    drofVarG = drny.f(drohVarB);
                }
                drof drofVarH = drnyVar.h();
                if (drofVarH == null) {
                    drofVarH = drny.i(drohVarB);
                }
                strK = drnyVar.k(drnfVar.d(str), drny.j(drofVarH, drofVarG, drnyVar.a(str)));
            }
        }
        return strK == null ? str2 : strK;
    }

    @Override // defpackage.droc
    public final boolean d(String str) {
        int i = 0;
        boolean z = false;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                return z;
            }
            z = ((droc) ekgbVar.get(i)).d(str) || z;
            i++;
        }
    }

    @Override // defpackage.droc
    public final int e() {
        ekgb ekgbVar = this.b;
        if (ekgbVar.isEmpty()) {
            return 1;
        }
        return ((droc) ekgbVar.get(0)).e();
    }
}
