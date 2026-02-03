package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axgf extends ContentProvider {
    private static final eksp a = eksp.c("Bugle");
    private final UriMatcher b = new UriMatcher(-1);

    /* compiled from: PG */
    public interface a {
        aiws ad();

        aiyt ae();

        eigp b();

        cczl bR();

        cqnl cI();

        cqpz cK();

        crmx cO();

        crrc cR();

        cmtp cu();

        cnpw cy();

        fcsu gf();
    }

    static final void a(PrintWriter printWriter, String str, String str2) {
        printWriter.println(str.concat(":"));
        printWriter.println(str2);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15, types: [eieh] */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v2, types: [eieh] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // android.content.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) throws Throwable {
        Throwable th;
        a aVar;
        String string;
        aiyl aiylVar;
        String str;
        ekgp ekgpVarC;
        Context context = getContext();
        context.getClass();
        a aVar2 = (a) ehli.a(context, a.class);
        eieh eiehVarC = aVar2.b().c("BugleContentProviderInternal#dump", "com/google/android/apps/messaging/shared/datamodel/BugleContentProviderInternal$BugleContentProviderInternalInternal", "dump", 231);
        try {
            try {
                eieu eieuVarK = eiiy.k("BugleContentProviderInternal#dumpTraced");
                try {
                    List listA = ((cdfb) aVar2.gf().b()).a();
                    eieu eieuVarK2 = eiiy.k("BugleContentProviderInternal#sqliteVersion");
                    try {
                        try {
                            a(printWriter, "Sqlite version", dqru.l(null));
                            eieuVarK2.close();
                            eieu eieuVarK3 = eiiy.k("BugleContentProviderInternal#defaultSmsApp");
                            try {
                                String strQ = aVar2.cO().q();
                                if (TextUtils.isEmpty(strQ)) {
                                    strQ = "None";
                                }
                                a(printWriter, "Default SMS app", strQ);
                                eieuVarK3.close();
                                cqpz cqpzVarCK = aVar2.cK();
                                eieu eieuVarK4 = eiiy.k("BugleContentProviderInternal#gServices");
                                try {
                                    a(printWriter, "GServicesValues", cqpzVarCK.d());
                                    eieuVarK4.close();
                                    eieu eieuVarK5 = eiiy.k("BugleContentProviderInternal#phenotypeFlags");
                                    try {
                                        a(printWriter, "Phenotypes", aVar2.bR().a());
                                        eieuVarK5.close();
                                        eieu eieuVarK6 = eiiy.k("BugleContentProviderInternal#sharedPrefs");
                                        try {
                                            final crrc crrcVarCR = aVar2.cR();
                                            StringBuilder sb = new StringBuilder();
                                            try {
                                                if (crrcVarCR.c.G()) {
                                                    Context context2 = crrcVarCR.b;
                                                    if (((SubscriptionManager) context2.getSystemService(SubscriptionManager.class)) == null) {
                                                        ekrw ekrwVarJ = crrc.a.j();
                                                        aVar = aVar2;
                                                        ekrwVarJ.X(eksq.a, "Bugle");
                                                        strArr = eiehVarC;
                                                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/prefs/common/BuglePrefsPrinter", "buildSubscriptionPreferenceMap", 139, "BuglePrefsPrinter.java")).q("Couldn't get a subscription manager. Per-subscription preferences won't be backed up/restored.");
                                                        ekgpVarC = ekoj.a;
                                                    } else {
                                                        aVar = aVar2;
                                                        strArr = eiehVarC;
                                                        final ekgi ekgiVar = new ekgi();
                                                        crrcVarCR.d.o(new crnx() { // from class: crrb
                                                            @Override // defpackage.crnx
                                                            public final boolean a(int i) {
                                                                ekgiVar.i(crrcVarCR.f.a(i).a(), Integer.valueOf(i));
                                                                return true;
                                                            }
                                                        });
                                                        ekgpVarC = ekgiVar.c();
                                                    }
                                                    Iterator it = ekgpVarC.entrySet().iterator();
                                                    while (it.hasNext()) {
                                                        crrc.a((String) ((Map.Entry) it.next()).getKey(), context2, sb);
                                                        sb.append("\n");
                                                    }
                                                } else {
                                                    aVar = aVar2;
                                                    strArr = eiehVarC;
                                                    sb.append("No subscription prefs because NOT the default SMS app\n");
                                                }
                                                crrc.a(crrcVarCR.e.a(), crrcVarCR.b, sb);
                                                a(printWriter, "Settings (Preferences)", sb.toString());
                                                eieuVarK6.close();
                                                eieu eieuVarK7 = eiiy.k("BugleContentProviderInternal#ProvisioningFlags");
                                                try {
                                                    a(printWriter, "Provisioning Flags", "");
                                                    dfpi.t().k(printWriter);
                                                    eieuVarK7.close();
                                                    eieu eieuVarK8 = eiiy.k("BugleContentProviderInternal#carrierConfigs");
                                                    try {
                                                        a(printWriter, "Carrier configs", aVar.cu().c());
                                                        eieuVarK8.close();
                                                        eieu eieuVarK9 = eiiy.k("BugleContentProviderInternal#writeMessageStatusSection");
                                                        try {
                                                            if (((Boolean) ccze.V.e()).booleanValue()) {
                                                                byte[] bArrB = aVar.ad().b();
                                                                a(printWriter, "Message Status", bArrB != null ? new String(bArrB) : "");
                                                            }
                                                            eieuVarK9.close();
                                                            eieu eieuVarK10 = eiiy.k("BugleContentProviderInternal#writeAppEventsSection");
                                                            try {
                                                                if (((Boolean) ccze.V.e()).booleanValue()) {
                                                                    byte[] bArrA = aVar.ad().a();
                                                                    a(printWriter, "App Events", bArrA != null ? new String(bArrA) : "");
                                                                }
                                                                eieuVarK10.close();
                                                                eieu eieuVarK11 = eiiy.k("BugleContentProviderInternal#writeTelephonyWipeoutSection");
                                                                try {
                                                                    cnpw cnpwVarCy = aVar.cy();
                                                                    if (cnpwVarCy != null) {
                                                                        cnpr cnprVarA = cnpwVarCy.a();
                                                                        StringBuilder sb2 = new StringBuilder();
                                                                        sb2.append("last recreated intent: ");
                                                                        evvp evvpVar = cnprVarA.c;
                                                                        if (evvpVar == null) {
                                                                            evvpVar = evvp.a;
                                                                        }
                                                                        sb2.append(cnpwVarCy.e(evvpVar));
                                                                        sb2.append("\nlast reverse sync: ");
                                                                        evvp evvpVar2 = cnprVarA.c;
                                                                        if (evvpVar2 == null) {
                                                                            evvpVar2 = evvp.a;
                                                                        }
                                                                        sb2.append(cnpwVarCy.e(evvpVar2));
                                                                        string = sb2.toString();
                                                                    } else {
                                                                        string = "N/A (LastWipeoutService was null).";
                                                                    }
                                                                    a(printWriter, "Telephony", string);
                                                                    eieuVarK11.close();
                                                                    eieu eieuVarK12 = eiiy.k("BugleContentProviderInternal#writeRecentMessageCodesSection");
                                                                    try {
                                                                        aiyt aiytVarAe = aVar.ae();
                                                                        if (aiytVarAe != null) {
                                                                            try {
                                                                                aiylVar = (aiyl) aiytVarAe.b.l();
                                                                            } catch (evtj e) {
                                                                                cqbd cqbdVarB = aiyt.a.b();
                                                                                cqbdVarB.I("Couldn't load RecentMessageCodes from SettingsStore.");
                                                                                cqbdVarB.s(e);
                                                                                aiylVar = aiyl.a;
                                                                            }
                                                                            str = aiylVar.h.isEmpty() ? "No message codes logged." : (String) Collection.EL.stream(aiyt.a(aiylVar).entrySet()).map(new Function() { // from class: aiyr
                                                                                @Override // java.util.function.Function
                                                                                /* renamed from: andThen */
                                                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                                                    return Function$CC.$default$andThen(this, function);
                                                                                }

                                                                                @Override // java.util.function.Function
                                                                                public final Object apply(Object obj) {
                                                                                    Map.Entry entry = (Map.Entry) obj;
                                                                                    return ((String) entry.getKey()) + ": " + ((String) entry.getValue());
                                                                                }

                                                                                public final /* synthetic */ Function compose(Function function) {
                                                                                    return Function$CC.$default$compose(this, function);
                                                                                }
                                                                            }).collect(Collectors.joining("\n"));
                                                                        } else {
                                                                            str = "N/A (RecentMessageCodesService was null).";
                                                                        }
                                                                        a(printWriter, "Recent Message Codes", str);
                                                                        eieuVarK12.close();
                                                                        eieu eieuVarK13 = eiiy.k("BugleContentProviderInternal#writePsdSection");
                                                                        try {
                                                                            printWriter.println("** PSDs Log **");
                                                                            if (listA == null) {
                                                                                listA = ((cdfb) aVar.gf().b()).a();
                                                                            }
                                                                            Iterator it2 = listA.iterator();
                                                                            while (it2.hasNext()) {
                                                                                try {
                                                                                    printWriter.println((String) ((eiju) it2.next()).get(1L, TimeUnit.SECONDS));
                                                                                } catch (Exception e2) {
                                                                                    printWriter.printf("\nAdding PSD section failed, %s\n", e2.toString());
                                                                                }
                                                                            }
                                                                            eieuVarK13.close();
                                                                            printWriter.println("** Messages Log **");
                                                                            eieu eieuVarK14 = eiiy.k("BugleContentProviderInternal#writeLogUtilLogData");
                                                                            try {
                                                                                cqca.e(context, cqpzVarCK, printWriter, cqcb.BUGLE);
                                                                                eieuVarK14.close();
                                                                                eieuVarK10 = eiiy.k("BugleContentProviderInternal#writeFloggerLogData");
                                                                                try {
                                                                                    printWriter.println("** Messages Flogger Log **");
                                                                                    try {
                                                                                        final cqnl cqnlVarCI = aVar.cI();
                                                                                        eiju.g(cqnlVarCI.b.a().e(eiid.g(new eopo() { // from class: cqnk
                                                                                            @Override // defpackage.eopo
                                                                                            public final Object a(eopt eoptVar, Object obj) throws IOException {
                                                                                                IOException iOException;
                                                                                                InputStream inputStream = (InputStream) obj;
                                                                                                cqnl cqnlVar = cqnlVarCI;
                                                                                                long epochMilli = cqnlVar.e.f().toEpochMilli();
                                                                                                PrintWriter printWriter2 = printWriter;
                                                                                                long j = 0;
                                                                                                try {
                                                                                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                                                                                                    try {
                                                                                                        char[] cArr = new char[8192];
                                                                                                        while (true) {
                                                                                                            int i = inputStreamReader.read(cArr, 0, 8192);
                                                                                                            if (i < 0) {
                                                                                                                break;
                                                                                                            }
                                                                                                            printWriter2.write(cArr, 0, i);
                                                                                                            j += i;
                                                                                                        }
                                                                                                        inputStreamReader.close();
                                                                                                    } catch (Throwable th2) {
                                                                                                        long j2 = j;
                                                                                                        try {
                                                                                                            try {
                                                                                                                inputStreamReader.close();
                                                                                                                throw th2;
                                                                                                            } catch (Throwable th3) {
                                                                                                                th2.addSuppressed(th3);
                                                                                                                throw th2;
                                                                                                            }
                                                                                                        } catch (IOException e3) {
                                                                                                            iOException = e3;
                                                                                                            j = j2;
                                                                                                            ((eksl) ((eksl) ((eksl) cqnl.a.j()).g(iOException)).h("com/google/android/apps/messaging/shared/util/flogger/FloggerUtil", "dumpFloggerLogData", 'd', "FloggerUtil.java")).q("Failed to dump flogger logs");
                                                                                                            printWriter2.println(String.format(Locale.ENGLISH, "Flogger Dump: %dms bytes: %d", Long.valueOf(cqnlVar.e.f().minusMillis(epochMilli).toEpochMilli()), Long.valueOf(j)));
                                                                                                            return null;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (IOException e4) {
                                                                                                    iOException = e4;
                                                                                                }
                                                                                                printWriter2.println(String.format(Locale.ENGLISH, "Flogger Dump: %dms bytes: %d", Long.valueOf(cqnlVar.e.f().minusMillis(epochMilli).toEpochMilli()), Long.valueOf(j)));
                                                                                                return null;
                                                                                            }
                                                                                        }), cqnlVarCI.d).g()).get(10L, TimeUnit.SECONDS);
                                                                                    } catch (Exception e3) {
                                                                                        printWriter.printf("\nAdding Flogger logs failed, %s\n", e3.toString());
                                                                                        ((eksl) ((eksl) ((eksl) a.j()).g(e3)).h("com/google/android/apps/messaging/shared/datamodel/BugleContentProviderInternal$BugleContentProviderInternalInternal", "writeFloggerLogData", (char) 432, "BugleContentProviderInternal.java")).q("Failed to add flogger logs to bug report");
                                                                                    }
                                                                                    eieuVarK10.close();
                                                                                    eieuVarK.close();
                                                                                    strArr.close();
                                                                                } finally {
                                                                                }
                                                                            } finally {
                                                                            }
                                                                        } finally {
                                                                            try {
                                                                                eieuVarK13.close();
                                                                                throw th;
                                                                            } catch (Throwable th2) {
                                                                                th.addSuppressed(th2);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        try {
                                                                            eieuVarK12.close();
                                                                            throw th;
                                                                        } catch (Throwable th3) {
                                                                            th.addSuppressed(th3);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    try {
                                                                        eieuVarK11.close();
                                                                        throw th;
                                                                    } catch (Throwable th4) {
                                                                        th.addSuppressed(th4);
                                                                    }
                                                                }
                                                            } finally {
                                                                try {
                                                                    eieuVarK10.close();
                                                                    throw th;
                                                                } catch (Throwable th5) {
                                                                    th.addSuppressed(th5);
                                                                }
                                                            }
                                                        } finally {
                                                            try {
                                                                eieuVarK9.close();
                                                                throw th;
                                                            } catch (Throwable th6) {
                                                                th.addSuppressed(th6);
                                                            }
                                                        }
                                                    } finally {
                                                        try {
                                                            eieuVarK8.close();
                                                            throw th;
                                                        } catch (Throwable th7) {
                                                            th.addSuppressed(th7);
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        eieuVarK7.close();
                                                        throw th;
                                                    } catch (Throwable th8) {
                                                        th.addSuppressed(th8);
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                Throwable th10 = th;
                                                try {
                                                    eieuVarK6.close();
                                                    throw th10;
                                                } catch (Throwable th11) {
                                                    th10.addSuppressed(th11);
                                                    throw th10;
                                                }
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            strArr = eiehVarC;
                                        }
                                    } catch (Throwable th13) {
                                        strArr = eiehVarC;
                                        try {
                                            eieuVarK5.close();
                                            throw th13;
                                        } catch (Throwable th14) {
                                            th13.addSuppressed(th14);
                                            throw th13;
                                        }
                                    }
                                } catch (Throwable th15) {
                                    strArr = eiehVarC;
                                    try {
                                        eieuVarK4.close();
                                        throw th15;
                                    } catch (Throwable th16) {
                                        th15.addSuppressed(th16);
                                        throw th15;
                                    }
                                }
                            } catch (Throwable th17) {
                                strArr = eiehVarC;
                                try {
                                    eieuVarK3.close();
                                    throw th17;
                                } catch (Throwable th18) {
                                    th17.addSuppressed(th18);
                                    throw th17;
                                }
                            }
                        } catch (Throwable th19) {
                            strArr = eiehVarC;
                            try {
                                eieuVarK2.close();
                                throw th19;
                            } catch (Throwable th20) {
                                th19.addSuppressed(th20);
                                throw th19;
                            }
                        }
                    } catch (Throwable th21) {
                        th = th21;
                        Throwable th22 = th;
                        try {
                            eieuVarK.close();
                            throw th22;
                        } catch (Throwable th23) {
                            th22.addSuppressed(th23);
                            throw th22;
                        }
                    }
                } catch (Throwable th24) {
                    th = th24;
                    strArr = eiehVarC;
                }
            } catch (Throwable th25) {
                th = th25;
                th = th;
                try {
                    strArr.close();
                    throw th;
                } catch (Throwable th26) {
                    th.addSuppressed(th26);
                    throw th;
                }
            }
        } catch (Throwable th27) {
            th = th27;
            strArr = eiehVarC;
            th = th;
            strArr.close();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("getType not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        context.getClass();
        UriMatcher uriMatcher = this.b;
        uriMatcher.addURI(axgg.a(context), "conversation_images/*", 50);
        uriMatcher.addURI(axgg.a(context), "draft_images/*", 60);
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        throw new UnsupportedOperationException("openFile not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (uri.getPathSegments().size() != 2) {
            throw new IllegalArgumentException("Malformed URI ".concat(String.valueOf(String.valueOf(uri))));
        }
        String[] strArr3 = bnvf.a;
        bnve bnveVar = new bnve();
        bnveVar.ap(new dqpj("conversation_image_parts_view.conversation_id_messages", 1, Long.valueOf(barn.a(barn.b(uri.getPathSegments().get(1))))));
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("conversation_image_parts_view");
        int iMatch = this.b.match(uri);
        if (iMatch == 50) {
            bnveVar.ap(new dqpn("conversation_image_parts_view.uri_parts", 6));
            bnveVar.ap(new dqty("conversation_image_parts_view.status_messages", 2, 3));
            if (crtr.e()) {
                bvdq[] bvdqVarArr = {bvdq.DEFAULT_NO_VERDICT, bvdq.NEGATIVE_VERDICT_DISPLAY_IMAGE, bvdq.POSITIVE_VERDICT_DISPLAY_IMAGE};
                int iIntValue = bnvf.b().intValue();
                if (iIntValue < 60240) {
                    dqru.x("image_display_state", iIntValue);
                }
                bnveVar.ap(new dqpm("conversation_image_parts_view.image_display_state_parts", 3, bnve.as((Iterable) DesugarArrays.stream(bvdqVarArr).map(new Function() { // from class: bnvd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((bvdq) obj).ordinal());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bnvc
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }))), true));
            }
        } else {
            if (iMatch != 60) {
                throw new IllegalArgumentException("Unknown URI ".concat(String.valueOf(String.valueOf(uri))));
            }
            bnveVar.ap(new dqty("conversation_image_parts_view.status_messages", 1, 3));
        }
        sQLiteQueryBuilder.appendWhere(new bnvb(bnveVar).a(dqxp.b()));
        Cursor cursorQuery = sQLiteQueryBuilder.query(dqru.e("$primary").h(), strArr, str, strArr2, null, null, str2, null);
        cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }
}
