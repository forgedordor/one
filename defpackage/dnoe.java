package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnoe {
    public static final Locale a;
    public final dnnv b;
    private final fdjx c;
    private final ecev d;
    private final Optional e;

    static {
        Locale locale = Locale.US;
        locale.getClass();
        a = locale;
    }

    public dnoe(fdjx fdjxVar, Optional optional, ecev ecevVar, Optional optional2) {
        fdjxVar.getClass();
        ecevVar.getClass();
        this.c = fdjxVar;
        this.d = ecevVar;
        this.e = optional2;
        this.b = (dnnv) fdct.b(optional);
    }

    public static final void c(InputStream inputStream, File file, final Locale locale) throws IOException {
        final ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            fdep fdepVar = new fdep(new fdeq(fdey.d(new fdae() { // from class: dnnz
                @Override // defpackage.fdae
                public final Object invoke() {
                    Locale locale2 = dnoe.a;
                    return zipInputStream.getNextEntry();
                }
            }), true, new fdap() { // from class: dnoa
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ZipEntry zipEntry = (ZipEntry) obj;
                    Locale locale2 = dnoe.a;
                    zipEntry.getClass();
                    boolean z = false;
                    if (!zipEntry.isDirectory()) {
                        if (fdbq.f(ebta.a(zipEntry), dngl.a(locale))) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }));
            while (fdepVar.hasNext()) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fczk.b(zipInputStream, fileOutputStream);
                    fczl.a(fileOutputStream, null);
                    zipInputStream.closeEntry();
                } finally {
                }
            }
            fczl.a(zipInputStream, null);
        } finally {
        }
    }

    private final Object d(Context context, Locale locale, fcxy fcxyVar) {
        return fdin.a(this.c.hE(), new dnoc(context, locale, this, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dnnv r5, java.util.Locale r6, java.io.File r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.dnob
            if (r0 == 0) goto L13
            r0 = r8
            dnob r0 = (defpackage.dnob) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnob r0 = new dnob
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            java.util.Locale r6 = r0.e
            defpackage.fctl.b(r8)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r8)
            java.lang.String r8 = defpackage.dngl.a(r6)
            r0.e = r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r5.a(r8, r0)
            if (r8 == r1) goto L71
        L46:
            android.net.Uri r8 = (android.net.Uri) r8
            if (r8 == 0) goto L6e
            ecev r5 = r4.d
            echh r0 = new echh
            r0.<init>()
            java.lang.Object r5 = r5.c(r8, r0)
            java.io.Closeable r5 = (java.io.Closeable) r5
            r8 = r5
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch: java.lang.Throwable -> L67
            r8.getClass()     // Catch: java.lang.Throwable -> L67
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L67
            c(r8, r7, r6)     // Catch: java.lang.Throwable -> L67
            r6 = 0
            defpackage.fczl.a(r5, r6)
            goto L6e
        L67:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r7 = move-exception
            defpackage.fczl.a(r5, r6)
            throw r7
        L6e:
            fctx r5 = defpackage.fctx.a
            return r5
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnoe.a(dnnv, java.util.Locale, java.io.File, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r10 != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006d -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r8, java.util.List r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.dnod
            if (r0 == 0) goto L13
            r0 = r10
            dnod r0 = (defpackage.dnod) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            dnod r0 = new dnod
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r10)
            goto La4
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)
            r6 = r0
            r0 = r9
            r9 = r2
        L3f:
            r2 = r6
            goto L71
        L41:
            defpackage.fctl.b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
            r6 = r9
            r9 = r8
            r8 = r6
        L50:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r8.next()
            java.util.Locale r2 = (java.util.Locale) r2
            r0.a = r9
            r0.b = r10
            r0.c = r8
            r0.f = r4
            r5 = r9
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r2 = r7.d(r5, r2, r0)
            if (r2 == r1) goto La9
            r6 = r0
            r0 = r10
            r10 = r2
            goto L3f
        L71:
            java.io.File r10 = (java.io.File) r10
            if (r10 == 0) goto L78
            r0.add(r10)
        L78:
            r10 = r0
            r0 = r2
            goto L50
        L7b:
            j$.util.Optional r8 = r7.e
            java.lang.Object r8 = defpackage.fdct.b(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            boolean r8 = defpackage.fdbq.f(r8, r2)
            if (r8 == 0) goto Laa
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto Laa
            java.util.Locale r8 = defpackage.dnoe.a
            r10 = 0
            r0.a = r10
            r0.b = r10
            r0.c = r10
            r0.f = r3
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r10 = r7.d(r9, r8, r0)
            if (r10 == r1) goto La9
        La4:
            java.util.List r8 = defpackage.fcva.h(r10)
            return r8
        La9:
            return r1
        Laa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnoe.b(android.content.Context, java.util.List, fcxy):java.lang.Object");
    }
}
