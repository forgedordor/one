package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.util.Objects;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drkh {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory");
    private static final drjx c = new drjx();
    private static final AtomicBoolean d = new AtomicBoolean(false);
    public final File b;
    private final String e;
    private final ekgp f;

    public drkh(File file, String str, Map map) {
        this.b = file;
        this.e = str;
        this.f = ekmi.c(map);
    }

    public static drkf a(final Context context) {
        return (drkf) c.a(new ejxr() { // from class: drka
            @Override // defpackage.ejxr
            public final Object get() {
                long jMax;
                ekrg ekrgVar = drkh.a;
                boolean z = drxx.a;
                int i = 1;
                String str = String.format(Locale.US, "%d_%d", Integer.valueOf(Build.VERSION.SDK_INT), Long.valueOf(Build.TIME));
                Context context2 = context;
                if (drxm.a) {
                    ApplicationInfo applicationInfo = context2.getApplicationInfo();
                    ekhv ekhvVar = new ekhv();
                    ekhvVar.c(applicationInfo.sourceDir);
                    ekhvVar.c(applicationInfo.publicSourceDir);
                    if (applicationInfo.splitSourceDirs != null) {
                        ekhvVar.h(applicationInfo.splitSourceDirs);
                    }
                    if (applicationInfo.splitPublicSourceDirs != null) {
                        ekhvVar.h(applicationInfo.splitPublicSourceDirs);
                    }
                    ekqg ekqgVarListIterator = ekhvVar.g().listIterator();
                    jMax = Long.MIN_VALUE;
                    while (ekqgVarListIterator.hasNext()) {
                        jMax = Math.max(jMax, new File((String) ekqgVarListIterator.next()).lastModified());
                    }
                } else {
                    try {
                        i = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
                    } catch (Exception unused) {
                    }
                    jMax = i;
                }
                return new drkf(str, jMax);
            }
        });
    }

    static File b(Context context) {
        return new File(dryh.a(context).getCacheDir(), "auto_clean");
    }

    static File c(Context context) {
        return new File(dryh.a(context).getFilesDir(), "auto_clean");
    }

    static String d(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    static void e(drxz drxzVar, Context context, drkf drkfVar, File file) throws IOException {
        ArrayList<File> arrayList = new ArrayList();
        try {
            File[] fileArrListFiles = file.getCanonicalFile().listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    try {
                        arrayList.add(file2.getCanonicalFile());
                    } catch (IOException e) {
                        ((ekrd) ((ekrd) ((ekrd) drxz.a.i()).g(e)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "listCanonicalFiles", 867, "FileOperationUtils.java")).t("listCanonicalFiles(): failed to get canonical file [%s]", file2.getAbsolutePath());
                    }
                }
            }
        } catch (IOException e2) {
            ((ekrd) ((ekrd) ((ekrd) drxz.a.i()).g(e2)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "listCanonicalFiles", 855, "FileOperationUtils.java")).t("listCanonicalFiles(): failed to get canonical dir [%s]", file.getAbsolutePath());
        }
        for (File file3 : arrayList) {
            if (file3.isDirectory()) {
                if (Thread.currentThread().isInterrupted()) {
                    ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 325, "AutoCleanableDirectory.java")).q("Thread interruption detected. Abort deletion.");
                    return;
                }
                try {
                } catch (IOException e3) {
                    e = e3;
                }
                if (TextUtils.isEmpty(file3.getName())) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has empty name."));
                }
                File parentFile = file3.getParentFile();
                if (parentFile == null || !(parentFile.equals(b(context)) || parentFile.equals(c(context)))) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" is not located in correct directories."));
                }
                List listI = ejxk.b('|').i(d(file3.getName()));
                String strD = d((String) listI.get(0));
                if (TextUtils.isEmpty(strD)) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" doesn't have a name entry."));
                }
                ejxk ejxkVarB = ejxk.b('>');
                EnumMap enumMap = new EnumMap(drkg.class);
                for (String str : listI.subList(1, listI.size())) {
                    List listI2 = ejxkVarB.i(str);
                    if (listI2.size() != 2) {
                        throw new IOException(String.valueOf(file3) + " has malformed key-value " + str);
                    }
                    if (TextUtils.isEmpty((CharSequence) listI2.get(0))) {
                        throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has empty key."));
                    }
                    try {
                        enumMap.put((EnumMap) Enum.valueOf(drkg.class, ejuf.d((String) listI2.get(0))), (drkg) d((String) listI2.get(1)));
                    } catch (IllegalArgumentException e4) {
                        ((ekrd) ((ekrd) ((ekrd) a.j()).g(e4)).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "fromFile", 230, "AutoCleanableDirectory.java")).t("Key %s is invalid", listI2.get(0));
                    }
                }
                try {
                    drkh drkhVar = new drkh(file3, strD, enumMap);
                    ekgp ekgpVar = drkhVar.f;
                    String str2 = (String) ekgpVar.get(drkg.OS);
                    if (TextUtils.isEmpty(str2) || drkfVar.a.equals(str2)) {
                        String str3 = (String) ekgpVar.get(drkg.APP);
                        if (TextUtils.isEmpty(str3) || Long.toString(drkfVar.b).equals(str3)) {
                        }
                    }
                    try {
                        drxzVar.b(file3);
                        ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 333, "AutoCleanableDirectory.java")).t("%s is deleted", drkhVar);
                    } catch (IOException e5) {
                        e = e5;
                        ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 336, "AutoCleanableDirectory.java")).o();
                    }
                } catch (IllegalArgumentException e6) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has duplicate key."), e6);
                }
            }
        }
    }

    public static drke f(final Context context) {
        if (dryc.a(context) && d.compareAndSet(false, true)) {
            drle.a().e.schedule(new Runnable() { // from class: drkd
                @Override // java.lang.Runnable
                public final void run() throws ClassNotFoundException, IOException {
                    ekrg ekrgVar = drkh.a;
                    try {
                        Class.forName("com.google.android.libraries.inputmethod.cache.module.AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskWorker");
                        ((ekrd) ((ekrd) drkh.a.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "maybeCleanupObsoleteFiles", 179, "AutoCleanableDirectory.java")).q("Clean up task will run on scheduler.");
                    } catch (ClassNotFoundException unused) {
                        Context context2 = context;
                        ekrg ekrgVar2 = drkh.a;
                        ((ekrd) ((ekrd) ekrgVar2.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "maybeCleanupObsoleteFiles", 183, "AutoCleanableDirectory.java")).q("Clean up task runs immediately.");
                        ((ekrd) ((ekrd) ekrgVar2.e()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 299, "AutoCleanableDirectory.java")).t("Cleaning up on %s", Thread.currentThread());
                        drxz drxzVar = drxz.b;
                        File cacheDir = dryh.a(context2).getCacheDir();
                        drkf drkfVarA = drkh.a(context2);
                        drkh.e(drxzVar, context2, drkfVarA, drkh.b(context2));
                        drkh.e(drxzVar, context2, drkfVarA, drkh.c(context2));
                        drxzVar.b(new File(cacheDir, "mozc.data"));
                        drxzVar.b(new File(cacheDir, "BundledEmojiListLoader"));
                        drxzVar.b(new File(cacheDir, "kb_def"));
                        drxzVar.b(new File(cacheDir, "ThemeBuilderActivity_new_image_cache"));
                        drxzVar.c(cacheDir, new FileFilter() { // from class: drkb
                            @Override // java.io.FileFilter
                            public final boolean accept(File file) {
                                ekrg ekrgVar3 = drkh.a;
                                return file.getName().startsWith("keyboardsnapshotcache_") && file.isFile();
                            }
                        });
                        drxzVar.c(cacheDir, new FileFilter() { // from class: drkc
                            @Override // java.io.FileFilter
                            public final boolean accept(File file) {
                                ekrg ekrgVar3 = drkh.a;
                                return file.getName().startsWith("stylesheet_") && file.isFile();
                            }
                        });
                    }
                }
            }, 10L, TimeUnit.SECONDS);
        }
        return new drke(dryh.a(context), a(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drkh)) {
            return false;
        }
        drkh drkhVar = (drkh) obj;
        return Objects.equals(this.b, drkhVar.b) && Objects.equals(this.e, drkhVar.e) && Objects.equals(this.f, drkhVar.f);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.e, this.f);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("directory", this.b);
        ejwfVarB.b("name", this.e);
        ejwfVarB.b("properties", this.f);
        return ejwfVarB.toString();
    }
}
