package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.drm.DrmConvertedStatus;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import j$.time.Instant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceae {
    public static final SparseIntArray c;
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public static final SparseIntArray g;
    private static final cvw l;
    private static final SparseArray m;
    private static final SparseArray n;
    private static final SparseArray o;
    private static final SparseArray p;
    private static final SparseArray q;
    public final ContentResolver h;
    public final aipo i;
    private final Context r;
    private final cogw s;
    private final cmot t;
    private final cmvy u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private static final byte[] j = new byte[0];
    private static final int[] k = {129, 130, 137, 151};
    public static final String[] a = {"_id", "msg_box", "thread_id", "retr_txt", "sub", "ct_l", "ct_t", "m_cls", "m_id", "resp_txt", "tr_id", "ct_cls", "d_rpt", "m_type", "v", "pri", "rr", "read_status", "rpt_a", "retr_st", "st", "date", "d_tm", "exp", "m_size", "sub_cs", "retr_txt_cs", "read", "seen"};
    public static final String[] b = {"_id", "chset", "cd", "cid", "cl", "ct", "fn", "name", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT};

    static {
        cvw cvwVar = new cvw();
        l = cvwVar;
        cvwVar.put(Telephony.Mms.Inbox.CONTENT_URI, 1);
        cvwVar.put(Telephony.Mms.Sent.CONTENT_URI, 2);
        cvwVar.put(Telephony.Mms.Draft.CONTENT_URI, 3);
        cvwVar.put(Telephony.Mms.Outbox.CONTENT_URI, 4);
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(150, 25);
        sparseIntArray.put(154, 26);
        SparseArray sparseArray = new SparseArray();
        m = sparseArray;
        sparseArray.put(150, "sub_cs");
        sparseArray.put(154, "retr_txt_cs");
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(154, 3);
        sparseIntArray2.put(150, 4);
        SparseArray sparseArray2 = new SparseArray();
        n = sparseArray2;
        sparseArray2.put(154, "retr_txt");
        sparseArray2.put(150, "sub");
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        e = sparseIntArray3;
        sparseIntArray3.put(131, 5);
        sparseIntArray3.put(132, 6);
        sparseIntArray3.put(138, 7);
        sparseIntArray3.put(139, 8);
        sparseIntArray3.put(147, 9);
        sparseIntArray3.put(152, 10);
        SparseArray sparseArray3 = new SparseArray();
        o = sparseArray3;
        sparseArray3.put(131, "ct_l");
        sparseArray3.put(132, "ct_t");
        sparseArray3.put(138, "m_cls");
        sparseArray3.put(139, "m_id");
        sparseArray3.put(147, "resp_txt");
        sparseArray3.put(152, "tr_id");
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f = sparseIntArray4;
        sparseIntArray4.put(186, 11);
        sparseIntArray4.put(134, 12);
        sparseIntArray4.put(140, 13);
        sparseIntArray4.put(141, 14);
        sparseIntArray4.put(143, 15);
        sparseIntArray4.put(144, 16);
        sparseIntArray4.put(155, 17);
        sparseIntArray4.put(145, 18);
        sparseIntArray4.put(153, 19);
        sparseIntArray4.put(149, 20);
        SparseArray sparseArray4 = new SparseArray();
        p = sparseArray4;
        sparseArray4.put(186, "ct_cls");
        sparseArray4.put(134, "d_rpt");
        sparseArray4.put(140, "m_type");
        sparseArray4.put(141, "v");
        sparseArray4.put(143, "pri");
        sparseArray4.put(144, "rr");
        sparseArray4.put(155, "read_status");
        sparseArray4.put(145, "rpt_a");
        sparseArray4.put(153, "retr_st");
        sparseArray4.put(149, "st");
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        g = sparseIntArray5;
        sparseIntArray5.put(133, 21);
        sparseIntArray5.put(135, 22);
        sparseIntArray5.put(136, 23);
        sparseIntArray5.put(142, 24);
        SparseArray sparseArray5 = new SparseArray();
        q = sparseArray5;
        sparseArray5.put(133, "date");
        sparseArray5.put(135, "d_tm");
        sparseArray5.put(136, "exp");
        sparseArray5.put(142, "m_size");
    }

    public ceae(Context context, aipo aipoVar, cogw cogwVar, cmot cmotVar, cmvy cmvyVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.r = context;
        this.h = context.getContentResolver();
        this.i = aipoVar;
        this.s = cogwVar;
        this.t = cmotVar;
        this.u = cmvyVar;
        this.v = fcsuVar;
        this.w = fcsuVar2;
        this.x = fcsuVar3;
    }

    public static Uri a(long j2) {
        return Uri.parse(a.A(j2, "content://mms/", "/part"));
    }

    public static String c(byte[] bArr) {
        try {
            return new String(bArr, "iso-8859-1");
        } catch (UnsupportedEncodingException e2) {
            cqca.h("Bugle", e2, "PduPersister: ISO_8859_1 must be supported!");
            return "";
        }
    }

    public static HashSet d(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (TextUtils.isEmpty(str) || !PhoneNumberUtils.compare(str2, str)) {
                if (!hashSet.contains(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        if (collection.size() != hashSet.size() || str == null) {
            cqca.c("Bugle", "successfully removed self from mms");
            return hashSet;
        }
        cqca.j("Bugle", "Did not remove self %s from mms", cqcv.b(str));
        return hashSet;
    }

    public static byte[] e(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return f(cursor.getString(i));
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes("iso-8859-1");
        } catch (UnsupportedEncodingException e2) {
            cqca.h("Bugle", e2, "PduPersister: ISO_8859_1 must be supported!");
            return new byte[0];
        }
    }

    private static String h(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || scheme.isEmpty() || scheme.equals("file")) {
            return uri.getPath();
        }
        if (scheme.equals("http")) {
            return uri.toString();
        }
        if (!scheme.equals("content")) {
            throw new IllegalArgumentException("Given Uri scheme is not supported");
        }
        try {
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                if (cursorQuery == null || cursorQuery.getCount() == 0 || !cursorQuery.moveToFirst()) {
                    throw new IllegalArgumentException("Given Uri could not be found in media store");
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                cursorQuery.close();
                return string;
            } catch (SQLiteException e2) {
                throw new IllegalArgumentException("Given Uri is not formatted in a way so that it can be found in media store.", e2);
            }
        } finally {
        }
    }

    private static String i(lt ltVar) {
        if (ltVar.n() == null) {
            return null;
        }
        return c(ltVar.n());
    }

    private static void j(OutputStream outputStream, InputStream inputStream) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                cqca.h("Bugle", e2, "PduPersister: IOException while closing: ".concat(outputStream.toString()));
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                cqca.h("Bugle", e3, "IOException while closing: ".concat(inputStream.toString()));
            }
        }
    }

    private final void k(int i, HashSet hashSet, SparseArray sparseArray) {
        lg[] lgVarArr = (lg[]) sparseArray.get(i);
        if (lgVarArr != null) {
            for (lg lgVar : lgVarArr) {
                if (lgVar != null) {
                    String strE = this.u.e(lgVar.b());
                    if (!hashSet.contains(strE)) {
                        hashSet.add(strE);
                    }
                }
            }
        }
    }

    private final void l(String str, long j2, long j3) {
        cmte cmteVar = (cmte) this.v.b();
        Duration durationBetween = Duration.between(Instant.ofEpochMilli(j3), this.s.f());
        durationBetween.getClass();
        auvh.h(auvw.i(cmteVar.b, new cmtd(cmteVar, str, j2, durationBetween, null)));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final void m(defpackage.lt r23, android.net.Uri r24, java.lang.String r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceae.m(lt, android.net.Uri, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r5v6 */
    private final void n(cean ceanVar, String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        String strA;
        try {
            DrmConvertedStatus drmConvertedStatusCloseConvertSession = ceanVar.a.closeConvertSession(ceanVar.b);
            if (drmConvertedStatusCloseConvertSession != null && drmConvertedStatusCloseConvertSession.statusCode == 1) {
                ?? r5 = drmConvertedStatusCloseConvertSession.convertedData;
                try {
                    if (r5 != 0) {
                        try {
                            randomAccessFile = new RandomAccessFile(str, "rw");
                            try {
                                randomAccessFile.seek(drmConvertedStatusCloseConvertSession.offset);
                                randomAccessFile.write(drmConvertedStatusCloseConvertSession.convertedData);
                                try {
                                    randomAccessFile.close();
                                    r5 = randomAccessFile;
                                } catch (IOException e2) {
                                    e = e2;
                                    strA = a.a(str, "Failed to close File:", ".");
                                    Log.w("DrmConvertSession", strA, e);
                                    File file = new File(str);
                                    ContentValues contentValues = new ContentValues(0);
                                    aipo aipoVar = this.i;
                                    ContentResolver contentResolver = this.h;
                                    ainv ainvVarB = aipoVar.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                    cdzz.b(contentResolver, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file.getName()))), contentValues, null, null);
                                    ainvVarB.c();
                                }
                            } catch (FileNotFoundException e3) {
                                e = e3;
                                Log.w("DrmConvertSession", a.a(str, "File: ", " could not be found."), e);
                                r5 = randomAccessFile;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                        r5 = randomAccessFile;
                                    } catch (IOException e4) {
                                        e = e4;
                                        strA = a.a(str, "Failed to close File:", ".");
                                        Log.w("DrmConvertSession", strA, e);
                                        File file2 = new File(str);
                                        ContentValues contentValues2 = new ContentValues(0);
                                        aipo aipoVar2 = this.i;
                                        ContentResolver contentResolver2 = this.h;
                                        ainv ainvVarB2 = aipoVar2.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                        cdzz.b(contentResolver2, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2.getName()))), contentValues2, null, null);
                                        ainvVarB2.c();
                                    }
                                }
                                File file22 = new File(str);
                                ContentValues contentValues22 = new ContentValues(0);
                                aipo aipoVar22 = this.i;
                                ContentResolver contentResolver22 = this.h;
                                ainv ainvVarB22 = aipoVar22.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                cdzz.b(contentResolver22, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22.getName()))), contentValues22, null, null);
                                ainvVarB22.c();
                            } catch (IOException e5) {
                                e = e5;
                                Log.w("DrmConvertSession", a.a(str, "Could not access File: ", " ."), e);
                                r5 = randomAccessFile;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                        r5 = randomAccessFile;
                                    } catch (IOException e6) {
                                        e = e6;
                                        strA = a.a(str, "Failed to close File:", ".");
                                        Log.w("DrmConvertSession", strA, e);
                                        File file222 = new File(str);
                                        ContentValues contentValues222 = new ContentValues(0);
                                        aipo aipoVar222 = this.i;
                                        ContentResolver contentResolver222 = this.h;
                                        ainv ainvVarB222 = aipoVar222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                        cdzz.b(contentResolver222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222.getName()))), contentValues222, null, null);
                                        ainvVarB222.c();
                                    }
                                }
                                File file2222 = new File(str);
                                ContentValues contentValues2222 = new ContentValues(0);
                                aipo aipoVar2222 = this.i;
                                ContentResolver contentResolver2222 = this.h;
                                ainv ainvVarB2222 = aipoVar2222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                cdzz.b(contentResolver2222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2222.getName()))), contentValues2222, null, null);
                                ainvVarB2222.c();
                            } catch (IllegalArgumentException e7) {
                                e = e7;
                                Log.w("DrmConvertSession", "Could not open file in mode: rw", e);
                                r5 = randomAccessFile;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                        r5 = randomAccessFile;
                                    } catch (IOException e8) {
                                        e = e8;
                                        strA = a.a(str, "Failed to close File:", ".");
                                        Log.w("DrmConvertSession", strA, e);
                                        File file22222 = new File(str);
                                        ContentValues contentValues22222 = new ContentValues(0);
                                        aipo aipoVar22222 = this.i;
                                        ContentResolver contentResolver22222 = this.h;
                                        ainv ainvVarB22222 = aipoVar22222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                        cdzz.b(contentResolver22222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22222.getName()))), contentValues22222, null, null);
                                        ainvVarB22222.c();
                                    }
                                }
                                File file222222 = new File(str);
                                ContentValues contentValues222222 = new ContentValues(0);
                                aipo aipoVar222222 = this.i;
                                ContentResolver contentResolver222222 = this.h;
                                ainv ainvVarB222222 = aipoVar222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                cdzz.b(contentResolver222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222222.getName()))), contentValues222222, null, null);
                                ainvVarB222222.c();
                            } catch (SecurityException e9) {
                                e = e9;
                                Log.w("DrmConvertSession", a.a(str, "Access to File: ", " was denied denied by SecurityManager."), e);
                                r5 = randomAccessFile;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                        r5 = randomAccessFile;
                                    } catch (IOException e10) {
                                        e = e10;
                                        strA = a.a(str, "Failed to close File:", ".");
                                        Log.w("DrmConvertSession", strA, e);
                                        File file2222222 = new File(str);
                                        ContentValues contentValues2222222 = new ContentValues(0);
                                        aipo aipoVar2222222 = this.i;
                                        ContentResolver contentResolver2222222 = this.h;
                                        ainv ainvVarB2222222 = aipoVar2222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                        cdzz.b(contentResolver2222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2222222.getName()))), contentValues2222222, null, null);
                                        ainvVarB2222222.c();
                                    }
                                }
                                File file22222222 = new File(str);
                                ContentValues contentValues22222222 = new ContentValues(0);
                                aipo aipoVar22222222 = this.i;
                                ContentResolver contentResolver22222222 = this.h;
                                ainv ainvVarB22222222 = aipoVar22222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                cdzz.b(contentResolver22222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22222222.getName()))), contentValues22222222, null, null);
                                ainvVarB22222222.c();
                            }
                        } catch (FileNotFoundException e11) {
                            e = e11;
                            randomAccessFile = null;
                        } catch (IOException e12) {
                            e = e12;
                            randomAccessFile = null;
                        } catch (IllegalArgumentException e13) {
                            e = e13;
                            randomAccessFile = null;
                        } catch (SecurityException e14) {
                            e = e14;
                            randomAccessFile = null;
                        } catch (Throwable th) {
                            th = th;
                            r5 = 0;
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                } catch (IOException e15) {
                                    Log.w("DrmConvertSession", a.a(str, "Failed to close File:", "."), e15);
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (IllegalStateException e16) {
            Log.w("DrmConvertSession", "Could not close convertsession. Convertsession: " + ceanVar.b, e16);
        }
        File file222222222 = new File(str);
        ContentValues contentValues222222222 = new ContentValues(0);
        aipo aipoVar222222222 = this.i;
        ContentResolver contentResolver222222222 = this.h;
        ainv ainvVarB222222222 = aipoVar222222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
        cdzz.b(contentResolver222222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222222222.getName()))), contentValues222222222, null, null);
        ainvVarB222222222.c();
    }

    private final void o(InputStream inputStream, boolean z, OutputStream outputStream, cean ceanVar, String str) throws IOException, lj {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            }
            if (z) {
                byte[] bArrB = ceanVar.b(bArr, i);
                if (bArrB == null) {
                    throw new lj("Error converting drm data.");
                }
                long epochMilli = this.s.f().toEpochMilli();
                int length = bArrB.length;
                outputStream.write(bArrB, 0, length);
                l(str, length, epochMilli);
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    private final void p(String str, long j2, int i) {
        cmte cmteVar = (cmte) this.v.b();
        auvh.h(auvw.i(cmteVar.b, new cmtb(cmteVar, str, j2, i, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #3 {all -> 0x014c, blocks: (B:3:0x000a, B:6:0x0023, B:10:0x003a, B:13:0x0045, B:15:0x0062, B:18:0x006c, B:21:0x0074, B:23:0x0085, B:25:0x0095, B:26:0x00ab, B:28:0x00b8, B:29:0x00c2, B:31:0x00c8, B:32:0x00d2, B:34:0x00d8, B:35:0x00e2, B:37:0x00ee, B:38:0x00f7, B:40:0x00fd, B:41:0x0106, B:43:0x010c, B:44:0x0115, B:45:0x0123, B:53:0x0133, B:56:0x013c, B:57:0x0143, B:51:0x012c, B:58:0x0144, B:59:0x014b, B:7:0x002b, B:9:0x0031), top: B:72:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #3 {all -> 0x014c, blocks: (B:3:0x000a, B:6:0x0023, B:10:0x003a, B:13:0x0045, B:15:0x0062, B:18:0x006c, B:21:0x0074, B:23:0x0085, B:25:0x0095, B:26:0x00ab, B:28:0x00b8, B:29:0x00c2, B:31:0x00c8, B:32:0x00d2, B:34:0x00d8, B:35:0x00e2, B:37:0x00ee, B:38:0x00f7, B:40:0x00fd, B:41:0x0106, B:43:0x010c, B:44:0x0115, B:45:0x0123, B:53:0x0133, B:56:0x013c, B:57:0x0143, B:51:0x012c, B:58:0x0144, B:59:0x014b, B:7:0x002b, B:9:0x0031), top: B:72:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri b(defpackage.lt r11, long r12, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceae.b(lt, long, java.util.Map):android.net.Uri");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri g(defpackage.lh r28, android.net.Uri r29, int r30, java.lang.String r31, long r32, java.util.Map r34) throws defpackage.lj {
        /*
            Method dump skipped, instructions count: 1413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceae.g(lh, android.net.Uri, int, java.lang.String, long, java.util.Map):android.net.Uri");
    }
}
