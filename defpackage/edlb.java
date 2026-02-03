package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edlb implements eora, eooy {
    private static final String[] b = {"_id", "date_added"};
    private final ContentResolver c;
    private final eosc d;
    private edhi f;
    public final lvy a = new lvy();
    private final AtomicInteger e = new AtomicInteger(0);

    public edlb(Context context, eosc eoscVar) {
        this.c = context.getContentResolver();
        this.d = eoscVar;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        Cursor cursorQuery;
        edhi edhiVar = new edhi(exwf.OBAKE_DEVICE_PHOTO_FETCH, new ejxm(ejsz.a));
        edhiVar.d();
        this.f = edhiVar;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int i2 = laa.a;
        if (Build.VERSION.SDK_INT >= 30) {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
            cursorQuery = this.c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, bundle, null);
        } else {
            cursorQuery = this.c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, null, null, "date_added DESC");
        }
        if (cursorQuery != null) {
            int columnIndex = cursorQuery.getColumnIndex("_id");
            int columnIndex2 = cursorQuery.getColumnIndex("date_added");
            while (cursorQuery.moveToNext()) {
                long j = cursorQuery.getLong(columnIndex);
                long j2 = cursorQuery.getLong(columnIndex2);
                if (j2 > 0) {
                    ekfwVar.h(new edkx(j, ejwi.j(evxc.e(j2))));
                } else {
                    ekfwVar.h(new edkx(j, ejud.a));
                }
            }
            cursorQuery.close();
        }
        this.e.set(2);
        return eork.i(ekfwVar.g());
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ekgb ekgbVar = (ekgb) obj;
        this.a.j(new edky(ekgbVar, this.f.b(ekgbVar.size()), ejud.a));
    }

    public final synchronized void c() {
        AtomicInteger atomicInteger = this.e;
        if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
            atomicInteger.set(1);
            eosc eoscVar = this.d;
            eork.r(eork.n(this, eoscVar), this, eoscVar);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edhi edhiVar = this.f;
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurr eurrVar = (eurr) eurs.a.createBuilder();
        exwf exwfVar = edhiVar.a;
        eurrVar.copyOnWrite();
        eurs eursVar = (eurs) eurrVar.instance;
        eursVar.c = exwfVar.R;
        eursVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurs eursVar2 = (eurs) eurrVar.build();
        eursVar2.getClass();
        eureVar.d = eursVar2;
        eureVar.c = 2;
        ejxm ejxmVar = edhiVar.b;
        ejxmVar.g();
        long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
        eurdVar.copyOnWrite();
        eure eureVar2 = (eure) eurdVar.instance;
        eureVar2.b |= 1;
        eureVar2.e = jA;
        eurb eurbVar = (eurb) eurc.a.createBuilder();
        eurbVar.copyOnWrite();
        eurc eurcVar = (eurc) eurbVar.instance;
        eurcVar.c = 2;
        eurcVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar3 = (eure) eurdVar.instance;
        eurc eurcVar2 = (eurc) eurbVar.build();
        eurcVar2.getClass();
        eureVar3.f = eurcVar2;
        eureVar3.b |= 2;
        eure eureVar4 = (eure) eurdVar.build();
        edhe edheVar = edhe.RETRYABLE;
        int i = ekgb.d;
        this.a.j(new edky(ekoe.a, eureVar4, ejwi.j(edheVar)));
    }
}
