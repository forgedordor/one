package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahtm implements ahtn {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/restore/RestoreAttachmentsOperations");
    public final fcsu a;
    public final fcsu b;
    private final Context d;
    private final cogw e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final ahzu i;
    private final String j;
    private final feav k;

    public ahtm(Context context, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, ahzv ahzvVar) {
        context.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        ahzvVar.getClass();
        this.d = context;
        this.e = cogwVar;
        this.a = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.b = fcsuVar5;
        this.i = ahzvVar.a(c, null, null);
        this.j = "attachment_restore";
        this.k = new feaz();
    }

    private static final void i(File file, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        elec.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), new FileOutputStream(file));
    }

    @Override // defpackage.ahtn
    public final File a(ParcelFileDescriptor parcelFileDescriptor) throws ahwf {
        parcelFileDescriptor.getClass();
        File file = new File(this.d.getDatabasePath("bugle_backup_db").getParentFile(), "restored_bugle_database_" + this.e.f().toEpochMilli() + ".db");
        try {
            i(file, parcelFileDescriptor);
            return file;
        } catch (FileNotFoundException e) {
            this.i.k("Unable to open file when restoring database");
            throw new ahwf("Unable to open file when restoring database", e);
        } catch (IOException e2) {
            this.i.k("Unable to copy bytes when restoring database");
            throw new ahwf("Unable to open file when restoring database", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[Catch: all -> 0x01e9, TryCatch #2 {all -> 0x01e9, blocks: (B:24:0x00b7, B:26:0x00c0, B:31:0x0121, B:34:0x012b, B:36:0x0155, B:38:0x015c, B:40:0x018d, B:42:0x0193, B:44:0x01a6, B:50:0x01ae, B:51:0x01b1, B:37:0x015a, B:52:0x01b2, B:56:0x01bc, B:57:0x01d1, B:59:0x01d3, B:60:0x01e8, B:27:0x00d8, B:29:0x00eb, B:30:0x00ee), top: B:75:0x00b7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8 A[Catch: all -> 0x01e9, TryCatch #2 {all -> 0x01e9, blocks: (B:24:0x00b7, B:26:0x00c0, B:31:0x0121, B:34:0x012b, B:36:0x0155, B:38:0x015c, B:40:0x018d, B:42:0x0193, B:44:0x01a6, B:50:0x01ae, B:51:0x01b1, B:37:0x015a, B:52:0x01b2, B:56:0x01bc, B:57:0x01d1, B:59:0x01d3, B:60:0x01e8, B:27:0x00d8, B:29:0x00eb, B:30:0x00ee), top: B:75:0x00b7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.ahtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r20, defpackage.szf r21, android.os.ParcelFileDescriptor r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtm.b(java.util.UUID, szf, android.os.ParcelFileDescriptor, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (r8 != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtm.c(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.UUID r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahti
            if (r0 == 0) goto L13
            r0 = r6
            ahti r0 = (defpackage.ahti) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahti r0 = new ahti
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.UUID r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.a
            java.lang.Object r6 = r6.b()
            ahwd r6 = (defpackage.ahwd) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.n(r5, r0)
            if (r6 == r1) goto L70
        L46:
            aiad r6 = (defpackage.aiad) r6
            r0 = 0
            if (r6 == 0) goto L54
            java.lang.String r6 = r6.e
            if (r6 == 0) goto L54
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
        L54:
            if (r0 != 0) goto L5e
            ahzu r6 = r4.i
            java.lang.String r0 = "No backup DB found for %s for deletion"
            r6.l(r0, r5)
            goto L6d
        L5e:
            ahzu r6 = r4.i
            boolean r0 = r0.delete()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "Backup database deletion for session id %s successful: %s"
            r6.i(r1, r5, r0)
        L6d:
            fctx r5 = defpackage.fctx.a
            return r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtm.d(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r15 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (c(r2, r0) != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v0, types: [ahtm] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0163 -> B:29:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtm.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r2 == r7) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c3 -> B:28:0x00c5). Please report as a decompilation issue!!! */
    @Override // defpackage.ahtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.UUID r16, defpackage.ahtq r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtm.f(java.util.UUID, ahtq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x014c, code lost:
    
        if (r2 != r4) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:55:0x014e, B:21:0x0051, B:41:0x00d2, B:42:0x00d9, B:45:0x00e9, B:47:0x00ed, B:48:0x0111, B:50:0x0119, B:53:0x0142, B:24:0x005a, B:37:0x00b6, B:34:0x0096, B:38:0x00b9), top: B:62:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:55:0x014e, B:21:0x0051, B:41:0x00d2, B:42:0x00d9, B:45:0x00e9, B:47:0x00ed, B:48:0x0111, B:50:0x0119, B:53:0x0142, B:24:0x005a, B:37:0x00b6, B:34:0x0096, B:38:0x00b9), top: B:62:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:55:0x014e, B:21:0x0051, B:41:0x00d2, B:42:0x00d9, B:45:0x00e9, B:47:0x00ed, B:48:0x0111, B:50:0x0119, B:53:0x0142, B:24:0x005a, B:37:0x00b6, B:34:0x0096, B:38:0x00b9), top: B:62:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:55:0x014e, B:21:0x0051, B:41:0x00d2, B:42:0x00d9, B:45:0x00e9, B:47:0x00ed, B:48:0x0111, B:50:0x0119, B:53:0x0142, B:24:0x005a, B:37:0x00b6, B:34:0x0096, B:38:0x00b9), top: B:62:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.ahtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.UUID r18, defpackage.ahtq r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtm.g(java.util.UUID, ahtq, fcxy):java.lang.Object");
    }

    @Override // defpackage.ahtn
    public final void h(final int i, String str, ahtq ahtqVar, long j) {
        ahtqVar.getClass();
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        bmkiVar.A("updateUriAndLocalCachePathInPartsTable");
        bmkiVar.d(new Function() { // from class: ahtd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr2 = bmkn.a;
                bmkm bmkmVar = new bmkm();
                bmkmVar.ap(new dqty("backup_id_map.backup_id", 1, Long.valueOf(i)));
                String[] strArr3 = PartsTable.a;
                bmkmVar.g("parts");
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bmjf bmjfVar = (bmjf) bmkiVar.b().m();
        long jL = bmjfVar.l();
        if (jL == 1) {
            ekrw ekrwVarJ = c.j();
            ekrwVarJ.X(eksq.a, "BugleRestore");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.v, String.valueOf(i));
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/restore/RestoreAttachmentsOperations", "updateUriAndLocalCachePathInPartsTable", 160, "RestoreAttachmentsOperations.kt")).q("Invalid backup id map status STATUS_ID_ASSIGNED");
            throw new IllegalStateException("Invalid backup id map status");
        }
        if (jL == 0) {
            ekrw ekrwVarJ2 = c.j();
            ekrwVarJ2.X(eksq.a, "BugleRestore");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
            ekrdVar2.X(cqnc.v, String.valueOf(i));
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/restore/RestoreAttachmentsOperations", "updateUriAndLocalCachePathInPartsTable", 167, "RestoreAttachmentsOperations.kt")).q("Invalid backup id map status STATUS_ID_INITIALIZED");
            throw new IllegalStateException("Invalid backup id map status");
        }
        if (jL == -1) {
            if (!ahtqVar.a()) {
                ekrw ekrwVarJ3 = c.j();
                ekrwVarJ3.X(eksq.a, "BugleRestore");
                ekrd ekrdVar3 = (ekrd) ekrwVarJ3;
                ekrdVar3.X(cqnc.v, String.valueOf(i));
                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/restore/RestoreAttachmentsOperations", "updateUriAndLocalCachePathInPartsTable", 176, "RestoreAttachmentsOperations.kt")).q("Invalid backup id map status STATUS_DUPLICATE");
                return;
            }
            if (bmjfVar.k() == -1) {
                ekrw ekrwVarH = c.h();
                ekrwVarH.X(eksq.a, "BugleRestore");
                ekrd ekrdVar4 = (ekrd) ekrwVarH;
                ekrdVar4.X(cqnc.v, String.valueOf(i));
                ekrdVar4.V(10, TimeUnit.SECONDS);
                ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/restore/RestoreAttachmentsOperations", "updateUriAndLocalCachePathInPartsTable", 188, "RestoreAttachmentsOperations.kt")).q("STATUS_DUPLICATE with no mapped part id, deleting attachment file");
                try {
                    File file = new File(str);
                    if (true != file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        file.delete();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    ekrw ekrwVarJ4 = c.j();
                    ekrwVarJ4.X(eksq.a, "BugleRestore");
                    ekrd ekrdVar5 = (ekrd) ((ekrd) ekrwVarJ4).g(e);
                    ekrdVar5.X(cqnc.v, String.valueOf(i));
                    ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/restore/RestoreAttachmentsOperations", "updateUriAndLocalCachePathInPartsTable", 196, "RestoreAttachmentsOperations.kt")).t("Unable to delete duplicate attachment file [%s]", str);
                    return;
                }
            }
            ekrw ekrwVarH2 = c.h();
            ekrwVarH2.X(eksq.a, "BugleRestore");
            ekrd ekrdVar6 = (ekrd) ekrwVarH2;
            ekrdVar6.X(cqnc.v, String.valueOf(i));
            ekrdVar6.V(10, TimeUnit.SECONDS);
            ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/restore/RestoreAttachmentsOperations", "updateUriAndLocalCachePathInPartsTable", 204, "RestoreAttachmentsOperations.kt")).s("STATUS_DUPLICATE with mapped part id [%s]", bmjfVar.k());
        }
        String[] strArr2 = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("updateUriAndLocalCachePathInPartsTable");
        bsjhVar.D(new Function() { // from class: ahte
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                bsjlVar.getClass();
                bsjlVar.j(String.valueOf(bmjfVar.k()));
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjhVar.z(Uri.parse("file://".concat(str)));
        bsjhVar.r(str);
        bsjhVar.t(true);
        bsjhVar.n(j);
        if (bsjhVar.b().e() == 0) {
            ahzu ahzuVar = this.i;
            ekrz ekrzVar = cqnc.v;
            ekrzVar.getClass();
            ahzuVar.q(ekrzVar, String.valueOf(i), "Unable to find part id to update");
        }
    }
}
