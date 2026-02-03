package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebsv {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] c;
    private static final String[] d;

    static {
        c = new String[]{"media", (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        d = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor a(Context context, Uri uri, String str, ebsu ebsuVar) throws IOException, ErrnoException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriG = g(uri);
        String scheme = uriG.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uriG, str);
        }
        if ("content".equals(scheme)) {
            if (!m(context, uriG, f(str), ebsuVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriG, str);
            o(assetFileDescriptorOpenAssetFileDescriptor);
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uriG, str);
        o(assetFileDescriptorOpenAssetFileDescriptor2);
        try {
            l(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uriG, ebsuVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (FileNotFoundException e) {
            j(assetFileDescriptorOpenAssetFileDescriptor2, e);
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            j(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static InputStream b(Context context, Uri uri, ebsu ebsuVar) throws IOException, ErrnoException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriG = g(uri);
        String scheme = uriG.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uriG);
        }
        if ("content".equals(scheme)) {
            if (!m(context, uriG, 1, ebsuVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriG);
            o(inputStreamOpenInputStream);
            return inputStreamOpenInputStream;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uriG.getPath()).getCanonicalFile()), "r");
            try {
                l(context, parcelFileDescriptorOpenFileDescriptor, uriG, ebsuVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
            } catch (FileNotFoundException e) {
                k(parcelFileDescriptorOpenFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                k(parcelFileDescriptorOpenFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    public static OutputStream c(Context context, Uri uri, ebsu ebsuVar) throws IOException, ErrnoException {
        AssetFileDescriptor assetFileDescriptorA = a(context, uri, "w", ebsuVar);
        if (assetFileDescriptorA == null) {
            return null;
        }
        try {
            return assetFileDescriptorA.createOutputStream();
        } catch (IOException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Unable to create stream");
            fileNotFoundException.initCause(e);
            j(assetFileDescriptorA, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static AssetFileDescriptor d(Context context, Uri uri) {
        return a(context, uri, "r", ebsu.a);
    }

    public static AssetFileDescriptor e(Context context, Uri uri, CancellationSignal cancellationSignal, ebsu ebsuVar) throws IOException, ErrnoException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriG = g(uri);
        String scheme = uriG.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uriG, "r", cancellationSignal);
        }
        if ("content".equals(scheme)) {
            if (!m(context, uriG, f("r"), ebsuVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriG, "r", cancellationSignal);
            o(assetFileDescriptorOpenAssetFileDescriptor);
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uriG, "r", cancellationSignal);
        try {
            l(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uriG, ebsuVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (FileNotFoundException e) {
            j(assetFileDescriptorOpenAssetFileDescriptor2, e);
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            j(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int f(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 114(0x72, float:1.6E-43)
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r1) goto L55
            r1 = 119(0x77, float:1.67E-43)
            if (r0 == r1) goto L4b
            r1 = 3653(0xe45, float:5.119E-42)
            if (r0 == r1) goto L41
            r1 = 3786(0xeca, float:5.305E-42)
            if (r0 == r1) goto L37
            r1 = 3805(0xedd, float:5.332E-42)
            if (r0 == r1) goto L2d
            r1 = 113359(0x1bacf, float:1.5885E-40)
            if (r0 == r1) goto L23
            goto L5f
        L23:
            java.lang.String r0 = "rwt"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L2d:
            java.lang.String r0 = "wt"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r5
            goto L60
        L37:
            java.lang.String r0 = "wa"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r4
            goto L60
        L41:
            java.lang.String r0 = "rw"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r3
            goto L60
        L4b:
            java.lang.String r0 = "w"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r6
            goto L60
        L55:
            java.lang.String r0 = "r"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = 0
            goto L60
        L5f:
            r7 = -1
        L60:
            if (r7 == 0) goto L74
            if (r7 == r6) goto L73
            if (r7 == r5) goto L73
            if (r7 == r4) goto L73
            if (r7 == r3) goto L73
            if (r7 != r2) goto L6d
            goto L73
        L6d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L73:
            return r5
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebsv.f(java.lang.String):int");
    }

    private static Uri g(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static String h(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void i(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException, ErrnoException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static void j(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) throws IOException {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void k(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) throws IOException {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void l(final android.content.Context r6, android.os.ParcelFileDescriptor r7, android.net.Uri r8, defpackage.ebsu r9) throws java.io.IOException, android.system.ErrnoException {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r8 = r8.getPath()
            r0.<init>(r8)
            java.lang.String r8 = r0.getCanonicalPath()
            i(r7, r8)
            java.lang.String r7 = "/proc/"
            boolean r7 = r8.startsWith(r7)
            if (r7 != 0) goto Ld1
            java.lang.String r7 = "/data/misc/"
            boolean r7 = r8.startsWith(r7)
            if (r7 != 0) goto Ld1
            ebsu r7 = defpackage.ebsu.a
            boolean r7 = r9.e
            if (r7 != 0) goto Ld1
            ekgb r7 = r9.g
            r0 = r7
            ekoe r0 = (defpackage.ekoe) r0
            int r0 = r0.c
            r1 = 0
            r2 = r1
        L2f:
            r3 = 1
            if (r2 >= r0) goto L4f
            java.lang.Object r4 = r7.get(r2)
            ebso r4 = (defpackage.ebso) r4
            boolean r5 = r9.d
            int r4 = r4.a()
            int r5 = r4 + (-1)
            if (r4 == 0) goto L4d
            int r2 = r2 + 1
            if (r5 == 0) goto L4b
            if (r5 == r3) goto L49
            goto L2f
        L49:
            r7 = 2
            goto L50
        L4b:
            r7 = r3
            goto L50
        L4d:
            r6 = 0
            throw r6
        L4f:
            r7 = 3
        L50:
            int r7 = r7 + (-1)
            if (r7 == 0) goto Ld0
            if (r7 == r3) goto Ld1
            java.io.File r7 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m170m(r6)
            if (r7 == 0) goto L67
            java.lang.String r7 = h(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L77
            goto L75
        L67:
            java.io.File r7 = android.os.Environment.getDataDirectory()
            java.lang.String r7 = h(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L77
        L75:
            r1 = r3
            goto Lcc
        L77:
            android.content.Context r7 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r6)
            if (r7 == 0) goto L8e
            java.io.File r7 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m170m(r7)
            if (r7 == 0) goto L8e
            java.lang.String r7 = h(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L8e
            goto L75
        L8e:
            ebsp r7 = new ebsp
            r7.<init>()
            java.io.File[] r7 = n(r7)
            int r0 = r7.length
            r2 = r1
        L99:
            if (r2 >= r0) goto Lad
            r4 = r7[r2]
            if (r4 == 0) goto Laa
            java.lang.String r4 = h(r4)
            boolean r4 = r8.startsWith(r4)
            if (r4 == 0) goto Laa
            goto L75
        Laa:
            int r2 = r2 + 1
            goto L99
        Lad:
            ebsq r7 = new ebsq
            r7.<init>()
            java.io.File[] r6 = n(r7)
            int r7 = r6.length
            r0 = r1
        Lb8:
            if (r0 >= r7) goto Lcc
            r2 = r6[r0]
            if (r2 == 0) goto Lc9
            java.lang.String r2 = h(r2)
            boolean r2 = r8.startsWith(r2)
            if (r2 == 0) goto Lc9
            goto L75
        Lc9:
            int r0 = r0 + 1
            goto Lb8
        Lcc:
            boolean r6 = r9.d
            if (r1 != r6) goto Ld1
        Ld0:
            return
        Ld1:
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = "Can't open file: "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebsv.l(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, ebsu):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean m(Context context, Uri uri, int i, ebsu ebsuVar) {
        int i2;
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                ebsu ebsuVar2 = ebsu.a;
                return !ebsuVar.d;
            }
        }
        ebsy ebsyVar = new ebsy(uri, providerInfoResolveContentProvider, authority);
        ebsu ebsuVar3 = ebsu.a;
        ekgb ekgbVar = ebsuVar.f;
        int i3 = ((ekoe) ekgbVar).c;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                i2 = 3;
                break;
            }
            int iA = ((ebsz) ekgbVar.get(i4)).a(context, ebsyVar, ebsuVar.d) - 1;
            i4++;
            if (iA == 0) {
                i2 = 1;
                break;
            }
            if (iA == 1) {
                i2 = 2;
                break;
            }
        }
        int i5 = i2 - 1;
        if (i5 == 0) {
            return true;
        }
        if (i5 == 1) {
            return false;
        }
        if (context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
            return ebsuVar.d;
        }
        if (ebsuVar.d) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0 && providerInfoResolveContentProvider.exported) {
            String[] strArr = c;
            int length = strArr.length;
            for (int i6 = 0; i6 < 2; i6++) {
                if (strArr[i6].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = d;
            int length2 = strArr2.length;
            for (int i7 = 0; i7 < 3; i7++) {
                if (strArr2[i7].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = b;
            for (int i8 = 0; i8 < 7; i8++) {
                String str = strArr3[i8];
                if (str.charAt(str.length() - 1) == '.') {
                    if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (providerInfoResolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] n(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void o(Object obj) throws FileNotFoundException {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }
}
