package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axjv {
    public static final eksp a = eksp.c("BugleImage");
    private final Context b;
    private final bxgr c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final cvw g = new cvw();
    private final Object h = new Object();

    public axjv(Context context, bxgr bxgrVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = context;
        this.c = bxgrVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
    }

    public final void a(String str) {
        synchronized (this.h) {
            babw babwVar = (babw) this.g.remove(str);
            if (babwVar != null) {
                cqaz.k(babwVar.g());
                babwVar.f();
            }
        }
    }

    public final void b(String str, ParticipantsTable.BindData bindData) {
        cqaz.l(bindData);
        cqaz.l(str);
        Uri uriX = bindData.x();
        if (uriX == null || TextUtils.isEmpty(uriX.toString())) {
            return;
        }
        eieu eieuVarK = eiiy.k("ProfilePhotoBasedParticipantColorUpdater.updateParticipantColorBasedOnProfilePhoto");
        try {
            try {
                axju axjuVar = new axju(this, str, this.d, this.e, this.f);
                try {
                    Context context = this.b;
                    int dimension = (int) context.getResources().getDimension(R.dimen.min_touch_target_size);
                    bxfw bxfwVarF = new bxhb(uriX, dimension, dimension, false, false, 0).f(context, axjuVar);
                    a(str);
                    babw babwVar = new babw();
                    babwVar.c(bxfwVarF);
                    synchronized (this.h) {
                        this.g.put(str, babwVar);
                    }
                    this.c.d(bxfwVarF);
                    eieuVarK.close();
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        eieuVarK.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
