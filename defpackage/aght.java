package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aght extends cedn {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/net/cronet/AttachmentUploaderImpl");
    public static final cczv b = cdag.f(cdag.b, "upload_file_size_limit", 199229440);
    public final cehg c;
    public final ains d;
    public final eyde e;
    private final ConcurrentHashMap f = new ConcurrentHashMap();
    private final ConcurrentHashMap g = new ConcurrentHashMap();
    private final Context h;
    private final cqsu i;
    private final aipo j;
    private final eosc k;
    private final eosc l;
    private final fcsu m;
    private final cqmz n;
    private final cenj o;
    private final fcsu p;

    public aght(Context context, cehg cehgVar, cqsu cqsuVar, ains ainsVar, aipo aipoVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, eyde eydeVar, cqmz cqmzVar, cenj cenjVar, fcsu fcsuVar2) {
        this.h = context;
        this.c = cehgVar;
        this.i = cqsuVar;
        this.d = ainsVar;
        this.j = aipoVar;
        this.k = eoscVar;
        this.l = eoscVar2;
        this.m = fcsuVar;
        this.e = eydeVar;
        this.n = cqmzVar;
        this.o = cenjVar;
        this.p = fcsuVar2;
    }

    public static ListenableFuture b(String str) {
        return eork.h(new aghs(str));
    }

    public static String e(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    private final InputStream h(Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = this.h.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        throw new FileNotFoundException("Could not open uri for upload: ".concat(String.valueOf(String.valueOf(uri))));
    }

    private static void i(MessagePartCoreData messagePartCoreData, baja bajaVar) {
        messagePartCoreData.ap(bajaVar.d());
    }

    private static void j(MessagePartCoreData messagePartCoreData, baja bajaVar) {
        messagePartCoreData.ay(bajaVar.d());
    }

    private final void k(MessagePartCoreData messagePartCoreData) {
        ConversationIdType conversationIdTypeA = messagePartCoreData.A();
        MessageIdType messageIdTypeB = messagePartCoreData.B();
        String strW = messagePartCoreData.W();
        eieu eieuVarK = eiiy.k("AttachmentUploaderImpl#updateMessagePartCompressedBlobUploadPermanentFailure");
        try {
            cqaz.h();
            bbae bbaeVar = (bbae) this.m.b();
            String[] strArr = PartsTable.a;
            bsjh bsjhVar = new bsjh();
            bsjhVar.ap("updateMessagePartCompressedBlobUploadPermanentFailure");
            int iIntValue = PartsTable.e().intValue();
            int iIntValue2 = PartsTable.e().intValue();
            if (iIntValue2 < 27000) {
                dqru.x("compressed_blob_upload_permanent_failure", iIntValue2);
            }
            if (iIntValue >= 27000) {
                bsjhVar.a.put("compressed_blob_upload_permanent_failure", (Boolean) true);
            }
            bbaeVar.f(conversationIdTypeA, messageIdTypeB, strW, bsjhVar);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void l(MessagePartCoreData messagePartCoreData) {
        ConversationIdType conversationIdTypeA = messagePartCoreData.A();
        MessageIdType messageIdTypeB = messagePartCoreData.B();
        String strW = messagePartCoreData.W();
        eieu eieuVarK = eiiy.k("AttachmentUploaderImpl#updateMessagePartBlobUploadPermanentFailure");
        try {
            cqaz.h();
            bbae bbaeVar = (bbae) this.m.b();
            String[] strArr = PartsTable.a;
            bsjh bsjhVar = new bsjh();
            bsjhVar.ap("updateMessagePartBlobUploadPermanentFailure");
            int iIntValue = PartsTable.e().intValue();
            int iIntValue2 = PartsTable.e().intValue();
            if (iIntValue2 < 18000) {
                dqru.x("blob_upload_permanent_failure", iIntValue2);
            }
            if (iIntValue >= 18000) {
                bsjhVar.a.put("blob_upload_permanent_failure", (Boolean) true);
            }
            bbaeVar.f(conversationIdTypeA, messageIdTypeB, strW, bsjhVar);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static boolean m(String str, int i) {
        if (!le.k(str)) {
            eksp ekspVar = cqmc.a;
            if (i == 1 || i == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean n(MessagePartCoreData messagePartCoreData, int i, Uri uri, InputStream inputStream) {
        boolean z = true;
        String str = (i == 2 || i == 1) ? "Bugle.Ditto.Attachment.EncryptSmallImage.Latency" : "Bugle.Ditto.Attachment.Encrypt.Latency";
        String strValueOf = String.valueOf(messagePartCoreData.B());
        String strW = messagePartCoreData.W();
        String strValueOf2 = String.valueOf(strValueOf);
        String strValueOf3 = String.valueOf(strW);
        aipo aipoVar = this.j;
        String strConcat = strValueOf2.concat(strValueOf3);
        aipoVar.c(str, strConcat);
        File fileH = axiz.h(uri, this.h);
        int i2 = i - 1;
        baja bajaVar = i2 != 1 ? new baja(messagePartCoreData.bF()) : new baja(messagePartCoreData.bE());
        if (!bajaVar.b()) {
            bajaVar = baja.a();
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileH);
                try {
                    this.c.D(inputStream, fileOutputStream, bajaVar);
                    if (i2 == 0) {
                        j(messagePartCoreData, bajaVar);
                        i(messagePartCoreData, bajaVar);
                    } else if (i2 != 1) {
                        j(messagePartCoreData, bajaVar);
                    } else {
                        i(messagePartCoreData, bajaVar);
                    }
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.j.m(str, strConcat);
            }
        } catch (IOException | GeneralSecurityException e) {
            cqca.p("BugleNetwork", e, "Failed to encrypt attachment, uploading raw instead");
            axiz.i(this.h, uri);
            z = false;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02bd A[Catch: Exception -> 0x0381, TryCatch #11 {Exception -> 0x0381, blocks: (B:86:0x01e6, B:89:0x01fc, B:93:0x021d, B:95:0x027f, B:96:0x0286, B:98:0x028c, B:100:0x02ae, B:109:0x0351, B:99:0x02aa, B:101:0x02bd, B:103:0x02df, B:104:0x02e6, B:108:0x034d), top: B:155:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc A[Catch: Exception -> 0x0392, TryCatch #9 {Exception -> 0x0392, blocks: (B:23:0x00c6, B:25:0x00cc, B:28:0x00de, B:31:0x00ea, B:56:0x013a, B:58:0x0156, B:59:0x015f, B:61:0x016f, B:76:0x0195, B:75:0x0184, B:71:0x017f, B:70:0x017c, B:77:0x01ac, B:79:0x01bf, B:81:0x01c8, B:85:0x01df, B:83:0x01d5, B:84:0x01da, B:35:0x00f5, B:37:0x00fb, B:39:0x0112, B:41:0x0118, B:45:0x0122, B:47:0x012a, B:55:0x0139, B:54:0x0136, B:78:0x01b4, B:51:0x0131, B:46:0x0126), top: B:152:0x00c6, inners: #1, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122 A[Catch: Exception -> 0x0392, TRY_LEAVE, TryCatch #9 {Exception -> 0x0392, blocks: (B:23:0x00c6, B:25:0x00cc, B:28:0x00de, B:31:0x00ea, B:56:0x013a, B:58:0x0156, B:59:0x015f, B:61:0x016f, B:76:0x0195, B:75:0x0184, B:71:0x017f, B:70:0x017c, B:77:0x01ac, B:79:0x01bf, B:81:0x01c8, B:85:0x01df, B:83:0x01d5, B:84:0x01da, B:35:0x00f5, B:37:0x00fb, B:39:0x0112, B:41:0x0118, B:45:0x0122, B:47:0x012a, B:55:0x0139, B:54:0x0136, B:78:0x01b4, B:51:0x0131, B:46:0x0126), top: B:152:0x00c6, inners: #1, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8 A[Catch: Exception -> 0x0392, TryCatch #9 {Exception -> 0x0392, blocks: (B:23:0x00c6, B:25:0x00cc, B:28:0x00de, B:31:0x00ea, B:56:0x013a, B:58:0x0156, B:59:0x015f, B:61:0x016f, B:76:0x0195, B:75:0x0184, B:71:0x017f, B:70:0x017c, B:77:0x01ac, B:79:0x01bf, B:81:0x01c8, B:85:0x01df, B:83:0x01d5, B:84:0x01da, B:35:0x00f5, B:37:0x00fb, B:39:0x0112, B:41:0x0118, B:45:0x0122, B:47:0x012a, B:55:0x0139, B:54:0x0136, B:78:0x01b4, B:51:0x0131, B:46:0x0126), top: B:152:0x00c6, inners: #1, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fc A[Catch: Exception -> 0x0381, TRY_ENTER, TryCatch #11 {Exception -> 0x0381, blocks: (B:86:0x01e6, B:89:0x01fc, B:93:0x021d, B:95:0x027f, B:96:0x0286, B:98:0x028c, B:100:0x02ae, B:109:0x0351, B:99:0x02aa, B:101:0x02bd, B:103:0x02df, B:104:0x02e6, B:108:0x034d), top: B:155:0x01e6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju a(defpackage.ezns r25, j$.util.Optional r26, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r27, final java.lang.String r28, final boolean r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aght.a(ezns, j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.String, boolean):eiju");
    }

    @Override // defpackage.cedn
    public final ListenableFuture c(final ezns eznsVar, final Optional optional, final MessagePartCoreData messagePartCoreData) {
        ConcurrentHashMap concurrentHashMap = this.f;
        String strW = messagePartCoreData.W();
        ejxr ejxrVar = (ejxr) concurrentHashMap.get(strW);
        if (ejxrVar == null) {
            concurrentHashMap.putIfAbsent(strW, ejxx.a(new ejxr() { // from class: aghn
                @Override // defpackage.ejxr
                public final Object get() {
                    MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                    String str = true != messagePartCoreData2.bj() ? null : "Bugle.Ditto.UploadEncryptedFullSizeImageToBlobstore.Latency";
                    return this.a.a(eznsVar, optional, messagePartCoreData2, str, false);
                }
            }));
            cqca.i("BugleNetwork", "Uploading attachment for part ".concat(String.valueOf(strW)));
            ejxrVar = (ejxr) concurrentHashMap.get(strW);
        } else {
            cqca.c("BugleNetwork", a.a(strW, "Already uploading part ", ", skipping"));
        }
        return (ListenableFuture) ejxrVar.get();
    }

    @Override // defpackage.cedn
    public final ListenableFuture d(final ezns eznsVar, final Optional optional, final MessagePartCoreData messagePartCoreData) {
        ConcurrentHashMap concurrentHashMap = this.g;
        String strW = messagePartCoreData.W();
        ejxr ejxrVar = (ejxr) concurrentHashMap.get(strW);
        if (ejxrVar == null) {
            concurrentHashMap.putIfAbsent(strW, ejxx.a(new ejxr() { // from class: aghq
                @Override // defpackage.ejxr
                public final Object get() {
                    aght aghtVar = this.a;
                    MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                    String str = null;
                    if (messagePartCoreData2.bj() && aghtVar.c.G(messagePartCoreData2)) {
                        str = "Bugle.Ditto.UploadEncryptedCompressedImageToBlobstore.Latency";
                    }
                    String str2 = str;
                    return aghtVar.a(eznsVar, optional, messagePartCoreData2, str2, true);
                }
            }));
            cqca.i("BugleNetwork", "Uploading attachment for part ".concat(String.valueOf(strW)));
            ejxrVar = (ejxr) concurrentHashMap.get(strW);
        } else {
            cqca.c("BugleNetwork", a.a(strW, "Already uploading part ", ", skipping"));
        }
        return (ListenableFuture) ejxrVar.get();
    }

    public final void f(String str, boolean z, MessagePartCoreData messagePartCoreData, eycb eycbVar, Uri uri) {
        String strW = messagePartCoreData.W();
        if (str != null) {
            this.j.m(str, String.valueOf(String.valueOf(messagePartCoreData.B())).concat(String.valueOf(strW)));
        }
        if (z) {
            this.g.remove(strW);
        } else {
            this.f.remove(strW);
        }
        if (eycbVar != null) {
            try {
                eycbVar.close();
            } catch (IOException e) {
                cqca.h("BugleNetwork", e, "Could not close the uploader's data stream.");
            }
        }
        if (uri != null) {
            axiz.i(this.h, uri);
        }
    }

    public final void g(MessagePartCoreData messagePartCoreData, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            l(messagePartCoreData);
            k(messagePartCoreData);
        } else if (i2 != 1) {
            l(messagePartCoreData);
        } else {
            k(messagePartCoreData);
        }
    }
}
