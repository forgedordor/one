package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbn implements egyi {
    final /* synthetic */ czbo a;

    public czbn(czbo czboVar) {
        this.a = czboVar;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        eopy eopyVar;
        eieu eieuVarK = eiiy.k("MessageDataSource#GalleryDataServiceImpl#LoadData");
        try {
            czbo czboVar = this.a;
            if (czboVar.e.q()) {
                egxv egxvVar = czboVar.c;
                Uri uriA = batu.a();
                batu batuVar = czboVar.d;
                eopy eopyVarB = egxvVar.b(uriA, batuVar.d(), batuVar.c(), null, "date_modified DESC");
                final Function function = czboVar.i;
                eopyVar = new eopy(eopyVarB.e(eiid.g(new eopo() { // from class: czbh
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj) {
                        Cursor cursor = (Cursor) obj;
                        Uri[] uriArr = czbo.a;
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        if (cursor.moveToFirst()) {
                            do {
                                arrayList.add((czbb) function.apply(cursor));
                            } while (cursor.moveToNext());
                        }
                        return arrayList;
                    }
                }), czboVar.b).g());
            } else {
                int i = ekgb.d;
                eopyVar = new eopy(eork.i(ekoe.a));
            }
            eopy eopyVarE = eopyVar.e(eiid.g(new eopo() { // from class: czbl
                @Override // defpackage.eopo
                public final Object a(eopt eoptVar, Object obj) {
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    czbo czboVar2 = this.a.a;
                    if (czboVar2.e.q()) {
                        arrayList.add(new czaz(7, R.string.c2o_external_device_folders, R.drawable.quantum_gm_ic_folder_black_24));
                        if (czboVar2.g && czboVar2.h) {
                            arrayList.add(new czaz(3, R.string.c2o_camera_button_text, R.drawable.quantum_ic_camera_alt_white_24));
                            arrayList.add(new czaz(11, R.string.c2o_video_button_text, R.drawable.comms_gm_ic_videocam_vd_theme_24));
                        }
                    } else {
                        arrayList.add(new czaz(2, R.string.c2o_storage_permissions_text, -1));
                    }
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    return arrayList;
                }
            }), czboVar.b).e(eiid.g(new eopo() { // from class: czbm
                @Override // defpackage.eopo
                public final Object a(eopt eoptVar, Object obj) {
                    return egyh.a((List) obj, this.a.a.f.f());
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
        eieu eieuVarK = eiiy.k("MessageDataSource#GalleryDataServiceImpl#FetchAndStoreData");
        try {
            ListenableFuture listenableFutureI = eork.i(null);
            eieuVarK.close();
            return listenableFutureI;
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
        return "gallery_content_key";
    }
}
