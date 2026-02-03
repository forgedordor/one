package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egqq extends egqi {
    public final ContentResolver a;
    public final egrq b;
    private final fcyh c;

    public egqq(fcyh fcyhVar, ContentResolver contentResolver, egrq egrqVar) {
        fcyhVar.getClass();
        this.c = fcyhVar;
        this.a = contentResolver;
        this.b = egrqVar;
    }

    @Override // defpackage.egqi
    public final Object a(Uri uri, String str, String[] strArr, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c), new egql(null, this, uri, str, strArr), fcxyVar);
    }

    @Override // defpackage.egqi
    public final Object b(Uri uri, ContentValues contentValues, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c), new egqm(null, this, uri, contentValues), fcxyVar);
    }

    @Override // defpackage.egqi
    public final Object c(final Uri uri, final String[] strArr, final Bundle bundle, final fdap fdapVar, fcxy fcxyVar) {
        return egqv.b(this.c, new fdap() { // from class: egqk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws Exception {
                final CancellationSignal cancellationSignal = (CancellationSignal) obj;
                cancellationSignal.getClass();
                final String[] strArr2 = strArr;
                final Uri uri2 = uri;
                final Bundle bundle2 = bundle;
                Cursor cursorB = this.a.b.b(uri2, strArr2, new egrh() { // from class: egra
                    @Override // defpackage.egrh
                    public final Cursor a(ContentProviderClient contentProviderClient) {
                        return contentProviderClient.query(uri2, strArr2, bundle2, cancellationSignal);
                    }
                }, new ejxr() { // from class: egrb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr3 = strArr2;
                        Bundle bundle3 = bundle2;
                        return egrq.f(strArr3, uri2, bundle3.getString("android:query-arg-sql-selection"), bundle3.getString("android:query-arg-sql-sort-order"));
                    }
                });
                try {
                    ekgb ekgbVarA = egqv.a(cursorB, fdapVar);
                    fczl.a(cursorB, null);
                    return ekgbVarA;
                } finally {
                }
            }
        }, fcxyVar);
    }

    @Override // defpackage.egqi
    public final fdpl d(Uri uri) {
        return fdqc.a(new fdpb(new egqp(this, uri, null)));
    }

    @Override // defpackage.egqi
    public final Object e(final Uri uri, final String[] strArr, final String str, final fdap fdapVar, fcxy fcxyVar) {
        return egqv.b(this.c, new fdap() { // from class: egqj
            public final /* synthetic */ String e = "date ASC";

            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws IOException {
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                cancellationSignal.getClass();
                Cursor cursorC = this.a.b.c(uri, strArr, str, null, this.e, cancellationSignal);
                try {
                    ekgb ekgbVarA = egqv.a(cursorC, fdapVar);
                    fczl.a(cursorC, null);
                    return ekgbVarA;
                } finally {
                }
            }
        }, fcxyVar);
    }
}
