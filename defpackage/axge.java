package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axge extends ContentProvider {

    /* compiled from: PG */
    public interface a {
        bacj bx();
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Context context = getContext();
        context.getClass();
        bacj bacjVarBx = ((a) ehli.a(context, a.class)).bx();
        eieh eiehVarC = bacjVarBx.c.c("BugleContentProvider#call", "com/google/android/apps/messaging/shared/datamodel/contentprovider/BugleContentProviderBlocked", "call", 56);
        try {
            Context context2 = bacjVarBx.d;
            Bundle bundle2 = null;
            if (!Arrays.asList(context2.getPackageName(), "com.google.android.ims").contains(context2.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
                cqbd cqbdVarE = bacj.a.e();
                cqbdVarE.I("Ignored");
                cqbdVarE.I(str);
                cqbdVarE.I("call from external package.");
                cqbdVarE.r();
            } else if ("is_blocked".equals(str)) {
                boolean z = false;
                if (str2 != null && ((cpjp) bacjVarBx.b.b()).f(str2)) {
                    z = true;
                }
                bundle2 = new Bundle();
                bundle2.putBoolean("blocked", z);
            } else {
                cqbd cqbdVarA = bacj.a.a();
                cqbdVarA.I("Ignored unsupported");
                cqbdVarA.I(str);
                cqbdVarA.I("call.");
                cqbdVarA.r();
            }
            eiehVarC.close();
            return bundle2;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("unimplemented");
    }
}
