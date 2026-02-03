package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epht {
    private final Context a;
    private final ephl b;

    public epht(Context context, ephl ephlVar) {
        this.a = context;
        this.b = ephlVar;
    }

    public final ephj a() {
        Context context = this.a;
        context.getClass();
        if (!etdo.a) {
            synchronized (etdo.b) {
                if (!etdo.a) {
                    etem.b(context);
                    etdo.a = true;
                }
            }
        }
        ephk ephkVar = new ephk(new epho(etek.h(), etel.a));
        return this.b.l() ? new ephs(ephkVar) : ephkVar;
    }
}
