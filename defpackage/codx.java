package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDiskIOException;
import android.net.Uri;
import android.os.StatFs;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class codx {
    public static final cqce a = cqce.g("Bugle", "CopyFileTelephonyParts");
    public static final Pattern b = Pattern.compile("conversation_\\d+_message_\\d+_part_(\\d+)_.bin");
    private static final cczi d = cdag.f(cdag.b, "maximum_cache_size_bytes", 209715200);
    private static final cczi e = cdag.f(cdag.b, "minimum_available_free_disk_space", 314572800);
    public final eosc c;
    private final Context f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public codx(Context context, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.f = context;
        this.c = eoscVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
    }

    public static boolean d(File file) {
        try {
            return file.delete();
        } catch (Throwable th) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Unable to delete file");
            cqbdVarE.A("file", file.getAbsolutePath());
            cqbdVarE.s(th);
            return false;
        }
    }

    public final File a() {
        File file = new File(this.f.getCacheDir(), "telephony_cache");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void b(long j) {
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("currentSizeUsage");
        bsjeVarC.h(new Function() { // from class: codr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                cqce cqceVar = codx.a;
                bsjlVar.l();
                int iIntValue = PartsTable.e().intValue();
                if (iIntValue < 52050) {
                    dqru.x("file_size_bytes", iIntValue);
                }
                bsjlVar.ap(new dqty("parts.file_size_bytes", 7, 0L));
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.s();
        bsjc bsjcVarB = bsjeVarC.b();
        bsgr bsgrVar = PartsTable.d;
        long jI = bsjcVarB.i(bsgrVar.S, "SUM");
        if (jI > j || !e()) {
            bsje bsjeVarC2 = PartsTable.c();
            bsjeVarC2.A("garbageCollectOldestUntilSizeIsMet1");
            bsjeVarC2.h(new Function() { // from class: codv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    cqce cqceVar = codx.a;
                    bsjlVar.l();
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjeVarC2.e(new Function() { // from class: codt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsgr bsgrVar2 = (bsgr) obj;
                    cqce cqceVar = codx.a;
                    return new bsgs[]{bsgrVar2.a, bsgrVar2.T, bsgrVar2.S};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjeVarC2.d(new bsjb(bsgrVar.k, true));
            String str = (String) PartsTable.c.get(bsgrVar.T.d());
            if (str == null) {
                throw new IllegalArgumentException("column null does not have a single index");
            }
            ((dqox) bsjeVarC2.a).c = str;
            final bsgt bsgtVar = (bsgt) bsjeVarC2.b().p();
            while (bsgtVar.moveToNext() && (jI > j || !e())) {
                try {
                    String strQ = bsgtVar.q();
                    ejyb.e(strQ);
                    File file = new File(strQ);
                    if (!file.exists() || d(file)) {
                        bsjh bsjhVar = new bsjh();
                        bsjhVar.ap("garbageCollectOldestUntilSizeIsMet2");
                        bsjhVar.s();
                        bsjhVar.o();
                        bsjhVar.D(new Function() { // from class: codw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsjl bsjlVar = (bsjl) obj;
                                cqce cqceVar = codx.a;
                                bsjlVar.j(bsgtVar.p());
                                return bsjlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsjhVar.b().e();
                        jI -= bsgtVar.e();
                    }
                } catch (Throwable th) {
                    try {
                        bsgtVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bsgtVar.close();
        }
    }

    final void c(final String str, Uri uri) {
        InputStream inputStreamB;
        boolean zExists;
        try {
            if (!f()) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("No SMS permission, aborting updatePart()");
                cqbdVarE.e(str);
                cqbdVarE.r();
                ((ains) this.i.b()).e("Bugle.Telephony.AttachmentsCache.AbortedUpdate.Reason", 2);
                return;
            }
            if (!e()) {
                cqce cqceVar = a;
                cqbd cqbdVarE2 = cqceVar.e();
                cqbdVarE2.I("Not enough storage to attempt storing part");
                cqbdVarE2.e(str);
                cqbdVarE2.r();
                b(((Long) d.e()).longValue());
                if (e()) {
                    cqbd cqbdVarE3 = cqceVar.e();
                    cqbdVarE3.I("Still not enough storage to attempt storing part, aborting the updatePart");
                    cqbdVarE3.e(str);
                    cqbdVarE3.r();
                    ((ains) this.i.b()).e("Bugle.Telephony.AttachmentsCache.AbortedUpdate.Reason", 3);
                    return;
                }
            }
            File fileA = a();
            PartsTable.BindData bindDataA = PartsTable.a(str);
            if (bindDataA == null) {
                cqbd cqbdVarE4 = a.e();
                cqbdVarE4.I("Part was not found");
                cqbdVarE4.A("partId", str);
                cqbdVarE4.A("telephonyPartUri", uri);
                cqbdVarE4.r();
                ((ains) this.i.b()).e("Bugle.Telephony.AttachmentsCache.AbortedUpdate.Reason", 4);
                return;
            }
            String str2 = String.format(Locale.US, "conversation_%s_message_%s_part_%s_.bin", bindDataA.u(), bindDataA.v(), bindDataA.K());
            File file = new File(fileA, String.valueOf(str2).concat(".tmp"));
            File file2 = new File(fileA, str2);
            cqce cqceVar2 = a;
            cqbd cqbdVarC = cqceVar2.c();
            cqbdVarC.I("Updating part");
            cqbdVarC.A("outputPath", file2);
            cqbdVarC.z("outputPath.length()", file2.length());
            cqbdVarC.A("partId", str);
            cqbdVarC.r();
            try {
                try {
                    inputStreamB = ebsv.b(this.f, uri, ebsu.a("com.android.providers.telephony"));
                    if (inputStreamB == null) {
                        try {
                            cqbd cqbdVarE5 = cqceVar2.e();
                            cqbdVarE5.I("Unable to open the part from telephony");
                            cqbdVarE5.A("partId", str);
                            cqbdVarE5.A("telephonyPartUri", uri);
                            cqbdVarE5.r();
                        } finally {
                        }
                    }
                } finally {
                    if (file.exists()) {
                        d(file);
                    }
                }
            } catch (FileNotFoundException e2) {
                cqbd cqbdVarE6 = a.e();
                cqbdVarE6.I("File was not found");
                cqbdVarE6.A("partId", str);
                cqbdVarE6.A("telephonyPartUri", uri);
                cqbdVarE6.s(e2);
                ((ains) this.i.b()).e("Bugle.Telephony.AttachmentsCache.AbortedUpdate.Reason", 6);
                if (file.exists()) {
                }
            } catch (IOException e3) {
                cqbd cqbdVarE7 = a.e();
                cqbdVarE7.I("I/O Exception while copying a file.");
                cqbdVarE7.A("partId", str);
                cqbdVarE7.A("telephonyPartUri", uri);
                cqbdVarE7.s(e3);
                ((ains) this.i.b()).e("Bugle.Telephony.AttachmentsCache.AbortedUpdate.Reason", 7);
                if (file.exists()) {
                }
            }
            if (file2.exists()) {
                cqbd cqbdVarE8 = cqceVar2.e();
                cqbdVarE8.I("Trying to make a local copy of telephony message, but it already exists");
                cqbdVarE8.A("partId", str);
                cqbdVarE8.A("telephonyPartUri", uri);
                cqbdVarE8.r();
                ((ains) this.i.b()).e("Bugle.Telephony.AttachmentsCache.AbortedUpdate.Reason", 5);
                if (inputStreamB != null) {
                    inputStreamB.close();
                }
                if (zExists) {
                    return;
                } else {
                    return;
                }
            }
            if (file.exists()) {
                d(file);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                elec.a(inputStreamB, fileOutputStream);
                fileOutputStream.close();
                file.renameTo(file2);
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("updatePartUnsafe");
                bsjhVar.n(file2.length());
                bsjhVar.r(file2.toString());
                bsjhVar.D(new Function() { // from class: codq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsjl bsjlVar = (bsjl) obj;
                        cqce cqceVar3 = codx.a;
                        bsjlVar.j(str);
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsjhVar.b().e();
                cqbd cqbdVarC2 = cqceVar2.c();
                cqbdVarC2.I("Updated part");
                cqbdVarC2.A("outputPath", file2);
                cqbdVarC2.z("outputPath.length()", file2.length());
                cqbdVarC2.A("partId", str);
                cqbdVarC2.r();
                if (inputStreamB != null) {
                    inputStreamB.close();
                }
                if (file.exists()) {
                    d(file);
                }
                b(((Long) d.e()).longValue());
            } finally {
            }
        } catch (SQLiteDiskIOException e4) {
            a.o("Unable to update part", e4);
            ((ains) this.i.b()).e("Bugle.Telephony.AttachmentsCache.AbortedUpdate.Reason", 1);
        }
    }

    public final boolean e() {
        return new StatFs(a().getAbsolutePath()).getAvailableBytes() > ((Long) e.e()).longValue();
    }

    public final boolean f() {
        return ((crma) this.g.b()).p() && craf.j(this.f) && ((crmx) this.h.b()).G();
    }
}
