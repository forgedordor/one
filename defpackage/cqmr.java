package defpackage;

import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqmr {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/file/FileUtil");
    public final cogw a;
    private final fcsu c;

    public cqmr(cogw cogwVar, fcsu fcsuVar) {
        this.a = cogwVar;
        this.c = fcsuVar;
    }

    public static int a(String str) {
        if (TextUtils.equals(str, "r")) {
            return VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        return 603979776;
    }

    public static ContentType c(ContentType contentType) {
        if (!efne.e.g(contentType)) {
            return contentType;
        }
        efhh efhhVar = new efhh(efne.j);
        efhhVar.h(contentType.a());
        return efhhVar.g();
    }

    public static String d(Uri uri) {
        String lastPathSegment;
        if (uri != null && cqmz.o(uri) && (lastPathSegment = uri.getLastPathSegment()) != null && lastPathSegment.lastIndexOf(46) >= 0) {
            return lastPathSegment;
        }
        return null;
    }

    public static String e(String str, String str2) {
        return str.length() + str2.length() > 127 ? str.substring(0, 127 - str2.length()) : str;
    }

    public static boolean h(String str) {
        for (int iStartsWith = str.startsWith("/"); iStartsWith < str.length(); iStartsWith++) {
            char cCharAt = str.charAt(iStartsWith);
            if (cCharAt != '-' && !Character.isDigit(cCharAt) && !Character.isAlphabetic(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return parentFile.exists() || parentFile.mkdirs();
        }
        return false;
    }

    public static synchronized File j(File file, String str, String str2) {
        String strConcat;
        String strB = ejwk.b(str);
        if (str2 != null) {
            int iLastIndexOf = str2.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                strB = str2.substring(iLastIndexOf + 1);
                str2 = str2.substring(0, iLastIndexOf);
            }
            String strConcat2 = strB.length() == 0 ? "" : ".".concat(String.valueOf(strB));
            File file2 = new File(file, String.valueOf(e(str2, strConcat2)).concat(strConcat2));
            if (!file2.exists()) {
                file2.createNewFile();
                return file2;
            }
        }
        String strConcat3 = !ejwk.c(strB) ? ".".concat(String.valueOf(strB)) : "";
        String string = UUID.randomUUID().toString();
        if (ejwk.c(str2)) {
            strConcat = String.valueOf(string).concat(strConcat3);
        } else {
            String str3 = "_" + string + strConcat3;
            strConcat = String.valueOf(e(str2, str3)).concat(str3);
        }
        File file3 = new File(file, strConcat);
        if (file3.createNewFile()) {
            return file3;
        }
        ekrw ekrwVarI = b.i();
        ekrwVarI.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/util/file/FileUtil", "createNewFileUsingUuid", 115, "FileUtil.java")).D("Could not create a file for file name = %s because a file already exists with name = %s", str2, strConcat);
        return null;
    }

    private static boolean l(File file, File file2) throws IOException {
        try {
            File canonicalFile = file.getCanonicalFile();
            for (File canonicalFile2 = file2.getCanonicalFile(); canonicalFile2 != null; canonicalFile2 = canonicalFile2.getParentFile()) {
                if (canonicalFile.equals(canonicalFile2)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/file/FileUtil", "isSameOrSubDirectory", (char) 311, "FileUtil.java")).q("Error while accessing file");
            return false;
        }
    }

    public final Uri b(Uri uri) throws IOException {
        if (uri == null) {
            return null;
        }
        if (!cqmz.o(uri)) {
            return uri;
        }
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        try {
            return Uri.parse("file://" + new File(path).getCanonicalFile().getCanonicalPath());
        } catch (IOException unused) {
            return uri;
        }
    }

    public final boolean f(File file) {
        return l(Environment.getDataDirectory(), file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (l(android.os.Environment.getDataDirectory(), r0.toFile()) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.content.Context r10, android.net.Uri r11) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "/proc/self/fd/"
            java.lang.String r1 = r11.getPath()
            r2 = 1
            java.lang.String r3 = "isPrivateFile"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/file/FileUtil"
            java.lang.String r5 = "Bugle"
            java.lang.String r6 = "FileUtil.java"
            if (r1 == 0) goto L3e
            boolean r7 = defpackage.cqmz.o(r11)
            if (r7 == 0) goto L3e
            java.io.File r7 = new java.io.File
            r7.<init>(r1)
            boolean r1 = r9.f(r7)
            if (r1 != 0) goto L23
            goto L3e
        L23:
            ekrg r10 = defpackage.cqmr.b
            ekrw r10 = r10.j()
            ekrz r11 = defpackage.eksq.a
            r10.X(r11, r5)
            ekrd r10 = (defpackage.ekrd) r10
            r11 = 221(0xdd, float:3.1E-43)
            ekrw r10 = r10.h(r4, r3, r11, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "isPrivateFile because data dir file URI"
            r10.q(r11)
            return r2
        L3e:
            java.lang.String r1 = r11.getScheme()
            java.lang.String r7 = "content"
            boolean r1 = j$.util.Objects.equals(r1, r7)
            r7 = 0
            if (r1 != 0) goto L4c
            goto Lb4
        L4c:
            java.lang.String r1 = r11.getAuthority()
            if (r1 == 0) goto L80
            java.lang.String r8 = r10.getPackageName()
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto Lb4
            java.lang.String r8 = defpackage.bxlk.a(r10)
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto Lb4
            java.lang.String r8 = defpackage.bxlg.a(r10)
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto Lb4
            fcsu r8 = r9.c
            java.lang.Object r8 = r8.b()
            bxle r8 = (defpackage.bxle) r8
            java.lang.String r8 = r8.a
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto Lb4
        L80:
            android.content.res.AssetFileDescriptor r10 = defpackage.ebsv.d(r10, r11)     // Catch: java.lang.Exception -> Lb4 java.io.FileNotFoundException -> Ld6
            android.os.ParcelFileDescriptor r1 = r10.getParcelFileDescriptor()     // Catch: java.lang.Exception -> Lb4
            int r1 = r1.getFd()     // Catch: java.lang.Exception -> Lb4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb4
            r8.<init>(r0)     // Catch: java.lang.Exception -> Lb4
            r8.append(r1)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> Lb4
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch: java.lang.Exception -> Lb4
            j$.nio.file.Path r0 = j$.nio.file.Paths.get(r0, r1)     // Catch: java.lang.Exception -> Lb4
            j$.nio.file.Path r0 = j$.nio.file.Files.readSymbolicLink(r0)     // Catch: java.lang.Exception -> Lb4
            r10.close()     // Catch: java.lang.Exception -> Lb4
            java.io.File r10 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Exception -> Lb4
            java.io.File r0 = r0.toFile()     // Catch: java.lang.Exception -> Lb4
            boolean r10 = l(r10, r0)     // Catch: java.lang.Exception -> Lb4
            if (r10 == 0) goto Lb4
            goto Ld6
        Lb4:
            boolean r10 = defpackage.cqmz.s(r11)
            if (r10 == 0) goto Ld5
            ekrg r10 = defpackage.cqmr.b
            ekrw r10 = r10.j()
            ekrz r11 = defpackage.eksq.a
            r10.X(r11, r5)
            ekrd r10 = (defpackage.ekrd) r10
            r11 = 233(0xe9, float:3.27E-43)
            ekrw r10 = r10.h(r4, r3, r11, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "isPrivateFile because Telephony MMS URI"
            r10.q(r11)
            return r2
        Ld5:
            return r7
        Ld6:
            ekrg r10 = defpackage.cqmr.b
            ekrw r10 = r10.j()
            ekrz r11 = defpackage.eksq.a
            r10.X(r11, r5)
            ekrd r10 = (defpackage.ekrd) r10
            r11 = 227(0xe3, float:3.18E-43)
            ekrw r10 = r10.h(r4, r3, r11, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "isPrivateFile because private dir content URI"
            r10.q(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqmr.g(android.content.Context, android.net.Uri):boolean");
    }

    public final void k(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    file.delete();
                    return;
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    k(file2);
                }
            }
            file.delete();
        }
    }
}
