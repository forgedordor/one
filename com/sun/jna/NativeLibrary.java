package com.sun.jna;

import defpackage.eyfe;
import defpackage.eyfh;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NativeLibrary implements Closeable {
    private static final Level DEBUG_LOAD_LEVEL;
    private static final int DEFAULT_OPEN_OPTIONS = -1;
    private static final Logger LOG = Logger.getLogger(NativeLibrary.class.getName());
    private static final SymbolProvider NATIVE_SYMBOL_PROVIDER;
    private static Method addSuppressedMethod;
    private static final Map<String, Reference<NativeLibrary>> libraries;
    private static final LinkedHashSet<String> librarySearchPath;
    private static final Map<String, List<String>> searchPaths;
    private final int callFlags;
    private final eyfe cleanable;
    private final String encoding;
    private final Map<String, Function> functions;
    private volatile long handle;
    private final String libraryName;
    private final String libraryPath;
    private final Map<String, ?> options;
    private final SymbolProvider symbolProvider;

    /* compiled from: PG */
    private static final class NativeLibraryDisposer implements Runnable {
        private long handle;

        public NativeLibraryDisposer(long j) {
            this.handle = j;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            long j = this.handle;
            if (j != 0) {
                try {
                    Native.close(j);
                } finally {
                    this.handle = 0L;
                }
            }
        }
    }

    static {
        String str;
        DEBUG_LOAD_LEVEL = Native.DEBUG_LOAD ? Level.INFO : Level.FINE;
        NATIVE_SYMBOL_PROVIDER = new SymbolProvider() { // from class: com.sun.jna.NativeLibrary.1
            @Override // com.sun.jna.SymbolProvider
            public long getSymbolAddress(long j, String str2, SymbolProvider symbolProvider) {
                return Native.findSymbol(j, str2);
            }
        };
        libraries = new HashMap();
        searchPaths = new ConcurrentHashMap();
        librarySearchPath = new LinkedHashSet<>();
        if (Native.POINTER_SIZE == 0) {
            throw new Error("Native library not initialized");
        }
        addSuppressedMethod = null;
        try {
            addSuppressedMethod = Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (NoSuchMethodException unused) {
        } catch (SecurityException e) {
            Logger.getLogger(NativeLibrary.class.getName()).logp(Level.SEVERE, "com.sun.jna.NativeLibrary", "<clinit>", "Failed to initialize 'addSuppressed' method", (Throwable) e);
        }
        String webStartLibraryPath = Native.getWebStartLibraryPath("jnidispatch");
        if (webStartLibraryPath != null) {
            librarySearchPath.add(webStartLibraryPath);
        }
        if (System.getProperty("jna.platform.library.path") == null && !Platform.isWindows()) {
            if (Platform.isLinux() || Platform.isSolaris() || Platform.isFreeBSD() || Platform.iskFreeBSD()) {
                str = (true != Platform.isSolaris() ? "" : "/") + (Native.POINTER_SIZE * 8);
            } else {
                str = "";
            }
            String[] strArr = {"/usr/lib".concat(str), "/lib".concat(str), "/usr/lib", "/lib"};
            if (Platform.isLinux() || Platform.iskFreeBSD() || Platform.isGNU()) {
                String multiArchPath = getMultiArchPath();
                strArr = new String[]{"/usr/lib/".concat(multiArchPath), "/lib/".concat(multiArchPath), "/usr/lib".concat(str), "/lib".concat(str), "/usr/lib", "/lib"};
            }
            if (Platform.isLinux()) {
                int length = strArr.length;
                ArrayList<String> linuxLdPaths = getLinuxLdPaths();
                for (int i = length - 1; i >= 0; i--) {
                    int iIndexOf = linuxLdPaths.indexOf(strArr[i]);
                    if (iIndexOf != -1) {
                        linuxLdPaths.remove(iIndexOf);
                    }
                    linuxLdPaths.add(0, strArr[i]);
                }
                strArr = (String[]) linuxLdPaths.toArray(new String[0]);
            }
            String str2 = "";
            String str3 = str2;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                File file = new File(strArr[i2]);
                if (file.exists() && file.isDirectory()) {
                    str2 = str2 + str3 + strArr[i2];
                    str3 = File.pathSeparator;
                }
            }
            if (!"".equals(str2)) {
                System.setProperty("jna.platform.library.path", str2);
            }
        }
        librarySearchPath.addAll(initPaths("jna.platform.library.path"));
    }

    private NativeLibrary(String str, String str2, long j, Map<String, ?> map) {
        HashMap map2 = new HashMap();
        this.functions = map2;
        String libraryName = getLibraryName(str);
        this.libraryName = libraryName;
        this.libraryPath = str2;
        this.handle = j;
        this.cleanable = eyfh.a.a(this, new NativeLibraryDisposer(j));
        Object obj = map.get(Library.OPTION_CALLING_CONVENTION);
        int iIntValue = obj instanceof Number ? ((Number) obj).intValue() : 0;
        this.callFlags = iIntValue;
        this.options = map;
        SymbolProvider symbolProvider = (SymbolProvider) map.get(Library.OPTION_SYMBOL_PROVIDER);
        if (symbolProvider == null) {
            this.symbolProvider = NATIVE_SYMBOL_PROVIDER;
        } else {
            this.symbolProvider = symbolProvider;
        }
        String str3 = (String) map.get(Library.OPTION_STRING_ENCODING);
        String defaultStringEncoding = str3 == null ? Native.getDefaultStringEncoding() : str3;
        this.encoding = defaultStringEncoding;
        if (Platform.isWindows() && "kernel32".equals(libraryName.toLowerCase())) {
            synchronized (map2) {
                map2.put(functionKey("GetLastError", iIntValue, defaultStringEncoding), new Function(this, this, "GetLastError", 63, defaultStringEncoding) { // from class: com.sun.jna.NativeLibrary.2
                    @Override // com.sun.jna.Function
                    public Object invoke(Method method, Class<?>[] clsArr, Class<?> cls, Object[] objArr, Map<String, ?> map3) {
                        return Integer.valueOf(Native.getLastError());
                    }

                    @Override // com.sun.jna.Function
                    public Object invoke(Object[] objArr, Class<?> cls, boolean z, int i) {
                        return Integer.valueOf(Native.getLastError());
                    }
                });
            }
        }
    }

    public static final void addSearchPath(String str, String str2) {
        Map<String, List<String>> map = searchPaths;
        List<String> listSynchronizedList = map.get(str);
        if (listSynchronizedList == null) {
            listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
            map.put(str, listSynchronizedList);
        }
        listSynchronizedList.add(str2);
    }

    private static void addSuppressedReflected(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = addSuppressedMethod;
        if (method == null) {
            return;
        }
        try {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                e = e;
                throw new RuntimeException("Failed to call addSuppressedMethod", e);
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to call addSuppressedMethod", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException("Failed to call addSuppressedMethod", e);
        }
    }

    static void disposeAll() {
        LinkedHashSet linkedHashSet;
        Map<String, Reference<NativeLibrary>> map = libraries;
        synchronized (map) {
            linkedHashSet = new LinkedHashSet(map.values());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            NativeLibrary nativeLibrary = (NativeLibrary) ((Reference) it.next()).get();
            if (nativeLibrary != null) {
                nativeLibrary.close();
            }
        }
    }

    private static String findLibraryPath(String str, Collection<String> collection) {
        if (new File(str).isAbsolute()) {
            return str;
        }
        String strMapSharedLibraryName = mapSharedLibraryName(str);
        for (String str2 : collection) {
            File file = new File(str2, strMapSharedLibraryName);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            if (Platform.isMac() && strMapSharedLibraryName.endsWith(".dylib")) {
                File file2 = new File(str2, String.valueOf(strMapSharedLibraryName.substring(0, strMapSharedLibraryName.lastIndexOf(".dylib"))).concat(".jnilib"));
                if (file2.exists()) {
                    return file2.getAbsolutePath();
                }
            }
        }
        return strMapSharedLibraryName;
    }

    private static String functionKey(String str, int i, String str2) {
        return str + "|" + i + "|" + str2;
    }

    public static final NativeLibrary getInstance(String str) {
        return getInstance(str, (Map<String, ?>) Collections.EMPTY_MAP);
    }

    private String getLibraryName(String str) {
        String strMapSharedLibraryName = mapSharedLibraryName("---");
        int iIndexOf = strMapSharedLibraryName.indexOf("---");
        if (iIndexOf > 0 && str.startsWith(strMapSharedLibraryName.substring(0, iIndexOf))) {
            str = str.substring(iIndexOf);
        }
        int iIndexOf2 = str.indexOf(strMapSharedLibraryName.substring(iIndexOf + 3));
        return iIndexOf2 != -1 ? str.substring(0, iIndexOf2) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<java.lang.String> getLinuxLdPaths() throws java.lang.Throwable {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5f
            java.lang.String r3 = "/sbin/ldconfig -p"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5f
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L60
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L60
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L60
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L60
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L60
        L1e:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            if (r1 == 0) goto L47
            java.lang.String r4 = " => "
            int r4 = r1.indexOf(r4)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r5 = 47
            int r5 = r1.lastIndexOf(r5)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r6 = -1
            if (r4 == r6) goto L1e
            if (r5 == r6) goto L1e
            if (r4 >= r5) goto L1e
            int r4 = r4 + 4
            java.lang.String r1 = r1.substring(r4, r5)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            boolean r4 = r0.contains(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            if (r4 != 0) goto L1e
            r0.add(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            goto L1e
        L47:
            r3.close()     // Catch: java.io.IOException -> L65
            goto L65
        L4b:
            r0 = move-exception
            r1 = r3
            goto L54
        L4e:
            r1 = r3
            goto L60
        L50:
            r0 = move-exception
            goto L54
        L52:
            r0 = move-exception
            r2 = r1
        L54:
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.io.IOException -> L59
        L59:
            if (r2 == 0) goto L5e
            r2.waitFor()     // Catch: java.lang.InterruptedException -> L5e
        L5e:
            throw r0
        L5f:
            r2 = r1
        L60:
            if (r1 == 0) goto L65
            r1.close()     // Catch: java.io.IOException -> L65
        L65:
            if (r2 == 0) goto L6a
            r2.waitFor()     // Catch: java.lang.InterruptedException -> L6a
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.NativeLibrary.getLinuxLdPaths():java.util.ArrayList");
    }

    private static String getMultiArchPath() {
        String str = Platform.ARCH;
        String str2 = Platform.iskFreeBSD() ? "-kfreebsd" : Platform.isGNU() ? "" : "-linux";
        String str3 = "-gnu";
        if (Platform.isIntel()) {
            str = true != Platform.is64Bit() ? "i386" : "x86_64";
        } else if (Platform.isPPC()) {
            str = true != Platform.is64Bit() ? "powerpc" : "powerpc64";
        } else if (Platform.isARM()) {
            str3 = "-gnueabi";
            str = "arm";
        } else if (Platform.ARCH.equals("mips64el")) {
            str3 = "-gnuabi64";
        }
        return str + str2 + str3;
    }

    public static final synchronized NativeLibrary getProcess() {
        return getInstance(null);
    }

    private static List<String> initPaths(String str) {
        String property = System.getProperty(str, "");
        if ("".equals(property)) {
            return Collections.EMPTY_LIST;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property, File.pathSeparator);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!"".equals(strNextToken)) {
                arrayList.add(strNextToken);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isVersionedName(String str) {
        int iLastIndexOf;
        int i;
        if (!str.startsWith("lib") || (iLastIndexOf = str.lastIndexOf(".so.")) == -1 || (i = iLastIndexOf + 4) >= str.length()) {
            return false;
        }
        for (i = iLastIndexOf + 4; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt) && cCharAt != '.') {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ae  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.sun.jna.NativeLibrary loadLibrary(java.lang.String r18, java.util.Map<java.lang.String, ?> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.NativeLibrary.loadLibrary(java.lang.String, java.util.Map):com.sun.jna.NativeLibrary");
    }

    static String mapSharedLibraryName(String str) {
        if (Platform.isMac()) {
            if (str.startsWith("lib") && (str.endsWith(".dylib") || str.endsWith(".jnilib"))) {
                return str;
            }
            String strMapLibraryName = System.mapLibraryName(str);
            return strMapLibraryName.endsWith(".jnilib") ? String.valueOf(strMapLibraryName.substring(0, strMapLibraryName.lastIndexOf(".jnilib"))).concat(".dylib") : strMapLibraryName;
        }
        if (Platform.isLinux() || Platform.isFreeBSD()) {
            if (isVersionedName(str) || str.endsWith(".so")) {
                return str;
            }
        } else if (Platform.isAIX()) {
            if (isVersionedName(str) || str.endsWith(".so") || str.startsWith("lib") || str.endsWith(".a")) {
                return str;
            }
        } else if (Platform.isWindows() && (str.endsWith(".drv") || str.endsWith(".dll") || str.endsWith(".ocx"))) {
            return str;
        }
        String strMapLibraryName2 = System.mapLibraryName(str);
        return (Platform.isAIX() && strMapLibraryName2.endsWith(".so")) ? strMapLibraryName2.replaceAll(".so$", ".a") : strMapLibraryName2;
    }

    static String[] matchFramework(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        File file = new File(str);
        if (!file.isAbsolute()) {
            String[] strArr = {System.getProperty("user.home"), "", "/System"};
            if (!str.contains(".framework")) {
                str = str + ".framework/" + str;
            }
            for (int i = 0; i < 3; i++) {
                File file2 = new File(strArr[i] + "/Library/Frameworks/" + str);
                if (file2.exists()) {
                    return new String[]{file2.getAbsolutePath()};
                }
                linkedHashSet.add(file2.getAbsolutePath());
            }
        } else if (!str.contains(".framework")) {
            File file3 = new File(new File(file.getParentFile(), String.valueOf(file.getName()).concat(".framework")), file.getName());
            if (file3.exists()) {
                return new String[]{file3.getAbsolutePath()};
            }
            linkedHashSet.add(file3.getAbsolutePath());
        } else {
            if (file.exists()) {
                return new String[]{file.getAbsolutePath()};
            }
            linkedHashSet.add(file.getAbsolutePath());
        }
        return (String[]) linkedHashSet.toArray(new String[0]);
    }

    static String matchLibrary(final String str, Collection<String> collection) {
        File file = new File(str);
        if (file.isAbsolute()) {
            collection = Arrays.asList(file.getParent());
        }
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.sun.jna.NativeLibrary.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                StringBuilder sb = new StringBuilder("lib");
                sb.append(str);
                sb.append(".so");
                return (str2.startsWith(sb.toString()) || (str2.startsWith(String.valueOf(str).concat(".so")) && str.startsWith("lib"))) && NativeLibrary.isVersionedName(str2);
            }
        };
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            File[] fileArrListFiles = new File(it.next()).listFiles(filenameFilter);
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                linkedList.addAll(Arrays.asList(fileArrListFiles));
            }
        }
        Iterator it2 = linkedList.iterator();
        String str2 = null;
        double d = -1.0d;
        while (it2.hasNext()) {
            String absolutePath = ((File) it2.next()).getAbsolutePath();
            double version = parseVersion(absolutePath.substring(absolutePath.lastIndexOf(".so.") + 4));
            if (version > d) {
                str2 = absolutePath;
            }
            if (version > d) {
                d = version;
            }
        }
        return str2;
    }

    private static int openFlags(Map<String, ?> map) {
        Object obj = map.get(Library.OPTION_OPEN_FLAGS);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return -1;
    }

    static double parseVersion(String str) {
        String str2;
        int iIndexOf = str.indexOf(".");
        double d = 1.0d;
        double d2 = 0.0d;
        while (str != null) {
            if (iIndexOf != -1) {
                String strSubstring = str.substring(0, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                iIndexOf = strSubstring2.indexOf(".");
                str2 = strSubstring2;
                str = strSubstring;
            } else {
                str2 = null;
            }
            try {
                d2 += Integer.parseInt(str) / d;
                d *= 100.0d;
                str = str2;
            } catch (NumberFormatException unused) {
                return 0.0d;
            }
        }
        return d2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet = new HashSet();
        Map<String, Reference<NativeLibrary>> map = libraries;
        synchronized (map) {
            for (Map.Entry<String, Reference<NativeLibrary>> entry : map.entrySet()) {
                if (entry.getValue().get() == this) {
                    hashSet.add(entry.getKey());
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                libraries.remove((String) it.next());
            }
        }
        synchronized (this) {
            if (this.handle != 0) {
                this.handle = 0L;
                this.cleanable.a();
            }
        }
    }

    @Deprecated
    public void dispose() {
        close();
    }

    public File getFile() {
        String str = this.libraryPath;
        if (str == null) {
            return null;
        }
        return new File(str);
    }

    public Function getFunction(String str) {
        return getFunction(str, this.callFlags);
    }

    public Pointer getGlobalVariableAddress(String str) {
        try {
            return new Pointer(getSymbolAddress(str));
        } catch (UnsatisfiedLinkError e) {
            throw new UnsatisfiedLinkError("Error looking up '" + str + "': " + e.getMessage());
        }
    }

    public String getName() {
        return this.libraryName;
    }

    public Map<String, ?> getOptions() {
        return this.options;
    }

    public long getSymbolAddress(String str) {
        if (this.handle != 0) {
            return this.symbolProvider.getSymbolAddress(this.handle, str, NATIVE_SYMBOL_PROVIDER);
        }
        throw new UnsatisfiedLinkError("Library has been unloaded");
    }

    public String toString() {
        return "Native Library <" + this.libraryPath + "@" + this.handle + ">";
    }

    public static final NativeLibrary getInstance(String str, ClassLoader classLoader) {
        return getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, classLoader));
    }

    public static final synchronized NativeLibrary getProcess(Map<String, ?> map) {
        return getInstance((String) null, map);
    }

    public Function getFunction(String str, int i) {
        return getFunction(str, i, this.encoding);
    }

    public static final NativeLibrary getInstance(String str, Map<String, ?> map) {
        NativeLibrary nativeLibraryLoadLibrary;
        HashMap map2 = new HashMap(map);
        if (map2.get(Library.OPTION_CALLING_CONVENTION) == null) {
            map2.put(Library.OPTION_CALLING_CONVENTION, 0);
        }
        if ((Platform.isLinux() || Platform.isFreeBSD() || Platform.isAIX()) && Platform.C_LIBRARY_NAME.equals(str)) {
            str = null;
        }
        Map<String, Reference<NativeLibrary>> map3 = libraries;
        synchronized (map3) {
            Reference<NativeLibrary> reference = map3.get(str + map2.toString());
            nativeLibraryLoadLibrary = reference != null ? reference.get() : null;
            if (nativeLibraryLoadLibrary == null) {
                if (str == null) {
                    nativeLibraryLoadLibrary = new NativeLibrary("<process>", null, Native.open(null, openFlags(map2)), map2);
                } else {
                    nativeLibraryLoadLibrary = loadLibrary(str, map2);
                }
                WeakReference weakReference = new WeakReference(nativeLibraryLoadLibrary);
                map3.put(nativeLibraryLoadLibrary.getName() + map2.toString(), weakReference);
                File file = nativeLibraryLoadLibrary.getFile();
                if (file != null) {
                    map3.put(file.getAbsolutePath() + map2.toString(), weakReference);
                    map3.put(file.getName() + map2.toString(), weakReference);
                }
            }
        }
        return nativeLibraryLoadLibrary;
    }

    public Function getFunction(String str, int i, String str2) {
        Function function;
        if (str != null) {
            synchronized (this.functions) {
                String strFunctionKey = functionKey(str, i, str2);
                function = this.functions.get(strFunctionKey);
                if (function == null) {
                    function = new Function(this, str, i, str2);
                    this.functions.put(strFunctionKey, function);
                }
            }
            return function;
        }
        throw new NullPointerException("Function name may not be null");
    }

    public Function getFunction(String str, Method method) {
        FunctionMapper functionMapper = (FunctionMapper) this.options.get(Library.OPTION_FUNCTION_MAPPER);
        if (functionMapper != null) {
            str = functionMapper.getFunctionName(this, method);
        }
        String property = System.getProperty("jna.profiler.prefix", "$$YJP$$");
        if (str.startsWith(property)) {
            str = str.substring(property.length());
        }
        int i = this.callFlags;
        for (Class<?> cls : method.getExceptionTypes()) {
            if (LastErrorException.class.isAssignableFrom(cls)) {
                i |= 64;
            }
        }
        return getFunction(str, i);
    }
}
