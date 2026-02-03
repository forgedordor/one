package defpackage;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.provider.ProxyProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxli extends ContentProvider {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();
    private static final cvw c = new cvw();
    private static final ejxr d = cdag.v("enable_proxy_provider_audio_support");

    /* compiled from: PG */
    public interface a {
        bxfu bH();
    }

    public static Uri a(Uri uri) {
        bxlj bxljVar;
        cvw cvwVar = c;
        synchronized (cvwVar) {
            bxljVar = (bxlj) cvwVar.get(uri);
        }
        if (bxljVar == null) {
            return null;
        }
        return bxljVar.a;
    }

    public static Uri b(Context context, Uri uri, String str, String str2, long j) {
        Uri.Builder builderScheme = new Uri.Builder().authority(bxlk.a(context)).scheme("content");
        String strValueOf = String.valueOf(b.nextLong());
        String strD = le.d(str2);
        if (!TextUtils.isEmpty(strD)) {
            strValueOf = String.format("%s.%s", strValueOf, strD);
        }
        builderScheme.appendPath(strValueOf);
        Uri uriBuild = builderScheme.build();
        cvw cvwVar = c;
        synchronized (cvwVar) {
            cvwVar.put(uriBuild, new bxlj(uri, str2, str, j));
        }
        return uriBuild;
    }

    public static InputStream c(Context context, Uri uri) {
        ekrg ekrgVar = cqmz.a;
        return "com.google.android.ims.rcsfileprovider".equals(uri.getAuthority()) ? ebsv.b(context, uri, ebsu.a("com.google.android.ims")) : cqmz.s(uri) ? ebsv.b(context, uri, ebsu.a("com.android.providers.telephony")) : ebsv.b(context, uri, ebsu.c);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        bxlj bxljVar;
        cvw cvwVar = c;
        synchronized (cvwVar) {
            bxljVar = (bxlj) cvwVar.get(uri);
        }
        if (bxljVar == null) {
            return null;
        }
        return bxljVar.b;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws IOException {
        Uri uriA = a(uri);
        if (uriA == null) {
            throw new FileNotFoundException(String.format("Invalid proxy uri : %s", uri.getPath()));
        }
        int iA = cqmr.a(str);
        Context context = getContext();
        if (bxlf.j(uriA, context)) {
            return ParcelFileDescriptor.open(bxlf.h(uriA, context), iA);
        }
        if (((Boolean) ((cczi) d.get()).e()).booleanValue() && bxkt.a(uriA)) {
            if (iA != 268435456) {
                throw new FileNotFoundException("Read-only mode is required");
            }
            try {
                return ParcelFileDescriptor.fromFd((int) ContentUris.parseId(uriA));
            } catch (IOException e) {
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create ParcelFileDescriptor from content URI: ".concat(uriA.toString())).initCause(e));
            }
        }
        if (bxql.a(uriA, context)) {
            context.getClass();
            String path = bxql.a(uriA, context) ? uriA.getPath() : null;
            if (path == null) {
                Objects.toString(uriA);
                throw new FileNotFoundException("Unable get rich card file path from URI: ".concat(uriA.toString()));
            }
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(bxql.b(context, path, uriA.getQueryParameter("ext")), iA);
            parcelFileDescriptorOpen.getClass();
            return parcelFileDescriptorOpen;
        }
        Context context2 = getContext();
        context2.getClass();
        a aVar = (a) ehli.a(context2, a.class);
        File file = new File(context2.getCacheDir(), "proxyscratchspace");
        if ((!file.isDirectory() || !file.exists()) && !file.mkdirs() && !file.exists()) {
            throw new FileNotFoundException(String.format("Failed to make directory for temp file for file %s", uriA.getPath()));
        }
        String strReplace = String.format("%3s", ejwk.b(uri.getLastPathSegment())).replace(' ', '_');
        try {
            File fileCreateTempFile = File.createTempFile(strReplace, null, file);
            aVar.bH().i(fileCreateTempFile);
            try {
                if (getCallingPackage() != null) {
                    getContext().grantUriPermission(getCallingPackage(), uriA, 3);
                }
                InputStream inputStreamC = c(getContext(), uriA);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        elec.a(inputStreamC, fileOutputStream);
                        ParcelFileDescriptor parcelFileDescriptorOpen2 = ParcelFileDescriptor.open(fileCreateTempFile, iA);
                        if (!fileCreateTempFile.delete()) {
                            ekrw ekrwVarI = ProxyProvider.a.i();
                            ekrwVarI.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/datamodel/provider/ProxyProvider$ProxyProviderInternal", "openTelephonyFile", 231, "ProxyProvider.java")).t("Failed to delete temp file for %s while returning file descriptor", uriA.getPath());
                        }
                        fileOutputStream.close();
                        if (inputStreamC != null) {
                            inputStreamC.close();
                        }
                        return parcelFileDescriptorOpen2;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException(String.format("Failed to copy to temp file for file %s", uriA.getPath()));
                fileNotFoundException.initCause(e2);
                throw fileNotFoundException;
            }
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException(String.format("Failed to create temp file for %s using %s", uriA.getPath(), strReplace));
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        bxlj bxljVar;
        int length;
        Uri uri2;
        cvw cvwVar = c;
        synchronized (cvwVar) {
            bxljVar = (bxlj) cvwVar.get(uri);
        }
        if (((Boolean) ((cczi) d.get()).e()).booleanValue() && bxljVar != null && (uri2 = bxljVar.a) != null && bxkt.a(uri2)) {
            throw new UnsupportedOperationException("Query operation not supported for audio");
        }
        if (strArr == null || ((length = strArr.length) >= 2 && Arrays.asList(strArr).contains("_display_name") && Arrays.asList(strArr).contains("_size"))) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_display_name", "_size"}, 2);
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            rowBuilderNewRow.add(bxljVar == null ? null : bxljVar.c);
            rowBuilderNewRow.add(bxljVar != null ? Long.valueOf(bxljVar.d) : null);
            return matrixCursor;
        }
        if (length > 0 && Arrays.asList(strArr).contains("_display_name")) {
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"_display_name"}, 1);
            matrixCursor2.newRow().add(bxljVar != null ? bxljVar.c : null);
            return matrixCursor2;
        }
        if (length <= 0 || !Arrays.asList(strArr).contains("_size")) {
            return null;
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{"_size"}, 1);
        matrixCursor3.newRow().add(bxljVar != null ? Long.valueOf(bxljVar.d) : null);
        return matrixCursor3;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
