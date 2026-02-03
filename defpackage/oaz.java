package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oaz implements oaj {
    public final Context a;
    public final oau b;
    public final mej c;
    public final mei d;
    public final LogSessionId e;
    public oaj f;
    public oaj g;

    public oaz(Context context, oau oauVar, mej mejVar, LogSessionId logSessionId) {
        this.a = context.getApplicationContext();
        this.b = oauVar;
        this.c = mejVar;
        this.e = logSessionId;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        this.d = new mho(eosj.a(Executors.newSingleThreadExecutor()), new mhu(context), options);
    }

    @Override // defpackage.oaj
    public final oal a(obt obtVar, Looper looper, oak oakVar, oai oaiVar) {
        throw null;
    }
}
