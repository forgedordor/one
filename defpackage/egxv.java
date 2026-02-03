package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxv {
    public final egrq a;
    private final Context b;
    private final eosc c;

    public egxv(egrq egrqVar, Context context, eosc eoscVar) {
        this.a = egrqVar;
        this.b = context;
        this.c = eoscVar;
    }

    private static final String[] h(ehvv ehvvVar) {
        try {
            return (String[]) Arrays.copyOf(ehvvVar.b(), ehvvVar.b().length, String[].class);
        } catch (ArrayStoreException e) {
            throw new IllegalArgumentException("AsyncContentResolver cannot be queried with a SafeSQLStatement containing byte array arguments. Only String arguments are allowed.", e);
        }
    }

    public final eopy a(Uri uri, String[] strArr, ehvv ehvvVar, String str) {
        strArr.getClass();
        uri.getClass();
        return b(uri, strArr, ehvvVar.a(), h(ehvvVar), str);
    }

    public final eopy b(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        strArr.getClass();
        uri.getClass();
        egxt egxtVar = new egxt(this, uri, strArr, str, strArr2, str2);
        int i = ecnj.a;
        ecnh ecnhVar = new ecnh(egxtVar);
        ecnhVar.e(this.c);
        return eopy.b(ecnhVar, eoqg.a);
    }

    public final ListenableFuture c(final egxu egxuVar) {
        return eork.m(eiid.l(new Callable() { // from class: egxq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return egxuVar.a(this.a.a);
            }
        }), this.c);
    }

    public final void d(Uri uri, boolean z, egxm egxmVar) {
        this.b.getContentResolver().registerContentObserver(uri, z, egxmVar);
    }

    public final void e(egxm egxmVar) {
        this.b.getContentResolver().unregisterContentObserver(egxmVar);
    }

    public final ListenableFuture f(final Uri uri, final Bundle bundle) {
        return c(new egxu() { // from class: egxo
            @Override // defpackage.egxu
            public final Object a(egrq egrqVar) {
                final Bundle bundle2 = bundle;
                return (Bundle) egrqVar.e(uri, new egro() { // from class: egrg
                    public final /* synthetic */ String a = "garbage_collect";
                    public final /* synthetic */ String b = "";

                    @Override // defpackage.egro
                    public final Object a(ContentProviderClient contentProviderClient) {
                        return contentProviderClient.call(this.a, this.b, bundle2);
                    }
                });
            }
        });
    }

    public final ListenableFuture g(final Uri uri, final ContentValues contentValues, final String str) {
        return c(new egxu() { // from class: egxn
            @Override // defpackage.egxu
            public final Object a(egrq egrqVar) {
                final Uri uri2 = uri;
                final ContentValues contentValues2 = contentValues;
                final String str2 = str;
                Integer num = (Integer) egrqVar.e(uri2, new egro() { // from class: egqy
                    @Override // defpackage.egro
                    public final Object a(ContentProviderClient contentProviderClient) {
                        return Integer.valueOf(contentProviderClient.update(uri2, contentValues2, str2, null));
                    }
                });
                num.intValue();
                return num;
            }
        });
    }
}
