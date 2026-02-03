package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxnl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob");
    public Uri b;
    protected final Uri c;
    protected final long d;
    public ContentType e;
    protected final String f;
    public final Context g;
    public bvdt h;
    private final eosc i;

    public bxnl(Context context, bxnt bxntVar, ContentType contentType, eosc eoscVar) {
        this.g = context;
        this.c = Uri.parse(bxntVar.c);
        this.d = bxntVar.d;
        this.f = (bxntVar.b & 8) != 0 ? bxntVar.f : null;
        this.e = contentType;
        this.i = eoscVar;
    }

    protected abstract eiju a();

    public abstract emki b();

    public final eiju c() {
        ecem.b();
        this.b = bxlf.d(null, this.g);
        this.h = bvdt.FAILED;
        try {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleResizing");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 65, "ResizingJob.java")).J("Starting %s, contentUri: %s, outputUri: %s, maxFileSize: %d", getClass().getName(), this.c, this.b, Long.valueOf(this.d));
            return a().h(new ejvr() { // from class: bxnk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    eieu eieuVarK = eiiy.k("ResizingJob::onFinished");
                    try {
                        boolean zBooleanValue = bool.booleanValue();
                        bxnl bxnlVar = this.a;
                        if (zBooleanValue) {
                            bxnlVar.h = bvdt.SUCCEEDED;
                        } else {
                            bxlf.i(bxnlVar.g, bxnlVar.b);
                        }
                        ekrw ekrwVarH2 = bxnl.a.h();
                        ekrwVarH2.X(eksq.a, "BugleResizing");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 78, "ResizingJob.java")).J("Finished %s, status: %s, contentUri: %s, outputUri: %s", bxnlVar.getClass().getName(), bxnlVar.h, bxnlVar.c, bxnlVar.b);
                        eieuVarK.close();
                        return bool;
                    } finally {
                    }
                }
            }, this.i);
        } catch (Exception e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleResizing");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 86, "ResizingJob.java")).t("Exception while transcoding contentUri: %s", this.c);
            if (e instanceof cqbh) {
                this.h = bvdt.TOO_LARGE;
            }
            bxlf.i(this.g, this.b);
            return eijx.e(false);
        }
    }

    public final int d() {
        int iOrdinal = this.h.ordinal();
        if (iOrdinal == 0) {
            return 3;
        }
        if (iOrdinal == 1) {
            return 4;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 2 : 6;
        }
        return 5;
    }
}
