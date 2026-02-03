package defpackage;

import android.database.Cursor;
import android.database.MergeCursor;
import android.os.CancellationSignal;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxum implements bxuh {
    private static final cqce e = cqce.g("Bugle", "ContactSearchApiImpl");
    public final cqiz b;
    public final eosc c;
    public final fcsu d;
    private final cpfe f;

    public bxum(cpfe cpfeVar, cqiz cqizVar, eosc eoscVar, fcsu fcsuVar) {
        this.f = cpfeVar;
        this.b = cqizVar;
        this.c = eoscVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.bxuh
    public final eiju a(final String str, final int i, final CancellationSignal cancellationSignal) {
        return TextUtils.isEmpty(str) ? eijx.e(new ArrayList()) : eijx.g(new Callable() { // from class: bxuk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Cursor cursor;
                String str2 = str;
                CancellationSignal cancellationSignal2 = cancellationSignal;
                bxum bxumVar = this.a;
                cqiz cqizVar = bxumVar.b;
                cqiq cqiqVar = new cqiq(cqiz.k(str2) ? cqizVar.h(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, str2, cqjb.a, cancellationSignal2) : cqizVar.i(str2, cancellationSignal2), cqizVar.g(str2, cqjb.d(), cancellationSignal2));
                cqjc cqjcVar = cqiqVar.a;
                cqjc cqjcVar2 = cqiqVar.b;
                Cursor cursor2 = ((cqip) cqjcVar).a;
                boolean z = true;
                if (cursor2 != null && (cursor = ((cqip) cqjcVar2).a) != null && cursor2.getCount() > 0 && cursor.getCount() > 0) {
                    z = false;
                }
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                if (cursor2 != null) {
                    ekfwVar.h(cursor2);
                }
                Cursor cursor3 = ((cqip) cqjcVar2).a;
                if (cursor3 != null) {
                    ekfwVar.h(cursor3);
                }
                Cursor[] cursorArr = (Cursor[]) ekfwVar.g().toArray(new Cursor[0]);
                return bxumVar.b(cursorArr.length == 0 ? null : new MergeCursor(cursorArr), z, i);
            }
        }, this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:5:0x0015, B:10:0x0021, B:12:0x0034, B:17:0x003e, B:19:0x0055, B:21:0x0060, B:23:0x0092, B:25:0x0098, B:30:0x00a6, B:34:0x00bc, B:33:0x00b7, B:37:0x00cb, B:38:0x00d0, B:39:0x00d7), top: B:50:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:5:0x0015, B:10:0x0021, B:12:0x0034, B:17:0x003e, B:19:0x0055, B:21:0x0060, B:23:0x0092, B:25:0x0098, B:30:0x00a6, B:34:0x00bc, B:33:0x00b7, B:37:0x00cb, B:38:0x00d0, B:39:0x00d7), top: B:50:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(android.database.Cursor r27, boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxum.b(android.database.Cursor, boolean, int):java.util.List");
    }
}
