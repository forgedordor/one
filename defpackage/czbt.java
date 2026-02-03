package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czbt extends lxd implements czbw {
    public static final cqce a = cqce.g("Bugle", "GalleryCategoryViewModelBase");
    protected final crma b;
    public final ContentResolver c;
    public final batu d;
    public final czbf e;
    public final lvy f = new lvy();
    public final List g = new ArrayList();
    public final AtomicBoolean h = new AtomicBoolean(false);
    private final eosc i;
    private final ContentObserver j;
    private Runnable k;

    public czbt(Context context, crma crmaVar, ContentResolver contentResolver, eosc eoscVar, batu batuVar, czbf czbfVar) {
        czbs czbsVar = new czbs(this);
        this.j = czbsVar;
        this.b = crmaVar;
        this.c = contentResolver;
        this.i = eoscVar;
        this.d = batuVar;
        this.e = czbfVar;
        context.getPackageManager().hasSystemFeature("android.hardware.camera");
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, czbsVar);
        contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, czbsVar);
    }

    @Override // defpackage.czbw
    public final void a() {
        if (this.b.q()) {
            eieu eieuVarK = eiiy.k("GalleryCategoryViewModelBase.loadData");
            try {
                Runnable runnable = new Runnable() { // from class: czbq
                    @Override // java.lang.Runnable
                    public final void run() {
                        Cursor cursorQuery;
                        try {
                            boolean zBooleanValue = ((Boolean) czbu.a.e()).booleanValue();
                            czbt czbtVar = this.a;
                            if (zBooleanValue) {
                                Bundle bundle = new Bundle();
                                batu batuVar = czbtVar.d;
                                bundle.putString("android:query-arg-sql-selection", batuVar.c());
                                bundle.putString("android:query-arg-sql-sort-order", "date_modified DESC");
                                bundle.putInt("android:query-arg-limit", czbtVar.b());
                                cursorQuery = czbtVar.c.query(batu.a(), batuVar.d(), bundle, null);
                            } else {
                                ContentResolver contentResolver = czbtVar.c;
                                Uri uriA = batu.a();
                                batu batuVar2 = czbtVar.d;
                                cursorQuery = contentResolver.query(uriA, batuVar2.d(), batuVar2.c(), null, String.format(Locale.US, "date_modified DESC LIMIT %d", Integer.valueOf(czbtVar.b())));
                            }
                            Cursor cursor = cursorQuery;
                            if (cursor == null) {
                                return;
                            }
                            try {
                                List list = czbtVar.g;
                                list.clear();
                                if (cursor.moveToFirst()) {
                                    do {
                                        if (le.z(cursor.getString(cursor.getColumnIndexOrThrow("mime_type")))) {
                                            list.add(czbtVar.e.a(cursor));
                                        } else {
                                            list.add(new czbc(cursor));
                                        }
                                    } while (cursor.moveToNext());
                                }
                                czbtVar.f.j(true);
                                cursor.close();
                            } finally {
                            }
                        } catch (Exception e) {
                            czbt.a.o("Can't load gallery media.", e);
                        }
                    }
                };
                eosc eoscVar = this.i;
                eiju eijuVarF = eijx.f(runnable, eoscVar);
                eieuVarK.b(eijuVarF);
                eijuVarF.k(auvh.b(), eoscVar);
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    protected int b() {
        throw null;
    }

    public final Runnable c() {
        if (this.k == null) {
            this.k = new Runnable() { // from class: czbr
                @Override // java.lang.Runnable
                public final void run() {
                    czbt czbtVar = this.a;
                    czbtVar.h.set(false);
                    czbtVar.a();
                }
            };
        }
        return this.k;
    }

    @Override // defpackage.lxd
    protected final void fC() {
        this.c.unregisterContentObserver(this.j);
        cqdq.a(c());
    }
}
