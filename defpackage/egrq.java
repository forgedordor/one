package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import java.io.FileNotFoundException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrq {
    public final Context a;
    private final PackageManager b;

    public egrq(Context context, PackageManager packageManager) {
        this.a = context;
        this.b = packageManager;
    }

    public static String f(String[] strArr, Uri uri, String str, String str2) {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(Arrays.toString(strArr));
        sb.append(" FROM ");
        sb.append(uri.getAuthority());
        if (str != null) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        if (str2 != null) {
            sb.append(" ORDER BY ");
            sb.append(str2);
        }
        return sb.toString();
    }

    private final ContentProviderClient g(final Uri uri) throws egrm, egrp {
        String authority = uri.getAuthority();
        ejxr ejxrVar = new ejxr() { // from class: egqz
            @Override // defpackage.ejxr
            public final Object get() {
                int i = Build.VERSION.SDK_INT;
                Context contextCreateAttributionContext = this.a.a;
                if (i >= 30) {
                    eiev eievVarB = eiiy.b(egmm.a);
                    if (eievVarB.b()) {
                        contextCreateAttributionContext = contextCreateAttributionContext.createAttributionContext((String) eievVarB.a());
                    }
                }
                return contextCreateAttributionContext.getContentResolver().acquireUnstableContentProviderClient(uri);
            }
        };
        Object obj = null;
        try {
            Object obj2 = ejxrVar.get();
            e = null;
            obj = obj2;
        } catch (SecurityException e) {
            e = e;
        }
        if (obj != null) {
            return (ContentProviderClient) obj;
        }
        ProviderInfo providerInfoResolveContentProvider = this.b.resolveContentProvider(authority, 786944);
        if (providerInfoResolveContentProvider == null) {
            throw new egrm(authority, e);
        }
        throw new egrp(providerInfoResolveContentProvider, e);
    }

    public final int a(final Uri uri, final String str, final String[] strArr) {
        return ((Integer) e(uri, new egro() { // from class: egrf
            @Override // defpackage.egro
            public final Object a(ContentProviderClient contentProviderClient) {
                return Integer.valueOf(contentProviderClient.delete(uri, str, strArr));
            }
        })).intValue();
    }

    public final Cursor b(Uri uri, String[] strArr, egrh egrhVar, ejxr ejxrVar) throws Exception {
        strArr.getClass();
        ContentProviderClient contentProviderClientG = g(uri);
        try {
            Cursor cursorA = egrhVar.a(contentProviderClientG);
            if (cursorA != null) {
                return new egri(cursorA, contentProviderClientG);
            }
            throw new egrn("Null returned from query: " + ((String) ejxrVar.get()));
        } catch (RemoteException e) {
            e = e;
            egqw.a(contentProviderClientG);
            throw new egrj(e);
        } catch (egrn e2) {
            e = e2;
            egqw.a(contentProviderClientG);
            throw new egrj(e);
        } catch (Error e3) {
            egqw.a(contentProviderClientG);
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            egqw.a(contentProviderClientG);
            throw new egrj(e);
        }
    }

    public final Cursor c(final Uri uri, final String[] strArr, final String str, final String[] strArr2, final String str2, final CancellationSignal cancellationSignal) {
        return b(uri, strArr, new egrh() { // from class: egrd
            @Override // defpackage.egrh
            public final Cursor a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            }
        }, new ejxr() { // from class: egre
            @Override // defpackage.ejxr
            public final Object get() {
                return egrq.f(strArr, uri, str, str2);
            }
        });
    }

    public final Uri d(final Uri uri, final ContentValues contentValues) {
        return (Uri) e(uri, new egro() { // from class: egrc
            @Override // defpackage.egro
            public final Object a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.insert(uri, contentValues);
            }
        });
    }

    public final Object e(Uri uri, egro egroVar) throws Exception {
        ContentProviderClient contentProviderClientG = g(uri);
        try {
            try {
                return egroVar.a(contentProviderClientG);
            } finally {
                egqw.a(contentProviderClientG);
            }
        } catch (OperationApplicationException | RemoteException | FileNotFoundException | RuntimeException e) {
            throw new egrj(e);
        }
    }
}
