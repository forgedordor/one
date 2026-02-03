package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.ByteArrayInputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnf extends bxnl {
    private static final ekrg i = ekrg.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob");
    private final int j;
    private final int k;
    private final Context l;
    private final cqsu m;
    private final emke n;

    public bxnf(Context context, fcsu fcsuVar, eosc eoscVar, bxnt bxntVar, ContentType contentType) {
        int iHeight;
        super(context, bxntVar, contentType, eoscVar);
        this.n = (emke) emki.a.createBuilder();
        this.l = context;
        cqsu cqsuVar = (cqsu) fcsuVar.b();
        this.m = cqsuVar;
        Uri uri = this.c;
        if (uri != null) {
            Rect rectG = cqsuVar.g(uri, contentType != null ? contentType.f() : null);
            this.j = rectG.width();
            iHeight = rectG.height();
        } else {
            iHeight = 0;
            this.j = 0;
        }
        this.k = iHeight;
    }

    @Override // defpackage.bxnl
    protected final eiju a() {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("ImageResizingJob#runInBackground");
        try {
            ContentType contentType = this.e;
            String strF = contentType != null ? contentType.f() : null;
            if (le.j(strF)) {
                emke emkeVar = this.n;
                emkeVar.copyOnWrite();
                emki emkiVar = (emki) emkeVar.instance;
                emki emkiVar2 = emki.a;
                emkiVar.t = emkg.a(4);
                emkiVar.b = 131072 | emkiVar.b;
            } else {
                emke emkeVar2 = this.n;
                emkeVar2.copyOnWrite();
                emki emkiVar3 = (emki) emkeVar2.instance;
                emki emkiVar4 = emki.a;
                emkiVar3.t = emkg.a(3);
                emkiVar3.b = 131072 | emkiVar3.b;
            }
            emke emkeVar3 = this.n;
            int i2 = this.j;
            emkeVar3.copyOnWrite();
            emki emkiVar5 = (emki) emkeVar3.instance;
            emkiVar5.b |= 4096;
            emkiVar5.o = i2;
            int i3 = this.k;
            emkeVar3.copyOnWrite();
            emki emkiVar6 = (emki) emkeVar3.instance;
            emkiVar6.b |= 8192;
            emkiVar6.p = i3;
            Uri uri = this.c;
            if (uri == null) {
                ekrw ekrwVarJ = i.j();
                ekrwVarJ.X(eksq.a, "BugleResizing");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob", "runInBackgroundInTrace", 98, "ImageResizingJob.java")).q("Cannot resize image with null contentUri");
                eijuVarE = eijx.e(false);
            } else if (i2 <= 0 || i3 <= 0) {
                if (i2 <= 0) {
                    ekrw ekrwVarJ2 = i.j();
                    ekrwVarJ2.X(eksq.a, "BugleResizing");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob", "runInBackgroundInTrace", 103, "ImageResizingJob.java")).q("Cannot resize image with unknown width");
                }
                if (i3 <= 0) {
                    ekrw ekrwVarJ3 = i.j();
                    ekrwVarJ3.X(eksq.a, "BugleResizing");
                    ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob", "runInBackgroundInTrace", 106, "ImageResizingJob.java")).q("Cannot resize image with unknown height");
                }
                emkeVar3.copyOnWrite();
                emki emkiVar7 = (emki) emkeVar3.instance;
                emkiVar7.v = emkd.a(15);
                emkiVar7.b |= 524288;
                eijuVarE = eijx.e(false);
            } else {
                cqsu cqsuVar = this.m;
                byte[] bArrO = cqsuVar.o(i2, i3, i2, i3, this.d, uri, strF);
                if (bArrO == null) {
                    ekrw ekrwVarJ4 = i.j();
                    ekrwVarJ4.X(eksq.a, "BugleResizing");
                    ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob", "runInBackgroundInTrace", 116, "ImageResizingJob.java")).q("Could not resize image");
                    emkeVar3.copyOnWrite();
                    emki emkiVar8 = (emki) emkeVar3.instance;
                    emkiVar8.v = emkd.a(16);
                    emkiVar8.b |= 524288;
                    eijuVarE = eijx.e(false);
                } else {
                    Rect rectF = cqsuVar.f(bArrO);
                    int iWidth = rectF.width();
                    emkeVar3.copyOnWrite();
                    emki emkiVar9 = (emki) emkeVar3.instance;
                    emkiVar9.b |= 16384;
                    emkiVar9.q = iWidth;
                    int iHeight = rectF.height();
                    emkeVar3.copyOnWrite();
                    emki emkiVar10 = (emki) emkeVar3.instance;
                    emkiVar10.b |= 32768;
                    emkiVar10.r = iHeight;
                    boolean z = cqmz.d(this.l, new ByteArrayInputStream(bArrO), this.b) != null;
                    if (z && le.k(strF)) {
                        this.e = auby.f("image/jpeg");
                    }
                    eijuVarE = eijx.e(Boolean.valueOf(z));
                }
            }
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.bxnl
    public final emki b() {
        return (emki) this.n.build();
    }

    public bxnf(Context context, fcsu fcsuVar, eosc eoscVar, bxnt bxntVar, ContentType contentType, Rect rect) {
        super(context, bxntVar, contentType, eoscVar);
        this.n = (emke) emki.a.createBuilder();
        this.l = context;
        this.m = (cqsu) fcsuVar.b();
        this.j = rect.width();
        this.k = rect.height();
    }
}
