package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.hobbes.chat.common.PredictorResult;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cree {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils");
    public final fcsu b;
    public final eosc c;
    public final eosc d;
    public final eosc e;
    public final cogw f;
    public final Context g;
    private final Map h = new HashMap();
    private final egpe i;

    public cree(Context context, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, cogw cogwVar) {
        this.g = context;
        this.b = fcsuVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = eoscVar3;
        this.f = cogwVar;
        ejxx.a(new ejxr() { // from class: crdi
            @Override // defpackage.ejxr
            public final Object get() throws IOException {
                ejir ejirVarE;
                cree creeVar = this.a;
                crek.a(creeVar.f, creeVar.g);
                ejju ejjuVarG = creeVar.g();
                if (((Boolean) crem.q.e()).booleanValue()) {
                    ejirVarE = creeVar.f();
                } else if (((Boolean) ((cczi) crem.r.get()).e()).booleanValue()) {
                    ejiq ejiqVar = (ejiq) ejir.a.createBuilder();
                    ejiqVar.a(creeVar.f().b);
                    ejiqVar.a(creeVar.e(false).b);
                    ejirVarE = (ejir) ejiqVar.build();
                } else {
                    ejirVarE = creeVar.e(true);
                }
                ejkj ejkjVarH = creeVar.h(ejirVarE);
                ejjuVarG.copyOnWrite();
                ejjv ejjvVar = (ejjv) ejjuVarG.instance;
                ejjv ejjvVar2 = ejjv.a;
                ejkjVarH.getClass();
                ejjvVar.f = ejkjVarH;
                ejjvVar.b |= 8;
                return (ejjv) ejjuVarG.build();
            }
        });
        this.i = new egpe(new eooy() { // from class: crdj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final cree creeVar = this.a;
                return eijx.f(new Runnable() { // from class: crdt
                    @Override // java.lang.Runnable
                    public final void run() {
                        cree creeVar2 = creeVar;
                        crek.a(creeVar2.f, creeVar2.g);
                    }
                }, creeVar.e).i(new eooz() { // from class: crdu
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eiju eijuVarB;
                        boolean zBooleanValue = ((Boolean) crem.q.e()).booleanValue();
                        final cree creeVar2 = creeVar;
                        if (zBooleanValue) {
                            eijuVarB = creeVar2.c();
                        } else if (((Boolean) ((cczi) crem.r.get()).e()).booleanValue()) {
                            final eiju eijuVarC = creeVar2.c();
                            final eiju eijuVarB2 = creeVar2.b(false);
                            eijuVarB = eijx.k(eijuVarC, eijuVarB2).a(new Callable() { // from class: crdl
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ejiq ejiqVar = (ejiq) ejir.a.createBuilder();
                                    ejiqVar.a(((ejir) eork.q(eijuVarC)).b);
                                    ejiqVar.a(((ejir) eork.q(eijuVarB2)).b);
                                    return (ejir) ejiqVar.build();
                                }
                            }, creeVar2.d);
                        } else {
                            eijuVarB = creeVar2.b(true);
                        }
                        ejvr ejvrVar = new ejvr() { // from class: crdm
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return creeVar2.h((ejir) obj2);
                            }
                        };
                        eosc eoscVar4 = creeVar2.c;
                        return eijuVarB.h(ejvrVar, eoscVar4).h(new ejvr() { // from class: crdy
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ejkj ejkjVar = (ejkj) obj2;
                                ejju ejjuVarG = creeVar2.g();
                                ejjuVarG.copyOnWrite();
                                ejjv ejjvVar = (ejjv) ejjuVarG.instance;
                                ejjv ejjvVar2 = ejjv.a;
                                ejkjVar.getClass();
                                ejjvVar.f = ejkjVar;
                                ejjvVar.b |= 8;
                                return (ejjv) ejjuVarG.build();
                            }
                        }, eoscVar4);
                    }
                }, creeVar.d);
            }
        }, eoscVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ejha d(String str) {
        if (TextUtils.isEmpty(str)) {
            return ejha.a;
        }
        ekgb ekgbVarJ = j(str);
        return ekgbVarJ.isEmpty() ? ejha.a : (ejha) ekgbVarJ.get(0);
    }

    public static ekgb j(String str) {
        ejxk ejxkVarA = ejxk.b(':').f().a();
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (String str2 : ejxk.b(',').f().a().g(str)) {
            if (!str2.isEmpty()) {
                List listI = ejxkVarA.i(str2);
                if (listI.size() == 2) {
                    ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
                    ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
                    String str3 = (String) listI.get(0);
                    ejhbVar.copyOnWrite();
                    ejhc ejhcVar = (ejhc) ejhbVar.instance;
                    str3.getClass();
                    ejhcVar.b |= 1;
                    ejhcVar.c = str3;
                    String str4 = (String) listI.get(1);
                    ejhbVar.copyOnWrite();
                    ejhc ejhcVar2 = (ejhc) ejhbVar.instance;
                    str4.getClass();
                    ejhcVar2.b = 2 | ejhcVar2.b;
                    ejhcVar2.d = str4;
                    ejgzVar.copyOnWrite();
                    ejha ejhaVar = (ejha) ejgzVar.instance;
                    ejhc ejhcVar3 = (ejhc) ejhbVar.build();
                    ejhcVar3.getClass();
                    ejhaVar.c = ejhcVar3;
                    ejhaVar.b |= 1;
                    ekfwVar.h((ejha) ejgzVar.build());
                } else {
                    if (listI.size() != 1) {
                        throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s", str));
                    }
                    ejgz ejgzVar2 = (ejgz) ejha.a.createBuilder();
                    String str5 = (String) listI.get(0);
                    ejgzVar2.copyOnWrite();
                    ejha ejhaVar2 = (ejha) ejgzVar2.instance;
                    str5.getClass();
                    ejhaVar2.b = 2 | ejhaVar2.b;
                    ejhaVar2.d = str5;
                    ekfwVar.h((ejha) ejgzVar2.build());
                }
            }
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final eiju m() {
        eiju eijuVarE;
        if (((Boolean) crbf.k.e()).booleanValue() && (TextUtils.isEmpty((CharSequence) crbf.o.e()) || TextUtils.isEmpty((CharSequence) crbf.p.e()))) {
            return eijx.e(Optional.empty());
        }
        cczi ccziVar = crem.l;
        if (TextUtils.isEmpty((CharSequence) ccziVar.e())) {
            eijuVarE = eijx.e(Optional.empty());
        } else {
            final ekgb ekgbVarJ = j((String) ccziVar.e());
            if (((ekoe) ekgbVarJ).c != 1) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1155, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for in-apk multi-task config: %s", ccziVar.e());
                eijuVarE = eijx.e(Optional.empty());
            } else {
                eijs eijsVar = new eijs(((ejly) this.b.b()).c((ejha) ekgbVarJ.get(0)));
                eopo eopoVar = new eopo() { // from class: crdz
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj) {
                        return this.a.k((InputStream) obj, ekgbVarJ);
                    }
                };
                eosc eoscVar = this.d;
                eijuVarE = eijsVar.f(eopoVar, eoscVar).h().e(FileNotFoundException.class, new ejvr() { // from class: crea
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekrw ekrwVarJ2 = cree.a.j();
                        ekrwVarJ2.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g((FileNotFoundException) obj)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1169, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", ejlx.b((ejha) ekgbVarJ.get(0)));
                        return Optional.empty();
                    }
                }, eoscVar).e(IOException.class, new ejvr() { // from class: creb
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekrw ekrwVarJ2 = cree.a.j();
                        ekrwVarJ2.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g((IOException) obj)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1178, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", ejlx.b((ejha) ekgbVarJ.get(0)));
                        return Optional.empty();
                    }
                }, eoscVar);
            }
        }
        return eijuVarE.h(new ejvr() { // from class: crdn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.l((Optional) obj);
            }
        }, this.c);
    }

    private static ejha n(String str, String str2, Optional optional) {
        ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
            ejhbVar.copyOnWrite();
            ejhc ejhcVar = (ejhc) ejhbVar.instance;
            str.getClass();
            ejhcVar.b |= 1;
            ejhcVar.c = str;
            ejhbVar.copyOnWrite();
            ejhc ejhcVar2 = (ejhc) ejhbVar.instance;
            str2.getClass();
            ejhcVar2.b |= 2;
            ejhcVar2.d = str2;
            ejgzVar.copyOnWrite();
            ejha ejhaVar = (ejha) ejgzVar.instance;
            ejhc ejhcVar3 = (ejhc) ejhbVar.build();
            ejhcVar3.getClass();
            ejhaVar.c = ejhcVar3;
            ejhaVar.b |= 1;
        }
        if (optional.isPresent()) {
            Object obj = optional.get();
            ejgzVar.copyOnWrite();
            ejha ejhaVar2 = (ejha) ejgzVar.instance;
            ejhaVar2.b |= 2;
            ejhaVar2.d = (String) obj;
        }
        return (ejha) ejgzVar.build();
    }

    private static ejid o(String str, double d) {
        ejid ejidVar = (ejid) ejie.a.createBuilder();
        ejidVar.copyOnWrite();
        ejie ejieVar = (ejie) ejidVar.instance;
        ejieVar.b |= 1;
        ejieVar.e = str;
        ejidVar.copyOnWrite();
        ejie ejieVar2 = (ejie) ejidVar.instance;
        ejieVar2.c = 3;
        ejieVar2.d = Float.valueOf((float) d);
        return ejidVar;
    }

    private static ejif p(String str, int i) {
        ejif ejifVar = (ejif) ejig.a.createBuilder();
        ejifVar.copyOnWrite();
        ejig ejigVar = (ejig) ejifVar.instance;
        ejigVar.b |= 1;
        ejigVar.c = str;
        ejifVar.copyOnWrite();
        ejig ejigVar2 = (ejig) ejifVar.instance;
        ejigVar2.b |= 2;
        ejigVar2.d = i;
        return ejifVar;
    }

    private static ekgd q(String str) {
        ejxk ejxkVarA = ejxk.b('|').f().a();
        ejxk ejxkVarA2 = ejxk.b(':').f().a();
        ekgc ekgcVar = new ekgc();
        for (String str2 : ejxk.b(',').f().a().g(str)) {
            if (!str2.isEmpty()) {
                List listI = ejxkVarA.i(str2);
                if (listI.size() != 2) {
                    throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s", str));
                }
                String str3 = (String) listI.get(0);
                String str4 = (String) listI.get(1);
                List listI2 = ejxkVarA2.i(str3);
                if (listI2.size() == 2) {
                    ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
                    ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
                    String str5 = (String) listI2.get(0);
                    ejhbVar.copyOnWrite();
                    ejhc ejhcVar = (ejhc) ejhbVar.instance;
                    str5.getClass();
                    ejhcVar.b |= 1;
                    ejhcVar.c = str5;
                    String str6 = (String) listI2.get(1);
                    ejhbVar.copyOnWrite();
                    ejhc ejhcVar2 = (ejhc) ejhbVar.instance;
                    str6.getClass();
                    ejhcVar2.b = 2 | ejhcVar2.b;
                    ejhcVar2.d = str6;
                    ejgzVar.copyOnWrite();
                    ejha ejhaVar = (ejha) ejgzVar.instance;
                    ejhc ejhcVar3 = (ejhc) ejhbVar.build();
                    ejhcVar3.getClass();
                    ejhaVar.c = ejhcVar3;
                    ejhaVar.b |= 1;
                    ekgcVar.b(str4, (ejha) ejgzVar.build());
                } else {
                    if (listI2.size() != 1) {
                        throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s because of invalid non-role: %s", str, str3));
                    }
                    ejgz ejgzVar2 = (ejgz) ejha.a.createBuilder();
                    String str7 = (String) listI.get(0);
                    ejgzVar2.copyOnWrite();
                    ejha ejhaVar2 = (ejha) ejgzVar2.instance;
                    str7.getClass();
                    ejhaVar2.b = 2 | ejhaVar2.b;
                    ejhaVar2.d = str7;
                    ekgcVar.b(str4, (ejha) ejgzVar2.build());
                }
            }
        }
        return ekgcVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    private final Optional r() throws IOException {
        Optional optionalEmpty;
        if (((Boolean) crbf.k.e()).booleanValue() && (TextUtils.isEmpty((CharSequence) crbf.o.e()) || TextUtils.isEmpty((CharSequence) crbf.p.e()))) {
            return Optional.empty();
        }
        cczi ccziVar = crem.l;
        if (TextUtils.isEmpty((CharSequence) ccziVar.e())) {
            optionalEmpty = Optional.empty();
        } else {
            ekgb ekgbVarJ = j((String) ccziVar.e());
            if (((ekoe) ekgbVarJ).c != 1) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1120, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for in-apk multi-task config: %s", ccziVar.e());
                optionalEmpty = Optional.empty();
            } else {
                try {
                    InputStream inputStreamF = ((ejly) this.b.b()).f((ejha) ekgbVarJ.get(0));
                    try {
                        Optional optionalK = k(inputStreamF, ekgbVarJ);
                        if (inputStreamF != null) {
                            inputStreamF.close();
                        }
                        optionalEmpty = optionalK;
                    } catch (Throwable th) {
                        if (inputStreamF != null) {
                            try {
                                inputStreamF.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    ekrw ekrwVarJ2 = a.j();
                    ekrwVarJ2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1128, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", ejlx.b((ejha) ekgbVarJ.get(0)));
                    optionalEmpty = Optional.empty();
                } catch (IOException e2) {
                    ekrw ekrwVarJ3 = a.j();
                    ekrwVarJ3.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ3).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1132, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", ejlx.b((ejha) ekgbVarJ.get(0)));
                    optionalEmpty = Optional.empty();
                }
            }
        }
        return l(optionalEmpty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.InputStream] */
    private final String s(String str) throws Throwable {
        Exception e;
        InputStream inputStream;
        File file;
        FileOutputStream fileOutputStream;
        ?? OpenRawResource = this.g;
        File cacheDir = OpenRawResource.getCacheDir();
        String strConcat = "smarts_cache_item_".concat(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                Map map = this.h;
                if (map.containsKey(str) && ((File) map.get(str)).exists()) {
                    return ((File) this.h.get(str)).getAbsolutePath();
                }
                OpenRawResource = OpenRawResource.getResources().openRawResource(OpenRawResource.getResources().getIdentifier(str, "raw", OpenRawResource.getPackageName()));
                try {
                    file = new File(cacheDir, strConcat);
                    if (file.exists() && file.length() > 0) {
                        if (OpenRawResource.available() == file.length()) {
                            this.h.put(str, file);
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                                long length = randomAccessFile.length();
                                randomAccessFile.setLength(1 + length);
                                randomAccessFile.setLength(length);
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            String absolutePath = file.getAbsolutePath();
                            if (OpenRawResource != 0) {
                                try {
                                    OpenRawResource.close();
                                } catch (IOException unused2) {
                                }
                            }
                            return absolutePath;
                        }
                        if (file.delete()) {
                            file = new File(cacheDir, strConcat);
                        }
                    }
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e2) {
                    e = e2;
                    inputStream = OpenRawResource;
                }
                try {
                    elec.a(OpenRawResource, fileOutputStream);
                    OpenRawResource.close();
                    fileOutputStream.close();
                    map.put(str, file);
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        fileOutputStream.close();
                        if (OpenRawResource != 0) {
                            OpenRawResource.close();
                        }
                    } catch (IOException unused3) {
                    }
                    return absolutePath2;
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    inputStream = OpenRawResource;
                    ekrw ekrwVarI = a.i();
                    ekrwVarI.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getFileFromResources", 1345, "SmartSuggestionConfigUtils.java")).t("SmartSuggestionConfigUtils: Error reading %s", str);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused4) {
                            return "";
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                    if (OpenRawResource != 0) {
                        OpenRawResource.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            OpenRawResource = 0;
        }
    }

    private final String t() {
        return s("multi_lite_9head_20200301_model");
    }

    private static final ejjr u() {
        ejjr ejjrVar = (ejjr) ejjt.a.createBuilder();
        int iIntValue = ((Integer) crax.a.e()).intValue();
        ejjrVar.copyOnWrite();
        ejjt ejjtVar = (ejjt) ejjrVar.instance;
        ejjtVar.b |= 1;
        ejjtVar.e = iIntValue;
        return ejjrVar;
    }

    private final Optional v(int i) {
        return !Locale.ENGLISH.getLanguage().equals(craf.c(this.g).getLanguage()) ? Optional.empty() : i == 3 ? Optional.of(s("sensitive_classifier_20191012")) : Optional.of(s("sensitive_classifier_20171221_whitelisted_v2"));
    }

    public final eiju a() {
        return eiju.g(this.i.c());
    }

    public final eiju b(boolean z) {
        final ejiq ejiqVar = (ejiq) ejir.a.createBuilder();
        return (z ? m() : eijx.e(Optional.empty())).i(new eooz() { // from class: crdr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ejiq ejiqVar2 = ejiqVar;
                ejiqVar2.getClass();
                ((Optional) obj).ifPresent(new crec(ejiqVar2));
                ekgb ekgbVarJ = cree.j((String) crbf.L.e());
                final ArrayList arrayList = new ArrayList();
                int i = ((ekoe) ekgbVarJ).c;
                int i2 = 0;
                while (true) {
                    cree creeVar = this.a;
                    if (i2 >= i) {
                        return eijx.j(arrayList).a(new Callable() { // from class: cred
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    ejiq ejiqVar3 = ejiqVar2;
                                    if (!it.hasNext()) {
                                        return (ejir) ejiqVar3.build();
                                    }
                                    Iterator it2 = ((List) eork.q((eiju) it.next())).iterator();
                                    while (it2.hasNext()) {
                                        ejiqVar3.b((ejip) it2.next());
                                    }
                                }
                            }
                        }, creeVar.d);
                    }
                    final ejha ejhaVar = (ejha) ekgbVarJ.get(i2);
                    eiju eijuVarH = new eijs(((ejly) creeVar.b.b()).c(ejhaVar)).g(new eopl() { // from class: crdo
                        @Override // defpackage.eopl
                        public final eopy a(eopt eoptVar, Object obj2) {
                            InputStream inputStream = (InputStream) obj2;
                            if (inputStream != null) {
                                return new eopy(eijx.e(((ejir) evsn.parseFrom(ejir.a, inputStream, evrr.a())).b));
                            }
                            ejha ejhaVar2 = ejhaVar;
                            ekrw ekrwVarJ = cree.a.j();
                            ekrwVarJ.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 617, "SmartSuggestionConfigUtils.java")).t("Null fileInputStream for file: %s", ejlx.b(ejhaVar2));
                            int i3 = ekgb.d;
                            return new eopy(eijx.e(ekoe.a));
                        }
                    }, creeVar.c).h();
                    ejvr ejvrVar = new ejvr() { // from class: crdp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrw ekrwVarJ = cree.a.j();
                            ekrwVarJ.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((FileNotFoundException) obj2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 637, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", ejlx.b(ejhaVar));
                            int i3 = ekgb.d;
                            return ekoe.a;
                        }
                    };
                    eosc eoscVar = creeVar.d;
                    arrayList.add(eijuVarH.e(FileNotFoundException.class, ejvrVar, eoscVar).e(IOException.class, new ejvr() { // from class: crdq
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrw ekrwVarJ = cree.a.j();
                            ekrwVarJ.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((IOException) obj2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 646, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", ejlx.b(ejhaVar));
                            int i3 = ekgb.d;
                            return ekoe.a;
                        }
                    }, eoscVar));
                    i2++;
                }
            }
        }, this.d);
    }

    public final eiju c() {
        final ekgd ekgdVarQ = q((String) crem.p.e());
        eiju eijuVarM = m();
        ejvr ejvrVar = new ejvr() { // from class: crdv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.i((Optional) obj, ekgdVarQ);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarM.h(ejvrVar, eoscVar).h(new ejvr() { // from class: crdx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejiq ejiqVar = (ejiq) ejir.a.createBuilder();
                ejiqVar.a((ekgb) obj);
                return (ejir) ejiqVar.build();
            }
        }, eoscVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final ejir e(boolean z) throws IOException {
        ejir ejirVar = ejir.a;
        ejiq ejiqVar = (ejiq) ejirVar.createBuilder();
        if (z) {
            Optional optionalR = r();
            ejiqVar.getClass();
            optionalR.ifPresent(new crec(ejiqVar));
        }
        ekgb ekgbVarJ = j((String) crbf.L.e());
        int i = ((ekoe) ekgbVarJ).c;
        for (int i2 = 0; i2 < i; i2++) {
            ejha ejhaVar = (ejha) ekgbVarJ.get(i2);
            try {
                InputStream inputStreamF = ((ejly) this.b.b()).f(ejhaVar);
                try {
                    ejiqVar.a(((ejir) evsn.parseFrom(ejirVar, inputStreamF, evrr.a())).b);
                    if (inputStreamF != null) {
                        inputStreamF.close();
                    }
                } catch (Throwable th) {
                    if (inputStreamF != null) {
                        try {
                            inputStreamF.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedProviders", 542, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", ejlx.b(ejhaVar));
            } catch (IOException e2) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedProviders", 545, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", ejlx.b(ejhaVar));
            }
        }
        return (ejir) ejiqVar.build();
    }

    @Deprecated
    public final ejir f() {
        ekgd ekgdVarQ = q((String) crem.p.e());
        ejiq ejiqVar = (ejiq) ejir.a.createBuilder();
        ejiqVar.a(i(r(), ekgdVarQ));
        return (ejir) ejiqVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ejju g() {
        ejjt ejjtVar;
        Optional optionalOf;
        ejju ejjuVar = (ejju) ejjv.a.createBuilder();
        ejia ejiaVar = (ejia) ejib.a.createBuilder();
        float fFloatValue = ((Double) crbf.l.e()).floatValue();
        ejiaVar.copyOnWrite();
        ejib ejibVar = (ejib) ejiaVar.instance;
        ejibVar.b |= 1;
        ejibVar.c = fFloatValue;
        List listC = cssr.c((String) crbf.s.e());
        ejiaVar.copyOnWrite();
        ejib ejibVar2 = (ejib) ejiaVar.instance;
        evtg evtgVar = ejibVar2.d;
        if (!evtgVar.c()) {
            ejibVar2.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(listC, ejibVar2.d);
        ejib ejibVar3 = (ejib) ejiaVar.build();
        ejjuVar.copyOnWrite();
        ejjv ejjvVar = (ejjv) ejjuVar.instance;
        ejibVar3.getClass();
        ejjvVar.c = ejibVar3;
        ejjvVar.b |= 1;
        if (((Boolean) crax.d.e()).booleanValue()) {
            ejjr ejjrVarU = u();
            ejic ejicVar = (ejic) ejih.a.createBuilder();
            ejha ejhaVarN = n((String) crax.b.e(), (String) crax.c.e(), v(3));
            ejicVar.copyOnWrite();
            ejih ejihVar = (ejih) ejicVar.instance;
            ejhaVarN.getClass();
            ejihVar.c = ejhaVarN;
            ejihVar.b |= 1;
            ejif ejifVar = (ejif) ejig.a.createBuilder();
            ejifVar.copyOnWrite();
            ejig ejigVar = (ejig) ejifVar.instance;
            ejigVar.b |= 1;
            ejigVar.c = PredictorResult.Types.REPLY_SUGGESTION;
            ejifVar.copyOnWrite();
            ejig ejigVar2 = (ejig) ejifVar.instance;
            ejigVar2.b |= 2;
            ejigVar2.d = 2;
            ejifVar.copyOnWrite();
            ejig ejigVar3 = (ejig) ejifVar.instance;
            ejigVar3.b |= 4;
            ejigVar3.e = 0.5d;
            ejicVar.b(ejifVar);
            ejicVar.copyOnWrite();
            ejih ejihVar2 = (ejih) ejicVar.instance;
            ejihVar2.g = 2;
            ejihVar2.b |= 4;
            ejjrVarU.copyOnWrite();
            ejjt ejjtVar2 = (ejjt) ejjrVarU.instance;
            ejih ejihVar3 = (ejih) ejicVar.build();
            ejjt ejjtVar3 = ejjt.a;
            ejihVar3.getClass();
            ejjtVar2.d = ejihVar3;
            ejjtVar2.c = 3;
            ejjtVar = (ejjt) ejjrVarU.build();
        } else {
            ejjr ejjrVarU2 = u();
            ejha ejhaVarN2 = n((String) crax.b.e(), (String) crax.c.e(), v(2));
            ejjrVarU2.copyOnWrite();
            ejjt ejjtVar4 = (ejjt) ejjrVarU2.instance;
            ejjt ejjtVar5 = ejjt.a;
            ejhaVarN2.getClass();
            ejjtVar4.d = ejhaVarN2;
            ejjtVar4.c = 2;
            ejjtVar = (ejjt) ejjrVarU2.build();
        }
        ejjuVar.copyOnWrite();
        ejjv ejjvVar2 = (ejjv) ejjuVar.instance;
        ejjtVar.getClass();
        ejjvVar2.d = ejjtVar;
        ejjvVar2.b |= 2;
        ejkg ejkgVar = (ejkg) ejkh.a.createBuilder();
        String str = (String) crbf.g.e();
        if (!TextUtils.isEmpty(str)) {
            List listI = ejxk.b(',').i(str);
            ejkgVar.copyOnWrite();
            ejkh ejkhVar = (ejkh) ejkgVar.instance;
            evtg evtgVar2 = ejkhVar.b;
            if (!evtgVar2.c()) {
                ejkhVar.b = evsn.mutableCopy(evtgVar2);
            }
            evpz.addAll(listI, ejkhVar.b);
        }
        String str2 = (String) crbf.h.e();
        if (!TextUtils.isEmpty(str2)) {
            List listI2 = ejxk.b(',').i(str2);
            ejkgVar.copyOnWrite();
            ejkh ejkhVar2 = (ejkh) ejkgVar.instance;
            evtg evtgVar3 = ejkhVar2.c;
            if (!evtgVar3.c()) {
                ejkhVar2.c = evsn.mutableCopy(evtgVar3);
            }
            evpz.addAll(listI2, ejkhVar2.c);
        }
        String str3 = (String) crbf.i.e();
        if (!TextUtils.isEmpty(str3)) {
            List listI3 = ejxk.b(',').i(str3);
            ejkgVar.copyOnWrite();
            ejkh ejkhVar3 = (ejkh) ejkgVar.instance;
            evtg evtgVar4 = ejkhVar3.d;
            if (!evtgVar4.c()) {
                ejkhVar3.d = evsn.mutableCopy(evtgVar4);
            }
            evpz.addAll(listI3, ejkhVar3.d);
        }
        String str4 = (String) crbf.j.e();
        if (!TextUtils.isEmpty(str4)) {
            List listI4 = ejxk.b(',').i(str4);
            ejkgVar.copyOnWrite();
            ejkh ejkhVar4 = (ejkh) ejkgVar.instance;
            evtg evtgVar5 = ejkhVar4.e;
            if (!evtgVar5.c()) {
                ejkhVar4.e = evsn.mutableCopy(evtgVar5);
            }
            evpz.addAll(listI4, ejkhVar4.e);
        }
        ejkh ejkhVar5 = (ejkh) ejkgVar.build();
        ejjuVar.copyOnWrite();
        ejjv ejjvVar3 = (ejjv) ejjuVar.instance;
        ejkhVar5.getClass();
        ejjvVar3.e = ejkhVar5;
        ejjvVar3.b |= 4;
        ejha ejhaVarD = d((String) crbf.z.e());
        ejjuVar.copyOnWrite();
        ejjv ejjvVar4 = (ejjv) ejjuVar.instance;
        ejhaVarD.getClass();
        ejjvVar4.g = ejhaVarD;
        ejjvVar4.b |= 16;
        boolean zBooleanValue = ((Boolean) crbf.f.e()).booleanValue();
        ejjuVar.copyOnWrite();
        ejjv ejjvVar5 = (ejjv) ejjuVar.instance;
        ejjvVar5.b |= 64;
        ejjvVar5.h = zBooleanValue;
        final ejiv ejivVar = (ejiv) ejji.b.createBuilder();
        ejivVar.a(ezan.SPAM);
        ejivVar.a(ezan.SILENT);
        ejivVar.a(ezan.BUSINESS_MESSAGE);
        ejivVar.a(ezan.CALENDAR);
        ejjk ejjkVar = ejjk.a;
        ejivVar.copyOnWrite();
        ejji ejjiVar = (ejji) ejivVar.instance;
        ejjkVar.getClass();
        ejjiVar.g = ejjkVar;
        ejjiVar.c |= 2;
        if (((Boolean) crax.e.e()).booleanValue()) {
            ejivVar.a(ezan.STARRING);
        }
        cczv cczvVar = crem.b;
        if (!((Boolean) cczvVar.e()).booleanValue()) {
            ejix ejixVar = ejix.a;
            ejivVar.copyOnWrite();
            ejji ejjiVar2 = (ejji) ejivVar.instance;
            ejixVar.getClass();
            ejjiVar2.e = ejixVar;
            ejjiVar2.d = 1;
        } else if (((Boolean) cczvVar.e()).booleanValue()) {
            try {
                cczi ccziVar = crem.c;
                ekgb ekgbVarJ = j((String) ccziVar.e());
                if (((ekoe) ekgbVarJ).c != 1) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", 383, "SmartSuggestionConfigUtils.java")).t("Found more than one flag for model based reranker config: %s", ccziVar.e());
                    optionalOf = Optional.empty();
                } else {
                    ejja ejjaVar = (ejja) ejjh.b.createBuilder();
                    evsz evszVar = new evsz(((crdg) evsn.parseFrom(crdg.b, (byte[]) crem.v.e(), evrr.a())).c, crdg.a);
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar = (ejjh) ejjaVar.instance;
                    evsx evsxVar = ejjhVar.m;
                    if (!evsxVar.c()) {
                        ejjhVar.m = evsn.mutableCopy(evsxVar);
                    }
                    Iterator<T> it = evszVar.iterator();
                    while (it.hasNext()) {
                        ejjhVar.m.h(((ezan) it.next()).a());
                    }
                    ejha ejhaVar = (ejha) ekgbVarJ.get(0);
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar2 = (ejjh) ejjaVar.instance;
                    ejjhVar2.d = ejhaVar;
                    ejjhVar2.c |= 1;
                    int iIntValue = ((Integer) crem.e.e()).intValue();
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar3 = (ejjh) ejjaVar.instance;
                    ejjhVar3.c |= 2;
                    ejjhVar3.e = iIntValue;
                    int iA = ejje.a(((Integer) crem.f.e()).intValue());
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar4 = (ejjh) ejjaVar.instance;
                    int i = iA - 1;
                    if (iA == 0) {
                        throw null;
                    }
                    ejjhVar4.f = i;
                    ejjhVar4.c |= 4;
                    float fFloatValue2 = ((Double) crem.g.e()).floatValue();
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar5 = (ejjh) ejjaVar.instance;
                    ejjhVar5.c |= 8;
                    ejjhVar5.g = fFloatValue2;
                    boolean zBooleanValue2 = ((Boolean) crem.h.e()).booleanValue();
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar6 = (ejjh) ejjaVar.instance;
                    ejjhVar6.c |= 16;
                    ejjhVar6.h = zBooleanValue2;
                    boolean zBooleanValue3 = ((Boolean) crem.i.e()).booleanValue();
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar7 = (ejjh) ejjaVar.instance;
                    ejjhVar7.c |= 32;
                    ejjhVar7.i = zBooleanValue3;
                    int iIntValue2 = ((Integer) crem.j.e()).intValue();
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar8 = (ejjh) ejjaVar.instance;
                    ejjhVar8.c |= 64;
                    ejjhVar8.j = iIntValue2;
                    int iA2 = ejjg.a(((Integer) crem.k.e()).intValue());
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar9 = (ejjh) ejjaVar.instance;
                    int i2 = iA2 - 1;
                    if (iA2 == 0) {
                        throw null;
                    }
                    ejjhVar9.k = i2;
                    ejjhVar9.c |= 128;
                    int iA3 = ejjc.a(((Integer) crem.d.e()).intValue());
                    ejjaVar.copyOnWrite();
                    ejjh ejjhVar10 = (ejjh) ejjaVar.instance;
                    int i3 = iA3 - 1;
                    if (iA3 == 0) {
                        throw null;
                    }
                    ejjhVar10.l = i3;
                    ejjhVar10.c |= 256;
                    optionalOf = Optional.of((ejjh) ejjaVar.build());
                }
            } catch (evtj e) {
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", (char) 409, "SmartSuggestionConfigUtils.java")).q("Could not parse the Reranker Exempt Types list from the Phenotype flag.");
            } catch (IllegalArgumentException unused) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", 412, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for model based reranker config: %s", crem.c.e());
            }
            optionalOf.ifPresent(new Consumer() { // from class: crdh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ejiv ejivVar2 = ejivVar;
                    ejjh ejjhVar11 = (ejjh) obj;
                    ejivVar2.copyOnWrite();
                    ejji ejjiVar3 = (ejji) ejivVar2.instance;
                    evsy evsyVar = ejji.a;
                    ejjhVar11.getClass();
                    ejjiVar3.e = ejjhVar11;
                    ejjiVar3.d = 2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            optionalOf = Optional.empty();
            optionalOf.ifPresent(new Consumer() { // from class: crdh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ejiv ejivVar2 = ejivVar;
                    ejjh ejjhVar11 = (ejjh) obj;
                    ejivVar2.copyOnWrite();
                    ejji ejjiVar3 = (ejji) ejivVar2.instance;
                    evsy evsyVar = ejji.a;
                    ejjhVar11.getClass();
                    ejjiVar3.e = ejjhVar11;
                    ejjiVar3.d = 2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ejji ejjiVar3 = (ejji) ejivVar.build();
        ejjuVar.copyOnWrite();
        ejjv ejjvVar6 = (ejjv) ejjuVar.instance;
        ejjiVar3.getClass();
        ejjvVar6.i = ejjiVar3;
        ejjvVar6.b |= 128;
        ejjz ejjzVar = ejjz.a;
        ejjuVar.copyOnWrite();
        ejjv ejjvVar7 = (ejjv) ejjuVar.instance;
        ejjzVar.getClass();
        ejjvVar7.j = ejjzVar;
        ejjvVar7.b |= 256;
        ejjw ejjwVar = (ejjw) ejjx.a.createBuilder();
        boolean zBooleanValue4 = ((Boolean) ((cczi) crem.t.get()).e()).booleanValue();
        ejjwVar.copyOnWrite();
        ejjx ejjxVar = (ejjx) ejjwVar.instance;
        ejjxVar.b |= 1;
        ejjxVar.c = zBooleanValue4;
        boolean zBooleanValue5 = ((Boolean) ((cczi) crem.u.get()).e()).booleanValue();
        ejjwVar.copyOnWrite();
        ejjx ejjxVar2 = (ejjx) ejjwVar.instance;
        ejjxVar2.b |= 2;
        ejjxVar2.d = zBooleanValue5;
        ejjwVar.copyOnWrite();
        ejjx ejjxVar3 = (ejjx) ejjwVar.instance;
        ejjxVar3.b |= 4;
        ejjxVar3.e = false;
        ejjuVar.copyOnWrite();
        ejjv ejjvVar8 = (ejjv) ejjuVar.instance;
        ejjx ejjxVar4 = (ejjx) ejjwVar.build();
        ejjxVar4.getClass();
        ejjvVar8.k = ejjxVar4;
        ejjvVar8.b |= 512;
        return ejjuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ejkj h(ejir ejirVar) throws IOException {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        final ejki ejkiVar = (ejki) ejkj.a.createBuilder();
        if (ejirVar.b.size() > 0) {
            ejkiVar.copyOnWrite();
            ejkj ejkjVar = (ejkj) ejkiVar.instance;
            ejirVar.getClass();
            ejkjVar.d = ejirVar;
            ejkjVar.b |= 2;
        }
        ekgb ekgbVarJ = j((String) crbf.K.e());
        ejkiVar.copyOnWrite();
        ejkj ejkjVar2 = (ejkj) ejkiVar.instance;
        evtg evtgVar = ejkjVar2.f;
        if (!evtgVar.c()) {
            ejkjVar2.f = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(ekgbVarJ, ejkjVar2.f);
        cczi ccziVar = crbf.v;
        if (((Integer) ccziVar.e()).intValue() > 0) {
            ejke ejkeVar = (ejke) ejkf.a.createBuilder();
            int iIntValue = ((Integer) ccziVar.e()).intValue();
            ejkeVar.copyOnWrite();
            ejkf ejkfVar = (ejkf) ejkeVar.instance;
            ejkfVar.b |= 1;
            ejkfVar.c = iIntValue;
            optionalEmpty = Optional.of((ejkf) ejkeVar.build());
        } else {
            optionalEmpty = Optional.empty();
        }
        ejkiVar.getClass();
        optionalEmpty.ifPresent(new Consumer() { // from class: crds
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ejki ejkiVar2 = ejkiVar;
                ejkf ejkfVar2 = (ejkf) obj;
                ejkiVar2.copyOnWrite();
                ejkj ejkjVar3 = (ejkj) ejkiVar2.instance;
                ejkj ejkjVar4 = ejkj.a;
                ejkfVar2.getClass();
                ejkjVar3.g = ejkfVar2;
                ejkjVar3.b |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ekgb ekgbVarJ2 = j((String) creq.b.e());
        if (ekgbVarJ2.isEmpty()) {
            optionalEmpty2 = Optional.empty();
        } else {
            ejha ejhaVar = (ejha) ekgbVarJ2.get(0);
            ejkl ejklVar = ejkl.a;
            try {
                InputStream inputStreamF = ((ejly) this.b.b()).f(ejhaVar);
                try {
                    ejkl ejklVar2 = (ejkl) evsn.parseFrom(ejkl.a, inputStreamF, evrr.a());
                    if (inputStreamF != null) {
                        inputStreamF.close();
                    }
                    cczv cczvVar = creq.c;
                    if (((Long) cczvVar.e()).longValue() != 0) {
                        ejkk ejkkVar = (ejkk) ejklVar2.toBuilder();
                        long jLongValue = ((Long) cczvVar.e()).longValue();
                        ejkkVar.copyOnWrite();
                        ejkl ejklVar3 = (ejkl) ejkkVar.instance;
                        ejklVar3.b |= 1;
                        ejklVar3.c = jLongValue;
                        ejklVar2 = (ejkl) ejkkVar.build();
                    }
                    cczv cczvVar2 = creq.d;
                    if (((Integer) cczvVar2.e()).intValue() != -1) {
                        ejkk ejkkVar2 = (ejkk) ejklVar2.toBuilder();
                        int iIntValue2 = ((Integer) cczvVar2.e()).intValue();
                        ejkkVar2.copyOnWrite();
                        ejkl ejklVar4 = (ejkl) ejkkVar2.instance;
                        ejklVar4.b |= 4;
                        ejklVar4.e = iIntValue2;
                        ejklVar2 = (ejkl) ejkkVar2.build();
                    }
                    cczv cczvVar3 = creq.e;
                    if (((Integer) cczvVar3.e()).intValue() != -1) {
                        ejkk ejkkVar3 = (ejkk) ejklVar2.toBuilder();
                        int iIntValue3 = ((Integer) cczvVar3.e()).intValue();
                        ejkkVar3.copyOnWrite();
                        ejkl ejklVar5 = (ejkl) ejkkVar3.instance;
                        ejklVar5.b |= 8;
                        ejklVar5.f = iIntValue3;
                        ejklVar2 = (ejkl) ejkkVar3.build();
                    }
                    optionalEmpty2 = Optional.of(ejklVar2);
                } catch (Throwable th) {
                    if (inputStreamF != null) {
                        try {
                            inputStreamF.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetTemporalSuggestionProviderConfig", 759, "SmartSuggestionConfigUtils.java")).t("Could not find TemporalSuggestionProviderConfig file: %s", creq.b.e());
                optionalEmpty2 = Optional.empty();
            } catch (IOException e2) {
                ekrw ekrwVarI2 = a.i();
                ekrwVarI2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetTemporalSuggestionProviderConfig", 764, "SmartSuggestionConfigUtils.java")).t("Error reading TemporalSuggestionProviderConfig FileSpec: %s", creq.b.e());
                optionalEmpty2 = Optional.empty();
            }
        }
        optionalEmpty2.ifPresent(new Consumer() { // from class: crdw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ejki ejkiVar2 = ejkiVar;
                ejkl ejklVar6 = (ejkl) obj;
                ejkiVar2.copyOnWrite();
                ejkj ejkjVar3 = (ejkj) ejkiVar2.instance;
                ejkj ejkjVar4 = ejkj.a;
                ejklVar6.getClass();
                ejkjVar3.h = ejklVar6;
                ejkjVar3.b |= 16;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        boolean zA = admg.a();
        ejkiVar.copyOnWrite();
        ejkj ejkjVar3 = (ejkj) ejkiVar.instance;
        ejkjVar3.b |= 32;
        ejkjVar3.i = zA;
        ejkiVar.copyOnWrite();
        ejkj ejkjVar4 = (ejkj) ejkiVar.instance;
        ejkjVar4.b |= 64;
        ejkjVar4.j = true;
        ejkc ejkcVar = (ejkc) ejkd.a.createBuilder();
        boolean zBooleanValue = ((Boolean) ((cczi) czzm.a.get()).e()).booleanValue();
        ejkcVar.copyOnWrite();
        ejkd ejkdVar = (ejkd) ejkcVar.instance;
        ejkdVar.b |= 1;
        ejkdVar.c = zBooleanValue;
        ejkcVar.copyOnWrite();
        ejkd ejkdVar2 = (ejkd) ejkcVar.instance;
        ejkdVar2.b |= 2;
        ejkdVar2.d = false;
        ejkiVar.copyOnWrite();
        ejkj ejkjVar5 = (ejkj) ejkiVar.instance;
        ejkd ejkdVar3 = (ejkd) ejkcVar.build();
        ejkdVar3.getClass();
        ejkjVar5.k = ejkdVar3;
        ejkjVar5.b |= 128;
        return (ejkj) ejkiVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekgb i(Optional optional, ekgd ekgdVar) throws IOException {
        InputStream inputStreamF;
        ejir ejirVar;
        final ekgc ekgcVar = new ekgc();
        optional.ifPresent(new Consumer() { // from class: crdk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String str = (String) crem.s.e();
                ekgcVar.b(str, (ejip) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ekqg ekqgVarListIterator = ekgdVar.x().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            String str = (String) ekqgVarListIterator.next();
            ekgb<ejha> ekgbVarA = ekgdVar.a(str);
            try {
                ekfw ekfwVar = new ekfw();
                for (ejha ejhaVar : ekgbVarA) {
                    try {
                        try {
                            try {
                                inputStreamF = ((ejly) this.b.b()).f(ejhaVar);
                                try {
                                    ejirVar = (ejir) evsn.parseFrom(ejir.a, inputStreamF, evrr.a());
                                } catch (Throwable th) {
                                    if (inputStreamF != null) {
                                        try {
                                            inputStreamF.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e) {
                                e = e;
                                ekrw ekrwVarI = a.i();
                                ekrwVarI.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getCascadedModelBasedProviderConfigsFromBaseModel", 847, "SmartSuggestionConfigUtils.java")).t("Failed to parse ModelBasedProvidersConfig for role: %s", str);
                            }
                        } catch (FileNotFoundException e2) {
                            ekrw ekrwVarJ = a.j();
                            ekrwVarJ.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "parseModelBasedProviderConfigsFromFileSpecsWithBackoff", 894, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", ejlx.b(ejhaVar));
                        }
                    } catch (IOException e3) {
                        ekrw ekrwVarJ2 = a.j();
                        ekrwVarJ2.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e3)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "parseModelBasedProviderConfigsFromFileSpecsWithBackoff", 897, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", ejlx.b(ejhaVar));
                    }
                    if (ejirVar.b.size() != 1) {
                        throw new crdd();
                    }
                    ejip ejipVar = (ejip) ejirVar.b.get(0);
                    if (ejipVar.b.size() != 1) {
                        throw new IllegalStateException("ModelBasedProviderConfig must have exactly one ModelConfigItem.");
                    }
                    ekfwVar.h(ejipVar);
                    if (inputStreamF != null) {
                        inputStreamF.close();
                    }
                }
                ekgcVar.d(str, ekfwVar.g());
            } catch (Exception e4) {
                e = e4;
            }
        }
        ekgd ekgdVarA = ekgcVar.a();
        ekfw ekfwVar2 = new ekfw();
        ekqg ekqgVarListIterator2 = ekgdVarA.x().listIterator();
        while (ekqgVarListIterator2.hasNext()) {
            String str2 = (String) ekqgVarListIterator2.next();
            ekgb ekgbVarA2 = ekgdVarA.a(str2);
            if (ekgbVarA2.isEmpty()) {
                ekrw ekrwVarJ3 = a.j();
                ekrwVarJ3.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getBackoffCascades", 927, "SmartSuggestionConfigUtils.java")).t("Failed to create backoff cascade with role: %s", str2);
            } else {
                ejis ejisVar = (ejis) ((ejit) ((ejip) ekgbVarA2.get(0)).b.get(0)).toBuilder();
                int i = 1;
                while (i < ekgbVarA2.size()) {
                    ejis ejisVar2 = (ejis) ((ejit) ((ejip) ekgbVarA2.get(i)).b.get(0)).toBuilder();
                    ejisVar2.copyOnWrite();
                    ejit ejitVar = (ejit) ejisVar2.instance;
                    ejit ejitVar2 = (ejit) ejisVar.build();
                    ejitVar2.getClass();
                    ejitVar.e = ejitVar2;
                    ejitVar.b |= 2;
                    i++;
                    ejisVar = ejisVar2;
                }
                ejio ejioVar = (ejio) ejip.a.createBuilder();
                ejioVar.a(ejisVar);
                ekfwVar2.h((ejip) ejioVar.build());
            }
        }
        return ekfwVar2.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional k(InputStream inputStream, ekgb ekgbVar) {
        if (inputStream == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getDownloadedLinguaModelConfigFromInputStream", 1192, "SmartSuggestionConfigUtils.java")).t("Null fileInputStream for file: %s", ejlx.b((ejha) ekgbVar.get(0)));
            return Optional.empty();
        }
        ejic ejicVar = (ejic) ((ejih) evsn.parseFrom(ejih.a, inputStream, evrr.a())).toBuilder();
        ejicVar.copyOnWrite();
        ejih ejihVar = (ejih) ejicVar.instance;
        ejihVar.g = 2;
        ejihVar.b |= 4;
        ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
        String strT = t();
        ejgzVar.copyOnWrite();
        ejha ejhaVar = (ejha) ejgzVar.instance;
        strT.getClass();
        ejhaVar.b = 2 | ejhaVar.b;
        ejhaVar.d = strT;
        ejicVar.copyOnWrite();
        ejih ejihVar2 = (ejih) ejicVar.instance;
        ejha ejhaVar2 = (ejha) ejgzVar.build();
        ejhaVar2.getClass();
        ejihVar2.c = ejhaVar2;
        ejihVar2.b |= 1;
        return Optional.of((ejih) ejicVar.build());
    }

    public final Optional l(Optional optional) {
        ejih ejihVar;
        if (optional.isPresent()) {
            ejihVar = (ejih) optional.get();
        } else {
            ejic ejicVar = (ejic) ejih.a.createBuilder();
            ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
            String strT = t();
            ejgzVar.copyOnWrite();
            ejha ejhaVar = (ejha) ejgzVar.instance;
            strT.getClass();
            ejhaVar.b |= 2;
            ejhaVar.d = strT;
            ejicVar.copyOnWrite();
            ejih ejihVar2 = (ejih) ejicVar.instance;
            ejha ejhaVar2 = (ejha) ejgzVar.build();
            ejhaVar2.getClass();
            ejihVar2.c = ejhaVar2;
            ejihVar2.b |= 1;
            ejicVar.copyOnWrite();
            ejih ejihVar3 = (ejih) ejicVar.instance;
            ejihVar3.g = 2;
            ejihVar3.b |= 4;
            ejicVar.copyOnWrite();
            ejih ejihVar4 = (ejih) ejicVar.instance;
            ejihVar4.b |= 2;
            ejihVar4.f = 0;
            ejicVar.a(o("empirical_probability_factor", ((Double) crem.m.e()).doubleValue()));
            ejicVar.a(o("diversification_distance_threshold", ((Double) crem.o.e()).doubleValue()));
            ejicVar.a(o("confidence_threshold", ((Double) crem.n.e()).doubleValue()));
            cczi ccziVar = crbf.b;
            int iIntValue = ((Integer) ccziVar.e()).intValue();
            cczi ccziVar2 = crbf.y;
            ejicVar.b(p("SPAM", iIntValue * ((Integer) ccziVar2.e()).intValue()));
            ejicVar.b(p(PredictorResult.Types.REPLY_SUGGESTION, ((Integer) ccziVar.e()).intValue() * ((Integer) ccziVar2.e()).intValue()));
            ejihVar = (ejih) ejicVar.build();
        }
        ejio ejioVar = (ejio) ejip.a.createBuilder();
        ejis ejisVar = (ejis) ejit.a.createBuilder();
        ejisVar.copyOnWrite();
        ejit ejitVar = (ejit) ejisVar.instance;
        ejihVar.getClass();
        ejitVar.d = ejihVar;
        ejitVar.c = 7;
        ejioVar.a(ejisVar);
        return Optional.of((ejip) ejioVar.build());
    }
}
