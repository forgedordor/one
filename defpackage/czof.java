package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czof implements egyi {
    final /* synthetic */ Uri a;
    final /* synthetic */ czog b;

    public czof(czog czogVar, Uri uri) {
        this.a = uri;
        this.b = czogVar;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        eieu eieuVarK = eiiy.k("MessageDataSource#MediaViewerDataServiceImpl#LoadData");
        try {
            final czog czogVar = this.b;
            eopy eopyVarB = czogVar.b.b(this.a, bbhk.a, "", null, null);
            final Function function = new Function() { // from class: czod
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    String string = czogVar.d.c(cursor.getLong(7)).toString();
                    Uri uri = Uri.parse(cursor.getString(0));
                    String string2 = cursor.getString(5);
                    String string3 = cursor.getString(1);
                    if (ejwk.c(string3)) {
                        string3 = cursor.getString(6);
                    }
                    String string4 = cursor.getString(3);
                    Uri uri2 = string4 != null ? Uri.parse(string4) : null;
                    cznv cznvVar = new cznv();
                    cznvVar.c(uri);
                    cznvVar.a = uri2;
                    cznvVar.b(string2);
                    cznvVar.b = string3;
                    cznvVar.c = string;
                    return cznvVar.a();
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            eopy eopyVarE = new eopy(eopyVarB.e(eiid.g(new eopo() { // from class: czoc
                @Override // defpackage.eopo
                public final Object a(eopt eoptVar, Object obj) {
                    Cursor cursor = (Cursor) obj;
                    ArrayList arrayList = new ArrayList(cursor.getCount());
                    if (cursor.moveToFirst()) {
                        do {
                            arrayList.add((MediaViewerItem) function.apply(cursor));
                        } while (cursor.moveToNext());
                    }
                    return arrayList;
                }
            }), czogVar.a).g()).e(eiid.g(new eopo() { // from class: czoe
                @Override // defpackage.eopo
                public final Object a(eopt eoptVar, Object obj) {
                    return egyh.a((List) obj, this.a.b.c.f());
                }
            }), eoqg.a);
            eieuVarK.a(eopyVarE);
            eieuVarK.close();
            return eopyVarE;
        } finally {
        }
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        eieu eieuVarK = eiiy.k("MessageDataSource#MediaViewerDataServiceImpl#FetchAndStoreData");
        try {
            eiju eijuVarE = eijx.e(null);
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final /* synthetic */ Object c() {
        return "chat_media_viewer_content_key";
    }
}
